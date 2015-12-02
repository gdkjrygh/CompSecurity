// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.engine.ave;

import android.content.ContentValues;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.Cursor;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;
import com.qihoo.security.engine.ApkInfo;
import com.qihoo.security.engine.FileInfo;
import com.qihoo.security.engine.cloudscan.SampleDetector;
import com.qihoo.security.env.QVSEnv;
import com.qihoo.security.services.ScanResult;
import com.qihoo360.common.utils.FileUtil;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Locale;
import java.util.zip.Inflater;

public class b
{
    class a
        implements android.database.sqlite.SQLiteDatabase.CursorFactory
    {

        final byte a[];
        final b b;

        public Cursor newCursor(SQLiteDatabase sqlitedatabase, SQLiteCursorDriver sqlitecursordriver, String s, SQLiteQuery sqlitequery)
        {
            sqlitequery.bindBlob(1, a);
            return new SQLiteCursor(sqlitedatabase, sqlitecursordriver, s, sqlitequery);
        }

        public a(byte abyte0[])
        {
            b = b.this;
            super();
            a = abyte0;
        }
    }


    public static String a = Locale.getDefault().toString();
    private static final String c = com/qihoo/security/engine/ave/b.getSimpleName();
    public int b;
    private final Context d;
    private SQLiteDatabase e;
    private SQLiteDatabase f;

    public b(Context context)
    {
        d = context;
        try
        {
            a = d.getResources().getConfiguration().locale.toString();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return;
        }
    }

    private static long a(File file)
    {
        long l1 = 0L;
        if (file.exists()) goto _L2; else goto _L1
_L1:
        long l = l1;
_L4:
        return l;
_L2:
        Object obj;
        l = l1;
        if (!file.isFile())
        {
            continue; /* Loop/switch isn't completed */
        }
        l = l1;
        if (!file.getAbsolutePath().endsWith("timestamp"))
        {
            continue; /* Loop/switch isn't completed */
        }
        obj = null;
        file = new DataInputStream(new FileInputStream(file));
        l = Long.parseLong(file.readUTF().trim());
        l1 = l;
        l = l1;
        if (file != null)
        {
            try
            {
                file.close();
            }
            // Misplaced declaration of an exception variable
            catch (File file)
            {
                return l1;
            }
            return l1;
        }
        if (true) goto _L4; else goto _L3
_L3:
        file;
        file = null;
_L8:
        l = l1;
        if (file == null) goto _L4; else goto _L5
_L5:
        try
        {
            file.close();
        }
        // Misplaced declaration of an exception variable
        catch (File file)
        {
            return 0L;
        }
        return 0L;
        file;
_L7:
        if (obj != null)
        {
            try
            {
                ((DataInputStream) (obj)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj) { }
        }
        throw file;
        Exception exception1;
        exception1;
        obj = file;
        file = exception1;
        if (true) goto _L7; else goto _L6
_L6:
        Exception exception;
        exception;
          goto _L8
    }

    private SQLiteDatabase a(File file, int i)
    {
        Object obj = null;
        this;
        JVM INSTR monitorenter ;
        try
        {
            file = SQLiteDatabase.openDatabase(file.getAbsolutePath(), null, i);
        }
        // Misplaced declaration of an exception variable
        catch (File file)
        {
            file = obj;
        }
        finally
        {
            this;
        }
        return file;
        throw file;
    }

    private String a(int i)
    {
        return String.valueOf(0x1000000 | i << 16 | b & 0xffff);
    }

    private boolean a(ScanResult scanresult, int i)
    {
        Cursor cursor = null;
        Cursor cursor1 = e.query("d", new String[] {
            "value"
        }, "id=?", new String[] {
            String.valueOf(i)
        }, null, null, null);
        cursor = cursor1;
        if (cursor == null) goto _L2; else goto _L1
_L1:
        if (!cursor.moveToFirst()) goto _L2; else goto _L3
_L3:
        byte abyte0[] = cursor.getBlob(0);
        if (abyte0 == null) goto _L2; else goto _L4
_L4:
        if (abyte0.length <= 3) goto _L2; else goto _L5
_L5:
        ByteArrayOutputStream bytearrayoutputstream;
        byte abyte1[];
        Inflater inflater;
        bytearrayoutputstream = new ByteArrayOutputStream();
        abyte1 = new byte[64];
        inflater = new Inflater(true);
        inflater.setInput(abyte0);
_L6:
        if (!inflater.finished())
        {
            break MISSING_BLOCK_LABEL_153;
        }
        inflater.end();
        scanresult.fileInfo.softDescription = new String(bytearrayoutputstream.toByteArray(), "UTF-8");
        if (cursor != null)
        {
            cursor.close();
        }
        return true;
        bytearrayoutputstream.write(abyte1, 0, inflater.inflate(abyte1));
          goto _L6
        scanresult;
_L10:
        if (cursor != null)
        {
            cursor.close();
        }
_L7:
        return false;
        scanresult;
_L8:
        if (cursor != null)
        {
            cursor.close();
        }
        throw scanresult;
_L2:
        if (cursor != null)
        {
            cursor.close();
        }
          goto _L7
        scanresult;
          goto _L8
        scanresult;
        cursor = null;
        if (true) goto _L10; else goto _L9
_L9:
    }

    public static boolean a(File file, long l)
    {
        Object obj = null;
        file = new DataOutputStream(new FileOutputStream(file));
        file.writeUTF((new StringBuilder(String.valueOf(l))).toString());
        if (file != null)
        {
            try
            {
                file.close();
            }
            // Misplaced declaration of an exception variable
            catch (File file) { }
        }
        return true;
        file;
        file = null;
_L4:
        if (file != null)
        {
            try
            {
                file.close();
            }
            // Misplaced declaration of an exception variable
            catch (File file) { }
        }
        return false;
        file;
_L2:
        if (obj != null)
        {
            try
            {
                ((DataOutputStream) (obj)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj) { }
        }
        throw file;
        Exception exception1;
        exception1;
        obj = file;
        file = exception1;
        if (true) goto _L2; else goto _L1
_L1:
        Exception exception;
        exception;
        if (true) goto _L4; else goto _L3
_L3:
    }

    public static boolean a(File file, File file1)
    {
        if (file.exists()) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        Object obj = null;
        file = new DataInputStream(new FileInputStream(file));
        long l = Long.parseLong(file.readUTF().trim());
        if (file != null)
        {
            try
            {
                file.close();
            }
            // Misplaced declaration of an exception variable
            catch (File file) { }
        }
        return a(file1, l);
        file;
        file = null;
_L6:
        if (file == null) goto _L1; else goto _L3
_L3:
        try
        {
            file.close();
        }
        // Misplaced declaration of an exception variable
        catch (File file)
        {
            return false;
        }
        return false;
        file;
        file1 = obj;
_L5:
        if (file1 != null)
        {
            try
            {
                file1.close();
            }
            // Misplaced declaration of an exception variable
            catch (File file1) { }
        }
        throw file;
        Exception exception;
        exception;
        file1 = file;
        file = exception;
        if (true) goto _L5; else goto _L4
_L4:
        file1;
          goto _L6
    }

    private static boolean b(File file, File file1)
    {
        File file2;
        Object obj1;
        file2 = null;
        obj1 = null;
        file = new FileInputStream(file);
        Exception exception1;
        try
        {
            file1 = new FileOutputStream(file1);
        }
        // Misplaced declaration of an exception variable
        catch (File file1)
        {
            Object obj = null;
            file1 = file;
            file = obj;
            continue; /* Loop/switch isn't completed */
        }
        finally
        {
            continue; /* Loop/switch isn't completed */
        }
        FileUtil.copyStream(file, file1);
        if (file != null)
        {
            try
            {
                file.close();
            }
            // Misplaced declaration of an exception variable
            catch (File file) { }
        }
        if (file1 != null)
        {
            try
            {
                file1.close();
            }
            // Misplaced declaration of an exception variable
            catch (File file) { }
        }
        return true;
        file;
        file = null;
        file1 = obj1;
_L4:
        if (file1 != null)
        {
            try
            {
                file1.close();
            }
            // Misplaced declaration of an exception variable
            catch (File file1) { }
        }
        if (file != null)
        {
            try
            {
                file.close();
            }
            // Misplaced declaration of an exception variable
            catch (File file) { }
        }
        return false;
        file1;
        file = null;
_L2:
        if (file != null)
        {
            try
            {
                file.close();
            }
            // Misplaced declaration of an exception variable
            catch (File file) { }
        }
        if (file2 != null)
        {
            try
            {
                file2.close();
            }
            // Misplaced declaration of an exception variable
            catch (File file) { }
        }
        throw file1;
        exception1;
        file2 = file1;
        file1 = exception1;
        if (true) goto _L2; else goto _L1
_L1:
        break MISSING_BLOCK_LABEL_22;
        Exception exception;
        exception;
        File file3 = file;
        file = file1;
        file1 = file3;
        if (true) goto _L4; else goto _L3
_L3:
    }

    private void e()
    {
        this;
        JVM INSTR monitorenter ;
        SQLiteDatabase sqlitedatabase = e;
        if (sqlitedatabase == null)
        {
            break MISSING_BLOCK_LABEL_23;
        }
        Exception exception;
        try
        {
            e.close();
        }
        catch (Exception exception1) { }
        e = null;
        this;
        JVM INSTR monitorexit ;
        return;
        exception;
        throw exception;
    }

    private void f()
    {
        this;
        JVM INSTR monitorenter ;
        SQLiteDatabase sqlitedatabase = f;
        if (sqlitedatabase == null)
        {
            break MISSING_BLOCK_LABEL_23;
        }
        Exception exception;
        try
        {
            f.close();
        }
        catch (Exception exception1) { }
        f = null;
        this;
        JVM INSTR monitorexit ;
        return;
        exception;
        throw exception;
    }

    public boolean a()
    {
        boolean flag2 = false;
        this;
        JVM INSTR monitorenter ;
        Object obj;
        long l;
        long l1;
        e();
        obj = d.getFileStreamPath("ave");
        l = FileUtil.getFileTimestamp(d, "v_avedb.zip");
        l1 = FileUtil.getAssetTimestamp(d, "v_avedb.zip");
        if (l1 <= 0L) goto _L2; else goto _L1
_L1:
        IOException ioexception;
        File file;
        boolean flag;
        int i;
        byte byte0;
        byte byte1;
        boolean flag1;
        if (l1 > l)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        l = FileUtil.getFileTimestamp(d, "heurmod_v2.jar");
        if (FileUtil.getAssetTimestamp(d, "heurmod_v2.jar") > l)
        {
            byte0 = 1;
        } else
        {
            byte0 = 0;
        }
        l = FileUtil.getFileTimestamp(d, "v_sig.db");
        if (FileUtil.getAssetTimestamp(d, "v_sig.db") > l)
        {
            flag = true;
        } else
        {
            flag = false;
        }
          goto _L3
_L39:
        flag1 = ((File) (obj)).exists();
        if (!flag1)
        {
            break MISSING_BLOCK_LABEL_137;
        }
        FileUtil.deleteDirectory(((File) (obj)));
_L40:
        if (((File) (obj)).exists()) goto _L5; else goto _L4
_L4:
        flag1 = ((File) (obj)).mkdir();
        if (flag1) goto _L5; else goto _L6
_L6:
        flag1 = flag2;
_L10:
        this;
        JVM INSTR monitorexit ;
        return flag1;
_L5:
        if (i != 1) goto _L8; else goto _L7
_L7:
        file = new File(d.getFilesDir(), "avedb.zip");
        if (file.exists())
        {
            file.delete();
        }
        file = new File(d.getFilesDir(), "v_avedb.zip");
        if (file.exists())
        {
            file.delete();
        }
        File file1 = new File(d.getFilesDir(), "v_avedb.zip.timestamp");
        if (file1.exists())
        {
            file1.delete();
        }
        flag1 = flag2;
        if (!FileUtil.copyAssetToFile(d, "v_avedb.zip", file, true)) goto _L10; else goto _L9
_L9:
        (new File(((File) (obj)), "360ave.def")).delete();
        (new File(((File) (obj)), "360info.def")).delete();
        flag1 = flag2;
        if (SampleDetector.OpenDatabase(file.getAbsolutePath(), ((File) (obj)).getAbsolutePath(), "360") < 0) goto _L10; else goto _L11
_L11:
        if (FileUtil.copyAssetToFile(d, "v_avedb.zip.timestamp", new File(((File) (obj)), "v_avedb.zip.timestamp"), false));
_L23:
        if (byte0 != 1) goto _L13; else goto _L12
_L12:
        file = new File(d.getFilesDir(), "heurmod_v2.jar");
        if (file.exists())
        {
            file.delete();
        }
        File file2 = new File(d.getFilesDir(), "heurmod_v2.jar.timestamp");
        if (file2.exists())
        {
            file2.delete();
        }
        flag1 = flag2;
        if (!FileUtil.copyAssetToFile(d, "heurmod_v2.jar", file, true)) goto _L10; else goto _L14
_L14:
        file = new File(((File) (obj)), "heurmod_v2.jar");
        if (file.exists())
        {
            file.delete();
        }
        File file3 = new File(((File) (obj)), "heurmod_v2.jar.timestamp");
        if (file3.exists())
        {
            file3.delete();
        }
        flag1 = flag2;
        if (!FileUtil.copyAssetToFile(d, "heurmod_v2.jar", file, true)) goto _L10; else goto _L15
_L15:
        if (!FileUtil.copyAssetToFile(d, "heurmod_v2.jar.timestamp", new File(((File) (obj)), "heurmod_v2.jar.timestamp"), false));
_L29:
        if (!flag) goto _L17; else goto _L16
_L16:
        file = new File(d.getFilesDir(), "v_sig.db");
        if (file.exists())
        {
            file.delete();
        }
        File file4 = new File(d.getFilesDir(), "v_sig.db.timestamp");
        if (file4.exists())
        {
            file4.delete();
        }
        flag1 = flag2;
        if (!FileUtil.copyAssetToFile(d, "v_sig.db", file, true)) goto _L10; else goto _L18
_L18:
        file = new File(((File) (obj)), "v_sig.db");
        if (file.exists())
        {
            file.delete();
        }
        File file5 = new File(((File) (obj)), "v_sig.db.timestamp");
        if (file5.exists())
        {
            file5.delete();
        }
        flag1 = flag2;
        if (!FileUtil.copyAssetToFile(d, "v_sig.db", file, true)) goto _L10; else goto _L19
_L19:
        byte1 = flag;
        if (FileUtil.copyAssetToFile(d, "v_sig.db.timestamp", new File(((File) (obj)), "v_sig.db.timestamp"), false))
        {
            byte1 = flag;
        }
          goto _L20
_L41:
        (new File(((File) (obj)), "vdb.cache")).delete();
        FileUtil.copyAssetToFile(d, "vdb.cache", new File(((File) (obj)), "vdb.cache"), false);
_L42:
        b = (int)FileUtil.getFileTimestamp(d, "v_avedb.zip");
_L36:
        file = d.getFileStreamPath("ave_e");
        l = FileUtil.getFileTimestamp(d, "avedb_e.zip");
        l1 = a(new File(file, "avedb_e.zip.timestamp"));
        if (l <= l1)
        {
            break MISSING_BLOCK_LABEL_929;
        }
        try
        {
            FileUtil.deleteDirectory(file);
        }
        catch (IOException ioexception3) { }
        file.mkdir();
        SampleDetector.OpenDatabase((new File(d.getFilesDir(), "avedb_e.zip")).getAbsolutePath(), file.getAbsolutePath(), "360");
        FileUtil.copyAssetToFile(d, "vdb.cache", new File(file, "vdb.cache"), false);
        a(new File(file, "v_sig.db.timestamp"), l);
        a(new File(file, "heurmod_v2.jar.timestamp"), l);
        if (!a(new File(file, "avedb_e.zip.timestamp"), l));
        if (!QVSEnv.bEvalMode)
        {
            break MISSING_BLOCK_LABEL_985;
        }
        file = d.getFileStreamPath("ave_e");
        if (!file.exists() || file.listFiles() == null || file.listFiles().length <= 0)
        {
            break MISSING_BLOCK_LABEL_985;
        }
        b = (int)FileUtil.getFileTimestamp(d, "avedb_e.zip");
        obj = file;
        e = a(new File(((File) (obj)), "v_sig.db"), 1);
        flag1 = flag2;
        if (e == null) goto _L10; else goto _L21
_L21:
        flag1 = true;
          goto _L10
_L8:
        l = FileUtil.getFileTimestamp(d, "v_avedb.zip");
        if (l <= a(new File(((File) (obj)), "v_avedb.zip.timestamp"))) goto _L23; else goto _L22
_L22:
        file = new File(d.getFilesDir(), "avedb.zip");
        if (!file.exists()) goto _L25; else goto _L24
_L24:
        flag1 = flag2;
        if (!file.delete()) goto _L10; else goto _L26
_L25:
        (new File(((File) (obj)), "360ave.def")).delete();
        (new File(((File) (obj)), "360info.def")).delete();
        flag1 = flag2;
        if (SampleDetector.OpenDatabase((new File(d.getFilesDir(), "v_avedb.zip")).getAbsolutePath(), ((File) (obj)).getAbsolutePath(), "360") < 0) goto _L10; else goto _L27
_L27:
        if (!a(new File(((File) (obj)), "v_avedb.zip.timestamp"), l));
          goto _L26
_L13:
        l = FileUtil.getFileTimestamp(d, "heurmod_v2.jar");
        if (l <= a(new File(((File) (obj)), "heurmod_v2.jar.timestamp"))) goto _L29; else goto _L28
_L28:
        file = new File(((File) (obj)), "heurmod_v2.jar");
        if (file.exists())
        {
            file.delete();
        }
        flag1 = flag2;
        if (!b(new File(d.getFilesDir(), "heurmod_v2.jar"), file)) goto _L10; else goto _L30
_L30:
        a(new File(((File) (obj)), "heurmod_v2.jar.timestamp"), l);
        byte0 = 2;
          goto _L29
_L17:
        l = FileUtil.getFileTimestamp(d, "v_sig.db");
        byte1 = flag;
        if (l <= a(new File(((File) (obj)), "v_sig.db.timestamp")))
        {
            continue; /* Loop/switch isn't completed */
        }
        file = new File(((File) (obj)), "v_sig.db");
        if (file.exists())
        {
            file.delete();
        }
        flag1 = flag2;
        if (!b(new File(d.getFilesDir(), "v_sig.db"), file)) goto _L10; else goto _L31
_L31:
        a(new File(((File) (obj)), "v_sig.db.timestamp"), l);
        byte1 = 2;
        continue; /* Loop/switch isn't completed */
_L2:
        file = d.getFileStreamPath("avedb.zip");
        if (!(new File(((File) (obj)), "v_sig.db")).exists()) goto _L33; else goto _L32
_L32:
        l = FileUtil.getFileTimestamp(d, "avedb.zip");
        if (FileUtil.getAssetTimestamp(d, "avedb.zip") > l)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!flag) goto _L35; else goto _L34
_L34:
        flag1 = FileUtil.copyAssetToFile(d, "avedb.zip", file, true);
        if (!flag1)
        {
            break MISSING_BLOCK_LABEL_1590;
        }
        try
        {
            FileUtil.deleteDirectory(((File) (obj)));
        }
        catch (IOException ioexception2) { }
        ((File) (obj)).mkdir();
        SampleDetector.OpenDatabase(file.getAbsolutePath(), ((File) (obj)).getAbsolutePath(), "360");
        FileUtil.copyAssetToFile(d, "vdb.cache", new File(((File) (obj)), "vdb.cache"), false);
        l = FileUtil.getAssetTimestamp(d, "avedb.zip");
        a(new File(((File) (obj)), "v_sig.db.timestamp"), l);
        a(new File(((File) (obj)), "heurmod_v2.jar.timestamp"), l);
        if (!a(new File(((File) (obj)), "avedb.zip.timestamp"), l));
_L38:
        b = (int)FileUtil.getFileTimestamp(d, "avedb.zip");
          goto _L36
        obj;
        throw obj;
_L33:
        flag = true;
        break MISSING_BLOCK_LABEL_1454;
_L35:
        l = FileUtil.getFileTimestamp(d, "avedb.zip");
        l1 = a(new File(((File) (obj)), "avedb.zip.timestamp"));
        if (l <= l1) goto _L38; else goto _L37
_L37:
        try
        {
            FileUtil.deleteDirectory(((File) (obj)));
        }
        catch (IOException ioexception1) { }
        ((File) (obj)).mkdir();
        SampleDetector.OpenDatabase((new File(d.getFilesDir(), "avedb.zip")).getAbsolutePath(), ((File) (obj)).getAbsolutePath(), "360");
        FileUtil.copyAssetToFile(d, "vdb.cache", new File(((File) (obj)), "vdb.cache"), false);
        a(new File(((File) (obj)), "v_sig.db.timestamp"), l);
        a(new File(((File) (obj)), "heurmod_v2.jar.timestamp"), l);
        flag1 = a(new File(((File) (obj)), "avedb.zip.timestamp"), l);
        if (!flag1);
          goto _L38
        ioexception;
        flag1 = flag2;
          goto _L10
_L3:
        if (i != 1 && byte0 != 1 && !flag) goto _L40; else goto _L39
_L20:
        if (i <= 0 && byte0 <= 0 && byte1 <= 0) goto _L42; else goto _L41
_L26:
        i = 2;
          goto _L23
    }

    public boolean a(ScanResult scanresult)
    {
        Cursor cursor;
        cursor = null;
        if (f == null)
        {
            return false;
        }
        Object obj;
        obj = f;
        String s = scanresult.fileInfo.apkInfo.packageName;
        obj = ((SQLiteDatabase) (obj)).query("p", new String[] {
            "key", "v", "r", "b", "h", "d", "t", "c", "l", "s", 
            "m", "f", "x"
        }, "key=?", new String[] {
            s
        }, null, null, null);
        cursor = ((Cursor) (obj));
        if (cursor == null) goto _L2; else goto _L1
_L1:
        cursor.moveToFirst();
        if (cursor.getCount() <= 0) goto _L2; else goto _L3
_L3:
        int i;
        int j;
        i = cursor.getInt(1);
        j = scanresult.fileInfo.apkInfo.versionCode;
        if (j != i)
        {
            if (cursor != null)
            {
                cursor.close();
            }
            return false;
        }
        boolean flag = Arrays.equals(cursor.getBlob(4), scanresult.fileInfo.apkInfo.getSigHash());
        if (!flag)
        {
            if (cursor != null)
            {
                cursor.close();
            }
            return false;
        }
        long l;
        long l1;
        l = cursor.getInt(8);
        l1 = scanresult.fileInfo.apkInfo.getFileSize();
        if (l != l1)
        {
            if (cursor != null)
            {
                cursor.close();
            }
            return false;
        }
        scanresult.fileInfo.apkInfo.maliceRank = cursor.getInt(2);
        scanresult.fileInfo.apkInfo.behavior = cursor.getInt(3);
        scanresult.fileInfo.softDescription = cursor.getString(5);
        scanresult.fileInfo.trojanName = cursor.getString(6);
        scanresult.fileInfo.category = cursor.getString(7);
        scanresult.fileInfo.apkInfo.extraInfo = cursor.getString(9);
        scanresult.fileInfo.apkInfo.timestamp = cursor.getInt(10);
        if (scanresult.fileInfo.apkInfo.mFileHash == null)
        {
            scanresult.fileInfo.apkInfo.mFileHash = cursor.getBlob(11);
            if (scanresult.fileInfo.apkInfo.mFileHash != null && scanresult.fileInfo.apkInfo.mFileHash.length != 16)
            {
                scanresult.fileInfo.apkInfo.mFileHash = null;
            }
        }
        if (scanresult.fileInfo.apkInfo.mDexHash == null)
        {
            scanresult.fileInfo.apkInfo.mDexHash = cursor.getBlob(12);
            if (scanresult.fileInfo.apkInfo.mDexHash != null && scanresult.fileInfo.apkInfo.mDexHash.length != 16)
            {
                scanresult.fileInfo.apkInfo.mDexHash = null;
            }
        }
        if (cursor != null)
        {
            cursor.close();
        }
        return true;
        scanresult;
        cursor = null;
_L7:
        if (cursor != null)
        {
            cursor.close();
        }
_L4:
        return false;
        scanresult;
_L5:
        if (cursor != null)
        {
            cursor.close();
        }
        throw scanresult;
_L2:
        if (cursor != null)
        {
            cursor.close();
        }
          goto _L4
        scanresult;
          goto _L5
        scanresult;
        if (true) goto _L7; else goto _L6
_L6:
    }

    public boolean a(Collection collection)
    {
        if (f == null) goto _L2; else goto _L1
_L1:
        f.beginTransaction();
        collection = collection.iterator();
_L6:
        if (collection.hasNext()) goto _L4; else goto _L3
_L3:
        f.setTransactionSuccessful();
        try
        {
            f.endTransaction();
        }
        // Misplaced declaration of an exception variable
        catch (Collection collection) { }
        return true;
_L4:
        try
        {
            ScanResult scanresult = (ScanResult)collection.next();
            if (scanresult.fileInfo.apkInfo.isInstalled)
            {
                b(scanresult);
            }
            continue; /* Loop/switch isn't completed */
        }
        // Misplaced declaration of an exception variable
        catch (Collection collection) { }
        finally { }
        f.endTransaction();
        if (false)
        {
        } else
        {
            break MISSING_BLOCK_LABEL_44;
        }
        f.endTransaction();
        throw collection;
_L2:
        return false;
        if (true) goto _L6; else goto _L5
_L5:
    }

    public boolean b()
    {
        boolean flag = true;
        this;
        JVM INSTR monitorenter ;
        Object obj1 = d.getFileStreamPath("ave");
        Object obj = obj1;
        File file;
        if (!QVSEnv.bEvalMode)
        {
            break MISSING_BLOCK_LABEL_73;
        }
        file = d.getFileStreamPath("ave_e");
        obj = obj1;
        if (!file.exists())
        {
            break MISSING_BLOCK_LABEL_73;
        }
        obj = obj1;
        if (file.listFiles() == null)
        {
            break MISSING_BLOCK_LABEL_73;
        }
        obj = obj1;
        if (file.listFiles().length > 0)
        {
            obj = d.getFileStreamPath("ave_e");
        }
        if (!((File) (obj)).exists())
        {
            ((File) (obj)).mkdir();
        }
        obj = new File(((File) (obj)), "vdb.cache");
        if (!((File) (obj)).exists()) goto _L2; else goto _L1
_L1:
        f();
        f = a(((File) (obj)), 0);
        obj1 = f;
        if (obj1 == null) goto _L4; else goto _L3
_L3:
        this;
        JVM INSTR monitorexit ;
        return flag;
_L4:
        ((File) (obj)).delete();
        FileUtil.copyAssetToFile(d, "vdb.cache", ((File) (obj)), false);
        f = a(((File) (obj)), 0);
        if (f == null)
        {
            flag = false;
        }
        continue; /* Loop/switch isn't completed */
_L2:
        FileUtil.copyAssetToFile(d, "vdb.cache", ((File) (obj)), false);
        f();
        f = a(((File) (obj)), 0);
        obj = f;
        if (obj == null)
        {
            flag = false;
        }
        if (true) goto _L3; else goto _L5
_L5:
        Exception exception;
        exception;
        throw exception;
    }

    public boolean b(ScanResult scanresult)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (f != null)
        {
            long l;
            try
            {
                ApkInfo apkinfo = scanresult.fileInfo.apkInfo;
                ContentValues contentvalues = new ContentValues();
                contentvalues.put("key", apkinfo.packageName);
                contentvalues.put("v", Integer.valueOf(apkinfo.versionCode));
                contentvalues.put("r", Integer.valueOf(apkinfo.maliceRank));
                contentvalues.put("b", Integer.valueOf(apkinfo.behavior));
                contentvalues.put("h", apkinfo.getSigHash());
                contentvalues.put("d", scanresult.fileInfo.softDescription);
                contentvalues.put("t", scanresult.fileInfo.trojanName);
                contentvalues.put("c", scanresult.fileInfo.category);
                contentvalues.put("s", apkinfo.extraInfo);
                contentvalues.put("l", Long.valueOf(apkinfo.getFileSize()));
                contentvalues.put("m", Integer.valueOf(apkinfo.timestamp));
                contentvalues.put("f", apkinfo.mFileHash);
                contentvalues.put("x", apkinfo.mDexHash);
                l = f.replace("p", null, contentvalues);
            }
            // Misplaced declaration of an exception variable
            catch (ScanResult scanresult)
            {
                return false;
            }
            flag = flag1;
            if (l > 0L)
            {
                flag = true;
            }
        }
        return flag;
    }

    public void c()
    {
        e();
        f();
    }

    public boolean c(ScanResult scanresult)
    {
        Cursor cursor;
        Object obj;
        cursor = null;
        if (e == null)
        {
            return false;
        }
        obj = new a(scanresult.fileInfo.apkInfo.getSigHash());
        obj = e.queryWithFactory(((android.database.sqlite.SQLiteDatabase.CursorFactory) (obj)), false, "t", new String[] {
            "r", "d"
        }, "key=?", null, null, null, null, null);
        cursor = ((Cursor) (obj));
        if (cursor == null) goto _L2; else goto _L1
_L1:
        if (!cursor.moveToFirst()) goto _L2; else goto _L3
_L3:
        int i;
        scanresult.fileInfo.apkInfo.maliceRank = cursor.getInt(0);
        i = cursor.getInt(1);
        scanresult.fileInfo.apkInfo.timestamp = b;
        scanresult.fileInfo.apkInfo.setExtra("ruleid", a(1));
        if (scanresult.fileInfo.apkInfo.maliceRank <= 0) goto _L2; else goto _L4
_L4:
        boolean flag = a(scanresult, i);
        if (!flag) goto _L6; else goto _L5
_L5:
        if (cursor != null)
        {
            cursor.close();
        }
        return true;
_L6:
        scanresult.fileInfo.trojanName = "Android.HEUR/Variant";
        if (true) goto _L5; else goto _L7
_L7:
        scanresult;
_L11:
        if (cursor != null)
        {
            cursor.close();
        }
_L8:
        return false;
        scanresult;
_L9:
        if (cursor != null)
        {
            cursor.close();
        }
        throw scanresult;
_L2:
        if (cursor != null)
        {
            cursor.close();
        }
          goto _L8
        scanresult;
          goto _L9
        scanresult;
        cursor = null;
        if (true) goto _L11; else goto _L10
_L10:
    }

    public boolean d()
    {
        return e != null;
    }

}
