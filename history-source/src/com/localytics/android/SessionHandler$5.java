// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.localytics.android;


// Referenced classes of package com.localytics.android:
//            SessionHandler

class val.screen
    implements Runnable
{

    final SessionHandler this$0;
    final String val$screen;

    public void run()
    {
        tagScreen(val$screen);
    }

    ()
    {
        this$0 = final_sessionhandler;
        val$screen = String.this;
        super();
    }
}
