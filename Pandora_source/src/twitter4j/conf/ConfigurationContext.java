// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package twitter4j.conf;


// Referenced classes of package twitter4j.conf:
//            ConfigurationFactory, Configuration

public final class ConfigurationContext
{

    private static final String CONFIGURATION_IMPL = "twitter4j.configurationFactory";
    private static final String DEFAULT_CONFIGURATION_FACTORY = "twitter4j.conf.PropertyConfigurationFactory";
    private static final ConfigurationFactory factory;

    public ConfigurationContext()
    {
    }

    public static Configuration getInstance()
    {
        return factory.getInstance();
    }

    public static Configuration getInstance(String s)
    {
        return factory.getInstance(s);
    }

    static 
    {
        String s;
        try
        {
            s = System.getProperty("twitter4j.configurationFactory", "twitter4j.conf.PropertyConfigurationFactory");
        }
        catch (SecurityException securityexception)
        {
            securityexception = "twitter4j.conf.PropertyConfigurationFactory";
        }
        try
        {
            factory = (ConfigurationFactory)Class.forName(s).newInstance();
        }
        catch (ClassNotFoundException classnotfoundexception)
        {
            throw new AssertionError(classnotfoundexception);
        }
        catch (InstantiationException instantiationexception)
        {
            throw new AssertionError(instantiationexception);
        }
        catch (IllegalAccessException illegalaccessexception)
        {
            throw new AssertionError(illegalaccessexception);
        }
    }
}
