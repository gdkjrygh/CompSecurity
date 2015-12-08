// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.shortcircuit;

import java.io.Serializable;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.skype.android.app.shortcircuit:
//            ShortCircuitProfileWebClient

public static class _cls0 extends JSONObject
    implements Serializable
{

    private boolean isMsa()
    {
        return optString("Source").compareToIgnoreCase("Msa") == 0;
    }

    private boolean isVerified()
    {
        return optString("State").compareToIgnoreCase("Verified") == 0;
    }

    private void updateSearchableState(boolean flag)
    {
        try
        {
            put("Searchable", flag);
            return;
        }
        catch (JSONException jsonexception)
        {
            jsonexception.printStackTrace();
        }
    }

    public String getAlias()
    {
        return optString("Name");
    }

    public String getCountry()
    {
        return optString("Country");
    }

    public boolean isSearchable()
    {
        return optBoolean("Searchable");
    }




    public (JSONObject jsonobject)
        throws JSONException
    {
        this(jsonobject, ShortCircuitProfileWebClient.access$1000());
    }

    public _cls0(JSONObject jsonobject, String as[])
        throws JSONException
    {
        super(jsonobject, as);
    }
}
