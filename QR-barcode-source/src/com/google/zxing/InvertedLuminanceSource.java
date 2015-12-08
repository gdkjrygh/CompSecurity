// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing;


// Referenced classes of package com.google.zxing:
//            LuminanceSource

public final class InvertedLuminanceSource extends LuminanceSource
{

    private final LuminanceSource _flddelegate;

    public InvertedLuminanceSource(LuminanceSource luminancesource)
    {
        super(luminancesource.getWidth(), luminancesource.getHeight());
        _flddelegate = luminancesource;
    }

    public LuminanceSource crop(int i, int j, int k, int l)
    {
        return new InvertedLuminanceSource(_flddelegate.crop(i, j, k, l));
    }

    public byte[] getMatrix()
    {
        byte abyte0[] = _flddelegate.getMatrix();
        int i = getWidth();
        int k = getHeight() * i;
        byte abyte1[] = new byte[k];
        for (int j = 0; j < k; j++)
        {
            abyte1[j] = (byte)(255 - (abyte0[j] & 0xff));
        }

        return abyte1;
    }

    public byte[] getRow(int i, byte abyte0[])
    {
        abyte0 = _flddelegate.getRow(i, abyte0);
        int j = getWidth();
        for (i = 0; i < j; i++)
        {
            abyte0[i] = (byte)(255 - (abyte0[i] & 0xff));
        }

        return abyte0;
    }

    public LuminanceSource invert()
    {
        return _flddelegate;
    }

    public boolean isCropSupported()
    {
        return _flddelegate.isCropSupported();
    }

    public boolean isRotateSupported()
    {
        return _flddelegate.isRotateSupported();
    }

    public LuminanceSource rotateCounterClockwise()
    {
        return new InvertedLuminanceSource(_flddelegate.rotateCounterClockwise());
    }

    public LuminanceSource rotateCounterClockwise45()
    {
        return new InvertedLuminanceSource(_flddelegate.rotateCounterClockwise45());
    }
}
