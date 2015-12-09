// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.event.nrdp.mdx.discovery;

import com.netflix.mediaclient.event.nrdp.JsonBaseNccpEvent;
import org.json.JSONException;
import org.json.JSONObject;

public class RemoteDeviceReadyEvent extends JsonBaseNccpEvent
{

    private static final String ATTR_dialUsn = "dialUsn";
    private static final String ATTR_launchStatus = "launchStatus";
    private static final String ATTR_uuid = "uuid";
    private static final String DIALUSN_PREFIX = "uuid:";
    public static final com.netflix.mediaclient.javabridge.ui.Mdx.Events TYPE;
    private String mDialUsn;
    private int mLaunchStatus;
    private String mUuid;

    public RemoteDeviceReadyEvent(JSONObject jsonobject)
        throws JSONException
    {
        super(TYPE.getName(), jsonobject);
    }

    public String getDialUsn()
    {
        return mDialUsn;
    }

    public int getLaunchStatus()
    {
        return mLaunchStatus;
    }

    public String getObject()
    {
        return "nrdp.mdx";
    }

    public String getUuid()
    {
        return mUuid;
    }

    protected void populate(JSONObject jsonobject)
        throws JSONException
    {
        mDialUsn = getUrlDecodedString(jsonobject, "dialUsn", null);
        mUuid = getUrlDecodedString(jsonobject, "uuid", null);
        mLaunchStatus = getInt(jsonobject, "launchStatus", 0);
        if (mUuid == null && mDialUsn != null)
        {
            mUuid = mDialUsn.substring("uuid:".length());
        }
    }

    static 
    {
        TYPE = com.netflix.mediaclient.javabridge.ui.Mdx.Events.mdx_discovery_remoteDeviceReady;
    }
}
