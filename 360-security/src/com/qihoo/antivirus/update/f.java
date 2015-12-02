// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.antivirus.update;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

// Referenced classes of package com.qihoo.antivirus.update:
//            af

public class f
{

    final String a;
    final int b;
    final int c;
    final int d;

    f(File file)
    {
        a = file.getName();
        int ai[] = new int[3];
        if (a(file, ai))
        {
            b = ai[0];
            c = ai[1];
            d = ai[2];
            return;
        } else
        {
            b = 0;
            c = -1;
            d = -1;
            return;
        }
    }

    public static int a(File file, boolean flag)
    {
        int j = -1;
        file = new DataInputStream(new FileInputStream(file));
        file.read();
        file.read();
        file.read();
        file.read();
        file.readInt();
        if (!flag) goto _L2; else goto _L1
_L1:
        int i = file.readInt();
_L3:
        Object obj;
        j = i;
        if (file != null)
        {
            try
            {
                file.close();
            }
            // Misplaced declaration of an exception variable
            catch (File file)
            {
                return i;
            }
            j = i;
        }
_L5:
        return j;
_L2:
        file.readInt();
        i = file.readInt();
          goto _L3
        file;
        file = null;
_L8:
        if (file == null) goto _L5; else goto _L4
_L4:
        try
        {
            file.close();
        }
        // Misplaced declaration of an exception variable
        catch (File file)
        {
            return -1;
        }
        return -1;
        obj;
        file = null;
_L7:
        if (file != null)
        {
            try
            {
                file.close();
            }
            // Misplaced declaration of an exception variable
            catch (File file) { }
        }
        throw obj;
        obj;
        if (true) goto _L7; else goto _L6
_L6:
        obj;
          goto _L8
    }

    public static String a(File file)
    {
        Object obj1 = (new StringBuilder(String.valueOf(file.getAbsolutePath()))).append(".tmp").toString();
        Object obj = new FileOutputStream(((String) (obj1)));
        DataInputStream datainputstream = new DataInputStream(new FileInputStream(file));
        datainputstream.read();
        datainputstream.read();
        datainputstream.read();
        datainputstream.read();
        datainputstream.readInt();
        datainputstream.readInt();
        datainputstream.readInt();
        af.a(datainputstream, ((OutputStream) (obj)));
        boolean flag = true;
        if (datainputstream != null)
        {
            try
            {
                datainputstream.close();
            }
            // Misplaced declaration of an exception variable
            catch (File file) { }
        }
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_110;
        }
        ((OutputStream) (obj)).close();
        flag = true;
_L2:
        if (flag)
        {
            return ((String) (obj1));
        } else
        {
            return null;
        }
        file;
        obj = null;
        file = null;
_L4:
        flag = false;
        if (file != null)
        {
            try
            {
                file.close();
            }
            // Misplaced declaration of an exception variable
            catch (File file) { }
        }
        if (obj == null) goto _L2; else goto _L1
_L1:
        ((OutputStream) (obj)).close();
        flag = false;
          goto _L2
        file;
        flag = false;
          goto _L2
        file;
        obj1 = null;
        obj = null;
_L3:
        if (obj != null)
        {
            try
            {
                ((DataInputStream) (obj)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj) { }
        }
        if (obj1 != null)
        {
            try
            {
                ((OutputStream) (obj1)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj) { }
        }
        throw file;
        file;
        flag = true;
          goto _L2
        file;
        datainputstream = null;
        obj1 = obj;
        obj = datainputstream;
          goto _L3
        file;
        obj1 = obj;
        obj = datainputstream;
          goto _L3
        file;
        file = null;
          goto _L4
        file;
        file = datainputstream;
          goto _L4
    }

    boolean a(DataInputStream datainputstream, File file, int ai[])
        throws IOException
    {
        Object obj = null;
        if (datainputstream.read() != 81 || datainputstream.read() != 76) goto _L2; else goto _L1
_L1:
        datainputstream.close();
        file = SQLiteDatabase.openDatabase(file.getAbsolutePath(), null, 0);
        datainputstream = file.query("v_patch", new String[] {
            "flags", "patch_version", "final_version"
        }, null, null, null, null, null);
        if (datainputstream == null) goto _L4; else goto _L3
_L3:
        if (!datainputstream.moveToFirst()) goto _L4; else goto _L5
_L5:
        ai[0] = datainputstream.getInt(0);
        ai[1] = datainputstream.getInt(1);
        ai[2] = datainputstream.getInt(2);
        if (datainputstream != null)
        {
            datainputstream.close();
        }
        return true;
        datainputstream;
        datainputstream = null;
_L9:
        if (datainputstream != null)
        {
            datainputstream.close();
        }
_L6:
        file.close();
_L2:
        return false;
        datainputstream;
        file = obj;
_L7:
        if (file != null)
        {
            file.close();
        }
        throw datainputstream;
_L4:
        if (datainputstream != null)
        {
            datainputstream.close();
        }
          goto _L6
        ai;
        file = datainputstream;
        datainputstream = ai;
          goto _L7
        ai;
        if (true) goto _L9; else goto _L8
_L8:
    }

    boolean a(DataInputStream datainputstream, int ai[])
        throws IOException
    {
        if (datainputstream.read() == 68 && datainputstream.read() == 65 && datainputstream.read() == 84)
        {
            ai[0] = datainputstream.readInt();
            ai[1] = datainputstream.readInt();
            ai[2] = datainputstream.readInt();
            return true;
        } else
        {
            return false;
        }
    }

    boolean a(File file, int ai[])
    {
        Object obj = null;
        DataInputStream datainputstream = new DataInputStream(new FileInputStream(file));
        int i = datainputstream.read();
        i;
        JVM INSTR tableswitch 83 86: default 56
    //                   83 97
    //                   84 56
    //                   85 56
    //                   86 70;
           goto _L1 _L2 _L1 _L1 _L3
_L1:
        boolean flag;
        boolean flag1;
        if (datainputstream != null)
        {
            try
            {
                datainputstream.close();
            }
            // Misplaced declaration of an exception variable
            catch (File file) { }
        }
_L8:
        flag = false;
_L5:
        return flag;
_L3:
        flag1 = a(datainputstream, ai);
        flag = flag1;
        if (datainputstream == null) goto _L5; else goto _L4
_L4:
        try
        {
            datainputstream.close();
        }
        // Misplaced declaration of an exception variable
        catch (File file)
        {
            return flag1;
        }
        return flag1;
_L2:
        flag1 = a(datainputstream, file, ai);
        flag = flag1;
        if (datainputstream == null) goto _L5; else goto _L6
_L6:
        try
        {
            datainputstream.close();
        }
        // Misplaced declaration of an exception variable
        catch (File file)
        {
            return flag1;
        }
        return flag1;
        file;
        file = obj;
_L11:
        if (file != null)
        {
            try
            {
                file.close();
            }
            // Misplaced declaration of an exception variable
            catch (File file) { }
        }
        if (true) goto _L8; else goto _L7
_L7:
        file;
        datainputstream = null;
_L10:
        if (datainputstream != null)
        {
            try
            {
                datainputstream.close();
            }
            // Misplaced declaration of an exception variable
            catch (int ai[]) { }
        }
        throw file;
        file;
        if (true) goto _L10; else goto _L9
_L9:
        file;
        file = datainputstream;
          goto _L11
    }
}
