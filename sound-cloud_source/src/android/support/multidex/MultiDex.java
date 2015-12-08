// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.multidex;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
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
//            MultiDexExtractor

public final class MultiDex
{
    private static final class V14
    {

        private static void install(ClassLoader classloader, List list, File file)
            throws IllegalArgumentException, IllegalAccessException, NoSuchFieldException, InvocationTargetException, NoSuchMethodException
        {
            classloader = ((ClassLoader) (MultiDex.findField(classloader, "pathList").get(classloader)));
            MultiDex.expandFieldArray(classloader, "dexElements", makeDexElements(classloader, new ArrayList(list), file));
        }

        private static Object[] makeDexElements(Object obj, ArrayList arraylist, File file)
            throws IllegalAccessException, InvocationTargetException, NoSuchMethodException
        {
            return (Object[])(Object[])MultiDex.findMethod(obj, "makeDexElements", new Class[] {
                java/util/ArrayList, java/io/File
            }).invoke(obj, new Object[] {
                arraylist, file
            });
        }


        private V14()
        {
        }
    }

    private static final class V19
    {

        private static void install(ClassLoader classloader, List list, File file)
            throws IllegalArgumentException, IllegalAccessException, NoSuchFieldException, InvocationTargetException, NoSuchMethodException
        {
            Object obj = MultiDex.findField(classloader, "pathList").get(classloader);
            ArrayList arraylist = new ArrayList();
            MultiDex.expandFieldArray(obj, "dexElements", makeDexElements(obj, new ArrayList(list), file, arraylist));
            if (arraylist.size() > 0)
            {
                for (list = arraylist.iterator(); list.hasNext(); list.next()) { }
                file = MultiDex.findField(classloader, "dexElementsSuppressedExceptions");
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

        private static Object[] makeDexElements(Object obj, ArrayList arraylist, File file, ArrayList arraylist1)
            throws IllegalAccessException, InvocationTargetException, NoSuchMethodException
        {
            return (Object[])(Object[])MultiDex.findMethod(obj, "makeDexElements", new Class[] {
                java/util/ArrayList, java/io/File, java/util/ArrayList
            }).invoke(obj, new Object[] {
                arraylist, file, arraylist1
            });
        }


        private V19()
        {
        }
    }

    private static final class V4
    {

        private static void install(ClassLoader classloader, List list)
            throws IllegalArgumentException, IllegalAccessException, NoSuchFieldException, IOException
        {
            int i = list.size();
            Field field = MultiDex.findField(classloader, "path");
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
            MultiDex.expandFieldArray(classloader, "mPaths", as);
            MultiDex.expandFieldArray(classloader, "mFiles", afile);
            MultiDex.expandFieldArray(classloader, "mZips", azipfile);
            MultiDex.expandFieldArray(classloader, "mDexs", adexfile);
        }


        private V4()
        {
        }
    }


    private static final boolean IS_VM_MULTIDEX_CAPABLE = isVMMultidexCapable(System.getProperty("java.vm.version"));
    private static final int MAX_SUPPORTED_SDK_VERSION = 20;
    private static final int MIN_SDK_VERSION = 4;
    private static final String OLD_SECONDARY_FOLDER_NAME = "secondary-dexes";
    private static final String SECONDARY_FOLDER_NAME;
    static final String TAG = "MultiDex";
    private static final int VM_WITH_MULTIDEX_VERSION_MAJOR = 2;
    private static final int VM_WITH_MULTIDEX_VERSION_MINOR = 1;
    private static final Set installedApk = new HashSet();

    private MultiDex()
    {
    }

    private static boolean checkValidZipFiles(List list)
    {
        for (list = list.iterator(); list.hasNext();)
        {
            if (!MultiDexExtractor.verifyZipFile((File)list.next()))
            {
                return false;
            }
        }

        return true;
    }

    private static void clearOldDexDir(Context context)
        throws Exception
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

    private static void expandFieldArray(Object obj, String s, Object aobj[])
        throws NoSuchFieldException, IllegalArgumentException, IllegalAccessException
    {
        s = findField(obj, s);
        Object aobj1[] = (Object[])(Object[])s.get(obj);
        Object aobj2[] = (Object[])(Object[])Array.newInstance(((Object) (aobj1)).getClass().getComponentType(), aobj1.length + aobj.length);
        System.arraycopy(((Object) (aobj1)), 0, ((Object) (aobj2)), 0, aobj1.length);
        System.arraycopy(((Object) (aobj)), 0, ((Object) (aobj2)), aobj1.length, aobj.length);
        s.set(obj, ((Object) (aobj2)));
    }

    private static Field findField(Object obj, String s)
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
        throw new NoSuchFieldException((new StringBuilder("Field ")).append(s).append(" not found in ").append(obj.getClass()).toString());
    }

    private static transient Method findMethod(Object obj, String s, Class aclass[])
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
        throw new NoSuchMethodException((new StringBuilder("Method ")).append(s).append(" with parameters ").append(Arrays.asList(aclass)).append(" not found in ").append(obj.getClass()).toString());
    }

    private static ApplicationInfo getApplicationInfo(Context context)
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

    public static void install(Context context)
    {
        if (!IS_VM_MULTIDEX_CAPABLE) goto _L2; else goto _L1
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
            applicationinfo = getApplicationInfo(context);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw new RuntimeException((new StringBuilder("Multi dex installation failed (")).append(context.getMessage()).append(").").toString());
        }
        if (applicationinfo == null) goto _L1; else goto _L3
_L3:
        synchronized (installedApk)
        {
            obj = applicationinfo.sourceDir;
            if (!installedApk.contains(obj))
            {
                break MISSING_BLOCK_LABEL_121;
            }
        }
        return;
        context;
        set;
        JVM INSTR monitorexit ;
        throw context;
        installedApk.add(obj);
        if (android.os.Build.VERSION.SDK_INT > 20)
        {
            (new StringBuilder("MultiDex is not guaranteed to work in SDK version ")).append(android.os.Build.VERSION.SDK_INT).append(": SDK version higher than 20 should be backed by runtime with built-in multidex capabilty but it's not the case here: java.vm.version=\"").append(System.getProperty("java.vm.version")).append("\"");
        }
        obj = context.getClassLoader();
        if (obj != null)
        {
            break MISSING_BLOCK_LABEL_192;
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
            clearOldDexDir(context);
        }
        catch (Throwable throwable) { }
        file = new File(applicationinfo.dataDir, SECONDARY_FOLDER_NAME);
        list = MultiDexExtractor.load(context, applicationinfo, file, false);
        if (!checkValidZipFiles(list))
        {
            break MISSING_BLOCK_LABEL_241;
        }
        installSecondaryDexes(((ClassLoader) (obj)), file, list);
_L5:
        set;
        JVM INSTR monitorexit ;
        return;
label0:
        {
            context = MultiDexExtractor.load(context, applicationinfo, file, true);
            if (!checkValidZipFiles(context))
            {
                break label0;
            }
            installSecondaryDexes(((ClassLoader) (obj)), file, context);
        }
        if (true) goto _L5; else goto _L4
_L4:
        throw new RuntimeException("Zip files were not valid.");
    }

    private static void installSecondaryDexes(ClassLoader classloader, File file, List list)
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
                V19.install(classloader, list, file);
            }
            return;
        }
        if (android.os.Build.VERSION.SDK_INT >= 14)
        {
            V14.install(classloader, list, file);
            return;
        } else
        {
            V4.install(classloader, list);
            return;
        }
    }

    static boolean isVMMultidexCapable(String s)
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

    static 
    {
        SECONDARY_FOLDER_NAME = (new StringBuilder("code_cache")).append(File.separator).append("secondary-dexes").toString();
    }



}
