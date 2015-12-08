// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.hmobile.biblekjv;

import android.widget.Toast;

// Referenced classes of package com.hmobile.biblekjv:
//            BaseActivity

class ShareDelegate
    implements me.grantland.twitter.UploadDelegate
{

    final BaseActivity this$0;
    private final com.hmobile.model.ikeShareDelegate val$delegate;

    public void UploadFailed()
    {
        val$delegate.Failed();
        hideProgress();
        Toast.makeText(getApplicationContext(), "error occured please try again.", 1).show();
    }

    public void UploadSuccessFully()
    {
        val$delegate.SuccessFully();
        hideProgress();
        Toast toast = Toast.makeText(getApplicationContext(), "Twitter share successfully.", 1);
        toast.setGravity(81, 0, screenHeight / 2);
        toast.show();
    }

    ShareDelegate()
    {
        this$0 = final_baseactivity;
        val$delegate = com.hmobile.model.ikeShareDelegate.this;
        super();
    }
}
