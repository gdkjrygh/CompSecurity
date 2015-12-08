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
//            zzwr, zzwt, zzxa, zzwy

class zzwv
    implements Cloneable
{

    private zzwt zzaHI;
    private Object zzaHJ;
    private List zzaHK;

    zzwv()
    {
        zzaHK = new ArrayList();
    }

    private byte[] toByteArray()
    {
        byte abyte0[] = new byte[zzc()];
        zza(zzwr.zzu(abyte0));
        return abyte0;
    }

    public Object clone()
    {
        return zzvP();
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
            if (obj instanceof zzwv)
            {
                obj = (zzwv)obj;
                if (zzaHJ != null && ((zzwv) (obj)).zzaHJ != null)
                {
                    flag = flag2;
                    if (zzaHI == ((zzwv) (obj)).zzaHI)
                    {
                        if (!zzaHI.zzaHC.isArray())
                        {
                            return zzaHJ.equals(((zzwv) (obj)).zzaHJ);
                        }
                        if (zzaHJ instanceof byte[])
                        {
                            return Arrays.equals((byte[])zzaHJ, (byte[])((zzwv) (obj)).zzaHJ);
                        }
                        if (zzaHJ instanceof int[])
                        {
                            return Arrays.equals((int[])zzaHJ, (int[])((zzwv) (obj)).zzaHJ);
                        }
                        if (zzaHJ instanceof long[])
                        {
                            return Arrays.equals((long[])zzaHJ, (long[])((zzwv) (obj)).zzaHJ);
                        }
                        if (zzaHJ instanceof float[])
                        {
                            return Arrays.equals((float[])zzaHJ, (float[])((zzwv) (obj)).zzaHJ);
                        }
                        if (zzaHJ instanceof double[])
                        {
                            return Arrays.equals((double[])zzaHJ, (double[])((zzwv) (obj)).zzaHJ);
                        }
                        if (zzaHJ instanceof boolean[])
                        {
                            return Arrays.equals((boolean[])zzaHJ, (boolean[])((zzwv) (obj)).zzaHJ);
                        } else
                        {
                            return Arrays.deepEquals((Object[])zzaHJ, (Object[])((zzwv) (obj)).zzaHJ);
                        }
                    }
                } else
                {
                    if (zzaHK != null && ((zzwv) (obj)).zzaHK != null)
                    {
                        return zzaHK.equals(((zzwv) (obj)).zzaHK);
                    }
                    boolean flag1;
                    try
                    {
                        flag1 = Arrays.equals(toByteArray(), ((zzwv) (obj)).toByteArray());
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

    void zza(zzwr zzwr1)
    {
        if (zzaHJ != null)
        {
            zzaHI.zza(zzaHJ, zzwr1);
        } else
        {
            Iterator iterator = zzaHK.iterator();
            while (iterator.hasNext()) 
            {
                ((zzxa)iterator.next()).zza(zzwr1);
            }
        }
    }

    void zza(zzxa zzxa1)
    {
        zzaHK.add(zzxa1);
    }

    int zzc()
    {
        if (zzaHJ == null) goto _L2; else goto _L1
_L1:
        int j = zzaHI.zzF(zzaHJ);
_L4:
        return j;
_L2:
        Iterator iterator = zzaHK.iterator();
        int i = 0;
        do
        {
            j = i;
            if (!iterator.hasNext())
            {
                continue;
            }
            i = ((zzxa)iterator.next()).zzc() + i;
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final zzwv zzvP()
    {
        Object obj;
        int i;
        i = 0;
        obj = new zzwv();
        obj.zzaHI = zzaHI;
        if (zzaHK != null) goto _L2; else goto _L1
_L1:
        obj.zzaHK = null;
_L7:
        if (zzaHJ == null) goto _L4; else goto _L3
_L3:
        if (!(zzaHJ instanceof zzwy)) goto _L6; else goto _L5
_L5:
        obj.zzaHJ = ((zzwy)zzaHJ).zzvN();
        return ((zzwv) (obj));
_L2:
        try
        {
            ((zzwv) (obj)).zzaHK.addAll(zzaHK);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw new AssertionError(obj);
        }
          goto _L7
_L6:
        if (!(zzaHJ instanceof byte[]))
        {
            break MISSING_BLOCK_LABEL_117;
        }
        obj.zzaHJ = ((byte[])zzaHJ).clone();
        return ((zzwv) (obj));
        if (!(zzaHJ instanceof byte[][])) goto _L9; else goto _L8
_L8:
        Object obj1;
        Object obj2;
        obj1 = (byte[][])zzaHJ;
        obj2 = new byte[obj1.length][];
        obj.zzaHJ = obj2;
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
        if (!(zzaHJ instanceof boolean[]))
        {
            break MISSING_BLOCK_LABEL_205;
        }
        obj.zzaHJ = ((boolean[])zzaHJ).clone();
        return ((zzwv) (obj));
        if (!(zzaHJ instanceof int[]))
        {
            break MISSING_BLOCK_LABEL_231;
        }
        obj.zzaHJ = ((int[])zzaHJ).clone();
        return ((zzwv) (obj));
        if (!(zzaHJ instanceof long[]))
        {
            break MISSING_BLOCK_LABEL_257;
        }
        obj.zzaHJ = ((long[])zzaHJ).clone();
        return ((zzwv) (obj));
        if (!(zzaHJ instanceof float[]))
        {
            break MISSING_BLOCK_LABEL_283;
        }
        obj.zzaHJ = ((float[])zzaHJ).clone();
        return ((zzwv) (obj));
        if (!(zzaHJ instanceof double[]))
        {
            break MISSING_BLOCK_LABEL_309;
        }
        obj.zzaHJ = ((double[])zzaHJ).clone();
        return ((zzwv) (obj));
        if (!(zzaHJ instanceof zzwy[])) goto _L4; else goto _L11
_L11:
        obj1 = (zzwy[])zzaHJ;
        obj2 = new zzwy[obj1.length];
        obj.zzaHJ = obj2;
_L13:
        if (i >= obj1.length) goto _L4; else goto _L12
_L12:
        obj2[i] = obj1[i].zzvN();
        i++;
          goto _L13
_L4:
        return ((zzwv) (obj));
    }
}
