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
//            xr, xu, yd, yb

final class xz
    implements Cloneable
{

    private xu a;
    private Object b;
    private List c;

    xz()
    {
        c = new ArrayList();
    }

    private byte[] c()
    {
        byte abyte0[] = new byte[a()];
        a(xr.a(abyte0));
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
            yd yd1 = (yd)iterator.next();
            j = xr.d(yd1.a);
            i = yd1.b.length + (j + 0) + i;
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    final void a(xr xr1)
    {
        if (b != null)
        {
            a.a(b, xr1);
        } else
        {
            Iterator iterator = c.iterator();
            while (iterator.hasNext()) 
            {
                yd yd1 = (yd)iterator.next();
                xr1.c(yd1.a);
                xr1.b(yd1.b);
            }
        }
    }

    public final xz b()
    {
        Object obj;
        int i;
        i = 0;
        obj = new xz();
        obj.a = a;
        if (c != null) goto _L2; else goto _L1
_L1:
        obj.c = null;
_L7:
        if (b == null) goto _L4; else goto _L3
_L3:
        if (!(b instanceof yb)) goto _L6; else goto _L5
_L5:
        obj.b = ((yb)b).b();
        return ((xz) (obj));
_L2:
        try
        {
            ((xz) (obj)).c.addAll(c);
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
        return ((xz) (obj));
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
        return ((xz) (obj));
        if (!(b instanceof int[]))
        {
            break MISSING_BLOCK_LABEL_231;
        }
        obj.b = ((int[])b).clone();
        return ((xz) (obj));
        if (!(b instanceof long[]))
        {
            break MISSING_BLOCK_LABEL_257;
        }
        obj.b = ((long[])b).clone();
        return ((xz) (obj));
        if (!(b instanceof float[]))
        {
            break MISSING_BLOCK_LABEL_283;
        }
        obj.b = ((float[])b).clone();
        return ((xz) (obj));
        if (!(b instanceof double[]))
        {
            break MISSING_BLOCK_LABEL_309;
        }
        obj.b = ((double[])b).clone();
        return ((xz) (obj));
        if (!(b instanceof yb[])) goto _L4; else goto _L11
_L11:
        obj1 = (yb[])b;
        obj2 = new yb[obj1.length];
        obj.b = obj2;
_L13:
        if (i >= obj1.length) goto _L4; else goto _L12
_L12:
        obj2[i] = obj1[i].b();
        i++;
          goto _L13
_L4:
        return ((xz) (obj));
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
            if (obj instanceof xz)
            {
                obj = (xz)obj;
                if (b != null && ((xz) (obj)).b != null)
                {
                    flag = flag2;
                    if (a == ((xz) (obj)).a)
                    {
                        if (!a.b.isArray())
                        {
                            return b.equals(((xz) (obj)).b);
                        }
                        if (b instanceof byte[])
                        {
                            return Arrays.equals((byte[])b, (byte[])((xz) (obj)).b);
                        }
                        if (b instanceof int[])
                        {
                            return Arrays.equals((int[])b, (int[])((xz) (obj)).b);
                        }
                        if (b instanceof long[])
                        {
                            return Arrays.equals((long[])b, (long[])((xz) (obj)).b);
                        }
                        if (b instanceof float[])
                        {
                            return Arrays.equals((float[])b, (float[])((xz) (obj)).b);
                        }
                        if (b instanceof double[])
                        {
                            return Arrays.equals((double[])b, (double[])((xz) (obj)).b);
                        }
                        if (b instanceof boolean[])
                        {
                            return Arrays.equals((boolean[])b, (boolean[])((xz) (obj)).b);
                        } else
                        {
                            return Arrays.deepEquals((Object[])b, (Object[])((xz) (obj)).b);
                        }
                    }
                } else
                {
                    if (c != null && ((xz) (obj)).c != null)
                    {
                        return c.equals(((xz) (obj)).c);
                    }
                    boolean flag1;
                    try
                    {
                        flag1 = Arrays.equals(c(), ((xz) (obj)).c());
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
