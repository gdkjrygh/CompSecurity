// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.phunware.nbc.sochi.fragments;

import android.content.Intent;
import android.net.Uri;
import android.view.View;

// Referenced classes of package com.phunware.nbc.sochi.fragments:
//            SochiApplicationSettingsFragment

class this._cls0
    implements android.view.nSettingsFragment._cls9
{

    final SochiApplicationSettingsFragment this$0;

    public void onClick(View view)
    {
        view = new Intent("android.intent.action.VIEW");
        view.setData(Uri.parse(getString(0x7f070168)));
        startActivity(view);
    }

    I()
    {
        this$0 = SochiApplicationSettingsFragment.this;
        super();
    }
}
