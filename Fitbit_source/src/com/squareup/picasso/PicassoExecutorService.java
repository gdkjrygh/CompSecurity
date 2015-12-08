// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.picasso;

import android.net.NetworkInfo;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

class PicassoExecutorService extends ThreadPoolExecutor
{

    private static final int DEFAULT_THREAD_COUNT = 3;

    PicassoExecutorService()
    {
        super(3, 3, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), new Utils.PicassoThreadFactory());
    }

    private void setThreadCount(int i)
    {
        setCorePoolSize(i);
        setMaximumPoolSize(i);
    }

    void adjustThreadCount(NetworkInfo networkinfo)
    {
        if (networkinfo == null || !networkinfo.isConnectedOrConnecting())
        {
            setThreadCount(3);
            return;
        }
        switch (networkinfo.getType())
        {
        default:
            setThreadCount(3);
            return;

        case 1: // '\001'
        case 6: // '\006'
        case 9: // '\t'
            setThreadCount(4);
            return;

        case 0: // '\0'
            switch (networkinfo.getSubtype())
            {
            case 7: // '\007'
            case 8: // '\b'
            case 9: // '\t'
            case 10: // '\n'
            case 11: // '\013'
            default:
                setThreadCount(3);
                return;

            case 13: // '\r'
            case 14: // '\016'
            case 15: // '\017'
                setThreadCount(3);
                return;

            case 3: // '\003'
            case 4: // '\004'
            case 5: // '\005'
            case 6: // '\006'
            case 12: // '\f'
                setThreadCount(2);
                return;

            case 1: // '\001'
            case 2: // '\002'
                setThreadCount(1);
                return;
            }
        }
    }
}
