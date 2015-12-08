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

class this._cls1
    implements Runnable
{

    final l.hostInfo this$1;

    public void run()
    {
        if (isAdded())
        {
            HostFragmentManualConfiguration.access$800(_fld0).dismiss();
            HostFragmentManualConfiguration.access$100(_fld0).onHostManualConfigurationNext(hostInfo);
        }
    }

    l.hostInfo()
    {
        this$1 = this._cls1.this;
        super();
    }

    // Unreferenced inner class org/xbmc/kore/ui/hosts/HostFragmentManualConfiguration$9

/* anonymous class */
    class HostFragmentManualConfiguration._cls9
        implements Runnable
    {

        final HostFragmentManualConfiguration this$0;
        final HostInfo val$hostInfo;

        public void run()
        {
            String s = NetUtils.getMacAddress(hostInfo.getAddress());
            hostInfo.setMacAddress(s);
            handler.post(new HostFragmentManualConfiguration._cls9._cls1());
        }

            
            {
                this$0 = final_hostfragmentmanualconfiguration;
                hostInfo = HostInfo.this;
                super();
            }
    }

}
