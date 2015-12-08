// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a;

import java.io.File;
import java.io.FileOutputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.UndeclaredThrowableException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.jar.JarEntry;
import java.util.jar.JarOutputStream;

// Referenced classes of package b.a:
//            fy, fq, fh, fw, 
//            fx, nn, np, nj, 
//            fu, nq, fv, fi, 
//            ng, os, pu, ft, 
//            fz, ff, pt

public final class ps
{

    private static final Map a = Collections.synchronizedMap(new HashMap());
    private static final Map i;
    private static final Map j;
    private static final Map k;
    private final Class b;
    private ClassLoader c;
    private InvocationHandler d;
    private File e;
    private Class f[];
    private Object g[];
    private Set h;

    private ps(Class class1)
    {
        c = b/a/ps.getClassLoader();
        f = new Class[0];
        g = new Object[0];
        h = new HashSet();
        b = class1;
    }

    public static ps a(Class class1)
    {
        return new ps(class1);
    }

    private static void a(fq fq1, fy fy1, fy fy2, Class class1)
    {
        fy fy3 = fy.a(java/lang/reflect/InvocationHandler);
        fy fy4 = fy.a([Ljava/lang/reflect/Method;);
        fq1.a(fy1.a(fy3, "$__handler"), 2);
        fq1.a(fy1.a(fy4, "$__methodArray"), 10);
        class1 = (Constructor[])class1.getDeclaredConstructors();
        int k1 = class1.length;
        for (int l = 0; l < k1; l++)
        {
            Object obj = class1[l];
            if (((Constructor) (obj)).getModifiers() == 16)
            {
                continue;
            }
            Class aclass[] = ((Constructor) (obj)).getParameterTypes();
            fy afy[] = new fy[aclass.length];
            for (int i1 = 0; i1 < aclass.length; i1++)
            {
                afy[i1] = fy.a(aclass[i1]);
            }

            fh fh1 = fq1.a(fy1.a(afy), 1);
            fw fw1 = fh1.b(fy1);
            fw afw[] = new fw[afy.length];
            for (int j1 = 0; j1 < afw.length; j1++)
            {
                afw[j1] = fh1.a(j1, afy[j1]);
            }

            afy = fy2.a(afy);
            fh1.a(nn.d(afy.a()), afy, null, fw1, afw);
            fh1.c();
        }

    }

    private static void a(fq fq1, fy fy1, Method amethod[], fy fy2)
    {
        fy fy3 = fy.a(java/lang/reflect/InvocationHandler);
        fy fy4 = fy.a([Ljava/lang/reflect/Method;);
        fu fu1 = fy1.a(fy3, "$__handler");
        fu fu2 = fy1.a(fy4, "$__methodArray");
        fy fy5 = fy.a(java/lang/reflect/Method);
        fy fy6 = fy.a([Ljava/lang/Object;);
        fx fx1 = fy3.a(fy.j, "invoke", new fy[] {
            fy.j, fy5, fy6
        });
        int l = 0;
        while (l < amethod.length) 
        {
            Method method = amethod[l];
            Object obj = method.getName();
            Class aclass[] = method.getParameterTypes();
            fy afy[] = new fy[aclass.length];
            for (int i1 = 0; i1 < afy.length; i1++)
            {
                afy[i1] = fy.a(aclass[i1]);
            }

            Class class1 = method.getReturnType();
            fy fy7 = fy.a(class1);
            fx fx2 = fy2.a(fy7, ((String) (obj)), afy);
            fh fh1 = fq1.a(fy1.a(fy7, ((String) (obj)), afy), 1);
            fw fw3 = fh1.b(fy1);
            fw fw5 = fh1.a(fy3);
            fw fw6 = fh1.a(fy.j);
            fw fw7 = fh1.a(fy.f);
            fw fw8 = fh1.a(fy6);
            Object obj1 = fh1.a(fy.f);
            fw fw1 = fh1.a(fy.j);
            fw fw4 = fh1.a(fy7);
            Object obj2 = fh1.a(fy4);
            fw fw9 = fh1.a(fy5);
            fw fw11 = fh1.a(fy.f);
            obj = (Class)i.get(class1);
            fw afw[];
            fw afw1[];
            fw fw10;
            fw fw12;
            int j1;
            if (obj != null)
            {
                obj = fh1.a(fy.a(((Class) (obj))));
            } else
            {
                obj = null;
            }
            afw1 = new fw[aclass.length];
            fw10 = fh1.a(fy7);
            fw12 = fh1.a(fy3);
            fh1.a(fw11, Integer.valueOf(l));
            fh1.a(new np(nn.j(((fw) (obj2)).a.m), fh1.c, nj.a, fh1.d, fu2.e), null);
            fh1.a(((fw) (obj2)), true);
            fh1.a(new nq(nn.f(fw9.a.m), fh1.c, nj.a(((fw) (obj2)).b(), fw11.b()), fh1.d), null);
            fh1.a(fw9, true);
            fh1.a(((fw) (obj1)), Integer.valueOf(afy.length));
            fh1.a(new np(nn.h(fw8.a.m), fh1.c, nj.a(((fw) (obj1)).b()), fh1.d, fw8.a.n), null);
            fh1.a(fw8, true);
            fh1.a(new np(nn.i(fw5.a.m), fh1.c, nj.a(fw3.b()), fh1.d, fu1.e), null);
            fh1.a(fw5, true);
            fh1.a(fw12, null);
            obj2 = new fv();
            obj1 = fi.c;
            fh1.a(((fv) (obj2)));
            fh1.a(new ng(((fi) (obj1)).a(os.a(fw12.a.m, fw5.a.m)), fh1.c, null, nj.a(fw12.b(), fw5.b())), ((fv) (obj2)));
            j1 = 0;
            while (j1 < afy.length) 
            {
                fh1.a(fw7, Integer.valueOf(j1));
                obj1 = fh1.a(j1, afy[j1]);
                fx fx3 = (fx)j.get(((fw) (obj1)).a);
                if (fx3 != null)
                {
                    fh1.a(nn.a(fx3.a()), fx3, fw1, null, new fw[] {
                        obj1
                    });
                    obj1 = fw1;
                }
                fh1.a(new nq(nn.g(((fw) (obj1)).a.m), fh1.c, nj.a(((fw) (obj1)).b(), fw8.b(), fw7.b()), fh1.d), null);
                j1++;
            }
            fh1.a(nn.e(fx1.a()), fx1, fw6, fw5, new fw[] {
                fw3, fw9, fw8
            });
            if (k.containsKey(class1))
            {
                fh1.a(((fw) (obj)), fw6);
                obj1 = (fx)k.get(class1);
                fh1.a(nn.b(((fx) (obj1)).a()), ((fx) (obj1)), fw4, ((fw) (obj)), new fw[0]);
                fh1.a(fw4);
            } else
            if (Void.TYPE.equals(class1))
            {
                fh1.c();
            } else
            {
                fh1.a(fw4, fw6);
                fh1.a(fw4);
            }
            fh1.a(((fv) (obj2)));
            if (((fv) (obj2)).c)
            {
                throw new IllegalStateException("already marked");
            }
            obj2.c = true;
            if (fh1.a != null)
            {
                fh1.a(((fv) (obj2)));
                fh1.a(new ng(nn.s, fh1.c, null, nj.a), ((fv) (obj2)));
            }
            fh1.a = ((fv) (obj2));
            for (int k1 = 0; k1 < afw1.length; k1++)
            {
                afw1[k1] = fh1.a(k1, afy[k1]);
            }

            if (Void.TYPE.equals(class1))
            {
                fh1.a(fx2, null, fw3, afw1);
                fh1.c();
            } else
            {
                a(fx2, fh1, fw3, afw1, fw10);
                fh1.a(fw10);
            }
            obj = method.getReturnType().getName();
            obj = fq1.a(fy1.a(fy7, (new StringBuilder("super$")).append(method.getName()).append("$").append(((String) (obj)).replace('.', '_').replace('[', '_').replace(';', '_')).toString(), afy), 1);
            obj1 = ((fh) (obj)).b(fy1);
            afw = new fw[aclass.length];
            for (int l1 = 0; l1 < afw.length; l1++)
            {
                afw[l1] = ((fh) (obj)).a(l1, afy[l1]);
            }

            if (Void.TYPE.equals(class1))
            {
                ((fh) (obj)).a(fx2, null, ((fw) (obj1)), afw);
                ((fh) (obj)).c();
            } else
            {
                fw fw2 = ((fh) (obj)).a(fy7);
                a(fx2, ((fh) (obj)), ((fw) (obj1)), afw, fw2);
                ((fh) (obj)).a(fw2);
            }
            l++;
        }
    }

    private static void a(fx fx1, fh fh1, fw fw1, fw afw[], fw fw2)
    {
        fh1.a(fx1, fw2, fw1, afw);
    }

    private static void a(Set set, Set set1, Class class1)
    {
        class1 = class1.getDeclaredMethods();
        int i1 = class1.length;
        int l = 0;
        while (l < i1) 
        {
            pu pu1 = class1[l];
            if ((pu1.getModifiers() & 0x10) != 0)
            {
                pu1 = new pu(pu1);
                set1.add(pu1);
                set.remove(pu1);
            } else
            if ((pu1.getModifiers() & 8) == 0 && (Modifier.isPublic(pu1.getModifiers()) || Modifier.isProtected(pu1.getModifiers())) && (!pu1.getName().equals("finalize") || pu1.getParameterTypes().length != 0))
            {
                pu1 = new pu(pu1);
                if (!set1.contains(pu1))
                {
                    set.add(pu1);
                }
            }
            l++;
        }
    }

    private static void a(boolean flag, String s)
    {
        if (!flag)
        {
            throw new IllegalArgumentException(s);
        } else
        {
            return;
        }
    }

    private Class b()
    {
        Object obj = (Class)a.get(b);
        if (obj != null && ((Class) (obj)).getClassLoader().getParent() == c && h.equals(new CopyOnWriteArraySet(Arrays.asList(((Class) (obj)).getInterfaces()))))
        {
            return ((Class) (obj));
        }
        fq fq1 = new fq();
        obj = b;
        String s = (new StringBuilder()).append(((Class) (obj)).getSimpleName()).append("_Proxy").toString();
        obj = fy.a((new StringBuilder("L")).append(s).append(";").toString());
        Object obj1 = fy.a(b);
        a(fq1, ((fy) (obj)), ((fy) (obj1)), b);
        Method amethod[] = d();
        a(fq1, ((fy) (obj)), amethod, ((fy) (obj1)));
        Object obj2 = (new StringBuilder()).append(s).append(".generated").toString();
        fy afy[] = c();
        ft ft1 = fq1.a(((fy) (obj)));
        if (ft1.b)
        {
            throw new IllegalStateException((new StringBuilder("already declared: ")).append(obj).toString());
        }
        ft1.b = true;
        ft1.c = 1;
        ft1.d = ((fy) (obj1));
        ft1.e = ((String) (obj2));
        ft1.f = new fz(afy);
        obj2 = c;
        obj1 = e;
        obj = obj1;
        if (obj1 == null)
        {
            obj = System.getProperty("dexmaker.dexcache");
            if (obj != null)
            {
                obj = new File(((String) (obj)));
            } else
            {
                new ff();
                obj1 = ff.a();
                obj = obj1;
                if (obj1 == null)
                {
                    throw new IllegalArgumentException("dexcache == null (and no default could be found; consider setting the 'dexmaker.dexcache' system property)");
                }
            }
        }
        obj1 = new File(((File) (obj)), fq1.b());
        if (((File) (obj1)).exists())
        {
            obj = fq.a(((File) (obj1)), ((File) (obj)), ((ClassLoader) (obj2)));
        } else
        {
            byte abyte0[] = fq1.a();
            ((File) (obj1)).createNewFile();
            JarOutputStream jaroutputstream = new JarOutputStream(new FileOutputStream(((File) (obj1))));
            JarEntry jarentry = new JarEntry("classes.dex");
            jarentry.setSize(abyte0.length);
            jaroutputstream.putNextEntry(jarentry);
            jaroutputstream.write(abyte0);
            jaroutputstream.closeEntry();
            jaroutputstream.close();
            obj = fq.a(((File) (obj1)), ((File) (obj)), ((ClassLoader) (obj2)));
        }
        try
        {
            obj = ((ClassLoader) (obj)).loadClass(s);
        }
        catch (IllegalAccessError illegalaccesserror)
        {
            throw new UnsupportedOperationException((new StringBuilder("cannot proxy inaccessible class ")).append(b).toString(), illegalaccesserror);
        }
        catch (ClassNotFoundException classnotfoundexception)
        {
            throw new AssertionError(classnotfoundexception);
        }
        try
        {
            obj1 = ((Class) (obj)).getDeclaredField("$__methodArray");
            ((Field) (obj1)).setAccessible(true);
            ((Field) (obj1)).set(null, amethod);
        }
        catch (NoSuchFieldException nosuchfieldexception)
        {
            throw new AssertionError(nosuchfieldexception);
        }
        catch (IllegalAccessException illegalaccessexception)
        {
            throw new AssertionError(illegalaccessexception);
        }
        a.put(b, obj);
        return ((Class) (obj));
    }

    private fy[] c()
    {
        fy afy[] = new fy[h.size()];
        Iterator iterator = h.iterator();
        for (int l = 0; iterator.hasNext(); l++)
        {
            afy[l] = fy.a((Class)iterator.next());
        }

        return afy;
    }

    private Method[] d()
    {
        boolean flag = false;
        Object obj = new HashSet();
        HashSet hashset = new HashSet();
        for (Class class1 = b; class1 != null; class1 = class1.getSuperclass())
        {
            a(((Set) (obj)), hashset, class1);
        }

        for (Class class2 = b; class2 != null; class2 = class2.getSuperclass())
        {
            Class aclass[] = class2.getInterfaces();
            int j1 = aclass.length;
            for (int l = 0; l < j1; l++)
            {
                a(((Set) (obj)), hashset, aclass[l]);
            }

        }

        for (Iterator iterator = h.iterator(); iterator.hasNext(); a(((Set) (obj)), hashset, (Class)iterator.next())) { }
        Method amethod[] = new Method[((Set) (obj)).size()];
        obj = ((Set) (obj)).iterator();
        for (int i1 = ((flag) ? 1 : 0); ((Iterator) (obj)).hasNext(); i1++)
        {
            amethod[i1] = ((pu)((Iterator) (obj)).next()).a;
        }

        Arrays.sort(amethod, new pt(this));
        return amethod;
    }

    public final ps a(File file)
    {
        e = new File(file, (new StringBuilder("v")).append(Integer.toString(1)).toString());
        e.mkdir();
        return this;
    }

    public final ps a(InvocationHandler invocationhandler)
    {
        d = invocationhandler;
        return this;
    }

    public final transient ps a(Class aclass[])
    {
        f = aclass;
        return this;
    }

    public final transient ps a(Object aobj[])
    {
        g = aobj;
        return this;
    }

    public final Object a()
    {
        boolean flag1 = true;
        Object obj;
        InvocationHandler invocationhandler;
        boolean flag;
        if (d != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a(flag, "handler == null");
        if (f.length == g.length)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        a(flag, "constructorArgValues.length != constructorArgTypes.length");
        obj = b();
        try
        {
            obj = ((Class) (obj)).getConstructor(f);
        }
        catch (NoSuchMethodException nosuchmethodexception)
        {
            throw new IllegalArgumentException((new StringBuilder("No constructor for ")).append(b.getName()).append(" with parameter types ").append(Arrays.toString(f)).toString());
        }
        try
        {
            obj = ((Constructor) (obj)).newInstance(g);
        }
        catch (InstantiationException instantiationexception)
        {
            throw new AssertionError(instantiationexception);
        }
        catch (IllegalAccessException illegalaccessexception)
        {
            throw new AssertionError(illegalaccessexception);
        }
        catch (InvocationTargetException invocationtargetexception)
        {
            Throwable throwable = invocationtargetexception.getCause();
            if (throwable instanceof Error)
            {
                throw (Error)throwable;
            }
            if (throwable instanceof RuntimeException)
            {
                throw (RuntimeException)throwable;
            } else
            {
                throw new UndeclaredThrowableException(throwable);
            }
        }
        invocationhandler = d;
        try
        {
            Field field = obj.getClass().getDeclaredField("$__handler");
            field.setAccessible(true);
            field.set(obj, invocationhandler);
        }
        catch (NoSuchFieldException nosuchfieldexception)
        {
            throw new IllegalArgumentException("Not a valid proxy instance", nosuchfieldexception);
        }
        catch (IllegalAccessException illegalaccessexception1)
        {
            throw new AssertionError(illegalaccessexception1);
        }
        return obj;
    }

    static 
    {
        Object obj = new HashMap();
        i = ((Map) (obj));
        ((Map) (obj)).put(Boolean.TYPE, java/lang/Boolean);
        i.put(Integer.TYPE, java/lang/Integer);
        i.put(Byte.TYPE, java/lang/Byte);
        i.put(Long.TYPE, java/lang/Long);
        i.put(Short.TYPE, java/lang/Short);
        i.put(Float.TYPE, java/lang/Float);
        i.put(Double.TYPE, java/lang/Double);
        i.put(Character.TYPE, java/lang/Character);
        j = new HashMap();
        fy fy1;
        Object obj1;
        for (obj = i.entrySet().iterator(); ((Iterator) (obj)).hasNext(); j.put(fy1, obj1))
        {
            obj1 = (java.util.Map.Entry)((Iterator) (obj)).next();
            fy1 = fy.a((Class)((java.util.Map.Entry) (obj1)).getKey());
            obj1 = fy.a((Class)((java.util.Map.Entry) (obj1)).getValue());
            obj1 = ((fy) (obj1)).a(((fy) (obj1)), "valueOf", new fy[] {
                fy1
            });
        }

        obj = new HashMap();
        ((Map) (obj)).put(Boolean.TYPE, fy.a(java/lang/Boolean).a(fy.a, "booleanValue", new fy[0]));
        ((Map) (obj)).put(Integer.TYPE, fy.a(java/lang/Integer).a(fy.f, "intValue", new fy[0]));
        ((Map) (obj)).put(Byte.TYPE, fy.a(java/lang/Byte).a(fy.b, "byteValue", new fy[0]));
        ((Map) (obj)).put(Long.TYPE, fy.a(java/lang/Long).a(fy.g, "longValue", new fy[0]));
        ((Map) (obj)).put(Short.TYPE, fy.a(java/lang/Short).a(fy.h, "shortValue", new fy[0]));
        ((Map) (obj)).put(Float.TYPE, fy.a(java/lang/Float).a(fy.e, "floatValue", new fy[0]));
        ((Map) (obj)).put(Double.TYPE, fy.a(java/lang/Double).a(fy.d, "doubleValue", new fy[0]));
        ((Map) (obj)).put(Character.TYPE, fy.a(java/lang/Character).a(fy.c, "charValue", new fy[0]));
        k = ((Map) (obj));
    }
}
