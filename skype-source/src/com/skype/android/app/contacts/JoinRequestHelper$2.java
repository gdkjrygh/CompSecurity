// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.contacts;

import android.content.Intent;
import android.support.v4.util.j;
import com.skype.Conversation;
import java.util.concurrent.Callable;

// Referenced classes of package com.skype.android.app.contacts:
//            JoinRequestHelper

final class val.request
    implements Callable
{

    final JoinRequestHelper this$0;
    final String val$identity;
    final call val$request;

    public final Intent call()
        throws Exception
    {
        String s = requestJoinUrl(val$identity);
        if (s == null)
        {
            throw new RuntimeException("Failed to get JoinUrl!");
        } else
        {
            val$request.url = s;
            JoinRequestHelper.access$000(JoinRequestHelper.this).a(val$request.conversation.getObjectID(), val$request);
            return getJoinIntentToShare(s, val$request.address, val$request.isPhone);
        }
    }

    public final volatile Object call()
        throws Exception
    {
        return call();
    }

    ()
    {
        this$0 = final_joinrequesthelper;
        val$identity = s;
        val$request = val.request.this;
        super();
    }
}
