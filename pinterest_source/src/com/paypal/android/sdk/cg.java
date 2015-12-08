// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.paypal.android.sdk;

import android.os.Parcel;
import android.os.Parcelable;
import android.telephony.PhoneNumberUtils;
import java.util.HashMap;
import java.util.Locale;

// Referenced classes of package com.paypal.android.sdk:
//            ch, g, ce, cf

public class cg
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new ch();
    private static HashMap c;
    private g a;
    private String b;

    public cg(Parcel parcel)
    {
        a = (g)parcel.readParcelable(com/paypal/android/sdk/g.getClassLoader());
        b = parcel.readString();
    }

    public cg(cf cf1, g g1, String s)
    {
        a(g1, cf1.a(ce.e(s)));
    }

    public cg(cf cf1, String s)
    {
        a(cf1.d(), cf1.a(ce.e(s)));
    }

    private void a(g g1, String s)
    {
        a = g1;
        b = s;
    }

    public final String a()
    {
        return b;
    }

    public final String a(cf cf1)
    {
        if (cf1.b().equals(Locale.US))
        {
            return PhoneNumberUtils.formatNumber(b);
        } else
        {
            return b;
        }
    }

    public final String b()
    {
        return (new StringBuilder()).append(a.a()).append("|").append(b).toString();
    }

    public final String c()
    {
        return (String)c.get(a.a());
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeParcelable(a, 0);
        parcel.writeString(b);
    }

    static 
    {
        HashMap hashmap = new HashMap();
        c = hashmap;
        hashmap.put("US", "1");
        c.put("CA", "1");
        c.put("GB", "44");
        c.put("FR", "33");
        c.put("IT", "39");
        c.put("ES", "34");
        c.put("AU", "61");
        c.put("MY", "60");
        c.put("SG", "65");
        c.put("AR", "54");
        c.put("UK", "44");
        c.put("ZA", "27");
        c.put("GR", "30");
        c.put("NL", "31");
        c.put("BE", "32");
        c.put("SG", "65");
        c.put("PT", "351");
        c.put("LU", "352");
        c.put("IE", "353");
        c.put("IS", "354");
        c.put("MT", "356");
        c.put("CY", "357");
        c.put("FI", "358");
        c.put("HU", "36");
        c.put("LT", "370");
        c.put("LV", "371");
        c.put("EE", "372");
        c.put("SI", "386");
        c.put("CH", "41");
        c.put("CZ", "420");
        c.put("SK", "421");
        c.put("AT", "43");
        c.put("DK", "45");
        c.put("SE", "46");
        c.put("NO", "47");
        c.put("PL", "48");
        c.put("DE", "49");
        c.put("MX", "52");
        c.put("BR", "55");
        c.put("NZ", "64");
        c.put("TH", "66");
        c.put("JP", "81");
        c.put("KR", "82");
        c.put("HK", "852");
        c.put("CN", "86");
        c.put("TW", "886");
        c.put("TR", "90");
        c.put("IN", "91");
        c.put("IL", "972");
        c.put("MC", "377");
        c.put("CR", "506");
        c.put("CL", "56");
        c.put("VE", "58");
        c.put("EC", "593");
        c.put("UY", "598");
    }
}
