// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.net.Uri;
import android.text.TextUtils;
import java.text.DecimalFormat;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class jqj extends jrj
    implements ljh
{

    private static DecimalFormat a;
    private final jrk b;
    private final String c;
    private final Uri e;

    public jqj(jrk jrk1, String s)
    {
        this(jrk1, s, true, false);
    }

    private jqj(jrk jrk1, String s, boolean flag, boolean flag1)
    {
        super(jrk1);
        b.o(s);
        b = jrk1;
        c = s;
        e = a(c);
    }

    public static Uri a(String s)
    {
        b.o(s);
        android.net.Uri.Builder builder = new android.net.Uri.Builder();
        builder.scheme("uri");
        builder.authority("google-analytics.com");
        builder.path(s);
        return builder.build();
    }

    private static String a(double d)
    {
        if (a == null)
        {
            a = new DecimalFormat("0.######");
        }
        return a.format(d);
    }

    private static void a(Map map, String s, double d)
    {
        if (d != 0.0D)
        {
            map.put(s, a(d));
        }
    }

    private static void a(Map map, String s, int i, int j)
    {
        if (i > 0 && j > 0)
        {
            map.put(s, (new StringBuilder()).append(i).append("x").append(j).toString());
        }
    }

    private static void a(Map map, String s, String s1)
    {
        if (!TextUtils.isEmpty(s1))
        {
            map.put(s, s1);
        }
    }

    private static void a(Map map, String s, boolean flag)
    {
        if (flag)
        {
            map.put(s, "1");
        }
    }

    private static Map b(liy liy1)
    {
        Object obj;
        HashMap hashmap;
        hashmap = new HashMap();
        obj = (jqy)liy1.a(jqy);
        if (obj == null) goto _L2; else goto _L1
_L1:
        Iterator iterator = Collections.unmodifiableMap(((jqy) (obj)).a).entrySet().iterator();
_L8:
        if (!iterator.hasNext()) goto _L2; else goto _L3
_L3:
        java.util.Map.Entry entry4;
        entry4 = (java.util.Map.Entry)iterator.next();
        obj = entry4.getValue();
        if (obj != null) goto _L5; else goto _L4
_L4:
        obj = null;
_L6:
        if (obj != null)
        {
            hashmap.put(entry4.getKey(), obj);
        }
        continue; /* Loop/switch isn't completed */
_L5:
        if (obj instanceof String)
        {
            String s = (String)obj;
            obj = s;
            if (TextUtils.isEmpty(s))
            {
                obj = null;
            }
        } else
        if (obj instanceof Double)
        {
            obj = (Double)obj;
            if (((Double) (obj)).doubleValue() != 0.0D)
            {
                obj = a(((Double) (obj)).doubleValue());
            } else
            {
                obj = null;
            }
        } else
        if (obj instanceof Boolean)
        {
            if (obj != Boolean.FALSE)
            {
                obj = "1";
            } else
            {
                obj = null;
            }
        } else
        {
            obj = String.valueOf(obj);
        }
        if (true) goto _L6; else goto _L2
_L2:
        Object obj1 = (jqz)liy1.a(jqz);
        if (obj1 != null)
        {
            a(hashmap, "t", ((jqz) (obj1)).a);
            a(hashmap, "cid", ((jqz) (obj1)).b);
            a(hashmap, "uid", ((jqz) (obj1)).c);
            a(hashmap, "sc", ((jqz) (obj1)).f);
            a(hashmap, "sf", ((jqz) (obj1)).h);
            a(hashmap, "ni", ((jqz) (obj1)).g);
            a(hashmap, "adid", ((jqz) (obj1)).d);
            a(hashmap, "ate", ((jqz) (obj1)).e);
        }
        obj1 = (ljq)liy1.a(ljq);
        if (obj1 != null)
        {
            a(hashmap, "cd", ((ljq) (obj1)).a);
            a(hashmap, "a", ((ljq) (obj1)).b);
            a(hashmap, "dr", ((ljq) (obj1)).e);
        }
        obj1 = (ljo)liy1.a(ljo);
        if (obj1 != null)
        {
            a(hashmap, "ec", ((ljo) (obj1)).a);
            a(hashmap, "ea", ((ljo) (obj1)).b);
            a(hashmap, "el", ((ljo) (obj1)).c);
            a(hashmap, "ev", ((ljo) (obj1)).d);
        }
        obj1 = (ljl)liy1.a(ljl);
        if (obj1 != null)
        {
            a(hashmap, "cn", ((ljl) (obj1)).a);
            a(hashmap, "cs", ((ljl) (obj1)).b);
            a(hashmap, "cm", ((ljl) (obj1)).c);
            a(hashmap, "ck", ((ljl) (obj1)).d);
            a(hashmap, "cc", ((ljl) (obj1)).e);
            a(hashmap, "ci", ((ljl) (obj1)).f);
            a(hashmap, "anid", ((ljl) (obj1)).g);
            a(hashmap, "gclid", ((ljl) (obj1)).h);
            a(hashmap, "dclid", ((ljl) (obj1)).i);
            a(hashmap, "aclid", ((ljl) (obj1)).j);
        }
        obj1 = (ljp)liy1.a(ljp);
        if (obj1 != null)
        {
            a(hashmap, "exd", ((ljp) (obj1)).a);
            a(hashmap, "exf", ((ljp) (obj1)).b);
        }
        obj1 = (ljr)liy1.a(ljr);
        if (obj1 != null)
        {
            a(hashmap, "sn", ((ljr) (obj1)).a);
            a(hashmap, "sa", ((ljr) (obj1)).b);
            a(hashmap, "st", ((ljr) (obj1)).c);
        }
        obj1 = (ljs)liy1.a(ljs);
        if (obj1 != null)
        {
            a(hashmap, "utv", ((ljs) (obj1)).a);
            a(hashmap, "utt", ((ljs) (obj1)).b);
            a(hashmap, "utc", ((ljs) (obj1)).c);
            a(hashmap, "utl", ((ljs) (obj1)).d);
        }
        obj1 = (jqw)liy1.a(jqw);
        if (obj1 != null)
        {
            obj1 = Collections.unmodifiableMap(((jqw) (obj1)).a).entrySet().iterator();
            do
            {
                if (!((Iterator) (obj1)).hasNext())
                {
                    break;
                }
                java.util.Map.Entry entry = (java.util.Map.Entry)((Iterator) (obj1)).next();
                String s1 = b.a("cd", ((Integer)entry.getKey()).intValue());
                if (!TextUtils.isEmpty(s1))
                {
                    hashmap.put(s1, entry.getValue());
                }
            } while (true);
        }
        obj1 = (jqx)liy1.a(jqx);
        if (obj1 != null)
        {
            obj1 = Collections.unmodifiableMap(((jqx) (obj1)).a).entrySet().iterator();
            do
            {
                if (!((Iterator) (obj1)).hasNext())
                {
                    break;
                }
                java.util.Map.Entry entry1 = (java.util.Map.Entry)((Iterator) (obj1)).next();
                String s2 = b.a("cm", ((Integer)entry1.getKey()).intValue());
                if (!TextUtils.isEmpty(s2))
                {
                    hashmap.put(s2, a(((Double)entry1.getValue()).doubleValue()));
                }
            } while (true);
        }
        obj1 = (ljn)liy1.a(ljn);
        if (obj1 != null)
        {
            Object obj2 = ((ljn) (obj1)).d;
            if (obj2 != null)
            {
                for (obj2 = ((jrb) (obj2)).a().entrySet().iterator(); ((Iterator) (obj2)).hasNext();)
                {
                    java.util.Map.Entry entry3 = (java.util.Map.Entry)((Iterator) (obj2)).next();
                    if (((String)entry3.getKey()).startsWith("&"))
                    {
                        hashmap.put(((String)entry3.getKey()).substring(1), entry3.getValue());
                    } else
                    {
                        hashmap.put(entry3.getKey(), entry3.getValue());
                    }
                }

            }
            obj2 = Collections.unmodifiableList(((ljn) (obj1)).b).iterator();
            for (int i = 1; ((Iterator) (obj2)).hasNext(); i++)
            {
                hashmap.putAll(((jrc)((Iterator) (obj2)).next()).a(b.a("promo", i)));
            }

            obj2 = Collections.unmodifiableList(((ljn) (obj1)).a).iterator();
            for (int j = 1; ((Iterator) (obj2)).hasNext(); j++)
            {
                hashmap.putAll(((jra)((Iterator) (obj2)).next()).a(b.a("pr", j)));
            }

            obj1 = ((ljn) (obj1)).c.entrySet().iterator();
            for (int k = 1; ((Iterator) (obj1)).hasNext(); k++)
            {
                java.util.Map.Entry entry2 = (java.util.Map.Entry)((Iterator) (obj1)).next();
                Object obj3 = (List)entry2.getValue();
                String s3 = b.a("il", k);
                obj3 = ((List) (obj3)).iterator();
                for (int l = 1; ((Iterator) (obj3)).hasNext(); l++)
                {
                    hashmap.putAll(((jra)((Iterator) (obj3)).next()).a((new StringBuilder()).append(s3).append(b.a("pi", l)).toString()));
                }

                if (!TextUtils.isEmpty((CharSequence)entry2.getKey()))
                {
                    hashmap.put((new StringBuilder()).append(s3).append("nm").toString(), entry2.getKey());
                }
            }

        }
        obj1 = (ljm)liy1.a(ljm);
        if (obj1 != null)
        {
            a(hashmap, "ul", ((ljm) (obj1)).a);
            a(hashmap, "sd", ((ljm) (obj1)).b);
            a(hashmap, "sr", ((ljm) (obj1)).c, ((ljm) (obj1)).d);
            a(hashmap, "vp", ((ljm) (obj1)).e, ((ljm) (obj1)).f);
        }
        liy1 = (ljk)liy1.a(ljk);
        if (liy1 != null)
        {
            a(hashmap, "an", ((ljk) (liy1)).a);
            a(hashmap, "aid", ((ljk) (liy1)).c);
            a(hashmap, "aiid", ((ljk) (liy1)).d);
            a(hashmap, "av", ((ljk) (liy1)).b);
        }
        return hashmap;
        if (true) goto _L8; else goto _L7
_L7:
    }

    public final Uri a()
    {
        return e;
    }

    public final void a(liy liy1)
    {
        b.d(liy1);
        b.b(liy1.c, "Can't deliver not submitted measurement");
        b.q("deliver should be called on worker thread");
        Object obj = liy1.a();
        Object obj1 = (jqz)((liy) (obj)).b(jqz);
        if (TextUtils.isEmpty(((jqz) (obj1)).a))
        {
            super.d.a().a(b(((liy) (obj))), "Ignoring measurement without type");
        } else
        {
            if (TextUtils.isEmpty(((jqz) (obj1)).b))
            {
                super.d.a().a(b(((liy) (obj))), "Ignoring measurement without client id");
                return;
            }
            if (!b.d().e)
            {
                double d = ((jqz) (obj1)).h;
                if (jtk.a(d, ((jqz) (obj1)).b))
                {
                    b("Sampling enabled. Hit sampled out. sampling rate", Double.valueOf(d));
                    return;
                }
                obj = b(((liy) (obj)));
                ((Map) (obj)).put("v", "1");
                ((Map) (obj)).put("_v", jsx.b);
                ((Map) (obj)).put("tid", c);
                if (b.d().d)
                {
                    liy1 = new StringBuilder();
                    for (obj = ((Map) (obj)).entrySet().iterator(); ((Iterator) (obj)).hasNext(); liy1.append((String)((java.util.Map.Entry) (obj1)).getValue()))
                    {
                        obj1 = (java.util.Map.Entry)((Iterator) (obj)).next();
                        if (liy1.length() != 0)
                        {
                            liy1.append(", ");
                        }
                        liy1.append((String)((java.util.Map.Entry) (obj1)).getKey());
                        liy1.append("=");
                    }

                    c("Dry run is enabled. GoogleAnalytics would have sent", liy1.toString());
                    return;
                }
                HashMap hashmap = new HashMap();
                jtk.a(hashmap, "uid", ((jqz) (obj1)).c);
                Object obj2 = (ljk)liy1.a(ljk);
                if (obj2 != null)
                {
                    jtk.a(hashmap, "an", ((ljk) (obj2)).a);
                    jtk.a(hashmap, "aid", ((ljk) (obj2)).c);
                    jtk.a(hashmap, "av", ((ljk) (obj2)).b);
                    jtk.a(hashmap, "aiid", ((ljk) (obj2)).d);
                }
                obj2 = ((jqz) (obj1)).b;
                String s = c;
                boolean flag;
                if (!TextUtils.isEmpty(((jqz) (obj1)).d))
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                obj1 = new jrn(0L, ((String) (obj2)), s, flag, 0L, hashmap);
                ((Map) (obj)).put("_s", String.valueOf(super.d.c().a(((jrn) (obj1)))));
                liy1 = new jsn(super.d.a(), ((Map) (obj)), liy1.d, true);
                super.d.c().a(liy1);
                return;
            }
        }
    }
}
