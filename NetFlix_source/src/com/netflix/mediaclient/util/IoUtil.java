// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.util;

import com.netflix.mediaclient.Log;
import java.io.Closeable;
import java.io.IOException;

public class IoUtil
{

    private static final String TAG = "IoUtil";

    private IoUtil()
    {
    }

    public static void safeClose(Closeable closeable)
    {
        if (closeable == null)
        {
            break MISSING_BLOCK_LABEL_10;
        }
        closeable.close();
        return;
        closeable;
        Log.handleException("IoUtil", closeable);
        return;
    }
}
