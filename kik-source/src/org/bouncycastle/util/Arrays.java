// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.util;


public final class Arrays
{

    private Arrays()
    {
    }

    public static void a(byte abyte0[])
    {
        for (int i = 0; i < abyte0.length; i++)
        {
            abyte0[i] = 0;
        }

    }

    public static void a(long al[])
    {
        for (int i = 0; i < al.length; i++)
        {
            al[i] = 0L;
        }

    }

    public static void a(short aword0[])
    {
        for (int i = 0; i < aword0.length; i++)
        {
            aword0[i] = 0;
        }

    }

    public static boolean a(byte abyte0[], byte abyte1[])
    {
        boolean flag1 = false;
        if (abyte0 != abyte1) goto _L2; else goto _L1
_L1:
        boolean flag = true;
_L4:
        return flag;
_L2:
        flag = flag1;
        if (abyte0 != null)
        {
            flag = flag1;
            if (abyte1 != null)
            {
                flag = flag1;
                if (abyte0.length == abyte1.length)
                {
                    int i = 0;
label0:
                    do
                    {
label1:
                        {
                            if (i == abyte0.length)
                            {
                                break label1;
                            }
                            flag = flag1;
                            if (abyte0[i] != abyte1[i])
                            {
                                break label0;
                            }
                            i++;
                        }
                    } while (true);
                }
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
        return true;
    }

    public static int[] a(int ai[])
    {
        if (ai == null)
        {
            return null;
        } else
        {
            int ai1[] = new int[ai.length];
            System.arraycopy(ai, 0, ai1, 0, ai.length);
            return ai1;
        }
    }

    public static int b(byte abyte0[])
    {
        if (abyte0 != null) goto _L2; else goto _L1
_L1:
        int j = 0;
_L4:
        return j;
_L2:
        j = abyte0.length;
        int i = j + 1;
        do
        {
            int k = j - 1;
            j = i;
            if (k < 0)
            {
                continue;
            }
            i = i * 257 ^ abyte0[k];
            j = k;
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    public static boolean b(byte abyte0[], byte abyte1[])
    {
        boolean flag1 = false;
        boolean flag;
        if (abyte0 == abyte1)
        {
            flag = true;
        } else
        {
            flag = flag1;
            if (abyte0 != null)
            {
                flag = flag1;
                if (abyte1 != null)
                {
                    flag = flag1;
                    if (abyte0.length == abyte1.length)
                    {
                        int i = 0;
                        int j = 0;
                        for (; i != abyte0.length; i++)
                        {
                            j |= abyte0[i] ^ abyte1[i];
                        }

                        flag = flag1;
                        if (j == 0)
                        {
                            return true;
                        }
                    }
                }
            }
        }
        return flag;
    }

    public static byte[] c(byte abyte0[])
    {
        if (abyte0 == null)
        {
            return null;
        } else
        {
            byte abyte1[] = new byte[abyte0.length];
            System.arraycopy(abyte0, 0, abyte1, 0, abyte0.length);
            return abyte1;
        }
    }
}
