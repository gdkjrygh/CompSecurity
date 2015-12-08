// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.localytics.android;


// Referenced classes of package com.localytics.android:
//            UploadHandler

class val.rows
    implements Runnable
{

    final UploadHandler this$0;
    final StringBuilder val$rows;

    public void run()
    {
        UploadHandler.deleteProfileAttribute(mProvider, val$rows);
    }

    ()
    {
        this$0 = final_uploadhandler;
        val$rows = StringBuilder.this;
        super();
    }
}
