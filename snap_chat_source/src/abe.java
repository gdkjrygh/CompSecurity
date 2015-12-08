// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.SharedPreferences;
import java.util.UUID;

public final class abe
{

    private SharedPreferences a;
    private SharedPreferences b;
    private Context c;

    public abe(Context context)
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

    private String b()
    {
        Object obj1 = null;
        Object obj2 = android.provider.Settings.Secure.getString(c.getContentResolver(), "android_id");
        Object obj;
        obj = obj1;
        if (obj2 == null)
        {
            break MISSING_BLOCK_LABEL_62;
        }
        obj = obj1;
        if (((String) (obj2)).length() <= 0)
        {
            break MISSING_BLOCK_LABEL_62;
        }
        obj = obj1;
        if (((String) (obj2)).equals("9774d56d682e549c"))
        {
            break MISSING_BLOCK_LABEL_62;
        }
        obj2 = UUID.nameUUIDFromBytes(((String) (obj2)).getBytes("utf8"));
        obj = obj1;
        if (obj2 != null)
        {
            try
            {
                obj = ((UUID) (obj2)).toString();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                throw obj;
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                abk.a(((Throwable) (obj)));
                obj = obj1;
            }
        }
label0:
        {
            if (obj != null)
            {
                obj1 = obj;
                if (((String) (obj)).length() != 0)
                {
                    break label0;
                }
            }
            try
            {
                obj1 = UUID.randomUUID().toString();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                throw obj;
            }
            catch (Throwable throwable)
            {
                abk.a(throwable);
                return ((String) (obj));
            }
        }
        return ((String) (obj1));
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
