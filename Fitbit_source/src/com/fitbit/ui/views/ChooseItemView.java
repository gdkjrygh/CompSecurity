// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.ui.views;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

// Referenced classes of package com.fitbit.ui.views:
//            ChooseItemView_

public class ChooseItemView extends LinearLayout
{

    protected TextView a;
    protected TextView b;
    protected ImageView c;

    public ChooseItemView(Context context)
    {
        super(context);
    }

    public ChooseItemView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    public ChooseItemView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
    }

    public static ChooseItemView a(Context context)
    {
        return ChooseItemView_.b(context);
    }

    public final void a(int i)
    {
        if (c != null)
        {
            c.setVisibility(i);
        }
    }

    public final void a(CharSequence charsequence)
    {
        if (a != null)
        {
            a.setText(charsequence);
        }
    }

    public final void b(CharSequence charsequence)
    {
label0:
        {
            if (b != null)
            {
                b.setText(charsequence);
                if (TextUtils.isEmpty(charsequence))
                {
                    break label0;
                }
                b.setVisibility(0);
            }
            return;
        }
        b.setVisibility(8);
    }
}
