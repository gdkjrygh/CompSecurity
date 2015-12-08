// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package crittercism.android;

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

// Referenced classes of package crittercism.android:
//            bq, eb, cg, dx, 
//            bs, ci

public class br
{
    public static final class a
    {

        int a;

        public a(int k)
        {
            a = k;
        }
    }


    private static final String a = crittercism/android/br.getName();
    private final File b;
    private ci c;
    private int d;
    private int e;
    private int f;
    private a g;
    private boolean h;
    private String i;
    private List j;

    public br(Context context, bq bq1)
    {
        String s = bq1.a();
        this(new File((new StringBuilder()).append(context.getFilesDir().getAbsolutePath()).append("//com.crittercism//").append(s).toString()), bq1.c(), bq1.d(), bq1.e(), bq1.b(), bq1.f());
    }

    private br(File file, a a1, ci ci1, int k, int l, String s)
    {
        h = false;
        g = a1;
        c = ci1;
        f = k;
        e = l;
        i = s;
        b = file;
        file.mkdirs();
        e();
        d = i().length;
        j = new LinkedList();
    }

    public static void a(br br1)
    {
        eb.a(br1.b);
    }

    private boolean c(cg cg1)
    {
        BufferedOutputStream bufferedoutputstream;
        File file;
        file = new File(b, cg1.e());
        bufferedoutputstream = null;
        BufferedOutputStream bufferedoutputstream1 = new BufferedOutputStream(new FileOutputStream(file));
        bufferedoutputstream = bufferedoutputstream1;
_L2:
        cg1.a(bufferedoutputstream);
        FileNotFoundException filenotfoundexception;
        String s;
        try
        {
            bufferedoutputstream.close();
        }
        // Misplaced declaration of an exception variable
        catch (cg cg1)
        {
            file.delete();
            dx.a("Crittercism", (new StringBuilder("Unable to close ")).append(file.getAbsolutePath()).toString(), cg1);
            return false;
        }
        return true;
        filenotfoundexception;
        s = a;
        (new StringBuilder("Could not open output stream to : ")).append(file);
        dx.a();
        if (true) goto _L2; else goto _L1
_L1:
        cg1;
        file.delete();
        dx.a("Crittercism", (new StringBuilder("Unable to write to ")).append(file.getAbsolutePath()).toString(), cg1);
        try
        {
            bufferedoutputstream.close();
        }
        // Misplaced declaration of an exception variable
        catch (cg cg1)
        {
            file.delete();
            dx.a("Crittercism", (new StringBuilder("Unable to close ")).append(file.getAbsolutePath()).toString(), cg1);
            return false;
        }
        return false;
        cg1;
        try
        {
            bufferedoutputstream.close();
        }
        // Misplaced declaration of an exception variable
        catch (cg cg1)
        {
            file.delete();
            dx.a("Crittercism", (new StringBuilder("Unable to close ")).append(file.getAbsolutePath()).toString(), cg1);
            return false;
        }
        throw cg1;
    }

    private boolean e()
    {
        if (!b.isDirectory())
        {
            h = true;
            String s = b.getAbsolutePath();
            if (b.exists())
            {
                new IOException((new StringBuilder()).append(s).append(" is not a directory").toString());
            } else
            {
                new FileNotFoundException((new StringBuilder()).append(s).append(" does not exist").toString());
            }
        }
        return !h;
    }

    private void f()
    {
        while (b() > j() && g()) ;
    }

    private boolean g()
    {
        a a1 = g;
        if (g != null)
        {
            a a2 = g;
            File afile[] = h();
            File file = null;
            if (afile.length > a2.a)
            {
                file = afile[a2.a];
            }
            if (file != null && file.delete())
            {
                return true;
            }
        }
        return false;
    }

    private File[] h()
    {
        File afile[] = i();
        Arrays.sort(afile);
        return afile;
    }

    private File[] i()
    {
        File afile1[] = b.listFiles();
        File afile[] = afile1;
        if (afile1 == null)
        {
            afile = new File[0];
        }
        return afile;
    }

    private int j()
    {
        this;
        JVM INSTR monitorenter ;
        int k = e;
        this;
        JVM INSTR monitorexit ;
        return k;
        Exception exception;
        exception;
        throw exception;
    }

    public final br a(Context context)
    {
        String s = b.getName();
        s = (new StringBuilder()).append(s).append("_").append(UUID.randomUUID().toString()).toString();
        return new br(new File((new StringBuilder()).append(context.getFilesDir().getAbsolutePath()).append("//com.crittercism/pending/").append(s).toString()), g, c, f, e, i);
    }

    public final void a()
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = e();
        if (flag) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        File afile[] = i();
        int k = 0;
_L4:
        if (k >= afile.length)
        {
            break; /* Loop/switch isn't completed */
        }
        afile[k].delete();
        k++;
        if (true) goto _L4; else goto _L3
_L3:
        if (true) goto _L1; else goto _L5
_L5:
        Exception exception;
        exception;
        throw exception;
    }

    public final void a(bs bs1)
    {
        if (bs1 != null)
        {
            synchronized (j)
            {
                j.add(bs1);
            }
        }
    }

    public final void a(String s)
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = e();
          goto _L1
_L3:
        this;
        JVM INSTR monitorexit ;
        return;
_L1:
        if (!flag || s == null) goto _L3; else goto _L2
_L2:
        s = new File(b.getAbsolutePath(), s);
        if (s.exists())
        {
            s.delete();
        }
        if (true) goto _L3; else goto _L4
_L4:
        s;
        throw s;
    }

    public final boolean a(cg cg1)
    {
        boolean flag1 = false;
        this;
        JVM INSTR monitorenter ;
        boolean flag = e();
        if (flag) goto _L2; else goto _L1
_L1:
        flag = flag1;
_L3:
        this;
        JVM INSTR monitorexit ;
        return flag;
_L2:
        if (d < f)
        {
            break MISSING_BLOCK_LABEL_55;
        }
        cg1 = a;
        dx.b();
        flag = flag1;
          goto _L3
        cg1;
        throw cg1;
        int k = b();
        if (k != j()) goto _L5; else goto _L4
_L4:
        flag = flag1;
        if (!g()) goto _L3; else goto _L5
_L5:
        if (k <= j())
        {
            break MISSING_BLOCK_LABEL_99;
        }
        h = true;
        flag = flag1;
          goto _L3
        flag = c(cg1);
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_121;
        }
        d = d + 1;
        cg1 = j;
        cg1;
        JVM INSTR monitorenter ;
        for (Iterator iterator = j.iterator(); iterator.hasNext(); ((bs)iterator.next()).c()) { }
        break MISSING_BLOCK_LABEL_169;
        Exception exception;
        exception;
        cg1;
        JVM INSTR monitorexit ;
        throw exception;
        cg1;
        JVM INSTR monitorexit ;
          goto _L3
    }

    public final int b()
    {
        this;
        JVM INSTR monitorenter ;
        int k = i().length;
        this;
        JVM INSTR monitorexit ;
        return k;
        Exception exception;
        exception;
        throw exception;
    }

    public final void b(br br1)
    {
        int k;
        while (br1 == null || (k = b.getName().compareTo(br1.b.getName())) == 0) 
        {
            return;
        }
        if (k >= 0) goto _L2; else goto _L1
_L1:
        br br3 = br1;
        br br2 = this;
_L4:
        br2;
        JVM INSTR monitorenter ;
        br3;
        JVM INSTR monitorenter ;
        if (e() && br1.e())
        {
            break; /* Loop/switch isn't completed */
        }
        br3;
        JVM INSTR monitorexit ;
        br2;
        JVM INSTR monitorexit ;
        return;
        br1;
        br2;
        JVM INSTR monitorexit ;
        throw br1;
_L2:
        br3 = this;
        br2 = br1;
        if (true) goto _L4; else goto _L3
_L3:
        File afile[] = h();
        k = 0;
_L6:
        if (k >= afile.length)
        {
            break; /* Loop/switch isn't completed */
        }
        File file = new File(br1.b, afile[k].getName());
        afile[k].renameTo(file);
        k++;
        if (true) goto _L6; else goto _L5
_L5:
        br1.f();
        for (br1 = j.iterator(); br1.hasNext(); ((bs)br1.next()).d()) { }
        break MISSING_BLOCK_LABEL_176;
        br1;
        br3;
        JVM INSTR monitorexit ;
        throw br1;
        br3;
        JVM INSTR monitorexit ;
        br2;
        JVM INSTR monitorexit ;
    }

    public final boolean b(cg cg1)
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = e();
        if (flag) goto _L2; else goto _L1
_L1:
        flag = false;
_L4:
        this;
        JVM INSTR monitorexit ;
        return flag;
_L2:
        (new File(b, cg1.e())).delete();
        flag = c(cg1);
        if (true) goto _L4; else goto _L3
_L3:
        cg1;
        throw cg1;
    }

    public final List c()
    {
        this;
        JVM INSTR monitorenter ;
        ArrayList arraylist;
        boolean flag;
        arraylist = new ArrayList();
        flag = e();
        if (flag) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return arraylist;
_L2:
        File afile[];
        ci ci1 = c;
        afile = h();
        int k = 0;
_L4:
        if (k >= afile.length)
        {
            break; /* Loop/switch isn't completed */
        }
        arraylist.add(c.a(afile[k]));
        k++;
        if (true) goto _L4; else goto _L3
_L3:
        if (true) goto _L1; else goto _L5
_L5:
        Exception exception;
        exception;
        throw exception;
    }

    public final String d()
    {
        return i;
    }

}
