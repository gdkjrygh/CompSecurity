// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.l;

import android.content.Context;
import android.graphics.BitmapFactory;
import android.os.Environment;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.UUID;
import kik.android.util.bs;
import kik.android.util.bx;
import kik.android.widget.cr;
import org.c.b;
import org.c.c;

// Referenced classes of package com.kik.l:
//            p

public final class ac
{

    private static final b a = org.c.c.a("ImageStorage");
    private static File g;
    private static File h;
    private static File i;
    private final Context b;
    private final byte c[] = new byte[16384];
    private File d;
    private File e;
    private File f;
    private bs j;
    private bs k;
    private p l;

    public ac(Context context, File file, File file1, File file2, File file3, File file4, bs bs1, 
            bs bs2, p p1)
    {
        b = context;
        d = file;
        e = file1;
        f = file2;
        j = bs1;
        k = bs2;
        h = file3;
        i = file4;
        l = p1;
    }

    private static void a()
    {
        File file = Environment.getExternalStorageDirectory();
        if (file == null || !file.exists())
        {
            g = null;
        } else
        {
            file = new File(file, "Kik");
            g = file;
            if (!file.exists())
            {
                g.mkdirs();
                return;
            }
        }
    }

    private void b()
    {
        if (!d.exists())
        {
            d.mkdirs();
        }
        if (!e.exists())
        {
            e.mkdirs();
        }
        if (!h.exists())
        {
            h.mkdirs();
        }
        if (!f.exists())
        {
            f.mkdirs();
        }
        if (!i.exists())
        {
            i.mkdirs();
        }
    }

    static boolean b(File file)
    {
        a();
        if (g == null)
        {
            return false;
        } else
        {
            file = file.getPath();
            return (new File(g, file.substring(file.lastIndexOf("/")))).exists();
        }
    }

    public final File a(String s, Object obj, boolean flag, boolean flag1, boolean flag2)
    {
        Object obj5;
        obj5 = null;
        b();
        if (obj != null) goto _L2; else goto _L1
_L1:
        Object obj1 = null;
_L6:
        return ((File) (obj1));
_L2:
        if (!flag) goto _L4; else goto _L3
_L3:
        File file;
        File file1;
        file1 = new File(e, (new StringBuilder()).append(s).append(".jpg").toString());
        if (file1.exists())
        {
            return file1;
        }
        if (flag2)
        {
            break MISSING_BLOCK_LABEL_535;
        }
        file = new File(h, (new StringBuilder()).append(s).append(".jpg").toString());
        obj1 = file;
        if (file.exists()) goto _L6; else goto _L5
_L5:
        byte abyte0[] = (byte[])obj;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_132;
        }
        l.a(abyte0, s);
        if (file1 == null) goto _L8; else goto _L7
_L7:
        obj = new FileOutputStream(file1);
        Object obj3;
        Object obj4;
        obj4 = obj;
        obj1 = obj;
        obj3 = obj;
        ((FileOutputStream) (obj)).write(abyte0);
_L18:
        if (file == null) goto _L10; else goto _L9
_L9:
        obj4 = obj;
        obj1 = obj;
        obj3 = obj;
        Object obj2 = new FileOutputStream(file);
        obj1 = obj2;
        obj3 = obj;
        obj4 = obj2;
        obj5 = obj2;
        ((FileOutputStream) (obj2)).write(abyte0);
_L17:
        if (!flag1 || !flag)
        {
            break MISSING_BLOCK_LABEL_240;
        }
        obj1 = obj2;
        obj3 = obj;
        obj4 = obj2;
        obj5 = obj2;
        a(s, abyte0);
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_248;
        }
        ((FileOutputStream) (obj)).close();
        if (obj2 != null)
        {
            try
            {
                ((FileOutputStream) (obj2)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                ((IOException) (obj)).printStackTrace();
            }
        }
_L12:
        if (flag)
        {
            j.put(s, file1);
            k.put(s, file);
        }
        obj1 = file;
        if (file == null)
        {
            return file1;
        }
          goto _L6
_L4:
        file = new File(i, s);
        obj1 = file;
        if (file.exists()) goto _L6; else goto _L11
_L11:
        file1 = null;
          goto _L5
        obj4;
        obj = null;
        obj2 = null;
_L16:
        obj1 = obj2;
        obj3 = obj;
        ((FileNotFoundException) (obj4)).printStackTrace();
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_362;
        }
        ((FileOutputStream) (obj)).close();
        if (obj2 != null)
        {
            try
            {
                ((FileOutputStream) (obj2)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                ((IOException) (obj)).printStackTrace();
            }
        }
          goto _L12
        obj5;
        obj = null;
        obj2 = null;
_L15:
        obj1 = obj2;
        obj3 = obj;
        ((IOException) (obj5)).printStackTrace();
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_410;
        }
        ((FileOutputStream) (obj)).close();
        if (obj2 != null)
        {
            try
            {
                ((FileOutputStream) (obj2)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                ((IOException) (obj)).printStackTrace();
            }
        }
          goto _L12
        s;
        obj3 = null;
        obj = obj5;
_L14:
        if (obj3 == null)
        {
            break MISSING_BLOCK_LABEL_448;
        }
        ((FileOutputStream) (obj3)).close();
        if (obj != null)
        {
            try
            {
                ((FileOutputStream) (obj)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                ((IOException) (obj)).printStackTrace();
            }
        }
        throw s;
        s;
        obj = obj5;
        obj3 = obj4;
        continue; /* Loop/switch isn't completed */
        s;
        obj = obj1;
        if (true) goto _L14; else goto _L13
_L13:
        obj5;
        obj2 = null;
        obj = obj1;
          goto _L15
        obj5;
        obj2 = obj4;
          goto _L15
        obj4;
        obj2 = null;
        obj = obj3;
          goto _L16
        obj4;
        obj2 = obj5;
          goto _L16
_L10:
        obj2 = null;
          goto _L17
_L8:
        obj = null;
          goto _L18
        file = null;
          goto _L5
    }

    public final Object a(String s, boolean flag)
    {
        s = b(s, flag);
        if (s == null)
        {
            return null;
        }
        try
        {
            s = BitmapFactory.decodeFile(s.getAbsolutePath());
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            bx.a(s);
            return null;
        }
        return s;
    }

    final void a(File file)
    {
        Object obj;
        Object obj1;
        Object obj2;
        File file1;
        byte abyte0[];
        a();
        if (g == null)
        {
            return;
        }
        obj = file.getPath();
        file1 = new File(g, ((String) (obj)).substring(((String) (obj)).lastIndexOf("/")));
        obj2 = null;
        obj1 = null;
        abyte0 = new byte[0x10000];
        obj = obj2;
        FileInputStream fileinputstream = new FileInputStream(file);
        obj = obj2;
        file = new FileOutputStream(file1);
_L2:
        obj = file;
        int i1 = fileinputstream.read(abyte0);
        if (i1 <= 0)
        {
            break; /* Loop/switch isn't completed */
        }
        obj = file;
        file.write(abyte0, 0, i1);
        if (true) goto _L2; else goto _L1
        obj1;
_L8:
        obj = file;
        ((FileNotFoundException) (obj1)).printStackTrace();
        if (file != null)
        {
            try
            {
                file.close();
            }
            // Misplaced declaration of an exception variable
            catch (File file)
            {
                file.printStackTrace();
            }
        }
_L3:
        cr.a(b, file1);
        return;
_L1:
        try
        {
            file.close();
        }
        // Misplaced declaration of an exception variable
        catch (File file)
        {
            file.printStackTrace();
        }
        break MISSING_BLOCK_LABEL_119;
        obj;
        file = ((File) (obj1));
        obj1 = obj;
_L6:
        obj = file;
        ((IOException) (obj1)).printStackTrace();
        if (file != null)
        {
            try
            {
                file.close();
            }
            // Misplaced declaration of an exception variable
            catch (File file)
            {
                file.printStackTrace();
            }
        }
          goto _L3
        file;
_L5:
        if (obj != null)
        {
            try
            {
                ((FileOutputStream) (obj)).close();
            }
            catch (IOException ioexception)
            {
                ioexception.printStackTrace();
            }
        }
        throw file;
        file;
        if (true) goto _L5; else goto _L4
_L4:
        obj1;
          goto _L6
        obj1;
        file = null;
        if (true) goto _L8; else goto _L7
_L7:
    }

    final void a(String s)
    {
        Object obj1;
        Object obj2;
        File file1;
        File file2;
        obj2 = null;
        obj1 = null;
        b();
        File file = (File)k.get(s);
        file2 = new File(e, (new StringBuilder()).append(s).append(".jpg").toString());
        file1 = file;
        if (file == null)
        {
            file1 = new File(h, (new StringBuilder()).append(s).append(".jpg").toString());
        }
        if (!file1.exists()) goto _L2; else goto _L1
_L1:
        if (file2.exists()) goto _L4; else goto _L3
_L3:
        Object obj;
        l.a(file1);
        byte abyte0[];
        try
        {
            file2.createNewFile();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            (new StringBuilder("cannot make file:")).append(((IOException) (obj)).getMessage());
        }
        if (file1.renameTo(file2)) goto _L2; else goto _L5
_L5:
        obj = new FileInputStream(file1);
        abyte0 = new byte[((FileInputStream) (obj)).available()];
        ((FileInputStream) (obj)).read(abyte0);
        obj1 = new FileOutputStream(file2);
        ((FileOutputStream) (obj1)).write(abyte0);
        try
        {
            ((FileInputStream) (obj)).close();
            ((FileOutputStream) (obj1)).close();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            ((IOException) (obj)).printStackTrace();
        }
_L6:
        file1.delete();
_L2:
        k.remove(s);
        return;
        obj2;
        obj = null;
_L8:
        (new StringBuilder("image transfer to cache failed:")).append(((IOException) (obj2)).getMessage());
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_256;
        }
        ((FileInputStream) (obj1)).close();
        if (obj != null)
        {
            try
            {
                ((FileOutputStream) (obj)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                ((IOException) (obj)).printStackTrace();
            }
        }
          goto _L6
        s;
        obj = null;
        obj1 = obj2;
_L7:
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_289;
        }
        ((FileInputStream) (obj)).close();
        if (obj1 != null)
        {
            try
            {
                ((FileOutputStream) (obj1)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                ((IOException) (obj)).printStackTrace();
            }
        }
        throw s;
_L4:
        file1.delete();
          goto _L2
        s;
        obj1 = obj2;
          goto _L7
        s;
          goto _L7
        s;
        obj2 = obj1;
        obj1 = obj;
        obj = obj2;
          goto _L7
        obj2;
        Object obj3 = null;
        obj1 = obj;
        obj = obj3;
          goto _L8
        obj2;
        Object obj4 = obj;
        obj = obj1;
        obj1 = obj4;
          goto _L8
    }

    public final void a(String s, File file)
    {
        Object obj;
        Object obj1;
        File file1;
        byte abyte0[];
        a();
        if (g == null)
        {
            return;
        }
        file1 = new File(g, (new StringBuilder()).append(s).append(".jpg").toString());
        obj1 = null;
        obj = null;
        abyte0 = new byte[0x10000];
        s = obj1;
        FileInputStream fileinputstream = new FileInputStream(file);
        s = obj1;
        file = new FileOutputStream(file1);
_L2:
        s = file;
        int i1 = fileinputstream.read(abyte0);
        if (i1 <= 0)
        {
            break; /* Loop/switch isn't completed */
        }
        s = file;
        file.write(abyte0, 0, i1);
        if (true) goto _L2; else goto _L1
        obj;
_L8:
        s = file;
        ((FileNotFoundException) (obj)).printStackTrace();
        if (file != null)
        {
            try
            {
                file.close();
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                s.printStackTrace();
            }
        }
_L3:
        cr.a(b, file1);
        return;
_L1:
        try
        {
            file.close();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            s.printStackTrace();
        }
        break MISSING_BLOCK_LABEL_123;
        s;
        file = ((File) (obj));
        obj = s;
_L6:
        s = file;
        ((IOException) (obj)).printStackTrace();
        if (file != null)
        {
            try
            {
                file.close();
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                s.printStackTrace();
            }
        }
          goto _L3
        obj;
        file = s;
        s = ((String) (obj));
_L5:
        if (file != null)
        {
            try
            {
                file.close();
            }
            // Misplaced declaration of an exception variable
            catch (File file)
            {
                file.printStackTrace();
            }
        }
        throw s;
        obj;
        file = s;
        s = ((String) (obj));
        if (true) goto _L5; else goto _L4
_L4:
        obj;
          goto _L6
        obj;
        file = null;
        if (true) goto _L8; else goto _L7
_L7:
    }

    final void a(String s, byte abyte0[])
    {
        String s1;
        Object obj;
        File file;
        a();
        if (g == null)
        {
            return;
        }
        file = new File(g, (new StringBuilder()).append(s).append(".jpg").toString());
        s1 = null;
        obj = null;
        s = new FileOutputStream(file);
        s1 = s;
        s.write(abyte0);
        try
        {
            s.close();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            s.printStackTrace();
        }
_L1:
        cr.a(b, file);
        return;
        abyte0;
        s = null;
_L5:
        s1 = s;
        abyte0.printStackTrace();
        if (s != null)
        {
            try
            {
                s.close();
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                s.printStackTrace();
            }
        }
          goto _L1
        abyte0;
        s = obj;
_L4:
        s1 = s;
        abyte0.printStackTrace();
        if (s != null)
        {
            try
            {
                s.close();
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                s.printStackTrace();
            }
        }
          goto _L1
        s;
_L3:
        if (s1 != null)
        {
            try
            {
                s1.close();
            }
            // Misplaced declaration of an exception variable
            catch (byte abyte0[])
            {
                abyte0.printStackTrace();
            }
        }
        throw s;
        s;
        if (true) goto _L3; else goto _L2
_L2:
        abyte0;
          goto _L4
        abyte0;
          goto _L5
    }

    public final boolean a(String s, Object obj, String s1)
    {
        File file;
        boolean flag;
        b();
        flag = false;
        file = new File(d, s);
        if (file.exists())
        {
            file.delete();
        }
        FileOutputStream fileoutputstream = new FileOutputStream(file);
        s = fileoutputstream;
        fileoutputstream.write((byte[])obj);
        s = fileoutputstream;
        file.setLastModified(Long.parseLong(s1));
        flag = true;
        try
        {
            fileoutputstream.close();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            s.printStackTrace();
            return true;
        }
_L2:
        return flag;
        obj;
        fileoutputstream = null;
_L7:
        s = fileoutputstream;
        ((FileNotFoundException) (obj)).printStackTrace();
        if (fileoutputstream == null) goto _L2; else goto _L1
_L1:
        try
        {
            fileoutputstream.close();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            s.printStackTrace();
            return false;
        }
        return false;
        obj;
        fileoutputstream = null;
_L6:
        s = fileoutputstream;
        ((IOException) (obj)).printStackTrace();
        if (fileoutputstream == null) goto _L2; else goto _L3
_L3:
        try
        {
            fileoutputstream.close();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            s.printStackTrace();
            return false;
        }
        return false;
        obj;
        s = null;
_L5:
        if (s != null)
        {
            try
            {
                s.close();
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                s.printStackTrace();
            }
        }
        throw obj;
        obj;
        if (true) goto _L5; else goto _L4
_L4:
        obj;
          goto _L6
        obj;
          goto _L7
    }

    public final File b(String s, boolean flag)
    {
        if (s != null) goto _L2; else goto _L1
_L1:
        s = null;
_L4:
        return s;
_L2:
        if (!flag)
        {
            break; /* Loop/switch isn't completed */
        }
        File file2 = (File)j.get(s);
        File file = file2;
        if (file2 == null)
        {
            file = (File)k.get(s);
        }
        file2 = file;
        if (file == null)
        {
            file2 = new File(e, (new StringBuilder()).append(s).append(".jpg").toString());
        }
        file = file2;
        if (!file2.exists())
        {
            file = new File(h, (new StringBuilder()).append(s).append(".jpg").toString());
        }
        file2 = file;
        if (!file.exists())
        {
            file2 = new File(f, (new StringBuilder()).append(s).append(".mp4").toString());
        }
        s = file2;
        if (!file2.exists())
        {
            return null;
        }
        if (true) goto _L4; else goto _L3
_L3:
        File file1 = new File(i, s);
        s = file1;
        if (!file1.exists())
        {
            return null;
        }
        if (true) goto _L4; else goto _L5
_L5:
    }

    public final boolean b(String s)
    {
        File file1 = (File)j.get(s);
        File file = file1;
        if (file1 == null)
        {
            file = (File)k.get(s);
        }
        file1 = file;
        if (file == null)
        {
            file1 = new File(e, (new StringBuilder()).append(s).append(".jpg").toString());
        }
        file = file1;
        if (!file1.exists())
        {
            file = new File(h, (new StringBuilder()).append(s).append(".jpg").toString());
        }
        return file.exists();
    }

    final boolean c(File file)
    {
        boolean flag;
        flag = true;
        if (!file.exists())
        {
            return false;
        }
        FileInputStream fileinputstream = new FileInputStream(file);
        Object obj = fileinputstream;
        file = new byte[(int)file.length()];
        obj = fileinputstream;
        fileinputstream.read(file);
        obj = fileinputstream;
        a(UUID.randomUUID().toString(), file);
        try
        {
            fileinputstream.close();
        }
        // Misplaced declaration of an exception variable
        catch (File file)
        {
            file.printStackTrace();
        }
_L1:
        return flag;
        IOException ioexception1;
        ioexception1;
        file = null;
_L4:
        obj = file;
        ioexception1.printStackTrace();
        if (file == null)
        {
            break MISSING_BLOCK_LABEL_86;
        }
        file.close();
        flag = false;
          goto _L1
        file;
        file.printStackTrace();
        flag = false;
          goto _L1
        file;
        obj = null;
_L3:
        if (obj != null)
        {
            try
            {
                ((FileInputStream) (obj)).close();
            }
            catch (IOException ioexception)
            {
                ioexception.printStackTrace();
            }
        }
        throw file;
        file;
        if (true) goto _L3; else goto _L2
_L2:
        ioexception1;
        file = fileinputstream;
          goto _L4
    }

    public final boolean c(String s)
    {
        boolean flag1 = false;
        s = b(s, false);
        boolean flag = flag1;
        if (s != null)
        {
            flag = flag1;
            if (s.exists())
            {
                flag = true;
            }
        }
        return flag;
    }

    public final int[] d(String s)
    {
        int ai[] = new int[2];
        int[] _tmp = ai;
        ai[0] = -1;
        ai[1] = -1;
        android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        s = b(s, false);
        if (s != null)
        {
            BitmapFactory.decodeFile(s.getAbsolutePath(), options);
            ai[0] = options.outWidth;
            ai[1] = options.outHeight;
        }
        return ai;
    }

    public final byte[] e(String s)
    {
        if (s != null) goto _L2; else goto _L1
_L1:
        return null;
_L2:
        if ((s = b(s, false)) == null) goto _L1; else goto _L3
_L3:
        byte abyte0[] = new byte[(int)s.length()];
        FileInputStream fileinputstream = new FileInputStream(s);
        s = fileinputstream;
        fileinputstream.read(abyte0);
        try
        {
            fileinputstream.close();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            s.printStackTrace();
        }
_L4:
        return abyte0;
        IOException ioexception;
        ioexception;
        fileinputstream = null;
_L7:
        s = fileinputstream;
        ioexception.printStackTrace();
        if (fileinputstream != null)
        {
            try
            {
                fileinputstream.close();
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                s.printStackTrace();
            }
        }
          goto _L4
        Exception exception;
        exception;
        s = null;
_L6:
        if (s != null)
        {
            try
            {
                s.close();
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                s.printStackTrace();
            }
        }
        throw exception;
        exception;
        if (true) goto _L6; else goto _L5
_L5:
        ioexception;
          goto _L7
    }

}
