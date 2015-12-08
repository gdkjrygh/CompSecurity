// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nineoldandroids.view;

import android.view.View;
import android.view.animation.Interpolator;
import java.util.WeakHashMap;

// Referenced classes of package com.nineoldandroids.view:
//            ViewPropertyAnimatorICS, ViewPropertyAnimatorHC, ViewPropertyAnimatorPreHC

public abstract class ViewPropertyAnimator
{

    private static final WeakHashMap ANIMATORS = new WeakHashMap(0);

    public ViewPropertyAnimator()
    {
    }

    public static ViewPropertyAnimator animate(View view)
    {
        ViewPropertyAnimator viewpropertyanimator = (ViewPropertyAnimator)ANIMATORS.get(view);
        Object obj = viewpropertyanimator;
        if (viewpropertyanimator == null)
        {
            int i = Integer.valueOf(android.os.Build.VERSION.SDK).intValue();
            if (i >= 14)
            {
                obj = new ViewPropertyAnimatorICS(view);
            } else
            if (i >= 11)
            {
                obj = new ViewPropertyAnimatorHC(view);
            } else
            {
                obj = new ViewPropertyAnimatorPreHC(view);
            }
            ANIMATORS.put(view, obj);
        }
        return ((ViewPropertyAnimator) (obj));
    }

    public abstract ViewPropertyAnimator setDuration(long l);

    public abstract ViewPropertyAnimator setInterpolator(Interpolator interpolator);

    public abstract ViewPropertyAnimator translationY(float f);

}
