// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.widget.PopupWindow;

// Referenced classes of package android.support.v7.widget:
//            ac, ag, ad

class ao
    implements Runnable
{

    final ac a;

    private ao(ac ac1)
    {
        a = ac1;
        super();
    }

    ao(ac ac1, ad ad)
    {
        this(ac1);
    }

    public void run()
    {
        if (ac.a(a) != null && ac.a(a).getCount() > ac.a(a).getChildCount() && ac.a(a).getChildCount() <= a.b)
        {
            ac.b(a).setInputMethodMode(2);
            a.c();
        }
    }
}
