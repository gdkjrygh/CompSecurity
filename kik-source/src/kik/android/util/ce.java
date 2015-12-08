// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.util;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import java.io.File;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.a.a.a.b;

// Referenced classes of package kik.android.util:
//            aq, cf, cg, ch

public final class ce
    implements aq
{

    private SharedPreferences a;
    private Context b;
    private String c;

    public ce(Context context, String s)
    {
        c = s;
        a = context.getSharedPreferences(b("KikPreferences"), 0);
        b = context;
    }

    static String a(ce ce1)
    {
        return ce1.c;
    }

    private static void a(SharedPreferences sharedpreferences, SharedPreferences sharedpreferences1)
    {
        sharedpreferences1 = sharedpreferences1.edit();
        sharedpreferences = sharedpreferences.getAll().entrySet().iterator();
        while (sharedpreferences.hasNext()) 
        {
            Object obj = (java.util.Map.Entry)sharedpreferences.next();
            String s = (String)((java.util.Map.Entry) (obj)).getKey();
            obj = ((java.util.Map.Entry) (obj)).getValue();
            if (obj instanceof String)
            {
                sharedpreferences1.putString(s, (String)obj);
            } else
            if (obj instanceof Integer)
            {
                sharedpreferences1.putInt(s, ((Integer)obj).intValue());
            } else
            if (obj instanceof Long)
            {
                sharedpreferences1.putLong(s, ((Long)obj).longValue());
            } else
            if (obj instanceof Float)
            {
                sharedpreferences1.putFloat(s, ((Float)obj).floatValue());
            } else
            if (obj instanceof Boolean)
            {
                sharedpreferences1.putBoolean(s, ((Boolean)obj).booleanValue());
            }
            sharedpreferences1.commit();
        }
    }

    private String b(String s)
    {
        return (new StringBuilder()).append(c).append(".").append(s).toString();
    }

    public final SharedPreferences a(String s)
    {
        return b.getSharedPreferences(b(s), 0);
    }

    public final void a()
    {
        cf cf1 = new cf(this);
        File file = new File(new File(b.getApplicationInfo().dataDir), "shared_prefs");
        if (file.isDirectory())
        {
            File afile[] = file.listFiles(cf1);
            int j = afile.length;
            for (int i = 0; i < j; i++)
            {
                afile[i].delete();
            }

        }
    }

    public final SharedPreferences b()
    {
        return a;
    }

    public final SharedPreferences c()
    {
        return b.getSharedPreferences("KikUltraPersistence", 0);
    }

    public final String d()
    {
        return b("KikPreferences");
    }

    public final void e()
    {
        cg cg1 = new cg(this);
        File file = new File(new File(b.getApplicationInfo().dataDir), "shared_prefs");
        if (file.isDirectory())
        {
            File afile[] = file.listFiles(cg1);
            int j = afile.length;
            for (int i = 0; i < j; i++)
            {
                File file1 = afile[i];
                SharedPreferences sharedpreferences = b.getSharedPreferences(org.a.a.a.b.a(file1.getName()), 0);
                SharedPreferences sharedpreferences1 = b.getSharedPreferences(b(org.a.a.a.b.a(file1.getName())), 0);
                if (sharedpreferences != null && sharedpreferences1 != null)
                {
                    a(sharedpreferences, sharedpreferences1);
                    file1.delete();
                }
            }

        }
    }

    public final void f()
    {
        ch ch1 = new ch(this);
        File file = new File(new File(b.getApplicationInfo().dataDir), "shared_prefs");
        if (file.isDirectory())
        {
            File afile[] = file.listFiles(ch1);
            int j = afile.length;
            for (int i = 0; i < j; i++)
            {
                afile[i].delete();
            }

        }
    }
}
