// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing;


// Referenced classes of package com.google.zxing:
//            InvertedLuminanceSource

public abstract class LuminanceSource
{

    private final int height;
    private final int width;

    protected LuminanceSource(int i, int j)
    {
        width = i;
        height = j;
    }

    public LuminanceSource crop(int i, int j, int k, int l)
    {
        throw new UnsupportedOperationException("This luminance source does not support cropping.");
    }

    public final int getHeight()
    {
        return height;
    }

    public abstract byte[] getMatrix();

    public abstract byte[] getRow(int i, byte abyte0[]);

    public final int getWidth()
    {
        return width;
    }

    public LuminanceSource invert()
    {
        return new InvertedLuminanceSource(this);
    }

    public boolean isCropSupported()
    {
        return false;
    }

    public boolean isRotateSupported()
    {
        return false;
    }

    public LuminanceSource rotateCounterClockwise()
    {
        throw new UnsupportedOperationException("This luminance source does not support rotation by 90 degrees.");
    }

    public LuminanceSource rotateCounterClockwise45()
    {
        throw new UnsupportedOperationException("This luminance source does not support rotation by 45 degrees.");
    }

    public final String toString()
    {
        byte abyte0[] = new byte[width];
        StringBuilder stringbuilder = new StringBuilder(height * (width + 1));
        for (int i = 0; i < height; i++)
        {
            abyte0 = getRow(i, abyte0);
            int j = 0;
            while (j < width) 
            {
                int k = abyte0[j] & 0xff;
                char c;
                if (k < 64)
                {
                    c = '#';
                } else
                if (k < 128)
                {
                    c = '+';
                } else
                if (k < 192)
                {
                    c = '.';
                } else
                {
                    c = ' ';
                }
                stringbuilder.append(c);
                j++;
            }
            stringbuilder.append('\n');
        }

        return stringbuilder.toString();
    }
}
