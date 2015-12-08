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
//            zzrg, zzri, zzrp, zzrn

class zzrk
    implements Cloneable
{

    private zzri a;
    private Object b;
    private List c;

    zzrk()
    {
        c = new ArrayList();
    }

    private byte[] c()
    {
        byte abyte0[] = new byte[a()];
        a(zzrg.a(abyte0));
        return abyte0;
    }

    int a()
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
            i = ((zzrp)iterator.next()).a() + i;
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    void a(zzrg zzrg1)
    {
        if (b != null)
        {
            a.a(b, zzrg1);
        } else
        {
            Iterator iterator = c.iterator();
            while (iterator.hasNext()) 
            {
                ((zzrp)iterator.next()).a(zzrg1);
            }
        }
    }

    void a(zzrp zzrp1)
    {
        c.add(zzrp1);
    }

    public final zzrk b()
    {
        Object obj;
        int i;
        i = 0;
        obj = new zzrk();
        obj.a = a;
        if (c != null) goto _L2; else goto _L1
_L1:
        obj.c = null;
_L4:
        if (b == null)
        {
            return ((zzrk) (obj));
        }
        break; /* Loop/switch isn't completed */
_L2:
        try
        {
            ((zzrk) (obj)).c.addAll(c);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw new AssertionError(obj);
        }
        if (true) goto _L4; else goto _L3
_L3:
        if (!(b instanceof zzrn))
        {
            break MISSING_BLOCK_LABEL_93;
        }
        obj.b = ((zzrn)b).f();
        return ((zzrk) (obj));
        if (!(b instanceof byte[]))
        {
            break MISSING_BLOCK_LABEL_122;
        }
        obj.b = ((byte[])(byte[])b).clone();
        return ((zzrk) (obj));
        if (!(b instanceof byte[][])) goto _L6; else goto _L5
_L5:
        Object obj1;
        Object obj2;
        obj1 = (byte[][])(byte[][])b;
        obj2 = new byte[obj1.length][];
        obj.b = obj2;
        i = 0;
_L8:
        if (i >= obj1.length)
        {
            break; /* Loop/switch isn't completed */
        }
        obj2[i] = (byte[])obj1[i].clone();
        i++;
        if (true) goto _L8; else goto _L7
_L6:
        if (!(b instanceof boolean[]))
        {
            break MISSING_BLOCK_LABEL_216;
        }
        obj.b = ((boolean[])(boolean[])b).clone();
        return ((zzrk) (obj));
        if (!(b instanceof int[]))
        {
            break MISSING_BLOCK_LABEL_245;
        }
        obj.b = ((int[])(int[])b).clone();
        return ((zzrk) (obj));
        if (!(b instanceof long[]))
        {
            break MISSING_BLOCK_LABEL_274;
        }
        obj.b = ((long[])(long[])b).clone();
        return ((zzrk) (obj));
        if (!(b instanceof float[]))
        {
            break MISSING_BLOCK_LABEL_303;
        }
        obj.b = ((float[])(float[])b).clone();
        return ((zzrk) (obj));
        if (!(b instanceof double[]))
        {
            break MISSING_BLOCK_LABEL_332;
        }
        obj.b = ((double[])(double[])b).clone();
        return ((zzrk) (obj));
        if (!(b instanceof zzrn[])) goto _L7; else goto _L9
_L9:
        obj1 = (zzrn[])(zzrn[])b;
        obj2 = new zzrn[obj1.length];
        obj.b = obj2;
_L11:
        if (i >= obj1.length) goto _L7; else goto _L10
_L10:
        obj2[i] = obj1[i].f();
        i++;
          goto _L11
_L7:
        return ((zzrk) (obj));
    }

    public Object clone()
    {
        return b();
    }

    public boolean equals(Object obj)
    {
        boolean flag2 = false;
        boolean flag;
        if (obj == this)
        {
            flag = true;
        } else
        {
            flag = flag2;
            if (obj instanceof zzrk)
            {
                obj = (zzrk)obj;
                if (b != null && ((zzrk) (obj)).b != null)
                {
                    flag = flag2;
                    if (a == ((zzrk) (obj)).a)
                    {
                        if (!a.b.isArray())
                        {
                            return b.equals(((zzrk) (obj)).b);
                        }
                        if (b instanceof byte[])
                        {
                            return Arrays.equals((byte[])(byte[])b, (byte[])(byte[])((zzrk) (obj)).b);
                        }
                        if (b instanceof int[])
                        {
                            return Arrays.equals((int[])(int[])b, (int[])(int[])((zzrk) (obj)).b);
                        }
                        if (b instanceof long[])
                        {
                            return Arrays.equals((long[])(long[])b, (long[])(long[])((zzrk) (obj)).b);
                        }
                        if (b instanceof float[])
                        {
                            return Arrays.equals((float[])(float[])b, (float[])(float[])((zzrk) (obj)).b);
                        }
                        if (b instanceof double[])
                        {
                            return Arrays.equals((double[])(double[])b, (double[])(double[])((zzrk) (obj)).b);
                        }
                        if (b instanceof boolean[])
                        {
                            return Arrays.equals((boolean[])(boolean[])b, (boolean[])(boolean[])((zzrk) (obj)).b);
                        } else
                        {
                            return Arrays.deepEquals((Object[])(Object[])b, (Object[])(Object[])((zzrk) (obj)).b);
                        }
                    }
                } else
                {
                    if (c != null && ((zzrk) (obj)).c != null)
                    {
                        return c.equals(((zzrk) (obj)).c);
                    }
                    boolean flag1;
                    try
                    {
                        flag1 = Arrays.equals(c(), ((zzrk) (obj)).c());
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

    public int hashCode()
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
