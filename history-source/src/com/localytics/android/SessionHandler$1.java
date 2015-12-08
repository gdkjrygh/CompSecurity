// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.localytics.android;


// Referenced classes of package com.localytics.android:
//            SessionHandler

class val.isOptingOut
    implements Runnable
{

    final SessionHandler this$0;
    final boolean val$isOptingOut;

    public void run()
    {
        optOut(val$isOptingOut);
    }

    ()
    {
        this$0 = final_sessionhandler;
        val$isOptingOut = Z.this;
        super();
    }
}
