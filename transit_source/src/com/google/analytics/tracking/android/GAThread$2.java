// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.analytics.tracking.android;


// Referenced classes of package com.google.analytics.tracking.android:
//            GAThread, ServiceProxy

class this._cls0
    implements Runnable
{

    final GAThread this$0;

    public void run()
    {
        GAThread.access$1000(GAThread.this).dispatch();
    }

    y()
    {
        this$0 = GAThread.this;
        super();
    }
}
