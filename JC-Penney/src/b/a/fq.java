// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

// Referenced classes of package b.a:
//            fx, ft, fs, fu, 
//            fr, ga, ji, iz, 
//            fy, fz, oo, hg, 
//            nm, fh, hk, hb, 
//            gj, jm, os, iy, 
//            jk, fp, ja, oz

public final class fq
{

    private final Map a = new LinkedHashMap();

    public fq()
    {
    }

    public static ClassLoader a(File file, File file1, ClassLoader classloader)
    {
        try
        {
            file = (ClassLoader)Class.forName("dalvik.system.DexClassLoader").getConstructor(new Class[] {
                java/lang/String, java/lang/String, java/lang/String, java/lang/ClassLoader
            }).newInstance(new Object[] {
                file.getPath(), file1.getAbsolutePath(), null, classloader
            });
        }
        // Misplaced declaration of an exception variable
        catch (File file)
        {
            throw new UnsupportedOperationException("load() requires a Dalvik VM", file);
        }
        // Misplaced declaration of an exception variable
        catch (File file)
        {
            throw new RuntimeException(file.getCause());
        }
        // Misplaced declaration of an exception variable
        catch (File file)
        {
            throw new AssertionError();
        }
        // Misplaced declaration of an exception variable
        catch (File file)
        {
            throw new AssertionError();
        }
        // Misplaced declaration of an exception variable
        catch (File file)
        {
            throw new AssertionError();
        }
        return file;
    }

    public final fh a(fx fx1, int i)
    {
        ft ft1 = a(fx1.a);
        if (ft1.h.containsKey(fx1))
        {
            throw new IllegalStateException((new StringBuilder("already declared: ")).append(fx1).toString());
        }
        if (fx1.c.equals("<init>"))
        {
            i = 0x10001;
        }
        fs fs1 = new fs(fx1, i);
        ft1.h.put(fx1, fs1);
        return fs1.c;
    }

    public final ft a(fy fy1)
    {
        ft ft2 = (ft)a.get(fy1);
        ft ft1 = ft2;
        if (ft2 == null)
        {
            ft1 = new ft(fy1);
            a.put(fy1, ft1);
        }
        return ft1;
    }

    public final void a(fu fu1, int i)
    {
        ft ft1 = a(fu1.a);
        if (ft1.g.containsKey(fu1))
        {
            throw new IllegalStateException((new StringBuilder("already declared: ")).append(fu1).toString());
        }
        if ((i & 0xffffff20) != 0)
        {
            throw new IllegalArgumentException((new StringBuilder("Unexpected flag: ")).append(Integer.toHexString(i)).toString());
        } else
        {
            fr fr1 = new fr(fu1, i);
            ft1.g.put(fu1, fr1);
            return;
        }
    }

    public final byte[] a()
    {
        Object obj = new ga();
        obj.a = 13;
        obj = new ji(((ga) (obj)));
        iz iz1;
        for (Iterator iterator = a.values().iterator(); iterator.hasNext(); ((ji) (obj)).k.a(iz1))
        {
            Object obj1 = (ft)iterator.next();
            if (!((ft) (obj1)).b)
            {
                throw new IllegalStateException((new StringBuilder("Undeclared type ")).append(((ft) (obj1)).a).append(" declares members: ").append(((ft) (obj1)).g.keySet()).append(" ").append(((ft) (obj1)).h.keySet()).toString());
            }
            ga ga1 = new ga();
            ga1.a = 13;
            iz1 = new iz(((ft) (obj1)).a.n, ((ft) (obj1)).c, ((ft) (obj1)).d.n, ((ft) (obj1)).f.b, new oo(((ft) (obj1)).e));
            for (Iterator iterator1 = ((ft) (obj1)).h.values().iterator(); iterator1.hasNext();)
            {
                fs fs1 = (fs)iterator1.next();
                Object obj4 = new hg(new nm(fs1.c.d()), fs1.c.b(), ga1);
                ((hg) (obj4)).b();
                ((hg) (obj4)).a();
                Object obj3 = new hk(((hg) (obj4)).a, ((hg) (obj4)).f, ((hg) (obj4)).c);
                int i = ((hg) (obj4)).b;
                obj4 = ((hg) (obj4)).d;
                if (((hb) (obj4)).b == null)
                {
                    throw new UnsupportedOperationException("already processed");
                }
                ((hb) (obj4)).a();
                obj3 = new gj(i, ((hb) (obj4)).a, ((gc) (obj3)));
                obj3 = new jm(fs1.a.f, fs1.b, ((gj) (obj3)), os.a);
                boolean flag;
                if ((fs1.b & 0x1000a) != 0)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                if (flag)
                {
                    iz1.d.a(((jm) (obj3)));
                } else
                {
                    iz1.d.b(((jm) (obj3)));
                }
            }

            for (obj1 = ((ft) (obj1)).g.values().iterator(); ((Iterator) (obj1)).hasNext();)
            {
                Object obj2 = (fr)((Iterator) (obj1)).next();
                jk jk1 = new jk(((fr) (obj2)).a.e, ((fr) (obj2)).b);
                boolean flag1;
                if ((((fr) (obj2)).b & 8) != 0)
                {
                    flag1 = true;
                } else
                {
                    flag1 = false;
                }
                if (flag1)
                {
                    obj2 = fp.a(((fr) (obj2)).c);
                    iz1.d.a(jk1, ((nr) (obj2)));
                } else
                {
                    iz1.d.a(jk1);
                }
            }

        }

        byte abyte0[];
        try
        {
            abyte0 = ((ji) (obj)).b().a;
        }
        catch (IOException ioexception)
        {
            throw new RuntimeException(ioexception);
        }
        return abyte0;
    }

    public final String b()
    {
        int j = 0;
        Set set = a.keySet();
        Iterator iterator = set.iterator();
        int ai[] = new int[set.size()];
        int i = 0;
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            ft ft1 = a((fy)iterator.next());
            Set set1 = ft1.h.keySet();
            if (ft1.d != null)
            {
                int k = i + 1;
                ai[i] = ft1.d.hashCode() * 31 + set1.hashCode();
                i = k;
            }
        } while (true);
        Arrays.sort(ai);
        int l = ai.length;
        boolean flag = true;
        i = j;
        j = ((flag) ? 1 : 0);
        for (; i < l; i++)
        {
            j = j * 31 + ai[i];
        }

        return (new StringBuilder("Generated_")).append(j).append(".jar").toString();
    }
}
