// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.miteksystems.misnap;


// Referenced classes of package com.miteksystems.misnap:
//            MiSnap

final class g
    implements Runnable
{

    final MiSnap a;

    g(MiSnap misnap)
    {
        a = misnap;
        super();
    }

    public final void run()
    {
        MiSnap.d(a);
    }
}
