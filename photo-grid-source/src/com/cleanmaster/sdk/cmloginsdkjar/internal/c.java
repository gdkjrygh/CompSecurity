// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cleanmaster.sdk.cmloginsdkjar.internal;


// Referenced classes of package com.cleanmaster.sdk.cmloginsdkjar.internal:
//            FileLruCache

final class c
    implements Runnable
{

    final FileLruCache a;

    c(FileLruCache filelrucache)
    {
        a = filelrucache;
        super();
    }

    public final void run()
    {
        FileLruCache.access$200(a);
    }
}
