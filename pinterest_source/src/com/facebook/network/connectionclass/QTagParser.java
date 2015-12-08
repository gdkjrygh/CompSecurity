// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.network.connectionclass;

import android.os.StrictMode;
import android.util.Log;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.NoSuchElementException;

// Referenced classes of package com.facebook.network.connectionclass:
//            LineBufferReader, ByteArrayScanner

class QTagParser
{

    private static final String QTAGUID_UID_STATS = "/proc/net/xt_qtaguid/stats";
    private static final String TAG = "QTagParser";
    public static QTagParser sInstance;
    private static final ThreadLocal sLineBuffer = new _cls1();
    private static long sPreviousBytes = -1L;
    private static ByteArrayScanner sScanner = new ByteArrayScanner();
    private static LineBufferReader sStatsReader = new LineBufferReader();
    private String mPath;

    public QTagParser(String s)
    {
        mPath = s;
    }

    public static QTagParser getInstance()
    {
        com/facebook/network/connectionclass/QTagParser;
        JVM INSTR monitorenter ;
        QTagParser qtagparser;
        if (sInstance == null)
        {
            sInstance = new QTagParser("/proc/net/xt_qtaguid/stats");
        }
        qtagparser = sInstance;
        com/facebook/network/connectionclass/QTagParser;
        JVM INSTR monitorexit ;
        return qtagparser;
        Exception exception;
        exception;
        throw exception;
    }

    public long parseDataUsageForUidAndTag(int i)
    {
        android.os.StrictMode.ThreadPolicy threadpolicy;
        long l;
        threadpolicy = StrictMode.allowThreadDiskReads();
        l = 0L;
        Object obj;
        byte abyte0[];
        obj = new FileInputStream(mPath);
        sStatsReader.setFileStream(((FileInputStream) (obj)));
        abyte0 = (byte[])sLineBuffer.get();
        sStatsReader.skipLine();
        int j = 2;
_L2:
        int k = sStatsReader.readLine(abyte0);
        if (k == -1)
        {
            break MISSING_BLOCK_LABEL_238;
        }
        sScanner.reset(abyte0, k);
        sScanner.useDelimiter(' ');
        sScanner.skip();
        if (sScanner.nextStringEquals("lo")) goto _L2; else goto _L1
_L1:
        sScanner.skip();
        if (sScanner.nextInt() != i) goto _L2; else goto _L3
_L3:
        sScanner.skip();
        k = sScanner.nextInt();
        l += k;
        j++;
          goto _L2
        Object obj1;
        obj1;
        Log.e("QTagParser", (new StringBuilder("Cannot parse byte count at line")).append(j).append(".").toString());
          goto _L2
        Exception exception1;
        exception1;
        Exception exception;
        long l1;
        try
        {
            ((FileInputStream) (obj)).close();
            throw exception1;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj) { }
        finally
        {
            StrictMode.setThreadPolicy(threadpolicy);
        }
        Log.e("QTagParser", "Error reading from /proc/net/xt_qtaguid/stats. Please check if this file exists.");
        StrictMode.setThreadPolicy(threadpolicy);
        return -1L;
        obj1;
        Log.e("QTagParser", (new StringBuilder("Invalid number of tokens on line ")).append(j).append(".").toString());
          goto _L2
        ((FileInputStream) (obj)).close();
        if (sPreviousBytes != -1L)
        {
            break MISSING_BLOCK_LABEL_265;
        }
        sPreviousBytes = l;
        StrictMode.setThreadPolicy(threadpolicy);
        return -1L;
        l1 = sPreviousBytes;
        sPreviousBytes = l;
        StrictMode.setThreadPolicy(threadpolicy);
        return l - l1;
        throw exception;
    }


    private class _cls1 extends ThreadLocal
    {

        public final volatile Object initialValue()
        {
            return initialValue();
        }

        public final byte[] initialValue()
        {
            return new byte[512];
        }

        _cls1()
        {
        }
    }

}
