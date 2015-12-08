// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bumptech.glide.load.engine.a;

import android.graphics.Bitmap;
import com.bumptech.glide.g.h;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.Set;
import java.util.TreeMap;

// Referenced classes of package com.bumptech.glide.load.engine.a:
//            g, e, h, b

public class i
    implements g
{
    static final class a
        implements com.bumptech.glide.load.engine.a.h
    {

        private final b a;
        private int b;
        private android.graphics.Bitmap.Config c;

        static int a(a a1)
        {
            return a1.b;
        }

        public void a()
        {
            a.a(this);
        }

        public void a(int j, android.graphics.Bitmap.Config config)
        {
            b = j;
            c = config;
        }

        public boolean equals(Object obj)
        {
            boolean flag;
            boolean flag1;
            flag1 = false;
            flag = flag1;
            if (!(obj instanceof a)) goto _L2; else goto _L1
_L1:
            obj = (a)obj;
            flag = flag1;
            if (b != ((a) (obj)).b) goto _L2; else goto _L3
_L3:
            if (c != null) goto _L5; else goto _L4
_L4:
            flag = flag1;
            if (((a) (obj)).c != null) goto _L2; else goto _L6
_L6:
            flag = true;
_L2:
            return flag;
_L5:
            flag = flag1;
            if (!c.equals(((a) (obj)).c)) goto _L2; else goto _L6
        }

        public int hashCode()
        {
            int k = b;
            int j;
            if (c != null)
            {
                j = c.hashCode();
            } else
            {
                j = 0;
            }
            return j + k * 31;
        }

        public String toString()
        {
            return i.a(b, c);
        }

        public a(b b1)
        {
            a = b1;
        }
    }

    static class b extends com.bumptech.glide.load.engine.a.b
    {

        protected a a()
        {
            return new a(this);
        }

        public a a(int j, android.graphics.Bitmap.Config config)
        {
            a a1 = (a)c();
            a1.a(j, config);
            return a1;
        }

        protected com.bumptech.glide.load.engine.a.h b()
        {
            return a();
        }

        b()
        {
        }
    }


    private static final android.graphics.Bitmap.Config a[];
    private static final android.graphics.Bitmap.Config b[];
    private static final android.graphics.Bitmap.Config c[];
    private static final android.graphics.Bitmap.Config d[];
    private final b e = new b();
    private final e f = new e();
    private final Map g = new HashMap();

    public i()
    {
    }

    private a a(a a1, int j, android.graphics.Bitmap.Config config)
    {
        android.graphics.Bitmap.Config aconfig[];
        int k;
        int l;
        aconfig = b(config);
        l = aconfig.length;
        k = 0;
_L10:
        a a2 = a1;
        if (k >= l) goto _L2; else goto _L1
_L1:
        android.graphics.Bitmap.Config config1;
        Integer integer;
        config1 = aconfig[k];
        integer = (Integer)a(config1).ceilingKey(Integer.valueOf(j));
        if (integer == null || integer.intValue() > j * 8) goto _L4; else goto _L3
_L3:
        if (integer.intValue() != j) goto _L6; else goto _L5
_L5:
        if (config1 != null) goto _L8; else goto _L7
_L7:
        a2 = a1;
        if (config == null) goto _L2; else goto _L6
_L6:
        e.a(a1);
        a2 = e.a(integer.intValue(), config1);
_L2:
        return a2;
_L8:
        a2 = a1;
        if (config1.equals(config)) goto _L2; else goto _L6
_L4:
        k++;
        if (true) goto _L10; else goto _L9
_L9:
    }

    static String a(int j, android.graphics.Bitmap.Config config)
    {
        return b(j, config);
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

    private static String b(int j, android.graphics.Bitmap.Config config)
    {
        return (new StringBuilder()).append("[").append(j).append("](").append(config).append(")").toString();
    }

    private static android.graphics.Bitmap.Config[] b(android.graphics.Bitmap.Config config)
    {
        static class _cls1
        {

            static final int a[];

            static 
            {
                a = new int[android.graphics.Bitmap.Config.values().length];
                try
                {
                    a[android.graphics.Bitmap.Config.ARGB_8888.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    a[android.graphics.Bitmap.Config.RGB_565.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[android.graphics.Bitmap.Config.ARGB_4444.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[android.graphics.Bitmap.Config.ALPHA_8.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (_cls1.a[config.ordinal()])
        {
        default:
            return (new android.graphics.Bitmap.Config[] {
                config
            });

        case 1: // '\001'
            return a;

        case 2: // '\002'
            return b;

        case 3: // '\003'
            return c;

        case 4: // '\004'
            return d;
        }
    }

    public Bitmap a()
    {
        Bitmap bitmap = (Bitmap)f.a();
        if (bitmap != null)
        {
            a(Integer.valueOf(h.a(bitmap)), bitmap.getConfig());
        }
        return bitmap;
    }

    public Bitmap a(int j, int k, android.graphics.Bitmap.Config config)
    {
        int l = h.a(j, k, config);
        config = a(e.a(l, config), l, config);
        Bitmap bitmap = (Bitmap)f.a(config);
        if (bitmap != null)
        {
            a(Integer.valueOf(h.a(bitmap)), bitmap.getConfig());
            if (bitmap.getConfig() != null)
            {
                config = bitmap.getConfig();
            } else
            {
                config = android.graphics.Bitmap.Config.ARGB_8888;
            }
            bitmap.reconfigure(j, k, config);
        }
        return bitmap;
    }

    public void a(Bitmap bitmap)
    {
        int j = h.a(bitmap);
        a a1 = e.a(j, bitmap.getConfig());
        f.a(a1, bitmap);
        bitmap = a(bitmap.getConfig());
        Integer integer = (Integer)bitmap.get(Integer.valueOf(a.a(a1)));
        int k = a.a(a1);
        if (integer == null)
        {
            j = 1;
        } else
        {
            j = integer.intValue() + 1;
        }
        bitmap.put(Integer.valueOf(k), Integer.valueOf(j));
    }

    public String b(int j, int k, android.graphics.Bitmap.Config config)
    {
        return b(h.a(j, k, config), config);
    }

    public String b(Bitmap bitmap)
    {
        return b(h.a(bitmap), bitmap.getConfig());
    }

    public int c(Bitmap bitmap)
    {
        return h.a(bitmap);
    }

    public String toString()
    {
        StringBuilder stringbuilder = (new StringBuilder()).append("SizeConfigStrategy{groupedMap=").append(f).append(", sortedSizes=(");
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
