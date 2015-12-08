// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.Bitmap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.Set;
import java.util.TreeMap;

public final class aqz
    implements aqx
{

    private static final android.graphics.Bitmap.Config a[];
    private static final android.graphics.Bitmap.Config b[];
    private static final android.graphics.Bitmap.Config c[];
    private static final android.graphics.Bitmap.Config d[];
    private final arc e = new arc();
    private final aqq f = new aqq();
    private final Map g = new HashMap();

    public aqz()
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

    private void a(Integer integer, Bitmap bitmap)
    {
        Object obj = a(bitmap.getConfig());
        Object obj1 = (Integer)((NavigableMap) (obj)).get(integer);
        if (obj1 == null)
        {
            obj = String.valueOf("Tried to decrement empty size, size: ");
            integer = String.valueOf(integer);
            bitmap = String.valueOf(b(bitmap));
            obj1 = String.valueOf(this);
            throw new NullPointerException((new StringBuilder(String.valueOf(obj).length() + 19 + String.valueOf(integer).length() + String.valueOf(bitmap).length() + String.valueOf(obj1).length())).append(((String) (obj))).append(integer).append(", removed: ").append(bitmap).append(", this: ").append(((String) (obj1))).toString());
        }
        if (((Integer) (obj1)).intValue() == 1)
        {
            ((NavigableMap) (obj)).remove(integer);
            return;
        } else
        {
            ((NavigableMap) (obj)).put(integer, Integer.valueOf(((Integer) (obj1)).intValue() - 1));
            return;
        }
    }

    private static String b(int i, android.graphics.Bitmap.Config config)
    {
        config = String.valueOf(config);
        return (new StringBuilder(String.valueOf(config).length() + 15)).append("[").append(i).append("](").append(config).append(")").toString();
    }

    public final Bitmap a()
    {
        Bitmap bitmap = (Bitmap)f.a();
        if (bitmap != null)
        {
            a(Integer.valueOf(bag.a(bitmap)), bitmap);
        }
        return bitmap;
    }

    public final Bitmap a(int i, int j, android.graphics.Bitmap.Config config)
    {
        arb arb1;
        int k;
        int l;
        k = 0;
        l = bag.a(i, j, config);
        arb1 = e.a(l, config);
        ara.a[config.ordinal()];
        JVM INSTR tableswitch 1 4: default 60
    //                   1 226
    //                   2 234
    //                   3 242
    //                   4 250;
           goto _L1 _L2 _L3 _L4 _L5
_L1:
        Object obj = {
            config
        };
_L9:
        int i1 = obj.length;
_L11:
        if (k >= i1) goto _L7; else goto _L6
_L6:
        android.graphics.Bitmap.Config config1;
        Integer integer;
        config1 = obj[k];
        integer = (Integer)a(config1).ceilingKey(Integer.valueOf(l));
        if (integer == null || integer.intValue() > l << 3)
        {
            break MISSING_BLOCK_LABEL_273;
        }
        if (integer.intValue() != l || (config1 != null ? !config1.equals(config) : config != null)) goto _L8; else goto _L7
_L8:
        e.a(arb1);
        config = e.a(integer.intValue(), config1);
_L10:
        obj = (Bitmap)f.a(config);
        if (obj != null)
        {
            a(Integer.valueOf(((arb) (config)).a), ((Bitmap) (obj)));
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
        config = arb1;
          goto _L10
        k++;
          goto _L11
    }

    public final void a(Bitmap bitmap)
    {
        int i = bag.a(bitmap);
        arb arb1 = e.a(i, bitmap.getConfig());
        f.a(arb1, bitmap);
        bitmap = a(bitmap.getConfig());
        Integer integer = (Integer)bitmap.get(Integer.valueOf(arb1.a));
        int j = arb1.a;
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
        return b(bag.a(i, j, config), config);
    }

    public final String b(Bitmap bitmap)
    {
        return b(bag.a(bitmap), bitmap.getConfig());
    }

    public final int c(Bitmap bitmap)
    {
        return bag.a(bitmap);
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
