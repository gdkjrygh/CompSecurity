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
//            df, dh, bh, aq, 
//            cy, y

class i extends df
{
    public static interface a
    {

        public abstract aq ld();
    }


    private static final String ID;
    private static final String URL;
    private static final String aej;
    private static final String aek;
    static final String ael;
    private static final Set aem = new HashSet();
    private final a aen;
    private final Context mContext;

    public i(Context context)
    {
        this(context, new a(context) {

            final Context qr;

            public aq ld()
            {
                return com.google.android.gms.tagmanager.y.K(qr);
            }

            
            {
                qr = context;
                super();
            }
        });
    }

    i(Context context, a a1)
    {
        super(ID, new String[] {
            URL
        });
        aen = a1;
        mContext = context;
    }

    private boolean bB(String s)
    {
        boolean flag = true;
        this;
        JVM INSTR monitorenter ;
        boolean flag1 = bD(s);
        if (!flag1) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return flag;
_L2:
        if (bC(s))
        {
            aem.add(s);
            continue; /* Loop/switch isn't completed */
        }
        break MISSING_BLOCK_LABEL_44;
        s;
        throw s;
        flag = false;
        if (true) goto _L1; else goto _L3
_L3:
    }

    boolean bC(String s)
    {
        return mContext.getSharedPreferences(ael, 0).contains(s);
    }

    boolean bD(String s)
    {
        return aem.contains(s);
    }

    public void y(Map map)
    {
        String s;
        if (map.get(aek) != null)
        {
            s = dh.j((com.google.android.gms.internal.d.a)map.get(aek));
        } else
        {
            s = null;
        }
        if (s == null || !bB(s)) goto _L2; else goto _L1
_L1:
        return;
_L2:
        android.net.Uri.Builder builder = Uri.parse(dh.j((com.google.android.gms.internal.d.a)map.get(URL))).buildUpon();
        map = (com.google.android.gms.internal.d.a)map.get(aej);
        if (map != null)
        {
            map = ((Map) (dh.o(map)));
            if (!(map instanceof List))
            {
                bh.A((new StringBuilder()).append("ArbitraryPixel: additional params not a list: not sending partial hit: ").append(builder.build().toString()).toString());
                return;
            }
            for (map = ((List)map).iterator(); map.hasNext();)
            {
                Object obj = map.next();
                if (!(obj instanceof Map))
                {
                    bh.A((new StringBuilder()).append("ArbitraryPixel: additional params contains non-map: not sending partial hit: ").append(builder.build().toString()).toString());
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
        aen.ld().bR(map);
        bh.C((new StringBuilder()).append("ArbitraryPixel: url = ").append(map).toString());
        if (s == null) goto _L1; else goto _L3
_L3:
        com/google/android/gms/tagmanager/i;
        JVM INSTR monitorenter ;
        aem.add(s);
        com.google.android.gms.tagmanager.cy.a(mContext, ael, s, "true");
        com/google/android/gms/tagmanager/i;
        JVM INSTR monitorexit ;
        return;
        map;
        com/google/android/gms/tagmanager/i;
        JVM INSTR monitorexit ;
        throw map;
    }

    static 
    {
        ID = com.google.android.gms.internal.a.ap.toString();
        URL = b.eo.toString();
        aej = b.aX.toString();
        aek = b.en.toString();
        ael = (new StringBuilder()).append("gtm_").append(ID).append("_unrepeatable").toString();
    }
}
