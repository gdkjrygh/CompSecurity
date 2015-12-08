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
import javax.validation.bootstrap.GenericBootstrap;
import javax.validation.bootstrap.ProviderSpecificBootstrap;
import javax.validation.spi.BootstrapState;
import javax.validation.spi.ValidationProvider;

// Referenced classes of package javax.validation:
//            Configuration, ValidatorFactory, ValidationProviderResolver, ValidationException

public final class Validation
{
    static class DefaultValidationProviderResolver
        implements ValidationProviderResolver
    {

        public final List getValidationProviders()
        {
            return GetValidationProviderListAction.getValidationProviderList();
        }

        private DefaultValidationProviderResolver()
        {
        }

        DefaultValidationProviderResolver(byte byte0)
        {
            this();
        }
    }

    static final class GenericBootstrapImpl
        implements GenericBootstrap, BootstrapState
    {

        private ValidationProviderResolver defaultResolver;
        ValidationProviderResolver resolver;

        public final Configuration configure()
        {
            Object obj;
            List list;
            if (resolver == null)
            {
                obj = getDefaultValidationProviderResolver();
            } else
            {
                obj = resolver;
            }
            try
            {
                list = ((ValidationProviderResolver) (obj)).getValidationProviders();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                throw obj;
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                throw new ValidationException("Unable to get available provider resolvers.", ((Throwable) (obj)));
            }
            if (list.size() == 0)
            {
                throw new ValidationException("Unable to create a Configuration, because no Bean Validation provider could be found. Add a provider like Hibernate Validator (RI) to your classpath.");
            }
            try
            {
                obj = ((ValidationProvider)((ValidationProviderResolver) (obj)).getValidationProviders().get(0)).createGenericConfiguration$6e4efa3();
            }
            catch (RuntimeException runtimeexception)
            {
                throw new ValidationException("Unable to instantiate Configuration.", runtimeexception);
            }
            return ((Configuration) (obj));
        }

        public final ValidationProviderResolver getDefaultValidationProviderResolver()
        {
            if (defaultResolver == null)
            {
                defaultResolver = new DefaultValidationProviderResolver((byte)0);
            }
            return defaultResolver;
        }

        public final ValidationProviderResolver getValidationProviderResolver()
        {
            return resolver;
        }

        public final GenericBootstrap providerResolver(ValidationProviderResolver validationproviderresolver)
        {
            resolver = validationproviderresolver;
            return this;
        }

        private GenericBootstrapImpl()
        {
        }

        GenericBootstrapImpl(byte byte0)
        {
            this();
        }
    }

    static final class GetValidationProviderListAction
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
            GetValidationProviderListAction getvalidationproviderlistaction = new GetValidationProviderListAction();
            if (System.getSecurityManager() != null)
            {
                return (List)AccessController.doPrivileged(getvalidationproviderlistaction);
            } else
            {
                return getvalidationproviderlistaction.run();
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


        private GetValidationProviderListAction()
        {
        }
    }

    static final class ProviderSpecificBootstrapImpl
        implements ProviderSpecificBootstrap
    {

        private ValidationProviderResolver resolver;
        private final Class validationProviderClass;

        public final Configuration configure()
        {
            if (validationProviderClass == null)
            {
                throw new ValidationException("builder is mandatory. Use Validation.byDefaultProvider() to use the generic provider discovery mechanism");
            }
            Object obj = new GenericBootstrapImpl((byte)0);
            if (resolver == null)
            {
                resolver = ((GenericBootstrapImpl) (obj)).getDefaultValidationProviderResolver();
            } else
            {
                obj.resolver = resolver;
            }
            try
            {
                obj = resolver.getValidationProviders();
            }
            catch (RuntimeException runtimeexception)
            {
                throw new ValidationException("Unable to get available provider resolvers.", runtimeexception);
            }
            for (obj = ((List) (obj)).iterator(); ((Iterator) (obj)).hasNext();)
            {
                ValidationProvider validationprovider = (ValidationProvider)((Iterator) (obj)).next();
                if (validationProviderClass.isAssignableFrom(validationprovider.getClass()))
                {
                    return ((ValidationProvider)validationProviderClass.cast(validationprovider)).createSpecializedConfiguration$6e4efa3();
                }
            }

            throw new ValidationException((new StringBuilder("Unable to find provider: ")).append(validationProviderClass).toString());
        }

        public final ProviderSpecificBootstrap providerResolver(ValidationProviderResolver validationproviderresolver)
        {
            resolver = validationproviderresolver;
            return this;
        }

        public ProviderSpecificBootstrapImpl(Class class1)
        {
            validationProviderClass = class1;
        }
    }


    public Validation()
    {
    }

    private static ValidatorFactory buildDefaultValidatorFactory()
    {
        return (new GenericBootstrapImpl((byte)0)).configure().buildValidatorFactory();
    }

    private static GenericBootstrap byDefaultProvider()
    {
        return new GenericBootstrapImpl((byte)0);
    }

    private static ProviderSpecificBootstrap byProvider(Class class1)
    {
        return new ProviderSpecificBootstrapImpl(class1);
    }
}
