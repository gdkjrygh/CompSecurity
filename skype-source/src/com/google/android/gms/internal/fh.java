// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Handler;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.formats.NativeAdOptionsParcel;
import com.google.android.gms.ads.internal.formats.c;
import com.google.android.gms.ads.internal.formats.f;
import com.google.android.gms.ads.internal.formats.h;
import com.google.android.gms.ads.internal.n;
import com.google.android.gms.ads.internal.p;
import com.google.android.gms.ads.internal.request.AdRequestInfoParcel;
import com.google.android.gms.ads.internal.request.AdResponseParcel;
import com.google.android.gms.ads.internal.util.client.b;
import com.google.android.gms.b.d;
import com.google.android.gms.common.internal.y;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.internal:
//            gb, gy, gq, bs, 
//            bv, fi, ab, ay, 
//            ax, gx, gm, fj, 
//            fk, ha, o, ac, 
//            cf, hi, ij, iq

public final class fh
    implements Callable
{
    public static interface a
    {

        public abstract com.google.android.gms.ads.internal.formats.h.a a(fh fh1, JSONObject jsonobject)
            throws JSONException, InterruptedException, ExecutionException;
    }

    final class b
    {

        public cf a;
        final fh b;

        b()
        {
            b = fh.this;
            super();
        }
    }


    private static final long a;
    private final Context b;
    private final gq c;
    private final n d;
    private final o e;
    private final ac f;
    private final Object g = new Object();
    private final gb.a h;
    private boolean i;
    private int j;
    private List k;

    public fh(Context context, n n1, ac ac, gq gq1, o o, gb.a a1)
    {
        b = context;
        d = n1;
        c = gq1;
        f = ac;
        h = a1;
        e = o;
        i = false;
        j = -2;
        k = null;
    }

    static n a(fh fh1)
    {
        return fh1.d;
    }

    private gb a(com.google.android.gms.ads.internal.formats.h.a a1)
    {
        Object obj = g;
        obj;
        JVM INSTR monitorenter ;
        int i1 = j;
        int l;
        l = i1;
        if (a1 != null)
        {
            break MISSING_BLOCK_LABEL_34;
        }
        l = i1;
        if (j == -2)
        {
            l = 0;
        }
        obj;
        JVM INSTR monitorexit ;
        if (l != -2)
        {
            a1 = null;
        }
        return new gb(h.a.c, null, h.b.d, l, h.b.f, k, h.b.l, h.b.k, h.a.i, false, null, null, null, null, null, 0L, h.d, h.b.g, h.f, h.g, h.b.o, h.h, a1, h.a.x);
        a1;
        obj;
        JVM INSTR monitorexit ;
        throw a1;
    }

    private ha a(JSONObject jsonobject, boolean flag, boolean flag1)
        throws JSONException
    {
        if (flag)
        {
            jsonobject = jsonobject.getString("url");
        } else
        {
            jsonobject = jsonobject.optString("url");
        }
        if (TextUtils.isEmpty(jsonobject))
        {
            a(0, flag);
            return new gy(null);
        }
        if (flag1)
        {
            return new gy(new c(null, Uri.parse(jsonobject)));
        } else
        {
            return c.a(jsonobject, new gq.a(flag, jsonobject) {

                final boolean a;
                final String b;
                final fh c;

                private c b(InputStream inputstream)
                {
                    try
                    {
                        ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
                        iq.a(inputstream, bytearrayoutputstream, true);
                        inputstream = bytearrayoutputstream.toByteArray();
                    }
                    // Misplaced declaration of an exception variable
                    catch (InputStream inputstream)
                    {
                        inputstream = null;
                    }
                    if (inputstream == null)
                    {
                        c.a(2, a);
                        return null;
                    }
                    inputstream = BitmapFactory.decodeByteArray(inputstream, 0, inputstream.length);
                    if (inputstream == null)
                    {
                        c.a(2, a);
                        return null;
                    } else
                    {
                        return new c(new BitmapDrawable(Resources.getSystem(), inputstream), Uri.parse(b));
                    }
                }

                public final Object a()
                {
                    c.a(2, a);
                    return null;
                }

                public final Object a(InputStream inputstream)
                {
                    return b(inputstream);
                }

            
            {
                c = fh.this;
                a = flag;
                b = s;
                super();
            }
            });
        }
    }

    private static Integer a(JSONObject jsonobject, String s)
    {
        int l;
        try
        {
            jsonobject = jsonobject.getJSONObject(s);
            l = Color.rgb(jsonobject.getInt("r"), jsonobject.getInt("g"), jsonobject.getInt("b"));
        }
        // Misplaced declaration of an exception variable
        catch (JSONObject jsonobject)
        {
            return null;
        }
        return Integer.valueOf(l);
    }

    static void a(fh fh1, bs bs1, String s)
    {
        try
        {
            fh1 = fh1.d.a(bs1.k());
        }
        // Misplaced declaration of an exception variable
        catch (fh fh1)
        {
            com.google.android.gms.ads.internal.util.client.b.b((new StringBuilder("Failed to call onCustomClick for asset ")).append(s).append(".").toString(), fh1);
            return;
        }
        if (fh1 == null)
        {
            break MISSING_BLOCK_LABEL_26;
        }
        fh1.a(bs1, s);
    }

    private gb b()
    {
        if (!a()) goto _L2; else goto _L1
_L1:
        Object obj1 = null;
_L13:
        if (!a()) goto _L4; else goto _L3
_L3:
        Object obj2 = null;
_L14:
        Object obj;
        if (a())
        {
            break MISSING_BLOCK_LABEL_717;
        }
        obj = ((JSONObject) (obj2)).getString("template_id");
        if (h.a.C == null) goto _L6; else goto _L5
_L5:
        boolean flag = h.a.C.b;
_L18:
        if (h.a.C == null) goto _L8; else goto _L7
_L7:
        boolean flag1 = h.a.C.d;
_L19:
        if (!"2".equals(obj)) goto _L10; else goto _L9
_L9:
        obj = new fi(flag, flag1);
_L15:
        if (!a()) goto _L12; else goto _L11
_L11:
        obj = null;
_L16:
        if (obj instanceof f)
        {
            Object obj3 = (f)obj;
            obj2 = new b();
            obj3 = new cf(((f) (obj3))) {

                final f a;
                final fh b;

                public final void a(hi hi, Map map)
                {
                    hi = (String)map.get("asset");
                    fh.a(b, a, hi);
                }

            
            {
                b = fh.this;
                a = f1;
                super();
            }
            };
            obj2.a = ((cf) (obj3));
            ((ab) (obj1)).a("/nativeAdCustomClick", ((cf) (obj3)));
        }
        return a(((com.google.android.gms.ads.internal.formats.h.a) (obj)));
_L2:
        obj = ay.Z;
        obj1 = (String)p.n().a(((au) (obj)));
        com.google.android.gms.ads.internal.util.client.VersionInfoParcel versioninfoparcel;
        o o;
        gx gx2;
        if (h.b.b.indexOf("https") == 0)
        {
            obj = "https:";
        } else
        {
            obj = "http:";
        }
        obj = (new StringBuilder()).append(((String) (obj))).append(((String) (obj1))).toString();
        obj1 = f;
        obj2 = b;
        versioninfoparcel = h.a.k;
        o = e;
        gx2 = new gx();
        gm.a.post(new ac._cls1(((ac) (obj1)), ((Context) (obj2)), versioninfoparcel, gx2, o, ((String) (obj))));
        obj1 = (ab)gx2.get(a, TimeUnit.MILLISECONDS);
        ((ab) (obj1)).a(d, d, d, d);
          goto _L13
_L4:
        obj = new gx();
        obj2 = new b();
        cf cf = new cf(((ab) (obj1)), ((b) (obj2)), ((gx) (obj))) {

            final ab a;
            final b b;
            final gx c;
            final fh d;

            public final void a(hi hi, Map map)
            {
                a.b("/nativeAdPreProcess", b.a);
                try
                {
                    hi = (String)map.get("success");
                    if (!TextUtils.isEmpty(hi))
                    {
                        c.b((new JSONObject(hi)).getJSONArray("ads").getJSONObject(0));
                        return;
                    }
                }
                // Misplaced declaration of an exception variable
                catch (hi hi)
                {
                    com.google.android.gms.ads.internal.util.client.b.a("Malformed native JSON response.", hi);
                }
                d.a(0);
                y.a(d.a(), "Unable to set the ad state error!");
                c.b(null);
            }

            
            {
                d = fh.this;
                a = ab1;
                b = b1;
                c = gx1;
                super();
            }
        };
        obj2.a = cf;
        ((ab) (obj1)).a("/nativeAdPreProcess", cf);
        ((ab) (obj1)).a("google.afma.nativeAds.preProcessJsonGmsg", new JSONObject(h.b.c));
        obj2 = (JSONObject)((gx) (obj)).get(a, TimeUnit.MILLISECONDS);
          goto _L14
_L10:
label0:
        {
            if (!"1".equals(obj))
            {
                break label0;
            }
            obj = new fj(flag, flag1);
        }
          goto _L15
label1:
        {
            if (!"3".equals(obj))
            {
                break MISSING_BLOCK_LABEL_552;
            }
            obj = ((JSONObject) (obj2)).getString("custom_template_id");
            gx gx1 = new gx();
            gm.a.post(new Runnable(gx1, ((String) (obj))) {

                final gx a;
                final String b;
                final fh c;

                public final void run()
                {
                    a.b(fh.a(c).x().get(b));
                }

            
            {
                c = fh.this;
                a = gx1;
                b = s;
                super();
            }
            });
            if (gx1.get(a, TimeUnit.MILLISECONDS) == null)
            {
                break label1;
            }
            obj = new fk(flag);
        }
          goto _L15
        List list;
        try
        {
            com.google.android.gms.ads.internal.util.client.b.a((new StringBuilder("No handler for custom template: ")).append(((JSONObject) (obj2)).getString("custom_template_id")).toString());
            break MISSING_BLOCK_LABEL_717;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj) { }
        // Misplaced declaration of an exception variable
        catch (Object obj) { }
        // Misplaced declaration of an exception variable
        catch (Object obj) { }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            com.google.android.gms.ads.internal.util.client.b.b("Malformed native JSON response.", ((Throwable) (obj)));
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            com.google.android.gms.ads.internal.util.client.b.b("Timeout when loading native ad.", ((Throwable) (obj)));
        }
        break MISSING_BLOCK_LABEL_561;
        a(0);
        break MISSING_BLOCK_LABEL_717;
        if (!i)
        {
            a(0);
        }
        return a(((com.google.android.gms.ads.internal.formats.h.a) (null)));
_L12:
        list = b(((JSONObject) (obj2)).getJSONObject("tracking_urls_and_actions"), "impression_tracking_urls");
        if (list != null)
        {
            break MISSING_BLOCK_LABEL_658;
        }
        list = null;
_L17:
        k = list;
        obj = ((a) (obj)).a(this, ((JSONObject) (obj2)));
        ((com.google.android.gms.ads.internal.formats.h.a) (obj)).a(new h(b, d, ((ab) (obj1)), e, ((JSONObject) (obj2)), ((com.google.android.gms.ads.internal.formats.h.a) (obj)), h.a.k));
          goto _L16
        list = Arrays.asList(list);
          goto _L17
_L6:
        flag = false;
          goto _L18
_L8:
        flag1 = false;
          goto _L19
        obj = null;
          goto _L15
    }

    private static String[] b(JSONObject jsonobject, String s)
        throws JSONException
    {
        jsonobject = jsonobject.optJSONArray(s);
        if (jsonobject == null)
        {
            return null;
        }
        s = new String[jsonobject.length()];
        for (int l = 0; l < jsonobject.length(); l++)
        {
            s[l] = jsonobject.getString(l);
        }

        return s;
    }

    public final ha a(JSONObject jsonobject)
        throws JSONException
    {
        jsonobject = jsonobject.optJSONObject("attribution");
        if (jsonobject == null)
        {
            return new gy(null);
        } else
        {
            Object obj = jsonobject.optString("text");
            int l = jsonobject.optInt("text_size", -1);
            Object obj1 = a(jsonobject, "text_color");
            Integer integer = a(jsonobject, "bg_color");
            jsonobject = a(jsonobject, "image", false, false);
            obj = new gz.a(((String) (obj)), integer, ((Integer) (obj1)), l) {

                final String a;
                final Integer b;
                final Integer c;
                final int d;
                final fh e;

                private com.google.android.gms.ads.internal.formats.a a(c c1)
                {
                    if (c1 == null)
                    {
                        break MISSING_BLOCK_LABEL_91;
                    }
                    String s;
                    Drawable drawable;
                    Integer integer1;
                    Integer integer2;
                    try
                    {
                        if (TextUtils.isEmpty(a))
                        {
                            break MISSING_BLOCK_LABEL_91;
                        }
                    }
                    // Misplaced declaration of an exception variable
                    catch (c c1)
                    {
                        com.google.android.gms.ads.internal.util.client.b.a("Could not get attribution icon", c1);
                        return null;
                    }
                    s = a;
                    drawable = (Drawable)com.google.android.gms.b.d.a(c1.a());
                    integer1 = b;
                    integer2 = c;
                    if (d <= 0)
                    {
                        break MISSING_BLOCK_LABEL_86;
                    }
                    c1 = Integer.valueOf(d);
_L1:
                    c1 = new com.google.android.gms.ads.internal.formats.a(s, drawable, integer1, integer2, c1);
                    return c1;
                    c1 = null;
                      goto _L1
                    return null;
                }

                public final Object a(Object obj2)
                {
                    return a((c)obj2);
                }

            
            {
                e = fh.this;
                a = s;
                b = integer;
                c = integer1;
                d = l;
                super();
            }
            };
            obj1 = new gx();
            jsonobject.a(new gz._cls1(((gx) (obj1)), ((gz.a) (obj)), jsonobject));
            return ((ha) (obj1));
        }
    }

    public final ha a(JSONObject jsonobject, String s, boolean flag, boolean flag1)
        throws JSONException
    {
        if (flag)
        {
            jsonobject = jsonobject.getJSONObject(s);
        } else
        {
            jsonobject = jsonobject.optJSONObject(s);
        }
        s = jsonobject;
        if (jsonobject == null)
        {
            s = new JSONObject();
        }
        return a(((JSONObject) (s)), flag, flag1);
    }

    public final Future a(JSONObject jsonobject, String s, boolean flag)
        throws JSONException
    {
        s = jsonobject.getJSONObject(s);
        boolean flag1 = s.optBoolean("require", true);
        jsonobject = s;
        if (s == null)
        {
            jsonobject = new JSONObject();
        }
        return a(jsonobject, flag1, flag);
    }

    public final void a(int l)
    {
        synchronized (g)
        {
            i = true;
            j = l;
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final void a(int l, boolean flag)
    {
        if (flag)
        {
            a(l);
        }
    }

    public final boolean a()
    {
        boolean flag;
        synchronized (g)
        {
            flag = i;
        }
        return flag;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final List b(JSONObject jsonobject, String s, boolean flag, boolean flag1)
        throws JSONException
    {
        JSONArray jsonarray = jsonobject.getJSONArray(s);
        ArrayList arraylist = new ArrayList();
        if (jsonarray == null || jsonarray.length() == 0)
        {
            a(0, true);
            return arraylist;
        }
        int l;
        int i1;
        if (flag1)
        {
            l = jsonarray.length();
        } else
        {
            l = 1;
        }
        for (i1 = 0; i1 < l; i1++)
        {
            s = jsonarray.getJSONObject(i1);
            jsonobject = s;
            if (s == null)
            {
                jsonobject = new JSONObject();
            }
            arraylist.add(a(jsonobject, true, flag));
        }

        return arraylist;
    }

    public final Object call()
        throws Exception
    {
        return b();
    }

    static 
    {
        a = TimeUnit.SECONDS.toMillis(60L);
    }
}
