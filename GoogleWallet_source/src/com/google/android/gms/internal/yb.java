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
//            xx, xz, yg

final class yb
{

    private xz aYq;
    private Object aYr;
    private List aYs;

    yb()
    {
        aYs = new ArrayList();
    }

    private byte[] toByteArray()
        throws IOException
    {
        byte abyte0[] = new byte[c()];
        writeTo(xx.u(abyte0));
        return abyte0;
    }

    final int c()
    {
        if (aYr == null) goto _L2; else goto _L1
_L1:
        int j = aYq.I(aYr);
_L4:
        return j;
_L2:
        Iterator iterator = aYs.iterator();
        int i = 0;
        do
        {
            j = i;
            if (!iterator.hasNext())
            {
                continue;
            }
            i = ((yg)iterator.next()).c() + i;
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
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
            if (obj instanceof yb)
            {
                obj = (yb)obj;
                if (aYr != null && ((yb) (obj)).aYr != null)
                {
                    flag = flag2;
                    if (aYq == ((yb) (obj)).aYq)
                    {
                        if (!aYq.aYk.isArray())
                        {
                            return aYr.equals(((yb) (obj)).aYr);
                        }
                        if (aYr instanceof byte[])
                        {
                            return Arrays.equals((byte[])aYr, (byte[])((yb) (obj)).aYr);
                        }
                        if (aYr instanceof int[])
                        {
                            return Arrays.equals((int[])aYr, (int[])((yb) (obj)).aYr);
                        }
                        if (aYr instanceof long[])
                        {
                            return Arrays.equals((long[])aYr, (long[])((yb) (obj)).aYr);
                        }
                        if (aYr instanceof float[])
                        {
                            return Arrays.equals((float[])aYr, (float[])((yb) (obj)).aYr);
                        }
                        if (aYr instanceof double[])
                        {
                            return Arrays.equals((double[])aYr, (double[])((yb) (obj)).aYr);
                        }
                        if (aYr instanceof boolean[])
                        {
                            return Arrays.equals((boolean[])aYr, (boolean[])((yb) (obj)).aYr);
                        } else
                        {
                            return Arrays.deepEquals((Object[])aYr, (Object[])((yb) (obj)).aYr);
                        }
                    }
                } else
                {
                    if (aYs != null && ((yb) (obj)).aYs != null)
                    {
                        return aYs.equals(((yb) (obj)).aYs);
                    }
                    boolean flag1;
                    try
                    {
                        flag1 = Arrays.equals(toByteArray(), ((yb) (obj)).toByteArray());
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
            i = Arrays.hashCode(toByteArray());
        }
        catch (IOException ioexception)
        {
            throw new IllegalStateException(ioexception);
        }
        return i + 527;
    }

    final void writeTo(xx xx1)
        throws IOException
    {
        if (aYr != null)
        {
            aYq.a(aYr, xx1);
        } else
        {
            Iterator iterator = aYs.iterator();
            while (iterator.hasNext()) 
            {
                ((yg)iterator.next()).writeTo(xx1);
            }
        }
    }
}
