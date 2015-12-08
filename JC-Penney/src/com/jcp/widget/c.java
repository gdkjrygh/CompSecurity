// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.widget;

import com.jcp.views.ad;

// Referenced classes of package com.jcp.widget:
//            BackToTopButton

class c
    implements ad
{

    final BackToTopButton a;

    c(BackToTopButton backtotopbutton)
    {
        a = backtotopbutton;
        super();
    }

    public void a()
    {
        BackToTopButton.a(a, BackToTopButton.a(a));
    }
}
