// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.urbanairship.push;

import com.urbanairship.Logger;
import com.urbanairship.util.UAStringUtil;
import java.util.HashSet;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

class ChannelRegistrationPayload
{
    static class Builder
    {

        private String alias;
        private String apid;
        private boolean backgroundEnabled;
        private String deviceId;
        private String deviceType;
        private boolean optIn;
        private String pushAddress;
        private boolean setTags;
        private Set tags;
        private String userId;

        ChannelRegistrationPayload build()
        {
            return new ChannelRegistrationPayload(this);
        }

        Builder setAlias(String s)
        {
            String s1 = s;
            if (s != null)
            {
                s1 = s.trim();
            }
            alias = s1;
            return this;
        }

        Builder setApid(String s)
        {
            apid = s;
            return this;
        }

        Builder setBackgroundEnabled(boolean flag)
        {
            backgroundEnabled = flag;
            return this;
        }

        Builder setDeviceId(String s)
        {
            deviceId = s;
            return this;
        }

        Builder setDeviceType(String s)
        {
            deviceType = s;
            return this;
        }

        Builder setOptIn(boolean flag)
        {
            optIn = flag;
            return this;
        }

        Builder setPushAddress(String s)
        {
            pushAddress = s;
            return this;
        }

        Builder setTags(boolean flag, Set set)
        {
            setTags = flag;
            tags = set;
            return this;
        }

        Builder setUserId(String s)
        {
            userId = s;
            return this;
        }











        Builder()
        {
        }
    }


    static final String ALIAS_KEY = "alias";
    static final String APID_KEY = "apid";
    static final String BACKGROUND_ENABLED_KEY = "background";
    static final String CHANNEL_KEY = "channel";
    static final String DEVICE_ID_KEY = "device_id";
    static final String DEVICE_TYPE_KEY = "device_type";
    static final String IDENTITY_HINTS_KEY = "identity_hints";
    static final String OPT_IN_KEY = "opt_in";
    static final String PUSH_ADDRESS_KEY = "push_address";
    static final String SET_TAGS_KEY = "set_tags";
    static final String TAGS_KEY = "tags";
    static final String USER_ID_KEY = "user_id";
    private String alias;
    private String apid;
    private boolean backgroundEnabled;
    private String deviceId;
    private String deviceType;
    private boolean optIn;
    private String pushAddress;
    private boolean setTags;
    private Set tags;
    private String userId;

    private ChannelRegistrationPayload(Builder builder)
    {
        optIn = builder.optIn;
        backgroundEnabled = builder.backgroundEnabled;
        alias = builder.alias;
        deviceType = builder.deviceType;
        pushAddress = builder.pushAddress;
        setTags = builder.setTags;
        Set set;
        if (builder.setTags)
        {
            set = builder.tags;
        } else
        {
            set = null;
        }
        tags = set;
        userId = builder.userId;
        deviceId = builder.deviceId;
        apid = builder.apid;
    }


    protected static ChannelRegistrationPayload createFromJSON(JSONObject jsonobject)
    {
        Builder builder = new Builder();
        if (jsonobject == null || jsonobject.length() == 0)
        {
            return null;
        }
        HashSet hashset;
        HashSet hashset1;
        JSONObject jsonobject1;
        JSONArray jsonarray;
        int i;
        boolean flag;
        try
        {
            jsonobject1 = jsonobject.getJSONObject("channel");
            builder.setOptIn(jsonobject1.getBoolean("opt_in")).setBackgroundEnabled(jsonobject1.getBoolean("background")).setDeviceType(getStringFromJSON(jsonobject1, "device_type")).setPushAddress(getStringFromJSON(jsonobject1, "push_address")).setAlias(getStringFromJSON(jsonobject1, "alias")).setUserId(getStringFromJSON(jsonobject1, "user_id")).setApid(getStringFromJSON(jsonobject1, "apid"));
        }
        // Misplaced declaration of an exception variable
        catch (JSONObject jsonobject)
        {
            Logger.warn("Failed to parse payload from JSON.", jsonobject);
            return null;
        }
        flag = false;
        hashset = null;
        if (!jsonobject1.has("tags")) goto _L2; else goto _L1
_L1:
        jsonarray = jsonobject1.getJSONArray("tags");
        hashset1 = new HashSet();
        i = 0;
_L3:
        hashset = hashset1;
        if (i >= jsonarray.length())
        {
            break; /* Loop/switch isn't completed */
        }
        hashset1.add(jsonarray.getString(i));
        i++;
        if (true) goto _L3; else goto _L2
_L2:
        if (jsonobject1.has("set_tags"))
        {
            flag = jsonobject1.getBoolean("set_tags");
        }
        builder.setTags(flag, hashset);
        if (jsonobject.has("identity_hints"))
        {
            jsonobject = jsonobject.getJSONObject("identity_hints");
            builder.setUserId(getStringFromJSON(jsonobject, "user_id")).setDeviceId(getStringFromJSON(jsonobject, "device_id")).setApid(getStringFromJSON(jsonobject, "apid"));
        }
        return builder.build();
    }

    private static String getStringFromJSON(JSONObject jsonobject, String s)
    {
        String s1 = null;
        try
        {
            if (jsonobject.has(s))
            {
                s1 = jsonobject.getString(s);
            }
        }
        // Misplaced declaration of an exception variable
        catch (JSONObject jsonobject)
        {
            return null;
        }
        return s1;
    }

    JSONObject asJSON()
    {
        JSONObject jsonobject = new JSONObject();
        JSONObject jsonobject1 = new JSONObject();
        JSONObject jsonobject2 = new JSONObject();
        try
        {
            jsonobject1.put("device_type", deviceType);
            jsonobject1.put("opt_in", optIn);
            jsonobject1.put("background", backgroundEnabled);
            jsonobject1.put("push_address", pushAddress);
            if (!UAStringUtil.isEmpty(alias))
            {
                jsonobject1.put("alias", alias);
            }
            jsonobject1.put("set_tags", setTags);
            if (setTags && tags != null)
            {
                jsonobject1.put("tags", new JSONArray(tags));
            }
            jsonobject.put("channel", jsonobject1);
            if (!UAStringUtil.isEmpty(userId))
            {
                jsonobject2.put("user_id", userId);
            }
            if (!UAStringUtil.isEmpty(deviceId))
            {
                jsonobject2.put("device_id", deviceId);
            }
            if (!UAStringUtil.isEmpty(apid))
            {
                jsonobject2.put("apid", apid);
            }
            if (jsonobject2.length() != 0)
            {
                jsonobject.put("identity_hints", jsonobject2);
            }
        }
        catch (Exception exception)
        {
            Logger.error("Failed to create channel registration payload as json", exception);
            return jsonobject;
        }
        return jsonobject;
    }

    public boolean equals(Object obj)
    {
        if (obj != null && (obj instanceof ChannelRegistrationPayload))
        {
            if (optIn == ((ChannelRegistrationPayload) (obj = (ChannelRegistrationPayload)obj)).optIn && backgroundEnabled == ((ChannelRegistrationPayload) (obj)).backgroundEnabled && (alias != null ? alias.equals(((ChannelRegistrationPayload) (obj)).alias) : ((ChannelRegistrationPayload) (obj)).alias == null) && (deviceType != null ? deviceType.equals(((ChannelRegistrationPayload) (obj)).deviceType) : ((ChannelRegistrationPayload) (obj)).deviceType == null) && (pushAddress != null ? pushAddress.equals(((ChannelRegistrationPayload) (obj)).pushAddress) : ((ChannelRegistrationPayload) (obj)).pushAddress == null) && setTags == ((ChannelRegistrationPayload) (obj)).setTags && (tags != null ? tags.equals(((ChannelRegistrationPayload) (obj)).tags) : ((ChannelRegistrationPayload) (obj)).tags == null) && (userId != null ? userId.equals(((ChannelRegistrationPayload) (obj)).userId) : ((ChannelRegistrationPayload) (obj)).userId == null) && (deviceId != null ? deviceId.equals(((ChannelRegistrationPayload) (obj)).deviceId) : ((ChannelRegistrationPayload) (obj)).deviceId == null) && (apid != null ? apid.equals(((ChannelRegistrationPayload) (obj)).apid) : ((ChannelRegistrationPayload) (obj)).apid == null))
            {
                return true;
            }
        }
        return false;
    }

    public int hashCode()
    {
        int j1 = 1;
        int j2 = 0;
        int i;
        int j;
        int k;
        int l;
        int i1;
        int k1;
        int l1;
        int i2;
        if (optIn)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        if (backgroundEnabled)
        {
            j = 1;
        } else
        {
            j = 0;
        }
        if (alias == null)
        {
            k = 0;
        } else
        {
            k = alias.hashCode();
        }
        if (deviceType == null)
        {
            l = 0;
        } else
        {
            l = deviceType.hashCode();
        }
        if (pushAddress == null)
        {
            i1 = 0;
        } else
        {
            i1 = pushAddress.hashCode();
        }
        if (!setTags)
        {
            j1 = 0;
        }
        if (tags == null)
        {
            k1 = 0;
        } else
        {
            k1 = tags.hashCode();
        }
        if (userId == null)
        {
            l1 = 0;
        } else
        {
            l1 = userId.hashCode();
        }
        if (deviceId == null)
        {
            i2 = 0;
        } else
        {
            i2 = deviceId.hashCode();
        }
        if (apid != null)
        {
            j2 = apid.hashCode();
        }
        return (((((((((i + 527) * 31 + j) * 31 + k) * 31 + l) * 31 + i1) * 31 + j1) * 31 + k1) * 31 + l1) * 31 + i2) * 31 + j2;
    }

    public String toString()
    {
        return asJSON().toString();
    }
}
