// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.partner;


// Referenced classes of package com.netflix.mediaclient.partner:
//            ResponseListener, PartnerRequestType

public class PartnerRequest
{

    private int idx;
    private ResponseListener listener;
    private PartnerRequestType requestType;
    private String service;
    private String userId;

    public PartnerRequest(PartnerRequestType partnerrequesttype, String s, String s1, int i, ResponseListener responselistener)
    {
        service = s;
        userId = s1;
        idx = i;
        listener = responselistener;
        requestType = partnerrequesttype;
    }

    public String getId()
    {
        return String.valueOf(idx);
    }

    public int getIdx()
    {
        return idx;
    }

    public ResponseListener getListener()
    {
        return listener;
    }

    public PartnerRequestType getRequestType()
    {
        return requestType;
    }

    public String getService()
    {
        return service;
    }

    public String getUserId()
    {
        return userId;
    }

    public String toString()
    {
        return (new StringBuilder()).append("PartnerRequest [service=").append(service).append(", userId=").append(userId).append(", idx=").append(idx).append(", listener=").append(listener).append(", requestType=").append(requestType).append("]").toString();
    }
}
