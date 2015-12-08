// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xwalk.core.internal.extension.api.presentation;

import android.content.Context;
import android.view.Display;
import android.view.View;

// Referenced classes of package org.xwalk.core.internal.extension.api.presentation:
//            PresentationViewJBMR1, PresentationViewNull

public abstract class PresentationView
{
    public static interface PresentationListener
    {

        public abstract void onDismiss(PresentationView presentationview);

        public abstract void onShow(PresentationView presentationview);
    }


    protected PresentationListener mListener;

    public PresentationView()
    {
    }

    public static PresentationView createInstance(Context context, Display display)
    {
        if (android.os.Build.VERSION.SDK_INT >= 17)
        {
            return new PresentationViewJBMR1(context, display);
        } else
        {
            return new PresentationViewNull();
        }
    }

    public abstract void cancel();

    public abstract void dismiss();

    public abstract Display getDisplay();

    public abstract void setContentView(View view);

    public void setPresentationListener(PresentationListener presentationlistener)
    {
        mListener = presentationlistener;
    }

    public abstract void show();
}
