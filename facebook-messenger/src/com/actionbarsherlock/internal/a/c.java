// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.actionbarsherlock.internal.a;

import android.content.Context;
import android.widget.ListView;
import com.facebook.d;

class c extends ListView
{

    private boolean a;
    private boolean b;

    public c(Context context, boolean flag)
    {
        super(context, null, d.dropDownListViewStyle);
        b = flag;
        setCacheColorHint(0);
    }

    static boolean a(c c1, boolean flag)
    {
        c1.a = flag;
        return flag;
    }

    public boolean hasFocus()
    {
        return b || super.hasFocus();
    }

    public boolean hasWindowFocus()
    {
        return b || super.hasWindowFocus();
    }

    public boolean isFocused()
    {
        return b || super.isFocused();
    }

    public boolean isInTouchMode()
    {
        return b && a || super.isInTouchMode();
    }
}
