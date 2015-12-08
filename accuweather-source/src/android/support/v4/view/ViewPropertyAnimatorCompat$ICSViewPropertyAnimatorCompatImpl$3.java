// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.view.View;

// Referenced classes of package android.support.v4.view:
//            ViewPropertyAnimatorListener, ViewPropertyAnimatorCompat, ViewCompat

class val.currentLayerType
    implements ViewPropertyAnimatorListener
{

    final tListener this$0;
    final int val$currentLayerType;

    public void onAnimationCancel(View view)
    {
    }

    public void onAnimationEnd(View view)
    {
        ViewCompat.setLayerType(view, val$currentLayerType, null);
        tListener(view, null);
    }

    public void onAnimationStart(View view)
    {
        ViewCompat.setLayerType(view, 2, null);
    }

    ()
    {
        this$0 = final_;
        val$currentLayerType = I.this;
        super();
    }
}
