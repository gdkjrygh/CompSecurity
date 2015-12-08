// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kohls.mcommerce.opal.wl;

import android.content.DialogInterface;

// Referenced classes of package com.kohls.mcommerce.opal.wl:
//            WLActivity

class this._cls0
    implements android.content.ce.OnDismissListener
{

    final WLActivity this$0;

    public void onDismiss(DialogInterface dialoginterface)
    {
        endActivity();
    }

    Listener()
    {
        this$0 = WLActivity.this;
        super();
    }
}
