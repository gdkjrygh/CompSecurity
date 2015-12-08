// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.user;

import android.content.Context;
import android.content.Intent;
import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.event.UIEvent;
import com.netflix.mediaclient.javabridge.ui.EventListener;
import com.netflix.mediaclient.service.NetflixService;
import com.netflix.mediaclient.util.AndroidUtils;

// Referenced classes of package com.netflix.mediaclient.service.user:
//            UserAgent

private class <init>
    implements EventListener
{

    final UserAgent this$0;

    public void received(UIEvent uievent)
    {
        Log.d("nf_service_useragent", "Received an App reset event ");
        AndroidUtils.clearApplicationData(UserAgent.access$2300(UserAgent.this));
        NetflixActivity.finishAllActivities(UserAgent.access$2400(UserAgent.this));
        uievent = new Intent();
        uievent.setClass(UserAgent.access$2500(UserAgent.this), com/netflix/mediaclient/service/NetflixService);
        UserAgent.access$2600(UserAgent.this).stopService(uievent);
    }

    private ()
    {
        this$0 = UserAgent.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
