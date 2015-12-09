// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.app;

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
        android.support.v7.internal.view.ViewPropertyAnimatorCompatSet _tmp = WindowDecorActionBar.access$502$906f40c(WindowDecorActionBar.this);
        WindowDecorActionBar.access$200(WindowDecorActionBar.this).requestLayout();
    }

    pter()
    {
        this$0 = WindowDecorActionBar.this;
        super();
    }
}
