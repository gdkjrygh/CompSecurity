// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xwalk.core.internal.extension.api.device_capabilities;

import android.util.SparseArray;
import android.view.Display;
import org.xwalk.core.internal.extension.api.XWalkDisplayManager;

// Referenced classes of package org.xwalk.core.internal.extension.api.device_capabilities:
//            DeviceCapabilitiesDisplay

class this._cls0
    implements org.xwalk.core.internal.extension.api.istener
{

    final DeviceCapabilitiesDisplay this$0;

    public void onDisplayAdded(int i)
    {
        DeviceCapabilitiesDisplay.access$100(DeviceCapabilitiesDisplay.this, DeviceCapabilitiesDisplay.access$000(DeviceCapabilitiesDisplay.this).getDisplay(i));
    }

    public void onDisplayChanged(int i)
    {
    }

    public void onDisplayRemoved(int i)
    {
        Display display = (Display)DeviceCapabilitiesDisplay.access$200(DeviceCapabilitiesDisplay.this).get(i);
        if (display == null)
        {
            return;
        } else
        {
            DeviceCapabilitiesDisplay.access$300(DeviceCapabilitiesDisplay.this, display);
            return;
        }
    }

    ()
    {
        this$0 = DeviceCapabilitiesDisplay.this;
        super();
    }
}
