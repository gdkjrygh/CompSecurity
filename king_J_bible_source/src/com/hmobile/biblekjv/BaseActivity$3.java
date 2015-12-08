// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.hmobile.biblekjv;

import com.facebook.Session;
import com.facebook.SessionState;

// Referenced classes of package com.hmobile.biblekjv:
//            BaseActivity

class val.desc
    implements com.facebook.allback
{

    final BaseActivity this$0;
    private final String val$desc;
    private final String val$title;

    public void call(Session session, SessionState sessionstate, Exception exception)
    {
        if (session.isOpened())
        {
            BaseActivity.access$0(BaseActivity.this, val$title, val$desc);
            Session.saveSession(session, null);
        }
    }

    ()
    {
        this$0 = final_baseactivity;
        val$title = s;
        val$desc = String.this;
        super();
    }
}
