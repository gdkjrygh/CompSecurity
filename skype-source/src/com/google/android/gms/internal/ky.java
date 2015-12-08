// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.android.gms.internal:
//            ku, kw, ld, lb

final class ky
    implements Cloneable
{

    private kw a;
    private Object b;
    private List c;

    ky()
    {
        c = new ArrayList();
    }

    private byte[] c()
        throws IOException
    {
        byte abyte0[] = new byte[a()];
        a(ku.a(abyte0));
        return abyte0;
    }

    final int a()
    {
        if (b == null) goto _L2; else goto _L1
_L1:
        int j = a.a(b);
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
            ld ld1 = (ld)iterator.next();
            j = ku.e(ld1.a);
            i = ld1.b.length + (j + 0) + i;
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    final void a(ku ku1)
        throws IOException
    {
        if (b != null)
        {
            a.a(b, ku1);
        } else
        {
            Iterator iterator = c.iterator();
            while (iterator.hasNext()) 
            {
                ld ld1 = (ld)iterator.next();
                ku1.d(ld1.a);
                ku1.b(ld1.b);
            }
        }
    }

    final void a(ld ld1)
    {
        c.add(ld1);
    }

    public final ky b()
    {
        Object obj;
        int i;
        i = 0;
        obj = new ky();
        obj.a = a;
        if (c != null) goto _L2; else goto _L1
_L1:
        obj.c = null;
_L7:
        if (b == null) goto _L4; else goto _L3
_L3:
        if (!(b instanceof lb)) goto _L6; else goto _L5
_L5:
        obj.b = ((lb)b).d();
        return ((ky) (obj));
_L2:
        try
        {
            ((ky) (obj)).c.addAll(c);
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
        return ((ky) (obj));
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
        return ((ky) (obj));
        if (!(b instanceof int[]))
        {
            break MISSING_BLOCK_LABEL_231;
        }
        obj.b = ((int[])b).clone();
        return ((ky) (obj));
        if (!(b instanceof long[]))
        {
            break MISSING_BLOCK_LABEL_257;
        }
        obj.b = ((long[])b).clone();
        return ((ky) (obj));
        if (!(b instanceof float[]))
        {
            break MISSING_BLOCK_LABEL_283;
        }
        obj.b = ((float[])b).clone();
        return ((ky) (obj));
        if (!(b instanceof double[]))
        {
            break MISSING_BLOCK_LABEL_309;
        }
        obj.b = ((double[])b).clone();
        return ((ky) (obj));
        if (!(b instanceof lb[])) goto _L4; else goto _L11
_L11:
        obj1 = (lb[])b;
        obj2 = new lb[obj1.length];
        obj.b = obj2;
_L13:
        if (i >= obj1.length) goto _L4; else goto _L12
_L12:
        obj2[i] = obj1[i].d();
        i++;
          goto _L13
_L4:
        return ((ky) (obj));
    }

    public final Object clone()
        throws CloneNotSupportedException
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
            if (obj instanceof ky)
            {
                obj = (ky)obj;
                if (b != null && ((ky) (obj)).b != null)
                {
                    flag = flag2;
                    if (a == ((ky) (obj)).a)
                    {
                        if (!a.b.isArray())
                        {
                            return b.equals(((ky) (obj)).b);
                        }
                        if (b instanceof byte[])
                        {
                            return Arrays.equals((byte[])b, (byte[])((ky) (obj)).b);
                        }
                        if (b instanceof int[])
                        {
                            return Arrays.equals((int[])b, (int[])((ky) (obj)).b);
                        }
                        if (b instanceof long[])
                        {
                            return Arrays.equals((long[])b, (long[])((ky) (obj)).b);
                        }
                        if (b instanceof float[])
                        {
                            return Arrays.equals((float[])b, (float[])((ky) (obj)).b);
                        }
                        if (b instanceof double[])
                        {
                            return Arrays.equals((double[])b, (double[])((ky) (obj)).b);
                        }
                        if (b instanceof boolean[])
                        {
                            return Arrays.equals((boolean[])b, (boolean[])((ky) (obj)).b);
                        } else
                        {
                            return Arrays.deepEquals((Object[])b, (Object[])((ky) (obj)).b);
                        }
                    }
                } else
                {
                    if (c != null && ((ky) (obj)).c != null)
                    {
                        return c.equals(((ky) (obj)).c);
                    }
                    boolean flag1;
                    try
                    {
                        flag1 = Arrays.equals(c(), ((ky) (obj)).c());
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
