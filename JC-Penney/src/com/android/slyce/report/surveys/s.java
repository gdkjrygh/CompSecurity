// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.slyce.report.surveys;

import android.view.animation.Animation;
import android.view.animation.Transformation;

// Referenced classes of package com.android.slyce.report.surveys:
//            SurveyChoiceView, r

class s extends Animation
{

    final SurveyChoiceView a;

    private s(SurveyChoiceView surveychoiceview)
    {
        a = surveychoiceview;
        super();
    }

    s(SurveyChoiceView surveychoiceview, r r)
    {
        this(surveychoiceview);
    }

    protected void applyTransformation(float f, Transformation transformation)
    {
        float f1 = 0.0F;
        float f2 = 1.0F;
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

    public boolean willChangeBounds()
    {
        return false;
    }

    public boolean willChangeTransformationMatrix()
    {
        return false;
    }
}
