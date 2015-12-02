// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.widget;

import com.qihoo.security.widget.shadow.ZDepth;
import com.qihoo.security.widget.shadow.ZDepthShadowLayout;

// Referenced classes of package com.qihoo.security.widget:
//            RevealPanel, MaterialRippleLayout

class yout.b extends yout.b
{

    final RevealPanel a;

    public void a()
    {
        RevealPanel.a(a, false);
        RevealPanel.b(a, false);
        a.b();
        RevealPanel.d(a).a(ZDepth.Depth2);
        if (RevealPanel.c(a) != null)
        {
            RevealPanel.c(a).a();
        }
        a.a(false, 1.0F);
    }

    public boolean a(int i, boolean flag)
    {
        boolean flag2 = true;
        if (RevealPanel.e(a) == null) goto _L2; else goto _L1
_L1:
        if (!flag || i <= RevealPanel.f(a)) goto _L4; else goto _L3
_L3:
        float f = ((float)(i - RevealPanel.f(a)) * 1.0F) / (float)(100 - RevealPanel.f(a));
        if (RevealPanel.c(a) != null)
        {
            RevealPanel.c(a).a(true, f);
        }
        a.a(true, f);
_L2:
        boolean flag1 = flag2;
        if (RevealPanel.c(a) != null)
        {
            flag1 = flag2;
            if (RevealPanel.h(a))
            {
                RevealPanel.a(a, RevealPanel.c(a).a(i, flag));
                flag1 = RevealPanel.h(a);
            }
        }
        return flag1;
_L4:
        if (!flag && i > RevealPanel.g(a))
        {
            float f1 = (i - RevealPanel.f(a)) / (100 - RevealPanel.f(a));
            if (RevealPanel.c(a) != null)
            {
                RevealPanel.c(a).a(false, f1);
            }
            a.a(false, f1);
        }
        if (true) goto _L2; else goto _L5
_L5:
    }

    public void b()
    {
        RevealPanel.a(a, false);
        a.a(ZDepth.Depth2);
        if (RevealPanel.a(a) != null)
        {
            RevealPanel.a(a).setBackgroundColor(RevealPanel.b(a));
        }
        a.c();
        if (RevealPanel.c(a) != null)
        {
            RevealPanel.c(a).b();
        }
        RevealPanel.b(a, true);
        a.a(true, 1.0F);
    }

    Layout(RevealPanel revealpanel)
    {
        a = revealpanel;
        super();
    }
}
