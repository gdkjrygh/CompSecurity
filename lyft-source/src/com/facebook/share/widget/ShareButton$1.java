// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.share.widget;

import android.view.View;

// Referenced classes of package com.facebook.share.widget:
//            ShareButton, ShareDialog

class this._cls0
    implements android.view.stener
{

    final ShareButton this$0;

    public void onClick(View view)
    {
        ShareButton.access$000(ShareButton.this, view);
        if (getFragment() != null)
        {
            view = new ShareDialog(getFragment(), getRequestCode());
        } else
        {
            view = new ShareDialog(ShareButton.access$100(ShareButton.this), getRequestCode());
        }
        view.show(getShareContent());
    }

    ()
    {
        this$0 = ShareButton.this;
        super();
    }
}
