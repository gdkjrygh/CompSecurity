// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.widget.TextView;

final class hmy
    implements dhf
{

    boolean a;
    float b;

    hmy()
    {
        a = true;
    }

    public final void a(MenuItem menuitem)
    {
        int i = 0;
        TextView textview = (TextView)menuitem.getActionView();
        if (a)
        {
            int j = Math.max(Math.min(Math.round(b * 255F), 255), 0);
            if (j > 0)
            {
                menuitem.setVisible(true);
            } else
            {
                menuitem.setVisible(false);
            }
            menuitem = textview.getCompoundDrawables();
            for (int k = menuitem.length; i < k; i++)
            {
                Drawable drawable = menuitem[i];
                if (drawable != null)
                {
                    drawable.setAlpha(j);
                }
            }

            i = textview.getCurrentTextColor();
            textview.setTextColor(Color.argb(j, Color.red(i), Color.green(i), Color.blue(i)));
            return;
        } else
        {
            menuitem.setVisible(false);
            return;
        }
    }

    public final void b(MenuItem menuitem)
    {
    }
}
