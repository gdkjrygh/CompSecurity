// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package javax.jmdns;

import java.net.Inet4Address;
import java.net.Inet6Address;

public abstract class ServiceInfo
    implements Cloneable
{
    public static final class Fields extends Enum
    {

        private static final Fields $VALUES[];
        public static final Fields Application;
        public static final Fields Domain;
        public static final Fields Instance;
        public static final Fields Protocol;
        public static final Fields Subtype;

        public static Fields valueOf(String s)
        {
            return (Fields)Enum.valueOf(javax/jmdns/ServiceInfo$Fields, s);
        }

        public static Fields[] values()
        {
            return (Fields[])$VALUES.clone();
        }

        static 
        {
            Domain = new Fields("Domain", 0);
            Protocol = new Fields("Protocol", 1);
            Application = new Fields("Application", 2);
            Instance = new Fields("Instance", 3);
            Subtype = new Fields("Subtype", 4);
            $VALUES = (new Fields[] {
                Domain, Protocol, Application, Instance, Subtype
            });
        }

        private Fields(String s, int i)
        {
            super(s, i);
        }
    }


    public static final byte NO_VALUE[] = new byte[0];

    public ServiceInfo()
    {
    }

    public volatile Object clone()
        throws CloneNotSupportedException
    {
        return clone();
    }

    public ServiceInfo clone()
    {
        ServiceInfo serviceinfo;
        try
        {
            serviceinfo = (ServiceInfo)super.clone();
        }
        catch (CloneNotSupportedException clonenotsupportedexception)
        {
            return null;
        }
        return serviceinfo;
    }

    public abstract String getApplication();

    public abstract String getDomain();

    public abstract String[] getHostAddresses();

    public abstract Inet4Address[] getInet4Addresses();

    public abstract Inet6Address[] getInet6Addresses();

    public abstract String getName();

    public abstract int getPort();

    public abstract int getPriority();

    public abstract String getProtocol();

    public abstract String getQualifiedName();

    public abstract String getServer();

    public abstract String getSubtype();

    public abstract byte[] getTextBytes();

    public abstract String getType();

    public abstract int getWeight();

    public abstract boolean hasData();

    public abstract boolean isPersistent();

}
