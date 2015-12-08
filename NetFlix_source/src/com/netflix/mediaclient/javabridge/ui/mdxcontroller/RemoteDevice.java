// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.javabridge.ui.mdxcontroller;

import com.netflix.mediaclient.util.JsonUtils;
import java.net.URLDecoder;
import org.json.JSONException;
import org.json.JSONObject;

public class RemoteDevice
{

    private static final String ATTR_USN = "USN";
    private static final String ATTR_UUID = "UUID";
    private static final String ATTR_activated = "activated";
    private static final String ATTR_dialUsn = "dialUsn";
    private static final String ATTR_dialUuid = "dialUuid";
    private static final String ATTR_friendlyName = "friendlyName";
    private static final String ATTR_launchStatus = "launchStatus";
    private static final String ATTR_location = "location";
    private static final String ATTR_pairingContext = "pairingContext";
    private static final String ATTR_registrationAcceptance = "registrationAcceptance";
    private static final String ATTR_serviceType = "serviceType";
    private static final String ATTR_usn = "usn";
    private static final String ATTR_uuid = "uuid";
    public boolean activated;
    public String dialUsn;
    public String dialUuid;
    public String friendlyName;
    public int launchStatus;
    public String location;
    public String pairingContext;
    public int registrationAcceptance;
    public String serviceType;
    public String usn;
    public String uuid;

    public RemoteDevice()
    {
    }

    public static String decode(String s)
    {
        if (s == null || "".equals(s.trim()))
        {
            return s;
        }
        String s1;
        try
        {
            s1 = URLDecoder.decode(s, "UTF-8");
        }
        catch (Throwable throwable)
        {
            return s;
        }
        return s1;
    }

    public static RemoteDevice toRemoteDevice(JSONObject jsonobject)
        throws JSONException
    {
        RemoteDevice remotedevice = new RemoteDevice();
        remotedevice.usn = JsonUtils.getString(jsonobject, "usn", JsonUtils.getString(jsonobject, "USN", null));
        remotedevice.dialUsn = JsonUtils.getString(jsonobject, "dialUsn", null);
        remotedevice.uuid = JsonUtils.getString(jsonobject, "uuid", JsonUtils.getString(jsonobject, "UUID", null));
        remotedevice.dialUuid = JsonUtils.getString(jsonobject, "dialUuid", null);
        remotedevice.pairingContext = JsonUtils.getString(jsonobject, "pairingContext", null);
        remotedevice.activated = JsonUtils.getBoolean(jsonobject, "activated", true);
        remotedevice.location = JsonUtils.getString(jsonobject, "location", null);
        remotedevice.friendlyName = JsonUtils.getString(jsonobject, "friendlyName", null);
        remotedevice.serviceType = JsonUtils.getString(jsonobject, "serviceType", null);
        remotedevice.registrationAcceptance = JsonUtils.getInt(jsonobject, "registrationAcceptance", 0);
        remotedevice.launchStatus = JsonUtils.getInt(jsonobject, "launchStatus", 0);
        try
        {
            if (remotedevice.friendlyName != null)
            {
                remotedevice.friendlyName = URLDecoder.decode(remotedevice.friendlyName, "UTF-8");
            }
            if (remotedevice.usn != null)
            {
                remotedevice.usn = URLDecoder.decode(remotedevice.usn, "UTF-8");
            }
            if (remotedevice.dialUsn != null)
            {
                remotedevice.dialUsn = URLDecoder.decode(remotedevice.dialUsn, "UTF-8");
            }
            if (remotedevice.uuid != null)
            {
                remotedevice.uuid = URLDecoder.decode(remotedevice.uuid, "UTF-8");
            }
            if (remotedevice.dialUuid != null)
            {
                remotedevice.dialUuid = URLDecoder.decode(remotedevice.dialUuid, "UTF-8");
            }
        }
        // Misplaced declaration of an exception variable
        catch (JSONObject jsonobject)
        {
            return remotedevice;
        }
        return remotedevice;
    }

    public String toString()
    {
        return (new StringBuilder()).append("RemoteDevice [usn=").append(usn).append(", uuid=").append(uuid).append(", location=").append(location).append(", friendlyName=").append(friendlyName).append(", dialUsn=").append(dialUsn).append(", dialUuid=").append(dialUuid).append(", launchStatus=").append(launchStatus).append(", registrationAcceptance=").append(registrationAcceptance).append(", activated=").append(activated).append(", pairingContext=").append(pairingContext).append(", serviceType=").append(serviceType).append("]").toString();
    }
}
