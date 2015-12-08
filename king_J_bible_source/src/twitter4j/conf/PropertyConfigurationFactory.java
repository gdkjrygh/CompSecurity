// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package twitter4j.conf;


// Referenced classes of package twitter4j.conf:
//            ConfigurationFactory, PropertyConfiguration, Configuration

class PropertyConfigurationFactory
    implements ConfigurationFactory
{

    private static final PropertyConfiguration ROOT_CONFIGURATION = new PropertyConfiguration();

    PropertyConfigurationFactory()
    {
    }

    public void dispose()
    {
    }

    public Configuration getInstance()
    {
        return ROOT_CONFIGURATION;
    }

    public Configuration getInstance(String s)
    {
        return new PropertyConfiguration(s);
    }

}
