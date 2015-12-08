// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.umeng.common.net;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;

// Referenced classes of package com.umeng.common.net:
//            DownloadingService

public class l
{

    public static final String a = "pause";
    public static final String b = "continue";
    public static final String c = "cancel";
    public static final String d = "com.umeng.intent.DOWNLOAD";
    public static final String e = "com.umeng.broadcast.download.msg";

    public l()
    {
    }

    public static int a(a.a a1)
    {
        int j = (int)System.currentTimeMillis();
        int i = j;
        if (j < 0)
        {
            i = -j;
        }
        return i;
    }

    public static PendingIntent a(Context context, String s)
    {
        Intent intent = new Intent("com.umeng.intent.DOWNLOAD");
        intent.addFlags(0x40000000);
        intent.putExtra("com.umeng.broadcast.download.msg", s);
        return PendingIntent.getBroadcast(context, s.hashCode(), intent, 0x8000000);
    }

    public static String a(int i, String s)
    {
        if (i == 0)
        {
            return null;
        } else
        {
            StringBuilder stringbuilder = new StringBuilder((new StringBuilder(String.valueOf(i))).toString());
            stringbuilder.append(":");
            stringbuilder.append(s);
            return stringbuilder.toString();
        }
    }

    public static PendingIntent b(Context context, String s)
    {
        Intent intent = new Intent(context, com/umeng/common/net/DownloadingService);
        intent.putExtra("com.umeng.broadcast.download.msg", s);
        return PendingIntent.getService(context, s.hashCode(), intent, 0x8000000);
    }
}
