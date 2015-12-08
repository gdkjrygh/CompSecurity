// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.content.browser;

import android.content.Context;
import android.hardware.SensorManager;
import java.util.concurrent.Callable;

// Referenced classes of package org.chromium.content.browser:
//            DeviceSensors

class this._cls0
    implements Callable
{

    final DeviceSensors this$0;

    public SensorManager call()
    {
        return (SensorManager)DeviceSensors.access$000(DeviceSensors.this).getSystemService("sensor");
    }

    public volatile Object call()
        throws Exception
    {
        return call();
    }

    ()
    {
        this$0 = DeviceSensors.this;
        super();
    }
}
