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
            return;
        } else
        {
            BaseActivity.access$1(BaseActivity.this, true, Arrays.asList(new String[] {
                "email", "user_birthday", "user_hometown", "user_location", "publish_actions"
            }), new com.facebook.Session.StatusCallback() {

                final BaseActivity._cls4 this$1;
                private final String val$desc;
                private final String val$title;

                public void call(Session session1, SessionState sessionstate1, Exception exception1)
                {
                    if (session1.isOpened())
                    {
                        BaseActivity.access$0(this$0, title, desc);
                        Session.saveSession(session1, null);
                    }
                }

            
            {
                this$1 = BaseActivity._cls4.this;
                title = s;
                desc = s1;
                super();
            }
            });
            return;
        }
    }


    _cls1.val.desc()
    {
        this$0 = final_baseactivity;
        val$title = s;
        val$desc = String.this;
        super();
    }
}
