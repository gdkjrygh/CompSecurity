// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.handwriting.base;


public final class d
{

    public final int a;
    public final int b;
    public final float c;
    public final CutType d;

    public CutType(int i, int j)
    {
        a = i;
        b = j;
        c = 0.0F;
        class CutType extends Enum
        {

            public static final CutType BETWEEN;
            public static final CutType CLASSIFIER;
            public static final CutType DEPRECATED_RENDERED;
            public static final CutType EVERY_POINT;
            public static final CutType MAXIMUM;
            public static final CutType MINIMUM;
            public static final CutType MONOTONIC;
            public static final CutType OVERWRITE;
            public static final CutType STROKES;
            public static final CutType VELOCITY;
            private static final CutType a[];

            public static CutType valueOf(String s)
            {
                return (CutType)Enum.valueOf(com/google/android/libraries/handwriting/base/StrokeList$Cut$CutType, s);
            }

            public static CutType[] values()
            {
                return (CutType[])a.clone();
            }

            static 
            {
                STROKES = new CutType("STROKES", 0);
                MINIMUM = new CutType("MINIMUM", 1);
                MAXIMUM = new CutType("MAXIMUM", 2);
                BETWEEN = new CutType("BETWEEN", 3);
                VELOCITY = new CutType("VELOCITY", 4);
                DEPRECATED_RENDERED = new CutType("DEPRECATED_RENDERED", 5);
                MONOTONIC = new CutType("MONOTONIC", 6);
                OVERWRITE = new CutType("OVERWRITE", 7);
                CLASSIFIER = new CutType("CLASSIFIER", 8);
                EVERY_POINT = new CutType("EVERY_POINT", 9);
                a = (new CutType[] {
                    STROKES, MINIMUM, MAXIMUM, BETWEEN, VELOCITY, DEPRECATED_RENDERED, MONOTONIC, OVERWRITE, CLASSIFIER, EVERY_POINT
                });
            }

            private CutType(String s, int i)
            {
                super(s, i);
            }
        }

        d = CutType.STROKES;
    }

    public CutType(int i, int j, float f, CutType cuttype)
    {
        a = i;
        b = j;
        c = f;
        d = cuttype;
    }
}
