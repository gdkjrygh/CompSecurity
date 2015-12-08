// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Map;

public final class cdf
    implements cdg
{

    private final String a;

    public cdf(String s)
    {
        a = s;
    }

    public final float a(cdx cdx1)
    {
        String s = a;
        cdx1.a.put("detection_score", Float.valueOf(cdx1.g));
        cdx1.a.put("eyes_open_score", Float.valueOf(cdx1.d));
        cdx1.a.put("illumination_score", Float.valueOf(cdx1.e));
        cdx1.a.put("sharpness_score", Float.valueOf(cdx1.f));
        cdx1.a.put("smile_score", Float.valueOf(cdx1.c));
        cdx1.a.put("framing_score", Float.valueOf(cdx1.h));
        return ((Float)cdx1.a.get(s)).floatValue();
    }
}
