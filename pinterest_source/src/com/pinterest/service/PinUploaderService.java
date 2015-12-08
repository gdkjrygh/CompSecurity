// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.service;


// Referenced classes of package com.pinterest.service:
//            PinterestWorkerService, PinUploader

public class PinUploaderService extends PinterestWorkerService
{

    public PinUploaderService()
    {
    }

    protected Runnable[] getTasks()
    {
        return (new Runnable[] {
            (new PinUploader(this)).startContinuousUpload()
        });
    }
}
