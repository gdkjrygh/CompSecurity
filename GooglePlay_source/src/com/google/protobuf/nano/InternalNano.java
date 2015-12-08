// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.protobuf.nano;

import java.util.Arrays;

// Referenced classes of package com.google.protobuf.nano:
//            ExtendableMessageNano, FieldArray

public final class InternalNano
{

    public static final Object LAZY_INIT_LOCK = new Object();

    public static void cloneUnknownFieldData(ExtendableMessageNano extendablemessagenano, ExtendableMessageNano extendablemessagenano1)
    {
        if (extendablemessagenano.unknownFieldData != null)
        {
            extendablemessagenano1.unknownFieldData = extendablemessagenano.unknownFieldData.clone();
        }
    }

    public static boolean equals(int ai[], int ai1[])
    {
        if (ai == null || ai.length == 0)
        {
            return ai1 == null || ai1.length == 0;
        } else
        {
            return Arrays.equals(ai, ai1);
        }
    }

    public static boolean equals(long al[], long al1[])
    {
        if (al == null || al.length == 0)
        {
            return al1 == null || al1.length == 0;
        } else
        {
            return Arrays.equals(al, al1);
        }
    }

    public static boolean equals(Object aobj[], Object aobj1[])
    {
        int i;
        int j;
        int k;
        int l;
        int i1;
        boolean flag2;
        flag2 = false;
        i = 0;
        if (aobj == null)
        {
            k = 0;
        } else
        {
            k = aobj.length;
        }
        j = 0;
        if (aobj1 == null)
        {
            l = 0;
        } else
        {
            l = aobj1.length;
        }
_L7:
        boolean flag;
        boolean flag1;
        i1 = j;
        if (i < k)
        {
            i1 = j;
            if (aobj[i] == null)
            {
                i++;
                continue; /* Loop/switch isn't completed */
            }
        }
        for (; i1 < l && aobj1[i1] == null; i1++) { }
        if (i >= k)
        {
            j = 1;
        } else
        {
            j = 0;
        }
        if (i1 >= l)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (j == 0 || !flag) goto _L2; else goto _L1
_L1:
        flag1 = true;
_L4:
        return flag1;
_L2:
        flag1 = flag2;
        if (j != flag) goto _L4; else goto _L3
_L3:
        flag1 = flag2;
        if (!aobj[i].equals(aobj1[i1])) goto _L4; else goto _L5
_L5:
        i++;
        j = i1 + 1;
        if (true) goto _L7; else goto _L6
_L6:
    }

    public static boolean equals(byte abyte0[][], byte abyte1[][])
    {
        int i;
        int j;
        int k;
        int l;
        int i1;
        boolean flag2;
        flag2 = false;
        i = 0;
        if (abyte0 == null)
        {
            k = 0;
        } else
        {
            k = abyte0.length;
        }
        j = 0;
        if (abyte1 == null)
        {
            l = 0;
        } else
        {
            l = abyte1.length;
        }
_L7:
        boolean flag;
        boolean flag1;
        i1 = j;
        if (i < k)
        {
            i1 = j;
            if (abyte0[i] == null)
            {
                i++;
                continue; /* Loop/switch isn't completed */
            }
        }
        for (; i1 < l && abyte1[i1] == null; i1++) { }
        if (i >= k)
        {
            j = 1;
        } else
        {
            j = 0;
        }
        if (i1 >= l)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (j == 0 || !flag) goto _L2; else goto _L1
_L1:
        flag1 = true;
_L4:
        return flag1;
_L2:
        flag1 = flag2;
        if (j != flag) goto _L4; else goto _L3
_L3:
        flag1 = flag2;
        if (!Arrays.equals(abyte0[i], abyte1[i1])) goto _L4; else goto _L5
_L5:
        i++;
        j = i1 + 1;
        if (true) goto _L7; else goto _L6
_L6:
    }

    public static int hashCode(int ai[])
    {
        if (ai == null || ai.length == 0)
        {
            return 0;
        } else
        {
            return Arrays.hashCode(ai);
        }
    }

    public static int hashCode(long al[])
    {
        if (al == null || al.length == 0)
        {
            return 0;
        } else
        {
            return Arrays.hashCode(al);
        }
    }

    public static int hashCode(Object aobj[])
    {
        int k = 0;
        int j = 0;
        int i;
        if (aobj == null)
        {
            i = 0;
        } else
        {
            i = aobj.length;
        }
        while (j < i) 
        {
            Object obj = aobj[j];
            int l = k;
            if (obj != null)
            {
                l = k * 31 + obj.hashCode();
            }
            j++;
            k = l;
        }
        return k;
    }

    public static int hashCode(byte abyte0[][])
    {
        int k = 0;
        int j = 0;
        int i;
        if (abyte0 == null)
        {
            i = 0;
        } else
        {
            i = abyte0.length;
        }
        while (j < i) 
        {
            byte abyte1[] = abyte0[j];
            int l = k;
            if (abyte1 != null)
            {
                l = k * 31 + Arrays.hashCode(abyte1);
            }
            j++;
            k = l;
        }
        return k;
    }

}
