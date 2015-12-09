// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aviary.android.feather.cds;

import android.app.AlarmManager;
import android.app.DownloadManager;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.database.Cursor;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.SystemClock;
import android.text.TextUtils;
import com.aviary.android.feather.common.a.a;
import com.aviary.android.feather.common.utils.d;
import com.aviary.android.feather.common.utils.h;
import com.aviary.android.feather.common.utils.k;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Locale;
import junit.framework.Assert;

// Referenced classes of package com.aviary.android.feather.cds:
//            h, f, d

public final class AviaryCdsReceiver extends BroadcastReceiver
{
    private class a extends Exception
    {

        final AviaryCdsReceiver a;

        a(String s)
        {
            a = AviaryCdsReceiver.this;
            super(s);
        }
    }


    static final com.aviary.android.feather.common.a.a.c a;

    public AviaryCdsReceiver()
    {
    }

    private long a(Cursor cursor)
    {
        if (cursor != null && cursor.moveToFirst())
        {
            int i = cursor.getColumnIndex("download_packId");
            if (i > -1)
            {
                return cursor.getLong(i);
            }
        }
        return -1L;
    }

    private SharedPreferences a(Context context)
    {
        return context.getSharedPreferences(com/aviary/android/feather/cds/AviaryCdsReceiver.getSimpleName(), 0);
    }

    private File a(File file, Context context, long l, long l1, String s)
        throws IOException, AssertionError
    {
        return a(((InputStream) (new FileInputStream(file))), context, l, l1, s);
    }

    private File a(InputStream inputstream, Context context, long l, long l1, String s)
        throws IOException, AssertionError
    {
        s = com.aviary.android.feather.cds.h.d(s);
        context = new File(context.getFilesDir(), s);
        context.mkdirs();
        Assert.assertTrue(context.isDirectory());
        context.setReadable(true, false);
        d.a(inputstream, context);
        return context;
    }

    private void a(DownloadManager downloadmanager, long l)
    {
        a.c("tryDeleteDownloadedFile: %d", new Object[] {
            Long.valueOf(l)
        });
        android.app.DownloadManager.Query query = new android.app.DownloadManager.Query();
        query.setFilterById(new long[] {
            l
        });
        downloadmanager = downloadmanager.query(query);
        if (downloadmanager == null)
        {
            break MISSING_BLOCK_LABEL_151;
        }
        int i;
        downloadmanager.moveToFirst();
        i = downloadmanager.getColumnIndex("local_uri");
        if (i <= -1)
        {
            break MISSING_BLOCK_LABEL_147;
        }
        String s;
        s = downloadmanager.getString(i);
        a.b("filename: %s", new Object[] {
            s
        });
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_147;
        }
        boolean flag = (new File(s)).delete();
        a.b("deleted: %b", new Object[] {
            Boolean.valueOf(flag)
        });
        d.a(downloadmanager);
        return;
        Object obj;
        obj;
        ((Throwable) (obj)).printStackTrace();
        d.a(downloadmanager);
        return;
        obj;
        d.a(downloadmanager);
        throw obj;
    }

    private void a(Context context, long l)
    {
        DownloadManager downloadmanager;
        Cursor cursor;
        long l1;
        a.c("handleActionDownloadComplete: %d", new Object[] {
            Long.valueOf(l)
        });
        downloadmanager = (DownloadManager)context.getSystemService("download");
        Object obj = context.getContentResolver().query(h.b(context, (new StringBuilder()).append("downloadPackId/").append(l).toString()), new String[] {
            "download_packId"
        }, null, null, null);
        l1 = a(((Cursor) (obj)));
        d.a(((Cursor) (obj)));
        if (l1 == -1L)
        {
            return;
        }
        obj = new android.app.DownloadManager.Query();
        ((android.app.DownloadManager.Query) (obj)).setFilterById(new long[] {
            l
        });
        cursor = downloadmanager.query(((android.app.DownloadManager.Query) (obj)));
        if (cursor == null) goto _L2; else goto _L1
_L1:
        if (!cursor.moveToFirst()) goto _L2; else goto _L3
_L3:
        n.a a2;
        m.a a3;
        int i;
        i = cursor.getColumnIndex("status");
        a2 = h.b(context, l1, new String[] {
            "content_id", "content_packId", "content_iconPath", "content_displayName", "content_displayDescription", "content_purchased"
        });
        a3 = com.aviary.android.feather.cds.h.a(context, l1, new String[] {
            "pack_id", "pack_identifier", "pack_type"
        });
        if (a2 != null && a3 != null)
        {
            break MISSING_BLOCK_LABEL_296;
        }
        throw new a("Pack information not found...fatal database error");
        a a1;
        a1;
        a.c("Package needs redownload");
        downloadmanager.remove(new long[] {
            l
        });
        a(context, l1, a1.getMessage());
        d.a(cursor);
        b(context, l);
        return;
        i = cursor.getInt(i);
        if (context.getContentResolver().update(h.b(context, (new StringBuilder()).append("download/id/").append(l).append("/updateStatus/").append(i).toString()), new ContentValues(), null, null) > 0)
        {
            com.aviary.android.feather.cds.h.a(context, l1, a3.b(), i);
        }
          goto _L4
_L8:
        a.c((new StringBuilder()).append("not handled: ").append(i).toString());
_L5:
        d.a(cursor);
        b(context, l);
        return;
_L9:
        Object obj1;
        if (android.os.Build.VERSION.SDK_INT < 11)
        {
            break MISSING_BLOCK_LABEL_552;
        }
        obj1 = cursor.getString(cursor.getColumnIndex("local_filename"));
_L6:
        a.a((new StringBuilder()).append("uriString: ").append(((String) (obj1))).toString());
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_612;
        }
        obj1 = Uri.parse(((String) (obj1))).getPath();
        a.b("path: %s", new Object[] {
            obj1
        });
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_573;
        }
        a(context, a3, a2, new File(((String) (obj1))), l);
          goto _L5
        obj1;
        d.a(cursor);
        b(context, l);
        throw obj1;
        obj1 = cursor.getString(cursor.getColumnIndex("local_uri"));
          goto _L6
        throw new a((new StringBuilder()).append("Download failed for ").append(a2.f()).append(". Path is null").toString());
        throw new a((new StringBuilder()).append("Download failed for ").append(a2.f()).append(". Uri string is null").toString());
_L10:
        throw new a((new StringBuilder()).append("Download failed for ").append(a2.f()).append(". ").append(com.aviary.android.feather.cds.h.a(16, cursor.getInt(cursor.getColumnIndex("reason")))).toString());
_L2:
        a.c((new StringBuilder()).append("Download cursor for downloadId ").append(l).append(" not valid.").toString());
        if ("amazon".equals("production")) goto _L5; else goto _L7
_L7:
        a.a("throw the exception");
        throw new a((new StringBuilder()).append("Try to download again item id ").append(l1).toString());
_L4:
        i;
        JVM INSTR lookupswitch 2: default 832
    //                   8: 418
    //                   16: 651;
           goto _L8 _L9 _L10
    }

    private void a(Context context, long l, String s)
    {
        Object obj = com.aviary.android.feather.cds.h.a(context, l, null);
        n.a a1 = h.b(context, l, new String[] {
            "content_id", "content_packId", "content_contentURL", "content_displayName"
        });
        if (obj == null)
        {
            a.d((new StringBuilder()).append("pack is null for id: ").append(l).toString());
            return;
        } else
        {
            obj = ((m.a) (obj)).a();
            int i = context.getContentResolver().delete(h.b(context, (new StringBuilder()).append("pack/").append(l).append("/delete_download_entry").toString()), null, null);
            a.b((new StringBuilder()).append(i).append(" entries deleted in download_packs_table for packId ").append(l).toString());
            Object obj1 = new Intent(context, com/aviary/android/feather/cds/AviaryCdsReceiver);
            ((Intent) (obj1)).setAction("aviary.android.cds.intent.action.ACTION_DOWNLOAD_PACKS_CONTENT");
            ((Intent) (obj1)).putExtra("entryId", l);
            ((Intent) (obj1)).putExtra("data", a1.e());
            ((Intent) (obj1)).putExtra("identifier", ((String) (obj)));
            obj = PendingIntent.getBroadcast(context, 0, ((Intent) (obj1)), 0x8000000);
            obj1 = h.b(context, "feather_iap_download_failed", "Download Failed");
            s = (new android.support.v4.app.NotificationCompat.Builder(context)).setSmallIcon(0x1080078).setContentTitle(((CharSequence) (obj1))).setContentText((new StringBuilder()).append(((String) (obj1))).append(": ").append(a1.f()).toString()).setSubText(s).setContentIntent(((PendingIntent) (obj)));
            ((NotificationManager)context.getSystemService("notification")).notify((int)l, s.build());
            return;
        }
    }

    private void a(Context context, long l, String s, String s1, String s2)
    {
        a.b((new StringBuilder()).append("setPackDownloadSuccessfulNotification: ").append(l).append(", icon: ").append(s).toString());
        SharedPreferences sharedpreferences;
        String as[];
        android.support.v4.app.NotificationCompat.Builder builder;
        String s3;
        String s4;
        int i;
        int j;
        int i1;
        int j1;
        if (s != null)
        {
            s = BitmapFactory.decodeFile((new File(s)).getAbsolutePath());
        } else
        {
            s = null;
        }
        i = h.a(context, "aviary_iap_notification_ok", "drawable");
        j = h.a(context, "aviary_iap_notification_group", "drawable");
        s3 = h.b(context, "feather_iap_pack_installed", "Installed");
        s4 = h.b(context, "feather_iap_notification_installed_summary", "Plugin succesfully installed");
        s2 = (NotificationManager)context.getSystemService("notification");
        sharedpreferences = a(context);
        i1 = sharedpreferences.getInt("packs_installed_count", 0);
        as = a(context, sharedpreferences, s1);
        a.b("current active notifications: %d", new Object[] {
            Integer.valueOf(i1)
        });
        builder = new android.support.v4.app.NotificationCompat.Builder(context);
        builder.setAutoCancel(true);
        builder.setContentIntent(b(context));
        builder.setDeleteIntent(b(context));
        builder.setTicker((new StringBuilder()).append(s1).append(" ").append(s3).toString());
        builder.setSmallIcon(i);
        if (i1 <= 0)
        {
            break MISSING_BLOCK_LABEL_609;
        }
        builder.setContentTitle(h.a(context, "feather_notification_plugins_installed_count", "%1$d Plugins Installed", new Object[] {
            Integer.valueOf(i1 + 1)
        }));
        if (j != 0)
        {
            s = BitmapFactory.decodeResource(context.getResources(), j);
        }
        if (android.os.Build.VERSION.SDK_INT < 16) goto _L2; else goto _L1
_L1:
        builder.setContentText(context.getApplicationInfo().loadLabel(context.getPackageManager()));
        builder.setContentInfo(String.valueOf(i1 + 1));
        a.a((new StringBuilder()).append("total: ").append(as.length).toString());
        s1 = s;
        if (as == null) goto _L4; else goto _L3
_L3:
        s1 = s;
        if (as.length <= 0) goto _L4; else goto _L5
_L5:
        s1 = new android.support.v4.app.NotificationCompat.InboxStyle();
        j = 0;
        j1 = as.length;
        i = 0;
_L9:
        if (i >= j1) goto _L7; else goto _L6
_L6:
        s1.addLine(as[i]);
        j++;
        if (j <= 2) goto _L8; else goto _L7
_L7:
        if (as.length > 3)
        {
            i = as.length;
            s1.setSummaryText((new StringBuilder()).append("+").append(h.a(context, "feather_notification_plus_more", "%1$d more", new Object[] {
                Integer.valueOf(i - 3)
            })).toString());
        }
        builder.setStyle(s1);
        s1 = s;
_L4:
        if (s1 != null)
        {
            builder.setLargeIcon(s1);
        }
        s2.notify(0x53f24, builder.build());
        a(context, sharedpreferences, as, i1 + 1);
        return;
_L8:
        i++;
          goto _L9
_L2:
        builder.setContentText((new StringBuilder()).append(k.a(as, ",")).append(" ").append(s3).toString());
        s1 = s;
          goto _L4
        builder.setContentTitle(s1);
        builder.setContentText(s4);
        s1 = s;
          goto _L4
    }

    private void a(Context context, Intent intent)
    {
        a.b("handle notification dismissed");
        a(context, a(context));
    }

    private void a(Context context, SharedPreferences sharedpreferences)
    {
        a.b("clearActiveNotifications");
        context = sharedpreferences.edit();
        context.clear();
        context.commit();
    }

    private void a(Context context, SharedPreferences sharedpreferences, String as[], int i)
    {
        a.b("updateActiveNotificationNumber: %d (%s)", new Object[] {
            Integer.valueOf(i), k.a(as, ",")
        });
        context = sharedpreferences.edit();
        context.putInt("packs_installed_count", i);
        context.putString("packs_installed_list", k.a(as, ","));
        context.commit();
    }

    private void a(Context context, m.a a1, n.a a2, File file, long l)
        throws a
    {
        a.b("handleDownloadSuccessful");
        l = a1.p();
        boolean flag = a(context, a2.b(), a1.b(), file);
        a.b("content is valid: %b", new Object[] {
            Boolean.valueOf(flag)
        });
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_302;
        }
        File file1 = a(file, context, l, a2.p(), a1.a());
        a.a("deleting downloadFile..");
        d.e(file);
        file = new ContentValues();
        file.put("content_contentPath", file1.getAbsolutePath());
        if (context.getContentResolver().update(h.b(context, (new StringBuilder()).append("pack/id/").append(a1.p()).append("/content/id/").append(a2.p()).append("/updatePurchasedStatus/1").toString()), file, null, null) > 0)
        {
            com.aviary.android.feather.cds.h.d(context, a1.b());
            h.g(context, l);
            h.b(context, l, a1.b(), 1);
        } else
        {
            a.d("failed to update the db");
        }
        a(context, l, a2.j(), a2.f(), a2.g());
        return;
        context;
        context.printStackTrace();
        d.e(new File(com.aviary.android.feather.cds.h.d(a1.a())));
_L1:
        throw new a("Error in unpacking zip file.");
        context;
        a.a("deleting downloadFile..");
        d.e(file);
        throw context;
        context;
        context.printStackTrace();
          goto _L1
        throw new a("Package contents are not valid");
    }

    private boolean a(Context context, long l, String s, File file)
    {
        a.b b1 = a(s);
        if (b1 == null)
        {
            a.d((new StringBuilder()).append("unrecognized packtype: ").append(s).toString());
            return false;
        }
        s = com.aviary.android.feather.cds.f.a(a.a.b, b1);
        boolean flag;
        try
        {
            flag = s.a(context, l, file, true);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            context.printStackTrace();
            a.d((new StringBuilder()).append("failed to validate package, ").append(context.getMessage()).toString());
            return false;
        }
        return flag;
    }

    private String[] a(Context context, SharedPreferences sharedpreferences, String s)
    {
        context = sharedpreferences.getString("packs_installed_list", "");
        if (!TextUtils.isEmpty(context))
        {
            try
            {
                context = context.split(",");
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                context.printStackTrace();
                context = null;
            }
        } else
        {
            context = null;
        }
        if (context != null && context.length > 0)
        {
            sharedpreferences = new String[context.length + 1];
            for (int i = 0; i < context.length; i++)
            {
                sharedpreferences[i] = context[i];
            }

            context = sharedpreferences;
        } else
        {
            context = new String[1];
        }
        context[context.length - 1] = s;
        return context;
    }

    private PendingIntent b(Context context)
    {
        Intent intent = new Intent(context, com/aviary/android/feather/cds/AviaryCdsReceiver);
        intent.setAction("aviary.android.cds.intent.action.ACTION_NOTIFICATION_DISMISSED");
        return PendingIntent.getBroadcast(context, 0, intent, 0x8000000);
    }

    private void b(Context context, long l)
    {
        long l1 = 1000L + SystemClock.elapsedRealtime();
        a.b((new StringBuilder()).append("setDownloadDeleteAlarm: ").append(l1).toString());
        PendingIntent pendingintent = c(context, l);
        ((AlarmManager)context.getSystemService("alarm")).set(3, l1, pendingintent);
    }

    private void b(Context context, Intent intent)
    {
        long l = intent.getLongExtra("entryId", -1L);
        intent = com.aviary.android.feather.cds.d.a(a.a.b);
        try
        {
            intent = intent.a(context, l);
            a.b((new StringBuilder()).append("result: ").append(intent).toString());
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Intent intent)
        {
            a(context, l, intent.getMessage());
        }
    }

    private PendingIntent c(Context context, long l)
    {
        Intent intent = new Intent(context, com/aviary/android/feather/cds/AviaryCdsReceiver);
        intent.setAction("aviary.android.cds.intent.action.ACTION_REMOVE_DOWNLOAD_CONTENT");
        intent.setData(Uri.parse((new StringBuilder()).append("content://").append(context.getPackageName()).append(".AviaryCdsReceiver/removeDownloadedPack/").append(l).toString()));
        intent.putExtra("entryId", l);
        return PendingIntent.getBroadcast(context, 0, intent, 0x8000000);
    }

    private void c(Context context, Intent intent)
    {
        a.c(">> handleDeleteDownloadEntry: %s", new Object[] {
            intent
        });
        if (intent != null)
        {
            long l = intent.getLongExtra("entryId", -1L);
            context = (DownloadManager)context.getSystemService("download");
            if (context != null)
            {
                if (android.os.Build.VERSION.SDK_INT < 11)
                {
                    a(context, l);
                }
                context.remove(new long[] {
                    l
                });
            }
        }
    }

    a.b a(String s)
    {
        try
        {
            s = com.aviary.android.feather.cds.a.b.valueOf(s.toUpperCase(Locale.US));
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return null;
        }
        return s;
    }

    public void onReceive(Context context, Intent intent)
    {
        String s = intent.getAction();
        a.b((new StringBuilder()).append("ACTION: ").append(s).toString());
        if ("android.intent.action.DOWNLOAD_COMPLETE".equals(s))
        {
            a(context, intent.getLongExtra("extra_download_id", 0L));
        } else
        {
            if ("aviary.android.cds.intent.action.ACTION_DOWNLOAD_PACKS_CONTENT".equals(s))
            {
                b(context, intent);
                return;
            }
            if ("aviary.android.cds.intent.action.ACTION_REMOVE_DOWNLOAD_CONTENT".equals(s))
            {
                c(context, intent);
                return;
            }
            if ("aviary.android.cds.intent.action.ACTION_NOTIFICATION_DISMISSED".equals(s))
            {
                a(context, intent);
                return;
            }
        }
    }

    static 
    {
        a = com.aviary.android.feather.common.a.a.a("AviaryCdsReceiver", com.aviary.android.feather.common.a.a.d.a);
    }
}
