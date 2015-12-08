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
//            pg, pi, pp

class pk
{

    private pi awQ;
    private Object awR;
    private List awS;

    pk()
    {
        awS = new ArrayList();
    }

    private byte[] toByteArray()
        throws IOException
    {
        byte abyte0[] = new byte[c()];
        a(pg.q(abyte0));
        return abyte0;
    }

    void a(pg pg1)
        throws IOException
    {
        if (awR != null)
        {
            awQ.a(awR, pg1);
        } else
        {
            Iterator iterator = awS.iterator();
            while (iterator.hasNext()) 
            {
                ((pp)iterator.next()).a(pg1);
            }
        }
    }

    void a(pp pp1)
    {
        awS.add(pp1);
    }

    Object b(pi pi1)
    {
        if (awR != null)
        {
            if (awQ != pi1)
            {
                throw new IllegalStateException("Tried to getExtension with a differernt Extension.");
            }
        } else
        {
            awQ = pi1;
            awR = pi1.l(awS);
            awS = null;
        }
        return awR;
    }

    int c()
    {
        if (awR == null) goto _L2; else goto _L1
_L1:
        int j = awQ.A(awR);
_L4:
        return j;
_L2:
        Iterator iterator = awS.iterator();
        int i = 0;
        do
        {
            j = i;
            if (!iterator.hasNext())
            {
                continue;
            }
            i = ((pp)iterator.next()).c() + i;
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
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
            if (obj instanceof pk)
            {
                obj = (pk)obj;
                if (awR != null && ((pk) (obj)).awR != null)
                {
                    flag = flag2;
                    if (awQ == ((pk) (obj)).awQ)
                    {
                        if (!awQ.awK.isArray())
                        {
                            return awR.equals(((pk) (obj)).awR);
                        }
                        if (awR instanceof byte[])
                        {
                            return Arrays.equals((byte[])(byte[])awR, (byte[])(byte[])((pk) (obj)).awR);
                        }
                        if (awR instanceof int[])
                        {
                            return Arrays.equals((int[])(int[])awR, (int[])(int[])((pk) (obj)).awR);
                        }
                        if (awR instanceof long[])
                        {
                            return Arrays.equals((long[])(long[])awR, (long[])(long[])((pk) (obj)).awR);
                        }
                        if (awR instanceof float[])
                        {
                            return Arrays.equals((float[])(float[])awR, (float[])(float[])((pk) (obj)).awR);
                        }
                        if (awR instanceof double[])
                        {
                            return Arrays.equals((double[])(double[])awR, (double[])(double[])((pk) (obj)).awR);
                        }
                        if (awR instanceof boolean[])
                        {
                            return Arrays.equals((boolean[])(boolean[])awR, (boolean[])(boolean[])((pk) (obj)).awR);
                        } else
                        {
                            return Arrays.deepEquals((Object[])(Object[])awR, (Object[])(Object[])((pk) (obj)).awR);
                        }
                    }
                } else
                {
                    if (awS != null && ((pk) (obj)).awS != null)
                    {
                        return awS.equals(((pk) (obj)).awS);
                    }
                    boolean flag1;
                    try
                    {
                        flag1 = Arrays.equals(toByteArray(), ((pk) (obj)).toByteArray());
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
            i = Arrays.hashCode(toByteArray());
        }
        catch (IOException ioexception)
        {
            throw new IllegalStateException(ioexception);
        }
        return i + 527;
    }
}
