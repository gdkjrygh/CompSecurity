// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.UUID;

public final class aai
{
    public static final class a
    {

        int a;

        public a(int j)
        {
            a = j;
        }
    }


    public final File a;
    public String b;
    public List c;
    private aaz d;
    private int e;
    private int f;
    private int g;
    private a h;
    private boolean i;

    public aai(Context context, aah aah1)
    {
        String s = aah1.l;
        this(new File((new StringBuilder()).append(context.getFilesDir().getAbsolutePath()).append("//com.crittercism//").append(s).toString()), aah1.o, aah1.p, aah1.n, aah1.m, aah1.q);
    }

    private aai(File file, a a1, aaz aaz1, int j, int k, String s)
    {
        i = false;
        h = a1;
        d = aaz1;
        g = j;
        f = k;
        b = s;
        a = file;
        file.mkdirs();
        d();
        e = h().length;
        c = new LinkedList();
    }

    private boolean c(aax aax1)
    {
        BufferedOutputStream bufferedoutputstream;
        File file;
        file = new File(a, aax1.e());
        bufferedoutputstream = null;
        BufferedOutputStream bufferedoutputstream1 = new BufferedOutputStream(new FileOutputStream(file));
        bufferedoutputstream = bufferedoutputstream1;
_L2:
        aax1.a(bufferedoutputstream);
        FileNotFoundException filenotfoundexception;
        try
        {
            bufferedoutputstream.close();
        }
        // Misplaced declaration of an exception variable
        catch (aax aax1)
        {
            file.delete();
            (new StringBuilder("Unable to close ")).append(file.getAbsolutePath());
            return false;
        }
        return true;
        filenotfoundexception;
        (new StringBuilder("Could not open output stream to : ")).append(file);
        if (true) goto _L2; else goto _L1
_L1:
        aax1;
        file.delete();
        (new StringBuilder("Unable to write to ")).append(file.getAbsolutePath());
        try
        {
            bufferedoutputstream.close();
        }
        // Misplaced declaration of an exception variable
        catch (aax aax1)
        {
            file.delete();
            (new StringBuilder("Unable to close ")).append(file.getAbsolutePath());
            return false;
        }
        return false;
        aax1;
        try
        {
            bufferedoutputstream.close();
        }
        // Misplaced declaration of an exception variable
        catch (aax aax1)
        {
            file.delete();
            (new StringBuilder("Unable to close ")).append(file.getAbsolutePath());
            return false;
        }
        throw aax1;
    }

    private boolean d()
    {
        if (!a.isDirectory())
        {
            i = true;
            String s = a.getAbsolutePath();
            if (a.exists())
            {
                new IOException((new StringBuilder()).append(s).append(" is not a directory").toString());
            } else
            {
                new FileNotFoundException((new StringBuilder()).append(s).append(" does not exist").toString());
            }
        }
        return !i;
    }

    private void e()
    {
        while (b() > i() && f()) ;
    }

    private boolean f()
    {
        if (h != null)
        {
            a a1 = h;
            File afile[] = g();
            File file = null;
            if (afile.length > a1.a)
            {
                file = afile[a1.a];
            }
            if (file != null && file.delete())
            {
                return true;
            }
        }
        return false;
    }

    private File[] g()
    {
        File afile[] = h();
        Arrays.sort(afile);
        return afile;
    }

    private File[] h()
    {
        File afile1[] = a.listFiles();
        File afile[] = afile1;
        if (afile1 == null)
        {
            afile = new File[0];
        }
        return afile;
    }

    private int i()
    {
        this;
        JVM INSTR monitorenter ;
        int j = f;
        this;
        JVM INSTR monitorexit ;
        return j;
        Exception exception;
        exception;
        throw exception;
    }

    public final aai a(Context context)
    {
        String s = a.getName();
        s = (new StringBuilder()).append(s).append("_").append(UUID.randomUUID().toString()).toString();
        return new aai(new File((new StringBuilder()).append(context.getFilesDir().getAbsolutePath()).append("//com.crittercism/pending/").append(s).toString()), h, d, g, f, b);
    }

    public final void a()
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = d();
        if (flag) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        File afile[] = h();
        int j = 0;
_L4:
        if (j >= afile.length)
        {
            break; /* Loop/switch isn't completed */
        }
        afile[j].delete();
        j++;
        if (true) goto _L4; else goto _L3
_L3:
        if (true) goto _L1; else goto _L5
_L5:
        Exception exception;
        exception;
        throw exception;
    }

    public final void a(aai aai1)
    {
        int j;
        while (aai1 == null || (j = a.getName().compareTo(aai1.a.getName())) == 0) 
        {
            return;
        }
        if (j >= 0) goto _L2; else goto _L1
_L1:
        aai aai3 = aai1;
        aai aai2 = this;
_L4:
        aai2;
        JVM INSTR monitorenter ;
        aai3;
        JVM INSTR monitorenter ;
        if (d() && aai1.d())
        {
            break; /* Loop/switch isn't completed */
        }
        aai3;
        JVM INSTR monitorexit ;
        aai2;
        JVM INSTR monitorexit ;
        return;
        aai1;
        aai2;
        JVM INSTR monitorexit ;
        throw aai1;
_L2:
        aai3 = this;
        aai2 = aai1;
        if (true) goto _L4; else goto _L3
_L3:
        File afile[] = g();
        j = 0;
_L6:
        if (j >= afile.length)
        {
            break; /* Loop/switch isn't completed */
        }
        File file = new File(aai1.a, afile[j].getName());
        afile[j].renameTo(file);
        j++;
        if (true) goto _L6; else goto _L5
_L5:
        aai1.e();
        for (aai1 = c.iterator(); aai1.hasNext(); ((aaj)aai1.next()).c()) { }
        break MISSING_BLOCK_LABEL_176;
        aai1;
        aai3;
        JVM INSTR monitorexit ;
        throw aai1;
        aai3;
        JVM INSTR monitorexit ;
        aai2;
        JVM INSTR monitorexit ;
    }

    public final void a(String s)
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = d();
          goto _L1
_L3:
        this;
        JVM INSTR monitorexit ;
        return;
_L1:
        if (!flag || s == null) goto _L3; else goto _L2
_L2:
        s = new File(a.getAbsolutePath(), s);
        if (s.exists())
        {
            s.delete();
        }
        if (true) goto _L3; else goto _L4
_L4:
        s;
        throw s;
    }

    public final boolean a(aax aax1)
    {
        boolean flag1 = false;
        this;
        JVM INSTR monitorenter ;
        boolean flag = d();
        if (flag) goto _L2; else goto _L1
_L1:
        flag = flag1;
_L4:
        this;
        JVM INSTR monitorexit ;
        return flag;
_L2:
        flag = flag1;
        if (e >= g) goto _L4; else goto _L3
_L3:
        int j = b();
        if (j != i()) goto _L6; else goto _L5
_L5:
        flag = flag1;
        if (!f()) goto _L4; else goto _L6
_L6:
        if (j <= i())
        {
            break MISSING_BLOCK_LABEL_89;
        }
        i = true;
        flag = flag1;
          goto _L4
        aax1;
        throw aax1;
        flag = c(aax1);
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_111;
        }
        e = e + 1;
        aax1 = c;
        aax1;
        JVM INSTR monitorenter ;
        for (Iterator iterator = c.iterator(); iterator.hasNext(); ((aaj)iterator.next()).b()) { }
        break MISSING_BLOCK_LABEL_159;
        Exception exception;
        exception;
        aax1;
        JVM INSTR monitorexit ;
        throw exception;
        aax1;
        JVM INSTR monitorexit ;
          goto _L4
    }

    public final int b()
    {
        this;
        JVM INSTR monitorenter ;
        int j = h().length;
        this;
        JVM INSTR monitorexit ;
        return j;
        Exception exception;
        exception;
        throw exception;
    }

    public final boolean b(aax aax1)
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = d();
        if (flag) goto _L2; else goto _L1
_L1:
        flag = false;
_L4:
        this;
        JVM INSTR monitorexit ;
        return flag;
_L2:
        (new File(a, aax1.e())).delete();
        flag = c(aax1);
        if (true) goto _L4; else goto _L3
_L3:
        aax1;
        throw aax1;
    }

    public final List c()
    {
        this;
        JVM INSTR monitorenter ;
        ArrayList arraylist;
        boolean flag;
        arraylist = new ArrayList();
        flag = d();
        if (flag) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return arraylist;
_L2:
        File afile[] = g();
        int j = 0;
_L4:
        if (j >= afile.length)
        {
            break; /* Loop/switch isn't completed */
        }
        arraylist.add(d.a(afile[j]));
        j++;
        if (true) goto _L4; else goto _L3
_L3:
        if (true) goto _L1; else goto _L5
_L5:
        Exception exception;
        exception;
        throw exception;
    }
}
