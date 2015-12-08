// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ezvcard.io.scribe;

import ezvcard.VCardDataType;
import ezvcard.VCardVersion;
import ezvcard.io.html.HCardElement;
import ezvcard.io.json.JCardValue;
import ezvcard.io.xml.XCardElement;
import ezvcard.parameter.VCardParameters;
import ezvcard.property.VCardProperty;
import java.util.List;

// Referenced classes of package ezvcard.io.scribe:
//            VCardPropertyScribe

public abstract class SimplePropertyScribe extends VCardPropertyScribe
{

    protected final VCardDataType dataType;

    public SimplePropertyScribe(Class class1, String s, VCardDataType vcarddatatype)
    {
        super(class1, s);
        dataType = vcarddatatype;
    }

    protected VCardDataType _defaultDataType(VCardVersion vcardversion)
    {
        return dataType;
    }

    protected VCardProperty _parseHtml(HCardElement hcardelement, List list)
    {
        return _parseValue(hcardelement.value());
    }

    protected VCardProperty _parseJson(JCardValue jcardvalue, VCardDataType vcarddatatype, VCardParameters vcardparameters, List list)
    {
        return _parseValue(jcardvalue.asSingle());
    }

    protected VCardProperty _parseText(String s, VCardDataType vcarddatatype, VCardVersion vcardversion, VCardParameters vcardparameters, List list)
    {
        return _parseValue(unescape(s));
    }

    protected abstract VCardProperty _parseValue(String s);

    protected VCardProperty _parseXml(XCardElement xcardelement, VCardParameters vcardparameters, List list)
    {
        xcardelement = xcardelement.first(new VCardDataType[] {
            dataType
        });
        if (xcardelement != null)
        {
            return _parseValue(xcardelement);
        } else
        {
            throw VCardPropertyScribe.missingXmlElements(new VCardDataType[] {
                dataType
            });
        }
    }

    protected JCardValue _writeJson(VCardProperty vcardproperty)
    {
        String s = _writeValue(vcardproperty);
        vcardproperty = s;
        if (s == null)
        {
            vcardproperty = "";
        }
        return JCardValue.single(vcardproperty);
    }

    protected String _writeText(VCardProperty vcardproperty, VCardVersion vcardversion)
    {
        vcardproperty = _writeValue(vcardproperty);
        if (vcardproperty == null)
        {
            return "";
        } else
        {
            return escape(vcardproperty);
        }
    }

    protected abstract String _writeValue(VCardProperty vcardproperty);

    protected void _writeXml(VCardProperty vcardproperty, XCardElement xcardelement)
    {
        xcardelement.append(dataType, _writeValue(vcardproperty));
    }
}
