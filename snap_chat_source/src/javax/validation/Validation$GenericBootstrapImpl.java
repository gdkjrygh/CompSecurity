// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package javax.validation;

import java.util.List;
import javax.validation.bootstrap.GenericBootstrap;
import javax.validation.spi.BootstrapState;
import javax.validation.spi.ValidationProvider;

// Referenced classes of package javax.validation:
//            Validation, ValidationException, ValidationProviderResolver, Configuration

static final class <init>
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
            defaultResolver = new iderResolver((byte)0);
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

    private iderResolver()
    {
    }

    iderResolver(byte byte0)
    {
        this();
    }
}
