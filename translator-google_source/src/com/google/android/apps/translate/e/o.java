// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.translate.e;

import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.PopupMenu;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.google.android.apps.translate.r;
import com.google.android.apps.translate.s;
import com.google.android.apps.translate.widget.z;

public final class o
    implements android.view.MenuItem.OnMenuItemClickListener, android.view.View.OnClickListener, android.view.View.OnLongClickListener, Runnable
{

    private final View a;
    private final z b;
    private final int c = Resources.getSystem().getIdentifier("text_edit_action_popup_text", "layout", "android");
    private final int d = Resources.getSystem().getIdentifier("text_edit_paste_window", "drawable", "android");
    private final Handler e = new Handler();
    private PopupWindow f;
    private PopupMenu g;

    public o(View view, z z1)
    {
        a = view;
        b = z1;
    }

    public final void onClick(View view)
    {
        b.c();
        f.dismiss();
    }

    public final boolean onLongClick(View view)
    {
        boolean flag1 = false;
        if (!b.b()) goto _L2; else goto _L1
_L1:
        if (g != null) goto _L4; else goto _L3
_L3:
        boolean flag = flag1;
        if (c == 0) goto _L6; else goto _L5
_L5:
        if (d != 0) goto _L8; else goto _L7
_L7:
        flag = flag1;
_L6:
        if (flag) goto _L9; else goto _L4
_L4:
        if (g == null)
        {
            g = new PopupMenu(a.getContext(), a);
            g.getMenu().add(r.label_paste).setOnMenuItemClickListener(this);
        }
        g.show();
_L9:
        return true;
_L8:
        if (f == null)
        {
            view = View.inflate(a.getContext(), c, null);
            flag = flag1;
            if (!(view instanceof TextView))
            {
                continue; /* Loop/switch isn't completed */
            }
            view = (TextView)view;
            view.setText(r.label_paste);
            view.setOnClickListener(this);
            f = new PopupWindow(view, -2, -2, false);
            f.setBackgroundDrawable(a.getContext().getResources().getDrawable(d));
            f.setOutsideTouchable(true);
            f.setFocusable(true);
            f.setAnimationStyle(s.KeyboardDialogTheme_WindowAnim);
        }
        f.showAsDropDown(a);
        e.removeCallbacks(this);
        e.postDelayed(this, 4000L);
        flag = true;
        if (true) goto _L6; else goto _L2
_L2:
        return false;
    }

    public final boolean onMenuItemClick(MenuItem menuitem)
    {
        return b.c();
    }

    public final void run()
    {
        if (f != null && f.isShowing())
        {
            f.dismiss();
        }
    }
}
