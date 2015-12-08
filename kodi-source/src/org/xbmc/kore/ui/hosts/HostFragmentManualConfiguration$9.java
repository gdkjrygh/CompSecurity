// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xbmc.kore.ui.hosts;

import android.app.ProgressDialog;
import android.os.Handler;
import org.xbmc.kore.host.HostInfo;
import org.xbmc.kore.utils.NetUtils;

// Referenced classes of package org.xbmc.kore.ui.hosts:
//            HostFragmentManualConfiguration

class val.hostInfo
    implements Runnable
{

    final HostFragmentManualConfiguration this$0;
    final HostInfo val$hostInfo;

    public void run()
    {
        String s = NetUtils.getMacAddress(val$hostInfo.getAddress());
        val$hostInfo.setMacAddress(s);
        handler.post(new Runnable() {

            final HostFragmentManualConfiguration._cls9 this$1;

            public void run()
            {
                if (isAdded())
                {
                    HostFragmentManualConfiguration.access$800(this$0).dismiss();
                    HostFragmentManualConfiguration.access$100(this$0).onHostManualConfigurationNext(hostInfo);
                }
            }

            
            {
                this$1 = HostFragmentManualConfiguration._cls9.this;
                super();
            }
        });
    }

    _cls1.this._cls1()
    {
        this$0 = final_hostfragmentmanualconfiguration;
        val$hostInfo = HostInfo.this;
        super();
    }
}
