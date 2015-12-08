// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.webclient.model.leafs;

import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.util.JsonUtils;
import com.netflix.mediaclient.util.StringUtils;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.netflix.mediaclient.service.webclient.model.leafs:
//            SubtitlePreference

public class User
    implements com.netflix.mediaclient.servicemgr.User
{
    public class Summary
    {

        private String email;
        private String firstName;
        private String lastName;
        final User this$0;
        private String userId;



/*
        static String access$002(Summary summary1, String s)
        {
            summary1.email = s;
            return s;
        }

*/



/*
        static String access$102(Summary summary1, String s)
        {
            summary1.firstName = s;
            return s;
        }

*/



/*
        static String access$202(Summary summary1, String s)
        {
            summary1.lastName = s;
            return s;
        }

*/



/*
        static String access$302(Summary summary1, String s)
        {
            summary1.userId = s;
            return s;
        }

*/

        public Summary()
        {
            this$0 = User.this;
            super();
        }
    }


    private static final String FIELD_EMAIL = "email";
    private static final String FIELD_FIRST_NAME = "firstName";
    private static final String FIELD_ID = "userId";
    private static final String FIELD_LAST_NAME = "lastName";
    private static final String TAG = "User";
    public SubtitlePreference subtitleDefaults;
    public Summary summary;

    public User()
    {
        summary = new Summary();
    }

    public User(String s)
    {
        Object obj1;
        obj1 = null;
        super();
        summary = new Summary();
        if (!StringUtils.isEmpty(s)) goto _L2; else goto _L1
_L1:
        Object obj = new JSONObject();
_L3:
        summary.userId = JsonUtils.getString(((JSONObject) (obj)), "userId", null);
        summary.email = JsonUtils.getString(((JSONObject) (obj)), "email", null);
        summary.firstName = JsonUtils.getString(((JSONObject) (obj)), "firstName", null);
        summary.lastName = JsonUtils.getString(((JSONObject) (obj)), "lastName", null);
        obj = JsonUtils.getString(((JSONObject) (obj)), "subtitleOverride", null);
        if (!StringUtils.isEmpty(((String) (obj))))
        {
            break MISSING_BLOCK_LABEL_164;
        }
        obj = obj1;
        break MISSING_BLOCK_LABEL_110;
_L2:
        obj = new JSONObject(s);
          goto _L3
_L4:
        try
        {
            subtitleDefaults = ((SubtitlePreference) (obj));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            Log.d("User", (new StringBuilder()).append("failed to create json string=").append(s).append(" exception =").append(obj).toString());
        }
        return;
        obj = new SubtitlePreference(((String) (obj)));
          goto _L4
    }

    public String getEmail()
    {
        if (summary == null)
        {
            return null;
        } else
        {
            return summary.email;
        }
    }

    public String getFirstName()
    {
        if (summary == null)
        {
            return null;
        } else
        {
            return summary.firstName;
        }
    }

    public String getLastName()
    {
        if (summary == null)
        {
            return null;
        } else
        {
            return summary.lastName;
        }
    }

    public SubtitlePreference getSubtitleDefaults()
    {
        return subtitleDefaults;
    }

    public String getUserId()
    {
        if (summary == null)
        {
            return null;
        } else
        {
            return summary.userId;
        }
    }

    public String toString()
    {
        JSONObject jsonobject = new JSONObject();
        try
        {
            jsonobject.put("userId", getUserId());
            jsonobject.put("email", getEmail());
            jsonobject.put("firstName", getFirstName());
            jsonobject.put("lastName", getLastName());
            if (subtitleDefaults != null)
            {
                jsonobject.put("subtitleOverride", subtitleDefaults.toString());
            }
        }
        catch (JSONException jsonexception)
        {
            Log.d("User", (new StringBuilder()).append("failed in json string ").append(jsonexception).toString());
        }
        Log.d("User", (new StringBuilder()).append("user string=").append(jsonobject.toString()).toString());
        return jsonobject.toString();
    }
}
