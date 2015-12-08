// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.controller.network;

import android.content.Context;
import com.cardinalblue.android.b.k;
import com.cardinalblue.android.piccollage.model.gson.FbFriendRequest;
import com.facebook.AccessToken;
import com.facebook.FacebookRequestError;
import com.facebook.GraphRequest;
import com.facebook.GraphResponse;

public class c
{
    public static interface a
    {

        public abstract void a(FbFriendRequest fbfriendrequest);

        public abstract void a(Throwable throwable);
    }


    public c()
    {
    }

    public static void a(Context context, a a1)
    {
        GraphRequest.newGraphPathRequest(AccessToken.getCurrentAccessToken(), "me/friends", new com.facebook.GraphRequest.Callback(a1) {

            final a a;

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

            
            {
                a = a1;
                super();
            }
        }).executeAsync();
    }
}
