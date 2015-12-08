// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.androidgap;

import android.app.Notification;
import android.os.Binder;

// Referenced classes of package com.worklight.androidgap:
//            WLForegroundService

public class this._cls0 extends Binder
{

    final WLForegroundService this$0;

    public void makeForeground(int i, Notification notification)
    {
        startForeground(i, notification);
    }

    public ()
    {
        this$0 = WLForegroundService.this;
        super();
    }
}
