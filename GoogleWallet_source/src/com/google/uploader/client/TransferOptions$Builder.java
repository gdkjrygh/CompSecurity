// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.uploader.client;


// Referenced classes of package com.google.uploader.client:
//            TransferOptions

public static final class idleTimeoutSecs
{

    private long idleTimeoutSecs;

    public final TransferOptions build()
    {
        return new TransferOptions(this, null);
    }


    public ()
    {
        idleTimeoutSecs = 60L;
    }
}
