// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package net.hockeyapp.android.views;

import agq;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class UpdateView extends RelativeLayout
{

    private RelativeLayout a;
    private boolean b;
    private boolean c;

    public UpdateView(Context context)
    {
        this(context, (byte)0);
    }

    private UpdateView(Context context, byte byte0)
    {
        this(context, true, false);
    }

    public UpdateView(Context context, AttributeSet attributeset)
    {
        this(context, true, false);
    }

    public UpdateView(Context context, boolean flag, boolean flag1)
    {
        super(context);
        a = null;
        b = false;
        c = false;
        Object obj;
        Object obj1;
        Object obj2;
        ColorDrawable colordrawable;
        int i;
        if (flag)
        {
            if (getResources().getConfiguration().orientation == 2)
            {
                b = true;
            } else
            {
                b = false;
            }
        } else
        {
            b = false;
        }
        c = flag1;
        obj = new android.widget.RelativeLayout.LayoutParams(-1, -2);
        setBackgroundColor(-1);
        setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj)));
        a = new RelativeLayout(context);
        a.setId(4097);
        if (b)
        {
            obj = new android.widget.RelativeLayout.LayoutParams((int)TypedValue.applyDimension(1, 250F, getResources().getDisplayMetrics()), -1);
            ((android.widget.RelativeLayout.LayoutParams) (obj)).addRule(9, -1);
            a.setPadding(0, 0, 0, 0);
        } else
        {
            obj = new android.widget.RelativeLayout.LayoutParams(-1, -2);
            a.setPadding(0, 0, 0, (int)TypedValue.applyDimension(1, 20F, getResources().getDisplayMetrics()));
        }
        a.setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj)));
        a.setBackgroundColor(Color.rgb(230, 236, 239));
        obj = a;
        obj1 = new TextView(context);
        ((TextView) (obj1)).setId(4098);
        obj2 = new android.widget.RelativeLayout.LayoutParams(-2, -2);
        i = (int)TypedValue.applyDimension(1, 20F, getResources().getDisplayMetrics());
        ((android.widget.RelativeLayout.LayoutParams) (obj2)).setMargins(i, i, i, 0);
        ((TextView) (obj1)).setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj2)));
        ((TextView) (obj1)).setEllipsize(android.text.TextUtils.TruncateAt.END);
        ((TextView) (obj1)).setShadowLayer(1.0F, 0.0F, 1.0F, -1);
        ((TextView) (obj1)).setSingleLine(true);
        ((TextView) (obj1)).setTextColor(0xff000000);
        ((TextView) (obj1)).setTextSize(2, 20F);
        ((TextView) (obj1)).setTypeface(null, 1);
        ((RelativeLayout) (obj)).addView(((android.view.View) (obj1)));
        obj = a;
        obj1 = new TextView(context);
        ((TextView) (obj1)).setId(4099);
        obj2 = new android.widget.RelativeLayout.LayoutParams(-2, -2);
        i = (int)TypedValue.applyDimension(1, 20F, getResources().getDisplayMetrics());
        ((android.widget.RelativeLayout.LayoutParams) (obj2)).setMargins(i, (int)TypedValue.applyDimension(1, 10F, getResources().getDisplayMetrics()), i, 0);
        ((android.widget.RelativeLayout.LayoutParams) (obj2)).addRule(3, 4098);
        ((TextView) (obj1)).setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj2)));
        ((TextView) (obj1)).setEllipsize(android.text.TextUtils.TruncateAt.END);
        ((TextView) (obj1)).setShadowLayer(1.0F, 0.0F, 1.0F, -1);
        ((TextView) (obj1)).setLines(2);
        ((TextView) (obj1)).setLineSpacing(0.0F, 1.1F);
        ((TextView) (obj1)).setTextColor(0xff000000);
        ((TextView) (obj1)).setTextSize(2, 16F);
        ((TextView) (obj1)).setTypeface(null, 1);
        ((RelativeLayout) (obj)).addView(((android.view.View) (obj1)));
        obj = a;
        obj1 = new Button(context);
        ((Button) (obj1)).setId(4100);
        i = (int)TypedValue.applyDimension(1, 20F, getResources().getDisplayMetrics());
        obj2 = new android.widget.RelativeLayout.LayoutParams((int)TypedValue.applyDimension(1, 120F, getResources().getDisplayMetrics()), -2);
        ((android.widget.RelativeLayout.LayoutParams) (obj2)).setMargins(i, i, i, i);
        ((android.widget.RelativeLayout.LayoutParams) (obj2)).addRule(9, -1);
        ((android.widget.RelativeLayout.LayoutParams) (obj2)).addRule(3, 4099);
        ((Button) (obj1)).setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj2)));
        obj2 = new StateListDrawable();
        colordrawable = new ColorDrawable(0xff000000);
        ((StateListDrawable) (obj2)).addState(new int[] {
            0xfefeff59
        }, colordrawable);
        colordrawable = new ColorDrawable(0xff444444);
        ((StateListDrawable) (obj2)).addState(new int[] {
            0xfefeff59, 0x101009c
        }, colordrawable);
        colordrawable = new ColorDrawable(0xff888888);
        ((StateListDrawable) (obj2)).addState(new int[] {
            0x10100a7
        }, colordrawable);
        ((Button) (obj1)).setBackgroundDrawable(((android.graphics.drawable.Drawable) (obj2)));
        ((Button) (obj1)).setText("Update");
        ((Button) (obj1)).setTextColor(-1);
        ((Button) (obj1)).setTextSize(2, 16F);
        ((RelativeLayout) (obj)).addView(((android.view.View) (obj1)));
        addView(a);
        obj = new WebView(context);
        ((WebView) (obj)).setId(4101);
        i = (int)TypedValue.applyDimension(1, 400F, context.getResources().getDisplayMetrics());
        if (!c)
        {
            i = -1;
        }
        obj1 = new android.widget.RelativeLayout.LayoutParams(-1, i);
        if (b)
        {
            ((android.widget.RelativeLayout.LayoutParams) (obj1)).addRule(1, 4097);
        } else
        {
            ((android.widget.RelativeLayout.LayoutParams) (obj1)).addRule(3, 4097);
        }
        ((android.widget.RelativeLayout.LayoutParams) (obj1)).setMargins(0, 0, 0, 0);
        ((WebView) (obj)).setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj1)));
        ((WebView) (obj)).setBackgroundColor(-1);
        addView(((android.view.View) (obj)));
        obj1 = a;
        i = (int)TypedValue.applyDimension(1, 3F, getResources().getDisplayMetrics());
        obj2 = new ImageView(context);
        if (b)
        {
            obj = new android.widget.RelativeLayout.LayoutParams(1, -1);
            ((android.widget.RelativeLayout.LayoutParams) (obj)).addRule(11, -1);
            ((ImageView) (obj2)).setBackgroundDrawable(new ColorDrawable(0xff000000));
        } else
        {
            obj = new android.widget.RelativeLayout.LayoutParams(-1, i);
            ((android.widget.RelativeLayout.LayoutParams) (obj)).addRule(10, -1);
            ((ImageView) (obj2)).setBackgroundDrawable(agq.a());
        }
        ((ImageView) (obj2)).setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj)));
        ((RelativeLayout) (obj1)).addView(((android.view.View) (obj2)));
        context = new ImageView(context);
        obj = new android.widget.RelativeLayout.LayoutParams(-1, i);
        if (b)
        {
            ((android.widget.RelativeLayout.LayoutParams) (obj)).addRule(10, -1);
        } else
        {
            ((android.widget.RelativeLayout.LayoutParams) (obj)).addRule(3, 4097);
        }
        context.setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj)));
        context.setBackgroundDrawable(agq.a());
        addView(context);
    }
}
