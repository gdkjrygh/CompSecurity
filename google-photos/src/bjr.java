// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class bjr
{

    private static final String a = bjr.getSimpleName();
    private final def b;
    private final Class c;
    private final bjt d;

    public bjr(def def1, Class class1)
    {
        b = (def)b.a(def1, "serializer", null);
        c = (Class)b.a(class1, "protoClass", null);
        d = bjs.a;
    }

    private qlw a()
    {
        qlw qlw1;
        try
        {
            qlw1 = (qlw)c.newInstance();
        }
        catch (InstantiationException instantiationexception)
        {
            throw c.a("unexpected", instantiationexception);
        }
        catch (IllegalAccessException illegalaccessexception)
        {
            throw c.a("unexpected", illegalaccessexception);
        }
        return qlw1;
    }

    public final qlw a(File file)
    {
        Object obj;
        if (!file.exists())
        {
            return null;
        }
        byte abyte0[];
        qlo qlo1;
        qlw qlw1;
        try
        {
            obj = new FileInputStream(file);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            String s = a;
            file = String.valueOf(file);
            Log.e(s, (new StringBuilder(String.valueOf(file).length() + 20)).append("Unable to find file ").append(file).toString(), ((Throwable) (obj)));
            return null;
        }
        abyte0 = dek.a(((java.io.InputStream) (obj)));
        qlo1 = qlo.a(abyte0, 0, abyte0.length);
        qlw1 = a();
        b.a(qlw1, qlo1);
        b.a(((java.io.Closeable) (obj)));
        return qlw1;
        file;
        throw file;
        file;
        b.a(((java.io.Closeable) (obj)));
        throw file;
        IOException ioexception;
        ioexception;
        String s1 = a;
        file = String.valueOf(file);
        Log.e(s1, (new StringBuilder(String.valueOf(file).length() + 19)).append("Error parsing file ").append(file).toString(), ioexception);
        b.a(((java.io.Closeable) (obj)));
        return null;
    }

    public final boolean a(qlw qlw1, File file)
    {
        File file1;
        file.getParentFile().mkdirs();
        file1 = new File(String.format("%s.tmp", new Object[] {
            file.getAbsoluteFile()
        }));
        file1.delete();
        Object obj = new FileOutputStream(file1);
        byte abyte0[] = new byte[b.a(qlw1)];
        qlp qlp1 = qlp.a(abyte0, 0, abyte0.length);
        b.a(qlw1, qlp1);
        ((FileOutputStream) (obj)).write(abyte0);
        b.a(((java.io.Closeable) (obj)));
        if (file1.renameTo(file))
        {
            break MISSING_BLOCK_LABEL_298;
        }
        qlw1 = a;
        file = String.valueOf(file);
        Log.e(qlw1, (new StringBuilder(String.valueOf(file).length() + 31)).append("Error moving temporary file to ").append(file).toString());
        file1.delete();
        return false;
        qlw1;
        file = a;
        obj = String.valueOf(file1);
        Log.e(file, (new StringBuilder(String.valueOf(obj).length() + 19)).append("Cannot create file ").append(((String) (obj))).toString(), qlw1);
        file1.delete();
        return false;
        qlw1;
        b.a(((java.io.Closeable) (obj)));
        file1.delete();
        return false;
        qlw1;
        file = a;
        String s = String.valueOf(file1);
        Log.e(file, (new StringBuilder(String.valueOf(s).length() + 22)).append("Error writing to file ").append(s).toString(), qlw1);
        b.a(((java.io.Closeable) (obj)));
        file1.delete();
        return false;
        qlw1;
        b.a(((java.io.Closeable) (obj)));
        throw qlw1;
        qlw1;
        file1.delete();
        throw qlw1;
        file1.delete();
        return true;
    }

}
