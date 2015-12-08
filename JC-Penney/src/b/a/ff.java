// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a;

import java.io.File;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public class ff
{

    public ff()
    {
    }

    public static File a()
    {
        Object obj1;
        ArrayList arraylist;
        ClassLoader classloader = b/a/ff.getClassLoader();
        obj1 = Class.forName("dalvik.system.PathClassLoader");
        ((Class) (obj1)).cast(classloader);
        obj1 = a(classloader, ((Class) (obj1)));
        arraylist = new ArrayList();
        Object obj = obj1;
        if (!((String) (obj1)).startsWith("dexPath=")) goto _L2; else goto _L1
_L1:
        int i = ((String) (obj1)).indexOf(',');
        if (i != -1) goto _L4; else goto _L3
_L3:
        obj = ((String) (obj1)).substring(8);
_L2:
        int l;
        obj = ((String) (obj)).split(":");
        l = obj.length;
        i = 0;
_L8:
        if (i >= l) goto _L6; else goto _L5
_L5:
        obj1 = obj[i];
        int j;
        int k;
        if (!((String) (obj1)).startsWith("/data/app/"))
        {
            break MISSING_BLOCK_LABEL_265;
        }
        j = ((String) (obj1)).lastIndexOf(".apk");
        if (j != ((String) (obj1)).length() - 4)
        {
            break MISSING_BLOCK_LABEL_265;
        }
        k = ((String) (obj1)).indexOf("-");
        if (k != -1)
        {
            j = k;
        }
        File afile[];
        try
        {
            obj1 = ((String) (obj1)).substring(10, j);
            obj1 = new File((new StringBuilder("/data/data/")).append(((String) (obj1))).toString());
            if (a(((File) (obj1))))
            {
                obj1 = new File(((File) (obj1)), "cache");
                if ((((File) (obj1)).exists() || ((File) (obj1)).mkdir()) && a(((File) (obj1))))
                {
                    arraylist.add(obj1);
                }
            }
            break MISSING_BLOCK_LABEL_265;
        }
        catch (ClassCastException classcastexception) { }
        catch (ClassNotFoundException classnotfoundexception) { }
          goto _L7
_L4:
        obj = ((String) (obj1)).substring(8, i);
          goto _L2
_L6:
        afile = (File[])arraylist.toArray(new File[arraylist.size()]);
        if (afile.length > 0)
        {
            afile = afile[0];
            return afile;
        }
_L7:
        return null;
        i++;
          goto _L8
    }

    private static String a(ClassLoader classloader, Class class1)
    {
        class1 = class1.getDeclaredField("path");
        class1.setAccessible(true);
        class1 = (String)class1.get(classloader);
_L2:
        return class1;
        class1;
_L3:
        classloader = classloader.toString();
        int i = classloader.lastIndexOf('[');
        if (i != -1)
        {
            classloader = classloader.substring(i + 1);
        }
        i = classloader.indexOf(']');
        class1 = classloader;
        if (i == -1) goto _L2; else goto _L1
_L1:
        return classloader.substring(0, i);
        class1;
          goto _L3
        class1;
          goto _L3
    }

    private static boolean a(File file)
    {
        return file.isDirectory() && file.canWrite();
    }
}
