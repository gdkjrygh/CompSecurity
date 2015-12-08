// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

final class kru
    implements Cloneable
{

    private im a;
    private Object b;
    private List c;

    kru()
    {
        c = new ArrayList();
    }

    private byte[] c()
    {
        byte abyte0[] = new byte[a()];
        a(krr.a(abyte0, 0, abyte0.length));
        return abyte0;
    }

    final int a()
    {
        if (b == null) goto _L2; else goto _L1
_L1:
        int j = a.a_(b);
_L4:
        return j;
_L2:
        Iterator iterator = c.iterator();
        int i = 0;
        do
        {
            j = i;
            if (!iterator.hasNext())
            {
                continue;
            }
            krx krx1 = (krx)iterator.next();
            i = krr.d(0) + 0 + null.length + i;
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    final void a(krr krr1)
    {
        if (b != null)
        {
            a.a(b, krr1);
        } else
        {
            Iterator iterator = c.iterator();
            while (iterator.hasNext()) 
            {
                krx krx1 = (krx)iterator.next();
                krr1.c(0);
                krr1.b(null);
            }
        }
    }

    public final kru b()
    {
        Object obj;
        int i;
        i = 0;
        obj = new kru();
        obj.a = a;
        if (c != null) goto _L2; else goto _L1
_L1:
        obj.c = null;
_L7:
        if (b == null) goto _L4; else goto _L3
_L3:
        if (!(b instanceof krw)) goto _L6; else goto _L5
_L5:
        obj.b = ((krw)b).c();
        return ((kru) (obj));
_L2:
        try
        {
            ((kru) (obj)).c.addAll(c);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw new AssertionError(obj);
        }
          goto _L7
_L6:
        if (!(b instanceof byte[]))
        {
            break MISSING_BLOCK_LABEL_117;
        }
        obj.b = ((byte[])b).clone();
        return ((kru) (obj));
        if (!(b instanceof byte[][])) goto _L9; else goto _L8
_L8:
        Object obj1;
        Object obj2;
        obj1 = (byte[][])b;
        obj2 = new byte[obj1.length][];
        obj.b = obj2;
        i = 0;
_L10:
        if (i >= obj1.length)
        {
            break; /* Loop/switch isn't completed */
        }
        obj2[i] = (byte[])obj1[i].clone();
        i++;
        if (true) goto _L10; else goto _L4
_L9:
        if (!(b instanceof boolean[]))
        {
            break MISSING_BLOCK_LABEL_205;
        }
        obj.b = ((boolean[])b).clone();
        return ((kru) (obj));
        if (!(b instanceof int[]))
        {
            break MISSING_BLOCK_LABEL_231;
        }
        obj.b = ((int[])b).clone();
        return ((kru) (obj));
        if (!(b instanceof long[]))
        {
            break MISSING_BLOCK_LABEL_257;
        }
        obj.b = ((long[])b).clone();
        return ((kru) (obj));
        if (!(b instanceof float[]))
        {
            break MISSING_BLOCK_LABEL_283;
        }
        obj.b = ((float[])b).clone();
        return ((kru) (obj));
        if (!(b instanceof double[]))
        {
            break MISSING_BLOCK_LABEL_309;
        }
        obj.b = ((double[])b).clone();
        return ((kru) (obj));
        if (!(b instanceof krw[])) goto _L4; else goto _L11
_L11:
        obj1 = (krw[])b;
        obj2 = new krw[obj1.length];
        obj.b = obj2;
_L13:
        if (i >= obj1.length) goto _L4; else goto _L12
_L12:
        obj2[i] = obj1[i].c();
        i++;
          goto _L13
_L4:
        return ((kru) (obj));
    }

    public final Object clone()
    {
        return b();
    }

    public final boolean equals(Object obj)
    {
        boolean flag2 = false;
        boolean flag;
        if (obj == this)
        {
            flag = true;
        } else
        {
            flag = flag2;
            if (obj instanceof kru)
            {
                obj = (kru)obj;
                if (b != null && ((kru) (obj)).b != null)
                {
                    flag = flag2;
                    if (a == ((kru) (obj)).a)
                    {
                        throw new NullPointerException();
                    }
                } else
                {
                    if (c != null && ((kru) (obj)).c != null)
                    {
                        return c.equals(((kru) (obj)).c);
                    }
                    boolean flag1;
                    try
                    {
                        flag1 = Arrays.equals(c(), ((kru) (obj)).c());
                    }
                    // Misplaced declaration of an exception variable
                    catch (Object obj)
                    {
                        throw new IllegalStateException(((Throwable) (obj)));
                    }
                    return flag1;
                }
            }
        }
        return flag;
    }

    public final int hashCode()
    {
        int i;
        try
        {
            i = Arrays.hashCode(c());
        }
        catch (IOException ioexception)
        {
            throw new IllegalStateException(ioexception);
        }
        return i + 527;
    }
}
