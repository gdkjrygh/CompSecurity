// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.phunware.nbc.sochi.accessenable;

import android.content.DialogInterface;

// Referenced classes of package com.phunware.nbc.sochi.accessenable:
//            TempPassResetActivity

class this._cls0
    implements android.content.istener
{

    final TempPassResetActivity this$0;

    public void onClick(DialogInterface dialoginterface, int i)
    {
        dialoginterface.cancel();
    }

    A()
    {
        this$0 = TempPassResetActivity.this;
        super();
    }
}
