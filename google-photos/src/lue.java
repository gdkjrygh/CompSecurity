// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

class lue extends lqx
{

    private static final String b;
    private static final String c;
    private static final String d;
    private static final String e;
    private static String f;
    private static final Set g = new HashSet();
    private final lug h;
    private final Context i;

    public lue(Context context)
    {
        this(context, ((lug) (new luf(context))));
    }

    private lue(Context context, lug lug1)
    {
        super(b, new String[] {
            c
        });
        h = lug1;
        i = context;
    }

    private boolean a(String s)
    {
        boolean flag = true;
        this;
        JVM INSTR monitorenter ;
        boolean flag1 = g.contains(s);
        if (!flag1) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return flag;
_L2:
        if (i.getSharedPreferences(f, 0).contains(s))
        {
            g.add(s);
            continue; /* Loop/switch isn't completed */
        }
        break MISSING_BLOCK_LABEL_60;
        s;
        throw s;
        flag = false;
        if (true) goto _L1; else goto _L3
_L3:
    }

    public final void b(Map map)
    {
        String s;
        if (map.get(e) != null)
        {
            s = ltw.a((ksp)map.get(e));
        } else
        {
            s = null;
        }
        if (s == null || !a(s)) goto _L2; else goto _L1
_L1:
        return;
_L2:
        android.net.Uri.Builder builder = Uri.parse(ltw.a((ksp)map.get(c))).buildUpon();
        map = (ksp)map.get(d);
        if (map != null)
        {
            map = ((Map) (ltw.e(map)));
            if (!(map instanceof List))
            {
                lqh.a((new StringBuilder("ArbitraryPixel: additional params not a list: not sending partial hit: ")).append(builder.build().toString()).toString());
                return;
            }
            for (map = ((List)map).iterator(); map.hasNext();)
            {
                Object obj = map.next();
                if (!(obj instanceof Map))
                {
                    lqh.a((new StringBuilder("ArbitraryPixel: additional params contains non-map: not sending partial hit: ")).append(builder.build().toString()).toString());
                    return;
                }
                obj = ((Map)obj).entrySet().iterator();
                while (((Iterator) (obj)).hasNext()) 
                {
                    java.util.Map.Entry entry = (java.util.Map.Entry)((Iterator) (obj)).next();
                    builder.appendQueryParameter(entry.getKey().toString(), entry.getValue().toString());
                }
            }

        }
        map = builder.build().toString();
        h.a().a(map);
        lqh.d((new StringBuilder("ArbitraryPixel: url = ")).append(map).toString());
        if (s == null) goto _L1; else goto _L3
_L3:
        lue;
        JVM INSTR monitorenter ;
        g.add(s);
        b.a(i, f, s, "true");
        lue;
        JVM INSTR monitorexit ;
        return;
        map;
        lue;
        JVM INSTR monitorexit ;
        throw map;
    }

    static 
    {
        b = kse.O.toString();
        c = ksf.L.toString();
        d = ksf.b.toString();
        e = ksf.K.toString();
        f = (new StringBuilder("gtm_")).append(b).append("_unrepeatable").toString();
    }
}
