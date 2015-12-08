// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.filter.selfiecam;


// Referenced classes of package com.roidapp.photogrid.filter.selfiecam:
//            w, SelfieCamImageShowActivity, b

final class f
    implements w
{

    final boolean a;
    final SelfieCamImageShowActivity b;

    f(SelfieCamImageShowActivity selfiecamimageshowactivity, boolean flag)
    {
        b = selfiecamimageshowactivity;
        a = flag;
        super();
    }

    public final String a()
    {
        if (a)
        {
            return b.getString(0x7f070228);
        } else
        {
            return b.getString(0x7f070227);
        }
    }

    public final void a(Integer ainteger[], boolean flag)
    {
        SelfieCamImageShowActivity.a(b, a, new b(b, ainteger, SelfieCamImageShowActivity.b(b), flag, SelfieCamImageShowActivity.c(b)));
    }

    public final int b()
    {
        return !a ? 1 : 0;
    }

    public final int c()
    {
        return !a ? 0x7f0203e8 : 0x7f0203ea;
    }
}
