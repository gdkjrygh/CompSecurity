// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.b.c.c;


// Referenced classes of package com.google.b.c.c:
//            k

public final class i
{

    private static final int a[] = {
        5, 7, 10, 11, 12, 14, 18, 20, 24, 28, 
        36, 42, 48, 56, 62, 68
    };
    private static final int b[][];
    private static final int c[];
    private static final int d[];

    private static String a(CharSequence charsequence, int j)
    {
        return a(charsequence, 0, charsequence.length(), j);
    }

    private static String a(CharSequence charsequence, int j, int l, int i1)
    {
        int j1;
        boolean flag;
        flag = false;
        j1 = 0;
_L4:
label0:
        {
            if (j1 >= a.length)
            {
                break MISSING_BLOCK_LABEL_312;
            }
            if (a[j1] == i1)
            {
                break label0;
            } else
            {
                j1++;
                continue; /* Loop/switch isn't completed */
            }
        }
_L2:
        if (j1 < 0)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Illegal number of error correction codewords specified: ").append(i1).toString());
        }
        int ai[] = b[j1];
        char ac[] = new char[i1];
        for (j1 = 0; j1 < i1; j1++)
        {
            ac[j1] = '\0';
        }

        j1 = j;
        while (j1 < j + l) 
        {
            int k1 = ac[i1 - 1];
            int l1 = charsequence.charAt(j1) ^ k1;
            k1 = i1 - 1;
            while (k1 > 0) 
            {
                if (l1 != 0 && ai[k1] != 0)
                {
                    ac[k1] = (char)(ac[k1 - 1] ^ d[(c[l1] + c[ai[k1]]) % 255]);
                } else
                {
                    ac[k1] = ac[k1 - 1];
                }
                k1--;
            }
            if (l1 != 0 && ai[0] != 0)
            {
                ac[0] = (char)d[(c[l1] + c[ai[0]]) % 255];
            } else
            {
                ac[0] = '\0';
            }
            j1++;
        }
        charsequence = new char[i1];
        for (j = ((flag) ? 1 : 0); j < i1; j++)
        {
            charsequence[j] = ac[i1 - j - 1];
        }

        return String.valueOf(charsequence);
        j1 = -1;
        if (true) goto _L2; else goto _L1
_L1:
        if (true) goto _L4; else goto _L3
_L3:
    }

    public static String a(String s, k k1)
    {
        if (s.length() != k1.h())
        {
            throw new IllegalArgumentException("The number of codewords does not match the selected symbol");
        }
        StringBuilder stringbuilder = new StringBuilder(k1.h() + k1.i());
        stringbuilder.append(s);
        int i2 = k1.a();
        if (i2 == 1)
        {
            stringbuilder.append(a(((CharSequence) (s)), k1.i()));
        } else
        {
            stringbuilder.setLength(stringbuilder.capacity());
            int ai[] = new int[i2];
            int ai1[] = new int[i2];
            int ai2[] = new int[i2];
            for (int j = 0; j < i2; j++)
            {
                ai[j] = k1.a(j + 1);
                ai1[j] = k1.b(j + 1);
                ai2[j] = 0;
                if (j > 0)
                {
                    ai2[j] = ai2[j - 1] + ai[j];
                }
            }

            int l = 0;
            while (l < i2) 
            {
                Object obj = new StringBuilder(ai[l]);
                for (int i1 = l; i1 < k1.h(); i1 += i2)
                {
                    ((StringBuilder) (obj)).append(s.charAt(i1));
                }

                obj = a(((CharSequence) (((StringBuilder) (obj)).toString())), ai1[l]);
                int l1 = l;
                for (int j1 = 0; l1 < ai1[l] * i2; j1++)
                {
                    stringbuilder.setCharAt(k1.h() + l1, ((String) (obj)).charAt(j1));
                    l1 += i2;
                }

                l++;
            }
        }
        return stringbuilder.toString();
    }

    static 
    {
        int ai[] = {
            228, 48, 15, 111, 62
        };
        int ai1[] = {
            41, 153, 158, 91, 61, 42, 142, 213, 97, 178, 
            100, 242
        };
        int ai2[] = {
            77, 193, 137, 31, 19, 38, 22, 153, 247, 105, 
            122, 2, 245, 133, 242, 8, 175, 95, 100, 9, 
            167, 105, 214, 111, 57, 121, 21, 1, 253, 57, 
            54, 101, 248, 202, 69, 50, 150, 177, 226, 5, 
            9, 5
        };
        b = (new int[][] {
            ai, new int[] {
                23, 68, 144, 134, 240, 92, 254
            }, new int[] {
                28, 24, 185, 166, 223, 248, 116, 255, 110, 61
            }, new int[] {
                175, 138, 205, 12, 194, 168, 39, 245, 60, 97, 
                120
            }, ai1, new int[] {
                156, 97, 192, 252, 95, 9, 157, 119, 138, 45, 
                18, 186, 83, 185
            }, new int[] {
                83, 195, 100, 39, 188, 75, 66, 61, 241, 213, 
                109, 129, 94, 254, 225, 48, 90, 188
            }, new int[] {
                15, 195, 244, 9, 233, 71, 168, 2, 188, 160, 
                153, 145, 253, 79, 108, 82, 27, 174, 186, 172
            }, new int[] {
                52, 190, 88, 205, 109, 39, 176, 21, 155, 197, 
                251, 223, 155, 21, 5, 172, 254, 124, 12, 181, 
                184, 96, 50, 193
            }, new int[] {
                211, 231, 43, 97, 71, 96, 103, 174, 37, 151, 
                170, 53, 75, 34, 249, 121, 17, 138, 110, 213, 
                141, 136, 120, 151, 233, 168, 93, 255
            }, 
            new int[] {
                245, 127, 242, 218, 130, 250, 162, 181, 102, 120, 
                84, 179, 220, 251, 80, 182, 229, 18, 2, 4, 
                68, 33, 101, 137, 95, 119, 115, 44, 175, 184, 
                59, 25, 225, 98, 81, 112
            }, ai2, new int[] {
                245, 132, 172, 223, 96, 32, 117, 22, 238, 133, 
                238, 231, 205, 188, 237, 87, 191, 106, 16, 147, 
                118, 23, 37, 90, 170, 205, 131, 88, 120, 100, 
                66, 138, 186, 240, 82, 44, 176, 87, 187, 147, 
                160, 175, 69, 213, 92, 253, 225, 19
            }, new int[] {
                175, 9, 223, 238, 12, 17, 220, 208, 100, 29, 
                175, 170, 230, 192, 215, 235, 150, 159, 36, 223, 
                38, 200, 132, 54, 228, 146, 218, 234, 117, 203, 
                29, 232, 144, 238, 22, 150, 201, 117, 62, 207, 
                164, 13, 137, 245, 127, 67, 247, 28, 155, 43, 
                203, 107, 233, 53, 143, 46
            }, new int[] {
                242, 93, 169, 50, 144, 210, 39, 118, 202, 188, 
                201, 189, 143, 108, 196, 37, 185, 112, 134, 230, 
                245, 63, 197, 190, 250, 106, 185, 221, 175, 64, 
                114, 71, 161, 44, 147, 6, 27, 218, 51, 63, 
                87, 10, 40, 130, 188, 17, 163, 31, 176, 170, 
                4, 107, 232, 7, 94, 166, 224, 124, 86, 47, 
                11, 204
            }, new int[] {
                220, 228, 173, 89, 251, 149, 159, 56, 89, 33, 
                147, 244, 154, 36, 73, 127, 213, 136, 248, 180, 
                234, 197, 158, 177, 68, 122, 93, 213, 15, 160, 
                227, 236, 66, 139, 153, 185, 202, 167, 179, 25, 
                220, 232, 96, 210, 231, 136, 223, 239, 181, 241, 
                59, 52, 172, 25, 49, 232, 211, 189, 64, 54, 
                108, 153, 132, 63, 96, 103, 82, 186
            }
        });
        c = new int[256];
        d = new int[255];
        int j = 1;
        for (int l = 0; l < 255; l++)
        {
            d[l] = j;
            c[j] = l;
            int i1 = j * 2;
            j = i1;
            if (i1 >= 256)
            {
                j = i1 ^ 0x12d;
            }
        }

    }
}
