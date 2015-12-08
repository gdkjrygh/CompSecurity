// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.graphics.Rect;
import android.transition.Transition;

// Referenced classes of package android.support.v4.app:
//            FragmentTransitionCompat21

static final class t> extends android.transition._cls3
{

    private Rect mEpicenter;
    final icenterView val$epicenterView;

    public Rect onGetEpicenter(Transition transition)
    {
        if (mEpicenter == null && val$epicenterView.epicenter != null)
        {
            mEpicenter = FragmentTransitionCompat21.access$100(val$epicenterView.epicenter);
        }
        return mEpicenter;
    }

    icenterView(icenterView icenterview)
    {
        val$epicenterView = icenterview;
        super();
    }
}
