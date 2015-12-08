// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.localytics.android;


// Referenced classes of package com.localytics.android:
//            UploadHandler

class this._cls0
    implements Runnable
{

    final UploadHandler this$0;

    public void run()
    {
        UploadHandler.deleteBlobsAndSessions(mProvider);
    }

    ()
    {
        this$0 = UploadHandler.this;
        super();
    }
}
