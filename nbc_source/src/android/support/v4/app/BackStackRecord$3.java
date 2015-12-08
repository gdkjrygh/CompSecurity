// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.view.View;
import android.view.ViewTreeObserver;

// Referenced classes of package android.support.v4.app:
//            BackStackRecord

class val.transition
    implements android.view.nPreDrawListener
{

    final BackStackRecord this$0;
    final int val$containerId;
    final View val$sceneRoot;
    final ansitionState val$state;
    final Object val$transition;

    public boolean onPreDraw()
    {
        val$sceneRoot.getViewTreeObserver().removeOnPreDrawListener(this);
        BackStackRecord.access$300(BackStackRecord.this, val$state, val$containerId, val$transition);
        return true;
    }

    ansitionState()
    {
        this$0 = final_backstackrecord;
        val$sceneRoot = view;
        val$state = ansitionstate;
        val$containerId = i;
        val$transition = Object.this;
        super();
    }
}
