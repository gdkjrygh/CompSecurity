// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package fs.org.simpleframework.xml.core;

import fs.org.simpleframework.xml.Default;
import fs.org.simpleframework.xml.Namespace;
import fs.org.simpleframework.xml.NamespaceList;
import fs.org.simpleframework.xml.Order;
import fs.org.simpleframework.xml.Root;
import java.lang.reflect.Method;
import java.util.Map;

// Referenced classes of package fs.org.simpleframework.xml.core:
//            ConstructorScanner, NamespaceDecorator, Commit, Complete, 
//            Function, Persist, Replace, Resolve, 
//            Validate, Creator, Decorator

class ClassScanner
{

    private Default access;
    private Function commit;
    private Function complete;
    private NamespaceDecorator decorator;
    private Namespace namespace;
    private Order order;
    private Function persist;
    private Function replace;
    private Function resolve;
    private Root root;
    private ConstructorScanner scanner;
    private Function validate;

    public ClassScanner(Class class1)
        throws Exception
    {
        scanner = new ConstructorScanner(class1);
        decorator = new NamespaceDecorator();
        scan(class1);
    }

    private void access(Class class1)
    {
        if (class1.isAnnotationPresent(fs/org/simpleframework/xml/Default))
        {
            access = (Default)class1.getAnnotation(fs/org/simpleframework/xml/Default);
        }
    }

    private void commit(Method method)
    {
        if (method.getAnnotation(fs/org/simpleframework/xml/core/Commit) != null)
        {
            commit = getFunction(method);
        }
    }

    private void complete(Method method)
    {
        if (method.getAnnotation(fs/org/simpleframework/xml/core/Complete) != null)
        {
            complete = getFunction(method);
        }
    }

    private Function getFunction(Method method)
    {
        boolean flag = isContextual(method);
        if (!method.isAccessible())
        {
            method.setAccessible(true);
        }
        return new Function(method, flag);
    }

    private void global(Class class1)
        throws Exception
    {
        if (namespace == null)
        {
            namespace(class1);
        }
        if (root == null)
        {
            root(class1);
        }
        if (order == null)
        {
            order(class1);
        }
        if (access == null)
        {
            access(class1);
        }
    }

    private boolean isContextual(Method method)
    {
        boolean flag = false;
        method = method.getParameterTypes();
        if (method.length == 1)
        {
            flag = java/util/Map.equals(method[0]);
        }
        return flag;
    }

    private void namespace(Class class1)
    {
        if (class1.isAnnotationPresent(fs/org/simpleframework/xml/Namespace))
        {
            namespace = (Namespace)class1.getAnnotation(fs/org/simpleframework/xml/Namespace);
            if (namespace != null)
            {
                decorator.add(namespace);
            }
        }
    }

    private void order(Class class1)
    {
        if (class1.isAnnotationPresent(fs/org/simpleframework/xml/Order))
        {
            order = (Order)class1.getAnnotation(fs/org/simpleframework/xml/Order);
        }
    }

    private void persist(Method method)
    {
        if (method.getAnnotation(fs/org/simpleframework/xml/core/Persist) != null)
        {
            persist = getFunction(method);
        }
    }

    private void process(Class class1)
        throws Exception
    {
        if (namespace != null)
        {
            decorator.set(namespace);
        }
    }

    private void replace(Method method)
    {
        if (method.getAnnotation(fs/org/simpleframework/xml/core/Replace) != null)
        {
            replace = getFunction(method);
        }
    }

    private void resolve(Method method)
    {
        if (method.getAnnotation(fs/org/simpleframework/xml/core/Resolve) != null)
        {
            resolve = getFunction(method);
        }
    }

    private void root(Class class1)
    {
        if (class1.isAnnotationPresent(fs/org/simpleframework/xml/Root))
        {
            root = (Root)class1.getAnnotation(fs/org/simpleframework/xml/Root);
        }
    }

    private void scan(Class class1)
        throws Exception
    {
        for (Class class2 = class1; class2 != null; class2 = class2.getSuperclass())
        {
            global(class2);
            scope(class2);
            scan(class1, class2);
        }

        process(class1);
    }

    private void scan(Class class1, Class class2)
        throws Exception
    {
        class1 = class2.getDeclaredMethods();
        for (int i = 0; i < class1.length; i++)
        {
            scan(class1[i]);
        }

    }

    private void scan(Method method)
    {
        if (commit == null)
        {
            commit(method);
        }
        if (validate == null)
        {
            validate(method);
        }
        if (persist == null)
        {
            persist(method);
        }
        if (complete == null)
        {
            complete(method);
        }
        if (replace == null)
        {
            replace(method);
        }
        if (resolve == null)
        {
            resolve(method);
        }
    }

    private void scope(Class class1)
    {
        if (class1.isAnnotationPresent(fs/org/simpleframework/xml/NamespaceList))
        {
            class1 = ((NamespaceList)class1.getAnnotation(fs/org/simpleframework/xml/NamespaceList)).value();
            int j = class1.length;
            for (int i = 0; i < j; i++)
            {
                Namespace namespace1 = class1[i];
                decorator.add(namespace1);
            }

        }
    }

    private void validate(Method method)
    {
        if (method.getAnnotation(fs/org/simpleframework/xml/core/Validate) != null)
        {
            validate = getFunction(method);
        }
    }

    public Function getCommit()
    {
        return commit;
    }

    public Function getComplete()
    {
        return complete;
    }

    public Creator getCreator()
    {
        return scanner.getCreator();
    }

    public Decorator getDecorator()
    {
        return decorator;
    }

    public Default getDefault()
    {
        return access;
    }

    public Order getOrder()
    {
        return order;
    }

    public Function getPersist()
    {
        return persist;
    }

    public Function getReplace()
    {
        return replace;
    }

    public Function getResolve()
    {
        return resolve;
    }

    public Root getRoot()
    {
        return root;
    }

    public Function getValidate()
    {
        return validate;
    }

    public boolean isStrict()
    {
        if (root != null)
        {
            return root.strict();
        } else
        {
            return true;
        }
    }
}
