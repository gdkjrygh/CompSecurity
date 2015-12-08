// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dropbox.client2;


public abstract class ProgressListener
{

    public ProgressListener()
    {
    }

    public abstract void onProgress(long l, long l1);

    public long progressInterval()
    {
        return 500L;
    }
}
