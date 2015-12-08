// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.multidex;

import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package android.support.multidex:
//            MultiDex

final class 
{

    private static void install(ClassLoader classloader, List list, File file)
    {
        Object obj = MultiDex.access$300(classloader, "pathList").get(classloader);
        ArrayList arraylist = new ArrayList();
        MultiDex.access$400(obj, "dexElements", makeDexElements(obj, new ArrayList(list), file, arraylist));
        if (arraylist.size() > 0)
        {
            for (list = arraylist.iterator(); list.hasNext(); Log.w("MultiDex", "Exception in makeDexElement", (IOException)list.next())) { }
            file = MultiDex.access$300(classloader, "dexElementsSuppressedExceptions");
            IOException aioexception[] = (IOException[])file.get(classloader);
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
    {
        return (Object[])MultiDex.access$500(obj, "makeDexElements", new Class[] {
            java/util/ArrayList, java/io/File, java/util/ArrayList
        }).invoke(obj, new Object[] {
            arraylist, file, arraylist1
        });
    }


    private ()
    {
    }
}
