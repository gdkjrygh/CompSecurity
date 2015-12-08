// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.a.h;

import com.b.a.m;
import com.b.a.n;
import com.b.a.q;
import com.b.a.x;

public final class g
{

    public static n a(byte abyte0[], Class class1)
    {
        if (abyte0 != null)
        {
            try
            {
                class1 = (n)class1.newInstance();
            }
            // Misplaced declaration of an exception variable
            catch (byte abyte0[])
            {
                return null;
            }
            try
            {
                q.a(abyte0, class1, class1.a());
            }
            // Misplaced declaration of an exception variable
            catch (byte abyte0[])
            {
                return class1;
            }
            return class1;
        } else
        {
            return null;
        }
    }

    public static byte[] a(n n1)
    {
        byte abyte0[] = null;
        if (n1 != null)
        {
            abyte0 = m.a();
            try
            {
                n1 = q.a(n1, n1.a(), abyte0);
            }
            // Misplaced declaration of an exception variable
            catch (n n1)
            {
                abyte0.b();
                return null;
            }
            finally
            {
                abyte0.b();
            }
            abyte0.b();
            abyte0 = n1;
        }
        return abyte0;
        throw n1;
    }
}
