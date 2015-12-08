// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.service;


// Referenced classes of package com.pinterest.service:
//            PinterestWorkerService, TypeaheadCacheDownloader

public class TypeaheadCacheService extends PinterestWorkerService
{

    public TypeaheadCacheService()
    {
    }

    protected Runnable[] getTasks()
    {
        return (new Runnable[] {
            (new TypeaheadCacheDownloader(this)).downloadAllPartitions()
        });
    }
}
