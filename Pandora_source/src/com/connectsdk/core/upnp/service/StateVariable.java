// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.connectsdk.core.upnp.service;


public class StateVariable
{

    public static final String TAG = "stateVariable";
    public static final String TAG_DATA_TYPE = "dataType";
    public static final String TAG_NAME = "name";
    String mDataType;
    String mMulticast;
    String mName;
    String mSendEvents;

    public StateVariable()
    {
        mSendEvents = "yes";
        mMulticast = "no";
    }
}
