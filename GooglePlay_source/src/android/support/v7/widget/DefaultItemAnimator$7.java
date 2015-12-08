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
    final angeInfo val$changeInfo;
    final ViewPropertyAnimatorCompat val$oldViewAnim;

    public final void onAnimationEnd(View view)
    {
        val$oldViewAnim.setListener(null);
        ViewCompat.setAlpha(view, 1.0F);
        ViewCompat.setTranslationX(view, 0.0F);
        ViewCompat.setTranslationY(view, 0.0F);
        dispatchChangeFinished$763f3adc(val$changeInfo.oldHolder);
        mChangeAnimations.remove(val$changeInfo.oldHolder);
        dispatchFinishedWhenDone();
    }

    public final void onAnimationStart(View view)
    {
    }

    at()
    {
        this$0 = final_defaultitemanimator;
        val$changeInfo = angeinfo;
        val$oldViewAnim = ViewPropertyAnimatorCompat.this;
        super((byte)0);
    }
}
