// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.fragments;

import android.content.DialogInterface;

// Referenced classes of package com.dominos.fragments:
//            AlertFragment

class this._cls0
    implements android.content.OnClickListener
{

    final AlertFragment this$0;

    public void onClick(DialogInterface dialoginterface, int i)
    {
        dialoginterface.dismiss();
    }

    kListener()
    {
        this$0 = AlertFragment.this;
        super();
    }
}
