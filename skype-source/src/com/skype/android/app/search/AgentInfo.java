// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.search;


public class AgentInfo
{

    public static final String AGENT_ID_PREFIX = "28:";
    private String agentId;
    private String description;
    private String displayName;
    private String tileUrl;

    public AgentInfo()
    {
    }

    public boolean equals(Object obj)
    {
        if (obj instanceof AgentInfo)
        {
            return ((AgentInfo)obj).getAgentId().equals(getAgentId());
        } else
        {
            return false;
        }
    }

    public String getAgentId()
    {
        return agentId;
    }

    public String getDescription()
    {
        return description;
    }

    public String getDisplayName()
    {
        return displayName;
    }

    public String getIdentity()
    {
        return (new StringBuilder("28:")).append(getAgentId()).toString();
    }

    public String getTileUrl()
    {
        return tileUrl;
    }

    public int hashCode()
    {
        return getAgentId().hashCode();
    }

    public void setAgentId(String s)
    {
        agentId = s;
    }

    public void setDescription(String s)
    {
        description = s;
    }

    public void setDisplayName(String s)
    {
        displayName = s;
    }

    public void setTileUrl(String s)
    {
        tileUrl = s;
    }
}
