// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.actionbarsherlock.internal.a;

import android.widget.PopupWindow;

// Referenced classes of package com.actionbarsherlock.internal.a:
//            a, c, b

class h
    implements Runnable
{

    final a a;

    private h(a a1)
    {
        a = a1;
        super();
    }

    h(a a1, b b)
    {
        this(a1);
    }

    public void run()
    {
        if (com.actionbarsherlock.internal.a.a.a(a) != null && com.actionbarsherlock.internal.a.a.a(a).getCount() > com.actionbarsherlock.internal.a.a.a(a).getChildCount() && com.actionbarsherlock.internal.a.a.a(a).getChildCount() <= com.actionbarsherlock.internal.a.a.b(a))
        {
            com.actionbarsherlock.internal.a.a.c(a).setInputMethodMode(2);
            a.a();
        }
    }
}
