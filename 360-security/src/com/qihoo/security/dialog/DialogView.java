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
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.qihoo.security.locale.d;
import com.qihoo.security.locale.widget.LocaleButton;
import com.qihoo.security.locale.widget.LocaleTextView;
import com.qihoo360.mobilesafe.b.a;

// Referenced classes of package com.qihoo.security.dialog:
//            f, e

public class DialogView extends FrameLayout
    implements f
{
    public static final class Style extends Enum
    {

        public static final Style TRANSPARENT;
        private static final Style a[];

        public static Style valueOf(String s)
        {
            return (Style)Enum.valueOf(com/qihoo/security/dialog/DialogView$Style, s);
        }

        public static Style[] values()
        {
            return (Style[])a.clone();
        }

        static 
        {
            TRANSPARENT = new Style("TRANSPARENT", 0);
            a = (new Style[] {
                TRANSPARENT
            });
        }

        private Style(String s, int i)
        {
            super(s, i);
        }
    }


    private final d a;
    private final Context b;
    private LocaleTextView c;
    private LocaleTextView d;
    private ImageView e;
    private e f;
    private View g;

    public DialogView(Context context)
    {
        this(context, null);
    }

    public DialogView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        a = com.qihoo.security.locale.d.a();
        d = null;
        e = null;
        f = null;
        g = null;
        b = context;
        LayoutInflater.from(context).inflate(0x7f030046, this);
        b();
    }

    private void b()
    {
        f = (e)findViewById(0x7f0b0100);
        c = (LocaleTextView)findViewById(0x7f0b00fd);
        d = (LocaleTextView)findViewById(0x7f0b00fe);
        e = (ImageView)findViewById(0x7f0b00fc);
        g = findViewById(0x7f0b00fb);
    }

    public void a()
    {
        g.setVisibility(8);
    }

    public FrameLayout getContentView()
    {
        return (FrameLayout)findViewById(0x7f0b00ff);
    }

    public LocaleTextView getMessageTextView()
    {
        return d;
    }

    public LocaleButton[] getShownButtons()
    {
        return f.getShownButtons();
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        android.widget.FrameLayout.LayoutParams layoutparams = (android.widget.FrameLayout.LayoutParams)getLayoutParams();
        layoutparams.width = com.qihoo360.mobilesafe.b.a.a(b) - com.qihoo360.mobilesafe.b.a.a(b, 40F);
        setLayoutParams(layoutparams);
    }

    public transient void setButtonOnClickListener(android.view.View.OnClickListener aonclicklistener[])
    {
        f.setButtonOnClickListener(aonclicklistener);
    }

    public transient void setButtonText(int ai[])
    {
        f.setButtonText(ai);
    }

    public transient void setButtonText(CharSequence acharsequence[])
    {
        f.setButtonText(acharsequence);
    }

    public void setDialogIcon(int i)
    {
        setDialogIcon(getResources().getDrawable(i));
    }

    public void setDialogIcon(Drawable drawable)
    {
        if (drawable == null && c.getVisibility() == 8)
        {
            e.setVisibility(8);
            return;
        } else
        {
            e.setVisibility(0);
            e.setImageDrawable(drawable);
            return;
        }
    }

    public void setDialogMessage(int i)
    {
        setDialogMessage(((CharSequence) (a.a(i))));
    }

    public void setDialogMessage(CharSequence charsequence)
    {
        FrameLayout framelayout = getContentView();
        if (TextUtils.isEmpty(charsequence))
        {
            d.setVisibility(8);
            if (framelayout != null)
            {
                framelayout.setVisibility(0);
            }
        } else
        {
            d.setVisibility(0);
            d.setLocalText(charsequence);
            if (framelayout != null)
            {
                framelayout.setVisibility(8);
                return;
            }
        }
    }

    public void setDialogStyle(Style style)
    {
        static class _cls1
        {

            static final int a[];

            static 
            {
                a = new int[Style.values().length];
                try
                {
                    a[Style.TRANSPARENT.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror) { }
            }
        }

        switch (com.qihoo.security.dialog._cls1.a[style.ordinal()])
        {
        default:
            return;

        case 1: // '\001'
            setBackgroundColor(0);
            break;
        }
    }

    public void setDialogTitle(int i)
    {
        setDialogTitle(((CharSequence) (a.a(i))));
    }

    public void setDialogTitle(CharSequence charsequence)
    {
        if (TextUtils.isEmpty(charsequence) && e.getVisibility() == 8)
        {
            c.setVisibility(8);
            return;
        } else
        {
            c.setLocalText(charsequence);
            c.setVisibility(0);
            return;
        }
    }
}
