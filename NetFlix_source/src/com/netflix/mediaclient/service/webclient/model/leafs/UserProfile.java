// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.webclient.model.leafs;

import android.text.TextUtils;
import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.servicemgr.ProfileType;
import com.netflix.mediaclient.util.JsonUtils;
import com.netflix.mediaclient.util.StringUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.netflix.mediaclient.service.webclient.model.leafs:
//            SubtitlePreference

public class UserProfile
    implements com.netflix.mediaclient.servicemgr.UserProfile
{
    public class Language
    {

        public String code;
        final UserProfile this$0;

        public Language(String s)
        {
            this$0 = UserProfile.this;
            super();
            code = s;
        }
    }

    public class Operation
    {

        public String msg;
        public String status;
        final UserProfile this$0;

        public Operation()
        {
            this$0 = UserProfile.this;
            super();
        }
    }

    public class Social
    {

        public boolean isConnected;
        final UserProfile this$0;

        public Social()
        {
            this$0 = UserProfile.this;
            super();
        }
    }

    public class Summary
    {

        private String avatarUrl;
        private String email;
        public ProfileType enumType;
        private String experienceType;
        private String firstName;
        private String geoCountry;
        private boolean isAutoPlayEnabled;
        private boolean isIqEnabled;
        private boolean isPrimaryProfile;
        public List languages;
        private String lastName;
        private String profileId;
        private String profileName;
        private String reqCountry;
        private Social social;
        final UserProfile this$0;
        private String userId;



/*
        static String access$002(Summary summary1, String s)
        {
            summary1.email = s;
            return s;
        }

*/




/*
        static String access$1002(Summary summary1, String s)
        {
            summary1.profileId = s;
            return s;
        }

*/


/*
        static String access$102(Summary summary1, String s)
        {
            summary1.profileName = s;
            return s;
        }

*/



/*
        static String access$1102(Summary summary1, String s)
        {
            summary1.avatarUrl = s;
            return s;
        }

*/





/*
        static String access$202(Summary summary1, String s)
        {
            summary1.firstName = s;
            return s;
        }

*/



/*
        static String access$302(Summary summary1, String s)
        {
            summary1.lastName = s;
            return s;
        }

*/



/*
        static boolean access$402(Summary summary1, boolean flag)
        {
            summary1.isIqEnabled = flag;
            return flag;
        }

*/



/*
        static boolean access$502(Summary summary1, boolean flag)
        {
            summary1.isPrimaryProfile = flag;
            return flag;
        }

*/



/*
        static Social access$602(Summary summary1, Social social1)
        {
            summary1.social = social1;
            return social1;
        }

*/



/*
        static boolean access$702(Summary summary1, boolean flag)
        {
            summary1.isAutoPlayEnabled = flag;
            return flag;
        }

*/



/*
        static String access$802(Summary summary1, String s)
        {
            summary1.experienceType = s;
            return s;
        }

*/



/*
        static String access$902(Summary summary1, String s)
        {
            summary1.userId = s;
            return s;
        }

*/

        public Summary()
        {
            this$0 = UserProfile.this;
            super();
        }
    }


    private static final String FIELD_AUTOPLAY_ON = "autoPlayOn";
    private static final String FIELD_AVATAR_URL = "avatarUrl";
    private static final String FIELD_EMAIL = "email";
    private static final String FIELD_EPERIENCE = "experienceType";
    private static final String FIELD_FIRST_NAME = "firstName";
    private static final String FIELD_ID = "userId";
    private static final String FIELD_IQ_ENABLED = "isIqEnabled";
    private static final String FIELD_IS_PRIMARY = "isPrimaryProfile";
    private static final String FIELD_LANGUAGES = "languages";
    private static final String FIELD_LAST_NAME = "lastName";
    private static final String FIELD_PROFILE_ID = "profileId";
    private static final String FIELD_PROFILE_NAME = "profileName";
    private static final String FIELD_SOCIAL_STATUS = "socialStatus";
    private static final String TAG = "UserProfile";
    public Operation operation;
    public SubtitlePreference subtitlePreference;
    public Summary summary;

    public UserProfile()
    {
    }

    public UserProfile(String s)
    {
        Object obj1;
        obj1 = null;
        super();
        summary = new Summary();
        summary.languages = new ArrayList();
        summary.social = new Social();
        operation = new Operation();
        Object obj;
        if (!StringUtils.isEmpty(s))
        {
            break MISSING_BLOCK_LABEL_337;
        }
        obj = new JSONObject();
_L1:
        String as[];
        int j;
        summary.userId = JsonUtils.getString(((JSONObject) (obj)), "userId", null);
        summary.profileId = JsonUtils.getString(((JSONObject) (obj)), "profileId", null);
        summary.profileName = JsonUtils.getString(((JSONObject) (obj)), "profileName", null);
        summary.firstName = JsonUtils.getString(((JSONObject) (obj)), "firstName", null);
        summary.lastName = JsonUtils.getString(((JSONObject) (obj)), "lastName", null);
        summary.email = JsonUtils.getString(((JSONObject) (obj)), "email", null);
        summary.isIqEnabled = JsonUtils.getBoolean(((JSONObject) (obj)), "isIqEnabled", false);
        summary.isPrimaryProfile = JsonUtils.getBoolean(((JSONObject) (obj)), "isPrimaryProfile", false);
        summary.isAutoPlayEnabled = JsonUtils.getBoolean(((JSONObject) (obj)), "autoPlayOn", false);
        summary.experienceType = JsonUtils.getString(((JSONObject) (obj)), "experienceType", null);
        summary.social.isConnected = JsonUtils.getBoolean(((JSONObject) (obj)), "socialStatus", false);
        summary.avatarUrl = JsonUtils.getString(((JSONObject) (obj)), "avatarUrl", null);
        String s1 = JsonUtils.getString(((JSONObject) (obj)), "languages", null);
        if (!StringUtils.isNotEmpty(s1))
        {
            break MISSING_BLOCK_LABEL_385;
        }
        as = TextUtils.split(s1, ",");
        j = as.length;
        int i = 0;
        do
        {
            if (i >= j)
            {
                break;
            }
            String s2 = as[i];
            try
            {
                summary.languages.add(new Language(s2));
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                Log.d("UserProfile", (new StringBuilder()).append("failed to create json string=").append(s).append(" exception =").append(obj).toString());
                return;
            }
            i++;
        } while (true);
        break MISSING_BLOCK_LABEL_385;
        obj = new JSONObject(s);
          goto _L1
        obj = JsonUtils.getString(((JSONObject) (obj)), "subtitleOverride", null);
        if (!StringUtils.isEmpty(((String) (obj))))
        {
            break MISSING_BLOCK_LABEL_408;
        }
        obj = obj1;
_L3:
        subtitlePreference = ((SubtitlePreference) (obj));
        return;
        obj = new SubtitlePreference(((String) (obj)));
        if (true) goto _L3; else goto _L2
_L2:
    }

    public String getAvatarUrl()
    {
        if (summary == null)
        {
            return null;
        } else
        {
            return summary.avatarUrl;
        }
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

    public String getEperienceType()
    {
        if (summary == null)
        {
            return null;
        } else
        {
            return summary.experienceType;
        }
    }

    public String getFirstName()
    {
        if (summary == null)
        {
            return null;
        } else
        {
            return StringUtils.decodeHtmlEntities(summary.firstName);
        }
    }

    public String getGeoCountry()
    {
        if (summary == null)
        {
            return null;
        } else
        {
            return summary.geoCountry;
        }
    }

    public String[] getLanguages()
    {
        if (summary != null) goto _L2; else goto _L1
_L1:
        String as[] = null;
_L4:
        return as;
_L2:
        String as1[] = new String[summary.languages.size()];
        int i = 0;
        Iterator iterator = summary.languages.iterator();
        do
        {
            as = as1;
            if (!iterator.hasNext())
            {
                continue;
            }
            as1[i] = ((Language)iterator.next()).code;
            i++;
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    public String getLanguagesInCsv()
    {
        if (summary == null)
        {
            return null;
        } else
        {
            return TextUtils.join(",", getLanguagesList());
        }
    }

    public List getLanguagesList()
    {
        if (summary != null) goto _L2; else goto _L1
_L1:
        Object obj = null;
_L4:
        return ((List) (obj));
_L2:
        ArrayList arraylist = new ArrayList();
        Iterator iterator = summary.languages.iterator();
        do
        {
            obj = arraylist;
            if (!iterator.hasNext())
            {
                continue;
            }
            arraylist.add(((Language)iterator.next()).code);
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    public String getLastName()
    {
        if (summary == null)
        {
            return null;
        } else
        {
            return StringUtils.decodeHtmlEntities(summary.lastName);
        }
    }

    public String getProfileId()
    {
        if (summary == null)
        {
            return null;
        } else
        {
            return summary.profileId;
        }
    }

    public String getProfileName()
    {
        if (summary == null)
        {
            return null;
        } else
        {
            return StringUtils.decodeHtmlEntities(summary.profileName);
        }
    }

    public ProfileType getProfileType()
    {
        if (summary != null)
        {
            if (summary.enumType == null)
            {
                summary.enumType = ProfileType.create(summary.experienceType);
            }
            return summary.enumType;
        } else
        {
            return ProfileType.STANDARD;
        }
    }

    public String getReqCountry()
    {
        if (summary == null)
        {
            return null;
        } else
        {
            return summary.reqCountry;
        }
    }

    public SubtitlePreference getSubtitlePreference()
    {
        return subtitlePreference;
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

    public boolean isAutoPlayEnabled()
    {
        if (summary == null)
        {
            return false;
        } else
        {
            return summary.isAutoPlayEnabled;
        }
    }

    public boolean isIQEnabled()
    {
        if (summary == null)
        {
            return false;
        } else
        {
            return summary.isIqEnabled;
        }
    }

    public boolean isKidsProfile()
    {
        return getProfileType() == ProfileType.JFK;
    }

    public boolean isPrimaryProfile()
    {
        if (summary == null)
        {
            return false;
        } else
        {
            return summary.isPrimaryProfile;
        }
    }

    public boolean isSocialConnected()
    {
        if (summary == null)
        {
            return false;
        } else
        {
            return summary.social.isConnected;
        }
    }

    public void setFacebookConnectStatus(boolean flag)
    {
        summary.social.isConnected = flag;
    }

    public String toString()
    {
        JSONObject jsonobject = new JSONObject();
        try
        {
            jsonobject.put("userId", getUserId());
            jsonobject.put("profileId", getProfileId());
            jsonobject.put("profileName", getProfileName());
            jsonobject.put("firstName", getFirstName());
            jsonobject.put("lastName", getLastName());
            jsonobject.put("email", getEmail());
            jsonobject.put("isIqEnabled", isIQEnabled());
            jsonobject.put("isPrimaryProfile", isPrimaryProfile());
            jsonobject.put("autoPlayOn", isAutoPlayEnabled());
            jsonobject.put("experienceType", getEperienceType());
            jsonobject.put("socialStatus", isSocialConnected());
            jsonobject.put("avatarUrl", getAvatarUrl());
            jsonobject.put("languages", getLanguagesInCsv());
            if (subtitlePreference != null)
            {
                jsonobject.put("subtitleOverride", subtitlePreference.toString());
            }
        }
        catch (JSONException jsonexception)
        {
            Log.d("UserProfile", (new StringBuilder()).append("failed in json string ").append(jsonexception).toString());
        }
        Log.d("UserProfile", (new StringBuilder()).append("user string=").append(jsonobject.toString()).toString());
        return jsonobject.toString();
    }
}
