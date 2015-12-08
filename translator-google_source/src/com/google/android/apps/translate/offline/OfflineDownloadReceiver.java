// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.translate.offline;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.android.apps.translate.TranslateActivity;
import com.google.android.apps.translate.pref.OfflineFragment;
import com.google.android.apps.translate.pref.PrefsActivity;
import com.google.android.apps.translate.pref.WLOfflineFragment;
import com.google.android.apps.translate.r;
import com.google.android.libraries.translate.offline.PackageProcessService;
import com.google.android.libraries.translate.offline.PackageType;
import com.google.android.libraries.translate.offline.b;

public class OfflineDownloadReceiver extends BroadcastReceiver
{

    public OfflineDownloadReceiver()
    {
    }

    public static void a(Context context, PackageType packagetype)
    {
        context.startActivity(b(context, packagetype));
    }

    public static Intent b(Context context, PackageType packagetype)
    {
        int i;
        if (packagetype == PackageType.WORD_LENS)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        packagetype = new Intent(context, com/google/android/apps/translate/pref/PrefsActivity);
        if (i != 0)
        {
            context = com/google/android/apps/translate/pref/WLOfflineFragment.getName();
        } else
        {
            context = com/google/android/apps/translate/pref/OfflineFragment.getName();
        }
        context = packagetype.putExtra(":android:show_fragment", context);
        if (i != 0)
        {
            i = r.label_manage_wordlens_pkg;
        } else
        {
            i = r.label_manage_offline_pkg;
        }
        return context.putExtra(":android:show_fragment_title", i).addFlags(0x10000000).addFlags(0x20000000);
    }

    public void onReceive(Context context, Intent intent)
    {
        if ("android.intent.action.DOWNLOAD_COMPLETE".endsWith(intent.getAction()))
        {
            PackageProcessService.a(context, com.google.android.libraries.translate.offline.b.a(context).a(intent.getLongExtra("extra_download_id", 0L)));
            return;
        } else
        {
            intent = new Intent(context, com/google/android/apps/translate/TranslateActivity);
            intent.addFlags(0x10000000).addFlags(0x20000000);
            context.startActivity(intent);
            return;
        }
    }
}
