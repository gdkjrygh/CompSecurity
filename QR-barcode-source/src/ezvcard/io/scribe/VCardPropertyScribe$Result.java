// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ezvcard.io.scribe;

import ezvcard.property.VCardProperty;
import java.util.List;

// Referenced classes of package ezvcard.io.scribe:
//            VCardPropertyScribe

public static class warnings
{

    private final VCardProperty property;
    private final List warnings;

    public VCardProperty getProperty()
    {
        return property;
    }

    public List getWarnings()
    {
        return warnings;
    }

    public (VCardProperty vcardproperty, List list)
    {
        property = vcardproperty;
        warnings = list;
    }
}
