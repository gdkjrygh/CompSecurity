// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.ui.interpolators;

import android.view.animation.Interpolator;

public class BakedBezierInterpolator
    implements Interpolator
{

    public static final BakedBezierInterpolator FADE_IN_CURVE = new BakedBezierInterpolator(FADE_IN_VALUES);
    private static final float FADE_IN_VALUES[] = {
        0.0029F, 0.043F, 0.0785F, 0.1147F, 0.1476F, 0.1742F, 0.2024F, 0.2319F, 0.2575F, 0.2786F, 
        0.3055F, 0.3274F, 0.3498F, 0.3695F, 0.3895F, 0.4096F, 0.4299F, 0.4474F, 0.4649F, 0.4824F, 
        0.5F, 0.5176F, 0.5322F, 0.5468F, 0.5643F, 0.5788F, 0.5918F, 0.6048F, 0.6191F, 0.6333F, 
        0.6446F, 0.6573F, 0.6698F, 0.6808F, 0.6918F, 0.704F, 0.7148F, 0.7254F, 0.7346F, 0.7451F, 
        0.7554F, 0.7655F, 0.7731F, 0.783F, 0.7916F, 0.8F, 0.8084F, 0.8166F, 0.8235F, 0.8315F, 
        0.8393F, 0.8459F, 0.8535F, 0.8599F, 0.8672F, 0.8733F, 0.8794F, 0.8853F, 0.8911F, 0.8967F, 
        0.9023F, 0.9077F, 0.9121F, 0.9173F, 0.9224F, 0.9265F, 0.9313F, 0.9352F, 0.9397F, 0.9434F, 
        0.9476F, 0.9511F, 0.9544F, 0.9577F, 0.9614F, 0.9644F, 0.9673F, 0.9701F, 0.9727F, 0.9753F, 
        0.9777F, 0.98F, 0.9818F, 0.9839F, 0.9859F, 0.9877F, 0.9891F, 0.9907F, 0.9922F, 0.9933F, 
        0.9946F, 0.9957F, 0.9966F, 0.9974F, 0.9981F, 0.9986F, 0.9992F, 0.9995F, 0.9998F, 1.0F, 
        1.0F
    };
    public static final BakedBezierInterpolator FADE_OUT_CURVE = new BakedBezierInterpolator(FADE_OUT_VALUES);
    private static final float FADE_OUT_VALUES[] = {
        0.0F, 0.0002F, 0.0008F, 0.0019F, 0.0032F, 0.0049F, 0.0069F, 0.0093F, 0.0119F, 0.0149F, 
        0.0182F, 0.0218F, 0.0257F, 0.0299F, 0.0344F, 0.0392F, 0.0443F, 0.0496F, 0.0552F, 0.0603F, 
        0.0656F, 0.0719F, 0.0785F, 0.0853F, 0.0923F, 0.0986F, 0.1051F, 0.1128F, 0.1206F, 0.1287F, 
        0.1359F, 0.1433F, 0.1519F, 0.1607F, 0.1696F, 0.1776F, 0.1857F, 0.1952F, 0.2048F, 0.2145F, 
        0.2232F, 0.2319F, 0.2421F, 0.2523F, 0.2627F, 0.2733F, 0.2826F, 0.2919F, 0.3027F, 0.3137F, 
        0.3247F, 0.3358F, 0.3469F, 0.3582F, 0.3695F, 0.3809F, 0.3924F, 0.4039F, 0.4154F, 0.427F, 
        0.4386F, 0.4503F, 0.4619F, 0.4751F, 0.4883F, 0.5F, 0.5117F, 0.5264F, 0.5381F, 0.5497F, 
        0.5643F, 0.5759F, 0.5904F, 0.6033F, 0.6162F, 0.6305F, 0.6446F, 0.6587F, 0.6698F, 0.6836F, 
        0.7F, 0.7134F, 0.7267F, 0.7425F, 0.7554F, 0.7706F, 0.7855F, 0.8F, 0.8143F, 0.8281F, 
        0.8438F, 0.8588F, 0.8733F, 0.8892F, 0.9041F, 0.9215F, 0.9344F, 0.9518F, 0.9667F, 0.9826F, 
        0.9993F
    };
    public static final BakedBezierInterpolator TRANSFORM_CURVE = new BakedBezierInterpolator(TRANSFORM_VALUES);
    public static final BakedBezierInterpolator TRANSFORM_FOLLOW_THROUGH_CURVE = new BakedBezierInterpolator(TRANSFORM_FOLLOW_THROUGH_VALUES);
    private static final float TRANSFORM_FOLLOW_THROUGH_VALUES[] = {
        0.0767F, 0.315F, 0.4173F, 0.484F, 0.5396F, 0.5801F, 0.6129F, 0.644F, 0.6687F, 0.6876F, 
        0.7102F, 0.7276F, 0.7443F, 0.7583F, 0.7718F, 0.7849F, 0.7975F, 0.8079F, 0.8179F, 0.8276F, 
        0.8355F, 0.8446F, 0.8519F, 0.859F, 0.8659F, 0.8726F, 0.8791F, 0.8841F, 0.8902F, 0.8949F, 
        0.9001F, 0.9051F, 0.9094F, 0.9136F, 0.9177F, 0.9217F, 0.925F, 0.9283F, 0.9319F, 0.9355F, 
        0.938F, 0.9413F, 0.9437F, 0.9469F, 0.9491F, 0.9517F, 0.9539F, 0.9563F, 0.9583F, 0.9603F, 
        0.9622F, 0.9643F, 0.9661F, 0.9679F, 0.9693F, 0.9709F, 0.9725F, 0.974F, 0.9753F, 0.9767F, 
        0.9779F, 0.9792F, 0.9803F, 0.9816F, 0.9826F, 0.9835F, 0.9845F, 0.9854F, 0.9863F, 0.9872F, 
        0.988F, 0.9888F, 0.9895F, 0.9903F, 0.991F, 0.9917F, 0.9922F, 0.9928F, 0.9934F, 0.9939F, 
        0.9944F, 0.9948F, 0.9953F, 0.9957F, 0.9962F, 0.9965F, 0.9969F, 0.9972F, 0.9975F, 0.9978F, 
        0.9981F, 0.9984F, 0.9986F, 0.9989F, 0.9991F, 0.9992F, 0.9994F, 0.9996F, 0.9997F, 0.9999F, 
        1.0F
    };
    private static final float TRANSFORM_VALUES[] = {
        0.0F, 0.0002F, 0.0009F, 0.0019F, 0.0036F, 0.0059F, 0.0086F, 0.0119F, 0.0157F, 0.0209F, 
        0.0257F, 0.0321F, 0.0392F, 0.0469F, 0.0566F, 0.0656F, 0.0768F, 0.0887F, 0.1033F, 0.1186F, 
        0.1349F, 0.1519F, 0.1696F, 0.1928F, 0.2121F, 0.237F, 0.2627F, 0.2892F, 0.3109F, 0.3386F, 
        0.3667F, 0.3952F, 0.4241F, 0.4474F, 0.4766F, 0.5F, 0.5234F, 0.5468F, 0.5701F, 0.5933F, 
        0.6134F, 0.6333F, 0.6531F, 0.6698F, 0.6891F, 0.7054F, 0.7214F, 0.7346F, 0.7502F, 0.763F, 
        0.7756F, 0.7879F, 0.8F, 0.8107F, 0.8212F, 0.8326F, 0.8415F, 0.8503F, 0.8588F, 0.8672F, 
        0.8754F, 0.8833F, 0.8911F, 0.8977F, 0.9041F, 0.9113F, 0.9165F, 0.9232F, 0.9281F, 0.9328F, 
        0.9382F, 0.9434F, 0.9476F, 0.9518F, 0.9557F, 0.9596F, 0.9632F, 0.9662F, 0.9695F, 0.9722F, 
        0.9753F, 0.9777F, 0.9805F, 0.9826F, 0.9847F, 0.9866F, 0.9884F, 0.9901F, 0.9917F, 0.9931F, 
        0.9944F, 0.9955F, 0.9964F, 0.9973F, 0.9981F, 0.9986F, 0.9992F, 0.9995F, 0.9998F, 1.0F, 
        1.0F
    };
    private final float mStepSize;
    private final float mValues[];

    private BakedBezierInterpolator(float af[])
    {
        mValues = af;
        mStepSize = 1.0F / (float)(mValues.length - 1);
    }

    public float getInterpolation(float f)
    {
        if (f >= 1.0F)
        {
            return 1.0F;
        }
        if (f <= 0.0F)
        {
            return 0.0F;
        } else
        {
            int i = Math.min((int)((float)(mValues.length - 1) * f), mValues.length - 2);
            f = (f - (float)i * mStepSize) / mStepSize;
            return mValues[i] + (mValues[i + 1] - mValues[i]) * f;
        }
    }

}
