// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.a.c;

import com.kik.g.p;
import com.kik.g.s;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kik.a.d.r;
import kik.a.h.a;
import kik.a.h.j;
import org.c.b;
import org.c.c;

public final class f
{

    private static final b a = org.c.c.a("LinkResultCache");
    private final File b;
    private final int c = 100;
    private final HashMap d = new a();
    private int e;

    public f(File file)
    {
        e = 0;
        b = file;
        c();
    }

    private static boolean a(p p1)
    {
        return p1 != null && (!p1.g() || p1.h() && a((r)p1.f()));
    }

    private static boolean a(r r1)
    {
        return r1 != null && r1.b() > j.b();
    }

    private void c()
    {
        Object obj2 = null;
        if (b.isFile() && b.exists()) goto _L2; else goto _L1
_L1:
        return;
_L2:
        Object obj = new FileInputStream(b);
        Object obj1 = new ObjectInputStream(((java.io.InputStream) (obj)));
        obj2 = (Map)((ObjectInputStream) (obj1)).readObject();
        ((FileInputStream) (obj)).close();
        ((ObjectInputStream) (obj1)).close();
        obj = ((Map) (obj2)).entrySet().iterator();
        while (((Iterator) (obj)).hasNext()) 
        {
            obj1 = (java.util.Map.Entry)((Iterator) (obj)).next();
            if (a((r)((java.util.Map.Entry) (obj1)).getValue()))
            {
                d.put(((java.util.Map.Entry) (obj1)).getKey(), s.a(((java.util.Map.Entry) (obj1)).getValue()));
            }
        }
        if (true) goto _L1; else goto _L3
_L3:
        obj;
        obj1 = null;
_L5:
        if (obj2 != null)
        {
            try
            {
                ((FileInputStream) (obj2)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                a.a("Failed to read cache");
                b.delete();
                return;
            }
        }
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_171;
        }
        ((ObjectInputStream) (obj1)).close();
        throw obj;
        Exception exception;
        exception;
        obj1 = null;
        obj2 = obj;
        obj = exception;
        continue; /* Loop/switch isn't completed */
        exception;
        obj2 = obj;
        obj = exception;
        if (true) goto _L5; else goto _L4
_L4:
    }

    public final p a(String s1)
    {
        p p1 = (p)d.get(s1);
        if (!a(p1))
        {
            d.remove(s1);
        }
        return p1;
    }

    public final void a()
    {
        d.clear();
        if (b.isFile() && b.exists())
        {
            b.delete();
        }
    }

    public final void a(Map map)
    {
        int i = e + 1;
        e = i;
        if (i >= 100)
        {
            e = 0;
            Iterator iterator = d.entrySet().iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                if (!a((p)((java.util.Map.Entry)iterator.next()).getValue()))
                {
                    iterator.remove();
                }
            } while (true);
        }
        d.putAll(map);
    }

    public final p b(String s1)
    {
        return (p)d.remove(s1);
    }

    public final void b()
    {
        Object obj1 = null;
        HashMap hashmap;
        boolean flag;
        hashmap = new HashMap();
        Iterator iterator = d.entrySet().iterator();
label0:
        do
        {
            java.util.Map.Entry entry;
            do
            {
                if (!iterator.hasNext())
                {
                    break label0;
                }
                entry = (java.util.Map.Entry)iterator.next();
            } while (!((p)entry.getValue()).h() || !a((r)((p)entry.getValue()).f()));
            hashmap.put(entry.getKey(), ((p)entry.getValue()).f());
        } while (hashmap.size() != c);
        flag = hashmap.isEmpty();
        if (flag)
        {
            return;
        }
        Object obj = new FileOutputStream(b);
        ObjectOutputStream objectoutputstream = new ObjectOutputStream(((java.io.OutputStream) (obj)));
        objectoutputstream.writeObject(hashmap);
        try
        {
            ((FileOutputStream) (obj)).close();
            objectoutputstream.close();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            a.a("Failed to write cache");
        }
        return;
        obj;
        objectoutputstream = null;
_L2:
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_193;
        }
        ((FileOutputStream) (obj1)).close();
        if (objectoutputstream == null)
        {
            break MISSING_BLOCK_LABEL_201;
        }
        objectoutputstream.close();
        throw obj;
        Exception exception;
        exception;
        objectoutputstream = null;
        obj1 = obj;
        obj = exception;
        continue; /* Loop/switch isn't completed */
        exception;
        obj1 = obj;
        obj = exception;
        if (true) goto _L2; else goto _L1
_L1:
    }

}
