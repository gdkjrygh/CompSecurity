// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ezvcard.property;

import ezvcard.VCardVersion;
import ezvcard.parameter.AddressType;
import ezvcard.parameter.VCardParameters;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package ezvcard.property:
//            TextProperty

public class Label extends TextProperty
{

    public Label(String s)
    {
        super(s);
    }

    public Set _supportedVersions()
    {
        return EnumSet.of(VCardVersion.V2_1, VCardVersion.V3_0);
    }

    public void addType(AddressType addresstype)
    {
        parameters.addType(addresstype.getValue());
    }

    public String getLanguage()
    {
        return super.getLanguage();
    }

    public Set getTypes()
    {
        Object obj = parameters.getTypes();
        HashSet hashset = new HashSet(((Set) (obj)).size());
        for (obj = ((Set) (obj)).iterator(); ((Iterator) (obj)).hasNext(); hashset.add(AddressType.get((String)((Iterator) (obj)).next()))) { }
        return hashset;
    }

    public void removeType(AddressType addresstype)
    {
        parameters.removeType(addresstype.getValue());
    }

    public void setLanguage(String s)
    {
        super.setLanguage(s);
    }
}
