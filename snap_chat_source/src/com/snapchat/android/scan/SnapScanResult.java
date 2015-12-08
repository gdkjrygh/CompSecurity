// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.scan;

import android.graphics.Bitmap;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;

public class SnapScanResult
{
    public static class ScannedData
    {

        private final boolean a;
        private int b;
        private final byte c[];

        public byte[] getSnapcodeMessage()
        {
            return c;
        }

        public int getSnapcodeVersion()
        {
            return b;
        }

        public boolean hasScannedData()
        {
            return a;
        }

        public ScannedData(boolean flag, int i, byte abyte0[])
        {
            a = flag;
            b = i;
            c = abyte0;
        }
    }

    public static class ScannerViewData
    {

        private final boolean a;
        private final byte b[];
        private final int c;
        private final int d;

        public Bitmap getScannerViewBitmapImage()
        {
            if (a && b != null && d > 0 && c > 0)
            {
                IntBuffer intbuffer = ByteBuffer.wrap(b).asIntBuffer();
                int ai[] = new int[intbuffer.remaining()];
                intbuffer.get(ai);
                return Bitmap.createBitmap(ai, c, d, android.graphics.Bitmap.Config.ARGB_8888);
            } else
            {
                return null;
            }
        }

        public byte[] getScannerViewImage()
        {
            return b;
        }

        public boolean hasScannerViewImage()
        {
            return a;
        }

        public ScannerViewData(boolean flag, byte abyte0[], int i, int j)
        {
            a = flag;
            b = abyte0;
            c = i;
            d = j;
        }
    }


    private final ScannerViewData a;
    private final ScannedData b;

    public SnapScanResult(ScannerViewData scannerviewdata, ScannedData scanneddata)
    {
        a = scannerviewdata;
        b = scanneddata;
    }

    public ScannedData getScannedData()
    {
        return b;
    }

    public ScannerViewData getScannerViewData()
    {
        return a;
    }
}
