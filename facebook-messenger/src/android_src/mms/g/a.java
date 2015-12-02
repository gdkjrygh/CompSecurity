// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android_src.mms.g;

import java.util.HashMap;

// Referenced classes of package android_src.mms.g:
//            c

public abstract class a
{

    private final HashMap a = new HashMap();

    protected a()
    {
    }

    public Object a(Object obj)
    {
        if (obj != null)
        {
            obj = (c)a.get(obj);
            if (obj != null)
            {
                obj.a = ((c) (obj)).a + 1;
                return ((c) (obj)).b;
            }
        }
        return null;
    }

    public void a()
    {
        a.clear();
    }

    public boolean a(Object obj, Object obj1)
    {
        while (a.size() >= 500 || obj == null) 
        {
            return false;
        }
        c c1 = new c(null);
        c1.b = obj1;
        a.put(obj, c1);
        return true;
    }

    public Object b(Object obj)
    {
        obj = (c)a.remove(obj);
        if (obj != null)
        {
            return ((c) (obj)).b;
        } else
        {
            return null;
        }
    }
}
