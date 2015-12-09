// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.b;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Dialog;
import android.app.NotificationManager;
import android.app.ProgressDialog;
import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.media.ExifInterface;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Environment;
import android.os.StatFs;
import android.preference.PreferenceManager;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.FragmentActivity;
import android.support.v7.widget.SearchView;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.widget.Toast;
import bolts.j;
import com.cardinalblue.android.piccollage.a.b;
import com.cardinalblue.android.piccollage.a.f;
import com.cardinalblue.android.piccollage.auth.PicAuth;
import com.cardinalblue.android.piccollage.controller.r;
import com.cardinalblue.android.piccollage.controller.s;
import com.cardinalblue.android.piccollage.iab.util.a;
import com.cardinalblue.android.piccollage.lib.i;
import com.cardinalblue.android.piccollage.model.Collage;
import com.cardinalblue.android.piccollage.model.gson.CBCollagesResponse;
import com.cardinalblue.android.piccollage.model.gson.CBYoutubeData;
import com.cardinalblue.android.piccollage.model.gson.CBYoutubeSearchResponse;
import com.cardinalblue.android.piccollage.model.gson.CollageSizeReaderWriter;
import com.cardinalblue.android.piccollage.model.gson.ColorModel;
import com.cardinalblue.android.piccollage.model.gson.ColorOptionList;
import com.cardinalblue.android.piccollage.model.gson.PointFReaderWriter;
import com.facebook.AccessToken;
import com.google.b.e;
import com.google.b.g;
import com.google.b.t;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Type;
import java.net.URISyntaxException;
import java.net.URLEncoder;
import java.nio.channels.FileChannel;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.Set;
import java.util.TimeZone;
import java.util.TreeMap;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.Mac;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.SecretKeySpec;
import net.a.a.c;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.cardinalblue.android.b:
//            e

public class k
{
    public static class a extends IOException
    {

        public a(Exception exception)
        {
            super(exception);
        }
    }

    public static class b
    {

        private final Activity a;
        private boolean b;
        private String c;
        private Callable d;
        private List e;
        private boolean f;

        static Callable a(b b1)
        {
            return b1.d;
        }

        static Activity b(b b1)
        {
            return b1.a;
        }

        public j a()
        {
            ProgressDialog progressdialog = new ProgressDialog(a);
            if (f)
            {
                progressdialog.getWindow().setFlags(1024, 1024);
            }
            progressdialog.setCancelable(b);
            progressdialog.setCanceledOnTouchOutside(false);
            bolts.j.a a1 = bolts.j.a();
            progressdialog.setMessage(c);
            progressdialog.setOnDismissListener(new android.content.DialogInterface.OnDismissListener(this, a1) {

                final bolts.j.a a;
                final b b;

                public void onDismiss(DialogInterface dialoginterface)
                {
                    a.b();
                }

            
            {
                b = b1;
                a = a1;
                super();
            }
            });
            j j1 = bolts.j.a(new Callable(this, progressdialog) {

                final ProgressDialog a;
                final b b;

                public Void a()
                    throws Exception
                {
                    com.cardinalblue.android.b.k.b(com.cardinalblue.android.b.b.b(b), a);
                    return null;
                }

                public Object call()
                    throws Exception
                {
                    return a();
                }

            
            {
                b = b1;
                a = progressdialog;
                super();
            }
            }, com.cardinalblue.android.b.k.a).a(new bolts.i(this) {

                final b a;

                public Object then(j j1)
                    throws Exception
                {
                    return com.cardinalblue.android.b.b.a(a).call();
                }

            
            {
                a = b1;
                super();
            }
            }, com.cardinalblue.android.b.k.b);
            Object obj = j1;
            if (e != null)
            {
                obj = j1;
                if (!e.isEmpty())
                {
                    for (obj = e.iterator(); ((Iterator) (obj)).hasNext();)
                    {
                        j1 = j1.a((bolts.i)((Iterator) (obj)).next());
                    }

                    obj = j1;
                }
            }
            ((j) (obj)).a(new bolts.i(this, progressdialog, a1) {

                final ProgressDialog a;
                final bolts.j.a b;
                final b c;

                public Void a(j j1)
                    throws Exception
                {
                    com.cardinalblue.android.b.k.a(com.cardinalblue.android.b.b.b(c), a);
                    if (j1.d())
                    {
                        b.b(j1.f());
                        return null;
                    } else
                    {
                        b.b(j1.e());
                        return null;
                    }
                }

                public Object then(j j1)
                    throws Exception
                {
                    return a(j1);
                }

            
            {
                c = b1;
                a = progressdialog;
                b = a1;
                super();
            }
            }, com.cardinalblue.android.b.k.a);
            return a1.a();
        }

        public b a(String s1)
        {
            c = s1;
            return this;
        }

        public b a(Callable callable)
        {
            d = callable;
            return this;
        }

        public b(Activity activity)
        {
            b = true;
            f = false;
            a = activity;
        }
    }

    public static class c
    {

        public static void a(Context context, String s1, int i1)
        {
            context = PreferenceManager.getDefaultSharedPreferences(context.getApplicationContext()).edit();
            context.putInt(s1, i1);
            context.apply();
        }

        public static void a(Context context, String s1, boolean flag)
        {
            context = PreferenceManager.getDefaultSharedPreferences(context.getApplicationContext()).edit();
            context.putBoolean(s1, flag);
            context.apply();
        }

        public static int b(Context context, String s1, int i1)
        {
            return PreferenceManager.getDefaultSharedPreferences(context.getApplicationContext()).getInt(s1, i1);
        }

        public static boolean b(Context context, String s1, boolean flag)
        {
            return PreferenceManager.getDefaultSharedPreferences(context.getApplicationContext()).getBoolean(s1, flag);
        }

        public c()
        {
        }
    }

    public static final class d extends Enum
    {

        public static final d a;
        public static final d b;
        public static final d c;
        public static final d d;
        public static final d e;
        private static final d f[];

        public static d valueOf(String s1)
        {
            return (d)Enum.valueOf(com/cardinalblue/android/b/k$d, s1);
        }

        public static d[] values()
        {
            return (d[])f.clone();
        }

        static 
        {
            a = new d("FACEBOOK", 0);
            b = new d("TWITTER", 1);
            c = new d("PICCOLALGE", 2);
            d = new d("INSTAGRAM", 3);
            e = new d("THUMBLR", 4);
            f = (new d[] {
                a, b, c, d, e
            });
        }

        private d(String s1, int i1)
        {
            super(s1, i1);
        }
    }


    public static Executor a;
    public static Executor b;
    public static Executor c = Executors.newFixedThreadPool(25);
    public static Executor d = Executors.newFixedThreadPool(4);
    protected static final char e[] = "0123456789ABCDEF".toCharArray();
    private static Point f;
    private static Context g;
    private static Random h = new Random();
    private static final SimpleDateFormat i;

    public k()
    {
    }

    public static float a(float f1)
    {
        float f2;
        do
        {
            f2 = f1;
            if (f1 >= 0.0F)
            {
                break;
            }
            f1 = (float)((double)f1 + 6.2831853071795862D);
        } while (true);
        for (; (double)f2 >= 6.2831853071795862D; f2 = (float)((double)f2 - 6.2831853071795862D)) { }
        return f2;
    }

    public static float a(float f1, float f2)
    {
        return (float)Math.random() * (f2 - f1) + f1;
    }

    public static float a(int i1, int j1)
    {
        Point point = b();
        return (float)Math.min(point.x, point.y) / (2.0F * (float)Math.max(i1, j1));
    }

    public static float a(com.cardinalblue.android.piccollage.view.k k1, com.cardinalblue.android.piccollage.view.k k2)
    {
        float f1 = ((float)Math.max(k1.S(), k1.T()) * k1.P()) / 2.0F;
        float f2 = ((float)Math.max(k2.S(), k2.T()) * k2.P()) / 2.0F;
        float f3 = k1.K() - k2.K();
        float f4 = k1.L() - k2.L();
        return (float)Math.sqrt(f3 * f3 + f4 * f4) - (f1 + f2);
    }

    public static int a(Context context, int i1)
    {
        i1 = context.getResources().getInteger(i1);
        return (c() - (i1 + 1) * (int)context.getResources().getDimension(0x7f0b012b)) / i1;
    }

    public static int a(Context context, Uri uri)
    {
        context = context.getContentResolver().query(uri, new String[] {
            "orientation"
        }, null, null, null);
        if (context == null) goto _L2; else goto _L1
_L1:
        if (context.getCount() == 1 && context.moveToFirst()) goto _L3; else goto _L2
_L2:
        int j1 = a(uri.getPath());
        int i1;
        i1 = j1;
        if (context != null)
        {
            context.close();
            i1 = j1;
        }
_L5:
        return i1;
_L3:
        j1 = context.getInt(0);
        i1 = j1;
        if (context == null) goto _L5; else goto _L4
_L4:
        context.close();
        return j1;
        uri;
        if (context != null)
        {
            context.close();
        }
        throw uri;
    }

    public static int a(String s1)
    {
        if (!TextUtils.isEmpty(s1)) goto _L2; else goto _L1
_L1:
        return 0;
_L2:
        int i1;
        try
        {
            i1 = (new ExifInterface(s1)).getAttributeInt("Orientation", 0);
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            return 0;
        }
        switch (i1)
        {
        case 2: // '\002'
        case 4: // '\004'
        case 5: // '\005'
        case 7: // '\007'
        default:
            return 0;

        case 3: // '\003'
            return 180;

        case 6: // '\006'
            return 90;

        case 8: // '\b'
            return 270;

        case 1: // '\001'
            break;
        }
        if (true) goto _L1; else goto _L3
_L3:
    }

    public static int a(Collection collection, int i1, int j1)
    {
        boolean flag = false;
        if (i1 > 0) goto _L2; else goto _L1
_L1:
        return j1;
_L2:
        HashSet hashset = new HashSet();
        for (int k1 = 0; k1 < i1; k1++)
        {
            hashset.add(Integer.valueOf(k1));
        }

        if (collection != null)
        {
            for (collection = collection.iterator(); collection.hasNext(); hashset.remove((Integer)collection.next())) { }
        }
        if (!hashset.isEmpty())
        {
            int l1 = h.nextInt(hashset.size());
            collection = hashset.iterator();
            i1 = ((flag) ? 1 : 0);
            while (collection.hasNext()) 
            {
                Integer integer = (Integer)collection.next();
                if (i1 == l1)
                {
                    return integer.intValue();
                }
                i1++;
            }
        }
        if (true) goto _L1; else goto _L3
_L3:
    }

    public static int a(List list)
    {
        if (list == null || list.isEmpty())
        {
            throw new IllegalArgumentException("The given FPS list is null or empty.");
        }
        int j1 = ((Integer)list.get(0)).intValue();
        for (int i1 = 1; i1 < list.size(); i1++)
        {
            int k1 = ((Integer)list.get(i1)).intValue();
            if (k1 <= 0)
            {
                throw new IllegalArgumentException("FPS must be a positive number.");
            }
            j1 = (int)b(j1, k1);
        }

        return Math.min(30, j1);
    }

    public static long a(long l1, long l2)
    {
        if (l1 > 0L && l2 < 0L || l1 < 0L && l2 > 0L)
        {
            throw new IllegalArgumentException("The given two numbers must have the same sign.");
        }
        if (l1 == 0L || l2 == 0L)
        {
            throw new IllegalArgumentException("The given number must not be a zero.");
        }
        long l3;
        long l4;
        if (l1 > 0L)
        {
            l3 = 1L;
        } else
        {
            l3 = -1L;
        }
        l1 = Math.abs(l1);
        l4 = Math.abs(l2);
        l2 = l1;
        l1 = l4;
        do
        {
            long l5 = l2;
            if (l1 > 0L)
            {
                l2 = l1;
                l1 = l5 % l1;
            } else
            {
                return l3 * l5;
            }
        } while (true);
    }

    public static Context a()
    {
        return g;
    }

    public static RectF a(Rect rect)
    {
        if (rect == null)
        {
            return new RectF(0.0F, 0.0F, 0.0F, 0.0F);
        } else
        {
            return new RectF(rect);
        }
    }

    public static j a(Activity activity, Callable callable, String s1)
    {
        return (new b(activity)).a(callable).a(s1).a();
    }

    public static com.google.b.f a(e e1)
    {
        g g1 = new g();
        g1.a(com/cardinalblue/android/piccollage/model/gson/CBCollagesResponse, new com.cardinalblue.android.piccollage.model.gson.CBCollagesResponse.CBCollagesResponseDeserializer());
        g1.a(com/cardinalblue/android/piccollage/model/gson/CBYoutubeSearchResponse, new com.cardinalblue.android.piccollage.model.gson.CBYoutubeSearchResponse.CBYoutubeSearchResponseDeserializer());
        g1.a(com/cardinalblue/android/piccollage/model/gson/CBYoutubeData, new com.cardinalblue.android.piccollage.model.gson.CBYoutubeData.CBYoutubeDataDeserializer());
        g1.a(com/cardinalblue/android/piccollage/model/gson/ColorModel, new com.cardinalblue.android.piccollage.model.gson.ColorModel.ColorModelJsonReaderWriter());
        g1.a(android/graphics/PointF, new PointFReaderWriter());
        g1.a(com/cardinalblue/android/piccollage/model/gson/WebPhoto$CollageSize, new CollageSizeReaderWriter());
        g1.a(com/cardinalblue/android/piccollage/model/gson/ColorOptionList, new com.cardinalblue.android.piccollage.model.gson.ColorOptionList.ColorOptionListDeserializer());
        if (e1 != null)
        {
            g1.a(e1);
        }
        return g1.a();
    }

    public static Object a(Resources resources, int i1, Type type)
    {
        Object obj = resources.openRawResource(i1);
        resources = ((Resources) (obj));
        type = ((Type) (b(new String(a(((InputStream) (obj)))), type)));
        a(((Closeable) (obj)));
        return type;
        type;
        obj = null;
_L4:
        resources = ((Resources) (obj));
        com.cardinalblue.android.piccollage.a.f.a(type);
        a(((Closeable) (obj)));
        return null;
        resources;
        obj = null;
        type = resources;
_L2:
        a(((Closeable) (obj)));
        throw type;
        type;
        obj = resources;
        if (true) goto _L2; else goto _L1
_L1:
        type;
        if (true) goto _L4; else goto _L3
_L3:
    }

    public static Object a(e e1, String s1, Type type)
        throws JSONException
    {
        try
        {
            e1 = ((e) (a(e1).a(s1, type)));
        }
        // Misplaced declaration of an exception variable
        catch (e e1)
        {
            throw new JSONException(e1.getMessage());
        }
        // Misplaced declaration of an exception variable
        catch (e e1)
        {
            throw new JSONException(e1.getMessage());
        }
        return e1;
    }

    public static Object a(String s1, Type type)
    {
        Object obj;
        Object obj1;
        obj1 = null;
        obj = a().getAssets();
        s1 = ((AssetManager) (obj)).open(s1);
        obj = s1;
        type = ((Type) (b(new String(a(((InputStream) (s1)))), type)));
        obj = type;
        if (s1 != null)
        {
            try
            {
                s1.close();
            }
            // Misplaced declaration of an exception variable
            catch (String s1)
            {
                return type;
            }
            obj = type;
        }
        return obj;
        type;
        s1 = null;
_L4:
        obj = s1;
        com.cardinalblue.android.piccollage.a.f.a(type);
        obj = obj1;
        if (s1 != null)
        {
            try
            {
                s1.close();
            }
            // Misplaced declaration of an exception variable
            catch (String s1)
            {
                return null;
            }
            return null;
        } else
        {
            break MISSING_BLOCK_LABEL_45;
        }
        s1;
        obj = null;
_L2:
        if (obj != null)
        {
            try
            {
                ((InputStream) (obj)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Type type) { }
        }
        throw s1;
        s1;
        if (true) goto _L2; else goto _L1
_L1:
        type;
        if (true) goto _L4; else goto _L3
_L3:
    }

    public static String a(Object obj)
    {
        if (obj == null)
        {
            return "";
        }
        obj = obj.getClass();
        if (((Class) (obj)).isAnonymousClass())
        {
            return ((Class) (obj)).getSuperclass().getSimpleName();
        } else
        {
            return ((Class) (obj)).getSimpleName();
        }
    }

    public static String a(String s1, List list)
        throws URISyntaxException
    {
        return a(s1, list, "utf-8");
    }

    public static String a(String s1, List list, String s2)
        throws URISyntaxException
    {
        if (TextUtils.isEmpty(s1) || list == null || list.size() == 0)
        {
            return s1;
        }
        s2 = new StringBuilder(s1);
        if (Uri.parse(s1).getQueryParameterNames().size() > 0)
        {
            s2.append("&");
        } else
        if (!s1.contains("?"))
        {
            s2.append("?");
        } else
        if (!s1.endsWith("?"))
        {
            s2.append("&");
        }
        try
        {
            s2.append(com.cardinalblue.android.piccollage.controller.network.f.a(list));
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            com.cardinalblue.android.piccollage.a.f.a(s1);
        }
        return s2.toString();
    }

    public static String a(Date date)
    {
        return i.format(date);
    }

    public static String a(TreeMap treemap, org.a.d.f f1, String s1, String s2, String s3, String s4)
        throws UnsupportedEncodingException, InvalidKeyException, NoSuchAlgorithmException
    {
        Object obj = a(b(16));
        String s5 = String.format(Locale.getDefault(), "%d", new Object[] {
            Long.valueOf(System.currentTimeMillis() / 1000L)
        });
        TreeMap treemap1 = new TreeMap();
        treemap1.put("oauth_consumer_key", s1);
        treemap1.put("oauth_nonce", obj);
        treemap1.put("oauth_signature_method", "HMAC-SHA1");
        treemap1.put("oauth_timestamp", s5);
        treemap1.put("oauth_version", "1.0");
        if (f1 != null)
        {
            treemap1.put("oauth_token", f1.d());
        }
        s1 = new TreeMap();
        if (treemap != null)
        {
            s1.putAll(treemap);
        }
        s1.putAll(treemap1);
        obj = s1.keySet().iterator();
        String s6;
        for (treemap = ""; ((Iterator) (obj)).hasNext(); treemap = (new StringBuilder()).append(treemap).append(URLEncoder.encode(s6, "UTF-8")).append("=").append(URLEncoder.encode((String)s1.get(s6), "UTF-8")).append("&").toString())
        {
            s6 = (String)((Iterator) (obj)).next();
        }

        treemap = treemap.substring(0, treemap.length() - 1);
        s3 = (new StringBuilder()).append(s3).append("&").append(URLEncoder.encode(s4, "UTF-8")).append("&").append(URLEncoder.encode(treemap, "UTF-8")).toString();
        s1 = (new StringBuilder()).append(s2).append("&").toString();
        treemap = s1;
        if (f1 != null)
        {
            treemap = (new StringBuilder()).append(s1).append(f1.e()).toString();
        }
        treemap1.put("oauth_signature", com.cardinalblue.android.piccollage.iab.util.a.a(c(treemap, s3)));
        f1 = treemap1.keySet().iterator();
        for (treemap = "OAuth "; f1.hasNext(); treemap = (new StringBuilder()).append(treemap).append(URLEncoder.encode(s1, "UTF-8")).append("=\"").append(URLEncoder.encode((String)treemap1.get(s1), "UTF-8")).append("\", ").toString())
        {
            s1 = (String)f1.next();
        }

        return treemap.substring(0, treemap.length() - 2);
    }

    public static String a(byte abyte0[])
    {
        char ac[] = new char[abyte0.length * 2];
        for (int i1 = 0; i1 < abyte0.length; i1++)
        {
            int j1 = abyte0[i1] & 0xff;
            ac[i1 * 2] = e[j1 >>> 4];
            ac[i1 * 2 + 1] = e[j1 & 0xf];
        }

        return new String(ac);
    }

    private static Cipher a(String s1, int i1)
        throws GeneralSecurityException
    {
        s1 = new DESKeySpec(s1.getBytes());
        s1 = SecretKeyFactory.getInstance("DES").generateSecret(s1);
        Cipher cipher = Cipher.getInstance("DES");
        if (i1 == 1)
        {
            cipher.init(1, s1);
        } else
        if (i1 == 2)
        {
            cipher.init(2, s1);
            return cipher;
        }
        return cipher;
    }

    public static CipherInputStream a(String s1, File file)
        throws a
    {
        try
        {
            s1 = new CipherInputStream(new FileInputStream(file), a(s1, 2));
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            throw new a(s1);
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            throw new a(s1);
        }
        return s1;
    }

    public static JSONObject a(Bundle bundle)
    {
        JSONObject jsonobject = new JSONObject();
        if (bundle == null)
        {
            return jsonobject;
        }
        for (Iterator iterator = bundle.keySet().iterator(); iterator.hasNext();)
        {
            String s1 = (String)iterator.next();
            try
            {
                jsonobject.put(s1, bundle.getString(s1));
            }
            catch (JSONException jsonexception) { }
        }

        return jsonobject;
    }

    public static void a(int i1)
    {
        NotificationManager notificationmanager = (NotificationManager)a().getSystemService("notification");
        if (notificationmanager != null && i1 >= 0)
        {
            notificationmanager.cancel(i1);
        }
    }

    public static void a(Activity activity, int i1, int j1)
    {
        if (a(activity))
        {
            Toast.makeText(activity, i1, j1).show();
        }
    }

    public static void a(Activity activity, Dialog dialog)
    {
        if (dialog == null || !dialog.isShowing() || !a(activity))
        {
            break MISSING_BLOCK_LABEL_22;
        }
        dialog.dismiss();
        return;
        activity;
        com.cardinalblue.android.piccollage.a.f.a(activity);
        return;
        activity;
        com.cardinalblue.android.piccollage.a.f.a(activity);
        return;
    }

    public static void a(Activity activity, String s1, int i1)
    {
        if (a(activity))
        {
            Toast.makeText(activity, s1, i1).show();
        }
    }

    public static void a(Dialog dialog)
    {
        if (dialog == null || !dialog.isShowing())
        {
            break MISSING_BLOCK_LABEL_15;
        }
        dialog.dismiss();
        return;
        dialog;
        com.cardinalblue.android.piccollage.a.f.a(dialog);
        return;
        dialog;
        com.cardinalblue.android.piccollage.a.f.a(dialog);
        return;
    }

    public static void a(Context context)
    {
        g = context;
    }

    public static void a(Context context, int i1, int j1)
    {
        if (context instanceof Activity)
        {
            a((Activity)context, i1, j1);
        }
    }

    public static void a(Context context, long l1)
    {
        context = context.getSharedPreferences("cardinalblue_3", 0);
        if (context != null)
        {
            context.edit().putLong("pref_current_collage_id", l1).apply();
        }
    }

    public static void a(Context context, AsyncTask asynctask, Dialog dialog)
    {
        if (!a(context, asynctask))
        {
            dialog.show();
        }
    }

    public static void a(Context context, String s1)
    {
        b(context, s1);
        b(context, (new StringBuilder()).append(".").append(s1).toString());
        b(context, (new StringBuilder()).append("https://").append(s1).toString());
        b(context, (new StringBuilder()).append("https://.").append(s1).toString());
    }

    public static void a(Context context, String s1, int i1)
    {
        if (context instanceof Activity)
        {
            a((Activity)context, s1, i1);
        }
    }

    public static void a(DialogFragment dialogfragment)
    {
        if (dialogfragment == null)
        {
            break MISSING_BLOCK_LABEL_8;
        }
        dialogfragment.dismiss();
        return;
        dialogfragment;
        com.cardinalblue.android.piccollage.a.f.a(dialogfragment);
        return;
    }

    public static void a(FragmentActivity fragmentactivity, DialogFragment dialogfragment, String s1)
    {
        if (!a(((Activity) (fragmentactivity))))
        {
            break MISSING_BLOCK_LABEL_16;
        }
        dialogfragment.show(fragmentactivity.getSupportFragmentManager(), s1);
        return;
        fragmentactivity;
        com.cardinalblue.android.piccollage.a.f.a(fragmentactivity);
        return;
    }

    public static void a(SearchView searchview)
    {
        if (searchview != null)
        {
            if ((searchview = (TextView)searchview.findViewById(0x7f10009b)) != null)
            {
                searchview.setTextColor(-1);
                searchview.setHintTextColor(-1);
                return;
            }
        }
    }

    public static void a(View view)
    {
        if (view == null)
        {
            return;
        } else
        {
            view.setSystemUiVisibility(4358);
            return;
        }
    }

    public static void a(ImageView imageview, Bitmap bitmap)
    {
        if (bitmap == null)
        {
            return;
        }
        Object obj = a().getResources();
        bitmap.setDensity(160);
        bitmap = new BitmapDrawable(((Resources) (obj)), bitmap);
        bitmap.setTargetDensity(((Resources) (obj)).getDisplayMetrics());
        int i1 = a().getResources().getDisplayMetrics().widthPixels;
        int j1 = bitmap.getIntrinsicWidth();
        obj = imageview.getDrawable();
        if (obj == null || ((Drawable) (obj)).getIntrinsicWidth() != bitmap.getIntrinsicWidth())
        {
            android.view.ViewGroup.LayoutParams layoutparams = imageview.getLayoutParams();
            layoutparams.width = i1;
            if (j1 > i1)
            {
                layoutparams.height = (i1 * bitmap.getIntrinsicHeight()) / j1;
            } else
            {
                layoutparams.height = -2;
            }
            imageview.setLayoutParams(layoutparams);
        }
        imageview.setImageDrawable(bitmap);
        imageview.setVisibility(0);
    }

    public static void a(PopupWindow popupwindow)
    {
        if (popupwindow == null || !popupwindow.isShowing())
        {
            break MISSING_BLOCK_LABEL_15;
        }
        popupwindow.dismiss();
        return;
        popupwindow;
        com.cardinalblue.android.piccollage.a.f.a(popupwindow);
        return;
        popupwindow;
_L2:
        com.cardinalblue.android.piccollage.a.f.a(popupwindow);
        return;
        popupwindow;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public static void a(Closeable closeable)
    {
        if (closeable == null)
        {
            break MISSING_BLOCK_LABEL_10;
        }
        closeable.close();
        return;
        closeable;
    }

    public static void a(File file, File file1)
        throws IOException
    {
        Object obj;
        obj = null;
        if (!file1.exists() && !file1.createNewFile())
        {
            throw new IOException((new StringBuilder()).append("Could not create ").append(file1.toString()).toString());
        }
        FileChannel filechannel = (new FileInputStream(file)).getChannel();
        file1 = (new FileOutputStream(file1)).getChannel();
        file1.transferFrom(filechannel, 0L, filechannel.size());
        if (filechannel != null)
        {
            filechannel.close();
        }
        if (file1 != null)
        {
            file1.close();
        }
        return;
        file;
        file1 = null;
        filechannel = obj;
_L2:
        if (filechannel != null)
        {
            filechannel.close();
        }
        if (file1 != null)
        {
            file1.close();
        }
        throw file;
        file;
        file1 = null;
        continue; /* Loop/switch isn't completed */
        file;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public static void a(InputStream inputstream, OutputStream outputstream)
        throws IOException
    {
        a(inputstream, outputstream, 0);
    }

    public static void a(InputStream inputstream, OutputStream outputstream, int i1)
        throws IOException
    {
        byte abyte0[] = new byte[4096];
        do
        {
            i1 = inputstream.read(abyte0);
            if (i1 != -1)
            {
                outputstream.write(abyte0, 0, i1);
            } else
            {
                return;
            }
        } while (true);
    }

    public static void a(String s1, File file, File file1)
        throws Throwable
    {
        file = new FileInputStream(file);
        file1 = new FileOutputStream(file1);
        b(new CipherInputStream(file, a(s1, 1)), file1);
    }

    public static void a(String s1, String s2)
    {
        Object obj = j();
        if (obj != null)
        {
            obj = ((SharedPreferences) (obj)).edit();
            if (TextUtils.isEmpty(s2))
            {
                ((android.content.SharedPreferences.Editor) (obj)).remove(s1);
            } else
            {
                ((android.content.SharedPreferences.Editor) (obj)).putString(s1, s2);
            }
            ((android.content.SharedPreferences.Editor) (obj)).apply();
        }
    }

    public static void a(String s1, String s2, String s3, String s4, String s5, com.android.volley.m.b b1, com.android.volley.m.a a1)
        throws Exception
    {
        TreeMap treemap = new TreeMap();
        treemap.put("x_auth_mode", "client_auth");
        treemap.put("x_auth_password", s2);
        treemap.put("x_auth_username", s1);
        s1 = a(treemap, null, s3, s4, "POST", s5);
        s2 = new HashMap();
        s2.put("Authorization", s1);
        com.cardinalblue.android.piccollage.lib.i.a(a()).b((new com.cardinalblue.android.piccollage.lib.i.i()).b(s5).a(treemap).b(s2).a(1).a(a1).a(b1).a());
    }

    public static void a(boolean flag)
    {
        j().edit().putBoolean("pref_has_badge", flag).apply();
    }

    public static boolean a(float f1, float f2, float f3, float f4, float f5)
    {
        f1 = Math.abs(f3 - f1);
        f2 = Math.abs(f4 - f2);
        return f1 >= f5 || f2 >= f5;
    }

    public static boolean a(Activity activity)
    {
        return activity != null && !activity.isFinishing();
    }

    public static boolean a(ActivityManager activitymanager)
    {
        boolean flag1 = false;
        boolean flag;
        if (android.os.Build.VERSION.SDK_INT >= 19)
        {
            flag = activitymanager.isLowRamDevice();
        } else
        {
            long l1 = b(activitymanager);
            flag = flag1;
            if (l1 > 0L)
            {
                flag = flag1;
                if (l1 <= 0x20000000L)
                {
                    return true;
                }
            }
        }
        return flag;
    }

    public static boolean a(Context context, AsyncTask asynctask)
    {
        if (context != null && (context instanceof Activity) && ((Activity)context).isFinishing())
        {
            asynctask.cancel(true);
            return true;
        } else
        {
            return false;
        }
    }

    private static boolean a(d d1, Context context)
    {
        static class _cls1
        {

            static final int a[];

            static 
            {
                a = new int[d.values().length];
                try
                {
                    a[com.cardinalblue.android.b.d.a.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    a[com.cardinalblue.android.b.d.b.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    a[com.cardinalblue.android.b.d.c.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[d.d.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[com.cardinalblue.android.b.d.e.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        com.cardinalblue.android.b._cls1.a[d1.ordinal()];
        JVM INSTR tableswitch 1 5: default 44
    //                   1 46
    //                   2 54
    //                   3 67
    //                   4 44
    //                   5 44;
           goto _L1 _L2 _L3 _L4 _L1 _L1
_L1:
        return false;
_L2:
        if (AccessToken.getCurrentAccessToken() != null)
        {
            return true;
        }
          goto _L1
_L3:
        return (new r(context, null)).c();
_L4:
        return PicAuth.h().b();
    }

    public static boolean a(File file)
    {
        if (file.exists() && file.isDirectory())
        {
            File afile[] = file.listFiles();
            if (afile == null)
            {
                return file.delete();
            }
            int j1 = afile.length;
            int i1 = 0;
            while (i1 < j1) 
            {
                File file1 = afile[i1];
                if (file1.isDirectory())
                {
                    a(file1);
                } else
                {
                    file1.delete();
                }
                i1++;
            }
        }
        return file.delete();
    }

    public static boolean a(net.a.a.c c1)
    {
        return c1 != null && c1.d();
    }

    public static byte[] a(InputStream inputstream)
    {
        byte abyte0[];
        ByteArrayOutputStream bytearrayoutputstream;
        abyte0 = null;
        bytearrayoutputstream = new ByteArrayOutputStream();
        byte abyte1[];
        a(inputstream, ((OutputStream) (bytearrayoutputstream)));
        abyte1 = bytearrayoutputstream.toByteArray();
        abyte0 = abyte1;
_L2:
        if (inputstream != null)
        {
            try
            {
                inputstream.close();
            }
            // Misplaced declaration of an exception variable
            catch (InputStream inputstream)
            {
                inputstream.printStackTrace();
                return abyte0;
            }
        }
        return abyte0;
        IOException ioexception;
        ioexception;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public static long b(long l1, long l2)
    {
        if (l1 > 0L && l2 < 0L || l1 < 0L && l2 > 0L)
        {
            throw new IllegalArgumentException("The given two numbers must have the same sign.");
        }
        if (l1 == 0L || l2 == 0L)
        {
            throw new IllegalArgumentException("The given number must not be a zero.");
        } else
        {
            return (l1 * l2) / a(l1, l2);
        }
    }

    private static long b(ActivityManager activitymanager)
    {
        if (android.os.Build.VERSION.SDK_INT >= 16)
        {
            android.app.ActivityManager.MemoryInfo memoryinfo = new android.app.ActivityManager.MemoryInfo();
            activitymanager.getMemoryInfo(memoryinfo);
            return memoryinfo.totalMem;
        }
        long l1;
        try
        {
            activitymanager = new BufferedReader(new FileReader("/proc/meminfo"), 8192);
            l1 = Integer.valueOf(activitymanager.readLine().split("\\s+")[1]).intValue() * 1024;
            activitymanager.close();
        }
        // Misplaced declaration of an exception variable
        catch (ActivityManager activitymanager)
        {
            return -1L;
        }
        return l1;
    }

    public static SharedPreferences b(String s1)
    {
        if (android.os.Build.VERSION.SDK_INT >= 11)
        {
            return a().getSharedPreferences(s1, 4);
        } else
        {
            return a().getSharedPreferences(s1, 0);
        }
    }

    public static Point b()
    {
        Object obj = a();
        if (obj == null)
        {
            com.cardinalblue.android.piccollage.a.f.a(new IllegalStateException("application context is null"));
            return new Point(-1, -1);
        }
        if (f == null)
        {
            obj = ((WindowManager)((Context) (obj)).getSystemService("window")).getDefaultDisplay();
            int i1;
            int j1;
            int l1;
            if (android.os.Build.VERSION.SDK_INT > 12)
            {
                Point point = new Point();
                ((Display) (obj)).getSize(point);
                j1 = point.x;
                int k1 = point.y;
                i1 = j1;
                if (j1 == 0)
                {
                    i1 = ((Display) (obj)).getWidth();
                }
                j1 = k1;
                if (k1 == 0)
                {
                    j1 = ((Display) (obj)).getHeight();
                }
            } else
            {
                i1 = ((Display) (obj)).getWidth();
                j1 = ((Display) (obj)).getHeight();
            }
            if (i1 > j1)
            {
                l1 = j1;
                j1 = i1;
            } else
            {
                l1 = i1;
            }
            f = new Point(l1, j1);
        }
        return f;
    }

    public static Object b(String s1, Type type)
        throws JSONException
    {
        return a(((e) (null)), s1, type);
    }

    public static void b(Activity activity, Dialog dialog)
    {
        if (!a(activity))
        {
            break MISSING_BLOCK_LABEL_11;
        }
        dialog.show();
        return;
        activity;
        com.cardinalblue.android.piccollage.a.f.a(activity);
        return;
    }

    public static void b(Context context, String s1)
    {
        context = d(context);
        String s2 = context.getCookie(s1);
        if (s2 == null)
        {
            return;
        }
        String as[] = s2.split("; ");
        for (int i1 = 0; i1 < as.length; i1++)
        {
            String as1[] = as[i1].split("=");
            if (Arrays.asList(as1).size() == 2)
            {
                context.setCookie(s1, (new StringBuilder()).append(as1[0]).append("=; expires=Sat, 1 Jan 2000 00:00:01 UTC").toString());
            }
        }

        context.removeExpiredCookie();
    }

    public static void b(View view)
    {
        if (view == null)
        {
            return;
        } else
        {
            view.setSystemUiVisibility(256);
            return;
        }
    }

    private static void b(InputStream inputstream, OutputStream outputstream)
        throws IOException
    {
        byte abyte0[] = new byte[64];
        do
        {
            int i1 = inputstream.read(abyte0);
            if (i1 != -1)
            {
                outputstream.write(abyte0, 0, i1);
            } else
            {
                outputstream.flush();
                outputstream.close();
                inputstream.close();
                return;
            }
        } while (true);
    }

    public static void b(String s1, String s2)
    {
    }

    public static boolean b(int i1, int j1)
    {
        if (j1 >= 0 && i1 >= 0)
        {
            if ((i1 -= j1) > 0 && i1 <= 10)
            {
                return true;
            }
        }
        return false;
    }

    public static boolean b(Context context)
    {
        context = (ConnectivityManager)context.getSystemService("connectivity");
        if (context == null)
        {
            return false;
        }
        context = context.getActiveNetworkInfo();
        boolean flag;
        if (context != null && context.isAvailable() && context.isConnected())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        return flag;
    }

    public static byte[] b(int i1)
    {
        SecureRandom securerandom = new SecureRandom();
        byte abyte0[] = new byte[i1];
        securerandom.nextBytes(abyte0);
        return abyte0;
    }

    public static int c()
    {
        return b().x;
    }

    public static Point c(int i1, int j1)
    {
        if (!r())
        {
            return new Point(i1, j1);
        } else
        {
            float f1 = Math.max(1.0F, 1024F / (float)Math.max(i1, j1));
            return new Point((int)((float)i1 * f1), (int)(f1 * (float)j1));
        }
    }

    public static String c(Context context)
    {
        return (new s(context)).a().toString();
    }

    public static void c(String s1)
    {
        long l1 = System.currentTimeMillis();
        b("cardinalblue_video_ad_metadata2").edit().putLong(s1, l1).apply();
    }

    public static byte[] c(String s1, String s2)
        throws NoSuchAlgorithmException, InvalidKeyException
    {
        s1 = new SecretKeySpec(s1.getBytes(), "HmacSHA1");
        Mac mac = Mac.getInstance("HmacSHA1");
        mac.init(s1);
        return mac.doFinal(s2.getBytes());
    }

    public static int d()
    {
        return b().y;
    }

    public static CookieManager d(Context context)
    {
        CookieSyncManager.createInstance(context);
        return CookieManager.getInstance();
    }

    public static Date d(String s1)
    {
        try
        {
            s1 = i.parse(s1);
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            s1.printStackTrace();
            return null;
        }
        return s1;
    }

    public static float e()
    {
        StatFs statfs = new StatFs(Environment.getDataDirectory().getPath());
        long l1 = statfs.getBlockSize();
        return (float)((long)statfs.getAvailableBlocks() * l1);
    }

    public static void e(Context context)
    {
        d(context).setAcceptCookie(true);
    }

    public static void f(Context context)
    {
        d(context).removeAllCookie();
    }

    public static boolean f()
    {
        return e() <= 1048576F;
    }

    public static long g(Context context)
    {
        context = context.getSharedPreferences("cardinalblue_3", 0);
        long l1 = -1L;
        if (context != null)
        {
            l1 = context.getLong("pref_current_collage_id", -1L);
        }
        return l1;
    }

    public static boolean g()
    {
        return j().getBoolean("pref_has_badge", false);
    }

    public static String h(Context context)
    {
        com.google.android.gcm.a.a(context);
        String s1 = com.google.android.gcm.a.e(context);
        if (TextUtils.isEmpty(s1))
        {
            com.google.android.gcm.a.a(context, new String[] {
                "773876082784"
            });
        }
        return s1;
    }

    public static boolean h()
    {
        if (!"google".equals("google"))
        {
            return false;
        } else
        {
            return j().getBoolean("pref_is_report_amplitude", false);
        }
    }

    public static String i()
    {
        String s2 = Locale.getDefault().getLanguage();
        String s1 = s2;
        if (s2.equals("zh"))
        {
            s1 = (new StringBuilder()).append(s2).append("-r").append(Locale.getDefault().getCountry()).toString();
        }
        return s1;
    }

    public static void i(Context context)
    {
        com.cardinalblue.android.piccollage.a.b.be();
        if (a(com.cardinalblue.android.b.d.a, context))
        {
            com.cardinalblue.android.piccollage.a.b.bh();
        }
        if (a(com.cardinalblue.android.b.d.c, context))
        {
            com.cardinalblue.android.piccollage.a.b.bg();
        }
        if (n(context) == 0)
        {
            com.cardinalblue.android.piccollage.a.b.bf();
        }
    }

    public static SharedPreferences j()
    {
        return b("cardinalblue_3");
    }

    public static boolean j(Context context)
    {
        return context.getPackageManager().hasSystemFeature("com.amazon.software.motiongestures");
    }

    public static int k()
    {
        return a().getResources().getDimensionPixelSize(0x7f0b0176);
    }

    public static boolean k(Context context)
    {
        return context.getPackageManager().hasSystemFeature("com.amazon.software.home");
    }

    public static int l()
    {
        return a().getResources().getDimensionPixelSize(0x7f0b00a2);
    }

    public static boolean l(Context context)
    {
        return context.getPackageManager().hasSystemFeature("com.amazon.software.headtracking");
    }

    public static int m()
    {
        return a().getResources().getDimensionPixelSize(0x7f0b0005);
    }

    public static boolean m(Context context)
    {
label0:
        {
            Object obj = ((ActivityManager)context.getSystemService("activity")).getRunningTasks(1024);
            if (((List) (obj)).isEmpty())
            {
                break label0;
            }
            context = context.getPackageName();
            obj = ((List) (obj)).iterator();
            android.app.ActivityManager.RunningTaskInfo runningtaskinfo;
            do
            {
                if (!((Iterator) (obj)).hasNext())
                {
                    break label0;
                }
                runningtaskinfo = (android.app.ActivityManager.RunningTaskInfo)((Iterator) (obj)).next();
            } while (!context.equals(runningtaskinfo.baseActivity.getPackageName()));
            return runningtaskinfo.numActivities == 1;
        }
        return true;
    }

    public static int n()
    {
        return a().getResources().getDimensionPixelSize(0x7f0b000a);
    }

    private static int n(Context context)
    {
        int i2 = 1;
        int i1;
        int j1;
        int k1;
        int l1;
        if (a(com.cardinalblue.android.b.d.a, context))
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        if (a(com.cardinalblue.android.b.d.b, context))
        {
            j1 = 1;
        } else
        {
            j1 = 0;
        }
        if (a(com.cardinalblue.android.b.d.c, context))
        {
            k1 = 1;
        } else
        {
            k1 = 0;
        }
        if (a(d.d, context))
        {
            l1 = 1;
        } else
        {
            l1 = 0;
        }
        if (!a(com.cardinalblue.android.b.d.e, context))
        {
            i2 = 0;
        }
        return l1 + (0 + i1 + j1 + k1) + i2;
    }

    public static String o()
    {
        if ("kddi".equalsIgnoreCase("google"))
        {
            return a().getString(0x7f070338);
        }
        if ("beta".equalsIgnoreCase("google"))
        {
            return a().getString(0x7f070337);
        }
        if ("picparty".equalsIgnoreCase("google"))
        {
            return a().getString(0x7f07033a);
        } else
        {
            return a().getString(0x7f070339);
        }
    }

    public static boolean p()
    {
        return "google".equalsIgnoreCase("google") || "picparty".equalsIgnoreCase("google");
    }

    public static String q()
    {
        if ("beta".equalsIgnoreCase("google"))
        {
            return a().getString(0x7f07032d);
        }
        if ("picparty".equalsIgnoreCase("google"))
        {
            return a().getString(0x7f07032e);
        } else
        {
            return a().getString(0x7f07032f);
        }
    }

    public static boolean r()
    {
        return j().getBoolean("ENABLE_HD", true);
    }

    public static boolean s()
    {
        boolean flag = false;
        if (!j().getBoolean("pref_watermark_unlock", false))
        {
            flag = true;
        }
        return flag;
    }

    public static Point t()
    {
        int k1 = Collage.o();
        int l1 = Collage.n();
        int i1 = a().getResources().getDimensionPixelSize(0x7f0b016c);
        int j1 = Math.round(d() - m() - i1 - k());
        i1 = j1;
        if (com.cardinalblue.android.b.e.a())
        {
            i1 = j1 - l();
        }
        j1 = Math.round((float)c() * 0.9F);
        float f1 = Math.min((float)i1 / (float)k1, (float)j1 / (float)l1);
        return new Point(Math.round((float)l1 * f1), Math.round(f1 * (float)k1));
    }

    static 
    {
        a = j.b;
        b = j.a;
        i = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'XXX'", Locale.US);
        i.setTimeZone(TimeZone.getTimeZone("UTC"));
    }
}
