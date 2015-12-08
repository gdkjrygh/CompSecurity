// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.location;

import android.util.Pair;
import android.util.Property;
import android.view.View;
import com.skype.android.animation.SkypeMultiPropertyAnimatorSet;

public class SendLocationAnimator
{

    private final View pinView;
    private final View shadowView;

    public SendLocationAnimator(View view, View view1)
    {
        pinView = view;
        shadowView = view1;
    }

    public SkypeMultiPropertyAnimatorSet getPinDownAnimator()
    {
        SkypeMultiPropertyAnimatorSet skypemultipropertyanimatorset = new SkypeMultiPropertyAnimatorSet(pinView);
        skypemultipropertyanimatorset.a(0.0F, com.skype.android.animation.SkypeAbstractAnimatorSet.Curve.a(), new Pair[] {
            Pair.create(View.TRANSLATION_Y.getName(), Float.valueOf(-40F)), Pair.create(View.SCALE_X.getName(), Float.valueOf(1.0F)), Pair.create(View.SCALE_Y.getName(), Float.valueOf(1.0F))
        });
        skypemultipropertyanimatorset.a(0.428F, com.skype.android.animation.SkypeAbstractAnimatorSet.Curve.a(0.33F, 0.0F, 0.78F, 1.0F), new Pair[] {
            Pair.create(View.TRANSLATION_Y.getName(), Float.valueOf(-40F)), Pair.create(View.SCALE_X.getName(), Float.valueOf(0.9F)), Pair.create(View.SCALE_Y.getName(), Float.valueOf(1.1F))
        });
        skypemultipropertyanimatorset.a(0.476F, null, new Pair[] {
            Pair.create(View.TRANSLATION_Y.getName(), Float.valueOf(0.0F)), Pair.create(View.SCALE_X.getName(), Float.valueOf(1.2F)), Pair.create(View.SCALE_Y.getName(), Float.valueOf(0.8F))
        });
        skypemultipropertyanimatorset.a(1.0F, null, new Pair[] {
            Pair.create(View.TRANSLATION_Y.getName(), Float.valueOf(0.0F)), Pair.create(View.SCALE_X.getName(), Float.valueOf(1.0F)), Pair.create(View.SCALE_Y.getName(), Float.valueOf(1.0F))
        });
        return skypemultipropertyanimatorset;
    }

    public SkypeMultiPropertyAnimatorSet getPinFallingAnimator()
    {
        SkypeMultiPropertyAnimatorSet skypemultipropertyanimatorset = new SkypeMultiPropertyAnimatorSet(pinView);
        skypemultipropertyanimatorset.a(0.0F, null, new Pair[] {
            Pair.create(View.ALPHA.getName(), Float.valueOf(0.0F)), Pair.create(View.TRANSLATION_Y.getName(), Float.valueOf(-85F)), Pair.create(View.SCALE_X.getName(), Float.valueOf(1.0F)), Pair.create(View.SCALE_Y.getName(), Float.valueOf(1.0F))
        });
        skypemultipropertyanimatorset.a(0.442F, com.skype.android.animation.SkypeAbstractAnimatorSet.Curve.a(), new Pair[] {
            Pair.create(View.ALPHA.getName(), Float.valueOf(1.0F)), Pair.create(View.TRANSLATION_Y.getName(), Float.valueOf(-85F)), Pair.create(View.SCALE_X.getName(), Float.valueOf(1.0F)), Pair.create(View.SCALE_Y.getName(), Float.valueOf(1.0F))
        });
        skypemultipropertyanimatorset.a(0.642F, com.skype.android.animation.SkypeAbstractAnimatorSet.Curve.c(), new Pair[] {
            Pair.create(View.ALPHA.getName(), Float.valueOf(1.0F)), Pair.create(View.TRANSLATION_Y.getName(), Float.valueOf(-85F)), Pair.create(View.SCALE_X.getName(), Float.valueOf(1.1F)), Pair.create(View.SCALE_Y.getName(), Float.valueOf(0.9F))
        });
        skypemultipropertyanimatorset.a(0.681F, com.skype.android.animation.SkypeAbstractAnimatorSet.Curve.b(), new Pair[] {
            Pair.create(View.ALPHA.getName(), Float.valueOf(1.0F)), Pair.create(View.TRANSLATION_Y.getName(), Float.valueOf(0.0F)), Pair.create(View.SCALE_X.getName(), Float.valueOf(1.2F)), Pair.create(View.SCALE_Y.getName(), Float.valueOf(0.8F))
        });
        skypemultipropertyanimatorset.a(0.681F, null, new Pair[] {
            Pair.create(View.ALPHA.getName(), Float.valueOf(1.0F)), Pair.create(View.TRANSLATION_Y.getName(), Float.valueOf(0.0F)), Pair.create(View.SCALE_X.getName(), Float.valueOf(1.0F)), Pair.create(View.SCALE_Y.getName(), Float.valueOf(1.0F))
        });
        return skypemultipropertyanimatorset;
    }

    public SkypeMultiPropertyAnimatorSet getPinUpAnimator()
    {
        SkypeMultiPropertyAnimatorSet skypemultipropertyanimatorset = new SkypeMultiPropertyAnimatorSet(pinView);
        skypemultipropertyanimatorset.a(0.0F, com.skype.android.animation.SkypeAbstractAnimatorSet.Curve.a(), new Pair[] {
            Pair.create(View.TRANSLATION_Y.getName(), Float.valueOf(0.0F)), Pair.create(View.SCALE_X.getName(), Float.valueOf(1.0F)), Pair.create(View.SCALE_Y.getName(), Float.valueOf(1.0F))
        });
        skypemultipropertyanimatorset.a(0.428F, com.skype.android.animation.SkypeAbstractAnimatorSet.Curve.a(0.22F, 0.0F, 0.78F, 1.0F), new Pair[] {
            Pair.create(View.TRANSLATION_Y.getName(), Float.valueOf(0.0F)), Pair.create(View.SCALE_X.getName(), Float.valueOf(0.9F)), Pair.create(View.SCALE_Y.getName(), Float.valueOf(1.1F))
        });
        skypemultipropertyanimatorset.a(0.476F, com.skype.android.animation.SkypeAbstractAnimatorSet.Curve.b(), new Pair[] {
            Pair.create(View.TRANSLATION_Y.getName(), Float.valueOf(-55F)), Pair.create(View.SCALE_X.getName(), Float.valueOf(1.2F)), Pair.create(View.SCALE_Y.getName(), Float.valueOf(0.98F))
        });
        skypemultipropertyanimatorset.a(1.0F, null, new Pair[] {
            Pair.create(View.TRANSLATION_Y.getName(), Float.valueOf(-40F)), Pair.create(View.SCALE_X.getName(), Float.valueOf(1.0F)), Pair.create(View.SCALE_Y.getName(), Float.valueOf(1.0F))
        });
        return skypemultipropertyanimatorset;
    }

    public SkypeMultiPropertyAnimatorSet getShadowDownAnimator()
    {
        SkypeMultiPropertyAnimatorSet skypemultipropertyanimatorset = new SkypeMultiPropertyAnimatorSet(shadowView);
        skypemultipropertyanimatorset.a(0.0F, com.skype.android.animation.SkypeAbstractAnimatorSet.Curve.a(0.17F, 0.0F, 0.83F, 1.0F), new Pair[] {
            Pair.create(View.ALPHA.getName(), Float.valueOf(0.3F)), Pair.create(View.SCALE_X.getName(), Float.valueOf(1.0F)), Pair.create(View.SCALE_Y.getName(), Float.valueOf(1.0F))
        });
        skypemultipropertyanimatorset.a(0.666F, com.skype.android.animation.SkypeAbstractAnimatorSet.Curve.a(), new Pair[] {
            Pair.create(View.ALPHA.getName(), Float.valueOf(0.45F)), Pair.create(View.SCALE_X.getName(), Float.valueOf(1.0F)), Pair.create(View.SCALE_Y.getName(), Float.valueOf(1.0F))
        });
        skypemultipropertyanimatorset.a(1.0F, null, new Pair[] {
            Pair.create(View.ALPHA.getName(), Float.valueOf(0.0F)), Pair.create(View.SCALE_X.getName(), Float.valueOf(0.6F)), Pair.create(View.SCALE_Y.getName(), Float.valueOf(0.6F))
        });
        return skypemultipropertyanimatorset;
    }

    public SkypeMultiPropertyAnimatorSet getShadowFallingAnimator()
    {
        SkypeMultiPropertyAnimatorSet skypemultipropertyanimatorset = new SkypeMultiPropertyAnimatorSet(shadowView);
        skypemultipropertyanimatorset.a(0.0F, null, new Pair[] {
            Pair.create(View.ALPHA.getName(), Float.valueOf(0.0F)), Pair.create(View.SCALE_X.getName(), Float.valueOf(1.0F)), Pair.create(View.SCALE_Y.getName(), Float.valueOf(1.0F))
        });
        skypemultipropertyanimatorset.a(0.625F, com.skype.android.animation.SkypeAbstractAnimatorSet.Curve.a(), new Pair[] {
            Pair.create(View.ALPHA.getName(), Float.valueOf(0.2F)), Pair.create(View.SCALE_X.getName(), Float.valueOf(1.0F)), Pair.create(View.SCALE_Y.getName(), Float.valueOf(1.0F))
        });
        skypemultipropertyanimatorset.a(0.875F, com.skype.android.animation.SkypeAbstractAnimatorSet.Curve.c(), new Pair[] {
            Pair.create(View.ALPHA.getName(), Float.valueOf(0.45F)), Pair.create(View.SCALE_X.getName(), Float.valueOf(1.0F)), Pair.create(View.SCALE_Y.getName(), Float.valueOf(1.0F))
        });
        skypemultipropertyanimatorset.a(1.0F, null, new Pair[] {
            Pair.create(View.ALPHA.getName(), Float.valueOf(0.0F)), Pair.create(View.SCALE_X.getName(), Float.valueOf(0.6F)), Pair.create(View.SCALE_Y.getName(), Float.valueOf(0.6F))
        });
        return skypemultipropertyanimatorset;
    }

    public SkypeMultiPropertyAnimatorSet getShadowUpAnimator()
    {
        SkypeMultiPropertyAnimatorSet skypemultipropertyanimatorset = new SkypeMultiPropertyAnimatorSet(shadowView);
        skypemultipropertyanimatorset.a(0.0F, com.skype.android.animation.SkypeAbstractAnimatorSet.Curve.a(), new Pair[] {
            Pair.create(View.ALPHA.getName(), Float.valueOf(0.0F)), Pair.create(View.SCALE_X.getName(), Float.valueOf(0.9F)), Pair.create(View.SCALE_Y.getName(), Float.valueOf(0.9F))
        });
        skypemultipropertyanimatorset.a(0.666F, com.skype.android.animation.SkypeAbstractAnimatorSet.Curve.b(), new Pair[] {
            Pair.create(View.ALPHA.getName(), Float.valueOf(0.3F)), Pair.create(View.SCALE_X.getName(), Float.valueOf(1.3F)), Pair.create(View.SCALE_Y.getName(), Float.valueOf(1.3F))
        });
        skypemultipropertyanimatorset.a(1.0F, null, new Pair[] {
            Pair.create(View.ALPHA.getName(), Float.valueOf(0.3F)), Pair.create(View.SCALE_X.getName(), Float.valueOf(1.0F)), Pair.create(View.SCALE_Y.getName(), Float.valueOf(1.0F))
        });
        return skypemultipropertyanimatorset;
    }
}
