// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.facebookapi;

import android.os.Bundle;
import com.facebook.AccessToken;
import com.facebook.E;
import com.facebook.GraphRequest;
import com.facebook.share.widget.a;

// Referenced classes of package com.soundcloud.android.facebookapi:
//            FacebookApiEndpoints, FacebookApiResponse

public class FacebookApiHelper
{

    private static final String GRAPH_FIELDS_PARAM = "fields";

    public FacebookApiHelper()
    {
    }

    private Bundle buildGraphFieldsBundle(String s)
    {
        Bundle bundle = new Bundle();
        bundle.putString("fields", s);
        return bundle;
    }

    public boolean canShowAppInviteDialog()
    {
        return a.d();
    }

    public FacebookApiResponse graphRequest(FacebookApiEndpoints facebookapiendpoints)
    {
        GraphRequest graphrequest = new GraphRequest(AccessToken.a(), facebookapiendpoints.getPath(), null, E.a);
        graphrequest.d = buildGraphFieldsBundle(facebookapiendpoints.getFields());
        return new FacebookApiResponse(graphrequest.a());
    }

    public boolean hasAccessToken()
    {
        return AccessToken.a() != null;
    }
}
