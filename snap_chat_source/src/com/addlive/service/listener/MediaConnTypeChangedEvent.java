// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.addlive.service.listener;

import com.addlive.service.ConnectionType;
import com.addlive.service.MediaType;
import org.json.JSONObject;

public class MediaConnTypeChangedEvent
{

    private String connectionType;
    private String mediaType;
    private String scopeId;

    public MediaConnTypeChangedEvent(JSONObject jsonobject)
    {
        scopeId = jsonobject.getString("scopeId");
        mediaType = jsonobject.getString("mediaType");
        connectionType = jsonobject.getString("connectionType");
    }

    public ConnectionType getConnectionType()
    {
        return ConnectionType.fromString(connectionType);
    }

    public MediaType getMediaType()
    {
        return MediaType.fromString(mediaType);
    }

    public String getScopeId()
    {
        return scopeId;
    }

    public String toString()
    {
        return (new StringBuilder("MediaConnTypeChangedEvent{scopeId=")).append(scopeId).append(", mediaType=").append(mediaType).append(", connectionType=").append(connectionType).append("}").toString();
    }
}
