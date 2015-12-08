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

    private zzri zzaWb;
    private Object zzaWc;
    private List zzaWd;

    zzrk()
    {
        zzaWd = new ArrayList();
    }

    private byte[] toByteArray()
        throws IOException
    {
        byte abyte0[] = new byte[zzB()];
        zza(zzrg.zzA(abyte0));
        return abyte0;
    }

    public Object clone()
        throws CloneNotSupportedException
    {
        return zzBM();
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
                if (zzaWc != null && ((zzrk) (obj)).zzaWc != null)
                {
                    flag = flag2;
                    if (zzaWb == ((zzrk) (obj)).zzaWb)
                    {
                        if (!zzaWb.zzaVV.isArray())
                        {
                            return zzaWc.equals(((zzrk) (obj)).zzaWc);
                        }
                        if (zzaWc instanceof byte[])
                        {
                            return Arrays.equals((byte[])(byte[])zzaWc, (byte[])(byte[])((zzrk) (obj)).zzaWc);
                        }
                        if (zzaWc instanceof int[])
                        {
                            return Arrays.equals((int[])(int[])zzaWc, (int[])(int[])((zzrk) (obj)).zzaWc);
                        }
                        if (zzaWc instanceof long[])
                        {
                            return Arrays.equals((long[])(long[])zzaWc, (long[])(long[])((zzrk) (obj)).zzaWc);
                        }
                        if (zzaWc instanceof float[])
                        {
                            return Arrays.equals((float[])(float[])zzaWc, (float[])(float[])((zzrk) (obj)).zzaWc);
                        }
                        if (zzaWc instanceof double[])
                        {
                            return Arrays.equals((double[])(double[])zzaWc, (double[])(double[])((zzrk) (obj)).zzaWc);
                        }
                        if (zzaWc instanceof boolean[])
                        {
                            return Arrays.equals((boolean[])(boolean[])zzaWc, (boolean[])(boolean[])((zzrk) (obj)).zzaWc);
                        } else
                        {
                            return Arrays.deepEquals((Object[])(Object[])zzaWc, (Object[])(Object[])((zzrk) (obj)).zzaWc);
                        }
                    }
                } else
                {
                    if (zzaWd != null && ((zzrk) (obj)).zzaWd != null)
                    {
                        return zzaWd.equals(((zzrk) (obj)).zzaWd);
                    }
                    boolean flag1;
                    try
                    {
                        flag1 = Arrays.equals(toByteArray(), ((zzrk) (obj)).toByteArray());
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

    int zzB()
    {
        if (zzaWc == null) goto _L2; else goto _L1
_L1:
        int j = zzaWb.zzQ(zzaWc);
_L4:
        return j;
_L2:
        Iterator iterator = zzaWd.iterator();
        int i = 0;
        do
        {
            j = i;
            if (!iterator.hasNext())
            {
                continue;
            }
            i = ((zzrp)iterator.next()).zzB() + i;
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final zzrk zzBM()
    {
        Object obj;
        int i;
        i = 0;
        obj = new zzrk();
        obj.zzaWb = zzaWb;
        if (zzaWd != null) goto _L2; else goto _L1
_L1:
        obj.zzaWd = null;
_L4:
        if (zzaWc == null)
        {
            return ((zzrk) (obj));
        }
        break; /* Loop/switch isn't completed */
_L2:
        try
        {
            ((zzrk) (obj)).zzaWd.addAll(zzaWd);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw new AssertionError(obj);
        }
        if (true) goto _L4; else goto _L3
_L3:
        if (!(zzaWc instanceof zzrn))
        {
            break MISSING_BLOCK_LABEL_93;
        }
        obj.zzaWc = ((zzrn)zzaWc).zzBK();
        return ((zzrk) (obj));
        if (!(zzaWc instanceof byte[]))
        {
            break MISSING_BLOCK_LABEL_122;
        }
        obj.zzaWc = ((byte[])(byte[])zzaWc).clone();
        return ((zzrk) (obj));
        if (!(zzaWc instanceof byte[][])) goto _L6; else goto _L5
_L5:
        Object obj1;
        Object obj2;
        obj1 = (byte[][])(byte[][])zzaWc;
        obj2 = new byte[obj1.length][];
        obj.zzaWc = obj2;
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
        if (!(zzaWc instanceof boolean[]))
        {
            break MISSING_BLOCK_LABEL_216;
        }
        obj.zzaWc = ((boolean[])(boolean[])zzaWc).clone();
        return ((zzrk) (obj));
        if (!(zzaWc instanceof int[]))
        {
            break MISSING_BLOCK_LABEL_245;
        }
        obj.zzaWc = ((int[])(int[])zzaWc).clone();
        return ((zzrk) (obj));
        if (!(zzaWc instanceof long[]))
        {
            break MISSING_BLOCK_LABEL_274;
        }
        obj.zzaWc = ((long[])(long[])zzaWc).clone();
        return ((zzrk) (obj));
        if (!(zzaWc instanceof float[]))
        {
            break MISSING_BLOCK_LABEL_303;
        }
        obj.zzaWc = ((float[])(float[])zzaWc).clone();
        return ((zzrk) (obj));
        if (!(zzaWc instanceof double[]))
        {
            break MISSING_BLOCK_LABEL_332;
        }
        obj.zzaWc = ((double[])(double[])zzaWc).clone();
        return ((zzrk) (obj));
        if (!(zzaWc instanceof zzrn[])) goto _L7; else goto _L9
_L9:
        obj1 = (zzrn[])(zzrn[])zzaWc;
        obj2 = new zzrn[obj1.length];
        obj.zzaWc = obj2;
_L11:
        if (i >= obj1.length) goto _L7; else goto _L10
_L10:
        obj2[i] = obj1[i].zzBK();
        i++;
          goto _L11
_L7:
        return ((zzrk) (obj));
    }

    void zza(zzrg zzrg1)
        throws IOException
    {
        if (zzaWc != null)
        {
            zzaWb.zza(zzaWc, zzrg1);
        } else
        {
            Iterator iterator = zzaWd.iterator();
            while (iterator.hasNext()) 
            {
                ((zzrp)iterator.next()).zza(zzrg1);
            }
        }
    }
}
