// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.app;


class TwilightCalculator
{

    private static final float ALTIDUTE_CORRECTION_CIVIL_TWILIGHT = -0.1047198F;
    private static final float C1 = 0.0334196F;
    private static final float C2 = 0.000349066F;
    private static final float C3 = 5.236E-06F;
    public static final int DAY = 0;
    private static final float DEGREES_TO_RADIANS = 0.01745329F;
    private static final float J0 = 0.0009F;
    public static final int NIGHT = 1;
    private static final float OBLIQUITY = 0.4092797F;
    private static final long UTC_2000 = 0xdc6d62da00L;
    private static TwilightCalculator sInstance;
    public int state;
    public long sunrise;
    public long sunset;

    TwilightCalculator()
    {
    }

    static TwilightCalculator getInstance()
    {
        if (sInstance == null)
        {
            sInstance = new TwilightCalculator();
        }
        return sInstance;
    }

    public void calculateTwilight(long l, double d, double d1)
    {
        float f = (float)(l - 0xdc6d62da00L) / 8.64E+07F;
        float f1 = 6.24006F + 0.01720197F * f;
        double d2 = (double)f1 + 0.033419601619243622D * Math.sin(f1) + 0.00034906598739326D * Math.sin(2.0F * f1) + 5.2360001063789241E-06D * Math.sin(3F * f1) + 1.796593063D + 3.1415926535897931D;
        d1 = -d1 / 360D;
        double d3 = (float)Math.round((double)(f - 0.0009F) - d1) + 0.0009F;
        d1 = Math.sin(f1) * 0.0053D + (d1 + d3) + -0.0068999999999999999D * Math.sin(2D * d2);
        d2 = Math.asin(Math.sin(d2) * Math.sin(0.40927970409393311D));
        double d5 = 0.01745329238474369D * d;
        d = Math.sin(-0.10471975803375244D);
        d3 = Math.sin(d5);
        double d4 = Math.sin(d2);
        d5 = Math.cos(d5);
        d = (d - d3 * d4) / (Math.cos(d2) * d5);
        if (d >= 1.0D)
        {
            state = 1;
            sunset = -1L;
            sunrise = -1L;
            return;
        }
        if (d <= -1D)
        {
            state = 0;
            sunset = -1L;
            sunrise = -1L;
            return;
        }
        f = (float)(Math.acos(d) / 6.2831853071795862D);
        sunset = Math.round(((double)f + d1) * 86400000D) + 0xdc6d62da00L;
        sunrise = Math.round((d1 - (double)f) * 86400000D) + 0xdc6d62da00L;
        if (sunrise < l && sunset > l)
        {
            state = 0;
            return;
        } else
        {
            state = 1;
            return;
        }
    }
}
