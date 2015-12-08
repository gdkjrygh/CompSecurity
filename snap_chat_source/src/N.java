// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import dalvik.system.DexFile;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
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

public final class N
{
    static final class a
    {

        static void a(ClassLoader classloader, List list)
        {
            int i = list.size();
            Field field = N.a(classloader, "path");
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
            N.a(classloader, "mPaths", as);
            N.a(classloader, "mFiles", afile);
            N.a(classloader, "mZips", azipfile);
            N.a(classloader, "mDexs", adexfile);
        }
    }


    private static final String a;
    private static final Set b = new HashSet();
    private static final boolean c = a(System.getProperty("java.vm.version"));

    static Field a(Object obj, String s)
    {
        return b(obj, s);
    }

    private static transient Method a(Object obj, String s, Class aclass[])
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
        throw new NoSuchMethodException((new StringBuilder("Method ")).append(s).append(" with parameters ").append(Arrays.asList(aclass)).append(" not found in ").append(obj.getClass()).toString());
    }

    public static void a(Context context)
    {
        if (!c) goto _L2; else goto _L1
_L1:
        return;
_L2:
        ApplicationInfo applicationinfo;
        Object obj;
        if (android.os.Build.VERSION.SDK_INT < 4)
        {
            throw new RuntimeException((new StringBuilder("Multi dex installation failed. SDK ")).append(android.os.Build.VERSION.SDK_INT).append(" is unsupported. Min SDK version is 4.").toString());
        }
        try
        {
            applicationinfo = b(context);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw new RuntimeException((new StringBuilder("Multi dex installation failed (")).append(context.getMessage()).append(").").toString());
        }
        if (applicationinfo == null) goto _L1; else goto _L3
_L3:
        synchronized (b)
        {
            obj = applicationinfo.sourceDir;
            if (!b.contains(obj))
            {
                break MISSING_BLOCK_LABEL_118;
            }
        }
        return;
        context;
        set;
        JVM INSTR monitorexit ;
        throw context;
        b.add(obj);
        if (android.os.Build.VERSION.SDK_INT > 20)
        {
            (new StringBuilder("MultiDex is not guaranteed to work in SDK version ")).append(android.os.Build.VERSION.SDK_INT).append(": SDK version higher than 20 should be backed by runtime with built-in multidex capabilty but it's not the case here: java.vm.version=\"").append(System.getProperty("java.vm.version")).append("\"");
        }
        obj = context.getClassLoader();
        if (obj != null)
        {
            break MISSING_BLOCK_LABEL_186;
        }
        set;
        JVM INSTR monitorexit ;
        return;
        context;
        set;
        JVM INSTR monitorexit ;
        return;
        File file;
        List list;
        try
        {
            c(context);
        }
        catch (Throwable throwable) { }
        file = new File(applicationinfo.dataDir, a);
        list = O.a(context, applicationinfo, file, false);
        if (!a(list))
        {
            break MISSING_BLOCK_LABEL_235;
        }
        a(((ClassLoader) (obj)), file, list);
_L5:
        set;
        JVM INSTR monitorexit ;
        return;
label0:
        {
            context = O.a(context, applicationinfo, file, true);
            if (!a(((List) (context))))
            {
                break label0;
            }
            a(((ClassLoader) (obj)), file, ((List) (context)));
        }
        if (true) goto _L5; else goto _L4
_L4:
        throw new RuntimeException("Zip files were not valid.");
    }

    private static void a(ClassLoader classloader, File file, List list)
    {
label0:
        {
            if (!list.isEmpty())
            {
                if (android.os.Build.VERSION.SDK_INT < 19)
                {
                    break label0;
                }
                Object obj = b(classloader, "pathList").get(classloader);
                ArrayList arraylist = new ArrayList();
                list = new ArrayList(list);
                a(obj, "dexElements", (Object[])a(obj, "makeDexElements", new Class[] {
                    java/util/ArrayList, java/io/File, java/util/ArrayList
                }).invoke(obj, new Object[] {
                    list, file, arraylist
                }));
                if (arraylist.size() > 0)
                {
                    for (file = arraylist.iterator(); file.hasNext(); file.next()) { }
                    list = b(classloader, "dexElementsSuppressedExceptions");
                    IOException aioexception[] = (IOException[])list.get(classloader);
                    if (aioexception == null)
                    {
                        file = (IOException[])arraylist.toArray(new IOException[arraylist.size()]);
                    } else
                    {
                        file = new IOException[arraylist.size() + aioexception.length];
                        arraylist.toArray(file);
                        System.arraycopy(aioexception, 0, file, arraylist.size(), aioexception.length);
                    }
                    list.set(classloader, file);
                }
            }
            return;
        }
        if (android.os.Build.VERSION.SDK_INT >= 14)
        {
            classloader = ((ClassLoader) (b(classloader, "pathList").get(classloader)));
            list = new ArrayList(list);
            a(classloader, "dexElements", (Object[])a(classloader, "makeDexElements", new Class[] {
                java/util/ArrayList, java/io/File
            }).invoke(classloader, new Object[] {
                list, file
            }));
            return;
        } else
        {
            a.a(classloader, list);
            return;
        }
    }

    static void a(Object obj, String s, Object aobj[])
    {
        s = b(obj, s);
        Object aobj1[] = (Object[])s.get(obj);
        Object aobj2[] = (Object[])Array.newInstance(((Object) (aobj1)).getClass().getComponentType(), aobj1.length + aobj.length);
        System.arraycopy(((Object) (aobj1)), 0, ((Object) (aobj2)), 0, aobj1.length);
        System.arraycopy(((Object) (aobj)), 0, ((Object) (aobj2)), aobj1.length, aobj.length);
        s.set(obj, ((Object) (aobj2)));
    }

    private static boolean a(String s)
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
            if (j <= 0)
            {
                break MISSING_BLOCK_LABEL_76;
            }
        }
        flag = true;
_L2:
        StringBuilder stringbuilder = (new StringBuilder("VM with version ")).append(s);
        if (flag)
        {
            s = " has multidex support";
        } else
        {
            s = " does not have multidex support";
        }
        stringbuilder.append(s);
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
            if (!O.a((File)list.next()))
            {
                return false;
            }
        }

        return true;
    }

    private static ApplicationInfo b(Context context)
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
        throw new NoSuchFieldException((new StringBuilder("Field ")).append(s).append(" not found in ").append(obj.getClass()).toString());
    }

    private static void c(Context context)
    {
        File afile[];
label0:
        {
            context = new File(context.getFilesDir(), "secondary-dexes");
            if (context.isDirectory())
            {
                (new StringBuilder("Clearing old secondary dex dir (")).append(context.getPath()).append(").");
                afile = context.listFiles();
                if (afile != null)
                {
                    break label0;
                }
                (new StringBuilder("Failed to list secondary dex dir content (")).append(context.getPath()).append(").");
            }
            return;
        }
        int j = afile.length;
        int i = 0;
        while (i < j) 
        {
            File file = afile[i];
            (new StringBuilder("Trying to delete old file ")).append(file.getPath()).append(" of size ").append(file.length());
            if (!file.delete())
            {
                (new StringBuilder("Failed to delete old file ")).append(file.getPath());
            } else
            {
                (new StringBuilder("Deleted old file ")).append(file.getPath());
            }
            i++;
        }
        if (!context.delete())
        {
            (new StringBuilder("Failed to delete secondary dex dir ")).append(context.getPath());
            return;
        } else
        {
            (new StringBuilder("Deleted old secondary dex dir ")).append(context.getPath());
            return;
        }
    }

    static 
    {
        a = (new StringBuilder("code_cache")).append(File.separator).append("secondary-dexes").toString();
    }
}
