// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xwalk.core.internal.extension.api.presentation;

import android.app.Presentation;
import android.content.Context;
import android.content.DialogInterface;
import android.view.Display;
import android.view.View;

// Referenced classes of package org.xwalk.core.internal.extension.api.presentation:
//            PresentationView

public class PresentationViewJBMR1 extends PresentationView
    implements android.content.DialogInterface.OnShowListener, android.content.DialogInterface.OnDismissListener
{

    private Presentation mPresentation;

    public PresentationViewJBMR1(Context context, Display display)
    {
        mPresentation = new Presentation(context, display);
    }

    public void cancel()
    {
        mPresentation.cancel();
    }

    public void dismiss()
    {
        mPresentation.dismiss();
    }

    public Display getDisplay()
    {
        return mPresentation.getDisplay();
    }

    public void onDismiss(DialogInterface dialoginterface)
    {
        if (mListener != null)
        {
            mListener.onDismiss(this);
        }
    }

    public void onShow(DialogInterface dialoginterface)
    {
        if (mListener != null)
        {
            mListener.onShow(this);
        }
    }

    public void setContentView(View view)
    {
        mPresentation.setContentView(view);
    }

    public void setPresentationListener(PresentationView.PresentationListener presentationlistener)
    {
        super.setPresentationListener(presentationlistener);
        if (mListener != null)
        {
            mPresentation.setOnShowListener(this);
            mPresentation.setOnDismissListener(this);
            return;
        } else
        {
            mPresentation.setOnShowListener(null);
            mPresentation.setOnDismissListener(null);
            return;
        }
    }

    public void show()
    {
        mPresentation.show();
    }
}
