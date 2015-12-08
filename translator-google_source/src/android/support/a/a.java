// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.a;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
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
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Referenced classes of package android.support.a:
//            c, b

public final class a
{

    private static final Set a = new HashSet();
    private static final boolean b = a(System.getProperty("java.vm.version"));

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
        if (!b) goto _L2; else goto _L1
_L1:
        return;
_L2:
        if (android.os.Build.VERSION.SDK_INT < 4)
        {
            throw new RuntimeException((new StringBuilder("Multi dex installation failed. SDK ")).append(android.os.Build.VERSION.SDK_INT).append(" is unsupported. Min SDK version is 4.").toString());
        }
        PackageManager packagemanager;
        Object obj;
        Object obj1;
        File file;
        List list;
        try
        {
            packagemanager = context.getPackageManager();
            obj = context.getPackageName();
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw new RuntimeException((new StringBuilder("Multi dex installation failed (")).append(context.getMessage()).append(").").toString());
        }
        if (packagemanager == null || obj == null) goto _L1; else goto _L3
_L3:
        obj = packagemanager.getApplicationInfo(((String) (obj)), 128);
        if (obj == null) goto _L1; else goto _L4
_L4:
        synchronized (a)
        {
            obj1 = ((ApplicationInfo) (obj)).sourceDir;
            if (!a.contains(obj1))
            {
                break MISSING_BLOCK_LABEL_140;
            }
        }
        return;
        context;
        set;
        JVM INSTR monitorexit ;
        throw context;
        a.add(obj1);
        if (android.os.Build.VERSION.SDK_INT > 20)
        {
            (new StringBuilder("MultiDex is not guaranteed to work in SDK version ")).append(android.os.Build.VERSION.SDK_INT).append(": SDK version higher than 20 should be backed by runtime with built-in multidex capabilty but it's not the case here: java.vm.version=\"").append(System.getProperty("java.vm.version")).append("\"");
        }
        obj1 = context.getClassLoader();
        if (obj1 != null)
        {
            break MISSING_BLOCK_LABEL_208;
        }
        set;
        JVM INSTR monitorexit ;
        return;
        context;
        set;
        JVM INSTR monitorexit ;
        return;
        file = new File(context.getFilesDir(), "secondary-dexes");
        list = c.a(context, ((ApplicationInfo) (obj)), file, false);
        if (!a(list))
        {
            break MISSING_BLOCK_LABEL_252;
        }
        a(((ClassLoader) (obj1)), file, list);
_L6:
        set;
        JVM INSTR monitorexit ;
        return;
label0:
        {
            context = c.a(context, ((ApplicationInfo) (obj)), file, true);
            if (!a(((List) (context))))
            {
                break label0;
            }
            a(((ClassLoader) (obj1)), file, ((List) (context)));
        }
        if (true) goto _L6; else goto _L5
_L5:
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
                a(obj, "dexElements", (Object[])(Object[])a(obj, "makeDexElements", new Class[] {
                    java/util/ArrayList, java/io/File, java/util/ArrayList
                }).invoke(obj, new Object[] {
                    list, file, arraylist
                }));
                if (arraylist.size() > 0)
                {
                    for (file = arraylist.iterator(); file.hasNext(); file.next()) { }
                    list = b(classloader, "dexElementsSuppressedExceptions");
                    IOException aioexception[] = (IOException[])(IOException[])list.get(classloader);
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
            a(classloader, "dexElements", (Object[])(Object[])a(classloader, "makeDexElements", new Class[] {
                java/util/ArrayList, java/io/File
            }).invoke(classloader, new Object[] {
                list, file
            }));
            return;
        } else
        {
            android.support.a.b.a(classloader, list);
            return;
        }
    }

    static void a(Object obj, String s, Object aobj[])
    {
        s = b(obj, s);
        Object aobj1[] = (Object[])(Object[])s.get(obj);
        Object aobj2[] = (Object[])(Object[])Array.newInstance(((Object) (aobj1)).getClass().getComponentType(), aobj1.length + aobj.length);
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
            if (!c.a((File)list.next()))
            {
                return false;
            }
        }

        return true;
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

}
