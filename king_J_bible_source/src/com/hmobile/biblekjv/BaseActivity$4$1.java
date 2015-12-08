// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.hmobile.biblekjv;

import com.facebook.Session;
import com.facebook.SessionState;
import java.util.Arrays;

// Referenced classes of package com.hmobile.biblekjv:
//            BaseActivity

class val.desc
    implements com.facebook.lback
{

    final val.desc this$1;
    private final String val$desc;
    private final String val$title;

    public void call(Session session, SessionState sessionstate, Exception exception)
    {
        if (session.isOpened())
        {
            BaseActivity.access$0(_fld0, val$title, val$desc);
            Session.saveSession(session, null);
        }
    }

    l.desc()
    {
        this$1 = final_desc1;
        val$title = s;
        val$desc = String.this;
        super();
    }

    // Unreferenced inner class com/hmobile/biblekjv/BaseActivity$4

/* anonymous class */
    class BaseActivity._cls4
        implements com.facebook.Session.StatusCallback
    {

        final BaseActivity this$0;
        private final String val$desc;
        private final String val$title;

        public void call(Session session, SessionState sessionstate, Exception exception)
        {
            if (session.isOpened())
            {
                BaseActivity.access$0(BaseActivity.this, title, desc);
                Session.saveSession(session, null);
                return;
            } else
            {
                BaseActivity.access$1(BaseActivity.this, true, Arrays.asList(new String[] {
                    "email", "user_birthday", "user_hometown", "user_location", "publish_actions"
                }), desc. new BaseActivity._cls4._cls1());
                return;
            }
        }


            
            {
                this$0 = final_baseactivity;
                title = s;
                desc = String.this;
                super();
            }
    }

}
