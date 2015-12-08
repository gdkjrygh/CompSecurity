// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ezvcard.property;

import ezvcard.VCardDataType;

// Referenced classes of package ezvcard.property:
//            TextProperty

public class RawProperty extends TextProperty
{

    private VCardDataType dataType;
    private String propertyName;

    public RawProperty(String s, String s1)
    {
        this(s, s1, null);
    }

    public RawProperty(String s, String s1, VCardDataType vcarddatatype)
    {
        super(s1);
        propertyName = s;
        dataType = vcarddatatype;
    }

    public VCardDataType getDataType()
    {
        return dataType;
    }

    public String getPropertyName()
    {
        return propertyName;
    }

    public void setDataType(VCardDataType vcarddatatype)
    {
        dataType = vcarddatatype;
    }

    public void setPropertyName(String s)
    {
        propertyName = s;
    }
}
