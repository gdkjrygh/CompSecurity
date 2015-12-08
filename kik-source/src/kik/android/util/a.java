// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.util;

import android.app.Application;
import android.content.ContentValues;
import android.content.Context;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.kik.cache.ContentImageView;
import com.kik.cache.ad;
import com.kik.cache.av;
import com.kik.cache.o;
import com.kik.g.s;
import com.kik.l.ab;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.SoftReference;
import java.net.URI;
import java.net.URLDecoder;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Vector;
import kik.a.d.j;
import kik.a.e.v;
import kik.a.z;
import kik.android.h.i;
import kik.android.net.d;
import kik.android.p;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.protocol.BasicHttpContext;
import org.c.b;
import org.c.c;

// Referenced classes of package kik.android.util:
//            ar, b

public final class kik.android.util.a
{
    private final class a
    {

        final kik.android.util.a a;
        private final String b;
        private final String c;
        private final String d;
        private final String e;
        private int f;
        private int g;
        private String h;

        static int a(a a1)
        {
            return a1.f;
        }

        static int a(a a1, int i1)
        {
            a1.f = i1;
            return i1;
        }

        static String a(a a1, String s1)
        {
            a1.h = s1;
            return s1;
        }

        static int b(a a1)
        {
            return a1.g;
        }

        static int b(a a1, int i1)
        {
            a1.g = i1;
            return i1;
        }

        static String c(a a1)
        {
            return a1.c;
        }

        static String d(a a1)
        {
            return a1.e;
        }

        static String e(a a1)
        {
            return a1.d;
        }

        static String f(a a1)
        {
            return a1.h;
        }

        static String g(a a1)
        {
            return a1.b;
        }

        final void a(int i1)
        {
            if (f == i1)
            {
                return;
            }
            if (f == -1)
            {
                f = i1;
                kik.android.util.a.a(a, e);
                return;
            } else
            {
                throw new IllegalStateException((new StringBuilder("Trying to set video descriptor file size to ")).append(i1).append(" when it is already ").append(f).append(" for uuid ").append(e).toString());
            }
        }

        final boolean a()
        {
            return g == f;
        }

        final a b()
        {
            return a. new a(b, e, c, d);
        }

        final void b(int i1)
        {
            g = i1;
            kik.android.util.a.b(a, e);
        }

        a(String s1, String s2, String s3, String s4)
        {
            a = kik.android.util.a.this;
            super();
            g = 0;
            b = s1;
            c = s3;
            d = s4;
            e = s2;
            f = -1;
        }
    }

    private final class b extends i
    {

        final kik.android.util.a a;

        public final void a(SQLiteDatabase sqlitedatabase, int i1, int j1)
        {
        }

        public final void onCreate(SQLiteDatabase sqlitedatabase)
        {
            sqlitedatabase.execSQL(String.format("CREATE TABLE IF NOT EXISTS %s (_id INTEGER PRIMARY KEY AUTOINCREMENT, uuid VARCHAR, appid VARCHAR, url VARCHAR, path VARCHAR, size INT, progress INT, contentType VARCHAR);", new Object[] {
                "AndroidFileTable"
            }));
        }

        public final void onUpgrade(SQLiteDatabase sqlitedatabase, int i1, int j1)
        {
        }

        public b(Context context, String s1)
        {
            a = kik.android.util.a.this;
            super(context, "kikAndroidFileDatabase.db", 1, s1);
        }
    }

    private final class c extends Handler
    {

        final kik.android.util.a a;

        public final void handleMessage(Message message)
        {
            super.handleMessage(message);
            switch (message.what)
            {
            default:
                return;

            case 1: // '\001'
                removeMessages(1, message.obj);
                removeMessages(2, message.obj);
                message = (a)message.obj;
                kik.android.util.a.a(a, message, 1);
                return;

            case 2: // '\002'
                removeMessages(2, message.obj);
                message = (a)message.obj;
                kik.android.util.a.a(a, message, 2);
                return;

            case 3: // '\003'
                message = (d)message.obj;
                break;
            }
            kik.android.util.a.a(a, d.a(message), kik.android.util.d.b(message), kik.android.util.d.c(message));
        }

        public c(Looper looper)
        {
            a = kik.android.util.a.this;
            super(looper);
        }
    }

    private final class d
    {

        final kik.android.util.a a;
        private final String b;
        private final String c;
        private final byte d[];

        static String a(d d1)
        {
            return d1.b;
        }

        static String b(d d1)
        {
            return d1.c;
        }

        static byte[] c(d d1)
        {
            return d1.d;
        }

        d(String s1, String s2, byte abyte0[])
        {
            a = kik.android.util.a.this;
            super();
            b = s1;
            c = s2;
            d = abyte0;
        }
    }


    private static final org.c.b a = org.c.c.a("AndroidFileManager");
    private static kik.android.util.a b;
    private SharedPreferences c;
    private Application d;
    private v e;
    private ab f;
    private HandlerThread g;
    private HashMap h;
    private HashSet i;
    private Hashtable j;
    private final c k;
    private String l;
    private HashMap m;
    private final byte n[] = new byte[1024];
    private boolean o;
    private HashMap p;
    private final b q;

    private kik.android.util.a(Application application, v v1, ab ab, ar ar1)
    {
        g = new HandlerThread("FiledDownManager");
        i = new HashSet();
        j = new Hashtable();
        m = new HashMap();
        o = false;
        p = new HashMap();
        g.start();
        k = new c(g.getLooper());
        q = new b(application, v1.m());
        h = e();
        d = application;
        e = v1;
        c = ar1.a("KikPrecachePrefs");
        f = ab;
    }

    static ab a(kik.android.util.a a1)
    {
        return a1.f;
    }

    public static kik.android.util.a a()
    {
        if (b == null)
        {
            throw new RuntimeException("AndroidFileManager not initialized");
        } else
        {
            return b;
        }
    }

    public static void a(Application application, v v1, ab ab, ar ar1)
    {
        if (b == null)
        {
            b = new kik.android.util.a(application, v1, ab, ar1);
        }
    }

    private void a(a a1, int i1)
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag1 = o;
        if (flag1) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        if (a1.a() || kik.android.util.a.c(a1) == null) goto _L1; else goto _L3
_L3:
        long l2;
        long l3;
        l2 = c.getLong("interval-start", 0L);
        l3 = c.getLong("amount", 0L);
        if (i1 != 2) goto _L5; else goto _L4
_L4:
        Object obj;
        Object obj1;
        obj = (ConnectivityManager)d.getSystemService("connectivity");
        obj1 = ((ConnectivityManager) (obj)).getNetworkInfo(1);
        if (obj1 == null) goto _L7; else goto _L6
_L6:
        if (((NetworkInfo) (obj1)).isConnected()) goto _L5; else goto _L7
_L7:
        obj = ((ConnectivityManager) (obj)).getActiveNetworkInfo();
        if (obj == null) goto _L9; else goto _L8
_L8:
        if (((NetworkInfo) (obj)).isRoaming()) goto _L1; else goto _L9
_L9:
        if (System.currentTimeMillis() - l2 < 0x240c8400L && l3 > 0x7d00000L) goto _L1; else goto _L10
_L45:
        int k1;
        int j2;
        l = kik.android.util.a.d(a1);
        k1 = a.a(a1);
        obj = new File(a.e(a1));
        j2 = kik.android.util.a.b(a1);
        z z1;
        DefaultHttpClient defaulthttpclient;
        Header aheader[];
        BasicHttpContext basichttpcontext;
        Header aheader1[];
        HttpGet httpget;
        StringBuilder stringbuilder;
        int j1;
        int l1;
        int i2;
        if (j2 != 0)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        obj = new FileOutputStream(((File) (obj)), flag1);
_L29:
        z1 = z.b(e);
        j1 = j2;
_L43:
        if (a1.a() || a.a(a1) != -1 && j1 >= k1) goto _L12; else goto _L11
_L11:
        obj1 = new BasicHttpParams();
        HttpConnectionParams.setSoTimeout(((org.apache.http.params.HttpParams) (obj1)), 20000);
        HttpConnectionParams.setConnectionTimeout(((org.apache.http.params.HttpParams) (obj1)), 20000);
        defaulthttpclient = new DefaultHttpClient();
        basichttpcontext = new BasicHttpContext();
        httpget = new HttpGet(URLDecoder.decode(kik.android.util.a.c(a1)));
        if (!httpget.getURI().getHost().endsWith(".kik.com")) goto _L14; else goto _L13
_L13:
        httpget.addHeader("x-kik-jid", z1.a().a());
        httpget.addHeader("x-kik-password", z1.b());
        stringbuilder = (new StringBuilder("bytes=")).append(j1).append("-");
        if (k1 != -1) goto _L16; else goto _L15
_L15:
        obj1 = "";
_L30:
        httpget.addHeader("Range", stringbuilder.append(obj1).toString());
        if (!"com.kik.ext.video-camera".equals(a.g(a1)) && !"com.kik.ext.video-gallery".equals(a.g(a1))) goto _L14; else goto _L17
_L17:
        if (j1 != 0) goto _L19; else goto _L18
_L18:
        httpget.addHeader("Accept", "*/*, video/mp4");
_L14:
        obj1 = defaulthttpclient.execute(httpget, basichttpcontext);
        l1 = ((HttpResponse) (obj1)).getStatusLine().getStatusCode();
        if (l1 != 206) goto _L21; else goto _L20
_L20:
        aheader = ((HttpResponse) (obj1)).getHeaders("Content-Type");
        aheader1 = ((HttpResponse) (obj1)).getHeaders("Content-Range");
        if (aheader1.length == 1 && aheader.length == 1 && (a.f(a1) == null || a.f(a1).equals(aheader[0].getValue()))) goto _L23; else goto _L22
_L33:
        i2 = j1;
        if (k1 != 0) goto _L25; else goto _L24
_L24:
        j.remove(kik.android.util.a.d(a1));
        a.a(a1, aheader[0].getValue());
        obj1 = ((HttpResponse) (obj1)).getEntity().getContent();
_L28:
        i2 = ((InputStream) (obj1)).read(n);
        if (-1 == i2) goto _L27; else goto _L26
_L26:
        ((FileOutputStream) (obj)).write(n, 0, i2);
        ((FileOutputStream) (obj)).flush();
        j1 += i2;
        a1.b(j1);
          goto _L28
        obj1;
        (new StringBuilder("Exception while downloading file from ")).append(kik.android.util.a.c(a1));
_L32:
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_649;
        }
        ((FileOutputStream) (obj)).close();
_L44:
        l = null;
          goto _L1
        a1;
        throw a1;
        FileNotFoundException filenotfoundexception;
        filenotfoundexception;
        filenotfoundexception.printStackTrace();
        filenotfoundexception = null;
          goto _L29
_L16:
        obj1 = Integer.valueOf(k1 - 1);
          goto _L30
_L19:
        if (a.f(a1) == null) goto _L14; else goto _L31
_L31:
        httpget.addHeader("Accept", a.f(a1));
          goto _L14
        IOException ioexception;
        ioexception;
        (new StringBuilder("Exception while downloading file from ")).append(kik.android.util.a.c(a1));
          goto _L32
_L23:
        String s1 = aheader1[0].getValue();
        a1.a(Integer.parseInt(s1.substring(s1.indexOf('/') + 1)));
        l1 = a.a(a1);
        k1 = 0;
          goto _L33
        Exception exception;
        exception;
        l1 = k1;
        k1 = 1;
          goto _L33
_L27:
        i2 = j1;
        boolean flag;
        if (!flag) goto _L25; else goto _L34
_L34:
        ioexception = c.edit();
        if (System.currentTimeMillis() - l2 >= 0x240c8400L) goto _L36; else goto _L35
_L35:
        ioexception.putLong("amount", (long)(j1 - j2) + l3);
_L42:
        ioexception.commit();
        i2 = j1;
          goto _L25
_L46:
        if (k1 == 0) goto _L38; else goto _L37
_L37:
        k1 = 1;
        if (j.containsKey(kik.android.util.a.d(a1)))
        {
            k1 = ((Integer)j.get(kik.android.util.a.d(a1))).intValue() + 1;
        }
        j.put(kik.android.util.a.d(a1), new Integer(k1));
        if (k1 <= 3) goto _L38; else goto _L39
_L39:
        if (k1 <= 15) goto _L41; else goto _L40
_L40:
        j.remove(kik.android.util.a.d(a1));
_L12:
        if (a1.a())
        {
            c(kik.android.util.a.d(a1));
            d();
        }
          goto _L32
_L36:
        ioexception.putLong("interval-start", System.currentTimeMillis());
        ioexception.putLong("amount", j1 - j2);
          goto _L42
_L21:
        if (l1 != 406)
        {
            break MISSING_BLOCK_LABEL_1170;
        }
        j.remove(kik.android.util.a.d(a1));
        a a2 = a1.b();
        h.put(kik.android.util.a.d(a1), a2);
        Message message1 = k.obtainMessage(i1);
        message1.obj = a2;
        k.sendMessage(message1);
          goto _L12
_L41:
        Message message = k.obtainMessage(i1);
        message.obj = a1;
        k.sendMessageDelayed(message, Math.min((k1 - 3) * ((k1 - 3) * (k1 - 3)), 3600) * 1000);
          goto _L12
_L38:
        k1 = l1;
          goto _L43
        a1;
        a1.printStackTrace();
          goto _L44
_L5:
        flag = false;
          goto _L45
_L10:
        flag = true;
          goto _L45
_L22:
        l1 = k1;
        k1 = 1;
          goto _L33
_L25:
        j1 = i2;
          goto _L46
        l1 = k1;
        k1 = 1;
          goto _L46
    }

    static void a(kik.android.util.a a1, String s1)
    {
        a1 = (Vector)a1.m.get(s1);
        if (a1 != null)
        {
            for (a1 = a1.iterator(); a1.hasNext(); ((SoftReference)a1.next()).get()) { }
        }
    }

    static void a(kik.android.util.a a1, String s1, String s2, byte abyte0[])
    {
        a1.b(s1, s2, abyte0);
    }

    static void a(kik.android.util.a a1, a a2, int i1)
    {
        a1.a(a2, i1);
    }

    public static boolean a(v v1, kik.a.d.a.a a1)
    {
        return a1 != null && a1.g("int-file-url-local") != null && v1.c(new File(a1.g("int-file-url-local")));
    }

    public static String b(String s1)
    {
        return s1.substring(s1.lastIndexOf("/") + 1).substring(0, 10);
    }

    static HashSet b(kik.android.util.a a1)
    {
        return a1.i;
    }

    private void b(String s1, String s2, byte abyte0[])
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = e.u(s2);
        if (!flag) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        byte abyte1[] = (byte[])kik.android.p.a(s1, z.b(e)).a;
        if (abyte1 == null)
        {
            break MISSING_BLOCK_LABEL_81;
        }
        if (e.a(s2, abyte1, true, false, true) == null)
        {
            break MISSING_BLOCK_LABEL_81;
        }
        p.remove(s2);
          goto _L1
        s1;
        throw s1;
        Object obj = (Integer)p.get(s2);
        int i1;
        if (obj != null)
        {
            break MISSING_BLOCK_LABEL_173;
        }
        i1 = 0;
_L4:
        i1++;
        if (i1 > 0) goto _L1; else goto _L3
_L3:
        p.put(s2, new Integer(i1));
        obj = k.obtainMessage(3);
        obj.obj = new d(s1, s2, abyte0);
        k.sendMessageDelayed(((Message) (obj)), 5000L);
          goto _L1
        i1 = ((Integer) (obj)).intValue();
          goto _L4
    }

    static void b(kik.android.util.a a1, String s1)
    {
        a1 = (Vector)a1.m.get(s1);
        if (a1 != null)
        {
            for (a1 = a1.iterator(); a1.hasNext(); ((SoftReference)a1.next()).get()) { }
        }
    }

    private void c(String s1)
    {
        s1 = (Vector)m.get(s1);
        if (s1 != null)
        {
            for (s1 = s1.iterator(); s1.hasNext(); ((SoftReference)s1.next()).get()) { }
        }
    }

    private boolean d()
    {
        b b1 = q;
        b1;
        JVM INSTR monitorenter ;
        SQLiteDatabase sqlitedatabase = q.getWritableDatabase();
        Iterator iterator;
        sqlitedatabase.beginTransaction();
        iterator = h.values().iterator();
_L4:
        if (!iterator.hasNext()) goto _L2; else goto _L1
_L1:
        a a1;
        String s1;
        a1 = (a)iterator.next();
        s1 = kik.android.util.a.d(a1);
        if (s1 == null) goto _L4; else goto _L3
_L3:
        ContentValues contentvalues = new ContentValues();
        contentvalues.put("uuid", kik.android.util.a.d(a1));
        contentvalues.put("appid", a.g(a1));
        contentvalues.put("url", kik.android.util.a.c(a1));
        contentvalues.put("path", a.e(a1));
        contentvalues.put("size", Integer.valueOf(a.a(a1)));
        contentvalues.put("progress", Integer.valueOf(kik.android.util.a.b(a1)));
        contentvalues.put("contentType", a.f(a1));
        if (sqlitedatabase.update("AndroidFileTable", contentvalues, (new StringBuilder("uuid ='")).append(s1).append("'").toString(), null) == 0)
        {
            sqlitedatabase.insert("AndroidFileTable", null, contentvalues);
        }
          goto _L4
        Object obj;
        obj;
        (new StringBuilder("Android file update failed:")).append(((Exception) (obj)).getMessage());
        boolean flag = false;
        sqlitedatabase.endTransaction();
_L5:
        b1;
        JVM INSTR monitorexit ;
        return flag;
_L2:
        sqlitedatabase.setTransactionSuccessful();
        sqlitedatabase.endTransaction();
        flag = true;
          goto _L5
        obj;
        sqlitedatabase.endTransaction();
        throw obj;
        Exception exception;
        exception;
        b1;
        JVM INSTR monitorexit ;
        throw exception;
    }

    private HashMap e()
    {
        HashMap hashmap = new HashMap();
        b b1 = q;
        b1;
        JVM INSTR monitorenter ;
        Object obj = q.getWritableDatabase();
        obj = ((SQLiteDatabase) (obj)).query("AndroidFileTable", null, null, null, null, null, null);
        int i1;
        int j1;
        int k1;
        int l1;
        int i2;
        int j2;
        int k2;
        i1 = ((Cursor) (obj)).getColumnIndex("uuid");
        j1 = ((Cursor) (obj)).getColumnIndex("appid");
        k1 = ((Cursor) (obj)).getColumnIndex("url");
        l1 = ((Cursor) (obj)).getColumnIndex("path");
        i2 = ((Cursor) (obj)).getColumnIndex("size");
        j2 = ((Cursor) (obj)).getColumnIndex("progress");
        k2 = ((Cursor) (obj)).getColumnIndex("contentType");
        boolean flag;
        if (((Cursor) (obj)).moveToFirst())
        {
            do
            {
                String s1 = ((Cursor) (obj)).getString(i1);
                Object obj2 = ((Cursor) (obj)).getString(j1);
                String s3 = ((Cursor) (obj)).getString(k1);
                String s4 = ((Cursor) (obj)).getString(l1);
                int l2 = ((Cursor) (obj)).getInt(i2);
                int i3 = ((Cursor) (obj)).getInt(j2);
                String s2 = ((Cursor) (obj)).getString(k2);
                obj2 = new a(((String) (obj2)), s1, s3, s4);
                a.a(((a) (obj2)), l2);
                kik.android.util.a.b(((a) (obj2)), i3);
                a.a(((a) (obj2)), s2);
                hashmap.put(s1, obj2);
                flag = ((Cursor) (obj)).moveToNext();
            } while (flag);
        }
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_266;
        }
        ((Cursor) (obj)).close();
_L2:
        b1;
        JVM INSTR monitorexit ;
        return hashmap;
        Object obj1;
        obj1;
        obj = null;
_L5:
        (new StringBuilder("Error in getting files:")).append(((Exception) (obj1)).getMessage());
        if (obj == null) goto _L2; else goto _L1
_L1:
        ((Cursor) (obj)).close();
          goto _L2
        obj;
        b1;
        JVM INSTR monitorexit ;
        throw obj;
        obj1;
        obj = null;
_L4:
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_323;
        }
        ((Cursor) (obj)).close();
        throw obj1;
        obj1;
        continue; /* Loop/switch isn't completed */
        obj1;
        if (true) goto _L4; else goto _L3
_L3:
        obj1;
          goto _L5
    }

    public final com.kik.g.p a(kik.a.d.a.a a1, byte abyte0[], String s1, ad ad1, ContentImageView contentimageview, com.android.volley.r.a a2, com.kik.android.a a3)
    {
        if (kik.a.f.e.a.a(s1) && a1 != null)
        {
            s1 = com.kik.cache.a.a(s1, com.kik.cache.z.e, a2);
            abyte0 = a1.o();
        } else
        if (a1 != null)
        {
            s1 = com.kik.cache.o.a(a1, s1, com.kik.cache.z.e, a2, false, null, abyte0, a3);
            abyte0 = a1.o();
        } else
        if (contentimageview != null)
        {
            abyte0 = av.a(s1, contentimageview.getMeasuredWidth(), contentimageview.getMeasuredHeight());
            contentimageview = b(s1);
            s1 = abyte0;
            abyte0 = contentimageview;
        } else
        {
            return s.a(null);
        }
        if (s1 != null)
        {
            contentimageview = new com.kik.g.p();
            if (a1 != null)
            {
                i.add(a1.o());
            }
            ad1.a(s1, new kik.android.util.b(this, abyte0, contentimageview, a1), true);
            return contentimageview;
        } else
        {
            return s.a(null);
        }
    }

    public final void a(String s1, String s2, byte abyte0[])
    {
        if (s1 != null && s2 != null)
        {
            Message message = k.obtainMessage(3);
            message.obj = new d(s1, s2, abyte0);
            p.remove(s2);
            k.sendMessage(message);
        }
    }

    public final boolean a(String s1)
    {
        return i.contains(s1);
    }

    public final void b()
    {
        q.getWritableDatabase().close();
    }

    public final void c()
    {
        q.a();
    }

}
