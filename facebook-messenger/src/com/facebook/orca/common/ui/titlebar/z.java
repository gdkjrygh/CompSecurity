// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.common.ui.titlebar;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.facebook.h;
import com.facebook.i;
import com.facebook.k;
import com.facebook.q;
import com.facebook.widget.d;

// Referenced classes of package com.facebook.orca.common.ui.titlebar:
//            aa, ab, w

public class z extends d
{

    private final ImageButton a;
    private final ProgressBar b;
    private final TextView c;
    private final View d;
    private Drawable e;
    private String f;
    private int g;
    private boolean h;

    public z(Context context)
    {
        this(context, null, 0);
    }

    public z(Context context, AttributeSet attributeset, int j)
    {
        super(context, attributeset, j);
        context = context.obtainStyledAttributes(attributeset, q.TitleBarButton);
        j = context.getResourceId(q.TitleBarButton_src, -1);
        if (j != -1)
        {
            e = context.getResources().getDrawable(j);
        }
        g = context.getInt(q.TitleBarButton_dividerPosition, 1);
        context.recycle();
        setContentView(k.orca_titlebar_button);
        a = (ImageButton)c(i.titlebar_button);
        a.setImageDrawable(e);
        a.setOnClickListener(new aa(this));
        c = (TextView)c(i.titlebar_text);
        b = (ProgressBar)c(i.titlebar_button_progress);
        d = findViewById(i.titlebar_divider);
        setDividerPosition(g);
    }

    private void a()
    {
        if (h)
        {
            b.setVisibility(0);
            a.setVisibility(8);
            c.setVisibility(8);
        } else
        {
            b.setVisibility(8);
            if (f != null)
            {
                c.setVisibility(0);
                return;
            }
            if (e != null)
            {
                a.setVisibility(0);
                return;
            }
        }
    }

    public ImageButton getImageButton()
    {
        return a;
    }

    public void setButtonWidth(int j)
    {
        if (j == 0)
        {
            return;
        } else
        {
            FrameLayout framelayout = (FrameLayout)findViewById(i.titlebar_button_layout);
            android.view.ViewGroup.LayoutParams layoutparams = framelayout.getLayoutParams();
            layoutparams.width = j;
            framelayout.setLayoutParams(layoutparams);
            a();
            return;
        }
    }

    public void setColorScheme(w w1)
    {
        switch (ab.a[w1.ordinal()])
        {
        default:
            return;

        case 1: // '\001'
            a.setBackgroundResource(h.orca_title_bar_top_button);
            return;

        case 2: // '\002'
            a.setBackgroundResource(h.orca_title_bar_top_sms_button);
            break;
        }
    }

    public void setDividerPosition(int j)
    {
        g = j;
        ImageButton imagebutton;
        boolean flag;
        if ((j & 1) == 1)
        {
            android.widget.FrameLayout.LayoutParams layoutparams = (android.widget.FrameLayout.LayoutParams)d.getLayoutParams();
            layoutparams.gravity = 3;
            d.setLayoutParams(layoutparams);
            d.setVisibility(0);
        } else
        if ((j & 2) == 2)
        {
            android.widget.FrameLayout.LayoutParams layoutparams1 = (android.widget.FrameLayout.LayoutParams)d.getLayoutParams();
            layoutparams1.gravity = 5;
            d.setLayoutParams(layoutparams1);
            d.setVisibility(0);
        } else
        {
            d.setVisibility(8);
        }
        imagebutton = a;
        if (j != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        imagebutton.setEnabled(flag);
    }

    public void setEnabled(boolean flag)
    {
        super.setEnabled(flag);
        a.setEnabled(flag);
    }

    public void setImageDrawable(Drawable drawable)
    {
        f = null;
        e = drawable;
        a.setImageDrawable(drawable);
        a();
    }

    public void setShowProgress(boolean flag)
    {
        boolean flag1 = false;
        h = flag;
        Object obj = b;
        int j;
        if (flag)
        {
            j = 0;
        } else
        {
            j = 8;
        }
        ((ProgressBar) (obj)).setVisibility(j);
        obj = a;
        if (!flag)
        {
            j = 0;
        } else
        {
            j = 8;
        }
        ((ImageButton) (obj)).setVisibility(j);
        obj = c;
        if (!flag)
        {
            j = ((flag1) ? 1 : 0);
        } else
        {
            j = 8;
        }
        ((TextView) (obj)).setVisibility(j);
    }

    public void setText(String s)
    {
        e = null;
        f = s;
        c.setText(s);
        a();
    }
}
