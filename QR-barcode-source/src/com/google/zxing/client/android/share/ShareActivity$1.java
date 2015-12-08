// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.client.android.share;

import android.content.Intent;
import android.view.View;

// Referenced classes of package com.google.zxing.client.android.share:
//            ShareActivity

class this._cls0
    implements android.view.ener
{

    final ShareActivity this$0;

    public void onClick(View view)
    {
        view = new Intent("android.intent.action.PICK", android.provider..Contacts.CONTENT_URI);
        view.addFlags(0x80000);
        startActivityForResult(view, 1);
    }

    ()
    {
        this$0 = ShareActivity.this;
        super();
    }
}
