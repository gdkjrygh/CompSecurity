// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.common.dextricks;

import dalvik.system.DexFile;
import java.lang.reflect.Field;
import java.util.ArrayList;

// Referenced classes of package com.facebook.common.dextricks:
//            DexFileLoadOld, DexFileLoadNew, ClassLoadingStats

public final class MultiDexClassLoader extends ClassLoader
{

    private static final Class a[] = {
        com/facebook/common/dextricks/DexFileLoadOld, com/facebook/common/dextricks/DexFileLoadNew, com/facebook/common/dextricks/ClassLoadingStats, com/facebook/common/dextricks/ClassLoadingStats$SnapshotStats
    };
    private static volatile MultiDexClassLoader b = null;
    private static final Object c = new Object();
    private static byte d = 0;
    private static final ClassNotFoundException i = new ClassNotFoundException("[MultiDexclassLoader prefab]");
    private DexFile e[];
    private String f[];
    private final ClassLoader g;
    private final ClassLoadingStats h = ClassLoadingStats.a();

    private MultiDexClassLoader(ClassLoader classloader, ClassLoader classloader1)
    {
        super(classloader);
        e = new DexFile[0];
        f = new String[0];
        g = classloader1;
    }

    public static MultiDexClassLoader a()
    {
        Object obj;
        Object obj1;
        Object obj2;
        Field field;
        int j;
        int k;
        try
        {
            obj1 = b;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw new RuntimeException(((Throwable) (obj)));
        }
        catch (IllegalAccessException illegalaccessexception)
        {
            throw new RuntimeException(illegalaccessexception);
        }
        obj = obj1;
        if (obj1 != null) goto _L2; else goto _L1
_L1:
        obj2 = c;
        obj2;
        JVM INSTR monitorenter ;
        obj1 = b;
        obj = obj1;
        if (obj1 != null)
        {
            break MISSING_BLOCK_LABEL_135;
        }
        obj = a;
        k = obj.length;
        j = 0;
_L4:
        if (j >= k)
        {
            break; /* Loop/switch isn't completed */
        }
        Class.forName(obj[j].getName());
        j++;
        if (true) goto _L4; else goto _L3
        obj;
        throw new RuntimeException(((Throwable) (obj)));
        obj;
        obj2;
        JVM INSTR monitorexit ;
        throw obj;
_L3:
        obj1 = com/facebook/common/dextricks/MultiDexClassLoader.getClassLoader();
        field = java/lang/ClassLoader.getDeclaredField("parent");
        field.setAccessible(true);
        obj = new MultiDexClassLoader((ClassLoader)field.get(obj1), ((ClassLoader) (obj1)));
        field.set(obj1, obj);
        b = ((MultiDexClassLoader) (obj));
        obj2;
        JVM INSTR monitorexit ;
_L2:
        return ((MultiDexClassLoader) (obj));
    }

    private Class a(String s)
    {
        Class class1;
        DexFile adexfile[];
        ClassLoader classloader;
        int j;
        boolean flag;
        int i1;
        flag = false;
        class1 = null;
        adexfile = e;
        i1 = adexfile.length;
        classloader = g;
        j = 0;
_L2:
        if (class1 != null || j >= i1)
        {
            break; /* Loop/switch isn't completed */
        }
        Class class2 = DexFileLoadNew.a(adexfile[j], s, classloader);
        j++;
        class1 = class2;
        if (true) goto _L2; else goto _L1
_L1:
        if (i1 <= 0)
        {
            break MISSING_BLOCK_LABEL_68;
        }
        d = 1;
        h.a(j);
        return class1;
        NoSuchMethodError nosuchmethoderror;
        nosuchmethoderror;
        int k = 0;
        do
        {
            if (class1 != null || k >= i1)
            {
                break;
            }
            Class class3;
            try
            {
                class3 = DexFileLoadOld.a(adexfile[k], s, classloader);
            }
            catch (NoSuchMethodError nosuchmethoderror1)
            {
                d = 3;
                int l;
                for (l = ((flag) ? 1 : 0); class1 == null && l < i1; l++)
                {
                    class1 = adexfile[l].loadClass(s, classloader);
                }

                h.a(l);
                return class1;
            }
            k++;
            class1 = class3;
        } while (true);
        d = 2;
        h.a(k);
        return class1;
    }

    private void a(DexFile dexfile, int j)
    {
        DexFile adexfile1[];
        adexfile1 = e;
        if (j >= adexfile1.length / 2)
        {
            return;
        }
        DexFile adexfile[] = e;
        adexfile;
        JVM INSTR monitorenter ;
        if (adexfile1[0] != dexfile)
        {
            break MISSING_BLOCK_LABEL_39;
        }
        adexfile;
        JVM INSTR monitorexit ;
        return;
        dexfile;
        adexfile;
        JVM INSTR monitorexit ;
        throw dexfile;
        int k = j;
        if (adexfile1[j] == dexfile) goto _L2; else goto _L1
_L1:
        adexfile;
        JVM INSTR monitorexit ;
        return;
_L4:
        adexfile1[0] = dexfile;
        adexfile;
        JVM INSTR monitorexit ;
        return;
_L2:
        while (k > 0) 
        {
            adexfile1[k] = adexfile1[k - 1];
            k--;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    private static boolean a(String s, String as[])
    {
        boolean flag1 = false;
        int j = 0;
        do
        {
label0:
            {
                boolean flag = flag1;
                if (j < as.length)
                {
                    if (!s.startsWith(as[j]))
                    {
                        break label0;
                    }
                    flag = true;
                }
                return flag;
            }
            j++;
        } while (true);
    }

    public static DexFile[] b()
    {
        DexFile adexfile[];
        int j;
        j = 0;
        adexfile = b;
        if (adexfile != null) goto _L2; else goto _L1
_L1:
        adexfile = new DexFile[0];
_L4:
        return adexfile;
_L2:
        DexFile adexfile2[] = ((MultiDexClassLoader) (adexfile)).e;
        int k = adexfile2.length / 2;
        DexFile adexfile1[] = new DexFile[k];
        do
        {
            adexfile = adexfile1;
            if (j >= k)
            {
                continue;
            }
            adexfile1[j] = adexfile2[k + j];
            j++;
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final void a(Configuration configuration)
    {
        int k = Configuration.a(configuration).size();
        e = new DexFile[k * 2];
        for (int j = 0; j < k; j++)
        {
            DexFile dexfile = (DexFile)Configuration.a(configuration).get(j);
            e[j] = dexfile;
            e[j + k] = dexfile;
        }

        f = (String[])Configuration.b(configuration).toArray(new String[Configuration.b(configuration).size()]);
    }

    protected final Class findClass(String s)
    {
        Object obj;
        Class class1;
        Class class2;
        Class class3;
        DexFile adexfile[];
        ClassLoader classloader;
        int j;
        int k;
        int l;
        int i1;
        int j1;
        k = 0;
        l = 0;
        i1 = 0;
        j = 0;
        class1 = null;
        class2 = null;
        class3 = null;
        obj = null;
        adexfile = e;
        j1 = adexfile.length;
        classloader = g;
        d;
        JVM INSTR tableswitch 0 3: default 72
    //                   0 283
    //                   1 87
    //                   2 149
    //                   3 216;
           goto _L1 _L2 _L3 _L4 _L5
_L1:
        h.a(j);
        if (obj != null)
        {
            return ((Class) (obj));
        } else
        {
            throw i;
        }
_L3:
        j = k;
        obj = class1;
        if (class1 != null) goto _L1; else goto _L6
_L6:
        j = k;
        obj = class1;
        if (k >= j1) goto _L1; else goto _L7
_L7:
        obj = adexfile[k];
        class1 = DexFileLoadNew.a(((DexFile) (obj)), s, classloader);
        if (class1 != null && k != 0)
        {
            a(((DexFile) (obj)), k);
        }
        k++;
          goto _L3
_L4:
        j = l;
        obj = class2;
        if (class2 != null) goto _L1; else goto _L8
_L8:
        j = l;
        obj = class2;
        if (l >= j1) goto _L1; else goto _L9
_L9:
        obj = adexfile[l];
        class2 = DexFileLoadOld.a(((DexFile) (obj)), s, classloader);
        if (class2 != null && l != 0)
        {
            a(((DexFile) (obj)), l);
        }
        l++;
          goto _L4
_L5:
        j = i1;
        obj = class3;
        if (class3 != null) goto _L1; else goto _L10
_L10:
        j = i1;
        obj = class3;
        if (i1 >= j1) goto _L1; else goto _L11
_L11:
        obj = adexfile[i1];
        class3 = ((DexFile) (obj)).loadClass(s, classloader);
        if (class3 != null && i1 != 0)
        {
            a(((DexFile) (obj)), i1);
        }
        i1++;
          goto _L5
_L2:
        obj = a(s);
          goto _L1
    }

    protected final Class loadClass(String s, boolean flag)
    {
        if (a(s, f) || getParent() == null)
        {
            break MISSING_BLOCK_LABEL_37;
        }
        Class class1;
        h.b();
        class1 = getParent().loadClass(s);
        return class1;
        ClassNotFoundException classnotfoundexception;
        classnotfoundexception;
        s = findClass(s);
        h.b();
        return s;
    }


    private class Configuration
    {

        private ArrayList a;
        private ArrayList b;

        static ArrayList a(Configuration configuration)
        {
            return configuration.a;
        }

        static ArrayList b(Configuration configuration)
        {
            return configuration.b;
        }

        public final void a(File file, File file1)
        {
            StringBuilder stringbuilder = new StringBuilder();
            stringbuilder.append(file1.getAbsolutePath());
            stringbuilder.append('/');
            file1 = file.getName();
            int j = file1.lastIndexOf('.');
            if (j < 0)
            {
                stringbuilder.append(file1);
            } else
            {
                stringbuilder.append(file1, 0, j);
            }
            stringbuilder.append(".dex");
            a.add(DexFile.loadDex(file.getAbsolutePath(), stringbuilder.toString(), 0));
        }

        public final void a(String s)
        {
            b.add(s);
        }

        public Configuration()
        {
            a = new ArrayList();
            b = new ArrayList();
        }
    }

}
