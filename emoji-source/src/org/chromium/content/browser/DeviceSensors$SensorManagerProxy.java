// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.content.browser;

import android.hardware.SensorEventListener;
import android.os.Handler;

// Referenced classes of package org.chromium.content.browser:
//            DeviceSensors

static interface 
{

    public abstract boolean registerListener(SensorEventListener sensoreventlistener, int i, int j, Handler handler);

    public abstract void unregisterListener(SensorEventListener sensoreventlistener, int i);
}
