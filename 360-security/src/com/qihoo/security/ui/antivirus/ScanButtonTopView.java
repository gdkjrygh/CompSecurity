// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.ui.antivirus;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.qihoo.security.locale.widget.LocaleTextView;
import com.qihoo.security.ui.b.a;

public class ScanButtonTopView extends RelativeLayout
{

    private LayoutInflater a;
    private final Context b;
    private View c;
    private ImageView d;
    private ImageView e;
    private LocaleTextView f;

    public ScanButtonTopView(Context context)
    {
        super(context);
        b = context;
        a();
    }

    public ScanButtonTopView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        b = context;
        a();
    }

    public ScanButtonTopView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        b = context;
        a();
    }

    private void a()
    {
        a = LayoutInflater.from(b);
        com.qihoo.security.ui.b.a.f f1 = com.qihoo.security.ui.b.a.a().b(0x7f03008c);
        if (f1 == null)
        {
            c = a.inflate(0x7f03008c, this);
        } else
        {
            c = f1.b;
            addView(c, new android.widget.RelativeLayout.LayoutParams(-1, -1));
        }
        d = (ImageView)c.findViewById(0x7f0b01c6);
        e = (ImageView)c.findViewById(0x7f0b01ca);
        f = (LocaleTextView)c.findViewById(0x7f0b01c7);
    }

    public void setColor(int i)
    {
        f.setTextColor(i);
        d.setColorFilter(i);
    }

    public void setIcon(int i)
    {
        d.setImageResource(i);
    }

    public void setIcon(Drawable drawable)
    {
        d.setImageDrawable(drawable);
    }

    public void setIconShadow(int i)
    {
        e.setImageResource(i);
    }

    public void setIconShadow(Drawable drawable)
    {
        e.setImageDrawable(drawable);
    }

    public void setText(String s)
    {
        f.setLocalText(s);
    }
}
