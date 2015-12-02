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

public class m extends CustomRelativeLayout
{

    private TextView a;

    public m(Context context)
    {
        this(context, null);
    }

    public m(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public m(Context context, AttributeSet attributeset, int j)
    {
        super(context, attributeset, j);
        setContentView(k.contacts_text_row_view);
        setClickable(true);
        if (android.os.Build.VERSION.SDK_INT >= 14)
        {
            setBackgroundResource(h.orca_item_background_holo_light);
        } else
        {
            setBackgroundResource(0x1080062);
        }
        a = (TextView)a(i.item_text);
    }

    public void setText(String s)
    {
        a.setText(s);
    }
}
