// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package javax.validation;

import java.lang.ref.SoftReference;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;
import java.util.WeakHashMap;
import javax.validation.spi.ValidationProvider;

// Referenced classes of package javax.validation:
//            Validation

static final class r
    implements PrivilegedAction
{

    private static final WeakHashMap providersPerClassloader = new WeakHashMap();

    private void cacheValidationProviders(ClassLoader classloader, List list)
    {
        this;
        JVM INSTR monitorenter ;
        providersPerClassloader.put(classloader, new SoftReference(list));
        this;
        JVM INSTR monitorexit ;
        return;
        classloader;
        throw classloader;
    }

    private List getCachedValidationProviders(ClassLoader classloader)
    {
        this;
        JVM INSTR monitorenter ;
        classloader = (SoftReference)providersPerClassloader.get(classloader);
        if (classloader == null) goto _L2; else goto _L1
_L1:
        classloader = (List)classloader.get();
_L4:
        this;
        JVM INSTR monitorexit ;
        return classloader;
_L2:
        classloader = null;
        if (true) goto _L4; else goto _L3
_L3:
        classloader;
        throw classloader;
    }

    public static List getValidationProviderList()
    {
        providersPerClassloader providersperclassloader = new <init>();
        if (System.getSecurityManager() != null)
        {
            return (List)AccessController.doPrivileged(providersperclassloader);
        } else
        {
            return providersperclassloader.run();
        }
    }

    private static List loadProviders(ClassLoader classloader)
    {
        classloader = ServiceLoader.load(javax/validation/spi/ValidationProvider, classloader).iterator();
        ArrayList arraylist = new ArrayList();
        while (classloader.hasNext()) 
        {
            try
            {
                arraylist.add(classloader.next());
            }
            catch (ServiceConfigurationError serviceconfigurationerror) { }
        }
        return arraylist;
    }

    private List run()
    {
        List list;
        ClassLoader classloader;
        classloader = Thread.currentThread().getContextClassLoader();
        list = getCachedValidationProviders(classloader);
        if (list == null) goto _L2; else goto _L1
_L1:
        return list;
_L2:
        List list1 = loadProviders(classloader);
        list = list1;
        if (!list1.isEmpty())
        {
            break; /* Loop/switch isn't completed */
        }
        classloader = javax/validation/Validation$DefaultValidationProviderResolver.getClassLoader();
        list1 = getCachedValidationProviders(classloader);
        list = list1;
        if (list1 != null)
        {
            continue; /* Loop/switch isn't completed */
        }
        list = loadProviders(classloader);
        break; /* Loop/switch isn't completed */
        if (true) goto _L1; else goto _L3
_L3:
        cacheValidationProviders(classloader, list);
        return list;
    }

    public final volatile Object run()
    {
        return run();
    }


    private r()
    {
    }
}
