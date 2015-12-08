// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics;


// Referenced classes of package com.google.android.gms.analytics:
//            i

class v
    implements i
{

    String As;
    int At;
    int Au;
    String xL;
    String xM;

    v()
    {
        At = -1;
        Au = -1;
    }

    public int eA()
    {
        return At;
    }

    public boolean eB()
    {
        return Au != -1;
    }

    public boolean eC()
    {
        return Au == 1;
    }

    public boolean et()
    {
        return xL != null;
    }

    public String eu()
    {
        return xL;
    }

    public boolean ev()
    {
        return xM != null;
    }

    public String ew()
    {
        return xM;
    }

    public boolean ex()
    {
        return As != null;
    }

    public String ey()
    {
        return As;
    }

    public boolean ez()
    {
        return At >= 0;
    }
}
