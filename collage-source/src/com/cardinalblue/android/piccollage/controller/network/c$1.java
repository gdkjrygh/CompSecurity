// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.controller.network;

import com.cardinalblue.android.b.k;
import com.cardinalblue.android.piccollage.model.gson.FbFriendRequest;
import com.facebook.FacebookRequestError;
import com.facebook.GraphResponse;

// Referenced classes of package com.cardinalblue.android.piccollage.controller.network:
//            c

static final class a
    implements com.facebook.hRequest.Callback
{

    final est a;

    public void onCompleted(GraphResponse graphresponse)
    {
        FacebookRequestError facebookrequesterror = graphresponse.getError();
        if (facebookrequesterror != null)
        {
            a.a(facebookrequesterror.getException());
            return;
        }
        try
        {
            graphresponse = (FbFriendRequest)k.b(graphresponse.getRawResponse(), com/cardinalblue/android/piccollage/model/gson/FbFriendRequest);
        }
        // Misplaced declaration of an exception variable
        catch (GraphResponse graphresponse)
        {
            a.a(graphresponse);
            return;
        }
        if (graphresponse == null)
        {
            a.a(new Throwable("FB friend list is null"));
            return;
        } else
        {
            a.a(graphresponse);
            return;
        }
    }

    est(est est)
    {
        a = est;
        super();
    }
}
