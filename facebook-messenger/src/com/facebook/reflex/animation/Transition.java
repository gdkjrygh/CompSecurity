// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.reflex.animation;

import com.facebook.reflex.Countable;

public final class Transition extends Countable
{

    private Transition(int i)
    {
        a(i);
        releaseExtraRef();
    }

    public static Transition a(double d)
    {
        return a((long)d);
    }

    public static Transition a(long l)
    {
        return new Transition(makeLinear(l));
    }

    private static native int makeCurve(long l, float f, float f1, float f2, float f3);

    private static native int makeLinear(long l);

    private static native int makeSnap();

    private static native int makeSpring(float f, float f1);

    private native void releaseExtraRef();
}
