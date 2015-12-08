// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.phunware.nbc.sochi.fragments;

import android.content.DialogInterface;
import android.view.KeyEvent;
import com.adobe.adobepass.accessenabler.api.AccessEnabler;
import com.nbcsports.liveextra.library.tve.AuthService;

// Referenced classes of package com.phunware.nbc.sochi.fragments:
//            TempPassDialogFragment

class this._cls0
    implements android.content.ener
{

    final TempPassDialogFragment this$0;

    public boolean onKey(DialogInterface dialoginterface, int i, KeyEvent keyevent)
    {
        if (i == 4)
        {
            pass.getInstance().logout();
        }
        return true;
    }

    ()
    {
        this$0 = TempPassDialogFragment.this;
        super();
    }
}
