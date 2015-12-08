// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ezvcard.io.scribe;

import ezvcard.VCardDataType;
import ezvcard.VCardVersion;
import ezvcard.parameter.VCardParameters;
import ezvcard.property.RawProperty;
import ezvcard.property.VCardProperty;
import java.util.List;

// Referenced classes of package ezvcard.io.scribe:
//            VCardPropertyScribe

public class RawPropertyScribe extends VCardPropertyScribe
{

    public RawPropertyScribe(String s)
    {
        super(ezvcard/property/RawProperty, s);
    }

    protected VCardDataType _dataType(RawProperty rawproperty, VCardVersion vcardversion)
    {
        return rawproperty.getDataType();
    }

    protected volatile VCardDataType _dataType(VCardProperty vcardproperty, VCardVersion vcardversion)
    {
        return _dataType((RawProperty)vcardproperty, vcardversion);
    }

    protected VCardDataType _defaultDataType(VCardVersion vcardversion)
    {
        return null;
    }

    protected RawProperty _parseText(String s, VCardDataType vcarddatatype, VCardVersion vcardversion, VCardParameters vcardparameters, List list)
    {
        s = new RawProperty(propertyName, s);
        s.setDataType(vcarddatatype);
        return s;
    }

    protected volatile VCardProperty _parseText(String s, VCardDataType vcarddatatype, VCardVersion vcardversion, VCardParameters vcardparameters, List list)
    {
        return _parseText(s, vcarddatatype, vcardversion, vcardparameters, list);
    }

    protected String _writeText(RawProperty rawproperty, VCardVersion vcardversion)
    {
        vcardversion = (String)rawproperty.getValue();
        rawproperty = vcardversion;
        if (vcardversion == null)
        {
            rawproperty = "";
        }
        return rawproperty;
    }

    protected volatile String _writeText(VCardProperty vcardproperty, VCardVersion vcardversion)
    {
        return _writeText((RawProperty)vcardproperty, vcardversion);
    }
}
