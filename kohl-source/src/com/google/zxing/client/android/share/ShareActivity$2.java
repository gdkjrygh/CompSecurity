// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.client.android.share;

import android.content.Intent;
import android.view.View;

// Referenced classes of package com.google.zxing.client.android.share:
//            ShareActivity, BookmarkPickerActivity

class this._cls0
    implements android.view.ener
{

    final ShareActivity this$0;

    public void onClick(View view)
    {
        view = new Intent("android.intent.action.PICK");
        view.addFlags(0x80000);
        view.setClassName(ShareActivity.this, com/google/zxing/client/android/share/BookmarkPickerActivity.getName());
        startActivityForResult(view, 0);
    }

    tivity()
    {
        this$0 = ShareActivity.this;
        super();
    }
}
