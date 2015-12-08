// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.ui;

import android.graphics.Rect;
import android.widget.PopupWindow;
import android.widget.TextView;

// Referenced classes of package com.fitbit.ui:
//            EditText

public class e extends PopupWindow
{

    Rect a;
    private boolean b;
    private final TextView c;
    private final EditText d;
    private final int e;
    private final int f;

    e(EditText edittext, TextView textview, int i, int j)
    {
        this(edittext, textview, i, j, 0x7f02032b, 0x7f02032a);
    }

    e(EditText edittext, TextView textview, int i, int j, int k, int l)
    {
        super(textview, i, j);
        b = false;
        a = new Rect();
        c = textview;
        d = edittext;
        e = k;
        f = l;
    }

    void a(boolean flag)
    {
        b = flag;
        if (flag)
        {
            c.setBackgroundResource(e);
            return;
        } else
        {
            c.setBackgroundResource(f);
            return;
        }
    }

    public void update(int i, int j, int k, int l, boolean flag)
    {
        if (a.top < 0 || a.top > a.height() / 2)
        {
            c.setVisibility(8);
        } else
        {
            c.setVisibility(0);
        }
        super.update(i, j, k, l, flag);
        flag = isAboveAnchor();
        if (flag != b)
        {
            a(flag);
        }
        d.getLocalVisibleRect(a);
    }
}
