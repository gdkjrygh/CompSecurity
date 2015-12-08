// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.preference.PreferenceManager;
import com.roidapp.baselib.a.b;
import com.roidapp.cloudlib.aq;
import com.roidapp.cloudlib.at;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public final class d
{

    private static String d;
    private static boolean e = true;
    private static boolean f;
    private static boolean g;
    private ArrayList a;
    private final File b;
    private final Context c;

    private d(Context context)
    {
        c = context;
        b = new File(c.getCacheDir(), "appAds");
    }

    private BitmapDrawable a(String s, int i)
    {
        Object obj1 = null;
        if (!g) goto _L2; else goto _L1
_L1:
        Object obj;
        obj = obj1;
        if (i != 0)
        {
            try
            {
                s = BitmapFactory.decodeResource(c.getResources(), i);
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                s.printStackTrace();
                s = null;
            }
            obj = obj1;
            if (s != null)
            {
                obj = obj1;
                if (!s.isRecycled())
                {
                    obj = new BitmapDrawable(c.getResources(), s);
                }
            }
        }
_L4:
        return ((BitmapDrawable) (obj));
_L2:
        Object obj2;
        obj = new File(b, s);
        obj2 = PreferenceManager.getDefaultSharedPreferences(c);
        if (!com.roidapp.baselib.a.b.a(((File) (obj))) || ((File) (obj)).length() != (long)((SharedPreferences) (obj2)).getInt(s.concat("_size"), 0))
        {
            break; /* Loop/switch isn't completed */
        }
        android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
        options.inSampleSize = 1;
        try
        {
            s = BitmapFactory.decodeFile(((File) (obj)).getAbsolutePath(), options);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj2)
        {
            System.gc();
            options.inSampleSize = 2;
            try
            {
                s = BitmapFactory.decodeFile(((File) (obj)).getAbsolutePath(), options);
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                ((OutOfMemoryError) (obj2)).printStackTrace();
                s = null;
            }
        }
        obj = obj1;
        if (s != null)
        {
            obj = obj1;
            if (!s.isRecycled())
            {
                return new BitmapDrawable(c.getResources(), s);
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
        if (i == 0)
        {
            break; /* Loop/switch isn't completed */
        }
        if (((SharedPreferences) (obj2)).getInt("version_picture", 0) != 0)
        {
            PreferenceManager.getDefaultSharedPreferences(c).edit().putInt("version_picture", 0).apply();
        }
        try
        {
            s = BitmapFactory.decodeResource(c.getResources(), i);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            s.printStackTrace();
            s = null;
        }
        obj = obj1;
        if (s != null)
        {
            obj = obj1;
            if (!s.isRecycled())
            {
                return new BitmapDrawable(c.getResources(), s);
            }
        }
        if (true) goto _L4; else goto _L5
_L5:
        obj = obj1;
        if (PreferenceManager.getDefaultSharedPreferences(c).getInt("version_picture", 0) != 0)
        {
            PreferenceManager.getDefaultSharedPreferences(c).edit().putInt("version_picture", 0).apply();
            return null;
        }
        if (true) goto _L4; else goto _L6
_L6:
    }

    public static d a(Context context)
    {
        return new d(context);
    }

    private String a(String s, String s1)
    {
        for (s = PreferenceManager.getDefaultSharedPreferences(c).getString(s, s1); f || s.trim().equals("");)
        {
            return s1;
        }

        return s;
    }

    public final BitmapDrawable a(String s)
    {
        int i;
        if (s.contains("cleanmaster"))
        {
            i = aq.a;
        } else
        {
            i = 0;
        }
        return a((new StringBuilder()).append(s).append("_preview").toString(), i);
    }

    public final List a()
    {
        if (a == null)
        {
            a = new ArrayList();
            if (a.size() > 0)
            {
                a.clear();
            }
            String s = PreferenceManager.getDefaultSharedPreferences(c).getString("apps", "com.seventeenmiles.sketch".concat("#").concat("com.cleanmaster.mguard"));
            Collections.addAll(a, s.split("#"));
        }
        ArrayList arraylist = new ArrayList();
        Iterator iterator = a.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            String s1 = (String)iterator.next();
            if (s1.startsWith("event."))
            {
                arraylist.add(s1);
            }
        } while (true);
        return arraylist;
    }

    public final String b(String s)
    {
        if (!g)
        {
            if ((s = new File(b, (new StringBuilder()).append(s).append("_preview").toString())).exists())
            {
                return s.getPath();
            }
        }
        return null;
    }

    public final BitmapDrawable c(String s)
    {
        int i;
        if (s.contains("cleanmaster"))
        {
            i = aq.T;
        } else
        {
            i = 0;
        }
        return a((new StringBuilder()).append(s).append("_icon").toString(), i);
    }

    public final String d(String s)
    {
        String s1;
        if (s.contains("cleanmaster"))
        {
            s1 = c.getString(at.br);
        } else
        {
            s1 = "";
        }
        return a((new StringBuilder()).append(s).append("_content_").append(d).toString(), s1);
    }

    public final String e(String s)
    {
        String s1;
        if (s.contains("cleanmaster"))
        {
            s1 = c.getString(at.bq);
        } else
        {
            s1 = "Ok";
        }
        return a((new StringBuilder()).append(s).append("_positiveBtn_").append(d).toString(), s1);
    }

    public final String f(String s)
    {
        String s1;
        if (s.contains("cleanmaster"))
        {
            s1 = c.getString(at.bp);
        } else
        {
            s1 = "Cancel";
        }
        return a((new StringBuilder()).append(s).append("_negativeBtn_").append(d).toString(), s1);
    }

    public final String g(String s)
    {
        String s1;
        if (s.contains("sketch"))
        {
            s1 = "http://dl.cm.ksmobile.com/photogrid/Sketch.apk";
        } else
        if (s.contains("cleanmaster"))
        {
            s1 = "http://dl.cm.ksmobile.com/cleanmaster/partner/cleanmaster.apk";
        } else
        {
            s1 = "";
        }
        return PreferenceManager.getDefaultSharedPreferences(c).getString((new StringBuilder()).append(s).append("_package_url").toString(), s1);
    }

    public final int h(String s)
    {
        return PreferenceManager.getDefaultSharedPreferences(c).getInt((new StringBuilder()).append(s).append("_save_click_event").toString(), 0);
    }

}
