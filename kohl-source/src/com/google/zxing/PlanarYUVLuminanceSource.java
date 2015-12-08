// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing;


// Referenced classes of package com.google.zxing:
//            LuminanceSource

public final class PlanarYUVLuminanceSource extends LuminanceSource
{

    private static final int THUMBNAIL_SCALE_FACTOR = 2;
    private final int dataHeight;
    private final int dataWidth;
    private final int left;
    private final int top;
    private final byte yuvData[];

    public PlanarYUVLuminanceSource(byte abyte0[], int i, int j, int k, int l, int i1, int j1, 
            boolean flag)
    {
        super(i1, j1);
        if (k + i1 > i || l + j1 > j)
        {
            throw new IllegalArgumentException("Crop rectangle does not fit within image data.");
        }
        yuvData = abyte0;
        dataWidth = i;
        dataHeight = j;
        left = k;
        top = l;
        if (flag)
        {
            reverseHorizontal(i1, j1);
        }
    }

    private void reverseHorizontal(int i, int j)
    {
        byte abyte0[] = yuvData;
        int l = 0;
        for (int k = top * dataWidth + left; l < j; k += dataWidth)
        {
            int k1 = i / 2;
            int j1 = k;
            for (int i1 = (k + i) - 1; j1 < k + k1; i1--)
            {
                byte byte0 = abyte0[j1];
                abyte0[j1] = abyte0[i1];
                abyte0[i1] = byte0;
                j1++;
            }

            l++;
        }

    }

    public LuminanceSource crop(int i, int j, int k, int l)
    {
        return new PlanarYUVLuminanceSource(yuvData, dataWidth, dataHeight, left + i, top + j, k, l, false);
    }

    public byte[] getMatrix()
    {
        int k;
        int l;
        k = getWidth();
        l = getHeight();
        if (k != dataWidth || l != dataHeight) goto _L2; else goto _L1
_L1:
        byte abyte0[] = yuvData;
_L4:
        return abyte0;
_L2:
        int i = k * l;
        byte abyte1[] = new byte[i];
        int j = top * dataWidth + left;
        if (k == dataWidth)
        {
            System.arraycopy(yuvData, j, abyte1, 0, i);
            return abyte1;
        }
        byte abyte2[] = yuvData;
        i = 0;
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
        System.arraycopy(yuvData, (k + i) * l + i1, abyte1, 0, j);
        return abyte1;
    }

    public int getThumbnailHeight()
    {
        return getHeight() / 2;
    }

    public int getThumbnailWidth()
    {
        return getWidth() / 2;
    }

    public boolean isCropSupported()
    {
        return true;
    }

    public int[] renderThumbnail()
    {
        int l = getWidth() / 2;
        int i1 = getHeight() / 2;
        int ai[] = new int[l * i1];
        byte abyte0[] = yuvData;
        int j = top * dataWidth + left;
        for (int i = 0; i < i1; i++)
        {
            for (int k = 0; k < l; k++)
            {
                ai[i * l + k] = 0xff000000 | 0x10101 * (abyte0[k * 2 + j] & 0xff);
            }

            j += dataWidth * 2;
        }

        return ai;
    }
}
