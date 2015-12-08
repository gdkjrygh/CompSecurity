// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.support.v4.view.ViewCompat;
import android.support.v4.view.ViewPropertyAnimatorCompat;
import android.view.View;
import java.util.ArrayList;

// Referenced classes of package android.support.v7.widget:
//            DefaultItemAnimator

final class aListenerAdapter extends aListenerAdapter
{

    final DefaultItemAnimator this$0;
    final ViewPropertyAnimatorCompat val$animation;
    final r val$holder;

    public final void onAnimationEnd(View view)
    {
        val$animation.setListener(null);
        ViewCompat.setAlpha(view, 1.0F);
        dispatchRemoveFinished(val$holder);
        mRemoveAnimations.remove(val$holder);
        dispatchFinishedWhenDone();
    }

    public final void onAnimationStart(View view)
    {
    }

    at()
    {
        this$0 = final_defaultitemanimator;
        val$holder = r;
        val$animation = ViewPropertyAnimatorCompat.this;
        super((byte)0);
    }
}
