// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.client.android.share;

import android.view.View;
import com.google.zxing.client.android.clipboard.ClipboardInterface;

// Referenced classes of package com.google.zxing.client.android.share:
//            ShareActivity

class this._cls0
    implements android.view.ener
{

    final ShareActivity this$0;

    public void onClick(View view)
    {
        view = ClipboardInterface.getText(ShareActivity.this);
        if (view != null)
        {
            ShareActivity.access$000(ShareActivity.this, view.toString());
        }
    }

    erface()
    {
        this$0 = ShareActivity.this;
        super();
    }
}
