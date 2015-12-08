// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.widget;

import com.facebook.Session;
import com.facebook.SessionState;

// Referenced classes of package com.facebook.widget:
//            FacebookFragment

private class <init>
    implements com.facebook.llback
{

    final FacebookFragment this$0;

    public void call(Session session, SessionState sessionstate, Exception exception)
    {
        onSessionStateChange(sessionstate, exception);
    }

    private ()
    {
        this$0 = FacebookFragment.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
