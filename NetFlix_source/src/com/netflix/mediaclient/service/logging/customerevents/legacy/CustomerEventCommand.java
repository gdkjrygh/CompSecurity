// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.logging.customerevents.legacy;

import android.util.Pair;
import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.webapi.AuthorizationCredentials;
import com.netflix.mediaclient.webapi.CommonRequestParameters;
import com.netflix.mediaclient.webapi.ResponseWebApiPostCommand;
import java.util.ArrayList;
import java.util.List;

public class CustomerEventCommand extends ResponseWebApiPostCommand
{

    protected static final String PARAMETER_DATA = "data";
    protected static final String PATH_EVENTS = "/users/customerevents";
    protected static final String TAG = "nf_rest";
    protected String mPayload;

    CustomerEventCommand(String s, AuthorizationCredentials authorizationcredentials, String s1)
    {
        super(s, authorizationcredentials, CommonRequestParameters.getInstanceWithCredentials());
        verifyNotNull(s1, "Payload");
        mPayload = s1;
    }

    public String getCommandPath()
    {
        return "/users/customerevents";
    }

    public Pair[] getHeaders()
    {
        return (new Pair[] {
            new Pair("Content-Type", "application/x-www-form-urlencoded")
        });
    }

    protected List getParameters()
    {
        ArrayList arraylist = new ArrayList(1);
        String s = mPayload.toString();
        if (Log.isLoggable("nf_rest", 3))
        {
            Log.d("nf_rest", (new StringBuilder()).append("Payload: ").append(s).toString());
        }
        addIfNotNull(arraylist, "data", s);
        return arraylist;
    }

    protected StringBuilder getUrl()
    {
        return getBaseCustomerEventBeaconUrl();
    }
}
