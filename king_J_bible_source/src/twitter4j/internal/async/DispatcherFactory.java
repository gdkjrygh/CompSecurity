// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package twitter4j.internal.async;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import twitter4j.conf.Configuration;
import twitter4j.conf.ConfigurationContext;

// Referenced classes of package twitter4j.internal.async:
//            Dispatcher

public final class DispatcherFactory
{

    static Class class$twitter4j$conf$Configuration;
    private Configuration conf;
    private String dispatcherImpl;

    public DispatcherFactory()
    {
        this(ConfigurationContext.getInstance());
    }

    public DispatcherFactory(Configuration configuration)
    {
        dispatcherImpl = configuration.getDispatcherImpl();
        conf = configuration;
    }

    static Class _mthclass$(String s)
    {
        try
        {
            s = Class.forName(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw (new NoClassDefFoundError()).initCause(s);
        }
        return s;
    }

    public Dispatcher getInstance()
    {
        try
        {
            Class class2 = Class.forName(dispatcherImpl);
            Class class1;
            if (class$twitter4j$conf$Configuration == null)
            {
                class1 = _mthclass$("twitter4j.conf.Configuration");
                class$twitter4j$conf$Configuration = class1;
            } else
            {
                class1 = class$twitter4j$conf$Configuration;
            }
            return (Dispatcher)class2.getConstructor(new Class[] {
                class1
            }).newInstance(new Object[] {
                conf
            });
        }
        catch (InstantiationException instantiationexception)
        {
            throw new AssertionError(instantiationexception);
        }
        catch (IllegalAccessException illegalaccessexception)
        {
            throw new AssertionError(illegalaccessexception);
        }
        catch (ClassNotFoundException classnotfoundexception)
        {
            throw new AssertionError(classnotfoundexception);
        }
        catch (ClassCastException classcastexception)
        {
            throw new AssertionError(classcastexception);
        }
        catch (NoSuchMethodException nosuchmethodexception)
        {
            throw new AssertionError(nosuchmethodexception);
        }
        catch (InvocationTargetException invocationtargetexception)
        {
            throw new AssertionError(invocationtargetexception);
        }
    }
}
