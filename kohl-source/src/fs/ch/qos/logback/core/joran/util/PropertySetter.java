// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package fs.ch.qos.logback.core.joran.util;

import fs.ch.qos.logback.core.joran.spi.DefaultClass;
import fs.ch.qos.logback.core.joran.spi.DefaultNestedComponentRegistry;
import fs.ch.qos.logback.core.spi.ContextAwareBase;
import fs.ch.qos.logback.core.util.AggregationType;
import fs.ch.qos.logback.core.util.PropertySetterException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

// Referenced classes of package fs.ch.qos.logback.core.joran.util:
//            StringToObjectConverter, Introspector, PropertyDescriptor, MethodDescriptor, 
//            IntrospectionException

public class PropertySetter extends ContextAwareBase
{

    protected MethodDescriptor methodDescriptors[];
    protected Object obj;
    protected Class objClass;
    protected PropertyDescriptor propertyDescriptors[];

    public PropertySetter(Object obj1)
    {
        obj = obj1;
        objClass = obj1.getClass();
    }

    private String capitalizeFirstLetter(String s)
    {
        return (new StringBuilder()).append(s.substring(0, 1).toUpperCase()).append(s.substring(1)).toString();
    }

    private AggregationType computeRawAggregationType(Method method)
    {
        method = getParameterClassForMethod(method);
        if (method == null)
        {
            return AggregationType.NOT_FOUND;
        }
        if (StringToObjectConverter.canBeBuiltFromSimpleString(method))
        {
            return AggregationType.AS_BASIC_PROPERTY;
        } else
        {
            return AggregationType.AS_COMPLEX_PROPERTY;
        }
    }

    private Method findAdderMethod(String s)
    {
        s = capitalizeFirstLetter(s);
        return getMethod((new StringBuilder()).append("add").append(s).toString());
    }

    private Method findSetterMethod(String s)
    {
        s = getPropertyDescriptor(Introspector.decapitalize(s));
        if (s != null)
        {
            return s.getWriteMethod();
        } else
        {
            return null;
        }
    }

    private Class getParameterClassForMethod(Method method)
    {
        if (method != null)
        {
            if ((method = method.getParameterTypes()).length == 1)
            {
                return method[0];
            }
        }
        return null;
    }

    private boolean isSanityCheckSuccessful(String s, Method method, Class aclass[], Object obj1)
    {
        method = obj1.getClass();
        if (aclass.length != 1)
        {
            addError((new StringBuilder()).append("Wrong number of parameters in setter method for property [").append(s).append("] in ").append(obj.getClass().getName()).toString());
            return false;
        }
        if (!aclass[0].isAssignableFrom(obj1.getClass()))
        {
            addError((new StringBuilder()).append("A \"").append(method.getName()).append("\" object is not assignable to a \"").append(aclass[0].getName()).append("\" variable.").toString());
            addError((new StringBuilder()).append("The class \"").append(aclass[0].getName()).append("\" was loaded by ").toString());
            addError((new StringBuilder()).append("[").append(aclass[0].getClassLoader()).append("] whereas object of type ").toString());
            addError((new StringBuilder()).append("\"").append(method.getName()).append("\" was loaded by [").append(method.getClassLoader()).append("].").toString());
            return false;
        } else
        {
            return true;
        }
    }

    private boolean isUnequivocallyInstantiable(Class class1)
    {
        if (!class1.isInterface())
        {
            try
            {
                class1 = ((Class) (class1.newInstance()));
            }
            // Misplaced declaration of an exception variable
            catch (Class class1)
            {
                return false;
            }
            // Misplaced declaration of an exception variable
            catch (Class class1)
            {
                return false;
            }
            if (class1 != null)
            {
                return true;
            }
        }
        return false;
    }

    public void addBasicProperty(String s, String s1)
    {
        if (s1 != null)
        {
            Object obj1 = capitalizeFirstLetter(s);
            Method method = findAdderMethod(((String) (obj1)));
            if (method == null)
            {
                addError((new StringBuilder()).append("No adder for property [").append(((String) (obj1))).append("].").toString());
                return;
            }
            s = method.getParameterTypes();
            isSanityCheckSuccessful(((String) (obj1)), method, s, s1);
            try
            {
                obj1 = StringToObjectConverter.convertArg(this, s1, s[0]);
            }
            // Misplaced declaration of an exception variable
            catch (String s1)
            {
                addError((new StringBuilder()).append("Conversion to type [").append(s[0]).append("] failed. ").toString(), s1);
                return;
            }
            if (obj1 != null)
            {
                invokeMethodWithSingleParameterOnThisObject(method, s1);
                return;
            }
        }
    }

    public void addComplexProperty(String s, Object obj1)
    {
        Method method = findAdderMethod(s);
        if (method != null)
        {
            if (!isSanityCheckSuccessful(s, method, method.getParameterTypes(), obj1))
            {
                return;
            } else
            {
                invokeMethodWithSingleParameterOnThisObject(method, obj1);
                return;
            }
        } else
        {
            addError((new StringBuilder()).append("Could not find method [add").append(s).append("] in class [").append(objClass.getName()).append("].").toString());
            return;
        }
    }

    public AggregationType computeAggregationType(String s)
    {
        Object obj1 = findAdderMethod(s);
        if (obj1 == null) goto _L2; else goto _L1
_L1:
        obj1 = computeRawAggregationType(((Method) (obj1)));
        static class _cls1
        {

            static final int $SwitchMap$ch$qos$logback$core$util$AggregationType[];

            static 
            {
                $SwitchMap$ch$qos$logback$core$util$AggregationType = new int[AggregationType.values().length];
                try
                {
                    $SwitchMap$ch$qos$logback$core$util$AggregationType[AggregationType.NOT_FOUND.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    $SwitchMap$ch$qos$logback$core$util$AggregationType[AggregationType.AS_BASIC_PROPERTY.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$ch$qos$logback$core$util$AggregationType[AggregationType.AS_COMPLEX_PROPERTY.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        _cls1..SwitchMap.ch.qos.logback.core.util.AggregationType[((AggregationType) (obj1)).ordinal()];
        JVM INSTR tableswitch 1 3: default 52
    //                   1 68
    //                   2 72
    //                   3 76;
           goto _L2 _L3 _L4 _L5
_L2:
        s = findSetterMethod(s);
        if (s != null)
        {
            return computeRawAggregationType(s);
        } else
        {
            return AggregationType.NOT_FOUND;
        }
_L3:
        return AggregationType.NOT_FOUND;
_L4:
        return AggregationType.AS_BASIC_PROPERTY_COLLECTION;
_L5:
        return AggregationType.AS_COMPLEX_PROPERTY_COLLECTION;
    }

    Annotation getAnnotation(String s, Class class1, Method method)
    {
        if (method != null)
        {
            return method.getAnnotation(class1);
        } else
        {
            return null;
        }
    }

    Class getByConcreteType(String s, Method method)
    {
        for (s = getParameterClassForMethod(method); s == null || !isUnequivocallyInstantiable(s);)
        {
            return null;
        }

        return s;
    }

    public Class getClassNameViaImplicitRules(String s, AggregationType aggregationtype, DefaultNestedComponentRegistry defaultnestedcomponentregistry)
    {
        defaultnestedcomponentregistry = defaultnestedcomponentregistry.findDefaultComponentType(obj.getClass(), s);
        if (defaultnestedcomponentregistry != null)
        {
            aggregationtype = defaultnestedcomponentregistry;
        } else
        {
            Method method = getRelevantMethod(s, aggregationtype);
            if (method == null)
            {
                return null;
            }
            defaultnestedcomponentregistry = getDefaultClassNameByAnnonation(s, method);
            aggregationtype = defaultnestedcomponentregistry;
            if (defaultnestedcomponentregistry == null)
            {
                return getByConcreteType(s, method);
            }
        }
        return aggregationtype;
    }

    Class getDefaultClassNameByAnnonation(String s, Method method)
    {
        s = (DefaultClass)getAnnotation(s, fs/ch/qos/logback/core/joran/spi/DefaultClass, method);
        if (s != null)
        {
            return s.value();
        } else
        {
            return null;
        }
    }

    protected Method getMethod(String s)
    {
        if (methodDescriptors == null)
        {
            introspect();
        }
        for (int i = 0; i < methodDescriptors.length; i++)
        {
            if (s.equals(methodDescriptors[i].getName()))
            {
                return methodDescriptors[i].getMethod();
            }
        }

        return null;
    }

    public Object getObj()
    {
        return obj;
    }

    protected PropertyDescriptor getPropertyDescriptor(String s)
    {
        if (propertyDescriptors == null)
        {
            introspect();
        }
        for (int i = 0; i < propertyDescriptors.length; i++)
        {
            if (s.equals(propertyDescriptors[i].getName()))
            {
                return propertyDescriptors[i];
            }
        }

        return null;
    }

    Method getRelevantMethod(String s, AggregationType aggregationtype)
    {
        s = capitalizeFirstLetter(s);
        if (aggregationtype == AggregationType.AS_COMPLEX_PROPERTY_COLLECTION)
        {
            return findAdderMethod(s);
        }
        if (aggregationtype == AggregationType.AS_COMPLEX_PROPERTY)
        {
            return findSetterMethod(s);
        } else
        {
            throw new IllegalStateException((new StringBuilder()).append(aggregationtype).append(" not allowed here").toString());
        }
    }

    protected void introspect()
    {
        try
        {
            propertyDescriptors = Introspector.getPropertyDescriptors(objClass);
            methodDescriptors = Introspector.getMethodDescriptors(objClass);
            return;
        }
        catch (IntrospectionException introspectionexception)
        {
            addError((new StringBuilder()).append("Failed to introspect ").append(obj).append(": ").append(introspectionexception.getMessage()).toString());
        }
        propertyDescriptors = new PropertyDescriptor[0];
        methodDescriptors = new MethodDescriptor[0];
    }

    void invokeMethodWithSingleParameterOnThisObject(Method method, Object obj1)
    {
        Class class1 = obj1.getClass();
        try
        {
            method.invoke(obj, new Object[] {
                obj1
            });
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj1)
        {
            addError((new StringBuilder()).append("Could not invoke method ").append(method.getName()).append(" in class ").append(obj.getClass().getName()).append(" with parameter of type ").append(class1.getName()).toString(), ((Throwable) (obj1)));
        }
    }

    public void setComplexProperty(String s, Object obj1)
    {
        Object obj2 = getPropertyDescriptor(Introspector.decapitalize(s));
        if (obj2 == null)
        {
            addWarn((new StringBuilder()).append("Could not find PropertyDescriptor for [").append(s).append("] in ").append(objClass.getName()).toString());
        } else
        {
            obj2 = ((PropertyDescriptor) (obj2)).getWriteMethod();
            if (obj2 == null)
            {
                addWarn((new StringBuilder()).append("Not setter method for property [").append(s).append("] in ").append(obj.getClass().getName()).toString());
                return;
            }
            if (isSanityCheckSuccessful(s, ((Method) (obj2)), ((Method) (obj2)).getParameterTypes(), obj1))
            {
                try
                {
                    invokeMethodWithSingleParameterOnThisObject(((Method) (obj2)), obj1);
                    return;
                }
                // Misplaced declaration of an exception variable
                catch (String s)
                {
                    addError((new StringBuilder()).append("Could not set component ").append(obj).append(" for parent component ").append(obj).toString(), s);
                }
                return;
            }
        }
    }

    public void setProperty(PropertyDescriptor propertydescriptor, String s, String s1)
        throws PropertySetterException
    {
        propertydescriptor = propertydescriptor.getWriteMethod();
        if (propertydescriptor == null)
        {
            throw new PropertySetterException((new StringBuilder()).append("No setter for property [").append(s).append("].").toString());
        }
        s = propertydescriptor.getParameterTypes();
        if (s.length != 1)
        {
            throw new PropertySetterException("#params for setter != 1");
        }
        try
        {
            s1 = ((String) (StringToObjectConverter.convertArg(this, s1, s[0])));
        }
        // Misplaced declaration of an exception variable
        catch (PropertyDescriptor propertydescriptor)
        {
            throw new PropertySetterException((new StringBuilder()).append("Conversion to type [").append(s[0]).append("] failed. ").toString(), propertydescriptor);
        }
        if (s1 == null)
        {
            throw new PropertySetterException((new StringBuilder()).append("Conversion to type [").append(s[0]).append("] failed.").toString());
        }
        try
        {
            propertydescriptor.invoke(obj, new Object[] {
                s1
            });
            return;
        }
        // Misplaced declaration of an exception variable
        catch (PropertyDescriptor propertydescriptor)
        {
            throw new PropertySetterException(propertydescriptor);
        }
    }

    public void setProperty(String s, String s1)
    {
        if (s1 == null)
        {
            return;
        }
        s = Introspector.decapitalize(s);
        PropertyDescriptor propertydescriptor = getPropertyDescriptor(s);
        if (propertydescriptor == null)
        {
            addWarn((new StringBuilder()).append("No such property [").append(s).append("] in ").append(objClass.getName()).append(".").toString());
            return;
        }
        try
        {
            setProperty(propertydescriptor, s, s1);
            return;
        }
        catch (PropertySetterException propertysetterexception)
        {
            addWarn((new StringBuilder()).append("Failed to set property [").append(s).append("] to value \"").append(s1).append("\". ").toString(), propertysetterexception);
        }
    }
}
