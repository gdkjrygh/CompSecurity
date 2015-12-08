// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.net;

import android.content.IntentFilter;

// Referenced classes of package org.chromium.net:
//            NetworkChangeNotifierAutoDetect

static class addAction extends IntentFilter
{

    (boolean flag)
    {
        addAction("android.net.conn.CONNECTIVITY_CHANGE");
        if (flag)
        {
            addAction("android.net.wifi.RSSI_CHANGED");
        }
    }
}
