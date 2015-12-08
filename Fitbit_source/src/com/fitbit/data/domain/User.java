// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.domain;

import android.net.Uri;
import android.text.TextUtils;
import com.fitbit.d.a;
import com.fitbit.d.b;
import com.fitbit.data.bl.ao;
import com.fitbit.data.domain.badges.Badge;
import com.fitbit.util.w;
import java.io.Serializable;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.fitbit.data.domain:
//            Entity, Length, UnitSystem, Gender, 
//            TimeZone

public class User extends Entity
    implements b, Serializable
{

    private String aboutMe;
    private String city;
    private String country;
    private String displayName;
    private String encodedId;
    private String fullName;
    private Gender gender;
    private Length height;
    private boolean needsRecalculateUserId;
    private String nickname;
    private String profilePhotoLink;
    private TimeZone timeZone;
    private long timezoneOffset;
    private List topBadges;
    private long userId;

    public User()
    {
    }

    public String E()
    {
        return fullName;
    }

    public String F()
    {
        return encodedId;
    }

    public String G()
    {
        return profilePhotoLink;
    }

    public boolean H()
    {
        return !TextUtils.isEmpty(profilePhotoLink) && !Uri.parse(profilePhotoLink).getLastPathSegment().contains("defaultProfile");
    }

    public long I()
    {
        int l = 0;
        String s = F();
        if (needsRecalculateUserId && s != null)
        {
            needsRecalculateUserId = false;
            long l1 = 0L;
            for (; l < s.length(); l++)
            {
                l1 = l1 * (long)"23456789BCDFGHJKLMNPQRSTVWXYZ".length() + (long)"23456789BCDFGHJKLMNPQRSTVWXYZ".indexOf(s.charAt(l));
            }

            userId = 0x28972L ^ l1;
        }
        return userId;
    }

    public Gender J()
    {
        return gender;
    }

    public String K()
    {
        return nickname;
    }

    public TimeZone L()
    {
        return timeZone;
    }

    public long M()
    {
        return timezoneOffset;
    }

    public String N()
    {
        return aboutMe;
    }

    public String O()
    {
        return country;
    }

    public String P()
    {
        return displayName;
    }

    public Length Q()
    {
        return height;
    }

    public List R()
    {
        return topBadges;
    }

    public void a(Gender gender1)
    {
        gender = gender1;
    }

    public void a(TimeZone timezone)
    {
        timeZone = timezone;
    }

    public void b(List list)
    {
        topBadges = list;
    }

    public void c(Length length)
    {
        height = length;
    }

    public void d(String s)
    {
        city = s;
    }

    public void e(long l)
    {
        timezoneOffset = l;
    }

    public void e(String s)
    {
        fullName = s;
    }

    public void f(String s)
    {
        encodedId = s;
        needsRecalculateUserId = true;
    }

    public void g(String s)
    {
        profilePhotoLink = s;
    }

    public void h(String s)
    {
        nickname = s;
    }

    public void i(String s)
    {
        aboutMe = s;
    }

    public void initFromPublicApiJsonObject(JSONObject jsonobject)
        throws JSONException
    {
        e(jsonobject.optString("fullName"));
        k(jsonobject.optString("displayName"));
        c(new Length(jsonobject.optDouble("height"), UnitSystem.DEFAULT.getHeightUnit()));
        a((Gender)w.a(jsonobject.optString("gender", "MALE"), com/fitbit/data/domain/Gender));
        g(jsonobject.optString("avatar"));
        setTimeCreated(com.fitbit.d.a.e(jsonobject, "memberSince"));
        j(com.fitbit.d.a.a(jsonobject, "country"));
        d(jsonobject.optString("city"));
        f(jsonobject.optString("encodedId"));
        setEntityStatus(Entity.EntityStatus.SYNCED);
        jsonobject = (new ao()).i(jsonobject.optJSONArray("topBadges"));
        for (Iterator iterator = jsonobject.iterator(); iterator.hasNext(); ((Badge)iterator.next()).a(Long.valueOf(I()))) { }
        b(jsonobject);
    }

    public void j(String s)
    {
        country = s;
    }

    public void k(String s)
    {
        displayName = s;
    }

    public String o()
    {
        return city;
    }

    public JSONObject toPublicApiJsonObject()
        throws JSONException
    {
        throw new UnsupportedOperationException();
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder(super.toString());
        stringbuilder.append(" userId: ").append(I());
        stringbuilder.append(" displayName: ").append(P());
        return stringbuilder.toString();
    }
}
