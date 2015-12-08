// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package roboguice.inject;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.inject.Injector;
import com.google.inject.Key;
import com.google.inject.MembersInjector;
import com.google.inject.Provider;
import com.google.inject.util.Types;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.Map;
import roboguice.RoboGuice;

// Referenced classes of package roboguice.inject:
//            ExtrasListener, ExtraConverter, InjectExtra, Nullable

protected static class annotation
    implements MembersInjector
{

    protected InjectExtra annotation;
    protected Provider contextProvider;
    protected Field field;

    protected Object convert(Field field1, Object obj, Injector injector)
    {
        if (obj == null || field1.getType().isPrimitive())
        {
            return obj;
        }
        Key key = Key.get(Types.newParameterizedType(roboguice/inject/ExtraConverter, new Type[] {
            obj.getClass(), field1.getType()
        }));
        field1 = ((Field) (obj));
        if (injector.getBindings().containsKey(key))
        {
            field1 = ((Field) (((ExtraConverter)injector.getInstance(key)).convert(obj)));
        }
        return field1;
    }

    public void injectMembers(Object obj)
    {
        Object obj1 = (Context)contextProvider.get();
        if (!(obj1 instanceof Activity))
        {
            throw new UnsupportedOperationException(String.format("Extras may not be injected into contexts that are not Activities (error in class %s)", new Object[] {
                ((Context)contextProvider.get()).getClass().getSimpleName()
            }));
        }
        obj1 = (Activity)obj1;
        Object obj2 = annotation.value();
        Bundle bundle = ((Activity) (obj1)).getIntent().getExtras();
        if (bundle == null || !bundle.containsKey(((String) (obj2))))
        {
            if (annotation.optional())
            {
                return;
            } else
            {
                throw new IllegalStateException(String.format("Can't find the mandatory extra identified by key [%s] on field %s.%s", new Object[] {
                    obj2, field.getDeclaringClass(), field.getName()
                }));
            }
        }
        obj2 = bundle.get(((String) (obj2)));
        obj1 = convert(field, obj2, RoboGuice.getBaseApplicationInjector(((Activity) (obj1)).getApplication()));
        if (obj1 == null && Nullable.notNullable(field))
        {
            throw new NullPointerException(String.format("Can't inject null value into %s.%s when field is not @Nullable", new Object[] {
                field.getDeclaringClass(), field.getName()
            }));
        }
        field.setAccessible(true);
        try
        {
            field.set(obj, obj1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw new RuntimeException(((Throwable) (obj)));
        }
        // Misplaced declaration of an exception variable
        catch (Object obj) { }
        if (obj1 != null)
        {
            obj = obj1.getClass();
        } else
        {
            obj = "(null)";
        }
        throw new IllegalArgumentException(String.format("Can't assign %s value %s to %s field %s", new Object[] {
            obj, obj1, field.getType(), field.getName()
        }));
    }

    public (Field field1, Provider provider, InjectExtra injectextra)
    {
        field = field1;
        contextProvider = provider;
        annotation = injectextra;
    }
}
