// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;


// Referenced classes of package com.google.android.gms.tagmanager:
//            v

class aoX
    implements Runnable
{

    final v aoW;
    final Layer.c.a aoX;

    public void run()
    {
        aoX.g(v.a(aoW));
    }

    Layer.c.a(v v1, Layer.c.a a)
    {
        aoW = v1;
        aoX = a;
        super();
    }
}
