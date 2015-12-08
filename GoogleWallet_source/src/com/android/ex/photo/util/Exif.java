// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.ex.photo.util;

import android.util.Log;
import java.io.InputStream;

// Referenced classes of package com.android.ex.photo.util:
//            InputStreamBuffer

public final class Exif
{

    public static int getOrientation(InputStream inputstream, long l)
    {
        int i;
        if (inputstream == null)
        {
            return 0;
        }
        inputstream = new InputStreamBuffer(inputstream, 16, false);
        boolean flag1 = false;
        i = ((flag1) ? 1 : 0);
        if (has(inputstream, l, 1))
        {
            boolean flag;
            if (inputstream.get(0) == -1 && inputstream.get(1) == -40)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            i = ((flag1) ? 1 : 0);
            if (!flag)
            {
                return 0;
            }
        }
          goto _L1
_L11:
        int j;
        i = j + i;
        inputstream.advanceTo(i - 4);
_L1:
        int k;
        int i1;
        i1 = 0;
        k = i1;
        j = i;
        if (!has(inputstream, l, i + 3)) goto _L3; else goto _L2
_L2:
        j = i + 1;
        if ((inputstream.get(i) & 0xff) != 255)
        {
            break MISSING_BLOCK_LABEL_576;
        }
        k = inputstream.get(j) & 0xff;
        if (k == 255) goto _L5; else goto _L4
_L4:
        j++;
        i = j;
        if (k == 216) goto _L1; else goto _L6
_L6:
        i = j;
        if (k == 1) goto _L1; else goto _L7
_L7:
        if (k != 217 && k != 218) goto _L9; else goto _L8
_L8:
        inputstream.advanceTo(j - 4);
        k = i1;
          goto _L3
_L9:
        i = pack(inputstream, j, 2, false);
        if (i < 2 || !has(inputstream, l, (j + i) - 1))
        {
            Log.e("CameraExif", "Invalid length");
            return 0;
        }
        if (k != 225 || i < 8 || pack(inputstream, j + 2, 4, false) != 0x45786966 || pack(inputstream, j + 6, 2, false) != 0) goto _L11; else goto _L10
_L10:
        j += 8;
        k = i - 8;
        inputstream.advanceTo(j - 4);
_L3:
        if (k > 8)
        {
            i = pack(inputstream, j, 4, false);
            if (i != 0x49492a00 && i != 0x4d4d002a)
            {
                Log.e("CameraExif", "Invalid byte order");
                return 0;
            }
            boolean flag2;
            if (i == 0x49492a00)
            {
                flag2 = true;
            } else
            {
                flag2 = false;
            }
            i1 = pack(inputstream, j + 4, 4, flag2) + 2;
            if (i1 < 10 || i1 > k)
            {
                Log.e("CameraExif", "Invalid offset");
                return 0;
            }
            i = j + i1;
            j = k - i1;
            inputstream.advanceTo(i - 4);
            i1 = pack(inputstream, i - 2, 2, flag2);
            k = i;
            for (i = i1; i > 0 && j >= 12; i--)
            {
                if (pack(inputstream, k, 2, flag2) == 274)
                {
                    switch (pack(inputstream, k + 8, 2, flag2))
                    {
                    case 2: // '\002'
                    case 4: // '\004'
                    case 5: // '\005'
                    case 7: // '\007'
                    default:
                        Log.i("CameraExif", "Unsupported orientation");
                        return 0;

                    case 1: // '\001'
                        return 0;

                    case 3: // '\003'
                        return 180;

                    case 6: // '\006'
                        return 90;

                    case 8: // '\b'
                        return 270;
                    }
                }
                k += 12;
                j -= 12;
                inputstream.advanceTo(k - 4);
            }

        }
        return 0;
_L5:
        i = j;
          goto _L1
        k = i1;
          goto _L3
    }

    private static boolean has(InputStreamBuffer inputstreambuffer, long l, int i)
    {
        if (l >= 0L)
        {
            return (long)i < l;
        } else
        {
            return inputstreambuffer.has(i);
        }
    }

    private static int pack(InputStreamBuffer inputstreambuffer, int i, int j, boolean flag)
    {
        byte byte0 = 1;
        int k = i;
        if (flag)
        {
            k = i + (j - 1);
            byte0 = -1;
        }
        i = 0;
        for (; j > 0; j--)
        {
            i = i << 8 | inputstreambuffer.get(k) & 0xff;
            k += byte0;
        }

        return i;
    }
}
