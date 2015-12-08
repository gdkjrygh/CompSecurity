// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mixpanel.android.mpmetrics;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.os.AsyncTask;
import com.mixpanel.android.a.a;
import java.lang.reflect.Array;

// Referenced classes of package com.mixpanel.android.mpmetrics:
//            c

private static final class d extends AsyncTask
{

    private final d a;
    private final Activity b;
    private Bitmap c;
    private int d;

    private transient Void a()
    {
        if (c == null) goto _L2; else goto _L1
_L1:
        Bitmap bitmap;
        int ai[];
        int l3;
        int i4;
        bitmap = c;
        l3 = bitmap.getWidth();
        i4 = bitmap.getHeight();
        ai = new int[l3 * i4];
        bitmap.getPixels(ai, 0, l3, 0, 0, l3, i4);
        int i;
        int j4;
        int k4;
        k4 = l3 - 1;
        j4 = i4 - 1;
        i = l3 * i4;
        int ai1[];
        int ai2[];
        int ai3[];
        int ai4[];
        int ai5[];
        ai1 = new int[i];
        ai2 = new int[i];
        ai3 = new int[i];
        ai4 = new int[Math.max(l3, i4)];
        ai5 = new int[0x1b900];
        i = 0;
_L4:
        if (i >= 0x1b900)
        {
            break; /* Loop/switch isn't completed */
        }
        ai5[i] = i / 441;
        i++;
        if (true) goto _L4; else goto _L3
_L3:
        int l2 = 0;
        int ai6[][] = (int[][])Array.newInstance(Integer.TYPE, new int[] {
            41, 3
        });
        int j2;
        int k2;
        j2 = 0;
        k2 = 0;
          goto _L5
_L18:
        int i3;
        if (i3 > 20) goto _L7; else goto _L6
_L6:
        int j3 = ai[Math.min(k4, Math.max(i3, 0)) + l2];
        int ai7[];
        ai7 = ai6[i3 + 20];
        ai7[0] = (0xff0000 & j3) >> 16;
        ai7[1] = (0xff00 & j3) >> 8;
        ai7[2] = j3 & 0xff;
        int k;
        int i1;
        int k1;
        int l1;
        int i2;
        j3 = 21 - Math.abs(i3);
        break MISSING_BLOCK_LABEL_243;
_L19:
        int j1;
        if (j1 >= l3) goto _L9; else goto _L8
_L8:
        int k3;
        int l4;
        int j5;
        ai1[l2] = ai5[i2];
        ai2[l2] = ai5[l1];
        ai3[l2] = ai5[k1];
        ai7 = ai6[((j3 - 20) + 41) % 41];
        j5 = ai7[0];
        l4 = ai7[1];
        k3 = ai7[2];
        if (k2 != 0) goto _L11; else goto _L10
_L10:
        ai4[j1] = Math.min(j1 + 20 + 1, k4);
          goto _L11
_L22:
        if (l2 > 20) goto _L13; else goto _L12
_L12:
        i3 = Math.max(0, k2) + i;
        ai7 = ai6[l2 + 20];
        ai7[0] = ai1[i3];
        ai7[1] = ai2[i3];
        ai7[2] = ai3[i3];
        int j;
        int l;
        j3 = 21 - Math.abs(l2);
        break MISSING_BLOCK_LABEL_473;
_L23:
        if (l1 >= i4)
        {
            break MISSING_BLOCK_LABEL_1373;
        }
        ai[i1] = 0xff000000 | ai5[j2] << 16 | ai5[k2] << 8 | ai5[i3];
        ai7 = ai6[((l2 - 20) + 41) % 41];
        k4 = ai7[0];
        k3 = ai7[1];
        j3 = ai7[2];
        if (i != 0) goto _L15; else goto _L14
_L14:
        ai4[l1] = Math.min(l1 + 21, j4) * l3;
          goto _L15
_L21:
        try
        {
            bitmap.setPixels(ai, 0, l3, 0, 0, l3, i4);
            (new Canvas(c)).drawColor(com.mixpanel.android.mpmetrics.c.a(), android.graphics.erDuff.Mode.SRC_ATOP);
        }
        catch (ArrayIndexOutOfBoundsException arrayindexoutofboundsexception)
        {
            c = null;
        }
        catch (OutOfMemoryError outofmemoryerror)
        {
            c = null;
        }
_L2:
        return null;
_L5:
        if (k2 >= i4) goto _L17; else goto _L16
_L16:
        i = 0;
        i1 = 0;
        j = 0;
        l = 0;
        j1 = 0;
        i3 = -20;
        k1 = 0;
        l1 = 0;
        i2 = 0;
        k = 0;
          goto _L18
        i2 += ai7[0] * j3;
        l1 += ai7[1] * j3;
        k1 += j3 * ai7[2];
        if (i3 > 0)
        {
            i1 += ai7[0];
            k += ai7[1];
            i += ai7[2];
        } else
        {
            j1 += ai7[0];
            l += ai7[1];
            j += ai7[2];
        }
        i3++;
          goto _L18
_L7:
        j3 = 20;
        k3 = 0;
        i3 = j1;
        j1 = k3;
          goto _L19
_L11:
        int k5 = ai[ai4[j1] + j2];
        ai7[0] = (0xff0000 & k5) >> 16;
        ai7[1] = (0xff00 & k5) >> 8;
        ai7[2] = k5 & 0xff;
        i1 += ai7[0];
        k += ai7[1];
        i += ai7[2];
        i2 = (i2 - i3) + i1;
        l1 = (l1 - l) + k;
        k1 = (k1 - j) + i;
        j3 = (j3 + 1) % 41;
        ai7 = ai6[j3 % 41];
        i3 = (i3 - j5) + ai7[0];
        l = (l - l4) + ai7[1];
        j = (j - k3) + ai7[2];
        i1 -= ai7[0];
        k -= ai7[1];
        i -= ai7[2];
        l2++;
        j1++;
          goto _L19
_L9:
        j2 += l3;
        k2++;
          goto _L5
_L17:
        i = 0;
_L24:
        if (i >= l3) goto _L21; else goto _L20
_L20:
        j = 0;
        j1 = 0;
        k = 0;
        i1 = 0;
        k1 = 0;
        l2 = -20;
        l1 = 0;
        i2 = 0;
        j2 = 0;
        k2 = l3 * -20;
        l = 0;
          goto _L22
        j2 += ai1[i3] * j3;
        i2 += ai2[i3] * j3;
        i3 = l1 + ai3[i3] * j3;
        if (l2 > 0)
        {
            j1 += ai7[0];
            l += ai7[1];
            j += ai7[2];
        } else
        {
            k1 += ai7[0];
            i1 += ai7[1];
            k += ai7[2];
        }
        l1 = k2;
        if (l2 < j4)
        {
            l1 = k2 + l3;
        }
        l2++;
        k2 = l1;
        l1 = i3;
          goto _L22
_L13:
        k2 = i2;
        i3 = l1;
        j3 = 0;
        k3 = 20;
        l1 = k;
        i2 = i1;
        l2 = k1;
        i1 = i;
        k = l;
        l = l1;
        k1 = i2;
        i2 = l2;
        l2 = k3;
        l1 = j3;
          goto _L23
_L15:
        int i5 = ai4[l1] + i;
        ai7[0] = ai1[i5];
        ai7[1] = ai2[i5];
        ai7[2] = ai3[i5];
        j1 += ai7[0];
        k += ai7[1];
        j += ai7[2];
        j2 = (j2 - i2) + j1;
        k2 = (k2 - k1) + k;
        i3 = (i3 - l) + j;
        l2 = (l2 + 1) % 41;
        ai7 = ai6[l2];
        i2 = (i2 - k4) + ai7[0];
        k1 = (k1 - k3) + ai7[1];
        l = (l - j3) + ai7[2];
        j1 -= ai7[0];
        k -= ai7[1];
        j -= ai7[2];
        i1 += l3;
        l1++;
          goto _L23
        i++;
          goto _L24
    }

    protected final Object doInBackground(Object aobj[])
    {
        return a();
    }

    protected final void onPostExecute(Object obj)
    {
        a.a(c, d);
    }

    protected final void onPreExecute()
    {
        c = com.mixpanel.android.a.a.a(b, 2, 2, true);
        Bitmap bitmap = c;
        int i = 0xff000000;
        if (bitmap != null)
        {
            i = Bitmap.createScaledBitmap(bitmap, 1, 1, false).getPixel(0, 0);
        }
        d = com.mixpanel.android.a.a.a(i);
    }

    public ption(Activity activity, ption ption)
    {
        b = activity;
        a = ption;
        d = 0xff000000;
    }
}
