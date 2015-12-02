// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.dialog;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import com.qihoo.security.app.BaseSimpleActivity;
import com.qihoo.security.locale.d;
import com.qihoo.security.locale.widget.LocaleButton;

// Referenced classes of package com.qihoo.security.dialog:
//            d, DialogView

public abstract class AbsDialogActivity extends BaseSimpleActivity
    implements com.qihoo.security.dialog.d
{

    protected Context a;
    protected d b;
    private DialogView c;

    public AbsDialogActivity()
    {
        c = null;
        b = com.qihoo.security.locale.d.a();
    }

    private void c()
    {
        View view = a();
        com.qihoo.security.locale.widget.LocaleTextView localetextview = c.getMessageTextView();
        android.widget.FrameLayout framelayout = c.getContentView();
        if (view != null && framelayout != null)
        {
            android.view.ViewGroup.LayoutParams layoutparams = view.getLayoutParams();
            if (layoutparams != null)
            {
                framelayout.addView(view, layoutparams);
            } else
            {
                framelayout.addView(view, d());
            }
            if (localetextview != null)
            {
                localetextview.setVisibility(8);
            }
            framelayout.setVisibility(0);
        }
    }

    private android.widget.FrameLayout.LayoutParams d()
    {
        android.widget.FrameLayout.LayoutParams layoutparams = new android.widget.FrameLayout.LayoutParams(-1, -2);
        layoutparams.gravity = 16;
        return layoutparams;
    }

    protected abstract View a();

    public void a(int i)
    {
        c.setDialogIcon(i);
    }

    protected DialogView b()
    {
        return c;
    }

    public LocaleButton[] getShownButtons()
    {
        return c.getShownButtons();
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        a = getApplicationContext();
        c = new DialogView(a);
        setContentView(c);
        c();
    }

    public transient void setButtonOnClickListener(android.view.View.OnClickListener aonclicklistener[])
    {
        c.setButtonOnClickListener(aonclicklistener);
    }

    public transient void setButtonText(int ai[])
    {
        c.setButtonText(ai);
    }

    public transient void setButtonText(CharSequence acharsequence[])
    {
        c.setButtonText(acharsequence);
    }

    public void setDialogMessage(int i)
    {
        c.setDialogMessage(i);
    }

    public void setDialogMessage(CharSequence charsequence)
    {
        c.setDialogMessage(charsequence);
    }

    public void setDialogTitle(int i)
    {
        c.setDialogTitle(i);
    }

    public void setDialogTitle(CharSequence charsequence)
    {
        c.setDialogTitle(charsequence);
    }
}
