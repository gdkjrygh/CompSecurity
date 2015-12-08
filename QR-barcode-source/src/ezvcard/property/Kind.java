// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ezvcard.property;

import ezvcard.VCardVersion;
import java.util.EnumSet;
import java.util.Set;

// Referenced classes of package ezvcard.property:
//            TextProperty

public class Kind extends TextProperty
{

    public static final String APPLICATION = "application";
    public static final String DEVICE = "device";
    public static final String GROUP = "group";
    public static final String INDIVIDUAL = "individual";
    public static final String LOCATION = "location";
    public static final String ORG = "org";

    public Kind(String s)
    {
        super(s);
    }

    public static Kind application()
    {
        return new Kind("application");
    }

    public static Kind device()
    {
        return new Kind("device");
    }

    public static Kind group()
    {
        return new Kind("group");
    }

    public static Kind individual()
    {
        return new Kind("individual");
    }

    public static Kind location()
    {
        return new Kind("location");
    }

    public static Kind org()
    {
        return new Kind("org");
    }

    public Set _supportedVersions()
    {
        return EnumSet.of(VCardVersion.V4_0);
    }

    public boolean isApplication()
    {
        return "application".equals(value);
    }

    public boolean isDevice()
    {
        return "device".equals(value);
    }

    public boolean isGroup()
    {
        return "group".equals(value);
    }

    public boolean isIndividual()
    {
        return "individual".equals(value);
    }

    public boolean isLocation()
    {
        return "location".equals(value);
    }

    public boolean isOrg()
    {
        return "org".equals(value);
    }
}
