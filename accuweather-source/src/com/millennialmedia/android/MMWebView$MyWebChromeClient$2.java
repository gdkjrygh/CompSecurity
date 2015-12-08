// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.millennialmedia.android;

import android.content.DialogInterface;

// Referenced classes of package com.millennialmedia.android:
//            MMWebView

class val.origin
    implements android.content.r
{

    final val.origin this$0;
    final android.webkit.k val$callback;
    final String val$origin;

    public void onClick(DialogInterface dialoginterface, int i)
    {
        cess._mth100(this._cls0.this, true);
        val$callback.invoke(val$origin, true, true);
    }

    ()
    {
        this$0 = final_;
        val$callback = k;
        val$origin = String.this;
        super();
    }
}
