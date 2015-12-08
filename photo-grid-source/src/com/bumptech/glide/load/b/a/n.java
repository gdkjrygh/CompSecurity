// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bumptech.glide.load.b.a;

import android.graphics.Bitmap;
import com.bumptech.glide.i.h;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.Set;
import java.util.TreeMap;

// Referenced classes of package com.bumptech.glide.load.b.a:
//            l, q, g, o, 
//            p

public final class n
    implements l
{

    private static final android.graphics.Bitmap.Config a[];
    private static final android.graphics.Bitmap.Config b[];
    private static final android.graphics.Bitmap.Config c[];
    private static final android.graphics.Bitmap.Config d[];
    private final q e = new q();
    private final g f = new g();
    private final Map g = new HashMap();

    public n()
    {
    }

    static String a(int i, android.graphics.Bitmap.Config config)
    {
        return b(i, config);
    }

    private NavigableMap a(android.graphics.Bitmap.Config config)
    {
        NavigableMap navigablemap = (NavigableMap)g.get(config);
        Object obj = navigablemap;
        if (navigablemap == null)
        {
            obj = new TreeMap();
            g.put(config, obj);
        }
        return ((NavigableMap) (obj));
    }

    private void a(Integer integer, android.graphics.Bitmap.Config config)
    {
        config = a(config);
        Integer integer1 = (Integer)config.get(integer);
        if (integer1.intValue() == 1)
        {
            config.remove(integer);
            return;
        } else
        {
            config.put(integer, Integer.valueOf(integer1.intValue() - 1));
            return;
        }
    }

    private static String b(int i, android.graphics.Bitmap.Config config)
    {
        return (new StringBuilder("[")).append(i).append("](").append(config).append(")").toString();
    }

    public final Bitmap a()
    {
        Bitmap bitmap = (Bitmap)f.a();
        if (bitmap != null)
        {
            a(Integer.valueOf(h.a(bitmap)), bitmap.getConfig());
        }
        return bitmap;
    }

    public final Bitmap a(int i, int j, android.graphics.Bitmap.Config config)
    {
        p p1;
        int k;
        int i1;
        k = 0;
        i1 = h.a(i, j, config);
        p1 = e.a(i1, config);
        o.a[config.ordinal()];
        JVM INSTR tableswitch 1 4: default 60
    //                   1 231
    //                   2 239
    //                   3 247
    //                   4 255;
           goto _L1 _L2 _L3 _L4 _L5
_L1:
        Object obj = {
            config
        };
_L9:
        int j1 = obj.length;
_L11:
        if (k >= j1) goto _L7; else goto _L6
_L6:
        android.graphics.Bitmap.Config config1;
        Integer integer;
        config1 = obj[k];
        integer = (Integer)a(config1).ceilingKey(Integer.valueOf(i1));
        if (integer == null || integer.intValue() > i1 * 8)
        {
            break MISSING_BLOCK_LABEL_278;
        }
        if (integer.intValue() != i1 || (config1 != null ? !config1.equals(config) : config != null)) goto _L8; else goto _L7
_L8:
        e.a(p1);
        config = e.a(integer.intValue(), config1);
_L10:
        obj = (Bitmap)f.a(config);
        if (obj != null)
        {
            a(Integer.valueOf(h.a(((Bitmap) (obj)))), ((Bitmap) (obj)).getConfig());
            if (((Bitmap) (obj)).getConfig() != null)
            {
                config = ((Bitmap) (obj)).getConfig();
            } else
            {
                config = android.graphics.Bitmap.Config.ARGB_8888;
            }
            ((Bitmap) (obj)).reconfigure(i, j, config);
        }
        return ((Bitmap) (obj));
_L2:
        obj = a;
          goto _L9
_L3:
        obj = b;
          goto _L9
_L4:
        obj = c;
          goto _L9
_L5:
        obj = d;
          goto _L9
_L7:
        config = p1;
          goto _L10
        k++;
          goto _L11
    }

    public final void a(Bitmap bitmap)
    {
        int i = h.a(bitmap);
        p p1 = e.a(i, bitmap.getConfig());
        f.a(p1, bitmap);
        bitmap = a(bitmap.getConfig());
        Integer integer = (Integer)bitmap.get(Integer.valueOf(p.a(p1)));
        int j = p.a(p1);
        if (integer == null)
        {
            i = 1;
        } else
        {
            i = integer.intValue() + 1;
        }
        bitmap.put(Integer.valueOf(j), Integer.valueOf(i));
    }

    public final String b(int i, int j, android.graphics.Bitmap.Config config)
    {
        return b(h.a(i, j, config), config);
    }

    public final String b(Bitmap bitmap)
    {
        return b(h.a(bitmap), bitmap.getConfig());
    }

    public final int c(Bitmap bitmap)
    {
        return h.a(bitmap);
    }

    public final String toString()
    {
        StringBuilder stringbuilder = (new StringBuilder("SizeConfigStrategy{groupedMap=")).append(f).append(", sortedSizes=(");
        java.util.Map.Entry entry;
        for (Iterator iterator = g.entrySet().iterator(); iterator.hasNext(); stringbuilder.append(entry.getKey()).append('[').append(entry.getValue()).append("], "))
        {
            entry = (java.util.Map.Entry)iterator.next();
        }

        if (!g.isEmpty())
        {
            stringbuilder.replace(stringbuilder.length() - 2, stringbuilder.length(), "");
        }
        return stringbuilder.append(")}").toString();
    }

    static 
    {
        a = (new android.graphics.Bitmap.Config[] {
            android.graphics.Bitmap.Config.ARGB_8888, null
        });
        b = (new android.graphics.Bitmap.Config[] {
            android.graphics.Bitmap.Config.RGB_565
        });
        c = (new android.graphics.Bitmap.Config[] {
            android.graphics.Bitmap.Config.ARGB_4444
        });
        d = (new android.graphics.Bitmap.Config[] {
            android.graphics.Bitmap.Config.ALPHA_8
        });
    }
}
