// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.engine.ave;

import android.content.Context;
import android.text.TextUtils;
import com.qihoo.security.engine.ApkInfo;
import com.qihoo.security.engine.ClassesDexInfo;
import com.qihoo.security.engine.FileInfo;
import com.qihoo.security.env.QVSEnv;
import com.qihoo.security.services.ScanResult;
import com.qihoo360.common.utils.NativeLoader;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.IOException;

public class AveScanner
{

    public static final String AVE_DB_ZIP = "avedb.zip";
    public static final String AVE_DB_ZIP_T = "avedb_e.zip";
    public static final String AVE_DB_ZIP_V = "v_avedb.zip";
    public static final String AVE_DYNMOD = "heurmod_v2.jar";
    public static final String AVE_PATH = "ave";
    public static final String AVE_PATH_T = "ave_e";
    public static final String AVE_SIGDB = "v_sig.db";
    public static final int F_OK = 0;
    public static final String LIBAVE = "360avm-2.1.0.3007";
    public static final int R_OK = 4;
    private static final String TAG = "AveScanner";
    public static final int TYPE_APK = 1;
    public static final int TYPE_DEX = 3;
    public static final int TYPE_ELF = 2;
    public static final int W_OK = 2;
    public static final int X_OK = 1;
    private final long e = 0L;
    private final long h = 0L;

    public AveScanner()
    {
    }

    private native int Create(String s, String s1);

    public static native int access(String s, int i);

    public static native int chmod(String s, int i);

    private int parseResult(byte abyte0[], ScanResult scanresult)
    {
        DataInputStream datainputstream;
        if (abyte0.length <= 1)
        {
            break MISSING_BLOCK_LABEL_164;
        }
        datainputstream = new DataInputStream(new ByteArrayInputStream(abyte0));
        short word0;
        datainputstream.readByte();
        scanresult.fileInfo.apkInfo.maliceRank = datainputstream.readByte();
        if (scanresult.fileInfo.apkInfo.maliceRank == -1)
        {
            scanresult.fileInfo.apkInfo.maliceRank = 5;
        }
        scanresult.fileInfo.apkInfo.behavior = datainputstream.readInt();
        word0 = datainputstream.readShort();
        if (word0 <= 0)
        {
            break MISSING_BLOCK_LABEL_120;
        }
        byte abyte1[] = new byte[word0];
        datainputstream.read(abyte1);
        scanresult.fileInfo.trojanName = new String(abyte1);
        word0 = datainputstream.readShort();
        if (word0 <= 0)
        {
            break MISSING_BLOCK_LABEL_160;
        }
        byte abyte2[] = new byte[word0];
        datainputstream.read(abyte2);
        scanresult.fileInfo.fileDescription = new String(abyte2);
        try
        {
            datainputstream.close();
        }
        // Misplaced declaration of an exception variable
        catch (ScanResult scanresult) { }
        return abyte0[0];
        scanresult;
        try
        {
            datainputstream.close();
        }
        // Misplaced declaration of an exception variable
        catch (ScanResult scanresult) { }
        if (true)
        {
            break MISSING_BLOCK_LABEL_164;
        }
        abyte0;
        try
        {
            datainputstream.close();
        }
        // Misplaced declaration of an exception variable
        catch (ScanResult scanresult) { }
        throw abyte0;
    }

    private native byte[] scanFile(String s, int i);

    private native byte[] scanPackage(String s, long l, long l1);

    private native byte[] scanPackage(String s, String s1);

    public native void close();

    public int open(Context context)
    {
        File file = context.getFileStreamPath("ave");
        if (QVSEnv.bEvalMode)
        {
            File file1 = context.getFileStreamPath("ave_e");
            if (file1.exists() && file1.listFiles() != null && file1.listFiles().length > 0)
            {
                file = file1;
            }
        }
        return Create(NativeLoader.getLibraryPath(context, "360avm-2.1.0.3007"), file.getAbsolutePath());
    }

    public int scan(ScanResult scanresult)
    {
        ClassesDexInfo classesdexinfo = scanresult.fileInfo.apkInfo.openClassesDex(false);
        if (classesdexinfo.memoryPtr != 0L)
        {
            return parseResult(scanPackage(scanresult.fileInfo.filePath, classesdexinfo.memoryPtr, classesdexinfo.memorySize), scanresult);
        }
        if (!TextUtils.isEmpty(classesdexinfo.filePath))
        {
            return parseResult(scanPackage(scanresult.fileInfo.filePath, classesdexinfo.filePath), scanresult);
        } else
        {
            return -1;
        }
    }
}
