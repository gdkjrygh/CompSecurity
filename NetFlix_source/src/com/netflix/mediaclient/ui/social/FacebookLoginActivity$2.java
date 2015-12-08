// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.social;

import com.facebook.Response;
import com.facebook.model.GraphUser;
import com.netflix.mediaclient.Log;

// Referenced classes of package com.netflix.mediaclient.ui.social:
//            FacebookLoginActivity

class this._cls0
    implements com.facebook.k
{

    final FacebookLoginActivity this$0;

    public void onCompleted(GraphUser graphuser, Response response)
    {
        if (graphuser == null)
        {
            Log.v("FacebookLoginActivity", "Me request user: null");
        } else
        {
            Log.v("FacebookLoginActivity", (new StringBuilder()).append("Me request user: ").append(graphuser.getId()).append(" ").append(graphuser.getName()).append(" ").append(graphuser.getInnerJSONObject()).toString());
        }
        Log.v("FacebookLoginActivity", (new StringBuilder()).append("Me response: ").append(response).toString());
    }

    ()
    {
        this$0 = FacebookLoginActivity.this;
        super();
    }
}
