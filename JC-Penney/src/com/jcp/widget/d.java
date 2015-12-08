// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.widget;


// Referenced classes of package com.jcp.widget:
//            BackToTopButton

class d
    implements Runnable
{

    final BackToTopButton a;

    d(BackToTopButton backtotopbutton)
    {
        a = backtotopbutton;
        super();
    }

    public void run()
    {
        BackToTopButton.a(a, false);
    }
}
