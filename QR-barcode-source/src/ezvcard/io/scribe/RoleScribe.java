// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ezvcard.io.scribe;

import ezvcard.property.Role;
import ezvcard.property.VCardProperty;

// Referenced classes of package ezvcard.io.scribe:
//            StringPropertyScribe

public class RoleScribe extends StringPropertyScribe
{

    public RoleScribe()
    {
        super(ezvcard/property/Role, "ROLE");
    }

    protected Role _parseValue(String s)
    {
        return new Role(s);
    }

    protected volatile VCardProperty _parseValue(String s)
    {
        return _parseValue(s);
    }
}
