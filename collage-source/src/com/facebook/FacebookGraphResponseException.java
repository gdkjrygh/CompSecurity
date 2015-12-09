// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook;


// Referenced classes of package com.facebook:
//            FacebookException, GraphResponse, FacebookRequestError

public class FacebookGraphResponseException extends FacebookException
{

    private final GraphResponse graphResponse;

    public FacebookGraphResponseException(GraphResponse graphresponse, String s)
    {
        super(s);
        graphResponse = graphresponse;
    }

    public final GraphResponse getGraphResponse()
    {
        return graphResponse;
    }

    public final String toString()
    {
        FacebookRequestError facebookrequesterror;
        StringBuilder stringbuilder;
        String s;
        if (graphResponse != null)
        {
            facebookrequesterror = graphResponse.getError();
        } else
        {
            facebookrequesterror = null;
        }
        stringbuilder = (new StringBuilder()).append("{FacebookGraphResponseException: ");
        s = getMessage();
        if (s != null)
        {
            stringbuilder.append(s);
            stringbuilder.append(" ");
        }
        if (facebookrequesterror != null)
        {
            stringbuilder.append("httpResponseCode: ").append(facebookrequesterror.getRequestStatusCode()).append(", facebookErrorCode: ").append(facebookrequesterror.getErrorCode()).append(", facebookErrorType: ").append(facebookrequesterror.getErrorType()).append(", message: ").append(facebookrequesterror.getErrorMessage()).append("}");
        }
        return stringbuilder.toString();
    }
}
