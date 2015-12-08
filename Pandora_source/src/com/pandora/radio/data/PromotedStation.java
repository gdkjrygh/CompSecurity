// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.radio.data;

import android.os.Parcel;
import com.pandora.radio.util.i;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p.cw.c;
import p.di.a;

// Referenced classes of package com.pandora.radio.data:
//            StationRecommendation, y, ad

public class PromotedStation extends StationRecommendation
{

    private final int b;
    private final String c;
    private String d[];
    private String e[];
    private y f;
    private boolean g;
    private boolean h;
    private String i;

    public PromotedStation()
    {
        g = false;
        h = false;
        b = -1;
        c = null;
        d = new String[0];
        e = new String[0];
    }

    public PromotedStation(JSONObject jsonobject)
        throws JSONException
    {
        super(StationRecommendations.b.f, jsonobject.getString("stationName"), jsonobject.optString("artUrl"), jsonobject.getString("stationToken"));
        g = false;
        h = false;
        b = jsonobject.getInt("promotedStationCampaignId");
        c = jsonobject.optString("promotedStationSponsorText");
        f = new y(jsonobject);
        d = a(jsonobject, "trackingUrls");
        e = a(jsonobject, "impressionUrls");
        i = jsonobject.getString("adServerCorrelationId");
    }

    private String[] a(JSONObject jsonobject, String s)
        throws JSONException
    {
        jsonobject = jsonobject.getJSONArray(s);
        s = new String[jsonobject.length()];
        for (int j = 0; j < jsonobject.length(); j++)
        {
            s[j] = jsonobject.getString(j);
        }

        return s;
    }

    public void a()
    {
        h = true;
        if (e == null || e.length == 0)
        {
            return;
        } else
        {
            (new a()).execute(new ad[] {
                new ad(e)
            });
            return;
        }
    }

    public void a(c c1)
    {
        while (g || d == null || d.length == 0) 
        {
            return;
        }
        (new a()).execute(new ad[] {
            new ad(d)
        });
        g = true;
    }

    public String b()
    {
        if (com.pandora.radio.util.i.a(a))
        {
            return a;
        } else
        {
            return a;
        }
    }

    public int c()
    {
        return b;
    }

    public String d()
    {
        return c;
    }

    public int describeContents()
    {
        return 0;
    }

    public y e()
    {
        return f;
    }

    public boolean f()
    {
        return h;
    }

    public boolean g()
    {
        return b >= 0;
    }

    public String h()
    {
        if (!com.pandora.radio.util.i.a(i))
        {
            return i;
        } else
        {
            return "";
        }
    }

    public void writeToParcel(Parcel parcel, int j)
    {
        throw new UnsupportedOperationException("Parcelable is not support by PromotedStation");
    }
}
