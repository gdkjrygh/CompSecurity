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
//            qp, qr, qy

class qt
{

    private qr azd;
    private Object aze;
    private List azf;

    qt()
    {
        azf = new ArrayList();
    }

    private byte[] toByteArray()
        throws IOException
    {
        byte abyte0[] = new byte[c()];
        a(qp.q(abyte0));
        return abyte0;
    }

    void a(qp qp1)
        throws IOException
    {
        if (aze != null)
        {
            azd.a(aze, qp1);
        } else
        {
            Iterator iterator = azf.iterator();
            while (iterator.hasNext()) 
            {
                ((qy)iterator.next()).a(qp1);
            }
        }
    }

    void a(qy qy1)
    {
        azf.add(qy1);
    }

    Object b(qr qr1)
    {
        if (aze != null)
        {
            if (azd != qr1)
            {
                throw new IllegalStateException("Tried to getExtension with a differernt Extension.");
            }
        } else
        {
            azd = qr1;
            aze = qr1.m(azf);
            azf = null;
        }
        return aze;
    }

    int c()
    {
        if (aze == null) goto _L2; else goto _L1
_L1:
        int j = azd.B(aze);
_L4:
        return j;
_L2:
        Iterator iterator = azf.iterator();
        int i = 0;
        do
        {
            j = i;
            if (!iterator.hasNext())
            {
                continue;
            }
            i = ((qy)iterator.next()).c() + i;
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
            if (obj instanceof qt)
            {
                obj = (qt)obj;
                if (aze != null && ((qt) (obj)).aze != null)
                {
                    flag = flag2;
                    if (azd == ((qt) (obj)).azd)
                    {
                        if (!azd.ayX.isArray())
                        {
                            return aze.equals(((qt) (obj)).aze);
                        }
                        if (aze instanceof byte[])
                        {
                            return Arrays.equals((byte[])(byte[])aze, (byte[])(byte[])((qt) (obj)).aze);
                        }
                        if (aze instanceof int[])
                        {
                            return Arrays.equals((int[])(int[])aze, (int[])(int[])((qt) (obj)).aze);
                        }
                        if (aze instanceof long[])
                        {
                            return Arrays.equals((long[])(long[])aze, (long[])(long[])((qt) (obj)).aze);
                        }
                        if (aze instanceof float[])
                        {
                            return Arrays.equals((float[])(float[])aze, (float[])(float[])((qt) (obj)).aze);
                        }
                        if (aze instanceof double[])
                        {
                            return Arrays.equals((double[])(double[])aze, (double[])(double[])((qt) (obj)).aze);
                        }
                        if (aze instanceof boolean[])
                        {
                            return Arrays.equals((boolean[])(boolean[])aze, (boolean[])(boolean[])((qt) (obj)).aze);
                        } else
                        {
                            return Arrays.deepEquals((Object[])(Object[])aze, (Object[])(Object[])((qt) (obj)).aze);
                        }
                    }
                } else
                {
                    if (azf != null && ((qt) (obj)).azf != null)
                    {
                        return azf.equals(((qt) (obj)).azf);
                    }
                    boolean flag1;
                    try
                    {
                        flag1 = Arrays.equals(toByteArray(), ((qt) (obj)).toByteArray());
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
