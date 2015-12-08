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

public final class boe extends bnc
    implements cpj
{

    private static DecimalFormat a;
    private final bnf b;
    private final String c;
    private final Uri d;

    public boe(bnf bnf1, String s)
    {
        this(bnf1, s, (byte)0);
    }

    private boe(bnf bnf1, String s, byte byte0)
    {
        super(bnf1);
        btl.a(s);
        b = bnf1;
        c = s;
        d = a(c);
    }

    public static Uri a(String s)
    {
        btl.a(s);
        android.net.Uri.Builder builder = new android.net.Uri.Builder();
        builder.scheme("uri");
        builder.authority("google-analytics.com");
        builder.path(s);
        return builder.build();
    }

    private static String a(double d1)
    {
        if (a == null)
        {
            a = new DecimalFormat("0.######");
        }
        return a.format(d1);
    }

    private static void a(Map map, String s, double d1)
    {
        if (d1 != 0.0D)
        {
            map.put(s, a(d1));
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

    private static Map b(cpc cpc1)
    {
        Object obj;
        HashMap hashmap;
        hashmap = new HashMap();
        obj = (clp)cpc1.a(clp);
        if (obj == null) goto _L2; else goto _L1
_L1:
        Iterator iterator2 = Collections.unmodifiableMap(((clp) (obj)).a).entrySet().iterator();
_L8:
        if (!iterator2.hasNext()) goto _L2; else goto _L3
_L3:
        java.util.Map.Entry entry4;
        entry4 = (java.util.Map.Entry)iterator2.next();
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
        Object obj1 = (clq)cpc1.a(clq);
        if (obj1 != null)
        {
            a(hashmap, "t", ((clq) (obj1)).a);
            a(hashmap, "cid", ((clq) (obj1)).b);
            a(hashmap, "uid", ((clq) (obj1)).c);
            a(hashmap, "sc", ((clq) (obj1)).f);
            a(hashmap, "sf", ((clq) (obj1)).h);
            a(hashmap, "ni", ((clq) (obj1)).g);
            a(hashmap, "adid", ((clq) (obj1)).d);
            a(hashmap, "ate", ((clq) (obj1)).e);
        }
        obj1 = (cog)cpc1.a(cog);
        if (obj1 != null)
        {
            a(hashmap, "cd", ((cog) (obj1)).a);
            a(hashmap, "a", ((cog) (obj1)).b);
            a(hashmap, "dr", ((cog) (obj1)).c);
        }
        obj1 = (coe)cpc1.a(coe);
        if (obj1 != null)
        {
            a(hashmap, "ec", ((coe) (obj1)).a);
            a(hashmap, "ea", ((coe) (obj1)).b);
            a(hashmap, "el", ((coe) (obj1)).c);
            a(hashmap, "ev", ((coe) (obj1)).d);
        }
        obj1 = (cob)cpc1.a(cob);
        if (obj1 != null)
        {
            a(hashmap, "cn", ((cob) (obj1)).a);
            a(hashmap, "cs", ((cob) (obj1)).b);
            a(hashmap, "cm", ((cob) (obj1)).c);
            a(hashmap, "ck", ((cob) (obj1)).d);
            a(hashmap, "cc", ((cob) (obj1)).e);
            a(hashmap, "ci", ((cob) (obj1)).f);
            a(hashmap, "anid", ((cob) (obj1)).g);
            a(hashmap, "gclid", ((cob) (obj1)).h);
            a(hashmap, "dclid", ((cob) (obj1)).i);
            a(hashmap, "aclid", ((cob) (obj1)).j);
        }
        obj1 = (cof)cpc1.a(cof);
        if (obj1 != null)
        {
            a(hashmap, "exd", ((cof) (obj1)).a);
            a(hashmap, "exf", ((cof) (obj1)).b);
        }
        obj1 = (coh)cpc1.a(coh);
        if (obj1 != null)
        {
            a(hashmap, "sn", ((coh) (obj1)).a);
            a(hashmap, "sa", ((coh) (obj1)).b);
            a(hashmap, "st", ((coh) (obj1)).c);
        }
        obj1 = (coi)cpc1.a(coi);
        if (obj1 != null)
        {
            a(hashmap, "utv", ((coi) (obj1)).a);
            a(hashmap, "utt", ((coi) (obj1)).b);
            a(hashmap, "utc", ((coi) (obj1)).c);
            a(hashmap, "utl", ((coi) (obj1)).d);
        }
        obj1 = (cln)cpc1.a(cln);
        if (obj1 != null)
        {
            obj1 = Collections.unmodifiableMap(((cln) (obj1)).a).entrySet().iterator();
            do
            {
                if (!((Iterator) (obj1)).hasNext())
                {
                    break;
                }
                java.util.Map.Entry entry = (java.util.Map.Entry)((Iterator) (obj1)).next();
                String s1 = bof.a("cd", ((Integer)entry.getKey()).intValue());
                if (!TextUtils.isEmpty(s1))
                {
                    hashmap.put(s1, entry.getValue());
                }
            } while (true);
        }
        obj1 = (clo)cpc1.a(clo);
        if (obj1 != null)
        {
            obj1 = Collections.unmodifiableMap(((clo) (obj1)).a).entrySet().iterator();
            do
            {
                if (!((Iterator) (obj1)).hasNext())
                {
                    break;
                }
                java.util.Map.Entry entry1 = (java.util.Map.Entry)((Iterator) (obj1)).next();
                String s2 = bof.a("cm", ((Integer)entry1.getKey()).intValue());
                if (!TextUtils.isEmpty(s2))
                {
                    hashmap.put(s2, a(((Double)entry1.getValue()).doubleValue()));
                }
            } while (true);
        }
        obj1 = (cod)cpc1.a(cod);
        if (obj1 != null)
        {
            if (((cod) (obj1)).d != null)
            {
                for (Iterator iterator = (new HashMap(null)).entrySet().iterator(); iterator.hasNext();)
                {
                    java.util.Map.Entry entry3 = (java.util.Map.Entry)iterator.next();
                    if (((String)entry3.getKey()).startsWith("&"))
                    {
                        hashmap.put(((String)entry3.getKey()).substring(1), entry3.getValue());
                    } else
                    {
                        hashmap.put(entry3.getKey(), entry3.getValue());
                    }
                }

            }
            Iterator iterator1 = Collections.unmodifiableList(((cod) (obj1)).b).iterator();
            for (int i = 1; iterator1.hasNext(); i++)
            {
                hashmap.putAll(((bmg)iterator1.next()).a(bof.a("promo", i)));
            }

            iterator1 = Collections.unmodifiableList(((cod) (obj1)).a).iterator();
            for (int j = 1; iterator1.hasNext(); j++)
            {
                hashmap.putAll(((bme)iterator1.next()).a(bof.a("pr", j)));
            }

            obj1 = ((cod) (obj1)).c.entrySet().iterator();
            for (int k = 1; ((Iterator) (obj1)).hasNext(); k++)
            {
                java.util.Map.Entry entry2 = (java.util.Map.Entry)((Iterator) (obj1)).next();
                Object obj2 = (List)entry2.getValue();
                String s3 = bof.a("il", k);
                obj2 = ((List) (obj2)).iterator();
                for (int l = 1; ((Iterator) (obj2)).hasNext(); l++)
                {
                    hashmap.putAll(((bme)((Iterator) (obj2)).next()).a((new StringBuilder()).append(s3).append(bof.a("pi", l)).toString()));
                }

                if (!TextUtils.isEmpty((CharSequence)entry2.getKey()))
                {
                    hashmap.put((new StringBuilder()).append(s3).append("nm").toString(), entry2.getKey());
                }
            }

        }
        obj1 = (coc)cpc1.a(coc);
        if (obj1 != null)
        {
            a(hashmap, "ul", ((coc) (obj1)).a);
            a(hashmap, "sd", ((coc) (obj1)).b);
            a(hashmap, "sr", ((coc) (obj1)).c, ((coc) (obj1)).d);
            a(hashmap, "vp", ((coc) (obj1)).e, ((coc) (obj1)).f);
        }
        cpc1 = (coa)cpc1.a(coa);
        if (cpc1 != null)
        {
            a(hashmap, "an", ((coa) (cpc1)).a);
            a(hashmap, "aid", ((coa) (cpc1)).c);
            a(hashmap, "aiid", ((coa) (cpc1)).d);
            a(hashmap, "av", ((coa) (cpc1)).b);
        }
        return hashmap;
        if (true) goto _L8; else goto _L7
_L7:
    }

    public final Uri a()
    {
        return d;
    }

    public final void a(cpc cpc1)
    {
        btl.a(cpc1);
        btl.b(cpc1.c, "Can't deliver not submitted measurement");
        btl.c("deliver should be called on worker thread");
        Object obj = cpc1.a();
        Object obj1 = (clq)((cpc) (obj)).b(clq);
        if (TextUtils.isEmpty(((clq) (obj1)).a))
        {
            super.f.a().a(b(((cpc) (obj))), "Ignoring measurement without type");
            return;
        }
        if (TextUtils.isEmpty(((clq) (obj1)).b))
        {
            super.f.a().a(b(((cpc) (obj))), "Ignoring measurement without client id");
            return;
        }
        boolean flag = b.d().d;
        double d1 = ((clq) (obj1)).h;
        if (bmz.a(d1, ((clq) (obj1)).b))
        {
            b("Sampling enabled. Hit sampled out. sampling rate", Double.valueOf(d1));
            return;
        }
        obj = b(((cpc) (obj)));
        ((Map) (obj)).put("v", "1");
        ((Map) (obj)).put("_v", bne.b);
        ((Map) (obj)).put("tid", c);
        if (b.d().c)
        {
            cpc1 = new StringBuilder();
            for (obj = ((Map) (obj)).entrySet().iterator(); ((Iterator) (obj)).hasNext(); cpc1.append((String)((java.util.Map.Entry) (obj1)).getValue()))
            {
                obj1 = (java.util.Map.Entry)((Iterator) (obj)).next();
                if (cpc1.length() != 0)
                {
                    cpc1.append(", ");
                }
                cpc1.append((String)((java.util.Map.Entry) (obj1)).getKey());
                cpc1.append("=");
            }

            c("Dry run is enabled. GoogleAnalytics would have sent", cpc1.toString());
            return;
        }
        HashMap hashmap = new HashMap();
        bmz.a(hashmap, "uid", ((clq) (obj1)).c);
        Object obj2 = (coa)cpc1.a(coa);
        if (obj2 != null)
        {
            bmz.a(hashmap, "an", ((coa) (obj2)).a);
            bmz.a(hashmap, "aid", ((coa) (obj2)).c);
            bmz.a(hashmap, "av", ((coa) (obj2)).b);
            bmz.a(hashmap, "aiid", ((coa) (obj2)).d);
        }
        obj2 = ((clq) (obj1)).b;
        String s = c;
        if (!TextUtils.isEmpty(((clq) (obj1)).d))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        obj1 = new bnh(((String) (obj2)), s, flag, 0L, hashmap);
        ((Map) (obj)).put("_s", String.valueOf(super.f.c().a(((bnh) (obj1)))));
        cpc1 = new bmj(super.f.a(), ((Map) (obj)), cpc1.d, true);
        super.f.c().a(cpc1);
    }
}
