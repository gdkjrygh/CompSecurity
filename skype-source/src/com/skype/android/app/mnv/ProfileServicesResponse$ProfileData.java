// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.mnv;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.skype.android.app.mnv:
//            e, ProfileServicesResponse

public static class entries
    implements e
{
    public static class Entries extends JSONObject
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

        public ProfileServicesResponse.a getSource()
        {
            return ProfileServicesResponse.a.get(optString("Source"));
        }

        public ProfileServicesResponse.b getState()
        {
            return ProfileServicesResponse.b.get(optString("State"));
        }

        public String getVerifyMethod()
        {
            return optString("SuggestedVerifyMethod");
        }

        public boolean isVerified()
        {
            return getState() == ProfileServicesResponse.b.VERIFIED;
        }

        public Entries(JSONObject jsonobject)
            throws JSONException
        {
            this(jsonobject, ProfileServicesResponse.access$100());
        }

        public Entries(JSONObject jsonobject, String as[])
            throws JSONException
        {
            super(jsonobject, as);
        }
    }


    private boolean alert;
    private List entries;

    public List getEntries()
    {
        return entries;
    }

    public boolean isMsaSource(Entries entries1)
    {
        return entries1.getSource() == Entries.getSource;
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
        return entries1.getSource() == Entries.getSource;
    }

    public boolean isStateVerificationPending(Entries entries1)
    {
        return entries1.getState() == ON_PENDING;
    }

    public boolean isSuccess()
    {
        return true;
    }

    public boolean isSuggestedVerifyMethod(Entries entries1, Entries entries2)
    {
        return entries1.getVerifyMethod().equalsIgnoreCase(entries2.getVerifyMethod());
    }

    public boolean isVerified(Entries entries1)
    {
        return entries1.getState() == Entries.getState;
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

    public Entries()
    {
        entries = new ArrayList();
    }
}
