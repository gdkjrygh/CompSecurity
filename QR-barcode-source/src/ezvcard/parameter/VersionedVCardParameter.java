// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ezvcard.parameter;

import ezvcard.VCardVersion;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Set;

// Referenced classes of package ezvcard.parameter:
//            VCardParameter

public class VersionedVCardParameter extends VCardParameter
{

    protected final Set supportedVersions;

    public transient VersionedVCardParameter(String s, VCardVersion avcardversion[])
    {
        super(s);
        s = avcardversion;
        if (avcardversion.length == 0)
        {
            s = VCardVersion.values();
        }
        supportedVersions = Collections.unmodifiableSet(EnumSet.copyOf(Arrays.asList(s)));
    }

    public boolean isSupported(VCardVersion vcardversion)
    {
        return supportedVersions.contains(vcardversion);
    }
}
