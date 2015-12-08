// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.fabric.sdk.android.services.events;

import android.content.Context;
import io.fabric.sdk.android.services.common.CommonUtils;
import io.fabric.sdk.android.services.common.QueueFile;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package io.fabric.sdk.android.services.events:
//            EventsStorage

public class QueueFileEventStorage
    implements EventsStorage
{

    private final Context a;
    private final File b;
    private final String c;
    private final File d;
    private QueueFile e;
    private File f;

    public QueueFileEventStorage(Context context, File file, String s, String s1)
    {
        a = context;
        b = file;
        c = s1;
        d = new File(b, s);
        e = new QueueFile(d);
        e();
    }

    private void a(File file, File file1)
    {
        File file2;
        Object obj;
        obj = null;
        file2 = null;
        FileInputStream fileinputstream = new FileInputStream(file);
        file2 = obj;
        file1 = a(file1);
        file2 = file1;
        CommonUtils.a(fileinputstream, file1, new byte[1024]);
        CommonUtils.a(fileinputstream, "Failed to close file input stream");
        CommonUtils.a(file1, "Failed to close output stream");
        file.delete();
        return;
        file1;
        fileinputstream = null;
_L2:
        CommonUtils.a(fileinputstream, "Failed to close file input stream");
        CommonUtils.a(file2, "Failed to close output stream");
        file.delete();
        throw file1;
        file1;
        if (true) goto _L2; else goto _L1
_L1:
    }

    private void e()
    {
        f = new File(b, c);
        if (!f.exists())
        {
            f.mkdirs();
        }
    }

    public int a()
    {
        return e.a();
    }

    public OutputStream a(File file)
    {
        return new FileOutputStream(file);
    }

    public List a(int i)
    {
        ArrayList arraylist = new ArrayList();
        File afile[] = f.listFiles();
        int k = afile.length;
        int j = 0;
        do
        {
label0:
            {
                if (j < k)
                {
                    arraylist.add(afile[j]);
                    if (arraylist.size() < i)
                    {
                        break label0;
                    }
                }
                return arraylist;
            }
            j++;
        } while (true);
    }

    public void a(String s)
    {
        e.close();
        a(d, new File(f, s));
        e = new QueueFile(d);
    }

    public void a(List list)
    {
        File file;
        for (list = list.iterator(); list.hasNext(); file.delete())
        {
            file = (File)list.next();
            CommonUtils.a(a, String.format("deleting sent analytics file %s", new Object[] {
                file.getName()
            }));
        }

    }

    public void a(byte abyte0[])
    {
        e.a(abyte0);
    }

    public boolean a(int i, int j)
    {
        return e.a(i, j);
    }

    public boolean b()
    {
        return e.b();
    }

    public List c()
    {
        return Arrays.asList(f.listFiles());
    }

    public void d()
    {
        try
        {
            e.close();
        }
        catch (IOException ioexception) { }
        d.delete();
    }
}
