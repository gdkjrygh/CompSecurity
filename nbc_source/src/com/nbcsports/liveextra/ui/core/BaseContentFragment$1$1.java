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

class val.mvpd
    implements Runnable
{

    final val.mvpd this$1;
    final Mvpd val$mvpd;

    public void run()
    {
        setTopBanner(val$mvpd);
    }

    is._cls0()
    {
        this$1 = final__pcls0;
        val$mvpd = Mvpd.this;
        super();
    }

    // Unreferenced inner class com/nbcsports/liveextra/ui/core/BaseContentFragment$1

/* anonymous class */
    class BaseContentFragment._cls1 extends AuthDelegate
    {

        final BaseContentFragment this$0;

        public void selectedProvider(Mvpd mvpd1)
        {
            super.selectedProvider(mvpd1);
            (new Handler(Looper.getMainLooper())).post(mvpd1. new BaseContentFragment._cls1._cls1());
        }

        public void setAuthenticationStatus(int i, String s)
        {
            super.setAuthenticationStatus(i, s);
            if (i == 1)
            {
                pass.getInstance().getSelectedProvider();
            }
        }

            
            {
                this$0 = BaseContentFragment.this;
                super();
            }
    }

}
