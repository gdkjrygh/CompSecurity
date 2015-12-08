// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.api.remote;

import com.pinterest.api.model.MyUser;
import com.pinterest.api.model.User;
import com.pinterest.base.Events;
import com.pinterest.common.async.BackgroundTask;
import com.pinterest.experiment.Experiments;
import com.pinterest.network.json.PinterestJsonObject;
import com.pinterest.reporting.CrashReporting;

class b extends BackgroundTask
{

    User a;
    final PinterestJsonObject b;
    final b c;

    public void onFinish()
    {
        super.onFinish();
        CrashReporting.a(a.getUsername());
        c.Success(a);
        Events.post(new com.pinterest.api.model..a(a));
        Events.post(new com.pinterest.api.model..a(a));
    }

    public void run()
    {
        a = User.make(b);
        Experiments.a(b.c("gatekeeper_experiments"));
        MyUser.saveMe(a, b);
    }

    ( , PinterestJsonObject pinterestjsonobject)
    {
        c = ;
        b = pinterestjsonobject;
        super();
    }
}
