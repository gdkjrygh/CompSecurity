// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.ui.anim;


public class getRightPivotPoint
{

    private static final float DEFAULT_FAN_MULTIPLIER = 0.65F;
    private static final float DEFAULT_ROTATION = 2F;
    private static final float DEFAULT_SIDE_ALPHA = 0.7F;
    private long _fanDistance;
    private float _fanDistanceMultiplier;
    private ReferenceView _fanDistanceReference;
    private PivotPoint _leftPivotPoint;
    private com.pinterest.kit.utils.r _listener;
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

    public com.pinterest.kit.utils.r getListener()
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

    public _speedMultiplier setFanDistance(long l)
    {
        _fanDistance = l;
        return this;
    }

    public _fanDistance setFanDistanceMultiplier(float f)
    {
        _fanDistanceMultiplier = f;
        return this;
    }

    public ReferenceView setFanDistanceReference(ReferenceView referenceview)
    {
        _fanDistanceReference = referenceview;
        return this;
    }

    public PivotPoint setLeftPivotPoint(PivotPoint pivotpoint)
    {
        _leftPivotPoint = pivotpoint;
        return this;
    }

    public ner setListener(com.pinterest.kit.utils.r r)
    {
        _listener = r;
        return this;
    }

    public Orientation setMode(Orientation orientation)
    {
        _orientation = orientation;
        return this;
    }

    public PivotPoint setRightPivotPoint(PivotPoint pivotpoint)
    {
        _rightPivotPoint = pivotpoint;
        return this;
    }

    public _rightPivotPoint setRotation(float f)
    {
        _rotation = f;
        return this;
    }

    public _rotation setSideAlpha(float f)
    {
        _sideAlpha = f;
        return this;
    }

    public _sideAlpha setSpeedMultiplier(float f)
    {
        _speedMultiplier = f;
        return this;
    }

    public PivotPoint()
    {
        _listener = new com.pinterest.kit.utils.r();
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

    public PivotPoint.NONE(PivotPoint.NONE none)
    {
        _listener = none.getListener();
        _fanDistance = none.getFanDistance();
        _speedMultiplier = none.getSpeedMultiplier();
        _rotation = none.getRotation();
        _fanDistanceMultiplier = none.getFanDistanceMultiplier();
        _orientation = none.getMode();
        _sideAlpha = none.getSideAlpha();
        _fanDistanceReference = none.getFanDistanceReference();
        _leftPivotPoint = none.getLeftPivotPoint();
        _rightPivotPoint = none.getRightPivotPoint();
    }
}
