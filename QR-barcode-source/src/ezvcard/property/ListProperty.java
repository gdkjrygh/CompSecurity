// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ezvcard.property;

import ezvcard.VCard;
import ezvcard.VCardVersion;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package ezvcard.property:
//            VCardProperty

public class ListProperty extends VCardProperty
{

    protected List values;

    public ListProperty()
    {
        values = new ArrayList();
    }

    protected void _validate(List list, VCardVersion vcardversion, VCard vcard)
    {
        if (values.isEmpty())
        {
            list.add("Property value is empty.");
        }
    }

    public void addValue(Object obj)
    {
        values.add(obj);
    }

    public List getValues()
    {
        return values;
    }

    public void removeValue(Object obj)
    {
        values.remove(obj);
    }
}
