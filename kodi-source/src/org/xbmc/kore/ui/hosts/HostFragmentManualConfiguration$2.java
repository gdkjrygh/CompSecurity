// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xbmc.kore.ui.hosts;

import android.widget.CompoundButton;
import android.widget.EditText;

// Referenced classes of package org.xbmc.kore.ui.hosts:
//            HostFragmentManualConfiguration

class this._cls0
    implements android.widget.ener
{

    final HostFragmentManualConfiguration this$0;

    public void onCheckedChanged(CompoundButton compoundbutton, boolean flag)
    {
        xbmcEventServerPortEditText.setEnabled(flag);
    }

    ()
    {
        this$0 = HostFragmentManualConfiguration.this;
        super();
    }
}
