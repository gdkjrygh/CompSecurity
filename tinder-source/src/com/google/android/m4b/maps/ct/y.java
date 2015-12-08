// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.ct;


final class y
{
    static final class a extends IllegalArgumentException
    {

        private a(int i)
        {
            super((new StringBuilder(39)).append("Unpaired surrogate at index ").append(i).toString());
        }

        a(int i, byte byte0)
        {
            this(i);
        }
    }


    static int a(CharSequence charsequence)
    {
_L2:
        int i;
        if (j < i1)
        {
            int k = charsequence.charAt(j);
            if (k < '\u0800')
            {
                i += 127 - k >>> 31;
                j++;
                continue; /* Loop/switch isn't completed */
            }
            int k1 = charsequence.length();
            k = 0;
            while (j < k1) 
            {
                char c = charsequence.charAt(j);
                int l;
                if (c < '\u0800')
                {
                    k += 127 - c >>> 31;
                    l = j;
                } else
                {
                    int j1 = k + 2;
                    k = j1;
                    l = j;
                    if ('\uD800' <= c)
                    {
                        k = j1;
                        l = j;
                        if (c <= '\uDFFF')
                        {
                            if (Character.codePointAt(charsequence, j) < 0x10000)
                            {
                                throw new a(j, (byte)0);
                            }
                            l = j + 1;
                            k = j1;
                        }
                    }
                }
                j = l + 1;
            }
            i = k + i;
        }
        if (i < i1)
        {
            long l1 = i;
            throw new IllegalArgumentException((new StringBuilder(54)).append("UTF-8 length does not fit in int: ").append(l1 + 0x100000000L).toString());
        } else
        {
            return i;
        }
        int i1 = charsequence.length();
        int j;
        for (j = 0; j < i1 && charsequence.charAt(j) < '\200'; j++) { }
        i = i1;
        if (true) goto _L2; else goto _L1
_L1:
    }

    static int a(CharSequence charsequence, byte abyte0[], int i, int j)
    {
        int l1;
        int i2;
        l1 = charsequence.length();
        i2 = i + j;
        j = 0;
        do
        {
            if (j >= l1 || j + i >= i2)
            {
                break;
            }
            char c2 = charsequence.charAt(j);
            if (c2 >= '\200')
            {
                break;
            }
            abyte0[i + j] = (byte)c2;
            j++;
        } while (true);
        if (j == l1)
        {
            return i + l1;
        }
        i += j;
_L2:
        char c;
        if (j >= l1)
        {
            break MISSING_BLOCK_LABEL_513;
        }
        c = charsequence.charAt(j);
        if (c >= '\200' || i >= i2)
        {
            break; /* Loop/switch isn't completed */
        }
        int k = i + 1;
        abyte0[i] = (byte)c;
        i = k;
_L3:
        j++;
        if (true) goto _L2; else goto _L1
_L1:
        if (c < '\u0800' && i <= i2 - 2)
        {
            int l = i + 1;
            abyte0[i] = (byte)(c >>> 6 | 0x3c0);
            i = l + 1;
            abyte0[l] = (byte)(c & 0x3f | 0x80);
        } else
        if ((c < '\uD800' || '\uDFFF' < c) && i <= i2 - 3)
        {
            int i1 = i + 1;
            abyte0[i] = (byte)(c >>> 12 | 0x1e0);
            int j2 = i1 + 1;
            abyte0[i1] = (byte)(c >>> 6 & 0x3f | 0x80);
            i = j2 + 1;
            abyte0[j2] = (byte)(c & 0x3f | 0x80);
        } else
        {
label0:
            {
                char c1;
label1:
                {
                    if (i > i2 - 4)
                    {
                        break label0;
                    }
                    int j1 = j;
                    if (j + 1 != charsequence.length())
                    {
                        j++;
                        c1 = charsequence.charAt(j);
                        if (Character.isSurrogatePair(c, c1))
                        {
                            break label1;
                        }
                        j1 = j;
                    }
                    throw new a(j1 - 1, (byte)0);
                }
                int k1 = Character.toCodePoint(c, c1);
                int k2 = i + 1;
                abyte0[i] = (byte)(k1 >>> 18 | 0xf0);
                i = k2 + 1;
                abyte0[k2] = (byte)(k1 >>> 12 & 0x3f | 0x80);
                k2 = i + 1;
                abyte0[i] = (byte)(k1 >>> 6 & 0x3f | 0x80);
                i = k2 + 1;
                abyte0[k2] = (byte)(k1 & 0x3f | 0x80);
            }
        }
          goto _L3
        if (true) goto _L2; else goto _L4
_L4:
        if ('\uD800' <= c && c <= '\uDFFF' && (j + 1 == charsequence.length() || !Character.isSurrogatePair(c, charsequence.charAt(j + 1))))
        {
            throw new a(j, (byte)0);
        } else
        {
            throw new ArrayIndexOutOfBoundsException((new StringBuilder(37)).append("Failed writing ").append(c).append(" at index ").append(i).toString());
        }
        return i;
    }

    static int a(byte abyte0[], int i, int j)
    {
        byte byte0 = abyte0[i - 1];
        j - i;
        JVM INSTR tableswitch 0 2: default 36
    //                   0 44
    //                   1 54
    //                   2 77;
           goto _L1 _L2 _L3 _L4
_L1:
        throw new AssertionError();
_L2:
        if (byte0 <= -12) goto _L6; else goto _L5
_L5:
        return -1;
_L6:
        return byte0;
_L3:
        i = abyte0[i];
        if (byte0 <= -12 && i <= -65)
        {
            return i << 8 ^ byte0;
        }
        continue; /* Loop/switch isn't completed */
_L4:
        j = abyte0[i];
        i = abyte0[i + 1];
        if (byte0 <= -12 && j <= -65 && i <= -65)
        {
            return j << 8 ^ byte0 ^ i << 16;
        }
        if (true) goto _L5; else goto _L7
_L7:
    }
}
