// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.dialog;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.facebook.i;
import com.facebook.k;
import com.facebook.widget.f;

// Referenced classes of package com.facebook.orca.dialog:
//            g, MenuDialogItem

public class h extends f
{

    private TextView a;
    private View b;

    public h(Context context)
    {
        super(context);
        a();
    }

    private void a()
    {
        setContentView(k.orca_dialog_menu_item);
        a = (TextView)findViewById(i.dialog_menu_item_text);
        b = findViewById(i.dialog_menu_item_divider);
    }

    public void setDividerVisibility(int j)
    {
        b.setVisibility(j);
    }

    public void setMenuDialogItem(MenuDialogItem menudialogitem)
    {
        if (g.a(menudialogitem))
        {
            a.setText(menudialogitem.b());
        } else
        if (g.b(menudialogitem))
        {
            a.setText(menudialogitem.c());
            return;
        }
    }

    public void setOnClickListener(android.view.View.OnClickListener onclicklistener)
    {
        a.setOnClickListener(onclicklistener);
    }
}
