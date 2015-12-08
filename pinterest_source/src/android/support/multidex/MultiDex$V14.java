// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.multidex;

import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package android.support.multidex:
//            MultiDex

final class 
{

    private static void install(ClassLoader classloader, List list, File file)
    {
        classloader = ((ClassLoader) (MultiDex.access$300(classloader, "pathList").get(classloader)));
        MultiDex.access$400(classloader, "dexElements", makeDexElements(classloader, new ArrayList(list), file));
    }

    private static Object[] makeDexElements(Object obj, ArrayList arraylist, File file)
    {
        return (Object[])MultiDex.access$500(obj, "makeDexElements", new Class[] {
            java/util/ArrayList, java/io/File
        }).invoke(obj, new Object[] {
            arraylist, file
        });
    }


    private ()
    {
    }
}
