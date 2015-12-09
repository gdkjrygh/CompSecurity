// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.util;

import android.view.KeyEvent;
import com.netflix.mediaclient.Log;

public class LastKeyEvent
{

    public static final long EXPIRED = 250L;
    private static final String TAG = "nf_key";
    private long expirationTimeout;
    private int lastKey;
    private long ts;

    public LastKeyEvent()
    {
        expirationTimeout = 250L;
        lastKey = 0x80000000;
    }

    public LastKeyEvent(long l)
    {
        expirationTimeout = 250L;
        lastKey = 0x80000000;
        expirationTimeout = l;
    }

    public boolean shouldIgnore(KeyEvent keyevent)
    {
        long l = System.currentTimeMillis();
        long l1 = (ts + expirationTimeout) - l;
        if (lastKey == keyevent.getKeyCode())
        {
            if (l1 > 0L)
            {
                if (Log.isLoggable("nf_key", 3))
                {
                    Log.d("nf_key", (new StringBuilder()).append("Ignore repeated key press ").append(lastKey).append(" in ").append(l1).append(" ms, which is less than threshold of ").append(expirationTimeout).toString());
                }
                return true;
            }
            if (Log.isLoggable("nf_key", 3))
            {
                Log.d("nf_key", (new StringBuilder()).append("Do NOT ignore repeated key press ").append(lastKey).append(" in ").append(l1).append(" ms, which is more than threshold of ").append(expirationTimeout).toString());
            }
        }
        lastKey = keyevent.getKeyCode();
        ts = l;
        return false;
    }
}
