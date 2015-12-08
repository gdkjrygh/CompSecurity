// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.a.j;

import com.kik.g.p;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kik.a.d.ab;
import kik.a.e.x;

// Referenced classes of package kik.a.j:
//            e, b, h, g, 
//            f, k, i, j, 
//            c, l, d

public final class a
    implements x
{

    private File a;
    private File b;
    private ExecutorService c;

    public a(File file)
    {
        a = file;
        c = Executors.newSingleThreadExecutor();
        if (!a.exists())
        {
            a.mkdir();
        }
        b = new File(file, ".updated");
        if (!b.exists())
        {
            b.mkdir();
        }
    }

    static File a(a a1)
    {
        return a1.a;
    }

    static ab a(String s, String s1, File file)
    {
        return b(s, s1, file);
    }

    static ab a(a a1, String s, String s1)
    {
        File file = a1.a;
        boolean flag;
        if (s1 != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            file = new File(a1.a, s);
            if (!file.exists() || !file.isDirectory())
            {
                throw new FileNotFoundException();
            }
        }
        String s2;
        if (s1 == null)
        {
            s2 = s;
        } else
        {
            s2 = s1;
        }
        a1 = file.listFiles(new e(a1, s2));
        if (a1.length == 0)
        {
            if (flag)
            {
                return null;
            } else
            {
                throw new FileNotFoundException();
            }
        } else
        {
            return b(s, s1, a1[0]);
        }
    }

    static ab a(a a1, String s, String s1, byte abyte0[])
    {
        Object obj = a1.a;
        if (s1 != null)
        {
            obj = new File(a1.a, s);
        }
        if (!((File) (obj)).exists())
        {
            ((File) (obj)).mkdir();
        }
        String s2;
        if (s1 == null)
        {
            s2 = s;
        } else
        {
            s2 = s1;
        }
        obj = new File(((File) (obj)), s2);
        if (abyte0 == null)
        {
            if (((File) (obj)).exists())
            {
                ((File) (obj)).delete();
                ((File) (obj)).createNewFile();
            }
            obj = c(s, s1);
            a1 = new File(a1.b, (new StringBuilder("_")).append(((String) (obj))).toString());
            if (a1.exists())
            {
                a1.delete();
            }
        } else
        {
            if (!((File) (obj)).exists())
            {
                ((File) (obj)).createNewFile();
            }
            a1 = new FileOutputStream(((File) (obj)));
            a1.write(abyte0);
            a1.close();
        }
        if (abyte0 == null)
        {
            return new ab(s, s1);
        } else
        {
            return new ab(s, s1, abyte0);
        }
    }

    static void a(a a1, String s, String s1, boolean flag)
    {
        File file = a1.a;
        if (s1 != null || flag)
        {
            file = new File(a1.a, s);
        }
        if (!file.exists())
        {
            file.mkdir();
        }
        if (!flag)
        {
            if (s1 != null)
            {
                s = s1;
            }
            a1 = new File(file, s);
            if (!a1.exists())
            {
                a1.createNewFile();
            }
        }
    }

    static File b(a a1)
    {
        return a1.b;
    }

    static String b(String s, String s1)
    {
        return c(s, s1);
    }

    private static ab b(String s, String s1, File file)
    {
        if (!file.exists() || file.isDirectory())
        {
            throw new FileNotFoundException();
        }
        Object obj = null;
        FileInputStream fileinputstream = new FileInputStream(file);
        int j1 = (int)file.length();
        file = obj;
        if (j1 != 0)
        {
            file = new byte[j1];
            int i1 = 0;
            do
            {
                if (i1 >= j1)
                {
                    break;
                }
                int k1 = fileinputstream.read(file);
                if (k1 <= 0)
                {
                    break;
                }
                i1 += k1;
            } while (true);
            fileinputstream.close();
            file = new ab(s, s1, file);
        }
        return file;
    }

    static boolean b(a a1, String s, String s1)
    {
        File file;
        file = a1.a;
        File file1;
        boolean flag;
        if (s1 != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!flag) goto _L2; else goto _L1
_L1:
        file1 = new File(a1.a, s);
        if (!file1.exists()) goto _L4; else goto _L3
_L3:
        file = file1;
        if (file1.isDirectory()) goto _L2; else goto _L4
_L4:
        return false;
_L2:
        if (s1 != null)
        {
            s = s1;
        }
        if (file.listFiles(new b(a1, s)).length != 0)
        {
            return true;
        }
        if (true) goto _L4; else goto _L5
_L5:
    }

    private static String c(String s, String s1)
    {
        String s2 = s;
        if (s1 != null)
        {
            s2 = (new StringBuilder()).append(s).append(".").append(s1).toString();
        }
        return s2;
    }

    public final p a()
    {
        p p1 = new p();
        c.submit(new h(this, p1));
        return p1;
    }

    public final p a(String s)
    {
        p p1 = new p();
        c.submit(new g(this, s, p1));
        return p1;
    }

    public final p a(String s, String s1)
    {
        p p1 = new p();
        c.submit(new f(this, s, s1, p1));
        return p1;
    }

    public final p a(String s, String s1, byte abyte0[])
    {
        p p1 = new p();
        c.submit(new k(this, s, s1, abyte0, p1));
        return p1;
    }

    public final p a(List list)
    {
        p p1 = new p();
        c.submit(new i(this, list, p1));
        return p1;
    }

    public final p b()
    {
        p p1 = new p();
        c.submit(new j(this, p1));
        return p1;
    }

    public final p b(String s)
    {
        p p1 = new p();
        c.submit(new c(this, s, p1));
        return p1;
    }

    public final p b(String s, String s1, byte abyte0[])
    {
        p p1 = new p();
        c.submit(new l(this, s, s1, abyte0, p1));
        return p1;
    }

    public final p b(List list)
    {
        p p1 = new p();
        c.submit(new d(this, list, p1));
        return p1;
    }

    public final void c()
    {
        c.shutdown();
    }
}
