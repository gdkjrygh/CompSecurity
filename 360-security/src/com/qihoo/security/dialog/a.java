// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.dialog;

import android.app.Dialog;
import android.content.Context;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import com.qihoo.security.locale.d;
import com.qihoo.security.locale.widget.LocaleButton;

// Referenced classes of package com.qihoo.security.dialog:
//            d, DialogView, f

public abstract class a extends Dialog
    implements com.qihoo.security.dialog.d
{

    public d a;
    private f b;

    public a(Context context)
    {
        super(context, 0x7f0d00f5);
        b = null;
        a = d.a();
        a.d();
        b = new DialogView(context);
        setContentView((View)b);
        c();
    }

    private void c()
    {
        View view = a();
        com.qihoo.security.locale.widget.LocaleTextView localetextview = b.getMessageTextView();
        android.widget.FrameLayout framelayout = b.getContentView();
        if (view != null && framelayout != null)
        {
            framelayout.addView(view);
            if (localetextview != null)
            {
                localetextview.setVisibility(8);
            }
            framelayout.setVisibility(0);
        }
    }

    protected abstract View a();

    public f b()
    {
        return b;
    }

    public void dismiss()
    {
        if (!isShowing())
        {
            break MISSING_BLOCK_LABEL_11;
        }
        super.dismiss();
        return;
        Exception exception;
        exception;
    }

    public LocaleButton[] getShownButtons()
    {
        return b.getShownButtons();
    }

    public transient void setButtonOnClickListener(android.view.View.OnClickListener aonclicklistener[])
    {
        b.setButtonOnClickListener(aonclicklistener);
    }

    public transient void setButtonText(int ai[])
    {
        b.setButtonText(ai);
    }

    public transient void setButtonText(CharSequence acharsequence[])
    {
        b.setButtonText(acharsequence);
    }

    public void setDialogMessage(int i)
    {
        b.setDialogMessage(i);
    }

    public void setDialogMessage(CharSequence charsequence)
    {
        b.setDialogMessage(charsequence);
    }

    public void setDialogTitle(int i)
    {
        b.setDialogTitle(i);
    }

    public void setDialogTitle(CharSequence charsequence)
    {
        b.setDialogTitle(charsequence);
    }

    public void show()
    {
        try
        {
            super.show();
            return;
        }
        catch (Exception exception)
        {
            Log.e("AbsDialog", "", exception);
        }
    }
}
