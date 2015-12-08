// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Environment;
import android.os.Process;
import android.util.Log;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public final class ahm
{

    private static final SimpleDateFormat a = new SimpleDateFormat("yyyy_MM_dd_HH_mm");
    private static final SimpleDateFormat b = new SimpleDateFormat("MM-dd HH:mm:ss");
    private static String c;
    private static File d;
    private static BufferedWriter e;

    public static void a()
    {
        ahm;
        JVM INSTR monitorenter ;
        if (e != null)
        {
            e.close();
        }
        ahm;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public static void a(int i, String s, String s1)
    {
        ahm;
        JVM INSTR monitorenter ;
        String s4 = "";
        if (i == 7) goto _L2; else goto _L1
_L1:
        if (e == null)
        {
            b();
        }
          goto _L2
_L5:
        String s2 = "NONE";
_L3:
        String s3 = s4;
        if (e == null)
        {
            break MISSING_BLOCK_LABEL_102;
        }
        s3 = s4;
        s = String.format("%s\t[%s]\t%s\t%s\r\n", new Object[] {
            b.format(new Date()).toString(), s, s2, s1
        });
        s3 = s;
        e.write(s);
        s3 = s;
        e.flush();
_L4:
        ahm;
        JVM INSTR monitorexit ;
        return;
_L6:
        s2 = "VERBOSE";
          goto _L3
        s;
        d = null;
        c = null;
        s = e;
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_135;
        }
        try
        {
            e.close();
        }
        // Misplaced declaration of an exception variable
        catch (String s) { }
        e = null;
        b();
        e.write(s3);
        e.flush();
          goto _L4
        s;
        Log.e("LogFileWriter", "An exception occurred", s);
          goto _L4
        s;
        throw s;
_L2:
        i;
        JVM INSTR tableswitch 2 6: default 216
    //                   2 106
    //                   3 219
    //                   4 225
    //                   5 231
    //                   6 237;
           goto _L5 _L6 _L7 _L8 _L9 _L10
_L7:
        s2 = "DEBUG";
          goto _L3
_L8:
        s2 = "INFO";
          goto _L3
_L9:
        s2 = "WARN";
          goto _L3
_L10:
        s2 = "ERROR";
          goto _L3
    }

    private static void b()
    {
        ahm;
        JVM INSTR monitorenter ;
        if (c == null && Environment.getExternalStorageDirectory() != null && Environment.getExternalStorageDirectory().canWrite())
        {
            c = (new StringBuilder()).append(Environment.getExternalStorageDirectory()).append("/connected_app/log/").toString();
            File file = new File(c);
            if (!file.exists() && !file.mkdirs())
            {
                c = null;
            }
        }
        if (c == null || d != null)
        {
            break MISSING_BLOCK_LABEL_188;
        }
        String s = a.format(new Date()).toString();
        d = new File((new StringBuilder()).append(c).append(s).append("_").append(Process.myPid()).append("_carcore.txt").toString());
        if (!d.exists())
        {
            d.createNewFile();
        }
        e = new BufferedWriter(new FileWriter(d));
_L1:
        ahm;
        JVM INSTR monitorexit ;
        return;
        Object obj;
        obj;
        ((FileNotFoundException) (obj)).getMessage();
          goto _L1
        obj;
        throw obj;
        obj;
        ((IOException) (obj)).getMessage();
          goto _L1
    }

}
