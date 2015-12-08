// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a.a.a.a.d;

import android.content.Context;
import b.a.a.a.a.b.j;
import b.a.a.a.a.b.w;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package b.a.a.a.a.d:
//            l

public class r
    implements l
{

    private final Context a;
    private final File b;
    private final String c;
    private final File d;
    private w e;
    private File f;

    public r(Context context, File file, String s, String s1)
    {
        a = context;
        b = file;
        c = s1;
        d = new File(b, s);
        e = new w(d);
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
        j.a(fileinputstream, ((OutputStream) (obj)), new byte[1024]);
        j.a(fileinputstream, "Failed to close file input stream");
        j.a(((java.io.Closeable) (obj)), "Failed to close output stream");
        file.delete();
        e = new w(d);
        return;
        Exception exception;
        exception;
        fileinputstream = null;
        s = ((String) (obj));
        obj = exception;
_L2:
        j.a(fileinputstream, "Failed to close file input stream");
        j.a(s, "Failed to close output stream");
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
            j.e(context);
        }

    }

    public final void a(byte abyte0[])
    {
        e.a(abyte0);
    }

    public final boolean a(int i, int k)
    {
        return e.a(i, k);
    }

    public final boolean b()
    {
        return e.b();
    }

    public final List c()
    {
        ArrayList arraylist = new ArrayList();
        File afile[] = f.listFiles();
        int k = afile.length;
        int i = 0;
        do
        {
            if (i >= k)
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
