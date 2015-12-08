// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package a.a.a.a.a.d;

import a.a.a.a.a.b.ab;
import a.a.a.a.a.b.l;
import android.content.Context;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package a.a.a.a.a.d:
//            h

public class n
    implements h
{

    private final Context a;
    private final File b;
    private final String c;
    private final File d;
    private ab e;
    private File f;

    public n(Context context, File file, String s, String s1)
    {
        a = context;
        b = file;
        c = s1;
        d = new File(b, s);
        e = new ab(d);
        f = new File(b, c);
        if (!f.exists())
        {
            f.mkdirs();
        }
    }

    public final int a()
    {
        return e.a();
    }

    public OutputStream a(File file)
    {
        return new FileOutputStream(file);
    }

    public final void a(String s)
    {
        Object obj;
        Object obj1;
        File file;
        File file1;
        obj1 = null;
        obj = null;
        e.close();
        file = d;
        file1 = new File(f, s);
        FileInputStream fileinputstream = new FileInputStream(file);
        s = obj1;
        obj = a(file1);
        s = ((String) (obj));
        l.a(fileinputstream, ((OutputStream) (obj)), new byte[1024]);
        l.a(fileinputstream, "Failed to close file input stream");
        l.a(((java.io.Closeable) (obj)), "Failed to close output stream");
        file.delete();
        e = new ab(d);
        return;
        Exception exception;
        exception;
        fileinputstream = null;
        s = ((String) (obj));
        obj = exception;
_L2:
        l.a(fileinputstream, "Failed to close file input stream");
        l.a(s, "Failed to close output stream");
        file.delete();
        throw obj;
        obj;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public final void a(List list)
    {
        File file;
        for (list = list.iterator(); list.hasNext(); file.delete())
        {
            file = (File)list.next();
            Context context = a;
            String.format("deleting sent analytics file %s", new Object[] {
                file.getName()
            });
            l.e(context);
        }

    }

    public final void a(byte abyte0[])
    {
        e.a(abyte0, abyte0.length);
    }

    public final boolean a(int i, int j)
    {
        return e.a(i, j);
    }

    public final boolean b()
    {
        return e.b();
    }

    public final List c()
    {
        ArrayList arraylist = new ArrayList();
        File afile[] = f.listFiles();
        int j = afile.length;
        int i = 0;
        do
        {
            if (i >= j)
            {
                break;
            }
            arraylist.add(afile[i]);
            if (arraylist.size() > 0)
            {
                break;
            }
            i++;
        } while (true);
        return arraylist;
    }

    public final List d()
    {
        return Arrays.asList(f.listFiles());
    }

    public final void e()
    {
        try
        {
            e.close();
        }
        catch (IOException ioexception) { }
        d.delete();
    }
}
