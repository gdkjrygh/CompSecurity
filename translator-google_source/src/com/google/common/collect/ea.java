// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.common.collect:
//            eb, de, dl

final class ea
{

    static eb a(Class class1, String s)
    {
        try
        {
            class1 = new eb(class1.getDeclaredField(s));
        }
        // Misplaced declaration of an exception variable
        catch (Class class1)
        {
            throw new AssertionError(class1);
        }
        return class1;
    }

    static void a(de de1, ObjectOutputStream objectoutputstream)
    {
        objectoutputstream.writeInt(de1.asMap().size());
        for (de1 = de1.asMap().entrySet().iterator(); de1.hasNext();)
        {
            Object obj = (java.util.Map.Entry)de1.next();
            objectoutputstream.writeObject(((java.util.Map.Entry) (obj)).getKey());
            objectoutputstream.writeInt(((Collection)((java.util.Map.Entry) (obj)).getValue()).size());
            obj = ((Collection)((java.util.Map.Entry) (obj)).getValue()).iterator();
            while (((Iterator) (obj)).hasNext()) 
            {
                objectoutputstream.writeObject(((Iterator) (obj)).next());
            }
        }

    }

    static void a(dl dl1, ObjectInputStream objectinputstream, int i)
    {
        for (int j = 0; j < i; j++)
        {
            dl1.add(objectinputstream.readObject(), objectinputstream.readInt());
        }

    }
}
