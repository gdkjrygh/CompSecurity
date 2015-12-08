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
        ShareDialog sharedialog;
        if (getFragment() != null)
        {
            sharedialog = new ShareDialog(getFragment(), getRequestCode());
        } else
        {
            sharedialog = new ShareDialog(ShareButton.access$000(ShareButton.this), getRequestCode());
        }
        sharedialog.show(getShareContent());
        ShareButton.access$100(ShareButton.this, view);
    }

    ()
    {
        this$0 = ShareButton.this;
        super();
    }
}
