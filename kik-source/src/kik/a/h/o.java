// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.a.h;

import com.b.a.b;
import com.b.a.n;
import com.kik.n.a.e.a;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import kik.a.f.g;

// Referenced classes of package kik.a.h:
//            h, i

public final class o
{

    public static a a(byte abyte0[], byte abyte1[], byte abyte2[])
    {
        Object obj = null;
        if (abyte0 != null)
        {
            a a1 = new a();
            try
            {
                obj = kik.a.h.h.b(abyte0, abyte1);
            }
            // Misplaced declaration of an exception variable
            catch (byte abyte0[])
            {
                throw new g(abyte0);
            }
            // Misplaced declaration of an exception variable
            catch (byte abyte0[])
            {
                throw new g(abyte0);
            }
            a1.a(b.b(a(abyte1)));
            a1.b(b.b(abyte2));
            a1.d(b.b(((byte []) (obj))));
            abyte0 = kik.a.h.h.a(abyte0, abyte1, abyte2);
            obj = a1;
            if (abyte0 != null)
            {
                a1.c(b.b(abyte0));
                obj = a1;
            }
        }
        return ((a) (obj));
    }

    public static String a(n n1)
    {
        StringBuilder stringbuilder = new StringBuilder();
        a(n1, stringbuilder, 0);
        return stringbuilder.toString();
    }

    private static void a(n n1, StringBuilder stringbuilder, int j)
    {
        Class class1;
        Field afield[];
        int l;
        int i1;
        class1 = n1.getClass();
        String s = "";
        for (int k = 0; k < j; k++)
        {
            s = (new StringBuilder()).append(s).append(' ').toString();
        }

        String s1 = class1.getSimpleName();
        stringbuilder.append(s).append(s1).append(':').append('\n');
        afield = class1.getDeclaredFields();
        i1 = afield.length;
        l = 0;
_L6:
        Object obj;
        Object obj1;
        String s2;
        int j1;
        if (l >= i1)
        {
            break MISSING_BLOCK_LABEL_194;
        }
        obj1 = afield[l];
        s2 = ((Field) (obj1)).getName();
        ((Field) (obj1)).getType();
        obj = null;
        j1 = ((Field) (obj1)).getModifiers();
        if (!((Field) (obj1)).getDeclaringClass().equals(class1) || Modifier.isStatic(j1) || Modifier.isPrivate(j1)) goto _L2; else goto _L1
_L1:
        ((Field) (obj1)).setAccessible(true);
        obj1 = ((Field) (obj1)).get(n1);
        obj = obj1;
_L4:
        a(s2, obj, stringbuilder, j);
_L2:
        l++;
        continue; /* Loop/switch isn't completed */
        IllegalAccessException illegalaccessexception;
        illegalaccessexception;
        if (true) goto _L4; else goto _L3
_L3:
        return;
        if (true) goto _L6; else goto _L5
_L5:
    }

    private static void a(String s, Object obj, StringBuilder stringbuilder, int j)
    {
        boolean flag;
        flag = false;
        String s1 = "";
        for (int k = 0; k < j; k++)
        {
            s1 = (new StringBuilder()).append(s1).append(' ').toString();
        }

        stringbuilder.append(s1).append(s).append(" = ");
        if (obj != null) goto _L2; else goto _L1
_L1:
        stringbuilder.append("(null)\n");
_L4:
        return;
_L2:
        if (obj instanceof String)
        {
            stringbuilder.append('"').append(obj).append('"').append('\n');
            return;
        }
        if (obj instanceof Number)
        {
            stringbuilder.append(obj).append('\n');
            return;
        }
        if (obj instanceof b)
        {
            s = (b)obj;
            obj = kik.a.h.i.a(s.c());
            stringbuilder.append('[').append(s.b()).append("] ").append(((String) (obj))).append('\n');
            return;
        }
        if (!(obj instanceof Collection))
        {
            break; /* Loop/switch isn't completed */
        }
        stringbuilder.append('\n');
        s = ((Collection)obj).iterator();
        int l = ((flag) ? 1 : 0);
        while (s.hasNext()) 
        {
            a(String.valueOf(l), s.next(), stringbuilder, j + 2);
            l++;
        }
        if (true) goto _L4; else goto _L3
_L3:
        if (!(obj instanceof n)) goto _L4; else goto _L5
_L5:
        stringbuilder.append('(').append(obj.getClass().getSimpleName()).append(')').append('\n');
        a((n)obj, stringbuilder, j + 2);
        return;
    }

    public static byte[] a(a a1, byte abyte0[])
    {
        byte abyte1[] = null;
        if (a1 == null || abyte0 == null)
        {
            abyte1 = null;
        } else
        {
            byte abyte2[] = kik.a.h.h.b(a1.d().c(), abyte0, a1.c().c());
            b b1 = a1.e();
            a1 = abyte1;
            if (b1 != null)
            {
                a1 = b1.c();
            }
            abyte1 = abyte2;
            if (a1 != null)
            {
                try
                {
                    abyte0 = kik.a.h.h.b(abyte2, abyte0);
                }
                // Misplaced declaration of an exception variable
                catch (a a1)
                {
                    throw new g(a1);
                }
                // Misplaced declaration of an exception variable
                catch (a a1)
                {
                    throw new g(a1);
                }
                abyte1 = abyte2;
                if (!Arrays.equals(a1, abyte0))
                {
                    throw new g("XData MAC mismatch");
                }
            }
        }
        return abyte1;
    }

    private static byte[] a(byte abyte0[])
    {
        try
        {
            abyte0 = MessageDigest.getInstance("SHA-256").digest(abyte0);
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            return null;
        }
        return abyte0;
    }
}
