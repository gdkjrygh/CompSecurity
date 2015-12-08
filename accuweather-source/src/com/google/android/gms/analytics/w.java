// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics;


// Referenced classes of package com.google.android.gms.analytics:
//            j

class w
    implements j
{

    String tA;
    String tz;
    String wg;
    int wh;
    int wi;

    w()
    {
        wh = -1;
        wi = -1;
    }

    public boolean cT()
    {
        return tz != null;
    }

    public String cU()
    {
        return tz;
    }

    public boolean cV()
    {
        return tA != null;
    }

    public String cW()
    {
        return tA;
    }

    public boolean cX()
    {
        return wg != null;
    }

    public String cY()
    {
        return wg;
    }

    public boolean cZ()
    {
        return wh >= 0;
    }

    public int da()
    {
        return wh;
    }

    public boolean db()
    {
        return wi != -1;
    }

    public boolean dc()
    {
        return wi == 1;
    }
}
