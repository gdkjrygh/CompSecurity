// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.dialog;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.qihoo.security.locale.d;
import com.qihoo.security.locale.widget.LocaleButton;
import com.qihoo.security.locale.widget.LocaleTextView;

// Referenced classes of package com.qihoo.security.dialog:
//            f, e

public class ScrollContentDialogView extends FrameLayout
    implements f
{

    d a;
    LocaleTextView b;
    LocaleTextView c;
    ImageView d;
    private e e;

    public ScrollContentDialogView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        a = com.qihoo.security.locale.d.a();
        c = null;
        d = null;
        e = null;
        LayoutInflater.from(context).inflate(0x7f03008d, this);
        a();
    }

    private void a()
    {
        e = (e)findViewById(0x7f0b0100);
        b = (LocaleTextView)findViewById(0x7f0b00fd);
        c = (LocaleTextView)findViewById(0x7f0b00fe);
        d = (ImageView)findViewById(0x7f0b00fc);
    }

    public FrameLayout getContentView()
    {
        return (FrameLayout)findViewById(0x7f0b00ff);
    }

    public LocaleTextView getMessageTextView()
    {
        return c;
    }

    public LocaleButton[] getShownButtons()
    {
        return null;
    }

    public transient void setButtonOnClickListener(android.view.View.OnClickListener aonclicklistener[])
    {
        e.setButtonOnClickListener(aonclicklistener);
    }

    public transient void setButtonText(int ai[])
    {
        e.setButtonText(ai);
    }

    public transient void setButtonText(CharSequence acharsequence[])
    {
        e.setButtonText(acharsequence);
    }

    public void setDialogIcon(int i)
    {
        setDialogIcon(getResources().getDrawable(i));
    }

    public void setDialogIcon(Drawable drawable)
    {
        if (drawable == null && b.getVisibility() == 8)
        {
            d.setVisibility(8);
            return;
        } else
        {
            d.setImageDrawable(drawable);
            d.setVisibility(0);
            return;
        }
    }

    public void setDialogMessage(int i)
    {
        setDialogMessage(((CharSequence) (a.a(i))));
    }

    public void setDialogMessage(CharSequence charsequence)
    {
        if (TextUtils.isEmpty(charsequence))
        {
            c.setVisibility(8);
            return;
        } else
        {
            c.setVisibility(0);
            c.setLocalText(charsequence);
            return;
        }
    }

    public void setDialogTitle(int i)
    {
        setDialogTitle(((CharSequence) (a.a(i))));
    }

    public void setDialogTitle(CharSequence charsequence)
    {
        if (TextUtils.isEmpty(charsequence) && d.getVisibility() == 8)
        {
            b.setVisibility(8);
            return;
        } else
        {
            b.setLocalText(charsequence);
            b.setVisibility(0);
            return;
        }
    }
}
