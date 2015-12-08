// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.sync;


final class val.onResult
    implements iver.OnResultListener
{

    final Runnable val$onResult;

    public final void onResultReceived()
    {
        if (val$onResult != null)
        {
            val$onResult.run();
        }
    }

    iver.OnResultListener()
    {
        val$onResult = runnable;
        super();
    }
}
