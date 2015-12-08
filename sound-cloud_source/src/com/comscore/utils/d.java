// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.comscore.utils;


// Referenced classes of package com.comscore.utils:
//            Storage

class d
    implements Runnable
{

    final Storage a;

    d(Storage storage)
    {
        a = storage;
        super();
    }

    public void run()
    {
        a.b();
        a.c();
    }
}
