// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.mdx;

import com.netflix.mediaclient.event.UIEvent;
import com.netflix.mediaclient.event.nrdp.mdx.InitErrorEvent;
import com.netflix.mediaclient.event.nrdp.mdx.InitEvent;
import com.netflix.mediaclient.event.nrdp.mdx.StateEvent;
import com.netflix.mediaclient.javabridge.ui.EventListener;
import com.netflix.mediaclient.service.mdx.cast.CastManager;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package com.netflix.mediaclient.service.mdx:
//            MdxAgent, ClientNotifier

class this._cls0
    implements EventListener
{

    final MdxAgent this$0;

    public void received(UIEvent uievent)
    {
        if (!(uievent instanceof InitEvent)) goto _L2; else goto _L1
_L1:
        MdxAgent.access$200(MdxAgent.this).set(true);
        MdxAgent.access$300(MdxAgent.this).clear();
        MdxAgent.access$400(MdxAgent.this).ready();
        if (MdxAgent.access$500(MdxAgent.this) != null)
        {
            MdxAgent.access$500(MdxAgent.this).start();
        }
_L4:
        return;
_L2:
        if (!(uievent instanceof InitErrorEvent))
        {
            continue; /* Loop/switch isn't completed */
        }
        MdxAgent.access$200(MdxAgent.this).set(false);
        if (MdxAgent.access$400(MdxAgent.this) != null)
        {
            MdxAgent.access$400(MdxAgent.this).error(MdxAgent.access$600(MdxAgent.this), 103, ((InitErrorEvent)uievent).getErrorDesc());
            return;
        }
        continue; /* Loop/switch isn't completed */
        if (!(uievent instanceof StateEvent)) goto _L4; else goto _L3
_L3:
        if (!((StateEvent)uievent).isReady())
        {
            break; /* Loop/switch isn't completed */
        }
        MdxAgent.access$200(MdxAgent.this).set(true);
        MdxAgent.access$300(MdxAgent.this).clear();
        if (MdxAgent.access$400(MdxAgent.this) != null)
        {
            MdxAgent.access$400(MdxAgent.this).ready();
        }
        if (MdxAgent.access$500(MdxAgent.this) != null)
        {
            MdxAgent.access$500(MdxAgent.this).start();
            return;
        }
        if (true) goto _L4; else goto _L5
_L5:
        MdxAgent.access$200(MdxAgent.this).set(false);
        MdxAgent.access$300(MdxAgent.this).clear();
        if (MdxAgent.access$400(MdxAgent.this) != null)
        {
            MdxAgent.access$400(MdxAgent.this).notready();
        }
        MdxAgent.access$700(MdxAgent.this);
        if (MdxAgent.access$500(MdxAgent.this) != null)
        {
            MdxAgent.access$500(MdxAgent.this).stop();
            return;
        }
        if (true) goto _L4; else goto _L6
_L6:
    }

    ()
    {
        this$0 = MdxAgent.this;
        super();
    }
}
