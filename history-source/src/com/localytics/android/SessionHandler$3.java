// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.localytics.android;

import android.os.Message;
import java.util.Map;

// Referenced classes of package com.localytics.android:
//            SessionHandler

class val.msg
    implements Runnable
{

    final SessionHandler this$0;
    final Message val$msg;

    public void run()
    {
        close((Map)val$msg.obj);
    }

    ()
    {
        this$0 = final_sessionhandler;
        val$msg = Message.this;
        super();
    }
}
