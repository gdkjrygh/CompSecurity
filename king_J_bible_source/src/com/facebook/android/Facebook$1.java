// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.android;

import com.facebook.Session;
import com.facebook.SessionState;

// Referenced classes of package com.facebook.android:
//            Facebook

class alogListener
    implements com.facebook.tusCallback
{

    final Facebook this$0;
    private final alogListener val$listener;

    public void call(Session session, SessionState sessionstate, Exception exception)
    {
        Facebook.access$11(Facebook.this, session, sessionstate, exception, val$listener);
    }

    alogListener()
    {
        this$0 = final_facebook;
        val$listener = alogListener.this;
        super();
    }
}
