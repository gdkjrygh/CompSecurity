// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.mdx.message.target;

import com.netflix.mediaclient.service.mdx.message.MdxMessage;
import org.json.JSONException;
import org.json.JSONObject;

public final class HandshakeAccepted extends MdxMessage
{

    private static final String PROPERTY_accepted = "accepted";
    private static final String PROPERTY_contractVersion = "contractVersion";
    private static final String PROPERTY_volumeControl = "volumeControl";
    private static final String PROPERTY_volumeStep = "volumeStep";
    private boolean mAccepted;
    private int mContractVersion;
    private boolean mVolumeControl;
    private int mVolumeStep;

    public HandshakeAccepted(JSONObject jsonobject)
        throws JSONException
    {
        super("HANDSHAKE_ACCEPTED");
        mJson = jsonobject;
        mContractVersion = jsonobject.optInt("contractVersion");
        mAccepted = jsonobject.getBoolean("accepted");
        if (jsonobject.has("volumeControl"))
        {
            mVolumeControl = jsonobject.optBoolean("volumeControl");
        }
        if (jsonobject.has("volumeStep"))
        {
            mVolumeStep = jsonobject.optInt("volumeStep");
        }
    }

    public int getContractVersion()
    {
        return mContractVersion;
    }

    public int getVolumeStep()
    {
        return mVolumeStep;
    }

    public boolean isAccepted()
    {
        return mAccepted;
    }

    public boolean isVolumeControl()
    {
        return mVolumeControl;
    }

    public String toString()
    {
        return (new StringBuilder()).append("HandshakeAccepted [contractVersion=").append(mContractVersion).append(", accepted=").append(mAccepted).append(", volumeControl=").append(mVolumeControl).append(", volumeStep=").append(mVolumeStep).append("]").toString();
    }
}
