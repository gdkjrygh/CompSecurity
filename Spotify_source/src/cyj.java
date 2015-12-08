// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.animation.Animation;
import android.view.animation.Transformation;
import com.mixpanel.android.surveys.SurveyChoiceView;

public final class cyj extends Animation
{

    private SurveyChoiceView a;

    private cyj(SurveyChoiceView surveychoiceview)
    {
        a = surveychoiceview;
        super();
    }

    public cyj(SurveyChoiceView surveychoiceview, byte byte0)
    {
        this(surveychoiceview);
    }

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
}
