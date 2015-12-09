// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.webapi;

import java.io.IOException;
import org.apache.http.HttpException;
import org.json.JSONException;

// Referenced classes of package com.netflix.mediaclient.webapi:
//            WebApiPostCommand, AuthorizationCredentials, CommonRequestParameters

public abstract class ResponseWebApiPostCommand extends WebApiPostCommand
{

    public ResponseWebApiPostCommand(String s, AuthorizationCredentials authorizationcredentials, CommonRequestParameters commonrequestparameters)
    {
        super(s, authorizationcredentials, commonrequestparameters);
    }

    public String execute()
        throws IOException, HttpException, JSONException
    {
        return doExecute();
    }
}
