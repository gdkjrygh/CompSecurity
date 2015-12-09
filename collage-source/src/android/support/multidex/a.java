// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.multidex;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.util.Log;
import dalvik.system.DexFile;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.ZipFile;

// Referenced classes of package android.support.multidex:
//            b

public final class android.support.multidex.a
{
    private static final class a
    {

        static void a(ClassLoader classloader, List list, File file)
            throws IllegalArgumentException, IllegalAccessException, NoSuchFieldException, InvocationTargetException, NoSuchMethodException
        {
            b(classloader, list, file);
        }

        private static Object[] a(Object obj, ArrayList arraylist, File file)
            throws IllegalAccessException, InvocationTargetException, NoSuchMethodException
        {
            return (Object[])(Object[])android.support.multidex.a.a(obj, "makeDexElements", new Class[] {
                java/util/ArrayList, java/io/File
            }).invoke(obj, new Object[] {
                arraylist, file
            });
        }

        private static void b(ClassLoader classloader, List list, File file)
            throws IllegalArgumentException, IllegalAccessException, NoSuchFieldException, InvocationTargetException, NoSuchMethodException
        {
            classloader = ((ClassLoader) (android.support.multidex.a.a(classloader, "pathList").get(classloader)));
            android.support.multidex.a.a(classloader, "dexElements", a(classloader, new ArrayList(list), file));
        }

        private a()
        {
        }
    }

    private static final class b
    {

        static void a(ClassLoader classloader, List list, File file)
            throws IllegalArgumentException, IllegalAccessException, NoSuchFieldException, InvocationTargetException, NoSuchMethodException
        {
            b(classloader, list, file);
        }

        private static Object[] a(Object obj, ArrayList arraylist, File file, ArrayList arraylist1)
            throws IllegalAccessException, InvocationTargetException, NoSuchMethodException
        {
            return (Object[])(Object[])android.support.multidex.a.a(obj, "makeDexElements", new Class[] {
                java/util/ArrayList, java/io/File, java/util/ArrayList
            }).invoke(obj, new Object[] {
                arraylist, file, arraylist1
            });
        }

        private static void b(ClassLoader classloader, List list, File file)
            throws IllegalArgumentException, IllegalAccessException, NoSuchFieldException, InvocationTargetException, NoSuchMethodException
        {
            Object obj = android.support.multidex.a.a(classloader, "pathList").get(classloader);
            ArrayList arraylist = new ArrayList();
            android.support.multidex.a.a(obj, "dexElements", a(obj, new ArrayList(list), file, arraylist));
            if (arraylist.size() > 0)
            {
                for (list = arraylist.iterator(); list.hasNext(); Log.w("MultiDex", "Exception in makeDexElement", (IOException)list.next())) { }
                file = android.support.multidex.a.a(classloader, "dexElementsSuppressedExceptions");
                IOException aioexception[] = (IOException[])(IOException[])file.get(classloader);
                if (aioexception == null)
                {
                    list = (IOException[])arraylist.toArray(new IOException[arraylist.size()]);
                } else
                {
                    list = new IOException[arraylist.size() + aioexception.length];
                    arraylist.toArray(list);
                    System.arraycopy(aioexception, 0, list, arraylist.size(), aioexception.length);
                }
                file.set(classloader, list);
            }
        }

        private b()
        {
        }
    }

    private static final class c
    {

        static void a(ClassLoader classloader, List list)
            throws IllegalArgumentException, IllegalAccessException, NoSuchFieldException, IOException
        {
            b(classloader, list);
        }

        private static void b(ClassLoader classloader, List list)
            throws IllegalArgumentException, IllegalAccessException, NoSuchFieldException, IOException
        {
            int i = list.size();
            Field field = android.support.multidex.a.a(classloader, "path");
            StringBuilder stringbuilder = new StringBuilder((String)field.get(classloader));
            String as[] = new String[i];
            File afile[] = new File[i];
            ZipFile azipfile[] = new ZipFile[i];
            DexFile adexfile[] = new DexFile[i];
            for (list = list.listIterator(); list.hasNext();)
            {
                File file = (File)list.next();
                String s = file.getAbsolutePath();
                stringbuilder.append(':').append(s);
                int j = list.previousIndex();
                as[j] = s;
                afile[j] = file;
                azipfile[j] = new ZipFile(file);
                adexfile[j] = DexFile.loadDex(s, (new StringBuilder()).append(s).append(".dex").toString(), 0);
            }

            field.set(classloader, stringbuilder.toString());
            android.support.multidex.a.a(classloader, "mPaths", as);
            android.support.multidex.a.a(classloader, "mFiles", afile);
            android.support.multidex.a.a(classloader, "mZips", azipfile);
            android.support.multidex.a.a(classloader, "mDexs", adexfile);
        }

        private c()
        {
        }
    }


    private static final String a;
    private static final Set b = new HashSet();
    private static final boolean c = a(System.getProperty("java.vm.version"));

    private android.support.multidex.a()
    {
    }

    static Field a(Object obj, String s)
        throws NoSuchFieldException
    {
        return b(obj, s);
    }

    static Method a(Object obj, String s, Class aclass[])
        throws NoSuchMethodException
    {
        return b(obj, s, aclass);
    }

    public static void a(Context context)
    {
        Log.i("MultiDex", "install");
        if (!c) goto _L2; else goto _L1
_L1:
        Log.i("MultiDex", "VM has multidex support, MultiDex support library is disabled.");
_L4:
        return;
_L2:
        if (android.os.Build.VERSION.SDK_INT < 4)
        {
            throw new RuntimeException((new StringBuilder()).append("Multi dex installation failed. SDK ").append(android.os.Build.VERSION.SDK_INT).append(" is unsupported. Min SDK version is ").append(4).append(".").toString());
        }
        ApplicationInfo applicationinfo = b(context);
        if (applicationinfo == null) goto _L4; else goto _L3
_L3:
        Object obj;
        synchronized (b)
        {
            obj = applicationinfo.sourceDir;
            if (!b.contains(obj))
            {
                break MISSING_BLOCK_LABEL_158;
            }
        }
        return;
        context;
        set;
        JVM INSTR monitorexit ;
        try
        {
            throw context;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            Log.e("MultiDex", "Multidex installation failure", context);
        }
        throw new RuntimeException((new StringBuilder()).append("Multi dex installation failed (").append(context.getMessage()).append(").").toString());
        b.add(obj);
        if (android.os.Build.VERSION.SDK_INT > 20)
        {
            Log.w("MultiDex", (new StringBuilder()).append("MultiDex is not guaranteed to work in SDK version ").append(android.os.Build.VERSION.SDK_INT).append(": SDK version higher than ").append(20).append(" should be backed by ").append("runtime with built-in multidex capabilty but it's not the ").append("case here: java.vm.version=\"").append(System.getProperty("java.vm.version")).append("\"").toString());
        }
        obj = context.getClassLoader();
        if (obj != null)
        {
            break MISSING_BLOCK_LABEL_274;
        }
        Log.e("MultiDex", "Context class loader is null. Must be running in test mode. Skip patching.");
        set;
        JVM INSTR monitorexit ;
        return;
        context;
        Log.w("MultiDex", "Failure while trying to obtain Context class loader. Must be running in test mode. Skip patching.", context);
        set;
        JVM INSTR monitorexit ;
        return;
        c(context);
_L7:
        Object obj1;
        List list;
        obj1 = new File(applicationinfo.dataDir, a);
        list = android.support.multidex.b.a(context, applicationinfo, ((File) (obj1)), false);
        if (!a(list)) goto _L6; else goto _L5
_L5:
        a(((ClassLoader) (obj)), ((File) (obj1)), list);
_L8:
        set;
        JVM INSTR monitorexit ;
        Log.i("MultiDex", "install done");
        return;
        obj1;
        Log.w("MultiDex", "Something went wrong when trying to clear old MultiDex extraction, continuing without cleaning.", ((Throwable) (obj1)));
          goto _L7
_L6:
label0:
        {
            Log.w("MultiDex", "Files were not valid zip files.  Forcing a reload.");
            context = android.support.multidex.b.a(context, applicationinfo, ((File) (obj1)), true);
            if (!a(((List) (context))))
            {
                break label0;
            }
            a(((ClassLoader) (obj)), ((File) (obj1)), ((List) (context)));
        }
          goto _L8
        throw new RuntimeException("Zip files were not valid.");
          goto _L7
    }

    private static void a(ClassLoader classloader, File file, List list)
        throws IllegalArgumentException, IllegalAccessException, NoSuchFieldException, InvocationTargetException, NoSuchMethodException, IOException
    {
label0:
        {
            if (!list.isEmpty())
            {
                if (android.os.Build.VERSION.SDK_INT < 19)
                {
                    break label0;
                }
                b.a(classloader, list, file);
            }
            return;
        }
        if (android.os.Build.VERSION.SDK_INT >= 14)
        {
            a.a(classloader, list, file);
            return;
        } else
        {
            c.a(classloader, list);
            return;
        }
    }

    static void a(Object obj, String s, Object aobj[])
        throws NoSuchFieldException, IllegalArgumentException, IllegalAccessException
    {
        b(obj, s, aobj);
    }

    static boolean a(String s)
    {
        Matcher matcher;
        boolean flag;
        boolean flag1;
        flag1 = false;
        flag = flag1;
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_76;
        }
        matcher = Pattern.compile("(\\d+)\\.(\\d+)(\\.\\d+)?").matcher(s);
        flag = flag1;
        if (!matcher.matches())
        {
            break MISSING_BLOCK_LABEL_76;
        }
        int i;
        int j;
        i = Integer.parseInt(matcher.group(1));
        j = Integer.parseInt(matcher.group(2));
        if (i <= 2)
        {
            flag = flag1;
            if (i != 2)
            {
                break MISSING_BLOCK_LABEL_76;
            }
            flag = flag1;
            if (j < 1)
            {
                break MISSING_BLOCK_LABEL_76;
            }
        }
        flag = true;
_L2:
        StringBuilder stringbuilder = (new StringBuilder()).append("VM with version ").append(s);
        if (flag)
        {
            s = " has multidex support";
        } else
        {
            s = " does not have multidex support";
        }
        Log.i("MultiDex", stringbuilder.append(s).toString());
        return flag;
        NumberFormatException numberformatexception;
        numberformatexception;
        flag = flag1;
        if (true) goto _L2; else goto _L1
_L1:
    }

    private static boolean a(List list)
    {
        for (list = list.iterator(); list.hasNext();)
        {
            if (!android.support.multidex.b.a((File)list.next()))
            {
                return false;
            }
        }

        return true;
    }

    private static ApplicationInfo b(Context context)
        throws android.content.pm.PackageManager.NameNotFoundException
    {
        PackageManager packagemanager;
        try
        {
            packagemanager = context.getPackageManager();
            context = context.getPackageName();
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            Log.w("MultiDex", "Failure while trying to obtain ApplicationInfo from Context. Must be running in test mode. Skip patching.", context);
            return null;
        }
        if (packagemanager == null || context == null)
        {
            return null;
        } else
        {
            return packagemanager.getApplicationInfo(context, 128);
        }
    }

    private static Field b(Object obj, String s)
        throws NoSuchFieldException
    {
        Class class1 = obj.getClass();
_L2:
        if (class1 == null)
        {
            break; /* Loop/switch isn't completed */
        }
        Field field;
        field = class1.getDeclaredField(s);
        if (!field.isAccessible())
        {
            field.setAccessible(true);
        }
        return field;
        NoSuchFieldException nosuchfieldexception;
        nosuchfieldexception;
        class1 = class1.getSuperclass();
        if (true) goto _L2; else goto _L1
_L1:
        throw new NoSuchFieldException((new StringBuilder()).append("Field ").append(s).append(" not found in ").append(obj.getClass()).toString());
    }

    private static transient Method b(Object obj, String s, Class aclass[])
        throws NoSuchMethodException
    {
        Class class1 = obj.getClass();
_L2:
        if (class1 == null)
        {
            break; /* Loop/switch isn't completed */
        }
        Method method;
        method = class1.getDeclaredMethod(s, aclass);
        if (!method.isAccessible())
        {
            method.setAccessible(true);
        }
        return method;
        NoSuchMethodException nosuchmethodexception;
        nosuchmethodexception;
        class1 = class1.getSuperclass();
        if (true) goto _L2; else goto _L1
_L1:
        throw new NoSuchMethodException((new StringBuilder()).append("Method ").append(s).append(" with parameters ").append(Arrays.asList(aclass)).append(" not found in ").append(obj.getClass()).toString());
    }

    private static void b(Object obj, String s, Object aobj[])
        throws NoSuchFieldException, IllegalArgumentException, IllegalAccessException
    {
        s = b(obj, s);
        Object aobj1[] = (Object[])(Object[])s.get(obj);
        Object aobj2[] = (Object[])(Object[])Array.newInstance(((Object) (aobj1)).getClass().getComponentType(), aobj1.length + aobj.length);
        System.arraycopy(((Object) (aobj1)), 0, ((Object) (aobj2)), 0, aobj1.length);
        System.arraycopy(((Object) (aobj)), 0, ((Object) (aobj2)), aobj1.length, aobj.length);
        s.set(obj, ((Object) (aobj2)));
    }

    private static void c(Context context)
        throws Exception
    {
        File afile[];
label0:
        {
            context = new File(context.getFilesDir(), "secondary-dexes");
            if (context.isDirectory())
            {
                Log.i("MultiDex", (new StringBuilder()).append("Clearing old secondary dex dir (").append(context.getPath()).append(").").toString());
                afile = context.listFiles();
                if (afile != null)
                {
                    break label0;
                }
                Log.w("MultiDex", (new StringBuilder()).append("Failed to list secondary dex dir content (").append(context.getPath()).append(").").toString());
            }
            return;
        }
        int j = afile.length;
        int i = 0;
        while (i < j) 
        {
            File file = afile[i];
            Log.i("MultiDex", (new StringBuilder()).append("Trying to delete old file ").append(file.getPath()).append(" of size ").append(file.length()).toString());
            if (!file.delete())
            {
                Log.w("MultiDex", (new StringBuilder()).append("Failed to delete old file ").append(file.getPath()).toString());
            } else
            {
                Log.i("MultiDex", (new StringBuilder()).append("Deleted old file ").append(file.getPath()).toString());
            }
            i++;
        }
        if (!context.delete())
        {
            Log.w("MultiDex", (new StringBuilder()).append("Failed to delete secondary dex dir ").append(context.getPath()).toString());
            return;
        } else
        {
            Log.i("MultiDex", (new StringBuilder()).append("Deleted old secondary dex dir ").append(context.getPath()).toString());
            return;
        }
    }

    static 
    {
        a = (new StringBuilder()).append("code_cache").append(File.separator).append("secondary-dexes").toString();
    }
}
