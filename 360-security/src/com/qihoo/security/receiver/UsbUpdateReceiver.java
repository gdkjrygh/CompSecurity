// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.receiver;

import android.app.KeyguardManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.qihoo.utils.notice.a;
import com.qihoo360.mobilesafe.share.SharedPref;
import java.text.SimpleDateFormat;
import java.util.Date;

public class UsbUpdateReceiver extends BroadcastReceiver
{

    private KeyguardManager a;

    public UsbUpdateReceiver()
    {
    }

    private boolean a()
    {
        int i = Integer.parseInt((new SimpleDateFormat("HH")).format(new Date(System.currentTimeMillis())));
        return i >= 21 || i < 7;
    }

    public void onReceive(Context context, Intent intent)
    {
        a = (KeyguardManager)context.getSystemService("keyguard");
        long l = SharedPref.b(context, "remind_trash_swtich_time", 7);
        long l1 = SharedPref.b(context, "remind_trash_swtich_last_time", 0L);
        if (SharedPref.b(context, "remind_trash_swtich", true) && Math.abs(System.currentTimeMillis() - l1) > l * 0x5265c00L && a.inKeyguardRestrictedInputMode() && a())
        {
            SharedPref.a(context, "remind_trash_swtich_last_time", System.currentTimeMillis());
            com.qihoo.utils.notice.a.a().e();
        }
    }
}
