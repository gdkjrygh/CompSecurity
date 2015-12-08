// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.domain.challenges;

import com.fitbit.d.b;
import com.fitbit.data.domain.Entity;
import com.fitbit.data.domain.NamedTime;
import com.fitbit.data.domain.device.DeviceFeature;
import com.fitbit.util.format.e;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class ChallengeType extends Entity
    implements b
{

    private static final String a = "ChallengeType";
    private boolean comingSoon;
    private boolean creatable;
    private String description;
    private String gameplay;
    private String iconUrl;
    private int maxParticipants;
    private int minParticipants;
    private String name;
    private String personalBest;
    private List potentialStartTimes;
    private Date proposedStartTime;
    private List requiredDeviceFeatures;
    private List requiredUIFeatures;
    private String type;

    public ChallengeType()
    {
    }

    public List a()
    {
        return potentialStartTimes;
    }

    public void a(int i1)
    {
        maxParticipants = i1;
    }

    public void a(String s)
    {
        gameplay = s;
    }

    public void a(Date date)
    {
        proposedStartTime = date;
    }

    public void a(List list)
    {
        potentialStartTimes = list;
    }

    public void a(boolean flag)
    {
        creatable = flag;
    }

    public String b()
    {
        return gameplay;
    }

    public void b(int i1)
    {
        minParticipants = i1;
    }

    public void b(String s)
    {
        description = s;
    }

    public void b(List list)
    {
        requiredDeviceFeatures = list;
    }

    public void b(boolean flag)
    {
        comingSoon = flag;
    }

    public String c()
    {
        return description;
    }

    public void c(String s)
    {
        name = s;
    }

    public void c(List list)
    {
        requiredUIFeatures = list;
    }

    public String d()
    {
        return name;
    }

    public void d(String s)
    {
        personalBest = s;
    }

    public String e()
    {
        return personalBest;
    }

    public void e(String s)
    {
        type = s;
    }

    public String f()
    {
        return type;
    }

    public void f(String s)
    {
        iconUrl = s;
    }

    public String g()
    {
        return iconUrl;
    }

    public boolean h()
    {
        return creatable;
    }

    public boolean i()
    {
        return comingSoon;
    }

    public void initFromPublicApiJsonObject(JSONObject jsonobject)
        throws JSONException
    {
        boolean flag = false;
        d(jsonobject.optString("personalBest"));
        e(jsonobject.optString("type"));
        b(jsonobject.optString("description"));
        c(jsonobject.optString("name"));
        f(jsonobject.optString("iconUrl"));
        b(jsonobject.optBoolean("comingSoon"));
        a(jsonobject.optBoolean("creatable"));
        a(jsonobject.optInt("maxParticipants"));
        b(jsonobject.optInt("minParticipants"));
        if (jsonobject.has("gameplay"))
        {
            a(jsonobject.optString("gameplay"));
        }
        if (jsonobject.has("proposedStartTime"))
        {
            a(com.fitbit.util.format.e.d(jsonobject.getString("proposedStartTime")));
        }
        ArrayList arraylist = new ArrayList();
        JSONArray jsonarray = jsonobject.optJSONArray("potentialStartTimes");
        if (jsonarray != null)
        {
            for (int i1 = 0; i1 < jsonarray.length(); i1++)
            {
                NamedTime namedtime = new NamedTime();
                namedtime.initFromPublicApiJsonObject(jsonarray.getJSONObject(i1));
                arraylist.add(namedtime);
            }

        }
        a(arraylist);
        arraylist = new ArrayList();
        jsonarray = jsonobject.optJSONArray("requiredDeviceFeatures");
        if (jsonarray != null)
        {
            for (int j1 = 0; j1 < jsonarray.length(); j1++)
            {
                arraylist.add(DeviceFeature.getSafeChallengeStatusFromString(jsonarray.getString(j1)));
            }

        }
        b(arraylist);
        arraylist = new ArrayList();
        jsonobject = jsonobject.optJSONArray("requiredChallengeFeatures");
        if (jsonobject != null)
        {
            for (int k1 = ((flag) ? 1 : 0); k1 < jsonobject.length(); k1++)
            {
    /* block-local class not found */
    class RequiredUIFeature {}

                arraylist.add(RequiredUIFeature.getSafeChallengeStatusFromString(jsonobject.getString(k1)));
            }

        }
        c(arraylist);
        setEntityStatus(com.fitbit.data.domain.Entity.EntityStatus.SYNCED);
    }

    public int j()
    {
        return maxParticipants;
    }

    public int k()
    {
        return minParticipants;
    }

    public List l()
    {
        return requiredDeviceFeatures;
    }

    public Date m()
    {
        return proposedStartTime;
    }

    public List n()
    {
        return requiredUIFeatures;
    }

    public boolean o()
    {
label0:
        {
            if (requiredUIFeatures == null)
            {
                break label0;
            }
            Iterator iterator = requiredUIFeatures.iterator();
            RequiredUIFeature requireduifeature;
            do
            {
                if (!iterator.hasNext())
                {
                    break label0;
                }
                requireduifeature = (RequiredUIFeature)iterator.next();
            } while (RequiredUIFeature.UNKNOWN != requireduifeature);
            return false;
        }
        return true;
    }

    public boolean p()
    {
        return requiredUIFeatures != null && requiredUIFeatures.contains(RequiredUIFeature.MISSION_RANK_DISPLAY);
    }

    public boolean q()
    {
        return requiredUIFeatures != null && requiredUIFeatures.contains(RequiredUIFeature.RACE_RANK_DISPLAY);
    }

    public JSONObject toPublicApiJsonObject()
        throws JSONException
    {
        throw new IllegalStateException("ToJSON method not supposed to be called.");
    }
}
