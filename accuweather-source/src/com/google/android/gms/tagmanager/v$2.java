// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;


// Referenced classes of package com.google.android.gms.tagmanager:
//            v

class afn
    implements Runnable
{

    final v afm;
    final Layer.c.a afn;

    public void run()
    {
        afn.d(v.a(afm));
    }

    Layer.c.a(v v1, Layer.c.a a)
    {
        afm = v1;
        afn = a;
        super();
    }
}
