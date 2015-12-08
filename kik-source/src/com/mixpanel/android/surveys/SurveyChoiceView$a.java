// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mixpanel.android.surveys;

import android.view.animation.Animation;
import android.view.animation.Transformation;

// Referenced classes of package com.mixpanel.android.surveys:
//            SurveyChoiceView

private final class <init> extends Animation
{

    final SurveyChoiceView a;

    protected final void applyTransformation(float f, Transformation transformation)
    {
        float f2 = 1.0F;
        float f1 = 0.0F;
        if (f <= 0.5F)
        {
            f1 = f - 0.5F;
            f = f2;
        } else
        {
            f = 1.0F + (f - 0.5F) * 2.0F;
        }
        SurveyChoiceView.a(a, f1);
        SurveyChoiceView.b(a, f);
        a.requestLayout();
    }

    public final boolean willChangeBounds()
    {
        return false;
    }

    public final boolean willChangeTransformationMatrix()
    {
        return false;
    }

    private (SurveyChoiceView surveychoiceview)
    {
        a = surveychoiceview;
        super();
    }

    a(SurveyChoiceView surveychoiceview, byte byte0)
    {
        this(surveychoiceview);
    }
}
