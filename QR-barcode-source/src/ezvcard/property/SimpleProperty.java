// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ezvcard.property;

import ezvcard.VCard;
import ezvcard.VCardVersion;
import java.util.List;

// Referenced classes of package ezvcard.property:
//            VCardProperty

public class SimpleProperty extends VCardProperty
{

    protected Object value;

    public SimpleProperty(Object obj)
    {
        value = obj;
    }

    protected void _validate(List list, VCardVersion vcardversion, VCard vcard)
    {
        if (value == null)
        {
            list.add("Property value is null.");
        }
    }

    public Object getValue()
    {
        return value;
    }

    public void setValue(Object obj)
    {
        value = obj;
    }
}
