// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.javabridge.ui;

import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.util.JsonUtils;
import org.json.JSONException;
import org.json.JSONObject;

public final class ActivationTokens
{

    private static final String TAG = "nf_reg";
    private JSONObject json;
    public String netflixId;
    public String secureNetflixId;

    public ActivationTokens(String s)
        throws JSONException
    {
        parseTokens(s);
    }

    public ActivationTokens(String s, String s1)
        throws JSONException
    {
        netflixId = s;
        secureNetflixId = s1;
        createJson();
    }

    public ActivationTokens(JSONObject jsonobject)
        throws JSONException
    {
        parseTokens(jsonobject);
    }

    private void createJson()
        throws JSONException
    {
        if (netflixId != null && secureNetflixId != null)
        {
            json = new JSONObject();
            json.put("NetflixId", netflixId);
            json.put("SecureNetflixId", secureNetflixId);
            return;
        } else
        {
            throw new JSONException("Tokens cannot be null");
        }
    }

    private void parseTokens(String s)
        throws JSONException
    {
        if (s == null)
        {
            Log.e("nf_reg", "Tokens are null");
            return;
        }
        if ("undefined".equalsIgnoreCase(s))
        {
            Log.d("nf_reg", "Tokens undefined");
            return;
        } else
        {
            json = new JSONObject(s);
            parseTokens(json);
            return;
        }
    }

    private void parseTokens(JSONObject jsonobject)
        throws JSONException
    {
        json = jsonobject;
        if (jsonobject == null)
        {
            Log.e("nf_reg", "Tokens are null");
        } else
        {
            netflixId = JsonUtils.getString(jsonobject, "NetflixId", null);
            secureNetflixId = JsonUtils.getString(jsonobject, "SecureNetflixId", null);
            if (Log.isLoggable("nf_reg", 3))
            {
                Log.d("nf_reg", (new StringBuilder()).append("NetflixID: ").append(netflixId).append(", SecureNetlixId: ").append(secureNetflixId).toString());
            }
            if (netflixId == null || secureNetflixId == null)
            {
                throw new JSONException("Tokens cannot be null");
            }
        }
    }

    public boolean equals(Object obj)
    {
        if (this != obj) goto _L2; else goto _L1
_L1:
        return true;
_L2:
        if (obj == null)
        {
            return false;
        }
        if (!(obj instanceof ActivationTokens))
        {
            return false;
        }
        obj = (ActivationTokens)obj;
        if (netflixId == null)
        {
            if (((ActivationTokens) (obj)).netflixId != null)
            {
                return false;
            }
        } else
        if (!netflixId.equals(((ActivationTokens) (obj)).netflixId))
        {
            return false;
        }
        if (secureNetflixId != null)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (((ActivationTokens) (obj)).secureNetflixId == null) goto _L1; else goto _L3
_L3:
        return false;
        if (secureNetflixId.equals(((ActivationTokens) (obj)).secureNetflixId)) goto _L1; else goto _L4
_L4:
        return false;
    }

    public int hashCode()
    {
        int j = 0;
        int i;
        if (netflixId == null)
        {
            i = 0;
        } else
        {
            i = netflixId.hashCode();
        }
        if (secureNetflixId != null)
        {
            j = secureNetflixId.hashCode();
        }
        return (i + 31) * 31 + j;
    }

    public JSONObject toJSON()
    {
        return json;
    }

    public String toString()
    {
        return json.toString();
    }
}
