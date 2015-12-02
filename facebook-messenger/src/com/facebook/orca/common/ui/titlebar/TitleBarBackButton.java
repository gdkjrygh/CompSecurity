// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.common.ui.titlebar;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageButton;
import com.facebook.h;
import com.facebook.i;
import com.facebook.k;
import com.facebook.widget.f;

// Referenced classes of package com.facebook.orca.common.ui.titlebar:
//            x, y, w

public class TitleBarBackButton extends f
{

    private ImageButton a;

    public TitleBarBackButton(Context context)
    {
        this(context, null, 0);
    }

    public TitleBarBackButton(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public TitleBarBackButton(Context context, AttributeSet attributeset, int j)
    {
        super(context, attributeset, j);
        setContentView(k.orca_titlebar_back_button);
        a = (ImageButton)getView(i.titlebar_button);
        a.setOnClickListener(new x(this));
    }

    public void setColorScheme(w w1)
    {
        switch (y.a[w1.ordinal()])
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
}
