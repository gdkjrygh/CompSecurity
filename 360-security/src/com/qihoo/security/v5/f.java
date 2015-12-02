// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.v5;

import android.content.Context;
import android.content.Intent;

// Referenced classes of package com.qihoo.security.v5:
//            DownloadStatus

public final class f
{

    public static void a(Context context)
    {
        context.sendBroadcast(new Intent("com.qihoo.security.action.ACTION_DISMISS_DOWNLOAD_APK_DIALOG"), "com.qihoo.security.lite.PERMISSION");
        context.sendBroadcast(new Intent("com.qihoo.security.action.ACTION_DISMISS_UPDATED_DIALOG"), "com.qihoo.security.lite.PERMISSION");
        context.sendBroadcast(new Intent("com.qihoo.security.action.ACTION_DISMISS_CHECK_UPDATE_DIALOG"), "com.qihoo.security.lite.PERMISSION");
    }

    public static void a(Context context, DownloadStatus downloadstatus, int i)
    {
        Intent intent = new Intent("com.qihoo.security.action.ACTION_APP_PROGRESS");
        intent.putExtra("download_status", downloadstatus);
        intent.putExtra("progress", i);
        context.sendBroadcast(intent, "com.qihoo.security.lite.PERMISSION");
    }
}
