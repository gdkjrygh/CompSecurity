// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.mdx;

import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.event.UIEvent;
import com.netflix.mediaclient.event.nrdp.mdx.discovery.DeviceFoundEvent;
import com.netflix.mediaclient.event.nrdp.mdx.discovery.DeviceLostEvent;
import com.netflix.mediaclient.event.nrdp.mdx.discovery.RemoteDeviceReadyEvent;
import com.netflix.mediaclient.javabridge.ui.EventListener;
import com.netflix.mediaclient.javabridge.ui.mdxcontroller.RemoteDevice;
import com.netflix.mediaclient.service.NetflixService;
import com.netflix.mediaclient.servicemgr.CustomerEventLogging;
import com.netflix.mediaclient.servicemgr.IClientLogging;

// Referenced classes of package com.netflix.mediaclient.service.mdx:
//            MdxAgent, TargetManager, ClientNotifier

class this._cls0
    implements EventListener
{

    final MdxAgent this$0;

    public void received(UIEvent uievent)
    {
        if (!(uievent instanceof DeviceFoundEvent)) goto _L2; else goto _L1
_L1:
        Object obj = (DeviceFoundEvent)uievent;
        uievent = ((DeviceFoundEvent) (obj)).getRemoteDevice().uuid;
        String s = ((DeviceFoundEvent) (obj)).getRemoteDevice().dialUuid;
        if (MdxAgent.access$800(MdxAgent.this, uievent, MdxAgent.access$600(MdxAgent.this)) || MdxAgent.access$800(MdxAgent.this, s, MdxAgent.access$600(MdxAgent.this)))
        {
            RemoteDevice remotedevice = MdxAgent.access$900(MdxAgent.this, MdxAgent.access$600(MdxAgent.this));
            if (remotedevice != null)
            {
                MdxAgent.access$1000(MdxAgent.this).targetFound(remotedevice);
            }
        }
        if (MdxAgent.access$400(MdxAgent.this) != null)
        {
            MdxAgent.access$400(MdxAgent.this).targetList();
        }
        obj = ((DeviceFoundEvent) (obj)).getRemoteDevice().serviceType;
        MdxAgent.access$1100(MdxAgent.this).getClientLogging().getCustomerEventLogging().logMdxTarget("found", uievent, s, ((String) (obj)));
_L4:
        return;
_L2:
        if (!(uievent instanceof DeviceLostEvent))
        {
            continue; /* Loop/switch isn't completed */
        }
        uievent = ((DeviceLostEvent)uievent).getDevices();
        int j = uievent.length;
        for (int i = 0; i < j; i++)
        {
            String s1 = uievent[i];
            if (MdxAgent.access$800(MdxAgent.this, s1, MdxAgent.access$600(MdxAgent.this)) || MdxAgent.access$1000(MdxAgent.this).isTargetHaveContext(s1))
            {
                if (MdxAgent.access$400(MdxAgent.this) != null)
                {
                    MdxAgent.access$400(MdxAgent.this).error(MdxAgent.access$600(MdxAgent.this), 200, "device lost");
                }
                MdxAgent.access$700(MdxAgent.this);
            }
            MdxAgent.access$1200(MdxAgent.this).getClientLogging().getCustomerEventLogging().logMdxTarget("lost", s1, null, null);
        }

        if (MdxAgent.access$400(MdxAgent.this) != null)
        {
            MdxAgent.access$400(MdxAgent.this).targetList();
            return;
        }
        continue; /* Loop/switch isn't completed */
        if (!(uievent instanceof RemoteDeviceReadyEvent)) goto _L4; else goto _L3
_L3:
        uievent = (RemoteDeviceReadyEvent)uievent;
        if (MdxAgent.access$800(MdxAgent.this, uievent.getUuid(), MdxAgent.access$600(MdxAgent.this)))
        {
            if (uievent.getLaunchStatus() == 1)
            {
                Log.d("nf_mdx_agent", "MdxAgent: RemoteDeviceReadyEvent, app's launched");
                MdxAgent.access$1000(MdxAgent.this).targetLaunched(MdxAgent.access$600(MdxAgent.this), true);
                return;
            } else
            {
                Log.d("nf_mdx_agent", "MdxAgent: RemoteDeviceReadyEvent, app's launch failed");
                MdxAgent.access$1000(MdxAgent.this).targetLaunched(MdxAgent.access$600(MdxAgent.this), false);
                return;
            }
        }
        if (true) goto _L4; else goto _L5
_L5:
    }

    ent()
    {
        this$0 = MdxAgent.this;
        super();
    }
}
