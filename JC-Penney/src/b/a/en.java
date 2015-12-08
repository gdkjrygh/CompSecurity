// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.UUID;

// Referenced classes of package b.a:
//            eu

public final class en
{

    private SharedPreferences a;
    private SharedPreferences b;
    private Context c;

    public en(Context context)
    {
        if (context == null)
        {
            throw new NullPointerException("context was null");
        }
        c = context;
        a = context.getSharedPreferences("com.crittercism.usersettings", 0);
        b = context.getSharedPreferences("com.crittercism.prefs", 0);
        if (a == null)
        {
            throw new NullPointerException("prefs were null");
        }
        if (b == null)
        {
            throw new NullPointerException("legacy prefs were null");
        } else
        {
            return;
        }
    }

    private boolean a(String s)
    {
        android.content.SharedPreferences.Editor editor = a.edit();
        editor.putString("hashedDeviceID", s);
        return editor.commit();
    }

    private static String b()
    {
        String s;
        try
        {
            s = UUID.randomUUID().toString();
        }
        catch (ThreadDeath threaddeath)
        {
            throw threaddeath;
        }
        catch (Throwable throwable)
        {
            eu.a(throwable);
            return null;
        }
        return s;
    }

    public final String a()
    {
        Object obj1 = a.getString("hashedDeviceID", null);
        Object obj = obj1;
        if (obj1 == null)
        {
            obj1 = b.getString("com.crittercism.prefs.did", null);
            obj = obj1;
            if (obj1 != null)
            {
                obj = obj1;
                if (a(((String) (obj1))))
                {
                    obj = b.edit();
                    ((android.content.SharedPreferences.Editor) (obj)).remove("com.crittercism.prefs.did");
                    ((android.content.SharedPreferences.Editor) (obj)).commit();
                    obj = obj1;
                }
            }
        }
        obj1 = obj;
        if (obj == null)
        {
            obj1 = b();
            a(((String) (obj1)));
        }
        return ((String) (obj1));
    }
}
