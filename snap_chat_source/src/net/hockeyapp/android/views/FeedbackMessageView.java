// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package net.hockeyapp.android.views;

import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;
import android.widget.LinearLayout;
import android.widget.TextView;

// Referenced classes of package net.hockeyapp.android.views:
//            AttachmentListView

public class FeedbackMessageView extends LinearLayout
{

    private TextView a;
    private TextView b;
    private TextView c;
    private AttachmentListView d;

    public FeedbackMessageView(Context context)
    {
        this(context, (byte)0);
    }

    private FeedbackMessageView(Context context, byte byte0)
    {
        super(context);
        setOrientation(1);
        setGravity(3);
        setBackgroundColor(0xffcccccc);
        a = new TextView(context);
        a.setId(12289);
        android.widget.LinearLayout.LayoutParams layoutparams = new android.widget.LinearLayout.LayoutParams(-2, -2);
        byte0 = (int)TypedValue.applyDimension(1, 20F, getResources().getDisplayMetrics());
        layoutparams.setMargins(byte0, byte0, byte0, 0);
        a.setLayoutParams(layoutparams);
        a.setShadowLayer(1.0F, 0.0F, 1.0F, -1);
        a.setSingleLine(true);
        a.setTextColor(0xff888888);
        a.setTextSize(2, 15F);
        a.setTypeface(null, 0);
        addView(a);
        b = new TextView(context);
        b.setId(12290);
        layoutparams = new android.widget.LinearLayout.LayoutParams(-2, -2);
        byte0 = (int)TypedValue.applyDimension(1, 20F, getResources().getDisplayMetrics());
        layoutparams.setMargins(byte0, 0, byte0, 0);
        b.setLayoutParams(layoutparams);
        b.setShadowLayer(1.0F, 0.0F, 1.0F, -1);
        b.setSingleLine(true);
        b.setTextColor(0xff888888);
        b.setTextSize(2, 15F);
        b.setTypeface(null, 2);
        addView(b);
        c = new TextView(context);
        c.setId(12291);
        layoutparams = new android.widget.LinearLayout.LayoutParams(-2, -2);
        byte0 = (int)TypedValue.applyDimension(1, 20F, getResources().getDisplayMetrics());
        layoutparams.setMargins(byte0, 0, byte0, byte0);
        c.setLayoutParams(layoutparams);
        c.setShadowLayer(1.0F, 0.0F, 1.0F, -1);
        c.setSingleLine(false);
        c.setTextColor(0xff000000);
        c.setTextSize(2, 18F);
        c.setTypeface(null, 0);
        addView(c);
        d = new AttachmentListView(context);
        d.setId(12292);
        context = new android.widget.LinearLayout.LayoutParams(-1, -1);
        byte0 = (int)TypedValue.applyDimension(1, 20F, getResources().getDisplayMetrics());
        context.setMargins(byte0, 0, byte0, byte0);
        d.setLayoutParams(context);
        addView(d);
    }

    private void a(int i)
    {
        if (a != null)
        {
            a.setTextColor(i);
        }
    }

    private void b(int i)
    {
        if (b != null)
        {
            b.setTextColor(i);
        }
    }

    public void setAuthorLabelText(String s)
    {
        if (a != null && s != null)
        {
            a.setText(s);
        }
    }

    public void setDateLabelText(String s)
    {
        if (b != null && s != null)
        {
            b.setText(s);
        }
    }

    public void setFeedbackMessageViewBgAndTextColor(int i)
    {
        if (i != 0) goto _L2; else goto _L1
_L1:
        setBackgroundColor(0xffcccccc);
        a(-1);
        b(-1);
_L4:
        if (c != null)
        {
            c.setTextColor(0xff000000);
        }
        return;
_L2:
        if (i == 1)
        {
            setBackgroundColor(-1);
            a(0xffcccccc);
            b(0xffcccccc);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void setMessageLabelText(String s)
    {
        if (c != null && s != null)
        {
            c.setText(s);
        }
    }
}
