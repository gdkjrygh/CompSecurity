// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xwalk.core.internal.extension.api.contacts;

import android.util.Log;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package org.xwalk.core.internal.extension.api.contacts:
//            ContactFinder

private class <init>
{

    public JSONArray aAddresses;
    public JSONArray aCategories;
    public JSONArray aEmails;
    public JSONArray aImpp;
    public JSONArray aJobTitles;
    public JSONArray aNotes;
    public JSONArray aNumbers;
    public JSONArray aOrganizations;
    public JSONArray aPhotos;
    public JSONArray aUrls;
    public String anniversary;
    public String birthday;
    public String gender;
    public String lastUpdated;
    public JSONObject oName;
    final ContactFinder this$0;

    private void ensurePut(JSONObject jsonobject, String s, Object obj)
    {
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_11;
        }
        jsonobject.put(s, obj);
        return;
        jsonobject;
        Log.e("ContactFinder", (new StringBuilder()).append("ensurePut - Failed to add json data: ").append(jsonobject.toString()).toString());
        return;
    }

    public JSONObject ensurePut(long l)
    {
        JSONObject jsonobject = new JSONObject();
        try
        {
            jsonobject.put("id", l);
        }
        catch (JSONException jsonexception)
        {
            Log.e("ContactFinder", (new StringBuilder()).append("ensurePut - Failed to build json data: ").append(jsonexception.toString()).toString());
        }
        ensurePut(jsonobject, "name", oName);
        ensurePut(jsonobject, "lastUpdated", lastUpdated);
        ensurePut(jsonobject, "emails", aEmails);
        ensurePut(jsonobject, "photos", aPhotos);
        ensurePut(jsonobject, "urls", aUrls);
        ensurePut(jsonobject, "categories", aCategories);
        ensurePut(jsonobject, "addresses", aAddresses);
        ensurePut(jsonobject, "phoneNumbers", aNumbers);
        ensurePut(jsonobject, "organizations", aOrganizations);
        ensurePut(jsonobject, "jobTitles", aJobTitles);
        ensurePut(jsonobject, "birthday", birthday);
        ensurePut(jsonobject, "notes", aNotes);
        ensurePut(jsonobject, "impp", aImpp);
        ensurePut(jsonobject, "anniversary", anniversary);
        ensurePut(jsonobject, "gender", gender);
        return jsonobject;
    }

    private ()
    {
        this$0 = ContactFinder.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
