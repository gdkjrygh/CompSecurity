// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.ui.core;

import android.os.Handler;
import android.os.Looper;
import com.adobe.adobepass.accessenabler.api.AccessEnabler;
import com.adobe.adobepass.accessenabler.models.Mvpd;
import com.nbcsports.liveextra.library.tve.AuthDelegate;
import com.nbcsports.liveextra.library.tve.AuthService;

// Referenced classes of package com.nbcsports.liveextra.ui.core:
//            BaseContentFragment

class > extends AuthDelegate
{

    final BaseContentFragment this$0;

    public void selectedProvider(final Mvpd mvpd)
    {
        super.selectedProvider(mvpd);
        (new Handler(Looper.getMainLooper())).post(new Runnable() {

            final BaseContentFragment._cls1 this$1;
            final Mvpd val$mvpd;

            public void run()
            {
                setTopBanner(mvpd);
            }

            
            {
                this$1 = BaseContentFragment._cls1.this;
                mvpd = mvpd1;
                super();
            }
        });
    }

    public void setAuthenticationStatus(int i, String s)
    {
        super.setAuthenticationStatus(i, s);
        if (i == 1)
        {
            pass.getInstance().getSelectedProvider();
        }
    }

    _cls1.val.mvpd()
    {
        this$0 = BaseContentFragment.this;
        super();
    }
}
