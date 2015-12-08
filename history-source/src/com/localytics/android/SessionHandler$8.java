// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.localytics.android;


// Referenced classes of package com.localytics.android:
//            SessionHandler

class val.disabled
    implements Runnable
{

    final SessionHandler this$0;
    final int val$disabled;

    public void run()
    {
        setPushDisabled(val$disabled);
    }

    ()
    {
        this$0 = final_sessionhandler;
        val$disabled = I.this;
        super();
    }
}
