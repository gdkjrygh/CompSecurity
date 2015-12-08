// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing;


// Referenced classes of package com.google.zxing:
//            LuminanceSource

public final class RGBLuminanceSource extends LuminanceSource
{

    private final int dataHeight;
    private final int dataWidth;
    private final int left;
    private final byte luminances[];
    private final int top;

    public RGBLuminanceSource(int i, int j, int ai[])
    {
        super(i, j);
        dataWidth = i;
        dataHeight = j;
        left = 0;
        top = 0;
        luminances = new byte[i * j];
        for (int k = 0; k < j; k++)
        {
            int i1 = k * i;
            int l = 0;
            while (l < i) 
            {
                int l1 = ai[i1 + l];
                int j1 = l1 >> 16 & 0xff;
                int k1 = l1 >> 8 & 0xff;
                l1 &= 0xff;
                if (j1 == k1 && k1 == l1)
                {
                    luminances[i1 + l] = (byte)j1;
                } else
                {
                    luminances[i1 + l] = (byte)(l1 + (j1 + k1 + k1) >> 2);
                }
                l++;
            }
        }

    }

    private RGBLuminanceSource(byte abyte0[], int i, int j, int k, int l, int i1, int j1)
    {
        super(i1, j1);
        if (k + i1 > i || l + j1 > j)
        {
            throw new IllegalArgumentException("Crop rectangle does not fit within image data.");
        } else
        {
            luminances = abyte0;
            dataWidth = i;
            dataHeight = j;
            left = k;
            top = l;
            return;
        }
    }

    public LuminanceSource crop(int i, int j, int k, int l)
    {
        return new RGBLuminanceSource(luminances, dataWidth, dataHeight, left + i, top + j, k, l);
    }

    public byte[] getMatrix()
    {
        int i;
        int k;
        int l;
        i = 0;
        k = getWidth();
        l = getHeight();
        if (k != dataWidth || l != dataHeight) goto _L2; else goto _L1
_L1:
        byte abyte0[] = luminances;
_L4:
        return abyte0;
_L2:
        int i1 = k * l;
        byte abyte1[] = new byte[i1];
        int j = top * dataWidth + left;
        if (k == dataWidth)
        {
            System.arraycopy(luminances, j, abyte1, 0, i1);
            return abyte1;
        }
        byte abyte2[] = luminances;
        do
        {
            abyte0 = abyte1;
            if (i >= l)
            {
                continue;
            }
            System.arraycopy(abyte2, j, abyte1, i * k, k);
            j += dataWidth;
            i++;
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    public byte[] getRow(int i, byte abyte0[])
    {
        byte abyte1[];
        int j;
label0:
        {
            if (i < 0 || i >= getHeight())
            {
                throw new IllegalArgumentException((new StringBuilder()).append("Requested row is outside the image: ").append(i).toString());
            }
            j = getWidth();
            if (abyte0 != null)
            {
                abyte1 = abyte0;
                if (abyte0.length >= j)
                {
                    break label0;
                }
            }
            abyte1 = new byte[j];
        }
        int k = top;
        int l = dataWidth;
        int i1 = left;
        System.arraycopy(luminances, (k + i) * l + i1, abyte1, 0, j);
        return abyte1;
    }

    public boolean isCropSupported()
    {
        return true;
    }
}
