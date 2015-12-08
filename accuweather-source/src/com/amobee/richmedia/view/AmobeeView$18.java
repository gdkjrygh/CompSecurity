// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amobee.richmedia.view;

import android.content.DialogInterface;

// Referenced classes of package com.amobee.richmedia.view:
//            AmobeeView

class this._cls0
    implements android.content.e.OnClickListener
{

    final AmobeeView this$0;

    public void onClick(DialogInterface dialoginterface, int i)
    {
        raiseError("Store picture canceled by the user.", "storePicture");
    }

    istener()
    {
        this$0 = AmobeeView.this;
        super();
    }
}
