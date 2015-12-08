// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Handler;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.formats.NativeAdOptionsParcel;
import com.google.android.gms.ads.internal.request.AdRequestInfoParcel;
import com.google.android.gms.ads.internal.request.AdResponseParcel;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
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

public final class chw
    implements Callable
{

    private static final long a;
    private final Context b;
    private final bks c;
    private final bzm d;
    private final Object e = new Object();
    private final ciu f;
    private boolean g;
    private int h;
    private List i;

    public chw(Context context, bks bks1, cac cac, bzm bzm, ciu ciu1)
    {
        b = context;
        c = bks1;
        f = ciu1;
        d = bzm;
        g = false;
        h = -2;
        i = null;
    }

    static bks a(chw chw1)
    {
        return chw1.c;
    }

    private cit a(bhh bhh1)
    {
        Object obj = e;
        obj;
        JVM INSTR monitorenter ;
        int k = h;
        int j;
        j = k;
        if (bhh1 != null)
        {
            break MISSING_BLOCK_LABEL_37;
        }
        j = k;
        if (h == -2)
        {
            j = 0;
        }
        obj;
        JVM INSTR monitorexit ;
        if (j != -2)
        {
            bhh1 = null;
        }
        obj = f.a.c;
        List list = f.b.d;
        List list1 = f.b.f;
        List list2 = i;
        int l = f.b.l;
        long l1 = f.b.k;
        String s = f.a.i;
        com.google.android.gms.ads.internal.client.AdSizeParcel adsizeparcel = f.d;
        long l2 = f.b.g;
        return new cit(((com.google.android.gms.ads.internal.client.AdRequestParcel) (obj)), null, list, j, list1, list2, l, l1, s, false, null, null, null, null, null, adsizeparcel, f.f, f.g, f.b.o, f.h, bhh1);
        bhh1;
        obj;
        JVM INSTR monitorexit ;
        throw bhh1;
    }

    private static Integer a(JSONObject jsonobject, String s)
    {
        int j;
        try
        {
            jsonobject = jsonobject.getJSONObject(s);
            j = Color.rgb(jsonobject.getInt("r"), jsonobject.getInt("g"), jsonobject.getInt("b"));
        }
        // Misplaced declaration of an exception variable
        catch (JSONObject jsonobject)
        {
            return null;
        }
        return Integer.valueOf(j);
    }

    static List a(List list)
    {
        ArrayList arraylist = new ArrayList();
        for (list = list.iterator(); list.hasNext(); arraylist.add((Drawable)bye.a(((bhb)list.next()).a()))) { }
        return arraylist;
    }

    static void a(chw chw1, cck cck1, String s)
    {
        try
        {
            chw1 = chw1.c.a(cck1.k());
        }
        // Misplaced declaration of an exception variable
        catch (chw chw1)
        {
            bka.c((new StringBuilder("Failed to call onCustomClick for asset ")).append(s).append(".").toString(), chw1);
            return;
        }
        if (chw1 == null)
        {
            break MISSING_BLOCK_LABEL_26;
        }
        chw1.a(cck1, s);
    }

    private cit b()
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
            break MISSING_BLOCK_LABEL_706;
        }
        obj = ((JSONObject) (obj2)).getString("template_id");
        if (f.a.z == null) goto _L6; else goto _L5
_L5:
        boolean flag = f.a.z.b;
_L18:
        if (f.a.z == null) goto _L8; else goto _L7
_L7:
        boolean flag1 = f.a.z.d;
_L19:
        if (!"2".equals(obj)) goto _L10; else goto _L9
_L9:
        obj = new chz(flag, flag1);
_L15:
        if (!a()) goto _L12; else goto _L11
_L11:
        obj = null;
_L16:
        if (obj instanceof bhe)
        {
            Object obj3 = (bhe)obj;
            obj2 = new chy();
            obj3 = new cdi(((bhe) (obj3))) {

                private bhe a;
                private chw b;

                public final void a(ckw ckw, Map map)
                {
                    ckw = (String)map.get("asset");
                    chw.a(b, a, ckw);
                }

            
            {
                b = chw.this;
                a = bhe1;
                super();
            }
            };
            obj2.a = ((cdi) (obj3));
            ((caa) (obj1)).a("/nativeAdCustomClick", ((cdi) (obj3)));
        }
        return a(((bhh) (obj)));
_L2:
        obj = cbb.J;
        obj1 = (String)bkv.n().a(((cax) (obj)));
        bzm bzm;
        ckg ckg2;
        if (f.b.b.indexOf("https") == 0)
        {
            obj = "https:";
        } else
        {
            obj = "http:";
        }
        obj = (new StringBuilder()).append(((String) (obj))).append(((String) (obj1))).toString();
        obj1 = b;
        obj2 = f.a.k;
        bzm = d;
        ckg2 = new ckg();
        cjj.a.post(new cac._cls1(((Context) (obj1)), ((com.google.android.gms.ads.internal.util.client.VersionInfoParcel) (obj2)), ckg2, bzm, ((String) (obj))));
        obj1 = (caa)ckg2.get(a, TimeUnit.MILLISECONDS);
        ((caa) (obj1)).a(c, c, c, c);
          goto _L13
_L4:
        obj = new ckg();
        obj2 = new chy();
        cdi cdi = new cdi(((caa) (obj1)), ((chy) (obj2)), ((ckg) (obj))) {

            private caa a;
            private chy b;
            private ckg c;
            private chw d;

            public final void a(ckw ckw, Map map)
            {
                a.b("/nativeAdPreProcess", b.a);
                try
                {
                    ckw = (String)map.get("success");
                    if (!TextUtils.isEmpty(ckw))
                    {
                        c.b((new JSONObject(ckw)).getJSONArray("ads").getJSONObject(0));
                        return;
                    }
                }
                // Misplaced declaration of an exception variable
                catch (ckw ckw)
                {
                    bka.b("Malformed native JSON response.", ckw);
                }
                d.a(0);
                btl.a(d.a(), "Unable to set the ad state error!");
                c.b(null);
            }

            
            {
                d = chw.this;
                a = caa1;
                b = chy1;
                c = ckg1;
                super();
            }
        };
        obj2.a = cdi;
        ((caa) (obj1)).a("/nativeAdPreProcess", cdi);
        ((caa) (obj1)).a("google.afma.nativeAds.preProcessJsonGmsg", new JSONObject(f.b.c));
        obj2 = (JSONObject)((ckg) (obj)).get(a, TimeUnit.MILLISECONDS);
          goto _L14
_L10:
label0:
        {
            if (!"1".equals(obj))
            {
                break label0;
            }
            obj = new cia(flag, flag1);
        }
          goto _L15
label1:
        {
            if (!"3".equals(obj))
            {
                break MISSING_BLOCK_LABEL_541;
            }
            obj = ((JSONObject) (obj2)).getString("custom_template_id");
            ckg ckg1 = new ckg();
            cjj.a.post(new Runnable(ckg1, ((String) (obj))) {

                private ckg a;
                private String b;
                private chw c;

                public final void run()
                {
                    a.b(chw.a(c).y().get(b));
                }

            
            {
                c = chw.this;
                a = ckg1;
                b = s;
                super();
            }
            });
            if (ckg1.get(a, TimeUnit.MILLISECONDS) == null)
            {
                break label1;
            }
            obj = new cib(flag);
        }
          goto _L15
        List list;
        try
        {
            bka.b((new StringBuilder("No handler for custom template: ")).append(((JSONObject) (obj2)).getString("custom_template_id")).toString());
            break MISSING_BLOCK_LABEL_706;
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
            bka.c("Malformed native JSON response.", ((Throwable) (obj)));
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            bka.c("Timeout when loading native ad.", ((Throwable) (obj)));
        }
        break MISSING_BLOCK_LABEL_550;
        a(0);
        break MISSING_BLOCK_LABEL_706;
        if (!g)
        {
            a(0);
        }
        return a(((bhh) (null)));
_L12:
        list = b(((JSONObject) (obj2)).getJSONObject("tracking_urls_and_actions"), "impression_tracking_urls");
        if (list != null)
        {
            break MISSING_BLOCK_LABEL_647;
        }
        list = null;
_L17:
        i = list;
        obj = ((chx) (obj)).a(this, ((JSONObject) (obj2)));
        ((bhh) (obj)).a(new bhg(b, c, ((caa) (obj1)), d, ((JSONObject) (obj2)), ((bhh) (obj)), f.a.k));
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
    {
        jsonobject = jsonobject.optJSONArray(s);
        if (jsonobject == null)
        {
            return null;
        }
        s = new String[jsonobject.length()];
        for (int j = 0; j < jsonobject.length(); j++)
        {
            s[j] = jsonobject.getString(j);
        }

        return s;
    }

    public final ckk a(JSONObject jsonobject)
    {
        JSONObject jsonobject1 = jsonobject.optJSONObject("attribution");
        if (jsonobject1 == null)
        {
            return new ckh(null);
        }
        Object obj = jsonobject1.optString("text");
        int j = jsonobject1.optInt("text_size", -1);
        Object obj1 = a(jsonobject1, "text_color");
        Integer integer = a(jsonobject1, "bg_color");
        int k = jsonobject1.optInt("animation_ms", 1000);
        int l = jsonobject1.optInt("presentation_ms", 4000);
        jsonobject = new ArrayList();
        if (jsonobject1.optJSONArray("images") != null)
        {
            jsonobject = a(jsonobject1, "images", false, false, true);
        } else
        {
            jsonobject.add(a(jsonobject1, "image", false, false));
        }
        jsonobject = cki.a(jsonobject);
        obj = new ckj(((String) (obj)), integer, ((Integer) (obj1)), j, l, k) {

            private String a;
            private Integer b;
            private Integer c;
            private int d;
            private int e;
            private int f;

            private bgz a(List list)
            {
                if (list == null)
                {
                    break MISSING_BLOCK_LABEL_93;
                }
                String s;
                List list1;
                Integer integer1;
                Integer integer2;
                try
                {
                    if (list.isEmpty())
                    {
                        break MISSING_BLOCK_LABEL_93;
                    }
                }
                // Misplaced declaration of an exception variable
                catch (List list)
                {
                    bka.b("Could not get attribution icon", list);
                    return null;
                }
                s = a;
                list1 = chw.a(list);
                integer1 = b;
                integer2 = c;
                if (d <= 0)
                {
                    break MISSING_BLOCK_LABEL_88;
                }
                list = Integer.valueOf(d);
_L1:
                list = new bgz(s, list1, integer1, integer2, list, e + f);
                return list;
                list = null;
                  goto _L1
                return null;
            }

            public final Object a(Object obj2)
            {
                return a((List)obj2);
            }

            
            {
                a = s;
                b = integer;
                c = integer1;
                d = j;
                e = k;
                f = l;
                super();
            }
        };
        obj1 = new ckg();
        jsonobject.a(new cki._cls1(((ckg) (obj1)), ((ckj) (obj)), jsonobject));
        return ((ckk) (obj1));
    }

    public final ckk a(JSONObject jsonobject, String s, boolean flag, boolean flag1)
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

    final ckk a(JSONObject jsonobject, boolean flag, boolean flag1)
    {
        double d1;
        String s;
        if (flag)
        {
            s = jsonobject.getString("url");
        } else
        {
            s = jsonobject.optString("url");
        }
        d1 = jsonobject.optDouble("scale", 1.0D);
        if (TextUtils.isEmpty(s))
        {
            a(0, flag);
            return new ckh(null);
        }
        if (flag1)
        {
            return new ckh(new bhb(null, Uri.parse(s), d1));
        } else
        {
            jsonobject = new cjy(flag, d1, s) {

                private boolean a;
                private double b;
                private String c;
                private chw d;

                private bhb b()
                {
                    d.a(2, a);
                    return null;
                }

                private bhb b(InputStream inputstream)
                {
                    try
                    {
                        ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
                        cnt.a(inputstream, bytearrayoutputstream);
                        inputstream = bytearrayoutputstream.toByteArray();
                    }
                    // Misplaced declaration of an exception variable
                    catch (InputStream inputstream)
                    {
                        inputstream = null;
                    }
                    if (inputstream == null)
                    {
                        d.a(2, a);
                        return null;
                    }
                    inputstream = BitmapFactory.decodeByteArray(inputstream, 0, inputstream.length);
                    if (inputstream == null)
                    {
                        d.a(2, a);
                        return null;
                    } else
                    {
                        inputstream.setDensity((int)(160D * b));
                        return new bhb(new BitmapDrawable(Resources.getSystem(), inputstream), Uri.parse(c), b);
                    }
                }

                public final Object a()
                {
                    return b();
                }

                public final Object a(InputStream inputstream)
                {
                    return b(inputstream);
                }

            
            {
                d = chw.this;
                a = flag;
                b = d1;
                c = s;
                super();
            }
            };
            cka cka1 = new cka((byte)0);
            cjx.a.a(new cjz(s, jsonobject, cka1));
            return cka1;
        }
    }

    public final List a(JSONObject jsonobject, String s, boolean flag, boolean flag1, boolean flag2)
    {
        ArrayList arraylist;
        if (flag)
        {
            jsonobject = jsonobject.getJSONArray(s);
        } else
        {
            jsonobject = jsonobject.optJSONArray(s);
        }
        arraylist = new ArrayList();
        if (jsonobject == null || jsonobject.length() == 0)
        {
            a(0, flag);
            return arraylist;
        }
        int j;
        int k;
        if (flag2)
        {
            j = jsonobject.length();
        } else
        {
            j = 1;
        }
        for (k = 0; k < j; k++)
        {
            JSONObject jsonobject1 = jsonobject.getJSONObject(k);
            s = jsonobject1;
            if (jsonobject1 == null)
            {
                s = new JSONObject();
            }
            arraylist.add(a(((JSONObject) (s)), flag, flag1));
        }

        return arraylist;
    }

    public final void a(int j)
    {
        synchronized (e)
        {
            g = true;
            h = j;
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final void a(int j, boolean flag)
    {
        if (flag)
        {
            a(j);
        }
    }

    public final boolean a()
    {
        boolean flag;
        synchronized (e)
        {
            flag = g;
        }
        return flag;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final Object call()
    {
        return b();
    }

    static 
    {
        a = TimeUnit.SECONDS.toMillis(60L);
    }
}
