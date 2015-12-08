// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.scan;


public class Scanner
{
    public static class ScanResult
    {

        public byte data[];
        public int scale;
        public int x;
        public int y;

        ScanResult()
        {
        }
    }


    protected static boolean _isLoaded;

    public Scanner()
    {
    }

    public static ScanResult scan(byte abyte0[], int i, int j, int k)
    {
        if (!_isLoaded)
        {
            throw new IllegalStateException("Scan library not loaded");
        } else
        {
            return scanInternal(abyte0, i, j, k);
        }
    }

    protected static native ScanResult scanInternal(byte abyte0[], int i, int j, int k);

    static 
    {
        int i;
        i = 0;
        _isLoaded = false;
_L2:
        if (i >= 3)
        {
            break MISSING_BLOCK_LABEL_39;
        }
        System.loadLibrary((new String[] {
            "kikcode_scan", "libkikcode_scan", "libkikcode_scan.so"
        })[i]);
        _isLoaded = true;
        if (_isLoaded)
        {
            break MISSING_BLOCK_LABEL_75;
        }
        System.load((new StringBuilder()).append(System.getProperty("user.dir")).append("/build/libkikcode_scan.so").toString());
        _isLoaded = true;
        return;
        UnsatisfiedLinkError unsatisfiedlinkerror;
        unsatisfiedlinkerror;
        i++;
        if (true) goto _L2; else goto _L1
_L1:
        unsatisfiedlinkerror;
    }
}
