// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.addlive.service;

import org.json.JSONObject;

// Referenced classes of package com.addlive.service:
//            VideoStreamDescriptor, AuthDetails

public class ConnectionDescriptor
{
    public static final class ConnectionType extends Enum
    {

        private static final ConnectionType $VALUES[];
        public static final ConnectionType BROADCAST_CONSUMER;
        public static final ConnectionType BROADCAST_PRODUCER;
        public static final ConnectionType CONFERENCE;

        public static ConnectionType valueOf(String s)
        {
            return (ConnectionType)Enum.valueOf(com/addlive/service/ConnectionDescriptor$ConnectionType, s);
        }

        public static ConnectionType[] values()
        {
            return (ConnectionType[])$VALUES.clone();
        }

        static 
        {
            CONFERENCE = new ConnectionType("CONFERENCE", 0);
            BROADCAST_CONSUMER = new ConnectionType("BROADCAST_CONSUMER", 1);
            BROADCAST_PRODUCER = new ConnectionType("BROADCAST_PRODUCER", 2);
            $VALUES = (new ConnectionType[] {
                CONFERENCE, BROADCAST_CONSUMER, BROADCAST_PRODUCER
            });
        }

        private ConnectionType(String s, int i)
        {
            super(s, i);
        }
    }


    private long applicationId;
    private AuthDetails authDetails;
    private boolean autopublishAudio;
    private boolean autopublishVideo;
    private ConnectionType connectionType;
    private String endpointDetails;
    private String scopeId;
    private String url;
    private VideoStreamDescriptor videoStream;

    public ConnectionDescriptor()
    {
        autopublishVideo = false;
        autopublishAudio = false;
        url = "";
        scopeId = "";
        applicationId = -1L;
        videoStream = new VideoStreamDescriptor();
        authDetails = new AuthDetails();
        endpointDetails = "";
    }

    public long getApplicationId()
    {
        return applicationId;
    }

    public AuthDetails getAuthDetails()
    {
        return authDetails;
    }

    public ConnectionType getConnectionType()
    {
        return connectionType;
    }

    public String getEndpointDetails()
    {
        return endpointDetails;
    }

    public String getScopeId()
    {
        return scopeId;
    }

    public String getUrl()
    {
        return url;
    }

    public VideoStreamDescriptor getVideoStream()
    {
        return videoStream;
    }

    public boolean isAutopublishAudio()
    {
        return autopublishAudio;
    }

    public boolean isAutopublishVideo()
    {
        return autopublishVideo;
    }

    public void setApplicationId(long l)
    {
        applicationId = l;
    }

    public void setAuthDetails(AuthDetails authdetails)
    {
        authDetails = authdetails;
    }

    public void setAutopublishAudio(boolean flag)
    {
        autopublishAudio = flag;
    }

    public void setAutopublishVideo(boolean flag)
    {
        autopublishVideo = flag;
    }

    public void setConnectionType(ConnectionType connectiontype)
    {
        connectionType = connectiontype;
    }

    public void setEndpointDetails(String s)
    {
        endpointDetails = s;
    }

    public void setScopeId(String s)
    {
        scopeId = s;
    }

    public void setUrl(String s)
    {
        url = s;
    }

    public void setVideoStream(VideoStreamDescriptor videostreamdescriptor)
    {
        videoStream = videostreamdescriptor;
    }

    public JSONObject toJSON()
    {
        JSONObject jsonobject = new JSONObject();
        jsonobject.put("scopeId", scopeId);
        jsonobject.put("autopublishAudio", autopublishAudio);
        jsonobject.put("autopublishVideo", autopublishVideo);
        jsonobject.put("url", url);
        jsonobject.put("videoStream", videoStream.toJSON());
        jsonobject.put("endpointDetails", endpointDetails);
        if (connectionType != null)
        {
            jsonobject.put("connectionType", connectionType);
        }
        if (applicationId != -1L)
        {
            jsonobject.put("applicationId", applicationId);
        }
        String s = authDetails.getSignature();
        if (s != null && !s.isEmpty())
        {
            jsonobject.put("authDetails", authDetails.toJSON());
            return jsonobject;
        } else
        {
            jsonobject.put("authToken", authDetails.getToken());
            jsonobject.put("authMac", authDetails.getMac());
            return jsonobject;
        }
    }

    public String toString()
    {
        return (new StringBuilder("ConnectionDescriptor{autopublishVideo=")).append(autopublishVideo).append(", autopublishAudio=").append(autopublishAudio).append(", url='").append(url).append('\'').append(", scopeId='").append(scopeId).append('\'').append(", videoStream='").append(videoStream.toString()).append(", authDetails=").append(authDetails.toString()).append(", endpointDetails=").append(endpointDetails).append(", connectionType=").append(connectionType).append(", applicationId=").append(applicationId).append("}").toString();
    }
}
