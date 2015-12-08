// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.phunware.nbc.sochi.fragments;

import android.content.Intent;
import android.os.Handler;
import android.view.View;
import android.widget.TextView;
import com.adobe.adobepass.accessenabler.api.AccessEnabler;
import com.nbcsports.liveextra.library.tve.AuthService;
import com.phunware.nbc.sochi.accessenable.SelectProviderActivity;

// Referenced classes of package com.phunware.nbc.sochi.fragments:
//            SochiApplicationSettingsFragment

class this._cls0
    implements android.view.nSettingsFragment._cls6
{

    final SochiApplicationSettingsFragment this$0;

    public void onClick(View view)
    {
        if (!SochiApplicationSettingsFragment.access$500(SochiApplicationSettingsFragment.this))
        {
            return;
        }
        SochiApplicationSettingsFragment.access$502(SochiApplicationSettingsFragment.this, false);
        if (SochiApplicationSettingsFragment.access$600(SochiApplicationSettingsFragment.this))
        {
            pass.getInstance().logout();
            SochiApplicationSettingsFragment.access$800(SochiApplicationSettingsFragment.this).post(new Runnable() {

                final SochiApplicationSettingsFragment._cls6 this$1;

                public void run()
                {
                    SochiApplicationSettingsFragment.access$700(this$0).setText(getString(0x7f070123));
                }

            
            {
                this$1 = SochiApplicationSettingsFragment._cls6.this;
                super();
            }
            });
            return;
        } else
        {
            view = new Intent(getActivity(), com/phunware/nbc/sochi/accessenable/SelectProviderActivity);
            view.putExtra("allow_temp_pass", false);
            startActivityForResult(view, 100);
            return;
        }
    }

    _cls1.this._cls1()
    {
        this$0 = SochiApplicationSettingsFragment.this;
        super();
    }
}
