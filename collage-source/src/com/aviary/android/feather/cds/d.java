// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aviary.android.feather.cds;

import android.app.DownloadManager;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Environment;
import android.text.TextUtils;
import com.aviary.android.feather.common.a.a;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Locale;
import junit.framework.Assert;

// Referenced classes of package com.aviary.android.feather.cds:
//            h, f

public final class com.aviary.android.feather.cds.d
{
    static class a extends b
    {

        private String a()
            throws AssertionError
        {
            com.aviary.android.feather.cds.d.a.b("createDownloadDirectory");
            Assert.assertTrue("External storage is not available", b());
            String s;
            File file;
            if (android.os.Build.VERSION.SDK_INT >= 11)
            {
                s = Environment.DIRECTORY_DOWNLOADS;
            } else
            {
                s = "temp";
            }
            com.aviary.android.feather.cds.d.a.b("dst: %s", new Object[] {
                s
            });
            file = Environment.getExternalStoragePublicDirectory(s);
            if (file != null)
            {
                com.aviary.android.feather.cds.d.a.b("root: %s, isDirectory: %b", new Object[] {
                    file.getAbsolutePath(), Boolean.valueOf(file.isDirectory())
                });
                if (file.isDirectory())
                {
                    return file.getName();
                }
            }
            for (int i = 0; i < 10; i++)
            {
                com.aviary.android.feather.cds.d.a.b("i: %d, %s", new Object[] {
                    Integer.valueOf(i), (new StringBuilder()).append(s).append(i).toString()
                });
                File file1 = Environment.getExternalStoragePublicDirectory((new StringBuilder()).append(s).append(i).toString());
                if (file1 == null)
                {
                    continue;
                }
                if (!file1.exists())
                {
                    file1.mkdirs();
                }
                if (file1.exists() && file1.isDirectory())
                {
                    return file1.getName();
                }
            }

            return null;
        }

        private boolean b()
        {
            String s = Environment.getExternalStorageState();
            return "checking".equals(s) || "mounted".equals(s);
        }

        public String a(Context context, long l, boolean flag)
            throws AssertionError
        {
            Object obj;
            Object obj1;
            Object obj2;
            Object obj3;
            Assert.assertNotNull("Invalid Context", context);
            obj = h.b(context);
            Assert.assertNotNull("Failed to retrieve manifest", obj);
            obj3 = ((t.b) (obj)).b();
            Assert.assertNotNull("Failed to retrieve baseUrl", obj3);
            obj = null;
            obj1 = null;
            obj2 = context.getContentResolver().query(h.b(context, (new StringBuilder()).append("pack/id/").append(l).append("/content").toString()), new String[] {
                "pack_id", "pack_identifier", "pack_type", "content_id", "content_packId", "content_contentURL", "content_displayName"
            }, null, null, null);
            if (obj2 == null) goto _L2; else goto _L1
_L1:
            if (!((Cursor) (obj2)).moveToFirst()) goto _L4; else goto _L3
_L3:
            obj = com.aviary.android.feather.cds.m.a.a(((Cursor) (obj2)));
            obj1 = com.aviary.android.feather.cds.n.a.a(((Cursor) (obj2)));
_L23:
            com.aviary.android.feather.common.utils.d.a(((Cursor) (obj2)));
_L2:
            Object obj4;
            Object obj5;
            DownloadManager downloadmanager;
            Cursor cursor;
            String s;
            Assert.assertNotNull("Invalid pack informations", obj);
            Assert.assertNotNull("Invalid pack's content informations", obj1);
            Assert.assertNotNull("Invalid Context", obj1);
            obj2 = ((n.a) (obj1)).e();
            if (!TextUtils.isEmpty(((CharSequence) (obj2))) && !((String) (obj2)).startsWith("http://") && !((String) (obj2)).startsWith("https://"))
            {
                obj2 = (new StringBuilder()).append(((String) (obj3))).append(((String) (obj2))).toString();
            }
            com.aviary.android.feather.cds.d.a.b("contentUrl: %s", new Object[] {
                obj2
            });
            s = ((m.a) (obj)).a();
            cursor = context.getContentResolver().query(h.b(context, (new StringBuilder()).append("packDownloadStatus/").append(l).toString()), new String[] {
                "download_refId"
            }, null, null, null);
            downloadmanager = (DownloadManager)context.getSystemService("download");
            obj4 = null;
            obj3 = null;
            obj5 = obj3;
            if (cursor == null) goto _L6; else goto _L5
_L5:
            obj5 = obj3;
            obj3 = obj4;
            if (!cursor.moveToFirst()) goto _L6; else goto _L7
_L7:
            obj3 = obj4;
            long l1 = cursor.getLong(cursor.getColumnIndex("download_refId"));
            obj3 = obj4;
            obj5 = new android.app.DownloadManager.Query();
            obj3 = obj4;
            ((android.app.DownloadManager.Query) (obj5)).setFilterById(new long[] {
                l1
            });
            obj3 = obj4;
            obj4 = downloadmanager.query(((android.app.DownloadManager.Query) (obj5)));
            if (obj4 == null) goto _L9; else goto _L8
_L8:
            obj3 = obj4;
            if (!((Cursor) (obj4)).moveToFirst()) goto _L9; else goto _L10
_L10:
            obj3 = obj4;
            int i = ((Cursor) (obj4)).getInt(((Cursor) (obj4)).getColumnIndex("status"));
            obj3 = obj4;
            int j = ((Cursor) (obj4)).getColumnIndex("uri");
            if (j <= -1) goto _L12; else goto _L11
_L11:
            obj3 = obj4;
            obj5 = ((Cursor) (obj4)).getString(j);
              goto _L13
_L9:
            obj3 = obj4;
            downloadmanager.remove(new long[] {
                l1
            });
            obj3 = obj4;
            i = context.getContentResolver().delete(h.b(context, (new StringBuilder()).append("pack/").append(l).append("/delete_download_entry").toString()), null, null);
            obj3 = obj4;
            com.aviary.android.feather.cds.d.a.b((new StringBuilder()).append(i).append(" entries deleted in download_packs_table for packId ").append(l).toString());
            obj5 = obj4;
            if (i != 0) goto _L6; else goto _L14
_L14:
            obj3 = obj4;
            com.aviary.android.feather.cds.d.a.d("failed to remove download entry");
            obj5 = obj4;
_L6:
            com.aviary.android.feather.common.utils.d.a(cursor);
            com.aviary.android.feather.common.utils.d.a(((Cursor) (obj5)));
            if (((n.a) (obj1)).f() != null)
            {
                obj1 = ((n.a) (obj1)).f();
            } else
            {
                obj1 = "Downloading";
            }
            obj2 = Uri.parse(((String) (obj2)));
            obj3 = new android.app.DownloadManager.Request(((Uri) (obj2)));
            if (((Uri) (obj2)).getLastPathSegment() == null)
            {
                obj2 = (new StringBuilder()).append(((m.a) (obj)).a()).append("-").append(System.currentTimeMillis()).append(".temp").toString();
            } else
            {
                obj2 = (new StringBuilder()).append(System.currentTimeMillis()).append("-").append(((Uri) (obj2)).getLastPathSegment()).toString();
            }
            obj4 = a();
            com.aviary.android.feather.cds.d.a.b("downloadPath: %s", new Object[] {
                obj4
            });
            Assert.assertNotNull("Failed to create directory to download contents", obj4);
            ((android.app.DownloadManager.Request) (obj3)).setTitle(((CharSequence) (obj1)));
            ((android.app.DownloadManager.Request) (obj3)).setDestinationInExternalPublicDir(((String) (obj4)), ((String) (obj2)));
            l1 = downloadmanager.enqueue(((android.app.DownloadManager.Request) (obj3)));
            com.aviary.android.feather.cds.d.a.a((new StringBuilder()).append("Download content, packId: ").append(l).append(" with downloadId: ").append(l1).toString());
            obj1 = new ContentValues();
            ((ContentValues) (obj1)).put("download_packId", Long.valueOf(l));
            ((ContentValues) (obj1)).put("download_refId", Long.valueOf(l1));
            obj1 = context.getContentResolver().insert(h.b(context, "insertPacksDownloadTable"), ((ContentValues) (obj1)));
            Assert.assertNotNull("Failed to insert data into the database", obj1);
            if (context.getContentResolver().update(h.b(context, (new StringBuilder()).append("download/id/").append(l1).append("/updateStatus/1").toString()), new ContentValues(), null, null) > 0 && flag)
            {
                com.aviary.android.feather.cds.h.a(context, l, ((m.a) (obj)).b(), 1);
            }
            return ((Uri) (obj1)).toString();
            context;
            com.aviary.android.feather.common.utils.d.a(((Cursor) (obj2)));
            throw context;
_L12:
            obj5 = null;
              goto _L13
_L17:
            obj3 = obj4;
            com.aviary.android.feather.cds.d.a.c((new StringBuilder()).append("The download for ").append(s).append(" has already started with downloadId ").append(l1).toString());
            com.aviary.android.feather.common.utils.d.a(cursor);
            com.aviary.android.feather.common.utils.d.a(((Cursor) (obj4)));
            return ((String) (obj5));
_L20:
            obj3 = obj4;
            com.aviary.android.feather.cds.d.a.c("Download failed, trying again");
              goto _L9
            context;
            com.aviary.android.feather.common.utils.d.a(cursor);
            com.aviary.android.feather.common.utils.d.a(((Cursor) (obj3)));
            throw context;
_L16:
            obj3 = obj4;
            com.aviary.android.feather.cds.d.a.a("Download is pending");
              goto _L9
_L18:
            obj3 = obj4;
            com.aviary.android.feather.cds.d.a.a("Download is paused");
              goto _L9
_L19:
            obj3 = obj4;
            com.aviary.android.feather.cds.d.a.a("Download was successful, but restarting");
              goto _L9
_L4:
            obj1 = null;
            obj = null;
            continue; /* Loop/switch isn't completed */
_L13:
            i;
            JVM INSTR lookupswitch 5: default 1204
        //                       1: 1044
        //                       2: 956
        //                       4: 1062
        //                       8: 1080
        //                       16: 1013;
               goto _L15 _L16 _L17 _L18 _L19 _L20
_L15:
            if (true) goto _L9; else goto _L21
_L21:
            if (true) goto _L23; else goto _L22
_L22:
        }

        a()
        {
        }
    }

    public static abstract class b
    {

        public final String a(Context context, long l)
            throws IOException, AssertionError
        {
            return a(context, l, true);
        }

        public abstract String a(Context context, long l, boolean flag)
            throws IOException, AssertionError;

        public b()
        {
        }
    }

    static class c extends b
    {

        public String a(Context context, long l, boolean flag)
            throws IOException, AssertionError
        {
            Object obj;
            Object obj2;
            Assert.assertNotNull("null context", context);
            t.b b1 = h.b(context);
            Assert.assertNotNull("null manifest", b1);
            obj2 = b1.b();
            Assert.assertNotNull("null baseUrl", obj2);
            obj = context.getContentResolver().query(h.b(context, (new StringBuilder()).append("message/id/").append(l).append("/content").toString()), new String[] {
                "msg_id", "msg_identifier", "msg_type", "msgcnt_id", "msgcnt_messageId", "msgcnt_contentURL"
            }, null, null, null);
            if (obj == null)
            {
                break MISSING_BLOCK_LABEL_535;
            }
            if (!((Cursor) (obj)).moveToFirst()) goto _L2; else goto _L1
_L1:
            l.a a1;
            k.a a2;
            a2 = com.aviary.android.feather.cds.k.a.a(((Cursor) (obj)));
            a1 = com.aviary.android.feather.cds.l.a.a(((Cursor) (obj)));
_L3:
            com.aviary.android.feather.common.utils.d.a(((Cursor) (obj)));
_L4:
            Assert.assertNotNull("message is null", a2);
            Assert.assertNotNull("messageContent is null", a1);
            Object obj1 = a1.a();
            obj = obj1;
            if (!TextUtils.isEmpty(((CharSequence) (obj1))))
            {
                obj = obj1;
                if (!((String) (obj1)).startsWith("http://"))
                {
                    obj = obj1;
                    if (!((String) (obj1)).startsWith("https://"))
                    {
                        obj = (new StringBuilder()).append(((String) (obj2))).append(((String) (obj1))).toString();
                    }
                }
            }
            com.aviary.android.feather.cds.d.a.b("messageUrl: %s", new Object[] {
                obj
            });
            obj1 = a2.c();
            obj = com.aviary.android.feather.common.utils.d.a(((String) (obj)), null);
            obj1 = h.b(((String) (obj1)));
            obj2 = new File(context.getFilesDir(), ((String) (obj1)));
            ((File) (obj2)).mkdirs();
            Assert.assertTrue((new StringBuilder()).append("failed to create dest folder: ").append(((String) (obj1))).toString(), ((File) (obj2)).isDirectory());
            ((File) (obj2)).setReadable(true, false);
            obj1 = File.createTempFile("message_", ".jpg", ((File) (obj2)));
            obj2 = new FileOutputStream(((File) (obj1)));
            com.aviary.android.feather.common.utils.d.a(((java.io.InputStream) (obj)), ((java.io.OutputStream) (obj2)));
            com.aviary.android.feather.common.utils.d.a(((java.io.Closeable) (obj)));
            com.aviary.android.feather.common.utils.d.a(((java.io.Closeable) (obj2)));
            obj = new ContentValues();
            ((ContentValues) (obj)).put("msgcnt_contentPath", ((File) (obj1)).getAbsolutePath());
            com.aviary.android.feather.cds.d.a.a((new StringBuilder()).append("updating: ").append(a2.p()).append(", ").append(a1.p()).toString());
            boolean flag1;
            if (context.getContentResolver().update(h.b(context, (new StringBuilder()).append("message/id/").append(a2.p()).append("/content/id/").append(a1.p()).append("/update").toString()), ((ContentValues) (obj)), null, null) > 0)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            Assert.assertTrue("failed to update the provider", flag1);
            if (flag)
            {
                h.f(context, l);
            }
            return ((File) (obj1)).getAbsolutePath();
            context;
            com.aviary.android.feather.common.utils.d.a(((Cursor) (obj)));
            throw context;
_L2:
            a1 = null;
            a2 = null;
              goto _L3
            a1 = null;
            a2 = null;
              goto _L4
        }

        c()
        {
        }
    }

    static class d extends b
    {

        public String a(Context context, long l, boolean flag)
            throws IOException, AssertionError
        {
            Object obj2;
            String s1;
            Assert.assertNotNull("null context", context);
            t.b b1 = h.b(context);
            Assert.assertNotNull("null manifest", b1);
            s1 = b1.b();
            Assert.assertNotNull("null baseUrl", s1);
            obj2 = context.getContentResolver().query(h.b(context, (new StringBuilder()).append("pack/id/").append(l).append("/content").toString()), new String[] {
                "pack_id", "pack_identifier", "pack_type", "content_id", "content_packId", "content_previewURL"
            }, null, null, null);
            if (obj2 == null)
            {
                break MISSING_BLOCK_LABEL_573;
            }
            if (!((Cursor) (obj2)).moveToFirst()) goto _L2; else goto _L1
_L1:
            Object obj;
            Object obj1;
            obj1 = com.aviary.android.feather.cds.m.a.a(((Cursor) (obj2)));
            obj = com.aviary.android.feather.cds.n.a.a(((Cursor) (obj2)));
_L3:
            com.aviary.android.feather.common.utils.d.a(((Cursor) (obj2)));
_L4:
            Assert.assertNotNull("null pack", obj1);
            Assert.assertNotNull("null context", obj);
            String s = ((n.a) (obj)).d();
            obj2 = s;
            if (!TextUtils.isEmpty(s))
            {
                obj2 = s;
                if (!s.startsWith("http://"))
                {
                    obj2 = s;
                    if (!s.startsWith("https://"))
                    {
                        obj2 = (new StringBuilder()).append(s1).append(s).toString();
                    }
                }
            }
            com.aviary.android.feather.cds.d.a.b("previewUrl: %s", new Object[] {
                obj2
            });
            s = ((m.a) (obj1)).a();
            obj1 = ((m.a) (obj1)).b();
            long l1 = ((n.a) (obj)).p();
            obj2 = com.aviary.android.feather.common.utils.d.a(((String) (obj2)), null);
            s = h.e(s);
            obj = new File(context.getFilesDir(), s);
            ((File) (obj)).mkdirs();
            Assert.assertTrue((new StringBuilder()).append("failed to create dest folder: ").append(s).toString(), ((File) (obj)).isDirectory());
            ((File) (obj)).setReadable(true, false);
            com.aviary.android.feather.common.utils.d.a(((java.io.InputStream) (obj2)), ((File) (obj)));
            com.aviary.android.feather.common.utils.d.a(((java.io.Closeable) (obj2)));
            obj1 = com.aviary.android.feather.cds.a.b.valueOf(((String) (obj1)).toUpperCase(Locale.US));
            Assert.assertTrue("invalid preview content", com.aviary.android.feather.cds.f.a(com.aviary.android.feather.cds.a.a.a, ((a.b) (obj1))).a(context, l, ((File) (obj)), false));
            obj1 = new ContentValues();
            ((ContentValues) (obj1)).put("content_previewPath", ((File) (obj)).getAbsolutePath());
            com.aviary.android.feather.cds.d.a.a((new StringBuilder()).append("updating: ").append(l).append(", ").append(l1).toString());
            com.aviary.android.feather.cds.d.a.a((new StringBuilder()).append("destFolder: ").append(((File) (obj)).getAbsolutePath()).toString());
            boolean flag1;
            if (context.getContentResolver().update(h.b(context, (new StringBuilder()).append("pack/id/").append(l).append("/content/id/").append(l1).append("/update").toString()), ((ContentValues) (obj1)), null, null) > 0)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            Assert.assertTrue("failed to update the provider", flag1);
            if (flag)
            {
                h.g(context, l);
            }
            return ((File) (obj)).getAbsolutePath();
            context;
            com.aviary.android.feather.common.utils.d.a(((Cursor) (obj2)));
            throw context;
_L2:
            obj = null;
            obj1 = null;
              goto _L3
            obj = null;
            obj1 = null;
              goto _L4
        }

        d()
        {
        }
    }


    static final com.aviary.android.feather.common.a.a.c a;

    public com.aviary.android.feather.cds.d()
    {
    }

    public static b a(a.a a1)
    {
        static class _cls1
        {

            static final int a[];

            static 
            {
                a = new int[com.aviary.android.feather.cds.a.a.values().length];
                try
                {
                    a[com.aviary.android.feather.cds.a.a.a.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[a.a.b.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[a.a.c.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (com.aviary.android.feather.cds._cls1.a[a1.ordinal()])
        {
        default:
            return null;

        case 1: // '\001'
            return new d();

        case 2: // '\002'
            return new a();

        case 3: // '\003'
            return new c();
        }
    }

    static 
    {
        a = com.aviary.android.feather.common.a.a.a(com/aviary/android/feather/cds/d.getSimpleName(), com.aviary.android.feather.common.a.a.d.a);
    }
}
