// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.filter.selfiecam;


// Referenced classes of package com.roidapp.photogrid.filter.selfiecam:
//            SelfieCamImageShowActivity

final class k
    implements Runnable
{

    final Throwable a;
    final String b;
    final SelfieCamImageShowActivity c;

    k(SelfieCamImageShowActivity selfiecamimageshowactivity, Throwable throwable, String s)
    {
        c = selfiecamimageshowactivity;
        a = throwable;
        b = s;
        super();
    }

    public final void run()
    {
        c.a(a, b);
    }
}
