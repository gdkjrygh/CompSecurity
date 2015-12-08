// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.search;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.skype.android.app.search:
//            AgentInfo

public class AgentProvisioningServiceResponse
{

    private static final String ATTRIBUTE_AGENTID = "agentId";
    private static final String ATTRIBUTE_AGENTTYPE = "agentType";
    private static final String ATTRIBUTE_CAPABILITIES = "capabilities";
    private static final String ATTRIBUTE_DESCRIPTION = "description";
    private static final String ATTRIBUTE_DISPLAYNAME = "displayName";
    private static final String ATTRIBUTE_ISTRUSTED = "isTrusted";
    private static final String ATTRIBUTE_STARRATING = "starRating";
    private static final String ATTRIBUTE_SUPPORTEDLOCALES = "supportedLocales";
    private static final String ATTRIBUTE_USERTILEURL = "userTileLargeUrl";
    private static final String ATTRIBUTE_WEBPAGE = "webpage";
    public static final String JSON_AGENT_DESCRIPTIONS = "agentDescriptions";
    private static final Logger log = Logger.getLogger("AgentProvisioningServiceResponse");
    private List agentInfo;

    public AgentProvisioningServiceResponse()
    {
        agentInfo = new ArrayList();
    }

    public AgentProvisioningServiceResponse(List list)
    {
        if (list == null)
        {
            throw new IllegalArgumentException("agentInfo");
        } else
        {
            agentInfo = list;
            return;
        }
    }

    private static JSONObject getJSONObjectFromString(String s)
    {
        try
        {
            s = new JSONObject(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            log.info((new StringBuilder("parse JSONException:")).append(s.getMessage()).toString());
            return null;
        }
        return s;
    }

    public static AgentProvisioningServiceResponse parse(String s)
    {
        s = getJSONObjectFromString(s);
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_49;
        }
        s = new AgentProvisioningServiceResponse(profileData(s));
        return s;
        s;
        log.info((new StringBuilder("parse profileData JSONException:")).append(s.getMessage()).toString());
        return null;
    }

    private static List profileData(JSONObject jsonobject)
        throws JSONException
    {
        ArrayList arraylist = new ArrayList();
        jsonobject = jsonobject.getJSONArray("agentDescriptions");
        int j = jsonobject.length();
        if (j != 0)
        {
            for (int i = 0; i < j; i++)
            {
                AgentInfo agentinfo = new AgentInfo();
                JSONObject jsonobject1 = jsonobject.getJSONObject(i);
                agentinfo.setDisplayName(jsonobject1.optString("displayName"));
                agentinfo.setAgentId(jsonobject1.optString("agentId"));
                agentinfo.setDescription(jsonobject1.optString("description"));
                agentinfo.setTileUrl(jsonobject1.optString("userTileLargeUrl"));
                arraylist.add(agentinfo);
            }

        }
        return arraylist;
    }

    public List getAgentInfo()
    {
        return agentInfo;
    }

}
