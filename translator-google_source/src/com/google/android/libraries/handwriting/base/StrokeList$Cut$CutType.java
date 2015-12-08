// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.handwriting.base;


public final class  extends Enum
{

    public static final EVERY_POINT BETWEEN;
    public static final EVERY_POINT CLASSIFIER;
    public static final EVERY_POINT DEPRECATED_RENDERED;
    public static final EVERY_POINT EVERY_POINT;
    public static final EVERY_POINT MAXIMUM;
    public static final EVERY_POINT MINIMUM;
    public static final EVERY_POINT MONOTONIC;
    public static final EVERY_POINT OVERWRITE;
    public static final EVERY_POINT STROKES;
    public static final EVERY_POINT VELOCITY;
    private static final EVERY_POINT a[];

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/google/android/libraries/handwriting/base/StrokeList$Cut$CutType, s);
    }

    public static [] values()
    {
        return ([])a.clone();
    }

    static 
    {
        STROKES = new <init>("STROKES", 0);
        MINIMUM = new <init>("MINIMUM", 1);
        MAXIMUM = new <init>("MAXIMUM", 2);
        BETWEEN = new <init>("BETWEEN", 3);
        VELOCITY = new <init>("VELOCITY", 4);
        DEPRECATED_RENDERED = new <init>("DEPRECATED_RENDERED", 5);
        MONOTONIC = new <init>("MONOTONIC", 6);
        OVERWRITE = new <init>("OVERWRITE", 7);
        CLASSIFIER = new <init>("CLASSIFIER", 8);
        EVERY_POINT = new <init>("EVERY_POINT", 9);
        a = (new a[] {
            STROKES, MINIMUM, MAXIMUM, BETWEEN, VELOCITY, DEPRECATED_RENDERED, MONOTONIC, OVERWRITE, CLASSIFIER, EVERY_POINT
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
