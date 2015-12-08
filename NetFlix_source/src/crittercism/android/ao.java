// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package crittercism.android;

import android.content.Context;
import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.UUID;

// Referenced classes of package crittercism.android:
//            t, h

public final class ao
    implements t
{
    public static final class a
    {

        public static ao a(String s)
        {
            return new ao(s, (byte)0);
        }

        static String a(Context context)
        {
            context = android.provider.Settings.Secure.getString(context.getContentResolver(), "android_id");
            if (context == null || context.length() <= 0 || context.equals("9774d56d682e549c")) goto _L2; else goto _L1
_L1:
            context = UUID.nameUUIDFromBytes(context.getBytes("utf8"));
            if (context == null) goto _L2; else goto _L3
_L3:
            try
            {
                context = context.toString();
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                context = null;
            }
_L5:
            if (context != null && context.length() == 0)
            {
                return null;
            } else
            {
                return context;
            }
_L2:
            context = null;
            if (true) goto _L5; else goto _L4
_L4:
        }

        static String b(String s)
        {
            if (s != null && s.length() > 0)
            {
                try
                {
                    s = new String((new BigInteger(1, MessageDigest.getInstance("SHA-256").digest(s.getBytes()))).toString(16));
                }
                // Misplaced declaration of an exception variable
                catch (String s)
                {
                    s = null;
                }
            }
            if (s != null && s.length() == 0)
            {
                return null;
            } else
            {
                return s;
            }
        }

        public a()
        {
        }
    }


    public String a;

    private ao(String s)
    {
        a = s;
    }

    ao(String s, byte byte0)
    {
        this(s);
    }

    public final boolean a(h h1, String s, String s1)
    {
        this;
        JVM INSTR monitorenter ;
        h1.b(s, s1, a);
        this;
        JVM INSTR monitorexit ;
        return true;
        h1;
        throw h1;
    }

    public final volatile Object b()
    {
        return a;
    }
}
