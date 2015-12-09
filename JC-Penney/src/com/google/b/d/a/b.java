// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.b.d.a;

import com.google.b.b.e;
import java.text.DecimalFormat;
import java.text.NumberFormat;

final class b
{

    private static final NumberFormat a = new DecimalFormat("000000000");
    private static final NumberFormat b = new DecimalFormat("000");
    private static final String c[] = {
        "\nABCDEFGHIJKLMNOPQRSTUVWXYZ\uFFFA\034\035\036\uFFFB \uFFFC\"#$%&'()*+,-./0123456789:\uFFF1\uFFF2\uFFF3\uFFF4\uFFF8", "`abcdefghijklmnopqrstuvwxyz\uFFFA\034\035\036\uFFFB{\uFFFC}~\177;<=>?[\\]^_ ,./:@!|\uFFFC\uFFF5\uFFF6\uFFFC\uFFF0\uFFF2\uFFF3\uFFF4\uFFF7", "\300\301\302\303\304\305\306\307\310\311\312\313\314\315\316\317\320\321\322\323\324\325\326\327\330\331\332\uFFFA\034\035\036\333\334\335\336\337\252\254\261\262\263\265\271\272\274\275\276\200\201\202\203\204\205\206\207\210\211\uFFF7 \uFFF9\uFFF3\uFFF4\uFFF8", "\340\341\342\343\344\345\346\347\350\351\352\353\354\355\356\357\360\361\362\363\364\365\366\367\370\371\372\uFFFA\034\035\036\uFFFB\373\374\375\376\377\241\250\253\257\260\264\267\270\273\277\212\213\214\215\216\217\220\221\222\223\224\uFFF7 \uFFF2\uFFF9\uFFF4\uFFF8", "\000\001\002\003\004\005\006\007\b\t\n\013\f\r\016\017\020\021\022\023\024\025\026\027\030\031\032\uFFFA\uFFFC\uFFFC\033\uFFFB\034\035\036\037\237\240\242\243\244\245\246\247\251\255\256\266\225\226\227\230\231\232\233\234\235\236\uFFF7 \uFFF2\uFFF3\uFFF9\uFFF8", "\000\001\002\003\004\005\006\007\b\t\n\013\f\r\016\017\020\021\022\023\024\025\026\027\030\031\032\033\034\035\036\037 !\"#$%&'()*+,-./0123456789:;<=>?"
    };

    private static int a(int i, byte abyte0[])
    {
        boolean flag = true;
        int j = i - 1;
        i = ((flag) ? 1 : 0);
        if ((1 << 5 - j % 6 & abyte0[j / 6]) == 0)
        {
            i = 0;
        }
        return i;
    }

    private static int a(byte abyte0[])
    {
        return a(abyte0, new byte[] {
            53, 54, 43, 44, 45, 46, 47, 48, 37, 38
        });
    }

    private static int a(byte abyte0[], byte abyte1[])
    {
        int i = 0;
        if (abyte1.length == 0)
        {
            throw new IllegalArgumentException();
        }
        int j = 0;
        for (; i < abyte1.length; i++)
        {
            j += a(abyte1[i], abyte0) << abyte1.length - i - 1;
        }

        return j;
    }

    static e a(byte abyte0[], int i)
    {
        StringBuilder stringbuilder = new StringBuilder(144);
        i;
        JVM INSTR tableswitch 2 5: default 44
    //                   2 62
    //                   3 62
    //                   4 253
    //                   5 268;
           goto _L1 _L2 _L2 _L3 _L4
_L1:
        return new e(abyte0, stringbuilder.toString(), null, String.valueOf(i));
_L2:
        String s;
        String s1;
        String s2;
        if (i == 2)
        {
            int j = d(abyte0);
            s = (new DecimalFormat("0000000000".substring(0, c(abyte0)))).format(j);
        } else
        {
            s = e(abyte0);
        }
        s1 = b.format(a(abyte0));
        s2 = b.format(b(abyte0));
        stringbuilder.append(a(abyte0, 10, 84));
        if (stringbuilder.toString().startsWith("[)>\03601\035"))
        {
            stringbuilder.insert(9, (new StringBuilder()).append(s).append('\035').append(s1).append('\035').append(s2).append('\035').toString());
        } else
        {
            stringbuilder.insert(0, (new StringBuilder()).append(s).append('\035').append(s1).append('\035').append(s2).append('\035').toString());
        }
        continue; /* Loop/switch isn't completed */
_L3:
        stringbuilder.append(a(abyte0, 1, 93));
        continue; /* Loop/switch isn't completed */
_L4:
        stringbuilder.append(a(abyte0, 1, 77));
        if (true) goto _L1; else goto _L5
_L5:
    }

    private static String a(byte abyte0[], int i, int j)
    {
        StringBuilder stringbuilder;
        int k;
        int l;
        int i1;
        int j1;
        stringbuilder = new StringBuilder();
        k = i;
        j1 = 0;
        l = 0;
        i1 = -1;
_L10:
        char c1;
        if (k >= i + j)
        {
            break MISSING_BLOCK_LABEL_395;
        }
        c1 = c[l].charAt(abyte0[k]);
        c1;
        JVM INSTR tableswitch 65520 65531: default 108
    //                   65520 185
    //                   65521 185
    //                   65522 185
    //                   65523 185
    //                   65524 185
    //                   65525 213
    //                   65526 238
    //                   65527 159
    //                   65528 172
    //                   65529 373
    //                   65530 108
    //                   65531 263;
           goto _L1 _L2 _L2 _L2 _L2 _L2 _L3 _L4 _L5 _L6 _L7 _L1 _L8
_L7:
        break MISSING_BLOCK_LABEL_373;
_L5:
        break; /* Loop/switch isn't completed */
_L1:
        stringbuilder.append(c1);
        int k1 = l;
        l = k;
        k = k1;
_L11:
        if (i1 == 0)
        {
            k = j1;
        }
        i1--;
        int l1 = l + 1;
        l = k;
        k = l1;
        if (true) goto _L10; else goto _L9
_L9:
        l = k;
        i1 = -1;
        k = 0;
          goto _L11
_L6:
        l = k;
        i1 = -1;
        k = 1;
          goto _L11
_L2:
        boolean flag = true;
        i1 = k;
        k = c1 - 65520;
        j1 = l;
        l = i1;
        i1 = ((flag) ? 1 : 0);
          goto _L11
_L3:
        byte byte0 = 2;
        i1 = k;
        k = 0;
        j1 = l;
        l = i1;
        i1 = byte0;
          goto _L11
_L4:
        byte byte1 = 3;
        i1 = k;
        k = 0;
        j1 = l;
        l = i1;
        i1 = byte1;
          goto _L11
_L8:
        int i2 = k + 1;
        k = abyte0[i2];
        i2++;
        byte byte3 = abyte0[i2];
        i2++;
        byte byte4 = abyte0[i2];
        i2++;
        byte byte5 = abyte0[i2];
        i2++;
        byte byte6 = abyte0[i2];
        stringbuilder.append(a.format((k << 24) + (byte3 << 18) + (byte4 << 12) + (byte5 << 6) + byte6));
        k = l;
        l = i2;
          goto _L11
        byte byte2 = -1;
        i1 = k;
        k = l;
        l = i1;
        i1 = byte2;
          goto _L11
        for (; stringbuilder.length() > 0 && stringbuilder.charAt(stringbuilder.length() - 1) == '\uFFFC'; stringbuilder.setLength(stringbuilder.length() - 1)) { }
        return stringbuilder.toString();
    }

    private static int b(byte abyte0[])
    {
        return a(abyte0, new byte[] {
            55, 56, 57, 58, 59, 60, 49, 50, 51, 52
        });
    }

    private static int c(byte abyte0[])
    {
        return a(abyte0, new byte[] {
            39, 40, 41, 42, 31, 32
        });
    }

    private static int d(byte abyte0[])
    {
        return a(abyte0, new byte[] {
            33, 34, 35, 36, 25, 26, 27, 28, 29, 30, 
            19, 20, 21, 22, 23, 24, 13, 14, 15, 16, 
            17, 18, 7, 8, 9, 10, 11, 12, 1, 2
        });
    }

    private static String e(byte abyte0[])
    {
        return String.valueOf(new char[] {
            c[0].charAt(a(abyte0, new byte[] {
                39, 40, 41, 42, 31, 32
            })), c[0].charAt(a(abyte0, new byte[] {
                33, 34, 35, 36, 25, 26
            })), c[0].charAt(a(abyte0, new byte[] {
                27, 28, 29, 30, 19, 20
            })), c[0].charAt(a(abyte0, new byte[] {
                21, 22, 23, 24, 13, 14
            })), c[0].charAt(a(abyte0, new byte[] {
                15, 16, 17, 18, 7, 8
            })), c[0].charAt(a(abyte0, new byte[] {
                9, 10, 11, 12, 1, 2
            }))
        });
    }

}
