// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.task.activity;

import com.facebook.Session;
import com.facebook.SessionState;
import com.pinterest.api.remote.MyUserApi;

// Referenced classes of package com.pinterest.activity.task.activity:
//            MainActivity

class this._cls0
    implements com.facebook.allback
{

    final MainActivity this$0;

    public void call(Session session, SessionState sessionstate, Exception exception)
    {
        if (exception != null)
        {
            return;
        } else
        {
            MyUserApi.a(session.getAccessToken(), MainActivity.access$900(MainActivity.this));
            return;
        }
    }

    _cls9()
    {
        this$0 = MainActivity.this;
        super();
    }
}
