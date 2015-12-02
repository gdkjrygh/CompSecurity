// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.engine.ave;

import android.content.Context;
import com.qihoo.security.engine.ApkInfo;
import com.qihoo.security.engine.FileInfo;
import com.qihoo.security.env.QVSEnv;
import com.qihoo.security.services.ScanResult;
import com.qihoo360.common.utils.NativeLoader;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.IOException;

public class AveExtraScanner
{

    private int a;

    public AveExtraScanner()
    {
        a = 0;
    }

    private int a(byte abyte0[], ScanResult scanresult)
    {
        DataInputStream datainputstream;
        if (abyte0.length <= 1)
        {
            break MISSING_BLOCK_LABEL_171;
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
        catch (byte abyte0[])
        {
            return 1;
        }
        return 1;
        scanresult;
        try
        {
            datainputstream.close();
        }
        // Misplaced declaration of an exception variable
        catch (ScanResult scanresult) { }
        return abyte0[0];
        abyte0;
        try
        {
            datainputstream.close();
        }
        // Misplaced declaration of an exception variable
        catch (ScanResult scanresult) { }
        throw abyte0;
    }

    private native int nt1(String s, String s1);

    private native int nt2(int i);

    private native int nt3(int i, int j, int k, int l, int i1);

    private native byte[] nt4(int i, String s, int ai[]);

    private native byte[] nt5(int i, int ai[]);

    public int a(ScanResult scanresult)
    {
        byte abyte0[];
        int ai[];
        int i;
        int j;
        String s = scanresult.fileInfo.filePath;
        ai = new int[1];
        abyte0 = a(s, ai);
        j = 0;
        i = 0;
_L7:
        int k = i;
        if (abyte0 == null) goto _L2; else goto _L1
_L1:
        if (j < 10) goto _L4; else goto _L3
_L3:
        k = i;
_L2:
        boolean flag;
        if (k >= 0)
        {
            return 0;
        } else
        {
            return k;
        }
_L4:
        i = a(abyte0, scanresult);
        if (i > 0 && scanresult.fileInfo.apkInfo.maliceRank == 5)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (i == 0)
        {
            break; /* Loop/switch isn't completed */
        }
        k = i;
        if (!flag) goto _L2; else goto _L5
_L5:
        abyte0 = a(ai);
        j++;
        if (true) goto _L7; else goto _L6
_L6:
    }

    public void a()
    {
        if (a != 0)
        {
            nt2(a);
        }
    }

    public boolean a(Context context)
    {
        if (a != 0)
        {
            return true;
        }
        File file = context.getFileStreamPath("ave");
        if (QVSEnv.bEvalMode)
        {
            File file1 = context.getFileStreamPath("ave_e");
            if (file1.exists() && file1.listFiles() != null && file1.listFiles().length > 0)
            {
                file = file1;
            }
        }
        return a(NativeLoader.getLibraryPath(context, "360avm-2.1.0.3007"), file.getAbsolutePath());
    }

    public boolean a(String s, String s1)
    {
        a = nt1(s, s1);
        return a != 0;
    }

    public byte[] a(String s, int ai[])
    {
        if (a == 0)
        {
            if (ai != null && ai.length > 0)
            {
                ai[0] = -1;
            }
            return null;
        } else
        {
            return nt4(a, s, ai);
        }
    }

    public byte[] a(int ai[])
    {
        if (a == 0)
        {
            if (ai != null && ai.length > 0)
            {
                ai[0] = -1;
            }
            return null;
        } else
        {
            return nt5(a, ai);
        }
    }

    public boolean b()
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (a != 0)
        {
            flag = flag1;
            if (nt3(a, 0, 2, 0x800000, 10) == 0)
            {
                flag = true;
            }
        }
        return flag;
    }

    static 
    {
        System.loadLibrary("qvmwrapper-1.0.2");
    }
}
