// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook;

import android.app.Activity;
import android.content.Intent;

// Referenced classes of package com.facebook:
//            AuthorizationClient

class this._cls0
    implements artActivityDelegate
{

    final AuthorizationClient this$0;

    public Activity getActivityContext()
    {
        return pendingRequest.getStartActivityDelegate().getActivityContext();
    }

    public void startActivityForResult(Intent intent, int i)
    {
        pendingRequest.getStartActivityDelegate().startActivityForResult(intent, i);
    }

    thorizationRequest()
    {
        this$0 = AuthorizationClient.this;
        super();
    }
}
