// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.domain.badges;

import android.graphics.Color;
import com.fitbit.d.a;
import com.fitbit.d.b;
import com.fitbit.data.bl.ao;
import com.fitbit.data.domain.Entity;
import com.fitbit.util.bv;
import com.fitbit.util.w;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.fitbit.data.domain.badges:
//            BadgeType, BadgeMetric

public class Badge extends Entity
    implements b, Serializable
{
    private static final class a
    {

        public static final String a = "badgeType";
        public static final String b = "unit";
        public static final String c = "dateTime";
        public static final String d = "timesAchieved";
        public static final String e = "value";
        public static final String f = "shortName";
        public static final String g = "description";
        public static final String h = "mobileDescription";
        public static final String i = "category";
        public static final String j = "shortDescription";
        public static final String k = "earnedMessage";
        public static final String l = "badgeGradientStartColor";
        public static final String m = "badgeGradientEndColor";
        public static final String n = "encodedId";
        public static final String o = "cheers";
        public static final String p = "shareText";
        public static final String q = "shareImage640px";

        private a()
        {
        }
    }


    private static final long serialVersionUID = 0x1a4d9a8aa59989faL;
    private String category;
    private Date dateTime;
    private String description;
    private String earnedMessage;
    private String encodedId;
    private int gradientEnd;
    private int gradientStart;
    private String image;
    private String mobileDescription;
    private String shareImageUrl;
    private String shareText;
    private String shortDescription;
    private String shortName;
    private int timesAchieved;
    private BadgeType type;
    private BadgeMetric unit;
    private Long userId;
    private List usersCheeredList;
    private int value;

    public Badge()
    {
    }

    public static long a()
    {
        return 0x1a4d9a8aa59989faL;
    }

    public void a(int i1)
    {
        timesAchieved = i1;
    }

    public void a(BadgeMetric badgemetric)
    {
        unit = badgemetric;
    }

    public void a(BadgeType badgetype)
    {
        type = badgetype;
    }

    public void a(Long long1)
    {
        userId = long1;
    }

    public void a(String s1)
    {
        encodedId = s1;
    }

    public void a(Date date)
    {
        dateTime = date;
    }

    public List b()
    {
        return usersCheeredList;
    }

    public void b(int i1)
    {
        value = i1;
    }

    public void b(String s1)
    {
        image = s1;
    }

    public String c()
    {
        return encodedId;
    }

    public void c(int i1)
    {
        gradientStart = i1;
    }

    public void c(String s1)
    {
        shortName = s1;
    }

    public BadgeType d()
    {
        return type;
    }

    public void d(int i1)
    {
        gradientEnd = i1;
    }

    public void d(String s1)
    {
        description = s1;
    }

    public Date e()
    {
        return dateTime;
    }

    public void e(String s1)
    {
        shortDescription = s1;
    }

    public int f()
    {
        return timesAchieved;
    }

    public void f(String s1)
    {
        earnedMessage = s1;
    }

    public int g()
    {
        return value;
    }

    public void g(String s1)
    {
        category = s1;
    }

    public BadgeMetric h()
    {
        return unit;
    }

    public void h(String s1)
    {
        mobileDescription = s1;
    }

    public int hashCode()
    {
        int j1 = 0;
        int i1;
        if (dateTime == null)
        {
            i1 = 0;
        } else
        {
            i1 = dateTime.hashCode();
        }
        if (type != null)
        {
            j1 = type.hashCode();
        }
        return ((i1 + 31) * 31 + j1) * 31 + value;
    }

    public String i()
    {
        return image;
    }

    public void i(String s1)
    {
        shareImageUrl = s1;
    }

    public void initFromPublicApiJsonObject(JSONObject jsonobject)
        throws JSONException
    {
        type = (BadgeType)w.a(com.fitbit.d.a.a(jsonobject, "badgeType"), com/fitbit/data/domain/badges/BadgeType, BadgeType.UNKNOWN);
        if (jsonobject.has("unit"))
        {
            unit = (BadgeMetric)w.a(com.fitbit.d.a.a(jsonobject, "unit"), com/fitbit/data/domain/badges/BadgeMetric, type.getDefaultUnit());
        } else
        {
            unit = type.getDefaultUnit();
        }
        dateTime = com.fitbit.d.a.e(jsonobject, "dateTime");
        timesAchieved = com.fitbit.d.a.a(jsonobject, "timesAchieved", 0);
        value = com.fitbit.d.a.a(jsonobject, "value", 0);
        image = ao.a(jsonobject, 480);
        shortName = bv.b(com.fitbit.d.a.a(jsonobject, "shortName"));
        category = com.fitbit.d.a.a(jsonobject, "category");
        shareImageUrl = com.fitbit.d.a.a(jsonobject, "shareImage640px");
        description = com.fitbit.d.a.a(jsonobject, "description");
        mobileDescription = com.fitbit.d.a.a(jsonobject, "mobileDescription");
        shortDescription = com.fitbit.d.a.a(jsonobject, "shortDescription");
        shareText = com.fitbit.d.a.a(jsonobject, "shareText");
        earnedMessage = com.fitbit.d.a.a(jsonobject, "earnedMessage");
        gradientEnd = Color.parseColor((new StringBuilder()).append("#").append(com.fitbit.d.a.a(jsonobject, "badgeGradientEndColor")).toString());
        gradientStart = Color.parseColor((new StringBuilder()).append("#").append(com.fitbit.d.a.a(jsonobject, "badgeGradientStartColor")).toString());
        encodedId = com.fitbit.d.a.a(jsonobject, "encodedId");
        jsonobject = com.fitbit.d.a.i(jsonobject, "cheers");
        usersCheeredList = new ArrayList();
        for (int i1 = 0; i1 < jsonobject.length(); i1++)
        {
            usersCheeredList.add(jsonobject.getString(i1));
        }

    }

    public String j()
    {
        return shortName;
    }

    public void j(String s1)
    {
        shareText = s1;
    }

    public String k()
    {
        return description;
    }

    public String l()
    {
        return shortDescription;
    }

    public String m()
    {
        return earnedMessage;
    }

    public int n()
    {
        return gradientStart;
    }

    public int o()
    {
        return gradientEnd;
    }

    public String p()
    {
        return category;
    }

    public String q()
    {
        return mobileDescription;
    }

    public String r()
    {
        return shareImageUrl;
    }

    public String s()
    {
        return shareText;
    }

    public Long t()
    {
        return userId;
    }

    public JSONObject toPublicApiJsonObject()
        throws JSONException
    {
        throw new UnsupportedOperationException();
    }
}
