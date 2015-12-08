// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.userfeedback.android.api.b;


// Referenced classes of package com.google.userfeedback.android.api.b:
//            b

public final class c extends b
{

    private static final byte j[] = {
        65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 
        75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 
        85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 
        101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 
        111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 
        121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 
        56, 57, 43, 47
    };
    private static final byte k[] = {
        65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 
        75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 
        85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 
        101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 
        111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 
        121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 
        56, 57, 45, 95
    };
    final byte c[] = new byte[2];
    public int d;
    int e;
    public final boolean f = true;
    public final boolean g = true;
    public final boolean h = false;
    final byte i[];

    public c()
    {
        a = null;
        i = j;
        d = 0;
        int l;
        if (g)
        {
            l = 19;
        } else
        {
            l = -1;
        }
        e = l;
    }

    public final boolean a(byte abyte0[], int l)
    {
        byte abyte1[];
        byte abyte2[];
        int j1;
        byte byte0;
        byte0 = 0;
        abyte1 = i;
        abyte2 = a;
        j1 = e;
        d;
        JVM INSTR tableswitch 0 2: default 52
    //                   0 356
    //                   1 365
    //                   2 427;
           goto _L1 _L2 _L3 _L4
_L1:
        int i1;
        int k1;
        i1 = -1;
        k1 = 0;
_L6:
        if (i1 != -1)
        {
            abyte2[0] = abyte1[i1 >> 18 & 0x3f];
            abyte2[1] = abyte1[i1 >> 12 & 0x3f];
            abyte2[2] = abyte1[i1 >> 6 & 0x3f];
            int l1 = 4;
            abyte2[3] = abyte1[i1 & 0x3f];
            j1--;
            if (j1 == 0)
            {
                i1 = l1;
                if (h)
                {
                    i1 = 5;
                    abyte2[4] = 13;
                }
                l1 = i1 + 1;
                abyte2[i1] = 10;
                j1 = 19;
                i1 = l1;
            } else
            {
                i1 = 4;
            }
        } else
        {
            i1 = 0;
        }
        do
        {
            if (k1 + 3 > l)
            {
                break;
            }
            l1 = (abyte0[k1] & 0xff) << 16 | (abyte0[k1 + 1] & 0xff) << 8 | abyte0[k1 + 2] & 0xff;
            abyte2[i1] = abyte1[l1 >> 18 & 0x3f];
            abyte2[i1 + 1] = abyte1[l1 >> 12 & 0x3f];
            abyte2[i1 + 2] = abyte1[l1 >> 6 & 0x3f];
            abyte2[i1 + 3] = abyte1[l1 & 0x3f];
            k1 += 3;
            i1 += 4;
            j1--;
            if (j1 == 0)
            {
                if (h)
                {
                    j1 = i1 + 1;
                    abyte2[i1] = 13;
                    i1 = j1;
                }
                j1 = i1 + 1;
                abyte2[i1] = 10;
                l1 = 19;
                i1 = j1;
                j1 = l1;
            }
        } while (true);
          goto _L5
_L2:
        i1 = -1;
        k1 = 0;
          goto _L6
_L3:
        if (2 > l) goto _L1; else goto _L7
_L7:
        i1 = c[0];
        k1 = abyte0[0];
        l1 = abyte0[1];
        d = 0;
        i1 = (i1 & 0xff) << 16 | (k1 & 0xff) << 8 | l1 & 0xff;
        k1 = 2;
          goto _L6
_L4:
        if (l <= 0) goto _L1; else goto _L8
_L8:
        i1 = c[0];
        k1 = c[1];
        l1 = abyte0[0];
        d = 0;
        i1 = (i1 & 0xff) << 16 | (k1 & 0xff) << 8 | l1 & 0xff;
        k1 = 1;
          goto _L6
_L5:
        if (k1 - d != l - 1) goto _L10; else goto _L9
_L9:
        if (d > 0)
        {
            k1 = c[0];
            l = 1;
        } else
        {
            k1 = abyte0[k1];
            l = 0;
        }
        k1 = (k1 & 0xff) << 4;
        d = d - l;
        l = i1 + 1;
        abyte2[i1] = abyte1[k1 >> 6 & 0x3f];
        i1 = l + 1;
        abyte2[l] = abyte1[k1 & 0x3f];
        l = i1;
        if (f)
        {
            k1 = i1 + 1;
            abyte2[i1] = 61;
            l = k1 + 1;
            abyte2[k1] = 61;
        }
        i1 = l;
        if (g)
        {
            i1 = l;
            if (h)
            {
                abyte2[l] = 13;
                i1 = l + 1;
            }
            abyte2[i1] = 10;
            i1++;
        }
        l = i1;
_L12:
        b = l;
        e = j1;
        return true;
_L10:
        if (k1 - d == l - 2)
        {
            if (d > 1)
            {
                byte0 = c[0];
                l = 1;
                l1 = k1;
                k1 = byte0;
            } else
            {
                l = abyte0[k1];
                l1 = k1 + 1;
                k1 = l;
                l = byte0;
            }
            if (d > 0)
            {
                l1 = c[l];
                l++;
            } else
            {
                l1 = abyte0[l1];
            }
            k1 = (l1 & 0xff) << 2 | (k1 & 0xff) << 10;
            d = d - l;
            l = i1 + 1;
            abyte2[i1] = abyte1[k1 >> 12 & 0x3f];
            i1 = l + 1;
            abyte2[l] = abyte1[k1 >> 6 & 0x3f];
            l = i1 + 1;
            abyte2[i1] = abyte1[k1 & 0x3f];
            if (f)
            {
                i1 = l + 1;
                abyte2[l] = 61;
                l = i1;
            }
            i1 = l;
            if (g)
            {
                i1 = l;
                if (h)
                {
                    abyte2[l] = 13;
                    i1 = l + 1;
                }
                abyte2[i1] = 10;
                i1++;
            }
            l = i1;
        } else
        {
            l = i1;
            if (g)
            {
                l = i1;
                if (i1 > 0)
                {
                    l = i1;
                    if (j1 != 19)
                    {
                        if (h)
                        {
                            l = i1 + 1;
                            abyte2[i1] = 13;
                        } else
                        {
                            l = i1;
                        }
                        i1 = l + 1;
                        abyte2[l] = 10;
                        l = i1;
                    }
                }
            }
        }
        if (true) goto _L12; else goto _L11
_L11:
    }

}
