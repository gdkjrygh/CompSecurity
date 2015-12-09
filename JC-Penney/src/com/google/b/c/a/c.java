// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.b.c.a;

import com.google.b.b.e;
import com.google.b.h;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

// Referenced classes of package com.google.b.c.a:
//            e, d

final class c
{

    private static final char a[] = {
        '*', '*', '*', ' ', '0', '1', '2', '3', '4', '5', 
        '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F', 
        'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 
        'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'
    };
    private static final char b[] = {
        '!', '"', '#', '$', '%', '&', '\'', '(', ')', '*', 
        '+', ',', '-', '.', '/', ':', ';', '<', '=', '>', 
        '?', '@', '[', '\\', ']', '^', '_'
    };
    private static final char c[] = {
        '*', '*', '*', ' ', '0', '1', '2', '3', '4', '5', 
        '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f', 
        'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 
        'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'
    };
    private static final char d[] = b;
    private static final char e[] = {
        '`', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 
        'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 
        'T', 'U', 'V', 'W', 'X', 'Y', 'Z', '{', '|', '}', 
        '~', '\177'
    };

    private static int a(int i, int j)
    {
        i -= (j * 149) % 255 + 1;
        if (i >= 0)
        {
            return i;
        } else
        {
            return i + 256;
        }
    }

    static e a(byte abyte0[])
    {
        Object obj;
        ArrayList arraylist;
        Object obj1;
        StringBuilder stringbuilder;
        StringBuilder stringbuilder1;
        obj1 = new com.google.b.b.c(abyte0);
        stringbuilder = new StringBuilder(100);
        stringbuilder1 = new StringBuilder(0);
        arraylist = new ArrayList(1);
        obj = e.b;
_L3:
        if (obj != e.b) goto _L2; else goto _L1
_L1:
        obj = a(((com.google.b.b.c) (obj1)), stringbuilder, stringbuilder1);
_L10:
        if (obj == e.a || ((com.google.b.b.c) (obj1)).c() <= 0)
        {
            if (stringbuilder1.length() > 0)
            {
                stringbuilder.append(stringbuilder1);
            }
            obj1 = stringbuilder.toString();
            if (arraylist.isEmpty())
            {
                obj = null;
            } else
            {
                obj = arraylist;
            }
            return new e(abyte0, ((String) (obj1)), ((List) (obj)), null);
        }
        if (true) goto _L3; else goto _L2
_L2:
        d.a[((com.google.b.c.a.e) (obj)).ordinal()];
        JVM INSTR tableswitch 1 5: default 160
    //                   1 164
    //                   2 177
    //                   3 186
    //                   4 195
    //                   5 204;
           goto _L4 _L5 _L6 _L7 _L8 _L9
_L9:
        break MISSING_BLOCK_LABEL_204;
_L4:
        throw h.a();
_L5:
        a(((com.google.b.b.c) (obj1)), stringbuilder);
_L11:
        obj = e.b;
          goto _L10
_L6:
        b(((com.google.b.b.c) (obj1)), stringbuilder);
          goto _L11
_L7:
        c(((com.google.b.b.c) (obj1)), stringbuilder);
          goto _L11
_L8:
        d(((com.google.b.b.c) (obj1)), stringbuilder);
          goto _L11
        a(((com.google.b.b.c) (obj1)), stringbuilder, ((Collection) (arraylist)));
          goto _L11
    }

    private static com.google.b.c.a.e a(com.google.b.b.c c1, StringBuilder stringbuilder, StringBuilder stringbuilder1)
    {
        int i = 0;
_L1:
        int k = c1.a(8);
        if (k == 0)
        {
            throw h.a();
        }
        if (k <= 128)
        {
            int j;
            if (i != 0)
            {
                i = k + 128;
            } else
            {
                i = k;
            }
            stringbuilder.append((char)(i - 1));
            return e.b;
        }
        if (k == 129)
        {
            return e.a;
        }
        if (k <= 229)
        {
            j = k - 130;
            if (j < 10)
            {
                stringbuilder.append('0');
            }
            stringbuilder.append(j);
            j = i;
        } else
        {
            if (k == 230)
            {
                return e.c;
            }
            if (k == 231)
            {
                return e.g;
            }
            if (k == 232)
            {
                stringbuilder.append('\035');
                j = i;
            } else
            {
                j = i;
                if (k != 233)
                {
                    j = i;
                    if (k != 234)
                    {
                        if (k == 235)
                        {
                            j = 1;
                        } else
                        if (k == 236)
                        {
                            stringbuilder.append("[)>\03605\035");
                            stringbuilder1.insert(0, "\036\004");
                            j = i;
                        } else
                        {
label0:
                            {
                                if (k != 237)
                                {
                                    break label0;
                                }
                                stringbuilder.append("[)>\03606\035");
                                stringbuilder1.insert(0, "\036\004");
                                j = i;
                            }
                        }
                    }
                }
            }
        }
        i = j;
        if (c1.c() <= 0)
        {
            return e.b;
        }
          goto _L1
        if (k == 238)
        {
            return com.google.b.c.a.e.e;
        }
        if (k == 239)
        {
            return e.d;
        }
        if (k == 240)
        {
            return e.f;
        }
        j = i;
        if (k == 241)
        {
            break MISSING_BLOCK_LABEL_103;
        }
        j = i;
        if (k < 242)
        {
            break MISSING_BLOCK_LABEL_103;
        }
        if (k != 254)
        {
            break; /* Loop/switch isn't completed */
        }
        j = i;
        if (c1.c() == 0) goto _L3; else goto _L2
_L3:
        break MISSING_BLOCK_LABEL_103;
_L2:
        throw h.a();
    }

    private static void a(int i, int j, int ai[])
    {
        i = ((i << 8) + j) - 1;
        j = i / 1600;
        ai[0] = j;
        i -= j * 1600;
        j = i / 40;
        ai[1] = j;
        ai[2] = i - j * 40;
    }

    private static void a(com.google.b.b.c c1, StringBuilder stringbuilder)
    {
        int ai[];
        int i;
        boolean flag;
        ai = new int[3];
        i = 0;
        flag = false;
_L13:
        if (c1.c() != 8) goto _L2; else goto _L1
_L1:
        int j;
        return;
_L2:
        if ((j = c1.a(8)) == 254) goto _L1; else goto _L3
_L3:
        a(j, c1.a(8), ai);
        j = 0;
_L10:
        int k;
        if (j >= 3)
        {
            continue; /* Loop/switch isn't completed */
        }
        k = ai[j];
        i;
        JVM INSTR tableswitch 0 3: default 96
    //                   0 100
    //                   1 172
    //                   2 209
    //                   3 293;
           goto _L4 _L5 _L6 _L7 _L8
_L8:
        break MISSING_BLOCK_LABEL_293;
_L6:
        break; /* Loop/switch isn't completed */
_L4:
        throw h.a();
_L5:
        if (k < 3)
        {
            i = k + 1;
        } else
        if (k < a.length)
        {
            char c2 = a[k];
            if (flag)
            {
                stringbuilder.append((char)(c2 + 128));
                flag = false;
            } else
            {
                stringbuilder.append(c2);
            }
        } else
        {
            throw h.a();
        }
_L11:
        j++;
        if (true) goto _L10; else goto _L9
_L9:
        if (flag)
        {
            stringbuilder.append((char)(k + 128));
            flag = false;
        } else
        {
            stringbuilder.append((char)k);
        }
        i = 0;
          goto _L11
_L7:
        if (k < b.length)
        {
            char c3 = b[k];
            if (flag)
            {
                stringbuilder.append((char)(c3 + 128));
                flag = false;
            } else
            {
                stringbuilder.append(c3);
            }
        } else
        if (k == 27)
        {
            stringbuilder.append('\035');
        } else
        if (k == 30)
        {
            flag = true;
        } else
        {
            throw h.a();
        }
        i = 0;
          goto _L11
        if (flag)
        {
            stringbuilder.append((char)(k + 224));
            flag = false;
        } else
        {
            stringbuilder.append((char)(k + 96));
        }
        i = 0;
          goto _L11
        if (c1.c() > 0) goto _L13; else goto _L12
_L12:
    }

    private static void a(com.google.b.b.c c1, StringBuilder stringbuilder, Collection collection)
    {
        int i;
        int j;
        i = c1.b() + 1;
        int k = c1.a(8);
        j = i + 1;
        i = a(k, i);
        if (i != 0) goto _L2; else goto _L1
_L1:
        i = c1.c() / 8;
_L4:
        if (i < 0)
        {
            throw h.a();
        }
        break; /* Loop/switch isn't completed */
_L2:
        if (i >= 250)
        {
            i = (i - 249) * 250 + a(c1.a(8), j);
            j++;
        }
        if (true) goto _L4; else goto _L3
_L3:
        byte abyte0[] = new byte[i];
        for (int l = 0; l < i;)
        {
            if (c1.c() < 8)
            {
                throw h.a();
            }
            abyte0[l] = (byte)a(c1.a(8), j);
            l++;
            j++;
        }

        collection.add(abyte0);
        try
        {
            stringbuilder.append(new String(abyte0, "ISO8859_1"));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (com.google.b.b.c c1)
        {
            throw new IllegalStateException((new StringBuilder()).append("Platform does not support required encoding: ").append(c1).toString());
        }
    }

    private static void b(com.google.b.b.c c1, StringBuilder stringbuilder)
    {
        int ai[];
        int i;
        boolean flag;
        ai = new int[3];
        i = 0;
        flag = false;
_L13:
        if (c1.c() != 8) goto _L2; else goto _L1
_L1:
        int j;
        return;
_L2:
        if ((j = c1.a(8)) == 254) goto _L1; else goto _L3
_L3:
        a(j, c1.a(8), ai);
        j = 0;
_L10:
        int k;
        if (j >= 3)
        {
            continue; /* Loop/switch isn't completed */
        }
        k = ai[j];
        i;
        JVM INSTR tableswitch 0 3: default 96
    //                   0 100
    //                   1 172
    //                   2 209
    //                   3 293;
           goto _L4 _L5 _L6 _L7 _L8
_L8:
        break MISSING_BLOCK_LABEL_293;
_L6:
        break; /* Loop/switch isn't completed */
_L4:
        throw h.a();
_L5:
        if (k < 3)
        {
            i = k + 1;
        } else
        if (k < c.length)
        {
            char c2 = c[k];
            if (flag)
            {
                stringbuilder.append((char)(c2 + 128));
                flag = false;
            } else
            {
                stringbuilder.append(c2);
            }
        } else
        {
            throw h.a();
        }
_L11:
        j++;
        if (true) goto _L10; else goto _L9
_L9:
        if (flag)
        {
            stringbuilder.append((char)(k + 128));
            flag = false;
        } else
        {
            stringbuilder.append((char)k);
        }
        i = 0;
          goto _L11
_L7:
        if (k < d.length)
        {
            char c3 = d[k];
            if (flag)
            {
                stringbuilder.append((char)(c3 + 128));
                flag = false;
            } else
            {
                stringbuilder.append(c3);
            }
        } else
        if (k == 27)
        {
            stringbuilder.append('\035');
        } else
        if (k == 30)
        {
            flag = true;
        } else
        {
            throw h.a();
        }
        i = 0;
          goto _L11
        if (k < e.length)
        {
            char c4 = e[k];
            if (flag)
            {
                stringbuilder.append((char)(c4 + 128));
                flag = false;
            } else
            {
                stringbuilder.append(c4);
            }
            i = 0;
        } else
        {
            throw h.a();
        }
          goto _L11
        if (c1.c() > 0) goto _L13; else goto _L12
_L12:
    }

    private static void c(com.google.b.b.c c1, StringBuilder stringbuilder)
    {
        int ai[] = new int[3];
_L5:
        if (c1.c() != 8) goto _L2; else goto _L1
_L1:
        int i;
        return;
_L2:
        if ((i = c1.a(8)) == 254) goto _L1; else goto _L3
_L3:
        a(i, c1.a(8), ai);
        i = 0;
        while (i < 3) 
        {
            int j = ai[i];
            if (j == 0)
            {
                stringbuilder.append('\r');
            } else
            if (j == 1)
            {
                stringbuilder.append('*');
            } else
            if (j == 2)
            {
                stringbuilder.append('>');
            } else
            if (j == 3)
            {
                stringbuilder.append(' ');
            } else
            if (j < 14)
            {
                stringbuilder.append((char)(j + 44));
            } else
            if (j < 40)
            {
                stringbuilder.append((char)(j + 51));
            } else
            {
                throw h.a();
            }
            i++;
        }
        if (c1.c() <= 0)
        {
            return;
        }
        if (true) goto _L5; else goto _L4
_L4:
    }

    private static void d(com.google.b.b.c c1, StringBuilder stringbuilder)
    {
_L7:
        if (c1.c() > 16) goto _L2; else goto _L1
_L1:
        return;
_L2:
        int i = 0;
_L5:
        if (i >= 4) goto _L4; else goto _L3
_L3:
        int k;
label0:
        {
            k = c1.a(6);
            if (k != 31)
            {
                break label0;
            }
            i = 8 - c1.a();
            if (i != 8)
            {
                c1.a(i);
                return;
            }
        }
          goto _L1
        int j = k;
        if ((k & 0x20) == 0)
        {
            j = k | 0x40;
        }
        stringbuilder.append((char)j);
        i++;
          goto _L5
_L4:
        if (c1.c() <= 0)
        {
            return;
        }
        if (true) goto _L7; else goto _L6
_L6:
    }

}
