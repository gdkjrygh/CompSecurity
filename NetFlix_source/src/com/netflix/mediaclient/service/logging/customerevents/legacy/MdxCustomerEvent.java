// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.logging.customerevents.legacy;

import com.netflix.mediaclient.webapi.AuthorizationCredentials;
import com.netflix.mediaclient.webapi.CommonRequestParameters;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;
import org.apache.http.HttpException;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.message.BasicNameValuePair;
import org.json.JSONException;

// Referenced classes of package com.netflix.mediaclient.service.logging.customerevents.legacy:
//            MdxCeWebApiCommand

public class MdxCustomerEvent extends MdxCeWebApiCommand
{

    private static final String DATA_FIELD = "data";
    private final String mEventData;

    public MdxCustomerEvent(String s, AuthorizationCredentials authorizationcredentials, String s1)
    {
        super(s, authorizationcredentials, CommonRequestParameters.getInstanceWithCredentials());
        mEventData = s1;
    }

    protected void addIfNotNull(List list, String s, String s1)
    {
        if (s1 != null)
        {
            list.add(new BasicNameValuePair(s, s1));
        }
    }

    public void execute()
        throws IOException, HttpException, JSONException
    {
        doExecute();
    }

    protected StringBuilder getBaseUrl()
    {
        StringBuilder stringbuilder = new StringBuilder();
        if (isSecure())
        {
            stringbuilder.append("https://");
        } else
        {
            stringbuilder.append("http://");
        }
        stringbuilder.append(mCustomerEventEndPoint);
        stringbuilder.append("/users/customerevents");
        stringbuilder.append('?').append("output").append('=').append(getOuput());
        stringbuilder.append('&').append("withCredentials").append("=true");
        return stringbuilder;
    }

    public String getCommandPath()
    {
        return "/users";
    }

    protected HttpUriRequest getHttpMethod()
        throws UnsupportedEncodingException
    {
        HttpPost httppost = new HttpPost(getUrl().toString());
        httppost.setEntity(new UrlEncodedFormEntity(getParameters()));
        return httppost;
    }

    protected List getParameters()
    {
        ArrayList arraylist = new ArrayList(3);
        addIfNotNull(arraylist, "output", getOuput());
        addIfNotNull(arraylist, "data", mEventData);
        addIfNotNull(arraylist, "withCredentials", String.valueOf(commonRequestParameters.withCredentials));
        return arraylist;
    }
}
