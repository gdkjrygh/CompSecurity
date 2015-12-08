// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.phunware.nbc.sochi.fragments;

import android.widget.CompoundButton;

// Referenced classes of package com.phunware.nbc.sochi.fragments:
//            SochiApplicationSettingsFragment

class val.target
    implements android.widget.ent..ViewBinder._cls1
{

    final aptioning this$0;
    final SochiApplicationSettingsFragment val$target;

    public void onCheckedChanged(CompoundButton compoundbutton, boolean flag)
    {
        val$target.onClickClosedCaptioning(flag);
    }

    ()
    {
        this$0 = final_;
        val$target = SochiApplicationSettingsFragment.this;
        super();
    }
}
