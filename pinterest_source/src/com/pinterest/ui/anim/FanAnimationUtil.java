// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.ui.anim;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;
import com.pinterest.base.Device;
import com.pinterest.ui.spring.SpringInterpolator;

public class FanAnimationUtil
{

    private static final long BOTTOM_RISE_DELAY = 600L;
    private static final long BOTTOM_RISE_DISTANCE = (long)((double)Math.max(Device.getScreenHeight(), Device.getScreenWidth()) * 0.074999999999999997D);
    private static final long BOTTOM_RISE_DURATION = 750L;
    private static final long VIEW_FAN_DELAY = 350L;
    private static final long VIEW_FAN_DURATION = 800L;
    private static final long VIEW_RISE_DISTANCE = (long)((double)Math.max(Device.getScreenHeight(), Device.getScreenWidth()) * 0.074999999999999997D);
    private static final long VIEW_RISE_DURATION = 750L;

    public FanAnimationUtil()
    {
    }

    public static void animate(View view, View view1, View view2, View view3)
    {
        animate(view, view1, view2, view3, new FanUtilParams());
    }

    public static void animate(View view, View view1, View view2, View view3, FanUtilParams fanutilparams)
    {
        float f1;
        long l;
        long l1;
        FanUtilParams fanutilparams1 = fanutilparams;
        if (fanutilparams == null)
        {
            fanutilparams1 = new FanUtilParams();
        }
        Object obj1 = fanutilparams1.getMode();
        fanutilparams = fanutilparams1.getFanDistanceReference();
        Object obj2 = fanutilparams1.getLeftPivotPoint();
        Object obj3 = fanutilparams1.getRightPivotPoint();
        float f = view1.getTranslationY();
        f1 = fanutilparams1.getFanDistanceMultiplier();
        float f2 = fanutilparams1.getSpeedMultiplier();
        Object obj;
        SpringInterpolator springinterpolator;
        SpringInterpolator springinterpolator1;
        SpringInterpolator springinterpolator2;
        ObjectAnimator objectanimator;
        ObjectAnimator objectanimator1;
        long l2;
        long l3;
        long l4;
        long l5;
        long l6;
        if (obj1 == FanUtilParams.Orientation.HORIZONTAL)
        {
            obj = "translationX";
        } else
        {
            obj = "translationY";
        }
        l1 = 0L;
        l = 0L;
        if (fanutilparams1.getFanDistance() > 0L) goto _L2; else goto _L1
_L1:
        _cls1..SwitchMap.com.pinterest.ui.anim.FanAnimationUtil.FanUtilParams.ReferenceView[fanutilparams.ordinal()];
        JVM INSTR tableswitch 1 2: default 124
    //                   1 730
    //                   2 736;
           goto _L3 _L4 _L5
_L5:
        break MISSING_BLOCK_LABEL_736;
_L3:
        fanutilparams = view1;
_L6:
        if (obj1 == FanUtilParams.Orientation.HORIZONTAL)
        {
            l1 = (long)((float)(-fanutilparams.getMeasuredWidth()) * f1);
            l = (long)((float)fanutilparams.getMeasuredWidth() * f1);
        } else
        {
            l1 = (long)((float)(-fanutilparams.getMeasuredHeight()) * f1);
            l = (long)((float)fanutilparams.getMeasuredHeight() * f1);
        }
_L2:
        if (fanutilparams1.getRotation() != 0.0F)
        {
            setPivots(view, ((FanUtilParams.PivotPoint) (obj2)));
            setPivots(view2, ((FanUtilParams.PivotPoint) (obj3)));
            view.setRotation(fanutilparams1.getRotation());
            view2.setRotation(-fanutilparams1.getRotation());
        }
        l2 = (long)(350F / f2);
        l3 = (long)(600F / f2);
        l4 = (long)(750F / f2);
        l5 = (long)(800F / f2);
        l6 = (long)(750F / f2);
        f1 = fanutilparams1.getSideAlpha();
        view1.setAlpha(0.0F);
        view.setAlpha(0.0F);
        view2.setAlpha(0.0F);
        view3.setAlpha(0.0F);
        view1.setTranslationY((float)VIEW_RISE_DISTANCE + f);
        view.setTranslationY(VIEW_RISE_DISTANCE);
        view2.setTranslationY(VIEW_RISE_DISTANCE);
        view3.setTranslationY(BOTTOM_RISE_DISTANCE);
        springinterpolator = new SpringInterpolator(0.95F, 0.2F);
        springinterpolator1 = new SpringInterpolator(0.8F, 0.05F);
        springinterpolator2 = new SpringInterpolator(0.9F, 0.3F);
        fanutilparams = ObjectAnimator.ofFloat(view1, "alpha", new float[] {
            1.0F
        }).setDuration(l4 - 100L);
        obj1 = ObjectAnimator.ofFloat(view, "alpha", new float[] {
            f1
        }).setDuration(l5);
        obj2 = ObjectAnimator.ofFloat(view2, "alpha", new float[] {
            f1
        }).setDuration(l5);
        obj3 = ObjectAnimator.ofFloat(view3, "alpha", new float[] {
            1.0F
        }).setDuration(50L + l6);
        view1 = ObjectAnimator.ofFloat(view1, "translationY", new float[] {
            f
        }).setDuration(l4);
        objectanimator = ObjectAnimator.ofFloat(view, "translationY", new float[] {
            0.0F
        }).setDuration(l4);
        objectanimator1 = ObjectAnimator.ofFloat(view2, "translationY", new float[] {
            0.0F
        }).setDuration(l4);
        view3 = ObjectAnimator.ofFloat(view3, "translationY", new float[] {
            0.0F
        }).setDuration(l6);
        view = ObjectAnimator.ofFloat(view, ((String) (obj)), new float[] {
            (float)l1
        }).setDuration(l5);
        view2 = ObjectAnimator.ofFloat(view2, ((String) (obj)), new float[] {
            (float)l
        }).setDuration(l5);
        view1.setInterpolator(springinterpolator);
        objectanimator.setInterpolator(springinterpolator);
        objectanimator1.setInterpolator(springinterpolator);
        view3.setInterpolator(springinterpolator2);
        view.setInterpolator(springinterpolator1);
        view2.setInterpolator(springinterpolator1);
        ((ObjectAnimator) (obj1)).setStartDelay(l2);
        ((ObjectAnimator) (obj2)).setStartDelay(l2);
        ((ObjectAnimator) (obj3)).setStartDelay(l3);
        view.setStartDelay(l2);
        view2.setStartDelay(l2);
        view3.setStartDelay(l3);
        obj = new AnimatorSet();
        if (fanutilparams1.getListener() != null)
        {
            ((AnimatorSet) (obj)).addListener(fanutilparams1.getListener());
        }
        ((AnimatorSet) (obj)).playTogether(new Animator[] {
            fanutilparams, obj1, obj2, obj3, view1, objectanimator, objectanimator1, view3, view, view2
        });
        ((AnimatorSet) (obj)).start();
        return;
_L4:
        fanutilparams = view;
          goto _L6
        fanutilparams = view2;
          goto _L6
    }

    public static void setPivots(View view, FanUtilParams.PivotPoint pivotpoint)
    {
        switch (_cls1..SwitchMap.com.pinterest.ui.anim.FanAnimationUtil.FanUtilParams.PivotPoint[pivotpoint.ordinal()])
        {
        default:
            return;

        case 1: // '\001'
            view.setPivotX(0.0F);
            view.setPivotY(0.0F);
            return;

        case 2: // '\002'
            view.setPivotX(view.getMeasuredWidth() / 2);
            view.setPivotY(0.0F);
            return;

        case 3: // '\003'
            view.setPivotX(view.getMeasuredWidth());
            view.setPivotY(0.0F);
            return;

        case 4: // '\004'
            view.setPivotX(0.0F);
            view.setPivotY(view.getMeasuredHeight() / 2);
            return;

        case 5: // '\005'
            view.setPivotX(view.getMeasuredWidth() / 2);
            view.setPivotY(view.getMeasuredHeight() / 2);
            return;

        case 6: // '\006'
            view.setPivotX(view.getMeasuredWidth());
            view.setPivotY(view.getMeasuredHeight() / 2);
            return;

        case 7: // '\007'
            view.setPivotX(0.0F);
            view.setPivotY(view.getMeasuredHeight());
            return;

        case 8: // '\b'
            view.setPivotX(view.getMeasuredWidth() / 2);
            view.setPivotY(view.getMeasuredHeight());
            return;

        case 9: // '\t'
            view.setPivotX(view.getMeasuredWidth());
            break;
        }
        view.setPivotY(view.getMeasuredHeight());
    }


    private class FanUtilParams
    {

        private static final float DEFAULT_FAN_MULTIPLIER = 0.65F;
        private static final float DEFAULT_ROTATION = 2F;
        private static final float DEFAULT_SIDE_ALPHA = 0.7F;
        private long _fanDistance;
        private float _fanDistanceMultiplier;
        private ReferenceView _fanDistanceReference;
        private PivotPoint _leftPivotPoint;
        private com.pinterest.kit.utils.AnimationUtils.AnimationListener _listener;
        private Orientation _orientation;
        private PivotPoint _rightPivotPoint;
        private float _rotation;
        private float _sideAlpha;
        private float _speedMultiplier;

        public long getFanDistance()
        {
            return _fanDistance;
        }

        public float getFanDistanceMultiplier()
        {
            return _fanDistanceMultiplier;
        }

        public ReferenceView getFanDistanceReference()
        {
            return _fanDistanceReference;
        }

        public PivotPoint getLeftPivotPoint()
        {
            return _leftPivotPoint;
        }

        public com.pinterest.kit.utils.AnimationUtils.AnimationListener getListener()
        {
            return _listener;
        }

        public Orientation getMode()
        {
            return _orientation;
        }

        public PivotPoint getRightPivotPoint()
        {
            return _rightPivotPoint;
        }

        public float getRotation()
        {
            return _rotation;
        }

        public float getSideAlpha()
        {
            return _sideAlpha;
        }

        public float getSpeedMultiplier()
        {
            return _speedMultiplier;
        }

        public FanUtilParams setFanDistance(long l)
        {
            _fanDistance = l;
            return this;
        }

        public FanUtilParams setFanDistanceMultiplier(float f)
        {
            _fanDistanceMultiplier = f;
            return this;
        }

        public FanUtilParams setFanDistanceReference(ReferenceView referenceview)
        {
            _fanDistanceReference = referenceview;
            return this;
        }

        public FanUtilParams setLeftPivotPoint(PivotPoint pivotpoint)
        {
            _leftPivotPoint = pivotpoint;
            return this;
        }

        public FanUtilParams setListener(com.pinterest.kit.utils.AnimationUtils.AnimationListener animationlistener)
        {
            _listener = animationlistener;
            return this;
        }

        public FanUtilParams setMode(Orientation orientation)
        {
            _orientation = orientation;
            return this;
        }

        public FanUtilParams setRightPivotPoint(PivotPoint pivotpoint)
        {
            _rightPivotPoint = pivotpoint;
            return this;
        }

        public FanUtilParams setRotation(float f)
        {
            _rotation = f;
            return this;
        }

        public FanUtilParams setSideAlpha(float f)
        {
            _sideAlpha = f;
            return this;
        }

        public FanUtilParams setSpeedMultiplier(float f)
        {
            _speedMultiplier = f;
            return this;
        }

        public FanUtilParams()
        {
            _listener = new com.pinterest.kit.utils.AnimationUtils.AnimationListener();
            _fanDistance = 0L;
            _speedMultiplier = 1.0F;
            _rotation = 2.0F;
            _fanDistanceMultiplier = 0.65F;
            class Orientation extends Enum
            {

                private static final Orientation $VALUES[];
                public static final Orientation HORIZONTAL;
                public static final Orientation VERTICAL;

                public static Orientation valueOf(String s)
                {
                    return (Orientation)Enum.valueOf(com/pinterest/ui/anim/FanAnimationUtil$FanUtilParams$Orientation, s);
                }

                public static Orientation[] values()
                {
                    return (Orientation[])$VALUES.clone();
                }

                static 
                {
                    HORIZONTAL = new Orientation("HORIZONTAL", 0);
                    VERTICAL = new Orientation("VERTICAL", 1);
                    $VALUES = (new Orientation[] {
                        HORIZONTAL, VERTICAL
                    });
                }

                private Orientation(String s, int i)
                {
                    super(s, i);
                }
            }

            _orientation = Orientation.HORIZONTAL;
            _sideAlpha = 0.7F;
            class ReferenceView extends Enum
            {

                private static final ReferenceView $VALUES[];
                public static final ReferenceView CENTER;
                public static final ReferenceView LEFT;
                public static final ReferenceView RIGHT;

                public static ReferenceView valueOf(String s)
                {
                    return (ReferenceView)Enum.valueOf(com/pinterest/ui/anim/FanAnimationUtil$FanUtilParams$ReferenceView, s);
                }

                public static ReferenceView[] values()
                {
                    return (ReferenceView[])$VALUES.clone();
                }

                static 
                {
                    CENTER = new ReferenceView("CENTER", 0);
                    LEFT = new ReferenceView("LEFT", 1);
                    RIGHT = new ReferenceView("RIGHT", 2);
                    $VALUES = (new ReferenceView[] {
                        CENTER, LEFT, RIGHT
                    });
                }

                private ReferenceView(String s, int i)
                {
                    super(s, i);
                }
            }

            _fanDistanceReference = ReferenceView.CENTER;
            class PivotPoint extends Enum
            {

                private static final PivotPoint $VALUES[];
                public static final PivotPoint BOTTOM;
                public static final PivotPoint BOTTOM_LEFT;
                public static final PivotPoint BOTTOM_RIGHT;
                public static final PivotPoint CENTER;
                public static final PivotPoint LEFT;
                public static final PivotPoint NONE;
                public static final PivotPoint RIGHT;
                public static final PivotPoint TOP;
                public static final PivotPoint TOP_LEFT;
                public static final PivotPoint TOP_RIGHT;

                public static PivotPoint valueOf(String s)
                {
                    return (PivotPoint)Enum.valueOf(com/pinterest/ui/anim/FanAnimationUtil$FanUtilParams$PivotPoint, s);
                }

                public static PivotPoint[] values()
                {
                    return (PivotPoint[])$VALUES.clone();
                }

                static 
                {
                    NONE = new PivotPoint("NONE", 0);
                    CENTER = new PivotPoint("CENTER", 1);
                    TOP_LEFT = new PivotPoint("TOP_LEFT", 2);
                    TOP = new PivotPoint("TOP", 3);
                    TOP_RIGHT = new PivotPoint("TOP_RIGHT", 4);
                    LEFT = new PivotPoint("LEFT", 5);
                    RIGHT = new PivotPoint("RIGHT", 6);
                    BOTTOM_LEFT = new PivotPoint("BOTTOM_LEFT", 7);
                    BOTTOM_RIGHT = new PivotPoint("BOTTOM_RIGHT", 8);
                    BOTTOM = new PivotPoint("BOTTOM", 9);
                    $VALUES = (new PivotPoint[] {
                        NONE, CENTER, TOP_LEFT, TOP, TOP_RIGHT, LEFT, RIGHT, BOTTOM_LEFT, BOTTOM_RIGHT, BOTTOM
                    });
                }

                private PivotPoint(String s, int i)
                {
                    super(s, i);
                }
            }

            _leftPivotPoint = PivotPoint.NONE;
            _rightPivotPoint = PivotPoint.NONE;
        }

        public FanUtilParams(FanUtilParams fanutilparams)
        {
            _listener = fanutilparams.getListener();
            _fanDistance = fanutilparams.getFanDistance();
            _speedMultiplier = fanutilparams.getSpeedMultiplier();
            _rotation = fanutilparams.getRotation();
            _fanDistanceMultiplier = fanutilparams.getFanDistanceMultiplier();
            _orientation = fanutilparams.getMode();
            _sideAlpha = fanutilparams.getSideAlpha();
            _fanDistanceReference = fanutilparams.getFanDistanceReference();
            _leftPivotPoint = fanutilparams.getLeftPivotPoint();
            _rightPivotPoint = fanutilparams.getRightPivotPoint();
        }
    }


    private class _cls1
    {

        static final int $SwitchMap$com$pinterest$ui$anim$FanAnimationUtil$FanUtilParams$PivotPoint[];
        static final int $SwitchMap$com$pinterest$ui$anim$FanAnimationUtil$FanUtilParams$ReferenceView[];

        static 
        {
            $SwitchMap$com$pinterest$ui$anim$FanAnimationUtil$FanUtilParams$PivotPoint = new int[FanUtilParams.PivotPoint.values().length];
            try
            {
                $SwitchMap$com$pinterest$ui$anim$FanAnimationUtil$FanUtilParams$PivotPoint[FanUtilParams.PivotPoint.TOP_LEFT.ordinal()] = 1;
            }
            catch (NoSuchFieldError nosuchfielderror12) { }
            try
            {
                $SwitchMap$com$pinterest$ui$anim$FanAnimationUtil$FanUtilParams$PivotPoint[FanUtilParams.PivotPoint.TOP.ordinal()] = 2;
            }
            catch (NoSuchFieldError nosuchfielderror11) { }
            try
            {
                $SwitchMap$com$pinterest$ui$anim$FanAnimationUtil$FanUtilParams$PivotPoint[FanUtilParams.PivotPoint.TOP_RIGHT.ordinal()] = 3;
            }
            catch (NoSuchFieldError nosuchfielderror10) { }
            try
            {
                $SwitchMap$com$pinterest$ui$anim$FanAnimationUtil$FanUtilParams$PivotPoint[FanUtilParams.PivotPoint.LEFT.ordinal()] = 4;
            }
            catch (NoSuchFieldError nosuchfielderror9) { }
            try
            {
                $SwitchMap$com$pinterest$ui$anim$FanAnimationUtil$FanUtilParams$PivotPoint[FanUtilParams.PivotPoint.CENTER.ordinal()] = 5;
            }
            catch (NoSuchFieldError nosuchfielderror8) { }
            try
            {
                $SwitchMap$com$pinterest$ui$anim$FanAnimationUtil$FanUtilParams$PivotPoint[FanUtilParams.PivotPoint.RIGHT.ordinal()] = 6;
            }
            catch (NoSuchFieldError nosuchfielderror7) { }
            try
            {
                $SwitchMap$com$pinterest$ui$anim$FanAnimationUtil$FanUtilParams$PivotPoint[FanUtilParams.PivotPoint.BOTTOM_LEFT.ordinal()] = 7;
            }
            catch (NoSuchFieldError nosuchfielderror6) { }
            try
            {
                $SwitchMap$com$pinterest$ui$anim$FanAnimationUtil$FanUtilParams$PivotPoint[FanUtilParams.PivotPoint.BOTTOM.ordinal()] = 8;
            }
            catch (NoSuchFieldError nosuchfielderror5) { }
            try
            {
                $SwitchMap$com$pinterest$ui$anim$FanAnimationUtil$FanUtilParams$PivotPoint[FanUtilParams.PivotPoint.BOTTOM_RIGHT.ordinal()] = 9;
            }
            catch (NoSuchFieldError nosuchfielderror4) { }
            try
            {
                $SwitchMap$com$pinterest$ui$anim$FanAnimationUtil$FanUtilParams$PivotPoint[FanUtilParams.PivotPoint.NONE.ordinal()] = 10;
            }
            catch (NoSuchFieldError nosuchfielderror3) { }
            $SwitchMap$com$pinterest$ui$anim$FanAnimationUtil$FanUtilParams$ReferenceView = new int[FanUtilParams.ReferenceView.values().length];
            try
            {
                $SwitchMap$com$pinterest$ui$anim$FanAnimationUtil$FanUtilParams$ReferenceView[FanUtilParams.ReferenceView.LEFT.ordinal()] = 1;
            }
            catch (NoSuchFieldError nosuchfielderror2) { }
            try
            {
                $SwitchMap$com$pinterest$ui$anim$FanAnimationUtil$FanUtilParams$ReferenceView[FanUtilParams.ReferenceView.RIGHT.ordinal()] = 2;
            }
            catch (NoSuchFieldError nosuchfielderror1) { }
            try
            {
                $SwitchMap$com$pinterest$ui$anim$FanAnimationUtil$FanUtilParams$ReferenceView[FanUtilParams.ReferenceView.CENTER.ordinal()] = 3;
            }
            catch (NoSuchFieldError nosuchfielderror)
            {
                return;
            }
        }
    }

}
