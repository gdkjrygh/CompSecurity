// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.util;

import java.math.BigInteger;

public final class Arrays
{

    private Arrays()
    {
    }

    public static int a(byte abyte0[])
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

    public static int a(char ac[])
    {
        if (ac != null) goto _L2; else goto _L1
_L1:
        int j = 0;
_L4:
        return j;
_L2:
        j = ac.length;
        int i = j + 1;
        do
        {
            int k = j - 1;
            j = i;
            if (k < 0)
            {
                continue;
            }
            i = i * 257 ^ ac[k];
            j = k;
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    public static int a(int ai[])
    {
        if (ai != null) goto _L2; else goto _L1
_L1:
        int j = 0;
_L4:
        return j;
_L2:
        j = ai.length;
        int i = j + 1;
        do
        {
            int k = j - 1;
            j = i;
            if (k < 0)
            {
                continue;
            }
            i = i * 257 ^ ai[k];
            j = k;
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    public static int a(BigInteger abiginteger[])
    {
        if (abiginteger != null) goto _L2; else goto _L1
_L1:
        int j = 0;
_L4:
        return j;
_L2:
        j = abiginteger.length;
        int i = j + 1;
        do
        {
            int k = j - 1;
            j = i;
            if (k < 0)
            {
                continue;
            }
            i = i * 257 ^ abiginteger[k].hashCode();
            j = k;
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    public static void a(byte abyte0[], byte byte0)
    {
        for (int i = 0; i < abyte0.length; i++)
        {
            abyte0[i] = byte0;
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

    public static boolean a(char ac[], char ac1[])
    {
        boolean flag1 = false;
        if (ac != ac1) goto _L2; else goto _L1
_L1:
        boolean flag = true;
_L4:
        return flag;
_L2:
        flag = flag1;
        if (ac != null)
        {
            flag = flag1;
            if (ac1 != null)
            {
                flag = flag1;
                if (ac.length == ac1.length)
                {
                    int i = 0;
label0:
                    do
                    {
label1:
                        {
                            if (i == ac.length)
                            {
                                break label1;
                            }
                            flag = flag1;
                            if (ac[i] != ac1[i])
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

    public static boolean a(int ai[], int ai1[])
    {
        boolean flag1 = false;
        if (ai != ai1) goto _L2; else goto _L1
_L1:
        boolean flag = true;
_L4:
        return flag;
_L2:
        flag = flag1;
        if (ai != null)
        {
            flag = flag1;
            if (ai1 != null)
            {
                flag = flag1;
                if (ai.length == ai1.length)
                {
                    int i = 0;
label0:
                    do
                    {
label1:
                        {
                            if (i == ai.length)
                            {
                                break label1;
                            }
                            flag = flag1;
                            if (ai[i] != ai1[i])
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

    public static boolean a(long al[], long al1[])
    {
        boolean flag1 = false;
        if (al != al1) goto _L2; else goto _L1
_L1:
        boolean flag = true;
_L4:
        return flag;
_L2:
        flag = flag1;
        if (al != null)
        {
            flag = flag1;
            if (al1 != null)
            {
                flag = flag1;
                if (al.length == al1.length)
                {
                    int i = 0;
label0:
                    do
                    {
label1:
                        {
                            if (i == al.length)
                            {
                                break label1;
                            }
                            flag = flag1;
                            if (al[i] != al1[i])
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

    public static boolean a(BigInteger abiginteger[], BigInteger abiginteger1[])
    {
        boolean flag1 = false;
        if (abiginteger != abiginteger1) goto _L2; else goto _L1
_L1:
        boolean flag = true;
_L4:
        return flag;
_L2:
        flag = flag1;
        if (abiginteger != null)
        {
            flag = flag1;
            if (abiginteger1 != null)
            {
                flag = flag1;
                if (abiginteger.length == abiginteger1.length)
                {
                    int i = 0;
label0:
                    do
                    {
label1:
                        {
                            if (i == abiginteger.length)
                            {
                                break label1;
                            }
                            flag = flag1;
                            if (!abiginteger[i].equals(abiginteger1[i]))
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

    public static int[] a(int ai[], int i)
    {
        int ai1[] = new int[i];
        if (i < ai.length)
        {
            System.arraycopy(ai, 0, ai1, 0, i);
            return ai1;
        } else
        {
            System.arraycopy(ai, 0, ai1, 0, ai.length);
            return ai1;
        }
    }

    public static int[] a(int ai[], int i, int j)
    {
        int k = j - i;
        if (k < 0)
        {
            throw new IllegalArgumentException((new StringBuilder()).append(i).append(" > ").append(j).toString());
        }
        int ai1[] = new int[k];
        if (ai.length - i < k)
        {
            System.arraycopy(ai, i, ai1, 0, ai.length - i);
            return ai1;
        } else
        {
            System.arraycopy(ai, i, ai1, 0, k);
            return ai1;
        }
    }

    public static long[] a(long al[], int i)
    {
        long al1[] = new long[i];
        if (i < al.length)
        {
            System.arraycopy(al, 0, al1, 0, i);
            return al1;
        } else
        {
            System.arraycopy(al, 0, al1, 0, al.length);
            return al1;
        }
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

    public static byte[] b(byte abyte0[])
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

    public static int[] b(int ai[])
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
}
