// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ezvcard.util;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public abstract class CaseClasses
{

    protected final Class clazz;
    protected volatile Collection preDefined;
    protected Collection runtimeDefined;

    public CaseClasses(Class class1)
    {
        preDefined = null;
        runtimeDefined = null;
        clazz = class1;
    }

    private void checkInit()
    {
        if (preDefined != null)
        {
            break MISSING_BLOCK_LABEL_28;
        }
        this;
        JVM INSTR monitorenter ;
        if (preDefined == null)
        {
            init();
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    private void init()
    {
        Object obj;
        Field afield[];
        int i;
        int j;
        obj = new ArrayList();
        afield = clazz.getFields();
        j = afield.length;
        i = 0;
_L3:
        if (i >= j) goto _L2; else goto _L1
_L1:
        Object obj1 = afield[i];
        int k = ((Field) (obj1)).getModifiers();
        if (!Modifier.isStatic(k) || !Modifier.isPublic(k) || ((Field) (obj1)).getDeclaringClass() != clazz || ((Field) (obj1)).getType() != clazz)
        {
            continue; /* Loop/switch isn't completed */
        }
        try
        {
            obj1 = ((Field) (obj1)).get(null);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw new RuntimeException(((Throwable) (obj)));
        }
        if (obj1 == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        ((Collection) (obj)).add(clazz.cast(obj1));
        i++;
          goto _L3
_L2:
        runtimeDefined = new ArrayList(0);
        preDefined = Collections.unmodifiableCollection(((Collection) (obj)));
        return;
    }

    public Collection all()
    {
        checkInit();
        return preDefined;
    }

    protected abstract Object create(Object obj);

    public Object find(Object obj)
    {
        checkInit();
        for (Iterator iterator = preDefined.iterator(); iterator.hasNext();)
        {
            Object obj1 = iterator.next();
            if (matches(obj1, obj))
            {
                return obj1;
            }
        }

        return null;
    }

    public Object get(Object obj)
    {
label0:
        {
            Object obj1 = find(obj);
            if (obj1 != null)
            {
                return obj1;
            }
            Object obj2;
            synchronized (runtimeDefined)
            {
                Iterator iterator = runtimeDefined.iterator();
                do
                {
                    if (!iterator.hasNext())
                    {
                        break label0;
                    }
                    obj2 = iterator.next();
                } while (!matches(obj2, obj));
            }
            return obj2;
        }
        obj = create(obj);
        runtimeDefined.add(obj);
        collection;
        JVM INSTR monitorexit ;
        return obj;
        obj;
        collection;
        JVM INSTR monitorexit ;
        throw obj;
    }

    protected abstract boolean matches(Object obj, Object obj1);
}
