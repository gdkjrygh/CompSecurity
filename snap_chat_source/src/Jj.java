// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.snapchat.android.Timber;
import java.lang.reflect.Method;

public final class Jj
{

    private static final String TAG = "SystemProperties";

    public static String a(String s, String s1)
    {
        try
        {
            s = (String)Class.forName("android.os.SystemProperties").getMethod("get", new Class[] {
                java/lang/String, java/lang/String
            }).invoke(null, new Object[] {
                s, s1
            });
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            Timber.a("SystemProperties", s);
            return s1;
        }
        return s;
    }
}
