// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.multidex;

import dalvik.system.DexFile;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.List;
import java.util.ListIterator;
import java.util.zip.ZipFile;

// Referenced classes of package android.support.multidex:
//            a

private static final class n
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

    private n()
    {
    }
}
