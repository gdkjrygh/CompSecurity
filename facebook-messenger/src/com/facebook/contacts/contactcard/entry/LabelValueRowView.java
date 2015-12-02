// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.contacts.contactcard.entry;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;
import com.facebook.h;
import com.facebook.i;
import com.facebook.k;
import com.facebook.widget.CustomRelativeLayout;

public class LabelValueRowView extends CustomRelativeLayout
{

    private final TextView a;
    private final TextView b;

    public LabelValueRowView(Context context)
    {
        this(context, null);
    }

    public LabelValueRowView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public LabelValueRowView(Context context, AttributeSet attributeset, int j)
    {
        super(context, attributeset, j);
        setContentView(k.contacts_entry_view);
        setClickable(true);
        if (android.os.Build.VERSION.SDK_INT >= 14)
        {
            setBackgroundResource(h.orca_item_background_holo_light);
        } else
        {
            setBackgroundResource(0x1080062);
        }
        b = (TextView)a(i.item_value);
        a = (TextView)a(i.item_label);
    }

    public void setLabelText(int j)
    {
        a.setText(j);
    }

    public void setLabelText(String s)
    {
        a.setText(s);
    }

    public void setValueText(int j)
    {
        b.setText(j);
    }

    public void setValueText(String s)
    {
        b.setText(s);
    }
}
