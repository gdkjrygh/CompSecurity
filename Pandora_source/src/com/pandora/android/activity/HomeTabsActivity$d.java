// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.activity;

import android.os.Handler;
import android.os.Message;
import java.lang.ref.WeakReference;

// Referenced classes of package com.pandora.android.activity:
//            HomeTabsActivity

public static class a extends Handler
{

    private final WeakReference a;

    public void handleMessage(Message message)
    {
        if ((HomeTabsActivity)a.get() == null)
        {
            return;
        }
        switch (message.what)
        {
        default:
            super.handleMessage(message);
            return;

        case 123: // '{'
            ((Runnable)message.obj).run();
            break;
        }
    }

    public (HomeTabsActivity hometabsactivity)
    {
        a = new WeakReference(hometabsactivity);
    }
}
