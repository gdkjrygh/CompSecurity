// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.reflex;


// Referenced classes of package com.facebook.reflex:
//            m, j

class o
    implements android.view.ViewTreeObserver.OnPreDrawListener
{

    final j a;
    final m b;

    o(m m1, j j)
    {
        b = m1;
        a = j;
        super();
    }

    public boolean onPreDraw()
    {
        m.b(b);
        return true;
    }
}
