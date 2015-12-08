// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.transition;

import android.animation.ObjectAnimator;
import android.graphics.Outline;
import android.util.Property;
import android.view.View;
import android.view.ViewOutlineProvider;

// Referenced classes of package com.google.android.gms.games.ui.transition:
//            SharedElementCircularCrunch

private final class this._cls0 extends Property
{

    ObjectAnimator mAnim;
    final SharedElementCircularCrunch this$0;

    public final volatile Object get(Object obj)
    {
        return null;
    }

    public final volatile void set(Object obj, Object obj1)
    {
        obj = (View)obj;
        obj1 = (Integer)obj1;
        if (((View) (obj)).getAlpha() == 0.0F)
        {
            ((View) (obj)).setAlpha(1.0F);
        }
        float f1 = mAnim.getAnimatedFraction();
        float f = f1;
        if (SharedElementCircularCrunch.access$000(SharedElementCircularCrunch.this))
        {
            f = 1.0F - f1;
        }
        ((View) (obj)).setOutlineProvider(new ViewOutlineProvider() {

            final SharedElementCircularCrunch.OutlineProperty this$1;
            final float val$radius;

            public final void getOutline(View view, Outline outline)
            {
                outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), (int)radius);
            }

            
            {
                this$1 = SharedElementCircularCrunch.OutlineProperty.this;
                radius = f;
                super();
            }
        });
        ((View) (obj)).setClipToOutline(true);
        ((View) (obj)).invalidate();
    }

    public _cls1.val.radius(String s)
    {
        this$0 = SharedElementCircularCrunch.this;
        super(java/lang/Integer, s);
    }
}
