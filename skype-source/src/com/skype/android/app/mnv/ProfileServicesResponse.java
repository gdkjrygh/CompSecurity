// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.mnv;

import android.text.TextUtils;
import com.skype.android.analytics.AnalyticsEvent;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.skype.android.app.mnv:
//            MnvAnalytics, e

public class ProfileServicesResponse
{
    public static class ProfileData
        implements e
    {

        private boolean alert;
        private List entries;

        public List getEntries()
        {
            return entries;
        }

        public boolean isMsaSource(Entries entries1)
        {
            return entries1.getSource() == a.MSA;
        }

        public boolean isQosAlert()
        {
            return alert;
        }

        public boolean isSearchable(Entries entries1)
        {
            return entries1.getSearchable();
        }

        public boolean isSkypeSource(Entries entries1)
        {
            return entries1.getSource() == a.SKYPE;
        }

        public boolean isStateVerificationPending(Entries entries1)
        {
            return entries1.getState() == b.VERIFICATION_PENDING;
        }

        public boolean isSuccess()
        {
            return true;
        }

        public boolean isSuggestedVerifyMethod(Entries entries1, MnvUtil.VERIFY_METHOD verify_method)
        {
            return entries1.getVerifyMethod().equalsIgnoreCase(verify_method.verifyMethod());
        }

        public boolean isVerified(Entries entries1)
        {
            return entries1.getState() == b.VERIFIED;
        }

        public void setEntries(JSONObject jsonobject)
        {
            try
            {
                entries.add(new Entries(jsonobject));
                return;
            }
            // Misplaced declaration of an exception variable
            catch (JSONObject jsonobject)
            {
                jsonobject.printStackTrace();
            }
        }

        public void setQosAlert(boolean flag)
        {
            alert = flag;
        }

        public ProfileData()
        {
            entries = new ArrayList();
        }
    }

    public static class ProfileData.Entries extends JSONObject
    {

        private String cleanCountry(String s)
        {
            String as[] = TextUtils.split(s, "-");
            if (as.length != 2)
            {
                return s;
            }
            if (as[0].equalsIgnoreCase("uk"))
            {
                s = "gb";
            } else
            {
                s = as[0];
            }
            as[0] = s;
            return (new StringBuilder()).append(as[0]).append("-").append(as[1]).toString();
        }

        public String getCountry()
        {
            return cleanCountry(optString("Country"));
        }

        public String getName()
        {
            return optString("Name");
        }

        public boolean getSearchable()
        {
            return optBoolean("Searchable");
        }

        public a getSource()
        {
            return a.get(optString("Source"));
        }

        public b getState()
        {
            return b.get(optString("State"));
        }

        public String getVerifyMethod()
        {
            return optString("SuggestedVerifyMethod");
        }

        public boolean isVerified()
        {
            return getState() == b.VERIFIED;
        }

        public ProfileData.Entries(JSONObject jsonobject)
            throws JSONException
        {
            this(jsonobject, ProfileServicesResponse.DATA_ATTRIBUTES);
        }

        public ProfileData.Entries(JSONObject jsonobject, String as[])
            throws JSONException
        {
            super(jsonobject, as);
        }
    }

    public static class ProfileError extends JSONObject
        implements e
    {

        public String getCode()
        {
            return optString("Code");
        }

        public int getHttpResult()
        {
            return optInt("HttpResult");
        }

        public String getSubCode()
        {
            return optString("SubCode");
        }

        public boolean isQosAlert()
        {
            return false;
        }

        public boolean isSuccess()
        {
            return false;
        }

        public void setQosAlert(boolean flag)
        {
        }

        public ProfileError(JSONObject jsonobject)
            throws JSONException
        {
            this(jsonobject, ProfileServicesResponse.ERROR_ATTRIBUTES);
        }

        public ProfileError(JSONObject jsonobject, String as[])
            throws JSONException
        {
            super(jsonobject, as);
        }
    }

    static final class a extends Enum
    {

        private static final a $VALUES[];
        public static final a MSA;
        public static final a SKYPE;
        private static final Map lookup;
        private final String source;

        public static a get(String s)
        {
            return (a)lookup.get(s);
        }

        public static a valueOf(String s)
        {
            return (a)Enum.valueOf(com/skype/android/app/mnv/ProfileServicesResponse$a, s);
        }

        public static a[] values()
        {
            return (a[])$VALUES.clone();
        }

        public final String getSource()
        {
            return source;
        }

        public final String toString()
        {
            return source;
        }

        static 
        {
            MSA = new a("MSA", 0, "Msa");
            SKYPE = new a("SKYPE", 1, "Skype");
            $VALUES = (new a[] {
                MSA, SKYPE
            });
            lookup = new HashMap();
            a aa[] = values();
            int j = aa.length;
            for (int i = 0; i < j; i++)
            {
                a a1 = aa[i];
                lookup.put(a1.getSource(), a1);
            }

        }

        private a(String s, int i, String s1)
        {
            super(s, i);
            source = s1;
        }
    }

    static final class b extends Enum
    {

        private static final b $VALUES[];
        public static final b UN_VERIFIED;
        public static final b VERIFICATION_PENDING;
        public static final b VERIFIED;
        private static final Map lookup;
        private final String state;

        public static b get(String s)
        {
            return (b)lookup.get(s);
        }

        public static b valueOf(String s)
        {
            return (b)Enum.valueOf(com/skype/android/app/mnv/ProfileServicesResponse$b, s);
        }

        public static b[] values()
        {
            return (b[])$VALUES.clone();
        }

        public final String getState()
        {
            return state;
        }

        public final String toString()
        {
            return state;
        }

        static 
        {
            VERIFIED = new b("VERIFIED", 0, "Verified");
            UN_VERIFIED = new b("UN_VERIFIED", 1, "Unverified");
            VERIFICATION_PENDING = new b("VERIFICATION_PENDING", 2, "VerificationPending");
            $VALUES = (new b[] {
                VERIFIED, UN_VERIFIED, VERIFICATION_PENDING
            });
            lookup = new HashMap();
            b ab[] = values();
            int j = ab.length;
            for (int i = 0; i < j; i++)
            {
                b b1 = ab[i];
                lookup.put(b1.getState(), b1);
            }

        }

        private b(String s, int i, String s1)
        {
            super(s, i);
            state = s1;
        }
    }


    private static final String ATTRIBUTE_DATA_ALERT = "PhoneVerificationQosAlert";
    private static final String ATTRIBUTE_DATA_COUNTRY = "Country";
    private static final String ATTRIBUTE_DATA_NAME = "Name";
    private static final String ATTRIBUTE_DATA_PHONES = "PersonalContactProfile.Phones";
    private static final String ATTRIBUTE_DATA_SEARCHABLE = "Searchable";
    private static final String ATTRIBUTE_DATA_SOURCE = "Source";
    private static final String ATTRIBUTE_DATA_STATE = "State";
    private static final String ATTRIBUTE_DATA_VERIFY_METHOD = "SuggestedVerifyMethod";
    private static final String ATTRIBUTE_ERROR_CODE = "Code";
    private static final String ATTRIBUTE_ERROR_HTTP_RESULT = "HttpResult";
    private static final String ATTRIBUTE_ERROR_SUB_CODE = "SubCode";
    private static final String DATA_ATTRIBUTES[] = {
        "Country", "SuggestedVerifyMethod", "Name", "Searchable", "State", "Source"
    };
    private static final String ERROR_ATTRIBUTES[] = {
        "Code", "SubCode", "HttpResult"
    };
    public static final String JSON_ATTRIBUTES = "Attributes";
    public static final String JSON_ERRORS = "Errors";
    public static final String JSON_VALUE = "Value";
    public static final String JSON_VIEWS = "Views";
    public static final int QOS_ALERT_VALUE = 1;
    private static final Logger log = Logger.getLogger("ProfileServicesResponse");
    private final MnvAnalytics mnvAnalytics;
    private e profileResponse;

    public ProfileServicesResponse(MnvAnalytics mnvanalytics)
    {
        mnvAnalytics = mnvanalytics;
    }

    private JSONObject getJSONException()
    {
        JSONObject jsonobject;
        try
        {
            jsonobject = new JSONObject("{ \"Errors\": [ { \"Code\": \"JsonException\", \"HttpResult\": 400 } ], \"Views\": [], \"TraceGraph\": null }");
        }
        catch (JSONException jsonexception)
        {
            log.severe((new StringBuilder("Enable to create JSONObject object: ")).append(jsonexception.getMessage()).toString());
            return null;
        }
        return jsonobject;
    }

    private JSONObject getJSONObjectFromString(String s)
    {
        try
        {
            s = new JSONObject(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            log.info((new StringBuilder("MNV ProfileServicesResponse.parse JSONException:")).append(s.getMessage()).toString());
            return null;
        }
        return s;
    }

    private ProfileData profileData(JSONObject jsonobject)
        throws JSONException
    {
        ProfileData profiledata;
        profiledata = new ProfileData();
        jsonobject = jsonobject.getJSONArray("Views");
        if (jsonobject.length() != 0) goto _L2; else goto _L1
_L1:
        profiledata.setEntries(new JSONObject());
_L4:
        return profiledata;
_L2:
        jsonobject = jsonobject.getJSONObject(0).getJSONArray("Attributes");
        int k = jsonobject.length();
        for (int i = 0; i < k; i++)
        {
            JSONObject jsonobject1 = jsonobject.getJSONObject(i);
            if (jsonobject1.optString("Name").equals("PhoneVerificationQosAlert") && jsonobject1.getInt("Value") == 1)
            {
                profiledata.setEntries(new JSONObject());
                profiledata.setQosAlert(true);
                return profiledata;
            }
        }

        int j = 0;
        do
        {
            if (j < k)
            {
label0:
                {
                    JSONObject jsonobject2 = jsonobject.getJSONObject(j);
                    if (!jsonobject2.optString("Name").equals("PersonalContactProfile.Phones"))
                    {
                        break label0;
                    }
                    jsonobject = jsonobject2.getJSONArray("Value");
                    j = 0;
                    while (j < jsonobject.length()) 
                    {
                        profiledata.setEntries(jsonobject.getJSONObject(j));
                        j++;
                    }
                }
            }
            if (true)
            {
                continue;
            }
            j++;
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    private ProfileError profileErrors(JSONObject jsonobject)
    {
        Object obj = null;
        JSONObject jsonobject1;
        int i;
        try
        {
            jsonobject1 = jsonobject.getJSONArray("Errors").getJSONObject(0);
            i = jsonobject1.length();
        }
        // Misplaced declaration of an exception variable
        catch (JSONObject jsonobject)
        {
            log.info((new StringBuilder("MNV profileErrors JSONException:")).append(jsonobject.getMessage()).toString());
            mnvAnalytics.reportServerError("MnvHttpProfileErrorsJsonException", AnalyticsEvent.cB);
            return null;
        }
        jsonobject = obj;
        if (i <= 0)
        {
            break MISSING_BLOCK_LABEL_35;
        }
        jsonobject = new ProfileError(jsonobject1);
        return jsonobject;
        jsonobject;
        log.info((new StringBuilder("MNV profileErrors JSONException:")).append(jsonobject.getMessage()).toString());
        mnvAnalytics.reportServerError("MnvHttpProfileErrorsJsonException", AnalyticsEvent.cB);
        return null;
    }

    private void reportInvalidJson()
    {
        profileResponse = profileErrors(getJSONException());
        mnvAnalytics.reportServerError("MnvHttpJsonException", AnalyticsEvent.cB);
    }

    e getProfileResponse()
    {
        return profileResponse;
    }

    public void parse(String s)
    {
        JSONObject jsonobject = getJSONObjectFromString(s);
        if (jsonobject == null)
        {
            reportInvalidJson();
            return;
        }
        if (jsonobject.has("Errors"))
        {
            profileResponse = profileErrors(jsonobject);
            return;
        }
        if (jsonobject.has("Views"))
        {
            try
            {
                profileResponse = profileData(jsonobject);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                profileResponse = profileErrors(getJSONException());
            }
            log.info((new StringBuilder("MNV ProfileServicesResponse.parse profileData JSONException:")).append(s.getMessage()).toString());
            mnvAnalytics.reportServerError("MnvHttpProfileDataJsonException", AnalyticsEvent.cB);
            return;
        } else
        {
            log.info((new StringBuilder("MNV ProfileServicesResponse.parse no JSON_ERROR and no JSON_VIEWS, response=")).append(s).toString());
            reportInvalidJson();
            return;
        }
    }



}
