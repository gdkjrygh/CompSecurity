// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.localytics.android;


// Referenced classes of package com.localytics.android:
//            SessionHandler

class val.value
    implements Runnable
{

    final SessionHandler this$0;
    final String val$key;
    final String val$value;

    public void run()
    {
        setIdentifier(val$key, val$value);
    }

    ()
    {
        this$0 = final_sessionhandler;
        val$key = s;
        val$value = String.this;
        super();
    }
}
