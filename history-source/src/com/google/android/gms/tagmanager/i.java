// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import com.google.android.gms.internal.a;
import com.google.android.gms.internal.b;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.android.gms.tagmanager:
//            dg, di, bh, aq, 
//            cz, y

class i extends dg
{
    public static interface a
    {

        public abstract aq pf();
    }


    private static final String ID;
    private static final String URL;
    private static final String aqf;
    private static final String aqg;
    static final String aqh;
    private static final Set aqi = new HashSet();
    private final a aqj;
    private final Context mContext;

    public i(Context context)
    {
        this(context, new a(context) {

            final Context nf;

            public aq pf()
            {
                return y.X(nf);
            }

            
            {
                nf = context;
                super();
            }
        });
    }

    i(Context context, a a1)
    {
        super(ID, new String[] {
            URL
        });
        aqj = a1;
        mContext = context;
    }

    private boolean cl(String s)
    {
        boolean flag = true;
        this;
        JVM INSTR monitorenter ;
        boolean flag1 = cn(s);
        if (!flag1) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return flag;
_L2:
        if (cm(s))
        {
            aqi.add(s);
            continue; /* Loop/switch isn't completed */
        }
        break MISSING_BLOCK_LABEL_44;
        s;
        throw s;
        flag = false;
        if (true) goto _L1; else goto _L3
_L3:
    }

    public void D(Map map)
    {
        String s;
        if (map.get(aqg) != null)
        {
            s = di.j((com.google.android.gms.internal.d.a)map.get(aqg));
        } else
        {
            s = null;
        }
        if (s == null || !cl(s)) goto _L2; else goto _L1
_L1:
        return;
_L2:
        android.net.Uri.Builder builder = Uri.parse(di.j((com.google.android.gms.internal.d.a)map.get(URL))).buildUpon();
        map = (com.google.android.gms.internal.d.a)map.get(aqf);
        if (map != null)
        {
            map = ((Map) (di.o(map)));
            if (!(map instanceof List))
            {
                bh.T((new StringBuilder()).append("ArbitraryPixel: additional params not a list: not sending partial hit: ").append(builder.build().toString()).toString());
                return;
            }
            for (map = ((List)map).iterator(); map.hasNext();)
            {
                Object obj = map.next();
                if (!(obj instanceof Map))
                {
                    bh.T((new StringBuilder()).append("ArbitraryPixel: additional params contains non-map: not sending partial hit: ").append(builder.build().toString()).toString());
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
        aqj.pf().cB(map);
        bh.V((new StringBuilder()).append("ArbitraryPixel: url = ").append(map).toString());
        if (s == null) goto _L1; else goto _L3
_L3:
        com/google/android/gms/tagmanager/i;
        JVM INSTR monitorenter ;
        aqi.add(s);
        com.google.android.gms.tagmanager.cz.a(mContext, aqh, s, "true");
        com/google/android/gms/tagmanager/i;
        JVM INSTR monitorexit ;
        return;
        map;
        com/google/android/gms/tagmanager/i;
        JVM INSTR monitorexit ;
        throw map;
    }

    boolean cm(String s)
    {
        return mContext.getSharedPreferences(aqh, 0).contains(s);
    }

    boolean cn(String s)
    {
        return aqi.contains(s);
    }

    static 
    {
        ID = com.google.android.gms.internal.a.ay.toString();
        URL = b.eX.toString();
        aqf = b.bl.toString();
        aqg = b.eW.toString();
        aqh = (new StringBuilder()).append("gtm_").append(ID).append("_unrepeatable").toString();
    }
}
