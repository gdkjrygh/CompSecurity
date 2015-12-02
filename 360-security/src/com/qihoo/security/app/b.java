// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.app;

import android.content.Context;
import android.content.Intent;
import com.qihoo.security.dialog.monitor.MonitorDangerDialog;
import com.qihoo360.mobilesafe.b.i;

public class b
{

    public static void a(Context context)
    {
        if (!i.a())
        {
            Intent intent = new Intent();
            intent.setClass(context, com/qihoo/security/dialog/monitor/MonitorDangerDialog);
            intent.setFlags(0x10000000);
            context.startActivity(intent);
        }
    }
}
