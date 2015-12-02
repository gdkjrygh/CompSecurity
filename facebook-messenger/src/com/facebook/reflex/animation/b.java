// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.reflex.animation;


public final class b extends Enum
{

    private static final b $VALUES[];
    public static final b AnchorX;
    public static final b AnchorY;
    public static final b Opacity;
    public static final b Perspective;
    public static final b RotationX;
    public static final b RotationY;
    public static final b RotationZ;
    public static final b Scale;
    public static final b TranslateX;
    public static final b TranslateY;

    private b(String s, int i)
    {
        super(s, i);
    }

    public static b valueOf(String s)
    {
        return (b)Enum.valueOf(com/facebook/reflex/animation/b, s);
    }

    public static b[] values()
    {
        return (b[])$VALUES.clone();
    }

    static 
    {
        TranslateX = new b("TranslateX", 0);
        TranslateY = new b("TranslateY", 1);
        Scale = new b("Scale", 2);
        Opacity = new b("Opacity", 3);
        RotationX = new b("RotationX", 4);
        RotationY = new b("RotationY", 5);
        RotationZ = new b("RotationZ", 6);
        AnchorX = new b("AnchorX", 7);
        AnchorY = new b("AnchorY", 8);
        Perspective = new b("Perspective", 9);
        $VALUES = (new b[] {
            TranslateX, TranslateY, Scale, Opacity, RotationX, RotationY, RotationZ, AnchorX, AnchorY, Perspective
        });
    }
}
