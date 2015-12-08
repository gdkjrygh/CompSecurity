// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.media.effects;

import com.skype.android.media.ShaderEffect;

// Referenced classes of package com.skype.android.media.effects:
//            FaceDecoration

public final class EffectType extends Enum
{

    public static final EffectType a;
    public static final EffectType b;
    public static final EffectType c;
    public static final EffectType d;
    public static final EffectType e;
    public static final EffectType f;
    public static final EffectType g;
    public static final EffectType h;
    public static final EffectType i;
    public static final EffectType j;
    public static final EffectType k;
    public static final EffectType l;
    private static final EffectType o[];
    private ShaderEffect m;
    private FaceDecoration n;

    private EffectType(String s, int i1, ShaderEffect shadereffect)
    {
        this(s, i1, shadereffect, (byte)0);
    }

    private EffectType(String s, int i1, ShaderEffect shadereffect, byte byte0)
    {
        super(s, i1);
        m = shadereffect;
        n = null;
    }

    public static EffectType valueOf(String s)
    {
        return (EffectType)Enum.valueOf(com/skype/android/media/effects/EffectType, s);
    }

    public static EffectType[] values()
    {
        return (EffectType[])o.clone();
    }

    static 
    {
        a = new EffectType("NORMAL", 0, ShaderEffect.a);
        b = new EffectType("BALLOONS", 1, ShaderEffect.a);
        c = new EffectType("BEARS", 2, ShaderEffect.a);
        d = new EffectType("COSTUME", 3, ShaderEffect.a);
        e = new EffectType("MINECRAFT", 4, ShaderEffect.h);
        f = new EffectType("SQUEEZE", 5, ShaderEffect.j);
        g = new EffectType("BULGE", 6, ShaderEffect.k);
        h = new EffectType("XRAY", 7, ShaderEffect.f);
        i = new EffectType("POSTER", 8, ShaderEffect.i);
        j = new EffectType("SNOW", 9, ShaderEffect.c);
        k = new EffectType("MIRROR", 10, ShaderEffect.q);
        l = new EffectType("HEARTS", 11, ShaderEffect.d);
        o = (new EffectType[] {
            a, b, c, d, e, f, g, h, i, j, 
            k, l
        });
    }
}
