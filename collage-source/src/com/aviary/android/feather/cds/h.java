// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aviary.android.feather.cds;

import android.app.DownloadManager;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.Pair;
import com.aviary.android.feather.cds.billing.util.Purchase;
import com.aviary.android.feather.common.a.a;
import com.aviary.android.feather.common.utils.d;
import com.aviary.android.feather.common.utils.e;
import com.aviary.android.feather.common.utils.f;
import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import junit.framework.Assert;
import org.apache.commons.io.FileUtils;
import org.apache.http.NameValuePair;
import org.apache.http.client.utils.URLEncodedUtils;
import org.apache.http.message.BasicNameValuePair;

// Referenced classes of package com.aviary.android.feather.cds:
//            d

public final class h
{
    public static final class a extends Enum
    {

        public static final a a;
        public static final a b;
        public static final a c;
        public static final a d;
        public static final a e;
        public static final a f;
        public static final a g;
        public static final a h;
        public static final a i;
        public static final a j;
        public static final a k;
        private static final a l[];

        public static a a(int i1)
        {
            switch (i1)
            {
            default:
                return null;

            case 4: // '\004'
            case 16: // '\020'
                return j;

            case 1: // '\001'
            case 2: // '\002'
                return i;

            case 8: // '\b'
                return k;
            }
        }

        public static boolean a(a a1)
        {
            return a1 != null && (a1 == e || a1 == f);
        }

        public static boolean b(a a1)
        {
            static class _cls2
            {

                static final int a[];

                static 
                {
                    a = new int[a.values().length];
                    try
                    {
                        a[a.g.ordinal()] = 1;
                    }
                    catch (NoSuchFieldError nosuchfielderror7) { }
                    try
                    {
                        a[a.i.ordinal()] = 2;
                    }
                    catch (NoSuchFieldError nosuchfielderror6) { }
                    try
                    {
                        a[a.k.ordinal()] = 3;
                    }
                    catch (NoSuchFieldError nosuchfielderror5) { }
                    try
                    {
                        a[com.aviary.android.feather.cds.a.e.ordinal()] = 4;
                    }
                    catch (NoSuchFieldError nosuchfielderror4) { }
                    try
                    {
                        a[com.aviary.android.feather.cds.a.f.ordinal()] = 5;
                    }
                    catch (NoSuchFieldError nosuchfielderror3) { }
                    try
                    {
                        a[a.b.ordinal()] = 6;
                    }
                    catch (NoSuchFieldError nosuchfielderror2) { }
                    try
                    {
                        a[a.c.ordinal()] = 7;
                    }
                    catch (NoSuchFieldError nosuchfielderror1) { }
                    try
                    {
                        a[com.aviary.android.feather.cds.a.d.ordinal()] = 8;
                    }
                    catch (NoSuchFieldError nosuchfielderror)
                    {
                        return;
                    }
                }
            }

            switch (com.aviary.android.feather.cds._cls2.a[a1.ordinal()])
            {
            default:
                return false;

            case 4: // '\004'
            case 5: // '\005'
                return true;
            }
        }

        public static boolean c(a a1)
        {
            switch (com.aviary.android.feather.cds._cls2.a[a1.ordinal()])
            {
            default:
                return false;

            case 6: // '\006'
            case 7: // '\007'
            case 8: // '\b'
                return true;
            }
        }

        public static a valueOf(String s)
        {
            return (a)Enum.valueOf(com/aviary/android/feather/cds/h$a, s);
        }

        public static a[] values()
        {
            return (a[])l.clone();
        }

        static 
        {
            a = new a("PURCHASE", 0);
            b = new a("FREE", 1);
            c = new a("INSTALL", 2);
            d = new a("RESTORE", 3);
            e = new a("OWNED", 4);
            f = new a("UNINSTALL", 5);
            g = new a("PACK_OPTION_BEING_DETERMINED", 6);
            h = new a("ERROR", 7);
            i = new a("DOWNLOADING", 8);
            j = new a("DOWNLOAD_ERROR", 9);
            k = new a("DOWNLOAD_COMPLETE", 10);
            l = (new a[] {
                a, b, c, d, e, f, g, h, i, j, 
                k
            });
        }

        private a(String s, int i1)
        {
            super(s, i1);
        }
    }

    public static final class b
        implements Serializable
    {

        public String a;
        public a b;

        public boolean equals(Object obj)
        {
            if (obj instanceof b)
            {
                if (com.aviary.android.feather.common.utils.e.a(((b) (obj = (b)obj)).b, b) && com.aviary.android.feather.common.utils.e.a(((b) (obj)).a, a))
                {
                    return true;
                }
            }
            return false;
        }

        public String toString()
        {
            return (new StringBuilder()).append("PackOptionWithPrice{ option: ").append(b.name()).append(", price: ").append(a).append("}").toString();
        }

        public b(a a1)
        {
            this(a1, null);
        }

        public b(a a1, String s)
        {
            b = a1;
            a = s;
        }
    }


    static final String a[] = {
        "download_refId"
    };
    static final HashMap b;
    public static final List c = new ArrayList(Arrays.asList(new String[] {
        "en", "ja", "zh", "ko", "id", "pt", "fr", "de"
    }));
    public static final List d = new ArrayList(Arrays.asList(new String[] {
        "US", "JP", "CN", "KR", "ID", "IN", "BR", "GB", "FR", "DE"
    }));
    static final List e = Arrays.asList(new Integer[] {
        Integer.valueOf(160), Integer.valueOf(240), Integer.valueOf(320), Integer.valueOf(480)
    });
    static String f;
    private static final Comparator g = new Comparator() {

        public int a(NameValuePair namevaluepair, NameValuePair namevaluepair1)
        {
            return namevaluepair.getName().compareTo(namevaluepair1.getName());
        }

        public int compare(Object obj, Object obj1)
        {
            return a((NameValuePair)obj, (NameValuePair)obj1);
        }

    };

    public h()
    {
    }

    static Cursor a(Context context, String as[], String s, String as1[])
    {
        return context.getContentResolver().query(b(context, "pack/list"), as, s, as1, null);
    }

    public static a a(Context context, m.a a1)
    {
        if (context == null || a1 == null || a1.f() == null)
        {
            return a.h;
        }
        if (com.aviary.android.feather.common.a.a.a)
        {
            Log.d("CdsUtils", (new StringBuilder()).append("pack.content: ").append(a1.f()).toString());
        }
        if (a1.f().o() == 1)
        {
            if (TextUtils.isEmpty(a1.f().i()))
            {
                if (com.aviary.android.feather.common.a.a.a)
                {
                    Log.w("CdsUtils", "purchased but without content");
                }
                return com.aviary.android.feather.cds.a.d;
            }
            if ((new File(a1.f().i())).isDirectory())
            {
                return com.aviary.android.feather.cds.a.e;
            }
            if (com.aviary.android.feather.common.a.a.a)
            {
                Log.d("CdsUtils", (new StringBuilder()).append(a1.a()).append(" owned but not correctly installed").toString());
            }
            return com.aviary.android.feather.cds.a.d;
        }
        if (a1.f().n() == 1)
        {
            return a.b;
        }
        String s = a(a1.a());
        if (s != null && a(context, s))
        {
            return com.aviary.android.feather.cds.a.d;
        }
        if (a(context, com.aviary.android.feather.cds.a.b.a(a1.b())))
        {
            return a.c;
        } else
        {
            return a.g;
        }
    }

    public static k.a a(Context context, String s, String as[])
    {
        as = null;
        s = context.getContentResolver().query(b(context, (new StringBuilder()).append("message/identifier/").append(s).toString()), null, null, null, null);
        context = as;
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_60;
        }
        context = as;
        if (s.moveToFirst())
        {
            context = com.aviary.android.feather.cds.k.a.a(s);
        }
        com.aviary.android.feather.common.utils.d.a(s);
        return context;
        context;
        com.aviary.android.feather.common.utils.d.a(s);
        throw context;
    }

    public static m.a a(Context context, long l, String as[])
    {
        Cursor cursor;
        as = null;
        cursor = context.getContentResolver().query(b(context, (new StringBuilder()).append("pack/id/").append(l).toString()), null, null, null, null);
        context = as;
        if (cursor == null)
        {
            break MISSING_BLOCK_LABEL_64;
        }
        context = as;
        if (cursor.moveToFirst())
        {
            context = com.aviary.android.feather.cds.m.a.a(cursor);
        }
        com.aviary.android.feather.common.utils.d.a(cursor);
        return context;
        context;
        com.aviary.android.feather.common.utils.d.a(cursor);
        throw context;
    }

    static String a(int i)
    {
        switch (i)
        {
        case 1005: 
        default:
            return "Unknown error";

        case 1008: 
            return "Cannot resume download";

        case 1007: 
            return "SD card not mounted";

        case 1009: 
            return "File already exists";

        case 1004: 
            return "Failed to download file";

        case 1006: 
            return "SD card is full";
        }
    }

    static String a(int i, int j)
    {
        switch (i)
        {
        default:
            return null;

        case 4: // '\004'
            return b(j);

        case 16: // '\020'
            return a(j);
        }
    }

    public static String a(Context context, long l)
    {
        Cursor cursor;
        Object obj = null;
        cursor = context.getContentResolver().query(b(context, (new StringBuilder()).append("pack/id/").append(l).append("/content").toString()), new String[] {
            "content_contentPath"
        }, null, null, null);
        context = obj;
        if (cursor == null)
        {
            break MISSING_BLOCK_LABEL_94;
        }
        if (!cursor.moveToFirst())
        {
            break MISSING_BLOCK_LABEL_96;
        }
        context = cursor.getString(cursor.getColumnIndex("content_contentPath"));
        com.aviary.android.feather.common.utils.d.a(cursor);
        return context;
        com.aviary.android.feather.common.utils.d.a(cursor);
        return null;
        context;
        com.aviary.android.feather.common.utils.d.a(cursor);
        throw context;
    }

    public static String a(Context context, long l, boolean flag)
        throws AssertionError, IOException
    {
        String s1;
        Cursor cursor;
        s1 = null;
        if (com.aviary.android.feather.common.a.a.a)
        {
            Log.i("CdsUtils", (new StringBuilder()).append("requestPackDownload: ").append(l).toString());
        }
        Assert.assertNotNull("Invalid Context", context);
        cursor = context.getContentResolver().query(b(context, (new StringBuilder()).append("pack/id/").append(l).append("/content").toString()), new String[] {
            "pack_id", "pack_identifier", "content_id", "content_contentURL"
        }, null, null, null);
        if (!cursor.moveToFirst()) goto _L2; else goto _L1
_L1:
        String s;
        s = cursor.getString(cursor.getColumnIndex("pack_identifier"));
        s1 = cursor.getString(cursor.getColumnIndex("content_contentURL"));
_L4:
        com.aviary.android.feather.common.utils.d.a(cursor);
        Assert.assertNotNull("Failed to retrieve the pack identifier", s);
        Assert.assertNotNull("Failed to retrieve the pack download url", s1);
        return com.aviary.android.feather.cds.d.a(a.a.b).a(context, l, flag);
        context;
        com.aviary.android.feather.common.utils.d.a(cursor);
        throw context;
_L2:
        s = null;
        if (true) goto _L4; else goto _L3
_L3:
    }

    public static String a(String s)
    {
        return (String)b.get(s);
    }

    public static String a(Collection collection)
    {
        StringBuilder stringbuilder = new StringBuilder();
        collection = collection.iterator();
        do
        {
            if (!collection.hasNext())
            {
                break;
            }
            String s = (String)collection.next();
            stringbuilder.append("'").append(s).append("'");
            if (collection.hasNext())
            {
                stringbuilder.append(",");
            }
        } while (true);
        return stringbuilder.toString();
    }

    static Iterator a()
    {
        return b.entrySet().iterator();
    }

    static List a(Context context)
    {
        return a(context, a());
    }

    static List a(Context context, Iterator iterator)
    {
        ArrayList arraylist = new ArrayList();
        if (iterator != null)
        {
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                java.util.Map.Entry entry = (java.util.Map.Entry)iterator.next();
                String s = (String)entry.getKey();
                if (a(context, (String)entry.getValue()))
                {
                    arraylist.add(s);
                }
            } while (true);
        }
        return arraylist;
    }

    static void a(Context context, long l, String s, int i)
    {
        if (context != null)
        {
            Log.i("CdsUtils", (new StringBuilder()).append("notifyDownloadStatusChange, packId = ").append(l).toString());
            context.getContentResolver().notifyChange(b(context, (new StringBuilder()).append("download/statusChanged/").append(l).append("/").append(i).toString()), null);
            Intent intent = new Intent((new StringBuilder()).append(context.getPackageName()).append(".cds.downloadStatusChanged").toString());
            intent.putExtra("packId", l);
            intent.putExtra("status", i);
            intent.putExtra("packType", s);
            context.sendBroadcast(intent);
        }
    }

    public static final void a(Context context, long l, String s, Purchase purchase)
    {
        if (context != null)
        {
            Intent intent = new Intent((new StringBuilder()).append(context.getPackageName()).append(".cds.packPurchased").toString());
            intent.putExtra("packType", s);
            intent.putExtra("packId", l);
            intent.putExtra("purchase", purchase);
            context.sendBroadcast(intent);
        }
    }

    static void a(Context context, String s, int i)
    {
        if (context != null)
        {
            Log.i("CdsUtils", (new StringBuilder()).append("notifyDownloadMissingPacksCompleted, packType = ").append(s).append(", error: ").append(i).toString());
            context.getContentResolver().notifyChange(b(context, (new StringBuilder()).append("downloadMissingPacks/completed/").append(s).append("/").append(i).toString()), null);
            Intent intent = new Intent((new StringBuilder()).append(context.getPackageName()).append(".cds.downloadMissingPacksCompleted").toString());
            intent.putExtra("error", i);
            intent.putExtra("packType", s);
            context.sendBroadcast(intent);
        }
    }

    static void a(List list, String s)
    {
        Collections.sort(list, g);
        String s1 = URLEncodedUtils.format(list, "utf-8");
        MessageDigest messagedigest;
        try
        {
            messagedigest = MessageDigest.getInstance("SHA-256");
        }
        // Misplaced declaration of an exception variable
        catch (List list)
        {
            list.printStackTrace();
            return;
        }
        s = (new StringBuilder()).append(s1).append(s).toString();
        Log.d("CdsUtils", (new StringBuilder()).append("query: ").append(s).toString());
        messagedigest.update(s.getBytes());
        list.add(new BasicNameValuePair("signature", Base64.encodeToString(messagedigest.digest(), 2)));
    }

    public static boolean a(Context context, a.b b1)
    {
        Uri uri = b(context, "subscription/content/list");
        context = context.getContentResolver().query(uri, null, "subscriptions_content_purchased=1", null, null);
        if (context == null)
        {
            return false;
        }
_L2:
        Object obj;
        if (!context.moveToNext())
        {
            break; /* Loop/switch isn't completed */
        }
        obj = com.aviary.android.feather.cds.r.a.a(context);
        if (obj == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        boolean flag;
        if (((r.a) (obj)).a() != 1)
        {
            continue; /* Loop/switch isn't completed */
        }
        obj = ((r.a) (obj)).b();
        flag = "all".equals(obj);
        if (flag)
        {
            com.aviary.android.feather.common.utils.d.a(context);
            return true;
        }
        flag = ((String) (obj)).equals(b1.a());
        if (flag)
        {
            com.aviary.android.feather.common.utils.d.a(context);
            return true;
        }
        if (true) goto _L2; else goto _L1
_L1:
        com.aviary.android.feather.common.utils.d.a(context);
        return false;
        b1;
        com.aviary.android.feather.common.utils.d.a(context);
        throw b1;
    }

    static boolean a(Context context, String s)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (s != null)
        {
            flag = flag1;
            if (com.aviary.android.feather.common.utils.f.a(context, s, 0) != null)
            {
                flag = true;
            }
        }
        return flag;
    }

    static Uri b(Context context, String s)
    {
        return com.aviary.android.feather.common.utils.f.a(context, s);
    }

    public static Pair b(Context context, long l)
    {
        Object obj;
        Cursor cursor;
        obj = null;
        cursor = context.getContentResolver().query(b(context, (new StringBuilder()).append("packDownloadStatus/").append(l).toString()), a, null, null, null);
        context = (DownloadManager)context.getSystemService("download");
        if (cursor == null)
        {
            break MISSING_BLOCK_LABEL_194;
        }
        if (!cursor.moveToFirst())
        {
            break MISSING_BLOCK_LABEL_194;
        }
        l = cursor.getLong(0);
        android.app.DownloadManager.Query query = new android.app.DownloadManager.Query();
        query.setFilterById(new long[] {
            l
        });
        context = context.query(query);
        if (context == null)
        {
            break MISSING_BLOCK_LABEL_122;
        }
        boolean flag = context.moveToFirst();
        if (flag)
        {
            break MISSING_BLOCK_LABEL_133;
        }
        com.aviary.android.feather.common.utils.d.a(cursor);
        com.aviary.android.feather.common.utils.d.a(context);
        return null;
        int i = context.getInt(context.getColumnIndex("status"));
        obj = new Pair(Integer.valueOf(i), a(i, context.getInt(context.getColumnIndex("reason"))));
        com.aviary.android.feather.common.utils.d.a(cursor);
        com.aviary.android.feather.common.utils.d.a(context);
        return ((Pair) (obj));
        com.aviary.android.feather.common.utils.d.a(cursor);
        com.aviary.android.feather.common.utils.d.a(null);
        return null;
        context;
_L2:
        com.aviary.android.feather.common.utils.d.a(cursor);
        com.aviary.android.feather.common.utils.d.a(((Cursor) (obj)));
        throw context;
        Exception exception;
        exception;
        obj = context;
        context = exception;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public static m.a b(Context context, String s, String as[])
    {
        as = null;
        s = context.getContentResolver().query(b(context, (new StringBuilder()).append("pack/identifier/").append(s).toString()), null, null, null, null);
        context = as;
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_60;
        }
        context = as;
        if (s.moveToFirst())
        {
            context = com.aviary.android.feather.cds.m.a.a(s);
        }
        com.aviary.android.feather.common.utils.d.a(s);
        return context;
        context;
        com.aviary.android.feather.common.utils.d.a(s);
        throw context;
    }

    public static n.a b(Context context, long l, String as[])
    {
        Object obj = null;
        as = context.getContentResolver().query(b(context, (new StringBuilder()).append("pack/id/").append(l).append("/content").toString()), as, null, null, null);
        context = obj;
        if (as == null)
        {
            break MISSING_BLOCK_LABEL_69;
        }
        context = obj;
        if (as.moveToFirst())
        {
            context = com.aviary.android.feather.cds.n.a.a(as);
        }
        com.aviary.android.feather.common.utils.d.a(as);
        return context;
        context;
        com.aviary.android.feather.common.utils.d.a(as);
        throw context;
    }

    static t.b b(Context context)
    {
        context = context.getContentResolver().query(b(context, "manifestVersion"), null, null, null, null);
        if (context == null)
        {
            break MISSING_BLOCK_LABEL_43;
        }
        t.b b1;
        if (!context.moveToFirst())
        {
            break MISSING_BLOCK_LABEL_43;
        }
        b1 = com.aviary.android.feather.cds.t.b.a(context);
        com.aviary.android.feather.common.utils.d.a(context);
        return b1;
        com.aviary.android.feather.common.utils.d.a(context);
        return null;
        Exception exception;
        exception;
        com.aviary.android.feather.common.utils.d.a(context);
        throw exception;
    }

    static String b(int i)
    {
        switch (i)
        {
        default:
            return "Paused";

        case 3: // '\003'
            return "Paused, waiting for wifi";

        case 2: // '\002'
            return "Paused. Waiting for network";

        case 1: // '\001'
            return "Paused. Waiting to retry";
        }
    }

    static String b(String s)
    {
        return (new StringBuilder()).append(f(s)).append("/message_content").toString();
    }

    static final void b(Context context, long l, String s, int i)
    {
        if (context != null)
        {
            context.getContentResolver().notifyChange(b(context, (new StringBuilder()).append("pack/purchased/").append(l).append("/").append(i).toString()), null);
            Intent intent = new Intent((new StringBuilder()).append(context.getPackageName()).append(".cds.packInstalled").toString());
            intent.putExtra("packType", s);
            intent.putExtra("packId", l);
            intent.putExtra("purchased", i);
            context.sendBroadcast(intent);
        }
    }

    static final void b(Context context, String s, int i)
    {
        if (context != null)
        {
            Log.i("CdsUtils", (new StringBuilder()).append("notifySubscriptionPurchasedStatus: ").append(s).append(", ").append(i).toString());
            context.getContentResolver().notifyChange(b(context, (new StringBuilder()).append("subscription/purchased/").append(s).append("/").append(i).toString()), null);
            Intent intent = new Intent((new StringBuilder()).append(context.getPackageName()).append(".cds.subscriptionPurchased").toString());
            intent.putExtra("purchased", i);
            intent.putExtra("identifier", s);
            context.sendBroadcast(intent);
        }
    }

    public static void b(List list, String s)
    {
        if (list != null)
        {
            list = list.iterator();
            s = (new StringBuilder()).append("com.aviary.").append(s).toString();
            do
            {
                if (!list.hasNext())
                {
                    break;
                }
                if (!((String)list.next()).startsWith(s))
                {
                    list.remove();
                }
            } while (true);
        }
    }

    public static m.a c(Context context, long l)
    {
        Cursor cursor;
        Object obj = null;
        cursor = context.getContentResolver().query(b(context, (new StringBuilder()).append("pack/id/").append(l).append("/content").toString()), null, null, null, null);
        context = obj;
        if (cursor == null)
        {
            break MISSING_BLOCK_LABEL_79;
        }
        context = obj;
        if (cursor.moveToFirst())
        {
            context = com.aviary.android.feather.cds.m.a.a(cursor);
            context.a(com.aviary.android.feather.cds.n.a.a(cursor));
        }
        com.aviary.android.feather.common.utils.d.a(cursor);
        return context;
        context;
        com.aviary.android.feather.common.utils.d.a(cursor);
        throw context;
    }

    static q.a c(Context context, String s, String as[])
    {
        context = context.getContentResolver().query(b(context, (new StringBuilder()).append("subscription/identifier/").append(s).toString()), as, null, null, null);
        if (context == null)
        {
            break MISSING_BLOCK_LABEL_60;
        }
        if (!context.moveToFirst())
        {
            break MISSING_BLOCK_LABEL_60;
        }
        s = com.aviary.android.feather.cds.q.a.a(context);
        com.aviary.android.feather.common.utils.d.a(context);
        return s;
        com.aviary.android.feather.common.utils.d.a(context);
        return null;
        s;
        com.aviary.android.feather.common.utils.d.a(context);
        throw s;
    }

    public static String c(int i)
    {
        switch (i)
        {
        default:
            return "high";

        case 640: 
            return "xxxhigh";

        case 480: 
            return "xxhigh";

        case 320: 
            return "xhigh";

        case 240: 
            return "high";

        case 160: 
            return "medium";

        case 120: // 'x'
            return "low";
        }
    }

    public static String c(Context context)
    {
        Log.i("CdsUtils", "getResolution");
        if (f != null) goto _L2; else goto _L1
_L1:
        int i;
        i = context.getResources().getDisplayMetrics().densityDpi;
        Log.d("CdsUtils", (new StringBuilder()).append("density: ").append(i).toString());
        if (!e.contains(Integer.valueOf(i))) goto _L4; else goto _L3
_L3:
        Log.d("CdsUtils", "resolution is supported!");
        f = c(i);
_L2:
        return f;
_L4:
        if (i < ((Integer)e.get(0)).intValue())
        {
            Log.d("CdsUtils", "resolution is too small");
            f = c(((Integer)e.get(0)).intValue());
            continue; /* Loop/switch isn't completed */
        }
        if (i > ((Integer)e.get(e.size() - 1)).intValue())
        {
            Log.d("CdsUtils", "resolution is too big");
            f = c(((Integer)e.get(e.size() - 1)).intValue());
            continue; /* Loop/switch isn't completed */
        }
        context = e.iterator();
        do
        {
            if (!context.hasNext())
            {
                break;
            }
            int j = ((Integer)context.next()).intValue();
            if (j <= i)
            {
                continue;
            }
            Log.d("CdsUtils", (new StringBuilder()).append("use resolution: ").append(j).toString());
            f = c(j);
            break;
        } while (true);
        if (f == null)
        {
            Log.d("CdsUtils", (new StringBuilder()).append("use a custom fallback resolution:  ").append(e.get(e.size() / 2)).toString());
            f = c(((Integer)e.get(e.size() / 2)).intValue());
        }
        if (true) goto _L2; else goto _L5
_L5:
    }

    static String c(String s)
    {
        return (new StringBuilder()).append(f(s)).append("/icon").toString();
    }

    static void c(Context context, String s)
    {
        if (context != null)
        {
            context.getContentResolver().notifyChange(b(context, (new StringBuilder()).append("messages/contentUpdated/").append(s).toString()), null);
        }
    }

    public static boolean c(Context context, String s, int i)
    {
        Log.i("CdsUtils", (new StringBuilder()).append("updateSubscriptionPurchaseStatus: ").append(s).append(" = ").append(i).toString());
        q.a a1 = c(context, s, new String[] {
            "subscription_id", "subscription_identifier"
        });
        context.getContentResolver().update(b(context, (new StringBuilder()).append("subscription/update/id/").append(a1.p()).append("/updatePurchasedStatus/").append(i).toString()), new ContentValues(), null, null);
        b(context, s, i);
        return false;
    }

    public static Pair d(Context context, long l)
    {
        if (context == null)
        {
            return null;
        }
        context = b(context, l);
        if (context == null) goto _L2; else goto _L1
_L1:
        if (com.aviary.android.feather.common.a.a.a)
        {
            Log.d("CdsUtils", (new StringBuilder()).append("packId: ").append(l).append(", status: ").append(((Pair) (context)).first).append(", reason: ").append((String)((Pair) (context)).second).toString());
        }
        ((Integer)((Pair) (context)).first).intValue();
        JVM INSTR lookupswitch 5: default 140
    //                   1: 157
    //                   2: 157
    //                   4: 142
    //                   8: 172
    //                   16: 142;
           goto _L2 _L3 _L3 _L4 _L5 _L4
_L2:
        return null;
_L4:
        return new Pair(a.j, ((Pair) (context)).second);
_L3:
        return new Pair(a.i, ((Pair) (context)).second);
_L5:
        return new Pair(a.k, ((Pair) (context)).second);
    }

    static r.a d(Context context, String s, String as[])
    {
        context = context.getContentResolver().query(b(context, (new StringBuilder()).append("subscription/content/identifier/").append(s).toString()), as, null, null, null);
        if (context == null)
        {
            break MISSING_BLOCK_LABEL_60;
        }
        if (!context.moveToFirst())
        {
            break MISSING_BLOCK_LABEL_60;
        }
        s = com.aviary.android.feather.cds.r.a.a(context);
        com.aviary.android.feather.common.utils.d.a(context);
        return s;
        com.aviary.android.feather.common.utils.d.a(context);
        return null;
        s;
        com.aviary.android.feather.common.utils.d.a(context);
        throw s;
    }

    static String d(String s)
    {
        return (new StringBuilder()).append(f(s)).append("/pack_content").toString();
    }

    public static List d(Context context)
    {
        context = context.getContentResolver().query(b(context, "permissions/list"), new String[] {
            "perm_value"
        }, null, null, null);
        if (context == null)
        {
            break MISSING_BLOCK_LABEL_103;
        }
        Object obj;
        context.moveToFirst();
        obj = context.getString(0);
        Log.d("CdsUtils", (new StringBuilder()).append("permissions: ").append(((String) (obj))).toString());
        obj = Collections.unmodifiableList(Arrays.asList(((String) (obj)).split(",")));
        com.aviary.android.feather.common.utils.d.a(context);
        return ((List) (obj));
        Object obj1;
        obj1;
        ((Exception) (obj1)).printStackTrace();
        com.aviary.android.feather.common.utils.d.a(context);
        return Collections.unmodifiableList(new ArrayList());
        obj1;
        com.aviary.android.feather.common.utils.d.a(context);
        throw obj1;
    }

    static void d(Context context, String s)
    {
        if (context != null)
        {
            context.getContentResolver().notifyChange(b(context, (new StringBuilder()).append("packs/contentUpdated/").append(s).toString()), null);
            context.getContentResolver().notifyChange(b(context, (new StringBuilder()).append("packTray/").append(s).toString()), null);
        }
    }

    static String e(String s)
    {
        return (new StringBuilder()).append(f(s)).append("/previews").toString();
    }

    static void e(Context context)
    {
        if (context != null)
        {
            context.getContentResolver().notifyChange(b(context, "service/finished"), null);
        }
    }

    public static boolean e(Context context, long l)
    {
        m.a a1;
        Log.i("CdsUtils", (new StringBuilder()).append("uninstallPack: ").append(l).toString());
        if (context == null)
        {
            Log.w("CdsUtils", "context is null");
            return false;
        }
        a1 = c(context, l);
        if (a1 == null)
        {
            Log.w("CdsUtils", "pack is null!");
            return false;
        }
        Log.d("CdsUtils", (new StringBuilder()).append("pack: ").append(a1).toString());
        int i = context.getContentResolver().update(b(context, (new StringBuilder()).append("pack/id/").append(a1.p()).append("/content/id/").append(a1.f().p()).append("/updatePurchasedStatus/0").toString()), new ContentValues(), null, null);
        long l1 = i;
_L1:
        Log.d("CdsUtils", (new StringBuilder()).append("result: ").append(l1).toString());
        if (l1 > 0L)
        {
            Object obj = g(a1.a());
            Log.i("CdsUtils", (new StringBuilder()).append("folder to remove: ").append(((String) (obj))).toString());
            if (obj != null)
            {
                obj = new File(context.getFilesDir(), ((String) (obj)));
                Log.i("CdsUtils", (new StringBuilder()).append("directory abs path: ").append(((File) (obj)).getAbsolutePath()).toString());
                Object obj1;
                try
                {
                    FileUtils.deleteDirectory(((File) (obj)));
                    Log.d("CdsUtils", "folder deleted");
                }
                catch (IOException ioexception)
                {
                    ioexception.printStackTrace();
                }
            }
            g(context, a1.p());
            d(context, a1.b());
            b(context, l, a1.b(), 0);
            return true;
        } else
        {
            return false;
        }
        obj1;
        ((SQLiteException) (obj1)).printStackTrace();
        l1 = 0L;
          goto _L1
        obj1;
        ((NullPointerException) (obj1)).printStackTrace();
        l1 = 0L;
          goto _L1
    }

    static String f(String s)
    {
        return (new StringBuilder()).append("cdsv2/").append(s).toString();
    }

    static void f(Context context)
    {
        if (context != null)
        {
            context.getContentResolver().notifyChange(b(context, "permissions/updated"), null);
        }
    }

    static void f(Context context, long l)
    {
        if (context != null)
        {
            context.getContentResolver().notifyChange(b(context, (new StringBuilder()).append("message/contentUpdated/").append(l).toString()), null);
        }
    }

    static String g(String s)
    {
        return (new StringBuilder()).append(f(s)).append("/pack_content").toString();
    }

    static void g(Context context)
    {
        if (context != null)
        {
            context.getContentResolver().notifyChange(b(context, "subscriptions/verificationComplete"), null);
        }
    }

    static void g(Context context, long l)
    {
        if (context != null)
        {
            context.getContentResolver().notifyChange(b(context, (new StringBuilder()).append("pack/contentUpdated/").append(l).toString()), null);
        }
    }

    public static boolean h(Context context)
    {
        Log.i("CdsUtils", "hasSubscriptionAvailable");
        if (com.aviary.android.feather.common.utils.f.c(context)) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        Uri uri = b(context, "subscription/content/list");
        context = context.getContentResolver().query(uri, null, "subscription_visible=1 OR subscriptions_content_purchased=1", null, null);
        if (context == null) goto _L1; else goto _L3
_L3:
        int i;
        Log.d("CdsUtils", (new StringBuilder()).append("cursor.size: ").append(context.getCount()).toString());
        i = context.getCount();
        boolean flag;
        if (i > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        com.aviary.android.feather.common.utils.d.a(context);
        return flag;
        Exception exception;
        exception;
        com.aviary.android.feather.common.utils.d.a(context);
        throw exception;
    }

    static 
    {
        b = new HashMap();
        b.put("com.aviary.effectpack.01", "com.aviary.android.feather.plugins.filters.grunge");
        b.put("com.aviary.effectpack.02", "com.aviary.android.feather.plugins.filters.nostalgia");
        b.put("com.aviary.effectpack.03", "com.aviary.android.feather.plugins.filters.camera");
        b.put("com.aviary.effectpack.05", "com.aviary.android.feather.plugins.filters.tidal");
        b.put("com.aviary.effectpack.06", "com.aviary.android.feather.plugins.filters.original");
        b.put("com.aviary.effectpack.07", "com.aviary.android.feather.plugins.filters.toycamera");
        b.put("com.aviary.effectpack.08", "com.aviary.android.feather.plugins.filters.love");
        b.put("com.aviary.effectpack.32", "com.aviary.android.feather.plugins.filters.street");
        b.put("com.aviary.effectpack.45", "com.aviary.android.feather.plugins.filters.woodland");
        b.put("com.aviary.effectpack.68", "com.aviary.android.feather.plugins.filters.noir");
        b.put("com.aviary.effectpack.77", "com.aviary.android.feather.plugins.filters.fireworks");
        b.put("com.aviary.effectpack.80", "com.aviary.android.feather.plugins.filters.shadowpro");
        b.put("com.aviary.effectpack.83", "com.aviary.android.feather.plugins.filters.astro");
        b.put("com.aviary.effectpack.88", "com.aviary.android.feather.plugins.filters.wanderlust");
        b.put("com.aviary.effectpack.95", "com.aviary.android.feather.plugins.filters.archetype");
        b.put("com.aviary.effectpack.98", "com.aviary.android.feather.plugins.filters.sagapro");
        b.put("com.aviary.effectpack.99", "com.aviary.android.feather.plugins.filters.gotham");
        b.put("com.aviary.effectpack.104", "com.aviary.android.feather.plugins.filters.runway");
        b.put("com.aviary.effectpack.109", "com.aviary.android.feather.plugins.filters.signetpro");
        b.put("com.aviary.effectpack.116", "com.aviary.android.feather.plugins.filters.cam80s");
        b.put("com.aviary.effectpack.117", "com.aviary.android.feather.plugins.filters.foodie");
        b.put("com.aviary.stickerpack.00", "com.aviary.android.feather.plugins.stickers.free_stickers");
        b.put("com.aviary.stickerpack.01", "com.aviary.android.feather.plugins.stickers.moustaches");
        b.put("com.aviary.stickerpack.02", "com.aviary.android.feather.plugins.stickers.animal");
        b.put("com.aviary.stickerpack.03", "com.aviary.android.feather.plugins.stickers.halloween");
        b.put("com.aviary.stickerpack.04", "com.aviary.android.feather.plugins.stickers.american_football");
        b.put("com.aviary.stickerpack.05", "com.aviary.android.feather.plugins.stickers.hats");
        b.put("com.aviary.stickerpack.07", "com.aviary.android.feather.plugins.stickers.helmets");
        b.put("com.aviary.stickerpack.08", "com.aviary.android.feather.plugins.stickers.holiday");
        b.put("com.aviary.stickerpack.09", "com.aviary.android.feather.plugins.stickers.space");
        b.put("com.aviary.stickerpack.10", "com.aviary.android.feather.plugins.stickers.galaxy");
        b.put("com.aviary.stickerpack.11", "com.aviary.android.feather.plugins.stickers.love");
        b.put("com.aviary.stickerpack.13", "com.aviary.android.feather.plugins.stickers.glasses");
        b.put("com.aviary.stickerpack.35", "com.aviary.android.feather.plugins.stickers.doodles");
        b.put("com.aviary.stickerpack.37", "com.aviary.android.feather.plugins.stickers.petdressup");
        b.put("com.aviary.stickerpack.41", "com.aviary.android.feather.plugins.stickers.travel");
        b.put("com.aviary.framepack.00", "com.aviary.android.feather.plugins.borders.free");
        b.put("com.aviary.framepack.04", "com.aviary.android.feather.plugins.borders.drift");
        b.put("com.aviary.framepack.05", "com.aviary.android.feather.plugins.borders.bloom");
        b.put("com.aviary.framepack.06", "com.aviary.android.feather.plugins.borders.artdeco");
        b.put("com.aviary.framepack.07", "com.aviary.android.feather.plugins.borders.rugged");
    }
}
