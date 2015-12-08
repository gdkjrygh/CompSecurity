// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.release;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Environment;
import android.util.Log;
import com.roidapp.photogrid.cloud.aj;
import com.roidapp.photogrid.cloud.ak;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;

public final class rc
{

    private static rc f;
    protected ArrayList a;
    public ArrayList b;
    public ArrayList c;
    private HashMap d;
    private ArrayList e;
    private String g[];
    private String h[];

    private rc(Context context)
    {
        d = new HashMap();
        e = new ArrayList();
        a = new ArrayList();
        b = new ArrayList();
        c = new ArrayList();
        g = new String[0];
        h = new String[0];
        Object obj = new aj();
        Locale locale = context.getResources().getConfiguration().locale;
        obj = ((aj) (obj)).a((new StringBuilder()).append(locale.getLanguage()).toString());
        if (obj != null)
        {
            g = new String[((List) (obj)).size()];
            h = new String[((List) (obj)).size()];
            for (int i = 0; i < ((List) (obj)).size(); i++)
            {
                ak ak1 = (ak)((List) (obj)).get(i);
                g[i] = ak1.a().substring(0, ak1.a().indexOf("."));
                h[i] = ak1.b();
            }

        }
        b(context);
        f();
    }

    public static rc a(Context context)
    {
        com/roidapp/photogrid/release/rc;
        JVM INSTR monitorenter ;
        if (f == null)
        {
            f = new rc(context);
        }
        context = f;
        com/roidapp/photogrid/release/rc;
        JVM INSTR monitorexit ;
        return context;
        context;
        throw context;
    }

    public static void b()
    {
        com/roidapp/photogrid/release/rc;
        JVM INSTR monitorenter ;
        if (f != null && f.d != null)
        {
            Log.e("typeface utils", "destory");
            f.d.clear();
        }
        f = null;
        com/roidapp/photogrid/release/rc;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public static String e()
    {
        return (new StringBuilder()).append(Environment.getExternalStorageDirectory().getAbsolutePath()).append("/roidapp/.Fonts").toString();
    }

    private void f()
    {
        int i;
        d.clear();
        i = 0;
_L2:
        if (i >= e.size())
        {
            break; /* Loop/switch isn't completed */
        }
        d.put(Integer.valueOf(i), e.get(i));
        i++;
        if (true) goto _L2; else goto _L1
        RuntimeException runtimeexception;
        runtimeexception;
        runtimeexception.printStackTrace();
_L1:
    }

    private void g()
    {
        String s1;
        String as[];
        int k;
        a.clear();
        b.clear();
        c.clear();
        s1 = e();
        Object obj = new File(s1);
        if (!((File) (obj)).exists())
        {
            if (!((File) (obj)).mkdirs())
            {
                obj = new File[0];
            } else
            {
                obj = ((File) (obj)).listFiles();
            }
        } else
        {
            obj = ((File) (obj)).listFiles();
        }
        as = new String[obj.length];
        for (int i = 0; i < obj.length; i++)
        {
            for (int l = 0; l < obj.length - 1 - i; l++)
            {
                if (obj[l].lastModified() > obj[l + 1].lastModified())
                {
                    Object obj1 = obj[l];
                    obj[l] = obj[l + 1];
                    obj[l + 1] = obj1;
                }
            }

        }

        for (int j = 0; j < obj.length; j++)
        {
            as[j] = obj[j].getName();
        }

        k = 0;
_L9:
        String s;
        if (k >= as.length)
        {
            break MISSING_BLOCK_LABEL_482;
        }
        if (!as[k].endsWith(".ttf"))
        {
            break MISSING_BLOCK_LABEL_383;
        }
        a.add((new StringBuilder()).append(s1).append("/").append(as[k]).toString());
        s = as[k].substring(0, as[k].indexOf(".ttf"));
        c.add(s);
        if (s.indexOf("chinese") < 0 && s.indexOf("japanese") < 0 && s.indexOf("korean") < 0 && s.indexOf("arabic") < 0) goto _L2; else goto _L1
_L1:
        int i1 = 0;
_L7:
        if (i1 >= g.length) goto _L4; else goto _L3
_L3:
        if (!s.equals(g[i1])) goto _L6; else goto _L5
_L5:
        b.add(h[i1]);
_L4:
        k++;
        continue; /* Loop/switch isn't completed */
_L6:
        i1++;
          goto _L7
_L2:
        b.add(s);
          goto _L4
        if (as[k].endsWith(".otf"))
        {
            a.add((new StringBuilder()).append(s1).append("/").append(as[k]).toString());
            b.add(as[k].substring(0, as[k].indexOf(".otf")));
            c.add(as[k].substring(0, as[k].indexOf(".otf")));
        }
          goto _L4
        return;
        if (true) goto _L9; else goto _L8
_L8:
    }

    public final Typeface a(File file)
    {
        Object obj;
        Object obj1;
        Object obj2;
        obj1 = null;
        obj2 = null;
        obj = obj2;
        if (file == null) goto _L2; else goto _L1
_L1:
        if (file.exists()) goto _L4; else goto _L3
_L3:
        obj = obj2;
_L2:
        return ((Typeface) (obj));
_L4:
        obj = obj2;
        if (e == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        file = Typeface.createFromFile(file);
        boolean flag = false;
_L6:
        obj = file;
        if (!flag)
        {
            e.add(0, file);
            return file;
        }
        if (true) goto _L2; else goto _L5
_L5:
        file;
        file.printStackTrace();
        flag = true;
        file = obj1;
          goto _L6
    }

    public final HashMap a()
    {
        f();
        return d;
    }

    public final void b(Context context)
    {
        if (e != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        e.clear();
        int i;
        try
        {
            context = context.getAssets();
            e.add(Typeface.DEFAULT);
            e.add(Typeface.DEFAULT_BOLD);
            e.add(Typeface.MONOSPACE);
            e.add(Typeface.SANS_SERIF);
            e.add(Typeface.SERIF);
            e.add(Typeface.createFromAsset(context, "fonts/ahundredmiles.ttf"));
            e.add(Typeface.createFromAsset(context, "fonts/Blunt.ttf"));
            e.add(Typeface.createFromAsset(context, "fonts/Binz.ttf"));
            e.add(Typeface.createFromAsset(context, "fonts/desyrel.ttf"));
            e.add(Typeface.createFromAsset(context, "fonts/FreeUniversal-Bold.ttf"));
            e.add(Typeface.createFromAsset(context, "fonts/gtw.ttf"));
            e.add(Typeface.createFromAsset(context, "fonts/HandTest.ttf"));
            e.add(Typeface.createFromAsset(context, "fonts/Impact.ttf"));
            e.add(Typeface.createFromAsset(context, "fonts/Jester.ttf"));
            e.add(Typeface.createFromAsset(context, "fonts/Junction 02.otf"));
            e.add(Typeface.createFromAsset(context, "fonts/Laine.ttf"));
            e.add(Typeface.createFromAsset(context, "fonts/NotCourierSans.otf"));
            e.add(Typeface.createFromAsset(context, "fonts/OSP-DIN.ttf"));
            e.add(Typeface.createFromAsset(context, "fonts/otfpoc.otf"));
            e.add(Typeface.createFromAsset(context, "fonts/Polsku.ttf"));
            e.add(Typeface.createFromAsset(context, "fonts/PressStart2P.ttf"));
            e.add(Typeface.createFromAsset(context, "fonts/Quicksand-Regular.otf"));
            e.add(Typeface.createFromAsset(context, "fonts/Roboto-Thin.ttf"));
            e.add(Typeface.createFromAsset(context, "fonts/RomanAntique.ttf"));
            e.add(Typeface.createFromAsset(context, "fonts/SerreriaSobria.otf"));
            e.add(Typeface.createFromAsset(context, "fonts/Strato-linked.ttf"));
            e.add(Typeface.createFromAsset(context, "fonts/Thonburi.ttf"));
            e.add(Typeface.createFromAsset(context, "fonts/waltographUI.ttf"));
            g();
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            context.printStackTrace();
            return;
        }
        i = 0;
        if (i >= a.size())
        {
            continue; /* Loop/switch isn't completed */
        }
        e.add(0, Typeface.createFromFile((String)a.get(i)));
        i++;
        if (true) goto _L4; else goto _L3
_L3:
        break MISSING_BLOCK_LABEL_459;
_L4:
        break MISSING_BLOCK_LABEL_423;
        if (true) goto _L1; else goto _L5
_L5:
    }

    public final ArrayList c()
    {
        g();
        return c;
    }

    public final ArrayList d()
    {
        g();
        return b;
    }
}
