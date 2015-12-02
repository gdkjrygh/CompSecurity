// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.messageview;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.i;
import com.facebook.k;
import com.facebook.widget.f;

public class ReadView extends f
{

    private TextView a;
    private ImageView b;

    public ReadView(Context context)
    {
        super(context);
        a(context);
    }

    public ReadView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        a(context);
    }

    public ReadView(Context context, AttributeSet attributeset, int j)
    {
        super(context, attributeset, j);
        a(context);
    }

    private void a(Context context)
    {
        setContentView(k.orca_message_read_item);
        b = (ImageView)getView(i.receipt_icon);
        a = (TextView)getView(i.receipt_text);
    }

    public void setShowReadReceiptIcon(boolean flag)
    {
        ImageView imageview = b;
        int j;
        if (flag)
        {
            j = 0;
        } else
        {
            j = 8;
        }
        imageview.setVisibility(j);
    }

    public void setText(String s)
    {
        a.setText(s);
    }
}
