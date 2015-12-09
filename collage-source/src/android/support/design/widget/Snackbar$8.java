// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.design.widget;

import android.view.animation.Animation;

// Referenced classes of package android.support.design.widget:
//            Snackbar, SnackbarManager

class this._cls0
    implements android.view.animation.nimationListener
{

    final Snackbar this$0;

    public void onAnimationEnd(Animation animation)
    {
        if (Snackbar.access$600(Snackbar.this) != null)
        {
            Snackbar.access$600(Snackbar.this).onShown(Snackbar.this);
        }
        SnackbarManager.getInstance().onShown(Snackbar.access$200(Snackbar.this));
    }

    public void onAnimationRepeat(Animation animation)
    {
    }

    public void onAnimationStart(Animation animation)
    {
    }

    ager()
    {
        this$0 = Snackbar.this;
        super();
    }
}
