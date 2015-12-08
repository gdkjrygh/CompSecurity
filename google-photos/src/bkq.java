// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.util.Log;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class bkq
    implements nfp
{

    static final String a = bkq.getSimpleName();
    final Object b = new Object();
    final File c;

    public bkq(File file)
    {
        c = file;
    }

    public final void a(String s)
    {
        Object obj1 = b;
        obj1;
        JVM INSTR monitorenter ;
        Object obj;
        int i;
        obj = new ArrayList();
        a(((nfn) (new bkr(this, ((List) (obj))))));
        i = ((List) (obj)).size();
        if (i >= 0) goto _L2; else goto _L1
_L1:
        FileOutputStream fileoutputstream = new FileOutputStream(c, true);
        obj = fileoutputstream;
        fileoutputstream.write(s.getBytes());
        obj = fileoutputstream;
        fileoutputstream.write(10);
        b.a(fileoutputstream);
_L3:
        obj1;
        JVM INSTR monitorexit ;
        return;
        IOException ioexception;
        ioexception;
        s = null;
_L5:
        obj = s;
        Log.e(a, "appending line failed", ioexception);
        b.a(s);
          goto _L3
        s;
        obj1;
        JVM INSTR monitorexit ;
        throw s;
        s;
        obj = null;
_L4:
        b.a(((java.io.Closeable) (obj)));
        throw s;
_L2:
        int j = ((List) (obj)).size();
        obj = ((List) (obj)).subList(j - ddl.a(-1, 0, j), j);
        if (((List) (obj)).size() < 0)
        {
            ((List) (obj)).add(s);
        }
        a(((List) (obj)));
          goto _L3
        s;
          goto _L4
        ioexception;
        s = fileoutputstream;
          goto _L5
    }

    void a(List list)
    {
label0:
        {
            synchronized (b)
            {
                if (list.size() != 0)
                {
                    break label0;
                }
                if (c.exists())
                {
                    c.delete();
                }
            }
            return;
        }
        Object obj1 = new FileOutputStream(c);
        Object obj = obj1;
        list = list.iterator();
_L2:
        obj = obj1;
        if (!list.hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        obj = obj1;
        ((FileOutputStream) (obj1)).write(((String)list.next()).getBytes());
        obj = obj1;
        ((FileOutputStream) (obj1)).write(10);
        if (true) goto _L2; else goto _L1
        obj;
        list = ((List) (obj1));
        obj1 = obj;
_L5:
        obj = list;
        Log.e(a, "setting lines failed", ((Throwable) (obj1)));
        b.a(list);
_L3:
        obj2;
        JVM INSTR monitorexit ;
        return;
        list;
        obj2;
        JVM INSTR monitorexit ;
        throw list;
_L1:
        b.a(((java.io.Closeable) (obj1)));
          goto _L3
_L4:
        b.a(((java.io.Closeable) (obj)));
        throw list;
        list;
          goto _L4
        obj1;
        list = null;
          goto _L5
        list;
        obj = null;
          goto _L4
    }

    public final void a(nfn nfn1)
    {
        Object obj1;
        String s;
label0:
        {
            synchronized (b)
            {
                if (c.exists())
                {
                    break label0;
                }
            }
            return;
        }
        obj1 = null;
        s = null;
        Object obj = new BufferedReader(new FileReader(c));
        obj1 = obj;
        s = ((BufferedReader) (obj)).readLine();
_L1:
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_81;
        }
        obj1 = obj;
        nfn1.a(s);
        obj1 = obj;
        s = ((BufferedReader) (obj)).readLine();
          goto _L1
        b.a(((java.io.Closeable) (obj)));
_L2:
        obj2;
        JVM INSTR monitorexit ;
        return;
        nfn1;
        obj2;
        JVM INSTR monitorexit ;
        throw nfn1;
        nfn1;
        obj = null;
_L5:
        obj1 = obj;
        Log.e(a, "Analysis performance logs unexpectedly not found.", nfn1);
        b.a(((java.io.Closeable) (obj)));
          goto _L2
        obj;
        nfn1 = s;
_L4:
        obj1 = nfn1;
        Log.e(a, "Error reading analysis performance logs.", ((Throwable) (obj)));
        b.a(nfn1);
          goto _L2
_L3:
        b.a(((java.io.Closeable) (obj1)));
        throw nfn1;
        nfn1;
          goto _L3
        IOException ioexception;
        ioexception;
        nfn1 = ((nfn) (obj));
        obj = ioexception;
          goto _L4
        nfn1;
          goto _L5
        nfn1;
          goto _L3
    }

}
