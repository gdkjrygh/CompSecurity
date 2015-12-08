// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aetn.history.android.historyhere.view;


// Referenced classes of package com.aetn.history.android.historyhere.view:
//            SuggestActivity

public class historicalSignificance
{

    public String address;
    public String city;
    public String historicalSignificance;
    public double lat;
    public double lng;
    public String placeName;
    public String state;
    final SuggestActivity this$0;
    public String zip;

    public String getAddressForSearch()
    {
        return (new StringBuilder()).append(address).append(" ").append(city).append(" ").append(state).append(" ").append(zip).toString();
    }

    public ()
    {
        this$0 = SuggestActivity.this;
        super();
        lat = 0.0D;
        lng = 0.0D;
        placeName = "";
        address = "";
        city = "";
        state = "";
        zip = "";
        historicalSignificance = "";
    }
}
