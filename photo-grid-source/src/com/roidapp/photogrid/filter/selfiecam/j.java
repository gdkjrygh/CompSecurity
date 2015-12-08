// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.filter.selfiecam;


// Referenced classes of package com.roidapp.photogrid.filter.selfiecam:
//            w, SelfieCamImageShowActivity, b

final class j
    implements w
{

    final SelfieCamImageShowActivity a;

    j(SelfieCamImageShowActivity selfiecamimageshowactivity)
    {
        a = selfiecamimageshowactivity;
        super();
    }

    public final String a()
    {
        return a.getString(0x7f070227);
    }

    public final void a(Integer ainteger[], boolean flag)
    {
        SelfieCamImageShowActivity.a(a, false, new b(a, ainteger, SelfieCamImageShowActivity.b(a), flag, SelfieCamImageShowActivity.c(a)));
    }

    public final int b()
    {
        return 1;
    }

    public final int c()
    {
        return 0x7f0203e8;
    }
}
