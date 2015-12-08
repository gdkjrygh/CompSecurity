// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.share.widget;

import android.view.View;
import com.facebook.internal.FacebookDialogBase;

// Referenced classes of package com.facebook.share.widget:
//            ShareButtonBase

class this._cls0
    implements android.view.er
{

    final ShareButtonBase this$0;

    public void onClick(View view)
    {
        ShareButtonBase.access$000(ShareButtonBase.this, view);
        getDialog().show(getShareContent());
    }

    ()
    {
        this$0 = ShareButtonBase.this;
        super();
    }
}
