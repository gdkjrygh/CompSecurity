// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.android.c;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.http.AndroidHttpClient;
import android.text.Editable;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.style.ImageSpan;
import android.widget.EditText;
import com.android.volley.p;
import com.android.volley.toolbox.a;
import com.android.volley.toolbox.e;
import com.android.volley.toolbox.h;
import com.kik.cache.SimpleLruBitmapCache;
import com.kik.cache.ad;
import com.kik.cache.aj;
import com.kik.cache.aw;
import com.kik.cache.z;
import com.kik.g.k;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kik.a.d.aa;
import kik.a.e.q;
import kik.a.e.t;
import kik.a.e.v;
import kik.a.e.w;
import kik.a.h.j;
import kik.a.j.n;
import kik.android.chat.KikApplication;
import kik.android.d.d;
import kik.android.util.DeviceUtils;
import kik.android.util.ar;
import kik.android.util.cj;
import kik.android.util.cq;
import kik.android.widget.u;
import org.c.b;
import org.c.c;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.kik.android.c:
//            c, l, j, g, 
//            h, e, b, k, 
//            i, a

public final class f
{
    public static class a
    {

        public a()
        {
        }
    }

    public static final class b
    {

        private com.kik.android.c.e a;
        private long b;
        private long c;
        private long d;

        static void a(b b1, long l1)
        {
            b1.c = l1;
        }

        static void a(b b1, com.kik.android.c.e e1)
        {
            b1.a = e1;
        }

        public final long a()
        {
            return c;
        }

        public final boolean a(long l1)
        {
            return c > l1;
        }

        public final com.kik.android.c.e b()
        {
            return a;
        }

        public final boolean c()
        {
            return c > d;
        }

        public final boolean d()
        {
            return c > b;
        }

        private b(com.kik.android.c.e e1, long l1, long l2, long l3)
        {
            d = l1;
            a = e1;
            b = l2;
            c = l3;
        }

        b(com.kik.android.c.e e1, long l1, long l2, long l3, 
                byte byte0)
        {
            this(e1, l1, l2, l3);
        }
    }

    public static final class c
    {

        public List a;
        public int b;
        public boolean c;

        public c()
        {
            a = new ArrayList();
        }
    }

    private static final class d
    {

        private int a;
        private int b;
        private int c;
        private String d;
        private String e;

        static String a(d d1)
        {
            return d1.d;
        }

        static String b(d d1)
        {
            return d1.e;
        }

        public final int a()
        {
            DeviceUtils.b();
            JVM INSTR lookupswitch 5: default 52
        //                       120: 66
        //                       160: 72
        //                       240: 66
        //                       320: 72
        //                       480: 66;
               goto _L1 _L2 _L3 _L2 _L3 _L2
_L3:
            break MISSING_BLOCK_LABEL_72;
_L1:
            byte byte0 = 60;
_L4:
            if (byte0 == 60)
            {
                return b;
            } else
            {
                return a;
            }
_L2:
            byte0 = 60;
              goto _L4
            byte0 = 40;
              goto _L4
        }

        public final int b()
        {
            return c;
        }

        public d(String s, String s1, int i1, int j1, int k1)
        {
            d = s;
            e = s1;
            b = j1;
            a = i1;
            c = k1;
        }
    }

    public static final class e
        implements Comparator
    {

        public final int compare(Object obj, Object obj1)
        {
            obj = (com.kik.i.a.a.a)obj;
            obj1 = (com.kik.i.a.a.a)obj1;
            if (obj != null || obj1 != null)
            {
                if (obj == null)
                {
                    return -1;
                }
                if (obj1 == null)
                {
                    return 1;
                }
                if (((com.kik.i.a.a.a) (obj)).c() != null || ((com.kik.i.a.a.a) (obj1)).c() != null)
                {
                    if (((com.kik.i.a.a.a) (obj)).c() == null)
                    {
                        return -1;
                    }
                    if (((com.kik.i.a.a.a) (obj1)).c() == null)
                    {
                        return 1;
                    } else
                    {
                        return ((com.kik.i.a.a.a) (obj)).c().intValue() - ((com.kik.i.a.a.a) (obj1)).c().intValue();
                    }
                }
            }
            return 0;
        }

        public e()
        {
        }
    }


    private static final HashMap a;
    private static final HashMap b;
    private static final List c;
    private static final List d;
    private static p e;
    private static com.android.volley.toolbox.d f;
    private static SimpleLruBitmapCache g;
    private static ad h;
    private static List j;
    private static final Comparator m = new e();
    private static final org.c.b n = org.c.c.a("SmileyManager");
    private static File p;
    private static k q;
    private final l i;
    private final w k;
    private final t l;
    private final com.kik.g.f o = new com.kik.g.f();

    public f(Context context, n n1, v v, com.kik.g.p p1, w w1, t t1, ar ar, 
            q q1)
    {
        k = w1;
        l = t1;
        i = new l(new com.kik.android.c.j(context, v), n1, v, kik.android.d.d.a(context), context, ar);
        q = new k(this);
        p = q1.b("smileys");
        kik.android.util.d.a(new File(context.getFilesDir(), "smileys"), p);
        if (android.os.Build.VERSION.SDK_INT >= 9)
        {
            n1 = new h();
        } else
        {
            n1 = new com.android.volley.toolbox.e(AndroidHttpClient.newInstance("AN"));
        }
        n1 = new com.android.volley.toolbox.a(n1);
        f = new com.android.volley.toolbox.d(p, 0x500000);
        e = new p(f, n1);
        g = com.kik.m.k.a();
        e.a();
        n1 = new ad(e, g, null);
        h = n1;
        n1.b();
        o.a(h.a(), new g(this));
        if (p1 == null)
        {
            i.k();
            return;
        } else
        {
            p1.a(new com.kik.android.c.h(this, context));
            return;
        }
    }

    static l a(f f1)
    {
        return f1.i;
    }

    private static com.kik.i.a.a.c a(CharSequence charsequence)
    {
        int i1 = 0;
        if (charsequence == null)
        {
            return null;
        }
        com.kik.i.a.a.c c1 = new com.kik.i.a.a.c();
        charsequence = cj.a().b(charsequence);
        int k1 = charsequence.length;
        int j1 = 0;
        do
        {
            if (i1 >= k1)
            {
                break;
            }
            kik.android.util.bk.a a1 = charsequence[i1];
            com.kik.i.a.a.a a2 = new com.kik.i.a.a.a();
            String s = g(a1.c());
            a2.b(null);
            a2.a(s);
            a2.b(Integer.valueOf(a1.b()));
            a2.a(Integer.valueOf(a1.a()));
            c1.a(a2);
            j1++;
            if (j1 >= 50)
            {
                break;
            }
            i1++;
        } while (true);
        return c1;
    }

    public static CharSequence a(Context context, com.kik.android.c.e e1)
    {
        if (e1 == null || context == null)
        {
            return null;
        }
        if (e1.g() == null || e1.f() == null)
        {
            return e1.f();
        }
        String s = e1.e();
        String s2 = e1.g();
        String s1 = e1.f();
        Bitmap bitmap = i(s);
        boolean flag;
        if (bitmap != null)
        {
            context = new BitmapDrawable(context.getResources(), bitmap);
            flag = false;
        } else
        {
            int i1;
            if (s == null)
            {
                i1 = e(s2);
            } else
            {
                i1 = f(e1.g());
            }
            if (i1 <= 0)
            {
                context = new SpannableStringBuilder(s1);
                context.setSpan(new com.kik.android.c.k(s, s1.length()), 0, s1.length(), 33);
                return context;
            }
            flag = true;
            context = context.getResources().getDrawable(i1);
        }
        context.setBounds(0, 0, KikApplication.a(21), KikApplication.a(21));
        e1 = new SpannableStringBuilder(s1);
        e1.setSpan(new com.kik.android.c.b(context, s2, s, null, s1.length(), flag), 0, s1.length(), 33);
        return e1;
    }

    public static CharSequence a(Context context, CharSequence charsequence, com.kik.i.a.a.c c1, int i1, boolean flag, kik.android.e.f f1)
    {
        if (charsequence == null || context == null)
        {
            return "";
        }
        SpannableStringBuilder spannablestringbuilder = new SpannableStringBuilder(charsequence);
        if (c1 == null || !a(c1, charsequence))
        {
            charsequence = a(charsequence);
        } else
        {
            charsequence = c1;
        }
        a(context, ((Spannable) (spannablestringbuilder)), ((com.kik.i.a.a.c) (charsequence)), i1, flag, f1);
        return spannablestringbuilder;
    }

    public static JSONObject a(List list)
    {
        JSONObject jsonobject = new JSONObject();
        JSONArray jsonarray = new JSONArray();
        if (list != null)
        {
            list = list.iterator();
            do
            {
                if (!list.hasNext())
                {
                    break;
                }
                com.kik.android.c.e e1 = (com.kik.android.c.e)list.next();
                if (e1 != null && e1.e() != null)
                {
                    JSONObject jsonobject1 = new JSONObject();
                    try
                    {
                        jsonobject1.put("title", e1.d());
                        jsonobject1.put("text", e1.f());
                        jsonobject1.put("id", e1.e());
                        jsonobject1.put("install-date", e1.i());
                        jsonobject1.put("active", e1.h());
                        jsonarray.put(jsonobject1);
                    }
                    catch (JSONException jsonexception)
                    {
                        jsonexception.printStackTrace();
                    }
                }
            } while (true);
        }
        try
        {
            jsonobject.put("smileys", jsonarray);
        }
        // Misplaced declaration of an exception variable
        catch (List list)
        {
            list.printStackTrace();
            return jsonobject;
        }
        return jsonobject;
    }

    private static void a(Context context, Spannable spannable, com.kik.i.a.a.c c1, int i1, boolean flag, kik.android.e.f f1)
    {
        if (context != null && c1 != null && c1.b() != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        Iterator iterator;
        int k1;
        ImageSpan aimagespan[] = (ImageSpan[])spannable.getSpans(0, spannable.length(), android/text/style/ImageSpan);
        int l1 = aimagespan.length;
        for (int j1 = 0; j1 < l1; j1++)
        {
            spannable.removeSpan(aimagespan[j1]);
        }

        iterator = c1.b().iterator();
        k1 = 0;
_L5:
        com.kik.i.a.a.a a1;
        String s;
        String s1;
        boolean flag1;
        do
        {
            if (!iterator.hasNext())
            {
                break; /* Loop/switch isn't completed */
            }
            a1 = (com.kik.i.a.a.a)iterator.next();
        } while (a1 == null || a1.c().intValue() < 0 || a1.d().intValue() > spannable.length() || a1.c().intValue() >= a1.d().intValue());
        s = a1.f();
        s1 = a1.e();
        c1 = i(s);
        flag1 = false;
        if (c1 == null) goto _L4; else goto _L3
_L3:
        c1 = new BitmapDrawable(context.getResources(), c1);
_L7:
        int i2;
        if (i1 > 0)
        {
            c1.setBounds(0, 0, KikApplication.a(i1), KikApplication.a(i1));
        } else
        {
            c1.setBounds(0, 0, c1.getIntrinsicWidth(), c1.getIntrinsicHeight());
        }
        if (flag)
        {
            c1 = new u(c1, s1, s, f1, a1.d().intValue() - a1.c().intValue(), flag1);
        } else
        {
            c1 = new com.kik.android.c.b(c1, s1, s, f1, a1.d().intValue() - a1.c().intValue(), flag1);
        }
        spannable.setSpan(c1, a1.c().intValue(), a1.d().intValue(), 33);
        k1++;
        if (k1 >= 50) goto _L1; else goto _L5
_L4:
        if (cq.c(s))
        {
            i2 = e(a1.e());
        } else
        {
            i2 = f(a1.e());
        }
        if (i2 <= 0) goto _L5; else goto _L6
_L6:
        flag1 = true;
        c1 = context.getResources().getDrawable(i2);
          goto _L7
    }

    public static void a(Context context, Spannable spannable, String s)
    {
        if (context != null && spannable != null && s != null && context != null)
        {
            Iterator iterator = (new ArrayList(Arrays.asList(spannable.getSpans(0, spannable.length(), com/kik/android/c/i)))).iterator();
            while (iterator.hasNext()) 
            {
                i i1 = (i)iterator.next();
                if (i1 != null && s.equals(i1.b()) && !i1.e())
                {
                    Object obj = i(s);
                    if (obj != null)
                    {
                        obj = new BitmapDrawable(context.getResources(), ((Bitmap) (obj)));
                        ((Drawable) (obj)).setBounds(0, 0, KikApplication.a(21), KikApplication.a(21));
                        int j1 = spannable.getSpanStart(i1);
                        int k1 = spannable.getSpanEnd(i1);
                        obj = new com.kik.android.c.b(((Drawable) (obj)), i1.c(), s, null, i1.d(), false);
                        spannable.removeSpan(i1);
                        spannable.setSpan(obj, j1, k1, 33);
                    }
                }
            }
        }
    }

    public static void a(Spannable spannable)
    {
        if (spannable != null)
        {
            Iterator iterator = (new ArrayList(Arrays.asList(spannable.getSpans(0, spannable.length(), com/kik/android/c/f$a)))).iterator();
            while (iterator.hasNext()) 
            {
                spannable.removeSpan((a)iterator.next());
            }
        }
    }

    public static void a(EditText edittext)
    {
        if (edittext != null && (edittext.getText() instanceof Spannable) && edittext.getSelectionEnd() == edittext.getSelectionStart())
        {
            Editable editable = edittext.getText();
            Object obj = new ArrayList(Arrays.asList(editable.getSpans(edittext.getSelectionStart(), edittext.getSelectionStart(), com/kik/android/c/b)));
            if (((ArrayList) (obj)).size() > 0)
            {
                int i2 = edittext.getSelectionEnd();
                obj = ((ArrayList) (obj)).iterator();
                int i1 = -1;
                int j1 = 0;
                while (((Iterator) (obj)).hasNext()) 
                {
                    com.kik.android.c.b b1 = (com.kik.android.c.b)((Iterator) (obj)).next();
                    int k1 = j1;
                    if (editable.getSpanStart(b1) < i2)
                    {
                        k1 = j1;
                        if (editable.getSpanEnd(b1) > i2)
                        {
                            k1 = 1;
                        }
                    }
                    int l1 = editable.getSpanEnd(b1);
                    j1 = l1;
                    if (i1 >= 0)
                    {
                        if (Math.abs(l1 - i2) < Math.abs(i1 - i2))
                        {
                            j1 = l1;
                        } else
                        {
                            j1 = i1;
                        }
                    }
                    i1 = j1;
                    j1 = k1;
                }
                if (i1 >= 0 && j1 != 0)
                {
                    edittext.setSelection(i1);
                    return;
                }
            }
        }
    }

    static void a(f f1, Context context)
    {
        if (!f1.i.g())
        {
            String s = f1.k.d().c;
            if (s != null && s.length() != 0)
            {
                s = s.toLowerCase();
                Object obj1 = f1.l.a(s);
                if (obj1 != null && ((String) (obj1)).length() >= 8)
                {
                    Object obj = ((String) (obj1)).substring(((String) (obj1)).length() - 8, ((String) (obj1)).length() - 4);
                    obj1 = ((String) (obj1)).substring(((String) (obj1)).length() - 4, ((String) (obj1)).length());
                    int i1 = (int)(Long.parseLong(((String) (obj)), 16) % 3L);
                    int j1 = (int)(Long.parseLong(((String) (obj1)), 16) % 3L);
                    obj = (d)c.get(i1);
                    obj1 = (d)d.get(j1);
                    ArrayList arraylist = new ArrayList();
                    com.kik.android.c.e e1 = com.kik.android.c.e.a(null, com.kik.android.c.d.a(((d) (obj))), com.kik.android.c.d.b(((d) (obj))), com.kik.android.c.d.a(((d) (obj))), kik.a.h.j.b());
                    com.kik.android.c.e e2 = com.kik.android.c.e.a(null, com.kik.android.c.d.a(((d) (obj1))), com.kik.android.c.d.b(((d) (obj1))), com.kik.android.c.d.a(((d) (obj1))), kik.a.h.j.b());
                    arraylist.add(e1);
                    arraylist.add(e2);
                    a(aw.d(e1.e()), ((BitmapDrawable)context.getResources().getDrawable(((d) (obj)).a())).getBitmap());
                    a(aw.d(e2.e()), ((BitmapDrawable)context.getResources().getDrawable(((d) (obj1)).a())).getBitmap());
                    a(aj.d(e1.e()), ((BitmapDrawable)context.getResources().getDrawable(((d) (obj)).b())).getBitmap());
                    a(aj.d(e2.e()), ((BitmapDrawable)context.getResources().getDrawable(((d) (obj1)).b())).getBitmap());
                    f1.i.a(arraylist);
                    f1.i.h();
                    return;
                }
            }
        }
    }

    static void a(z z1)
    {
        if (z1 != null && (z1 instanceof aw))
        {
            q.a(((aw)z1).u());
        }
    }

    private static void a(String s, Bitmap bitmap)
    {
        if (s == null || bitmap == null)
        {
            break MISSING_BLOCK_LABEL_59;
        }
        com.android.volley.b.a a1 = new com.android.volley.b.a();
        a1.d = System.currentTimeMillis() + 0x41353000L;
        a1.e = System.currentTimeMillis() + 0x41353000L;
        a1.a = com.kik.m.k.b(bitmap, android.graphics.Bitmap.CompressFormat.PNG, 100);
        f.a(s, a1);
        return;
        s;
        (new StringBuilder("unable to rip smiley Image:")).append(s.getMessage());
        return;
    }

    public static boolean a(Editable editable)
    {
        if (editable == null)
        {
            return false;
        }
        for (Iterator iterator = (new ArrayList(Arrays.asList(editable.getSpans(0, editable.length(), com/kik/android/c/i)))).iterator(); iterator.hasNext();)
        {
            i i1 = (i)iterator.next();
            int j1 = editable.getSpanStart(i1);
            int k1 = editable.getSpanEnd(i1);
            int l1 = k1 - j1;
            if (l1 < i1.d() && l1 > 0)
            {
                editable.setSpan(new a(), j1, k1, 33);
                return true;
            }
        }

        return false;
    }

    private static boolean a(com.kik.i.a.a.c c1, CharSequence charsequence)
    {
        if (c1 == null || charsequence == null)
        {
            return false;
        }
        c1 = c1.b();
        if (c1 == null)
        {
            return false;
        }
        Collections.sort(c1, m);
        Iterator iterator = c1.iterator();
        for (c1 = null; iterator.hasNext(); c1 = charsequence)
        {
            charsequence = (com.kik.i.a.a.a)iterator.next();
            if (charsequence.c() == null || charsequence.d() == null || charsequence.c().intValue() < 0)
            {
                return false;
            }
            if (c1 != null && charsequence.c().intValue() < c1.d().intValue())
            {
                return false;
            }
        }

        return true;
    }

    public static com.kik.i.a.a.c b(Spannable spannable)
    {
        if (spannable == null)
        {
            return null;
        }
        com.kik.i.a.a.c c1 = new com.kik.i.a.a.c();
        Iterator iterator = (new ArrayList(Arrays.asList(spannable.getSpans(0, spannable.length(), com/kik/android/c/i)))).iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            i i1 = (i)iterator.next();
            if (i1 != null)
            {
                com.kik.i.a.a.a a1 = new com.kik.i.a.a.a();
                a1.b(i1.b());
                a1.a(i1.c());
                a1.a(Integer.valueOf(spannable.getSpanStart(i1)));
                a1.b(Integer.valueOf(spannable.getSpanEnd(i1)));
                c1.a(a1);
            }
        } while (true);
        return c1;
    }

    public static void b(Editable editable)
    {
        if (editable != null)
        {
            Iterator iterator = (new ArrayList(Arrays.asList(editable.getSpans(0, editable.length(), com/kik/android/c/f$a)))).iterator();
            while (iterator.hasNext()) 
            {
                a a1 = (a)iterator.next();
                if (a1 != null)
                {
                    editable.replace(editable.getSpanStart(a1), editable.getSpanEnd(a1), "");
                }
            }
        }
    }

    private static void b(List list)
    {
        if (list != null)
        {
            list = list.iterator();
            while (list.hasNext()) 
            {
                Object obj = (com.kik.android.c.e)list.next();
                if (obj != null)
                {
                    i(((com.kik.android.c.e) (obj)).e());
                    obj = ((com.kik.android.c.e) (obj)).e();
                    if (obj != null)
                    {
                        obj = aj.a(((String) (obj)), aj.e, aj.d);
                        h.a(((z) (obj)), ad.a, 0, 0, true);
                    }
                }
            }
        }
    }

    public static void b(JSONObject jsonobject)
    {
        List list = c(jsonobject);
        d(jsonobject);
        b(list);
    }

    public static com.kik.g.e c()
    {
        return q.a();
    }

    public static List c(JSONObject jsonobject)
    {
        ArrayList arraylist = new ArrayList();
        if (jsonobject == null)
        {
            return arraylist;
        }
        JSONArray jsonarray = jsonobject.optJSONArray("smileys");
        if (jsonarray != null)
        {
            int i1 = 0;
            while (i1 < jsonarray.length()) 
            {
                jsonobject = jsonarray.optJSONObject(i1);
                if (jsonobject == null)
                {
                    jsonobject = null;
                } else
                if (jsonobject.optString("id") == null)
                {
                    jsonobject = null;
                } else
                {
                    jsonobject = com.kik.android.c.e.a(jsonobject.optString("title"), jsonobject.optString("categoryId"), jsonobject.optString("id"), jsonobject.optString("text"), kik.a.h.j.b());
                }
                if (jsonobject != null)
                {
                    arraylist.add(jsonobject);
                }
                i1++;
            }
        }
        return arraylist;
    }

    private static void d(JSONObject jsonobject)
    {
        if (jsonobject != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        if ((jsonobject = jsonobject.optJSONArray("smileys")) != null)
        {
            int i1 = 0;
            while (i1 < jsonobject.length()) 
            {
                Object obj = jsonobject.optJSONObject(i1);
                if (obj != null)
                {
                    String s = ((JSONObject) (obj)).optString("id");
                    obj = ((JSONObject) (obj)).optString("image", null);
                    if (s != null && obj != null)
                    {
                        try
                        {
                            byte abyte0[] = com.kik.m.e.a(((String) (obj)), 16);
                            s = aw.d(s);
                            com.android.volley.b.a a1 = new com.android.volley.b.a();
                            a1.d = System.currentTimeMillis() + 0x41353000L;
                            a1.e = System.currentTimeMillis() + 0x41353000L;
                            a1.a = abyte0;
                            f.a(s, a1);
                        }
                        catch (IOException ioexception)
                        {
                            (new StringBuilder("unable to rip smiley Image:")).append(ioexception.getMessage());
                        }
                        catch (OutOfMemoryError outofmemoryerror)
                        {
                            (new StringBuilder("unable to rip smiley Image:")).append(outofmemoryerror.getMessage());
                        }
                    }
                }
                i1++;
            }
        }
        if (true) goto _L1; else goto _L3
_L3:
    }

    private static int e(String s)
    {
        if (s != null)
        {
            if (a.containsKey(s = s.toUpperCase()))
            {
                return ((Integer)a.get(s)).intValue();
            }
        }
        return -1;
    }

    public static ad e()
    {
        return h;
    }

    private static int f(String s)
    {
        if (s != null)
        {
            if (b.containsKey(s = s.toUpperCase()))
            {
                return ((Integer)b.get(s)).intValue();
            }
        }
        return -1;
    }

    private static String g(String s)
    {
        if (s != null)
        {
            if (a.containsKey(s = s.toUpperCase()))
            {
                return s;
            }
        }
        return null;
    }

    private String h(String s)
    {
        if (s != null)
        {
            String s1 = s.toUpperCase();
            Map map = i.d();
            if (map.get(s) != null)
            {
                return ((com.kik.android.c.a)map.get(s1)).c();
            }
        }
        return null;
    }

    private static Bitmap i(String s)
    {
        if (s == null)
        {
            return null;
        } else
        {
            s = aw.a(s, z.e, z.d);
            return h.a(s, ad.a, 0, 0, true).b();
        }
    }

    public final c a(Context context, Spannable spannable)
    {
        c c1;
        ArrayList arraylist;
        kik.android.util.bk.a aa1[];
        int i1;
        int j1;
        int l1;
        boolean flag;
        if (spannable == null || context == null)
        {
            return new c();
        }
        c1 = new c();
        if (context == null || spannable == null)
        {
            return c1;
        }
        arraylist = new ArrayList(Arrays.asList(spannable.getSpans(0, spannable.length(), com/kik/android/c/b)));
        i1 = arraylist.size();
        flag = false;
        aa1 = cj.a().b(spannable);
        l1 = aa1.length;
        j1 = 0;
_L2:
        kik.android.util.bk.a a1;
        boolean flag1;
        flag1 = flag;
        if (j1 >= l1)
        {
            break MISSING_BLOCK_LABEL_369;
        }
        a1 = aa1[j1];
        if (a1 != null)
        {
            com.kik.android.c.b ab[] = (com.kik.android.c.b[])spannable.getSpans(a1.a(), a1.b(), com/kik/android/c/b);
            if (ab == null || ab.length <= 0)
            {
                break; /* Loop/switch isn't completed */
            }
            arraylist.removeAll(Arrays.asList(ab));
        }
_L8:
        j1++;
        if (true) goto _L2; else goto _L1
_L1:
        String s = g(a1.c());
        if (s == null) goto _L4; else goto _L3
_L3:
        Object obj = h(s);
        if (obj == null) goto _L4; else goto _L5
_L5:
        Object obj1;
        obj1 = i(((String) (obj)));
        flag1 = false;
        if (obj1 == null) goto _L7; else goto _L6
_L6:
        obj1 = new BitmapDrawable(context.getResources(), ((Bitmap) (obj1)));
        flag = flag1;
_L10:
        ((Drawable) (obj1)).setBounds(0, 0, KikApplication.a(21), KikApplication.a(21));
        obj = new com.kik.android.c.b(((Drawable) (obj1)), s, ((String) (obj)), null, a1.b() - a1.a(), flag);
        spannable.setSpan(obj, a1.a(), a1.b(), 33);
        flag1 = true;
        c1.a.add(obj);
        i1++;
        if (i1 >= 50)
        {
            break MISSING_BLOCK_LABEL_369;
        }
        flag = true;
          goto _L8
_L4:
        obj = null;
          goto _L5
_L7:
        int k1;
        if (obj == null)
        {
            k1 = e(s);
        } else
        {
            k1 = f(s);
        }
        if (k1 <= 0) goto _L8; else goto _L9
_L9:
        flag = true;
        obj1 = context.getResources().getDrawable(k1);
          goto _L10
        context = arraylist.iterator();
        do
        {
            if (!context.hasNext())
            {
                break;
            }
            com.kik.android.c.b b1 = (com.kik.android.c.b)context.next();
            if (b1 != null && g(b1.c()) != null)
            {
                spannable.removeSpan(b1);
                flag1 = true;
                c1.b = c1.b + 1;
            }
        } while (true);
        c1.c = flag1;
        return c1;
          goto _L8
    }

    public final List a(String s)
    {
        ArrayList arraylist = new ArrayList();
        if (s == null)
        {
            return arraylist;
        }
        Iterator iterator = i.a().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            com.kik.android.c.e e1 = (com.kik.android.c.e)iterator.next();
            if (e1 != null && s.equalsIgnoreCase(e1.g()))
            {
                arraylist.add(e1);
            }
        } while (true);
        iterator = j.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            com.kik.android.c.c c1 = (com.kik.android.c.c)iterator.next();
            if (c1 != null && s.equalsIgnoreCase(c1.g()))
            {
                arraylist.add(c1);
            }
        } while (true);
        Collections.sort(arraylist, new e.a());
        return arraylist;
    }

    public final void a(com.kik.android.c.e e1)
    {
        if (e1 != null)
        {
            if (e1 instanceof com.kik.android.c.c)
            {
                if ((e1 = (com.kik.android.c.a)i.d().get(e1.g())) != null)
                {
                    i.b(e1);
                    return;
                }
            } else
            {
                e1 = new com.kik.android.c.a(e1.g(), e1.e());
                i.a(e1);
                return;
            }
        }
    }

    public final void a(JSONObject jsonobject)
    {
        List list = c(jsonobject);
        i.a(list);
        d(jsonobject);
        b(list);
    }

    public final boolean a()
    {
        return i.i();
    }

    public final com.kik.android.c.e b(String s)
    {
        if (s != null) goto _L2; else goto _L1
_L1:
        Object obj = null;
_L4:
        return ((com.kik.android.c.e) (obj));
_L2:
        com.kik.android.c.e e1;
        obj = h(s);
        if (obj == null)
        {
            break; /* Loop/switch isn't completed */
        }
        e1 = i.a(((String) (obj)));
        obj = e1;
        if (e1 != null) goto _L4; else goto _L3
_L3:
        for (Iterator iterator = j.iterator(); iterator.hasNext();)
        {
            com.kik.android.c.c c1 = (com.kik.android.c.c)iterator.next();
            if (s.equalsIgnoreCase(c1.g()))
            {
                return c1;
            }
        }

        return null;
    }

    public final void b()
    {
        i.j();
    }

    public final void b(com.kik.android.c.e e1)
    {
        i.b(e1);
    }

    public final void c(String s)
    {
        i.b(s);
    }

    public final com.kik.android.c.e d(String s)
    {
        return i.a(s);
    }

    public final List d()
    {
        LinkedHashMap linkedhashmap = new LinkedHashMap();
        Iterator iterator = j.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            com.kik.android.c.c c1 = (com.kik.android.c.c)iterator.next();
            if (c1 != null && c1.g() != null)
            {
                linkedhashmap.put(c1.g(), new b(c1, i.e(), i.a(c1), c1.i(), (byte)0));
            }
        } while (true);
        iterator = i.a().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            com.kik.android.c.e e1 = (com.kik.android.c.e)iterator.next();
            if (e1 != null && e1.g() != null)
            {
                b b1 = (b)linkedhashmap.get(e1.g());
                if (b1 != null)
                {
                    if (e1.h())
                    {
                        com.kik.android.c.b.a(b1, e1);
                    }
                    if (e1.i() > b1.a())
                    {
                        com.kik.android.c.b.a(b1, e1.i());
                    }
                }
            }
        } while (true);
        return new ArrayList(linkedhashmap.values());
    }

    public final List f()
    {
        return i.a();
    }

    public final void g()
    {
        o.a();
        if (p != null)
        {
            i.b();
            i.c();
            kik.a.h.c.a(p, true, n);
        }
    }

    public final long h()
    {
        return i.e();
    }

    public final void i()
    {
        i.f();
    }

    static 
    {
        a = new HashMap();
        b = new HashMap();
        c = new ArrayList();
        d = new ArrayList();
        j = new ArrayList();
        j.add(com.kik.android.c.c.a(":)", 0x7f02027f));
        j.add(com.kik.android.c.c.a(";)", 0x7f0202a8));
        j.add(com.kik.android.c.c.a(":(", 0x7f020289));
        j.add(com.kik.android.c.c.a(":D", 0x7f020281));
        j.add(com.kik.android.c.c.a(":P", 0x7f02028b));
        j.add(com.kik.android.c.c.a(":|", 0x7f02028d));
        j.add(com.kik.android.c.c.a(":/", 0x7f020291));
        j.add(com.kik.android.c.c.a(">:(", 0x7f02029e));
        j.add(com.kik.android.c.c.a(":X", 0x7f020297));
        j.add(com.kik.android.c.c.a("<3", 0x7f0202a5));
        j.add(com.kik.android.c.c.a("</3", 0x7f0202a3));
        j.add(com.kik.android.c.c.a("B)", 0x7f02027a));
        j.add(com.kik.android.c.c.a(":3", 0x7f020295));
        j.add(com.kik.android.c.c.a(":'(", 0x7f02027d));
        j.add(com.kik.android.c.c.a(":O", 0x7f020287));
        j.add(com.kik.android.c.c.a(":S", 0x7f02028f));
        j.add(com.kik.android.c.c.a(":$", 0x7f020283));
        j.add(com.kik.android.c.c.a(":*", 0x7f020293));
        j.add(com.kik.android.c.c.a(">:)", 0x7f02029c));
        j.add(com.kik.android.c.c.a(":E", 0x7f020285));
        j.add(com.kik.android.c.c.a("(KIK)", 0x7f0202a1));
        j.add(com.kik.android.c.c.a("D:", 0x7f020299));
        b.put(":)", Integer.valueOf(0x7f020280));
        b.put(";)", Integer.valueOf(0x7f0202a9));
        b.put(":(", Integer.valueOf(0x7f02028a));
        b.put(":D", Integer.valueOf(0x7f020282));
        b.put(":P", Integer.valueOf(0x7f02028c));
        b.put(":|", Integer.valueOf(0x7f02028e));
        b.put(":/", Integer.valueOf(0x7f020292));
        b.put(">:(", Integer.valueOf(0x7f02029f));
        b.put(":X", Integer.valueOf(0x7f020298));
        b.put("<3", Integer.valueOf(0x7f0202a6));
        b.put("</3", Integer.valueOf(0x7f0202a4));
        b.put("B)", Integer.valueOf(0x7f02027b));
        b.put(":3", Integer.valueOf(0x7f020296));
        b.put(":'(", Integer.valueOf(0x7f02027e));
        b.put(":O", Integer.valueOf(0x7f020288));
        b.put(":S", Integer.valueOf(0x7f020290));
        b.put(":$", Integer.valueOf(0x7f020284));
        b.put(":*", Integer.valueOf(0x7f020294));
        b.put(">:)", Integer.valueOf(0x7f02029d));
        b.put(":E", Integer.valueOf(0x7f020286));
        b.put("(KIK)", Integer.valueOf(0x7f0202a2));
        b.put("D:", Integer.valueOf(0x7f02029a));
        c.add(new d(":$", "d87e73fd", 0x7f0201d0, 0x7f0201d1, 0x7f0201d2));
        c.add(new d(":)", "49015869", 0x7f0201d3, 0x7f0201d4, 0x7f0201d5));
        c.add(new d(";)", "55f986b0", 0x7f0201d6, 0x7f0201d7, 0x7f0201d8));
        d.add(new d("B)", "d751b6d8", 0x7f020242, 0x7f020243, 0x7f020244));
        d.add(new d("<3", "12b64657", 0x7f020245, 0x7f020246, 0x7f020247));
        d.add(new d(":*", "20cd967c", 0x7f020248, 0x7f020249, 0x7f02024a));
        com.kik.android.c.c c1;
        for (Iterator iterator = j.iterator(); iterator.hasNext(); a.put(c1.g(), Integer.valueOf(c1.a())))
        {
            c1 = (com.kik.android.c.c)iterator.next();
        }

    }
}
