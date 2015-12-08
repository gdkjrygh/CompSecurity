// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class edz
    implements iwj
{

    private final Map a;

    public edz(Map map)
    {
        a = map;
    }

    public final Object a(Object obj)
    {
        obj = (List)obj;
        ArrayList arraylist = new ArrayList(((List) (obj)).size());
        HashMap hashmap = new HashMap(((List) (obj)).size());
        Iterator iterator = ((List) (obj)).iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            obj = (dum)iterator.next();
            Object obj1 = (dup)a.get(((dum) (obj)).d);
            if (obj1 == null)
            {
                if (Log.isLoggable("AssistantListTransform", 5))
                {
                    obj = String.valueOf(((dum) (obj)).d);
                    if (((String) (obj)).length() != 0)
                    {
                        obj = "No renderer for template ".concat(((String) (obj)));
                    } else
                    {
                        obj = new String("No renderer for template ");
                    }
                    Log.w("AssistantListTransform", ((String) (obj)));
                }
            } else
            {
                obj1 = ((dup) (obj1)).a(((dum) (obj)));
                if (obj1 != null)
                {
                    arraylist.add(obj1);
                    hashmap.put(Long.valueOf(((dum) (obj)).c), ((dum) (obj)).a);
                }
            }
        } while (true);
        return new eea(arraylist, hashmap);
    }
}
