// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.app;

import android.support.v4.view.ViewCompat;
import android.support.v4.view.ViewPropertyAnimatorListenerAdapter;
import android.support.v7.widget.ActionBarContainer;
import android.view.View;

// Referenced classes of package android.support.v7.app:
//            WindowDecorActionBar

class stenerAdapter extends ViewPropertyAnimatorListenerAdapter
{

    final WindowDecorActionBar this$0;

    public void onAnimationEnd(View view)
    {
        if (WindowDecorActionBar.access$000(WindowDecorActionBar.this) && WindowDecorActionBar.access$100(WindowDecorActionBar.this) != null)
        {
            ViewCompat.setTranslationY(WindowDecorActionBar.access$100(WindowDecorActionBar.this), 0.0F);
            ViewCompat.setTranslationY(WindowDecorActionBar.access$200(WindowDecorActionBar.this), 0.0F);
        }
        WindowDecorActionBar.access$200(WindowDecorActionBar.this).setVisibility(8);
        WindowDecorActionBar.access$200(WindowDecorActionBar.this).setTransitioning(false);
        WindowDecorActionBar.access$302(WindowDecorActionBar.this, null);
        completeDeferredDestroyActionMode();
        if (WindowDecorActionBar.access$400(WindowDecorActionBar.this) != null)
        {
            ViewCompat.requestApplyInsets(WindowDecorActionBar.access$400(WindowDecorActionBar.this));
        }
    }

    stenerAdapter()
    {
        this$0 = WindowDecorActionBar.this;
        super();
    }
}
