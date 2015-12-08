// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.splunk.mint.network.util;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.splunk.mint.network.util:
//            DelegationException, ReflectionUtil

public class Delegator
{
    public class DelegatorMethodFinder
    {

        private final Method method;
        final Delegator this$0;

        public transient Object invoke(Object aobj[])
        {
            return invoke0(method, aobj);
        }

        public transient DelegatorMethodFinder(String s, Class aclass[])
        {
            this$0 = Delegator.this;
            super();
            try
            {
                method = superclass.getDeclaredMethod(s, aclass);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Delegator delegator)
            {
                throw Delegator.this;
            }
            // Misplaced declaration of an exception variable
            catch (Delegator delegator)
            {
                throw new DelegationException(Delegator.this);
            }
        }
    }


    private final Object _flddelegate;
    private final Object source;
    private final Class superclass;

    public Delegator(Object obj, Class class1, Object obj1)
    {
        source = obj;
        superclass = class1;
        _flddelegate = obj1;
    }

    public Delegator(Object obj, Class class1, String s)
    {
        try
        {
            source = obj;
            superclass = class1;
            obj = Class.forName(s).getDeclaredConstructor(new Class[0]);
            ((Constructor) (obj)).setAccessible(true);
            _flddelegate = ((Constructor) (obj)).newInstance(new Object[0]);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw obj;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw new DelegationException("Could not make delegate object", ((Throwable) (obj)));
        }
    }

    private Class convertPrimitiveClass(Class class1)
    {
        Object obj = class1;
        if (class1.isPrimitive())
        {
            if (class1 == Integer.TYPE)
            {
                obj = java/lang/Integer;
            } else
            {
                if (class1 == Boolean.TYPE)
                {
                    return java/lang/Boolean;
                }
                if (class1 == Float.TYPE)
                {
                    return java/lang/Float;
                }
                if (class1 == Long.TYPE)
                {
                    return java/lang/Long;
                }
                if (class1 == Double.TYPE)
                {
                    return java/lang/Double;
                }
                if (class1 == Short.TYPE)
                {
                    return java/lang/Short;
                }
                if (class1 == Byte.TYPE)
                {
                    return java/lang/Byte;
                }
                obj = class1;
                if (class1 == Character.TYPE)
                {
                    return java/lang/Character;
                }
            }
        }
        return ((Class) (obj));
    }

    private String extractMethodName()
    {
        return (new Throwable()).getStackTrace()[2].getMethodName();
    }

    private Method findMethod(String s, Object aobj[])
        throws NoSuchMethodException
    {
        Class class1 = superclass;
        if (aobj.length == 0)
        {
            aobj = class1.getDeclaredMethod(s, new Class[0]);
        } else
        {
            Method method = null;
            Iterator iterator = ReflectionUtil.getAllMethods(class1).iterator();
label0:
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                Method method1 = (Method)iterator.next();
                if (!method1.getName().equals(s))
                {
                    continue;
                }
                Class aclass[] = method1.getParameterTypes();
                if (aclass.length != aobj.length)
                {
                    continue;
                }
                for (int i = 0; i < aclass.length; i++)
                {
                    if (!convertPrimitiveClass(aclass[i]).isInstance(aobj[i]))
                    {
                        continue label0;
                    }
                }

                if (method == null)
                {
                    method = method1;
                } else
                {
                    throw new DelegationException("Duplicate matches");
                }
            } while (true);
            aobj = method;
            if (method == null)
            {
                throw new DelegationException((new StringBuilder()).append("Could not find method: ").append(s).toString());
            }
        }
        return ((Method) (aobj));
    }

    private Object invoke0(Method method, Object aobj[])
    {
        try
        {
            writeFields(superclass, source, _flddelegate);
            method.setAccessible(true);
            method = ((Method) (method.invoke(_flddelegate, aobj)));
            writeFields(superclass, _flddelegate, source);
        }
        // Misplaced declaration of an exception variable
        catch (Method method)
        {
            throw method;
        }
        // Misplaced declaration of an exception variable
        catch (Method method)
        {
            throw new DelegationException(method.getCause());
        }
        // Misplaced declaration of an exception variable
        catch (Method method)
        {
            throw new DelegationException(method);
        }
        return method;
    }

    private void writeFields(Class class1, Object obj, Object obj1)
        throws Exception
    {
        class1 = class1.getDeclaredFields();
        int j = class1.length;
        for (int i = 0; i < j; i++)
        {
            Field field = class1[i];
            field.setAccessible(true);
            field.set(obj1, field.get(obj));
        }

    }

    public transient DelegatorMethodFinder delegateTo(String s, Class aclass[])
    {
        return new DelegatorMethodFinder(s, aclass);
    }

    public final transient Object invoke(Object aobj[])
    {
        try
        {
            aobj = ((Object []) (invoke0(findMethod(extractMethodName(), aobj), aobj)));
        }
        // Misplaced declaration of an exception variable
        catch (Object aobj[])
        {
            throw new DelegationException(((Throwable) (aobj)));
        }
        return ((Object) (aobj));
    }


}
