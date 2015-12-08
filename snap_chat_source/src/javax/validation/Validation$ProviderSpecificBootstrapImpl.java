// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package javax.validation;

import java.util.Iterator;
import java.util.List;
import javax.validation.bootstrap.ProviderSpecificBootstrap;
import javax.validation.spi.ValidationProvider;

// Referenced classes of package javax.validation:
//            Validation, ValidationException, ValidationProviderResolver, Configuration

static final class validationProviderClass
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
        Object obj = new validationProviderClass((byte)0);
        if (resolver == null)
        {
            resolver = ((resolver) (obj)).tValidationProviderResolver();
        } else
        {
            obj.tValidationProviderResolver = resolver;
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

    public (Class class1)
    {
        validationProviderClass = class1;
    }
}
