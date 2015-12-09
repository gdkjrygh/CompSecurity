// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.qrcode.encoder;

import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;
import com.google.zxing.qrcode.decoder.Mode;
import com.google.zxing.qrcode.decoder.Version;

// Referenced classes of package com.google.zxing.qrcode.encoder:
//            ByteMatrix

public final class QRCode
{

    private ErrorCorrectionLevel ecLevel;
    private int maskPattern;
    private ByteMatrix matrix;
    private Mode mode;
    private Version version;

    public QRCode()
    {
        maskPattern = -1;
    }

    public static boolean isValidMaskPattern(int i)
    {
        return i >= 0 && i < 8;
    }

    public final ByteMatrix getMatrix()
    {
        return matrix;
    }

    public final void setECLevel(ErrorCorrectionLevel errorcorrectionlevel)
    {
        ecLevel = errorcorrectionlevel;
    }

    public final void setMaskPattern(int i)
    {
        maskPattern = i;
    }

    public final void setMatrix(ByteMatrix bytematrix)
    {
        matrix = bytematrix;
    }

    public final void setMode(Mode mode1)
    {
        mode = mode1;
    }

    public final void setVersion(Version version1)
    {
        version = version1;
    }

    public final String toString()
    {
        StringBuilder stringbuilder = new StringBuilder(200);
        stringbuilder.append("<<\n");
        stringbuilder.append(" mode: ");
        stringbuilder.append(mode);
        stringbuilder.append("\n ecLevel: ");
        stringbuilder.append(ecLevel);
        stringbuilder.append("\n version: ");
        stringbuilder.append(version);
        stringbuilder.append("\n maskPattern: ");
        stringbuilder.append(maskPattern);
        if (matrix == null)
        {
            stringbuilder.append("\n matrix: null\n");
        } else
        {
            stringbuilder.append("\n matrix:\n");
            stringbuilder.append(matrix.toString());
        }
        stringbuilder.append(">>\n");
        return stringbuilder.toString();
    }
}
