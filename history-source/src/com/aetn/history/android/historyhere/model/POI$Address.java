// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aetn.history.android.historyhere.model;


// Referenced classes of package com.aetn.history.android.historyhere.model:
//            POI

public class zip
{

    private String address1;
    private String address2;
    private String city;
    private String state;
    final POI this$0;
    private String zip;

    public String getAddress1()
    {
        if (address1 != null)
        {
            return address1;
        } else
        {
            return "";
        }
    }

    public String getAddress2()
    {
        if (address2 != null)
        {
            return address2;
        } else
        {
            return "";
        }
    }

    public String getCity()
    {
        if (city != null)
        {
            return city;
        } else
        {
            return "";
        }
    }

    public String getState()
    {
        if (state != null)
        {
            return state;
        } else
        {
            return "";
        }
    }

    public String getZip()
    {
        if (zip != null)
        {
            return zip;
        } else
        {
            return "";
        }
    }



/*
    static String access$002( , String s)
    {
        .address1 = s;
        return s;
    }

*/



/*
    static String access$102(address1 address1_1, String s)
    {
        address1_1.address2 = s;
        return s;
    }

*/



/*
    static String access$202(address2 address2_1, String s)
    {
        address2_1.city = s;
        return s;
    }

*/



/*
    static String access$302(city city1, String s)
    {
        city1.state = s;
        return s;
    }

*/



/*
    static String access$402(state state1, String s)
    {
        state1.zip = s;
        return s;
    }

*/

    public zip()
    {
        this$0 = POI.this;
        super();
        address1 = "";
        address2 = "";
        city = "";
        state = "";
        zip = "";
    }
}
