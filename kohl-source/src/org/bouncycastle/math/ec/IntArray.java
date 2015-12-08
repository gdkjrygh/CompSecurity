// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.math.ec;

import java.math.BigInteger;
import org.bouncycastle.util.Arrays;

// Referenced classes of package org.bouncycastle.math.ec:
//            ECConstants

class IntArray
{

    private int m_ints[];

    public IntArray(int i)
    {
        m_ints = new int[i];
    }

    public IntArray(BigInteger biginteger)
    {
        this(biginteger, 0);
    }

    public IntArray(BigInteger biginteger, int i)
    {
        int j = 1;
        super();
        if (biginteger.signum() == -1)
        {
            throw new IllegalArgumentException("Only positive Integers allowed");
        }
        if (biginteger.equals(ECConstants.ZERO))
        {
            m_ints = (new int[] {
                0
            });
        } else
        {
            biginteger = biginteger.toByteArray();
            int k = biginteger.length;
            int k1;
            int i2;
            if (biginteger[0] == 0)
            {
                k--;
            } else
            {
                j = 0;
            }
            k1 = (k + 3) / 4;
            if (k1 < i)
            {
                m_ints = new int[i];
            } else
            {
                m_ints = new int[k1];
            }
            k1--;
            i2 = k % 4 + j;
            if (j < i2)
            {
                i = j;
                int l;
                for (j = 0; i < i2; j = l | j << 8)
                {
                    byte byte0 = biginteger[i];
                    l = byte0;
                    if (byte0 < 0)
                    {
                        l = byte0 + 256;
                    }
                    i++;
                }

                m_ints[k1] = j;
                int i1 = k1 - 1;
                j = i;
                i = i1;
            } else
            {
                i = k1;
            }
            while (i >= 0) 
            {
                k1 = 0;
                int j1;
                int l1;
                for (j1 = 0; k1 < 4; j1 = j1 << 8 | l1)
                {
                    byte byte1 = biginteger[j];
                    l1 = byte1;
                    if (byte1 < 0)
                    {
                        l1 = byte1 + 256;
                    }
                    k1++;
                    j++;
                }

                m_ints[i] = j1;
                i--;
            }
        }
    }

    public IntArray(int ai[])
    {
        m_ints = ai;
    }

    private int[] resizedInts(int i)
    {
        int ai[] = new int[i];
        int k = m_ints.length;
        int j = i;
        if (k < i)
        {
            j = k;
        }
        System.arraycopy(m_ints, 0, ai, 0, j);
        return ai;
    }

    public void addShifted(IntArray intarray, int i)
    {
        int l = intarray.getUsedLength();
        int j = l + i;
        if (j > m_ints.length)
        {
            m_ints = resizedInts(j);
        }
        for (int k = 0; k < l; k++)
        {
            int ai[] = m_ints;
            int i1 = k + i;
            ai[i1] = ai[i1] ^ intarray.m_ints[k];
        }

    }

    public int bitLength()
    {
        int i = getUsedLength();
        if (i != 0) goto _L2; else goto _L1
_L1:
        int k = 0;
_L4:
        return k;
_L2:
        i--;
        k = m_ints[i];
        int l = (i << 5) + 1;
        int j;
        if ((0xffff0000 & k) != 0)
        {
            if ((0xff000000 & k) != 0)
            {
                i = l + 24;
                j = k >>> 24;
            } else
            {
                i = l + 16;
                j = k >>> 16;
            }
        } else
        {
            i = l;
            j = k;
            if (k > 255)
            {
                i = l + 8;
                j = k >>> 8;
            }
        }
        k = i;
        if (j != 1)
        {
            i++;
            j >>>= 1;
            break MISSING_BLOCK_LABEL_56;
        }
        continue; /* Loop/switch isn't completed */
        if (true) goto _L4; else goto _L3
_L3:
    }

    public Object clone()
    {
        return new IntArray(Arrays.clone(m_ints));
    }

    public boolean equals(Object obj)
    {
        if (obj instanceof IntArray) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        obj = (IntArray)obj;
        int j = getUsedLength();
        if (((IntArray) (obj)).getUsedLength() == j)
        {
            int i = 0;
label0:
            do
            {
label1:
                {
                    if (i >= j)
                    {
                        break label1;
                    }
                    if (m_ints[i] != ((IntArray) (obj)).m_ints[i])
                    {
                        break label0;
                    }
                    i++;
                }
            } while (true);
        }
        if (true) goto _L1; else goto _L3
_L3:
        return true;
    }

    public void flipBit(int i)
    {
        int j = i >> 5;
        int ai[] = m_ints;
        ai[j] = 1 << (i & 0x1f) ^ ai[j];
    }

    public int getLength()
    {
        return m_ints.length;
    }

    public int getUsedLength()
    {
        int j = m_ints.length;
        if (j < 1)
        {
            return 0;
        }
        int i = j;
        if (m_ints[0] != 0)
        {
            int ai[];
            do
            {
                ai = m_ints;
                i = j - 1;
                j = i;
            } while (ai[i] == 0);
            return i + 1;
        }
        do
        {
            int ai1[] = m_ints;
            j = i - 1;
            if (ai1[j] != 0)
            {
                return j + 1;
            }
            i = j;
        } while (j > 0);
        return 0;
    }

    public int hashCode()
    {
        int k = getUsedLength();
        int j = 1;
        for (int i = 0; i < k; i++)
        {
            j = j * 31 + m_ints[i];
        }

        return j;
    }

    public boolean isZero()
    {
        boolean flag;
label0:
        {
            boolean flag1 = false;
            if (m_ints.length != 0)
            {
                flag = flag1;
                if (m_ints[0] != 0)
                {
                    break label0;
                }
                flag = flag1;
                if (getUsedLength() != 0)
                {
                    break label0;
                }
            }
            flag = true;
        }
        return flag;
    }

    public IntArray multiply(IntArray intarray, int i)
    {
        int l = i + 31 >> 5;
        if (m_ints.length < l)
        {
            m_ints = resizedInts(l);
        }
        intarray = new IntArray(intarray.resizedInts(intarray.getLength() + 1));
        IntArray intarray1 = new IntArray(i + i + 31 >> 5);
        i = 0;
        int j = 1;
        for (; i < 32; i++)
        {
            for (int k = 0; k < l; k++)
            {
                if ((m_ints[k] & j) != 0)
                {
                    intarray1.addShifted(intarray, k);
                }
            }

            j <<= 1;
            intarray.shiftLeft();
        }

        return intarray1;
    }

    public void reduce(int i, int ai[])
    {
label0:
        for (int j = (i + i) - 2; j >= i; j--)
        {
            if (!testBit(j))
            {
                continue;
            }
            int l = j - i;
            flipBit(l);
            flipBit(j);
            int k = ai.length;
            do
            {
                k--;
                if (k < 0)
                {
                    continue label0;
                }
                flipBit(ai[k] + l);
            } while (true);
        }

        m_ints = resizedInts(i + 31 >> 5);
    }

    public void setBit(int i)
    {
        int j = i >> 5;
        int ai[] = m_ints;
        ai[j] = 1 << (i & 0x1f) | ai[j];
    }

    public IntArray shiftLeft(int i)
    {
        int k;
        for (k = getUsedLength(); k == 0 || i == 0;)
        {
            return this;
        }

        if (i > 31)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("shiftLeft() for max 31 bits , ").append(i).append("bit shift is not possible").toString());
        }
        int ai[] = new int[k + 1];
        int l = 32 - i;
        ai[0] = m_ints[0] << i;
        for (int j = 1; j < k; j++)
        {
            ai[j] = m_ints[j] << i | m_ints[j - 1] >>> l;
        }

        ai[k] = m_ints[k - 1] >>> l;
        return new IntArray(ai);
    }

    public void shiftLeft()
    {
        int i = getUsedLength();
        if (i != 0)
        {
            int j = i;
            if (m_ints[i - 1] < 0)
            {
                i++;
                j = i;
                if (i > m_ints.length)
                {
                    m_ints = resizedInts(m_ints.length + 1);
                    j = i;
                }
            }
            int k = 0;
            boolean flag1 = false;
            while (k < j) 
            {
                int ai[];
                boolean flag;
                if (m_ints[k] < 0)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                ai = m_ints;
                ai[k] = ai[k] << 1;
                if (flag1)
                {
                    int ai1[] = m_ints;
                    ai1[k] = ai1[k] | 1;
                }
                k++;
                flag1 = flag;
            }
        }
    }

    public IntArray square(int i)
    {
        int ai[] = new int[16];
        int[] _tmp = ai;
        ai[0] = 0;
        ai[1] = 1;
        ai[2] = 4;
        ai[3] = 5;
        ai[4] = 16;
        ai[5] = 17;
        ai[6] = 20;
        ai[7] = 21;
        ai[8] = 64;
        ai[9] = 65;
        ai[10] = 68;
        ai[11] = 69;
        ai[12] = 80;
        ai[13] = 81;
        ai[14] = 84;
        ai[15] = 85;
        int l = i + 31 >> 5;
        if (m_ints.length < l)
        {
            m_ints = resizedInts(l);
        }
        IntArray intarray = new IntArray(l + l);
        for (i = 0; i < l; i++)
        {
            int j = 0;
            int k = 0;
            for (; j < 4; j++)
            {
                k = k >>> 8 | ai[m_ints[i] >>> j * 4 & 0xf] << 24;
            }

            intarray.m_ints[i + i] = k;
            int i1 = m_ints[i];
            j = 0;
            k = 0;
            for (; j < 4; j++)
            {
                k = k >>> 8 | ai[i1 >>> 16 >>> j * 4 & 0xf] << 24;
            }

            intarray.m_ints[i + i + 1] = k;
        }

        return intarray;
    }

    public boolean testBit(int i)
    {
        return (m_ints[i >> 5] & 1 << (i & 0x1f)) != 0;
    }

    public BigInteger toBigInteger()
    {
        int k1 = getUsedLength();
        if (k1 == 0)
        {
            return ECConstants.ZERO;
        }
        int l1 = m_ints[k1 - 1];
        byte abyte0[] = new byte[4];
        int j = 3;
        boolean flag = false;
        int i;
        int i1;
        for (i = 0; j >= 0; i = i1)
        {
label0:
            {
                byte byte0 = (byte)(l1 >>> j * 8);
                if (!flag)
                {
                    i1 = i;
                    if (byte0 == 0)
                    {
                        break label0;
                    }
                }
                abyte0[i] = byte0;
                i1 = i + 1;
                flag = true;
            }
            j--;
        }

        byte abyte1[] = new byte[(k1 - 1) * 4 + i];
        for (int k = 0; k < i; k++)
        {
            abyte1[k] = abyte0[k];
        }

        for (int l = k1 - 2; l >= 0; l--)
        {
            for (int j1 = 3; j1 >= 0;)
            {
                abyte1[i] = (byte)(m_ints[l] >>> j1 * 8);
                j1--;
                i++;
            }

        }

        return new BigInteger(1, abyte1);
    }

    public String toString()
    {
        int i = getUsedLength();
        if (i == 0)
        {
            return "0";
        }
        StringBuffer stringbuffer = new StringBuffer(Integer.toBinaryString(m_ints[i - 1]));
        for (i -= 2; i >= 0; i--)
        {
            String s = Integer.toBinaryString(m_ints[i]);
            for (int j = s.length(); j < 8; j++)
            {
                s = (new StringBuilder()).append("0").append(s).toString();
            }

            stringbuffer.append(s);
        }

        return stringbuffer.toString();
    }
}
