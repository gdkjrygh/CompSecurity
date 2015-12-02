// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.lite;

import android.os.Handler;
import android.os.Message;

// Referenced classes of package com.qihoo.security.lite:
//            LicenseActivity

class a extends Handler
{

    final LicenseActivity a;

    public void handleMessage(Message message)
    {
        super.handleMessage(message);
        switch (message.what)
        {
        default:
            return;

        case 0: // '\0'
            LicenseActivity.a(a, false);
            break;
        }
    }

    (LicenseActivity licenseactivity)
    {
        a = licenseactivity;
        super();
    }
}
