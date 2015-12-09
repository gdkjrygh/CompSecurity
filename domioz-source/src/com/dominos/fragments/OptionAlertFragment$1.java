// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.fragments;

import android.content.DialogInterface;

// Referenced classes of package com.dominos.fragments:
//            OptionAlertFragment

class this._cls0
    implements android.content.kListener
{

    final OptionAlertFragment this$0;

    public void onClick(DialogInterface dialoginterface, int i)
    {
        if (OptionAlertFragment.access$000(OptionAlertFragment.this) != null)
        {
            OptionAlertFragment.access$000(OptionAlertFragment.this).onPositiveClick();
        }
        dialoginterface.dismiss();
    }

    OptionClickListener()
    {
        this$0 = OptionAlertFragment.this;
        super();
    }
}
