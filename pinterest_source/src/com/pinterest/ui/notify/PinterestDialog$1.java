// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.ui.notify;

import android.content.DialogInterface;

// Referenced classes of package com.pinterest.ui.notify:
//            PinterestDialog

class this._cls0
    implements android.content.ClickListener
{

    final PinterestDialog this$0;

    public void onClick(DialogInterface dialoginterface, int i)
    {
        dialoginterface.dismiss();
    }

    tener()
    {
        this$0 = PinterestDialog.this;
        super();
    }
}
