// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package crittercism.android;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.telephony.TelephonyManager;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.UUID;

// Referenced classes of package crittercism.android:
//            dx

public final class dr
{

    private SharedPreferences a;
    private SharedPreferences b;
    private Context c;

    public dr(Context context)
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

    private static String a(String s)
    {
        String s1 = s;
        if (s != null)
        {
            s1 = s;
            if (s.length() > 0)
            {
                try
                {
                    s1 = new String((new BigInteger(1, MessageDigest.getInstance("SHA-256").digest(s.getBytes()))).toString(16));
                }
                // Misplaced declaration of an exception variable
                catch (String s)
                {
                    throw s;
                }
                // Misplaced declaration of an exception variable
                catch (String s)
                {
                    return null;
                }
            }
        }
        return s1;
    }

    private String b()
    {
        String s = null;
        Object obj = android.provider.Settings.Secure.getString(c.getContentResolver(), "android_id");
        if (obj == null) goto _L2; else goto _L1
_L1:
        if (((String) (obj)).length() <= 0 || ((String) (obj)).equals("9774d56d682e549c")) goto _L2; else goto _L3
_L3:
        obj = UUID.nameUUIDFromBytes(((String) (obj)).getBytes("utf8"));
        if (obj == null) goto _L2; else goto _L4
_L4:
        try
        {
            obj = ((UUID) (obj)).toString();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw obj;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            dx.a(((Throwable) (obj)));
            obj = null;
        }
_L8:
        if (obj != null && ((String) (obj)).length() != 0)
        {
            break MISSING_BLOCK_LABEL_108;
        }
        if (c.getPackageManager().checkPermission("android.permission.READ_PHONE_STATE", c.getPackageName()) == 0)
        {
            s = a(((TelephonyManager)c.getSystemService("phone")).getDeviceId());
        }
        obj = s;
_L6:
label0:
        {
            Object obj1;
            if (obj != null)
            {
                obj1 = obj;
                if (((String) (obj)).length() != 0)
                {
                    break label0;
                }
            }
            Throwable throwable;
            try
            {
                obj1 = UUID.randomUUID().toString();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                throw obj;
            }
            catch (Throwable throwable1)
            {
                dx.a(throwable1);
                return ((String) (obj));
            }
        }
        return ((String) (obj1));
        obj;
        throw obj;
        throwable;
        dx.a(throwable);
        if (true) goto _L6; else goto _L5
_L5:
_L2:
        obj = null;
        if (true) goto _L8; else goto _L7
_L7:
    }

    private boolean b(String s)
    {
        android.content.SharedPreferences.Editor editor = a.edit();
        editor.putString("hashedDeviceID", s);
        return editor.commit();
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
                if (b(((String) (obj1))))
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
            b(((String) (obj1)));
        }
        return ((String) (obj1));
    }
}
