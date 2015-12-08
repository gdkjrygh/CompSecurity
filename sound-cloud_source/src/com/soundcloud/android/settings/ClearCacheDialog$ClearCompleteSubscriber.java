// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.settings;

import android.widget.Toast;
import com.soundcloud.android.rx.observers.DefaultSubscriber;

// Referenced classes of package com.soundcloud.android.settings:
//            ClearCacheDialog

private class <init> extends DefaultSubscriber
{

    final ClearCacheDialog this$0;

    public void onCompleted()
    {
        Toast.makeText(appContext, 0x7f0700b7, 0).show();
        dismiss();
    }

    private ()
    {
        this$0 = ClearCacheDialog.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
