// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

class igz
{

    private final Context a;

    public igz(Context context)
    {
        a = context;
    }

    private File b()
    {
        return new File(a.getFilesDir(), "recent-apps-list.txt");
    }

    final List a()
    {
        Object obj1 = null;
        this;
        JVM INSTR monitorenter ;
        Object obj = b();
        if (((File) (obj)).exists()) goto _L2; else goto _L1
_L1:
        obj = Collections.emptyList();
        p.a(null);
_L6:
        this;
        JVM INSTR monitorexit ;
        return ((List) (obj));
_L2:
        obj = new BufferedReader(new FileReader(((File) (obj))));
        obj1 = new ArrayList();
_L5:
        String s = ((BufferedReader) (obj)).readLine();
        if (s == null) goto _L4; else goto _L3
_L3:
        ((List) (obj1)).add(s);
          goto _L5
        Exception exception;
        exception;
        obj1 = obj;
        obj = exception;
_L7:
        p.a(((java.io.Closeable) (obj1)));
        throw obj;
        obj;
        this;
        JVM INSTR monitorexit ;
        throw obj;
_L4:
        p.a(((java.io.Closeable) (obj)));
        obj = obj1;
          goto _L6
        obj;
          goto _L7
    }

    final void a(List list)
    {
        this;
        JVM INSTR monitorenter ;
        BufferedWriter bufferedwriter = new BufferedWriter(new FileWriter(b()));
        for (list = list.iterator(); list.hasNext(); bufferedwriter.write("\n"))
        {
            bufferedwriter.write((String)list.next());
        }

          goto _L1
        list;
_L3:
        p.a(bufferedwriter);
        throw list;
        list;
        this;
        JVM INSTR monitorexit ;
        throw list;
_L1:
        bufferedwriter.flush();
        p.a(bufferedwriter);
        this;
        JVM INSTR monitorexit ;
        return;
        list;
        bufferedwriter = null;
        if (true) goto _L3; else goto _L2
_L2:
    }
}
