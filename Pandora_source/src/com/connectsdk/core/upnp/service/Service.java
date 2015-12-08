// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.connectsdk.core.upnp.service;

import java.util.List;

public class Service
{

    public static final String TAG = "service";
    public static final String TAG_CONTROL_URL = "controlURL";
    public static final String TAG_EVENTSUB_URL = "eventSubURL";
    public static final String TAG_SCPD_URL = "SCPDURL";
    public static final String TAG_SERVICE_ID = "serviceId";
    public static final String TAG_SERVICE_TYPE = "serviceType";
    public String SCPDURL;
    public List actionList;
    public String baseURL;
    public String controlURL;
    public String eventSubURL;
    public String serviceId;
    public List serviceStateTable;
    public String serviceType;

    public Service()
    {
    }

    public void init()
    {
    }
}
