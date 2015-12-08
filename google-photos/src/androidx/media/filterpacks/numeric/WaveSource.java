// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package androidx.media.filterpacks.numeric;

import ahn;
import ahs;
import aif;
import aig;
import ajo;
import ajr;
import aju;
import ajw;
import android.os.SystemClock;

public final class WaveSource extends ahn
{

    public static final int WAVESOURCE_CONST = 0;
    public static final int WAVESOURCE_COS = 2;
    public static final int WAVESOURCE_SAWTOOTH = 3;
    public static final int WAVESOURCE_SIN = 1;
    private float mAmplitude;
    private int mMode;
    private float mSpeed;
    private float mXOffset;
    private float mYOffset;

    public WaveSource(ajr ajr, String s)
    {
        super(ajr, s);
        mSpeed = 0.01F;
        mAmplitude = 1.0F;
        mXOffset = 0.0F;
        mYOffset = 0.0F;
        mMode = 1;
    }

    public final ajw b()
    {
        return (new ajw()).a("speed", 1, aif.a(Float.TYPE)).a("amplitude", 1, aif.a(Float.TYPE)).a("xOffset", 1, aif.a(Float.TYPE)).a("yOffset", 1, aif.a(Float.TYPE)).a("mode", 1, aif.a(Integer.TYPE)).b("value", 2, aif.b()).a();
    }

    public final void b(ajo ajo1)
    {
        if (ajo1.b.equals("speed"))
        {
            ajo1.a("mSpeed");
            ajo1.g = true;
        } else
        {
            if (ajo1.b.equals("amplitude"))
            {
                ajo1.a("mAmplitude");
                ajo1.g = true;
                return;
            }
            if (ajo1.b.equals("xOffset"))
            {
                ajo1.a("mXOffset");
                ajo1.g = true;
                return;
            }
            if (ajo1.b.equals("yOffset"))
            {
                ajo1.a("mYOffset");
                ajo1.g = true;
                return;
            }
            if (ajo1.b.equals("mode"))
            {
                ajo1.a("mMode");
                ajo1.g = true;
                return;
            }
        }
    }

    protected final void e()
    {
        this;
        JVM INSTR monitorenter ;
        aju aju1;
        aig aig1;
        long l;
        aju1 = b("value");
        aig1 = aju1.a(null).d();
        l = SystemClock.elapsedRealtime();
        mMode;
        JVM INSTR tableswitch 0 3: default 206
    //                   0 84
    //                   1 92
    //                   2 124
    //                   3 156;
           goto _L1 _L2 _L3 _L4 _L5
_L1:
        float f = mYOffset;
_L6:
        aig1.a(Float.valueOf(f));
        aju1.a(aig1);
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        f = mYOffset;
          goto _L6
_L3:
        f = (float)Math.sin(mXOffset + (float)l * mSpeed) * mAmplitude + mYOffset;
          goto _L6
_L4:
        f = (float)Math.cos(mXOffset + (float)l * mSpeed) * mAmplitude + mYOffset;
          goto _L6
_L5:
        f = mXOffset;
        float f1 = l;
        float f2;
        float f3;
        float f4;
        f2 = mSpeed;
        f3 = mAmplitude;
        f4 = mYOffset;
        f = ((f + f1 * f2) % 1.0F) * f3 + f4;
          goto _L6
        Exception exception;
        exception;
        throw exception;
    }
}
