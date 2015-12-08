// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.http.util;


public final class LangUtils
{

    public static final int HASH_OFFSET = 37;
    public static final int HASH_SEED = 17;

    private LangUtils()
    {
    }

    public static boolean equals(Object obj, Object obj1)
    {
        if (obj == null)
        {
            return obj1 == null;
        } else
        {
            return obj.equals(obj1);
        }
    }

    public static boolean equals(Object aobj[], Object aobj1[])
    {
        boolean flag1 = false;
        if (aobj != null) goto _L2; else goto _L1
_L1:
        boolean flag;
        flag = flag1;
        if (aobj1 == null)
        {
            flag = true;
        }
_L4:
        return flag;
_L2:
        flag = flag1;
        if (aobj1 != null)
        {
            flag = flag1;
            if (aobj.length == aobj1.length)
            {
                int i = 0;
label0:
                do
                {
label1:
                    {
                        if (i >= aobj.length)
                        {
                            break label1;
                        }
                        flag = flag1;
                        if (!equals(aobj[i], aobj1[i]))
                        {
                            break label0;
                        }
                        i++;
                    }
                } while (true);
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
        return true;
    }

    public static int hashCode(int i, int j)
    {
        return i * 37 + j;
    }

    public static int hashCode(int i, Object obj)
    {
        int j;
        if (obj != null)
        {
            j = obj.hashCode();
        } else
        {
            j = 0;
        }
        return hashCode(i, j);
    }

    public static int hashCode(int i, boolean flag)
    {
        int j;
        if (flag)
        {
            j = 1;
        } else
        {
            j = 0;
        }
        return hashCode(i, j);
    }
}
