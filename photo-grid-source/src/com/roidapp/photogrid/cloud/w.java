// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.cloud;

import android.content.Context;
import android.content.SharedPreferences;
import com.roidapp.baselib.c.n;
import com.roidapp.baselib.c.t;
import com.roidapp.baselib.d.a;
import com.roidapp.baselib.e.r;
import com.roidapp.baselib.e.s;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.AbstractExecutorService;
import org.json.JSONException;
import org.json.JSONObject;

public final class w
    implements s
{

    private static volatile boolean a = false;
    private static volatile boolean b = false;
    private static w c;
    private static Set d = null;
    private static final String k[] = {
        "en", "ar", "de", "es", "fr", "ja", "ko", "ru", "th", "tr", 
        "zh", "zh-rCN", "zh-rTW", "hi", "in", "it", "ms", "pt", "uk", "vi", 
        "fa", "pl", "az", "da", "no", "iw", "nl", "ro", "el", "cs", 
        "hu", "bg", "sv", "sr"
    };
    private Map e;
    private String f;
    private File g;
    private r h;
    private int i;
    private SharedPreferences j;

    private w(Context context, int l)
    {
        j = context.getSharedPreferences("cloudlib_prefs", 0);
        i = l;
        String s1 = a(l);
        if ("en".equals(s1))
        {
            s1 = "strings2";
        } else
        if ("zh".equals(s1))
        {
            StringBuilder stringbuilder = (new StringBuilder("strings2-")).append(s1);
            if (Locale.getDefault().getCountry().equalsIgnoreCase("CN"))
            {
                s1 = "-rCN";
            } else
            {
                s1 = "-rTW";
            }
            s1 = stringbuilder.append(s1).toString();
        } else
        {
            s1 = (new StringBuilder("strings2-")).append(s1).toString();
        }
        f = s1;
        g = context.getFileStreamPath(f);
        if (!b)
        {
            b = true;
            e = null;
            if (g != null && g.exists())
            {
                if ((context = com.roidapp.baselib.d.a.a(g, "utf-8")) != null)
                {
                    e = new TreeMap();
                    try
                    {
                        a(e, context);
                        return;
                    }
                    // Misplaced declaration of an exception variable
                    catch (Context context)
                    {
                        context.printStackTrace();
                    }
                    e = null;
                    return;
                }
            }
        }
    }

    public static w a(Context context, int l)
    {
        if (c != null) goto _L2; else goto _L1
_L1:
        c = new w(context, l);
_L4:
        return c;
_L2:
        if (c.i != l)
        {
            w w1 = c;
            if (w1.e != null)
            {
                w1.e.clear();
            }
            if (w1.h != null)
            {
                w1.h.f();
            }
            w1.e = null;
            w1.h = null;
            w1.f = null;
            w1.g = null;
            c = new w(context, l);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public static String a(int l)
    {
        l;
        JVM INSTR tableswitch -1 32: default 152
    //                   -1 256
    //                   0 157
    //                   1 160
    //                   2 163
    //                   3 166
    //                   4 169
    //                   5 172
    //                   6 175
    //                   7 178
    //                   8 181
    //                   9 184
    //                   10 187
    //                   11 190
    //                   12 193
    //                   13 196
    //                   14 199
    //                   15 202
    //                   16 205
    //                   17 208
    //                   18 211
    //                   19 214
    //                   20 217
    //                   21 220
    //                   22 223
    //                   23 226
    //                   24 229
    //                   25 232
    //                   26 235
    //                   27 238
    //                   28 241
    //                   29 244
    //                   30 247
    //                   31 250
    //                   32 253;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13 _L14 _L15 _L16 _L17 _L18 _L19 _L20 _L21 _L22 _L23 _L24 _L25 _L26 _L27 _L28 _L29 _L30 _L31 _L32 _L33 _L34 _L35
_L1:
        String s1 = "en";
_L37:
        return s1;
_L3:
        return "en";
_L4:
        return "de";
_L5:
        return "fr";
_L6:
        return "ja";
_L7:
        return "ko";
_L8:
        return "th";
_L9:
        return "zh-rCN";
_L10:
        return "zh-rTW";
_L11:
        return "es";
_L12:
        return "ar";
_L13:
        return "tr";
_L14:
        return "ru";
_L15:
        return "hi";
_L16:
        return "in";
_L17:
        return "it";
_L18:
        return "ms";
_L19:
        return "pt";
_L20:
        return "uk";
_L21:
        return "vi";
_L22:
        return "fa";
_L23:
        return "pl";
_L24:
        return "az";
_L25:
        return "da";
_L26:
        return "no";
_L27:
        return "iw";
_L28:
        return "nl";
_L29:
        return "ro";
_L30:
        return "el";
_L31:
        return "cs";
_L32:
        return "hu";
_L33:
        return "bg";
_L34:
        return "sv";
_L35:
        return "sr";
_L2:
        String s2 = Locale.getDefault().getLanguage();
        s1 = s2;
        if (!b(s2))
        {
            return "en";
        }
        if (true) goto _L37; else goto _L36
_L36:
    }

    private static void a(Map map, String s1)
    {
        s1 = new JSONObject(s1);
        Iterator iterator = s1.keys();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            String s2 = (String)iterator.next();
            String s3 = s1.optString(s2);
            if (s2 != null && s3 != null && map != null)
            {
                map.put(s2, s3);
            }
        } while (true);
    }

    private boolean a(String s1)
    {
        if (s1 != null && g != null) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        FileOutputStream fileoutputstream = new FileOutputStream(g);
        Object obj = fileoutputstream;
        fileoutputstream.write(s1.getBytes("utf-8"));
        try
        {
            fileoutputstream.close();
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            s1.printStackTrace();
        }
        return true;
        IOException ioexception1;
        ioexception1;
        s1 = null;
_L6:
        obj = s1;
        ioexception1.printStackTrace();
        if (s1 == null) goto _L1; else goto _L3
_L3:
        try
        {
            s1.close();
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            s1.printStackTrace();
            return false;
        }
        return false;
        s1;
        obj = null;
_L5:
        if (obj != null)
        {
            try
            {
                ((OutputStream) (obj)).close();
            }
            catch (IOException ioexception)
            {
                ioexception.printStackTrace();
            }
        }
        throw s1;
        s1;
        if (true) goto _L5; else goto _L4
_L4:
        ioexception1;
        s1 = fileoutputstream;
          goto _L6
    }

    private static boolean b(String s1)
    {
        boolean flag = false;
        com/roidapp/photogrid/cloud/w;
        JVM INSTR monitorenter ;
        if (d != null || k == null) goto _L2; else goto _L1
_L1:
        String as[];
        int i1;
        d = new TreeSet();
        as = k;
        i1 = as.length;
        int l = 0;
_L3:
        String s2;
        if (l >= i1)
        {
            break; /* Loop/switch isn't completed */
        }
        s2 = as[l];
        d.add(s2);
        l++;
        if (true) goto _L3; else goto _L2
_L2:
        if (d != null)
        {
            flag = d.contains(s1);
        }
        com/roidapp/photogrid/cloud/w;
        JVM INSTR monitorexit ;
        return flag;
        s1;
        throw s1;
    }

    public final String a(String s1, String s2)
    {
        String s3 = null;
        if (e != null)
        {
            s3 = (String)e.get(s1);
        }
        if (s3 == null)
        {
            return s2;
        } else
        {
            return s3;
        }
    }

    public final void a(int l, Exception exception)
    {
        h = null;
        a = false;
        j = null;
    }

    public final void a(Object obj)
    {
        obj = (String)obj;
        h = null;
        if (obj == null) goto _L2; else goto _L1
_L1:
        a(((Map) (null)), ((String) (obj)));
        boolean flag = true;
_L4:
        if (flag && a(((String) (obj))) && j != null)
        {
            j.edit().putLong("stringTime", System.currentTimeMillis()).commit();
        }
_L2:
        j = null;
        return;
        JSONException jsonexception;
        jsonexception;
        jsonexception.printStackTrace();
        flag = false;
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final boolean a()
    {
        return e != null && !e.isEmpty();
    }

    public final boolean b()
    {
        while (a || n.i() % 3 != 1 || j == null || System.currentTimeMillis() - j.getLong("stringTime", 0L) < 0xf731400L) 
        {
            return false;
        }
        a = true;
        if (h != null)
        {
            h.f();
        }
        h = new r("http://dl.pg.ksmobile.com/values2/".concat(f), this);
        try
        {
            t.a().execute(h);
        }
        catch (NoClassDefFoundError noclassdeffounderror)
        {
            (new Thread(h)).start();
        }
        return true;
    }

}
