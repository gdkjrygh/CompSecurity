// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.filter.selfiecam;


// Referenced classes of package com.roidapp.photogrid.filter.selfiecam:
//            w, SelfieCamImageEditGLESActivity, b

final class c
    implements w
{

    final boolean a;
    final SelfieCamImageEditGLESActivity b;

    c(SelfieCamImageEditGLESActivity selfiecamimageeditglesactivity, boolean flag)
    {
        b = selfiecamimageeditglesactivity;
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
        SelfieCamImageEditGLESActivity.a(b, a, new b(b, ainteger, SelfieCamImageEditGLESActivity.a(b), flag, SelfieCamImageEditGLESActivity.b(b)));
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
