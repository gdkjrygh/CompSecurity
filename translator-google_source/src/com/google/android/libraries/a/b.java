// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.a;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.Typeface;
import android.widget.TextView;
import java.io.File;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.android.libraries.a:
//            c, d, a

public final class b
{

    private static final Map a;
    private static final Object b = new Object();
    private static final Map c = new HashMap();
    private static final Set d = new HashSet();

    private static float a(int i)
    {
        char c1 = (char)i;
        Path path = new Path();
        (new Paint()).getTextPath(new char[] {
            c1
        }, 0, 1, 0.0F, 0.0F, path);
        return (new PathMeasure(path, false)).getLength();
    }

    public static Typeface a(Context context, String s)
    {
        if (c.containsKey(s))
        {
            return (Typeface)c.get(s);
        }
        if (!d.contains(s))
        {
            File file = b(context, s);
            if (file.exists())
            {
                try
                {
                    context = Typeface.createFromFile(file);
                    c.put(s, context);
                }
                // Misplaced declaration of an exception variable
                catch (Context context)
                {
                    file.delete();
                    context = null;
                }
            } else
            {
                context = null;
            }
            d.add(s);
            return context;
        } else
        {
            return null;
        }
    }

    public static Typeface a(Context context, String s, d d1)
    {
        Object obj = null;
        if (c.containsKey(s))
        {
            return (Typeface)c.get(s);
        }
        d1 = b(context, s, d1);
        context = obj;
        if (d1 != null)
        {
            context = obj;
            if (d1.exists())
            {
                try
                {
                    context = Typeface.createFromFile(d1);
                }
                // Misplaced declaration of an exception variable
                catch (Context context)
                {
                    d1.delete();
                    context = obj;
                }
            }
        }
        c.put(s, context);
        return context;
    }

    public static a a(TextView textview)
    {
        return new c(textview);
    }

    private static File b(Context context, String s)
    {
        File file = context.getCacheDir();
        context = String.valueOf(s);
        s = String.valueOf(".ttf");
        if (s.length() != 0)
        {
            context = context.concat(s);
        } else
        {
            context = new String(context);
        }
        return new File(file, context);
    }

    private static File b(Context context, String s, d d1)
    {
        File file;
label0:
        {
            file = b(context, s);
            synchronized (b)
            {
                if (!file.exists())
                {
                    break label0;
                }
            }
            return file;
        }
        Integer integer = (Integer)a.get(s);
        if (integer != null)
        {
            break MISSING_BLOCK_LABEL_46;
        }
        context;
        JVM INSTR monitorexit ;
        return null;
        if (a(integer.intValue()) == a(0x10ffff))
        {
            break MISSING_BLOCK_LABEL_104;
        }
        s = String.valueOf(s);
        if (s.length() == 0)
        {
            break MISSING_BLOCK_LABEL_86;
        }
        "Font supported on device".concat(s);
_L1:
        context;
        JVM INSTR monitorexit ;
        return null;
        new String("Font supported on device");
          goto _L1
        s;
        context;
        JVM INSTR monitorexit ;
        return null;
        String s1 = String.valueOf("https://www.gstatic.com/translate/fonts/");
        String s2 = String.valueOf(".ttf");
        d1.a((new StringBuilder(String.valueOf(s1).length() + 0 + String.valueOf(s).length() + String.valueOf(s2).length())).append(s1).append(s).append(s2).toString(), file);
        context;
        JVM INSTR monitorexit ;
        return file;
        s;
        context;
        JVM INSTR monitorexit ;
        throw s;
    }

    static 
    {
        a = new HashMap();
        a.put("hy", Integer.valueOf(1407));
        a.put("hi", Integer.valueOf(2332));
        a.put("mr", Integer.valueOf(2332));
        a.put("ne", Integer.valueOf(2332));
        a.put("kn", Integer.valueOf(3240));
        a.put("km", Integer.valueOf(6032));
        a.put("ta", Integer.valueOf(2975));
        a.put("te", Integer.valueOf(3095));
        a.put("ka", Integer.valueOf(4304));
        a.put("iw", Integer.valueOf(1505));
        a.put("ar", Integer.valueOf(1605));
        a.put("bn", Integer.valueOf(2441));
        a.put("lo", Integer.valueOf(3737));
        a.put("gu", Integer.valueOf(2734));
        a.put("pa", Integer.valueOf(2591));
        a.put("ml", Integer.valueOf(3338));
        a.put("my", Integer.valueOf(4138));
        a.put("si", Integer.valueOf(3464));
    }
}
