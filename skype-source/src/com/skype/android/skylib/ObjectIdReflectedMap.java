// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.skylib;

import android.support.v4.util.e;
import com.skype.Message;
import com.skype.ObjectInterface;
import com.skype.SkyLib;
import com.skype.SkyLibImpl;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.logging.Logger;

// Referenced classes of package com.skype.android.skylib:
//            ObjectIdMap, ObjectInterfaceNotFoundException

public class ObjectIdReflectedMap
    implements ObjectIdMap
{
    private static final class a
    {

        com.skype.ObjectInterface.ObjectInterfaceIListener a;
        Method b;

        public a(Class class1)
            throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException
        {
            Object obj = class1.getName().substring(0, class1.getName().indexOf("Impl"));
            String s = class1.getSimpleName().substring(0, class1.getSimpleName().indexOf("Impl"));
            obj = Class.forName((new StringBuilder()).append(((String) (obj))).append("$").append(s).append("IListener").toString());
            a = (com.skype.ObjectInterface.ObjectInterfaceIListener)Class.forName((new StringBuilder("com.skype.android.gen.")).append(class1.getSimpleName().substring(0, class1.getSimpleName().indexOf("Impl"))).append("Listener").toString()).newInstance();
            b = class1.getMethod("addListener", new Class[] {
                obj
            });
        }
    }


    private static final Logger a = Logger.getLogger("ObjectIdReflectedMap");
    private Map b;
    private Map c;
    private SkyLib d;
    private e e;

    public ObjectIdReflectedMap(SkyLib skylib)
    {
        if (skylib == null)
        {
            throw new IllegalArgumentException("skylib instance must be provided");
        } else
        {
            d = skylib;
            c = new HashMap();
            b = new HashMap();
            e = new e(500);
            return;
        }
    }

    public final ObjectInterface a(int i)
    {
        return (ObjectInterface)e.a(Integer.valueOf(i));
    }

    public final ObjectInterface a(int i, Class class1)
    {
        Object obj;
        Object obj1;
        Class class2;
        if (i == 0)
        {
            throw new ObjectInterfaceNotFoundException("incoming objectId cannot be zero");
        }
        obj1 = a(i);
        obj = obj1;
        if (obj1 != null)
        {
            break MISSING_BLOCK_LABEL_293;
        }
        Method method;
        try
        {
            obj1 = class1.getName();
        }
        // Misplaced declaration of an exception variable
        catch (Class class1)
        {
            throw new ObjectInterfaceNotFoundException(class1);
        }
        obj = obj1;
        if (class1.isInterface())
        {
            obj = (new StringBuilder()).append(((String) (obj1))).append("Impl").toString();
        }
        obj1 = (ObjectInterface)Class.forName(((String) (obj))).newInstance();
        class2 = Class.forName(obj1.getClass().getName().substring(0, obj1.getClass().getName().indexOf("Impl")));
        if (!class2.equals(com/skype/Message)) goto _L2; else goto _L1
_L1:
        class1 = "getConversationMessage";
_L4:
        method = (Method)c.get(class1);
        obj = method;
        if (method != null)
        {
            break MISSING_BLOCK_LABEL_178;
        }
        obj = com/skype/SkyLibImpl.getMethod(class1, new Class[] {
            Integer.TYPE, class2
        });
        c.put(class1, obj);
        if (!((Boolean)((Method) (obj)).invoke(d, new Object[] {
    Integer.valueOf(i), obj1
})).booleanValue())
        {
            throw new ObjectInterfaceNotFoundException(String.format(Locale.US, "failed to get object of type %s with object id %d", new Object[] {
                obj1.getClass(), Integer.valueOf(i)
            }));
        }
        break; /* Loop/switch isn't completed */
_L2:
        class1 = (new StringBuilder("get")).append(class2.getSimpleName()).toString();
        if (true) goto _L4; else goto _L3
_L3:
        obj = obj1;
        a(((ObjectInterface) (obj)));
        b(((ObjectInterface) (obj)));
        return ((ObjectInterface) (obj));
    }

    public final void a()
    {
        a.info("clear()");
        e.a();
    }

    public final void a(ObjectInterface objectinterface)
    {
        Class class1 = objectinterface.getClass();
        a a1;
        a a2;
        try
        {
            a2 = (a)b.get(class1);
        }
        // Misplaced declaration of an exception variable
        catch (ObjectInterface objectinterface)
        {
            throw new RuntimeException(objectinterface);
        }
        a1 = a2;
        if (a2 != null)
        {
            break MISSING_BLOCK_LABEL_50;
        }
        a1 = new a(class1);
        b.put(class1, a1);
        objectinterface.addListener(a1.a);
        a1.b.invoke(objectinterface, new Object[] {
            a1.a
        });
        return;
    }

    public final void b(int i)
    {
        e.b(Integer.valueOf(i));
    }

    public final void b(ObjectInterface objectinterface)
    {
        if (objectinterface == null)
        {
            throw new IllegalArgumentException("object cannot be null");
        }
        int i = objectinterface.getObjectID();
        if (i == 0)
        {
            throw new IllegalArgumentException("object id is zero (uninitalized)");
        } else
        {
            e.a(Integer.valueOf(i), objectinterface);
            return;
        }
    }

}
