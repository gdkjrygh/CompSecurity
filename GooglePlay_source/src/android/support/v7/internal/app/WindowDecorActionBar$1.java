// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.app;

import android.support.v4.view.ViewCompat;
import android.support.v4.view.ViewPropertyAnimatorListenerAdapter;
import android.support.v7.internal.widget.ActionBarContainer;
import android.view.View;

// Referenced classes of package android.support.v7.internal.app:
//            WindowDecorActionBar

final class pter extends ViewPropertyAnimatorListenerAdapter
{

    final WindowDecorActionBar this$0;

    public final void onAnimationEnd(View view)
    {
        if (WindowDecorActionBar.access$000(WindowDecorActionBar.this) && WindowDecorActionBar.access$100(WindowDecorActionBar.this) != null)
        {
            ViewCompat.setTranslationY(WindowDecorActionBar.access$100(WindowDecorActionBar.this), 0.0F);
            ViewCompat.setTranslationY(WindowDecorActionBar.access$200(WindowDecorActionBar.this), 0.0F);
        }
        if (WindowDecorActionBar.access$300(WindowDecorActionBar.this) != null && WindowDecorActionBar.access$400(WindowDecorActionBar.this) == 1)
        {
            WindowDecorActionBar.access$300(WindowDecorActionBar.this).setVisibility(8);
        }
        WindowDecorActionBar.access$200(WindowDecorActionBar.this).setVisibility(8);
        WindowDecorActionBar.access$200(WindowDecorActionBar.this).setTransitioning(false);
        android.support.v7.internal.view.ViewPropertyAnimatorCompatSet _tmp = WindowDecorActionBar.access$502$906f40c(WindowDecorActionBar.this);
        view = WindowDecorActionBar.this;
        if (((WindowDecorActionBar) (view)).mDeferredModeDestroyCallback != null)
        {
            ((WindowDecorActionBar) (view)).mDeferredModeDestroyCallback.estroyActionMode(((WindowDecorActionBar) (view)).mDeferredDestroyActionMode);
            view.mDeferredDestroyActionMode = null;
            view.mDeferredModeDestroyCallback = null;
        }
        if (WindowDecorActionBar.access$600(WindowDecorActionBar.this) != null)
        {
            ViewCompat.requestApplyInsets(WindowDecorActionBar.access$600(WindowDecorActionBar.this));
        }
    }

    pter()
    {
        this$0 = WindowDecorActionBar.this;
        super();
    }
}
