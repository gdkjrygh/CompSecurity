// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.quantcast.measurement.service;


// Referenced classes of package com.quantcast.measurement.service:
//            QCLocation

private class locality
{

    private final String country;
    private final String locality;
    private final String state;
    final QCLocation this$0;

    public String getCountry()
    {
        return country;
    }

    public String getLocality()
    {
        return locality;
    }

    public String getState()
    {
        return state;
    }

    public (String s, String s1, String s2)
    {
        this$0 = QCLocation.this;
        super();
        country = s;
        state = s1;
        locality = s2;
    }
}
