// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.widget.shadow;

import com.nineoldandroids.a.o;

// Referenced classes of package com.qihoo.security.widget.shadow:
//            d, e, a

class a
    implements com.nineoldandroids.a.shadow.d._cls1
{

    final d a;

    public void a(o o1)
    {
        int i = ((Integer)o1.b("alphaTopShadow")).intValue();
        int j = ((Integer)o1.b("alphaBottomShadow")).intValue();
        float f = ((Float)o1.b("offsetTopShadow")).floatValue();
        float f1 = ((Float)o1.b("offsetBottomShadow")).floatValue();
        float f2 = ((Float)o1.b("blurTopShadow")).floatValue();
        float f3 = ((Float)o1.b("blurBottomShadow")).floatValue();
        a.b.a = i;
        a.b.b = j;
        a.b.c = f;
        a.b.d = f1;
        a.b.e = f2;
        a.b.f = f3;
        a.a.a(a.b, a.c, a.d, a.getWidth() - a.e, a.getHeight() - a.f);
        a.invalidate();
    }

    (d d1)
    {
        a = d1;
        super();
    }
}
