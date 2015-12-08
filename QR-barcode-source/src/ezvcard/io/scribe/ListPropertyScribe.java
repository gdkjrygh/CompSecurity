// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ezvcard.io.scribe;

import ezvcard.VCardDataType;
import ezvcard.VCardVersion;
import ezvcard.io.json.JCardValue;
import ezvcard.io.xml.XCardElement;
import ezvcard.parameter.VCardParameters;
import ezvcard.property.TextListProperty;
import ezvcard.property.VCardProperty;
import java.util.List;

// Referenced classes of package ezvcard.io.scribe:
//            VCardPropertyScribe

public abstract class ListPropertyScribe extends VCardPropertyScribe
{

    public ListPropertyScribe(Class class1, String s)
    {
        super(class1, s);
    }

    private TextListProperty parse(List list)
    {
        TextListProperty textlistproperty = _newInstance();
        textlistproperty.getValues().addAll(list);
        return textlistproperty;
    }

    protected VCardDataType _defaultDataType(VCardVersion vcardversion)
    {
        return VCardDataType.TEXT;
    }

    protected abstract TextListProperty _newInstance();

    protected TextListProperty _parseJson(JCardValue jcardvalue, VCardDataType vcarddatatype, VCardParameters vcardparameters, List list)
    {
        return parse(jcardvalue.asMulti());
    }

    protected volatile VCardProperty _parseJson(JCardValue jcardvalue, VCardDataType vcarddatatype, VCardParameters vcardparameters, List list)
    {
        return _parseJson(jcardvalue, vcarddatatype, vcardparameters, list);
    }

    protected TextListProperty _parseText(String s, VCardDataType vcarddatatype, VCardVersion vcardversion, VCardParameters vcardparameters, List list)
    {
        return parse(list(s));
    }

    protected volatile VCardProperty _parseText(String s, VCardDataType vcarddatatype, VCardVersion vcardversion, VCardParameters vcardparameters, List list)
    {
        return _parseText(s, vcarddatatype, vcardversion, vcardparameters, list);
    }

    protected TextListProperty _parseXml(XCardElement xcardelement, VCardParameters vcardparameters, List list)
    {
        xcardelement = xcardelement.all(VCardDataType.TEXT);
        if (!xcardelement.isEmpty())
        {
            return parse(xcardelement);
        } else
        {
            throw missingXmlElements(new VCardDataType[] {
                VCardDataType.TEXT
            });
        }
    }

    protected volatile VCardProperty _parseXml(XCardElement xcardelement, VCardParameters vcardparameters, List list)
    {
        return _parseXml(xcardelement, vcardparameters, list);
    }

    protected JCardValue _writeJson(TextListProperty textlistproperty)
    {
        textlistproperty = textlistproperty.getValues();
        if (textlistproperty.isEmpty())
        {
            return JCardValue.single("");
        } else
        {
            return JCardValue.multi(textlistproperty);
        }
    }

    protected volatile JCardValue _writeJson(VCardProperty vcardproperty)
    {
        return _writeJson((TextListProperty)vcardproperty);
    }

    protected String _writeText(TextListProperty textlistproperty, VCardVersion vcardversion)
    {
        return list(textlistproperty.getValues());
    }

    protected volatile String _writeText(VCardProperty vcardproperty, VCardVersion vcardversion)
    {
        return _writeText((TextListProperty)vcardproperty, vcardversion);
    }

    protected void _writeXml(TextListProperty textlistproperty, XCardElement xcardelement)
    {
        xcardelement.append(VCardDataType.TEXT.getName().toLowerCase(), textlistproperty.getValues());
    }

    protected volatile void _writeXml(VCardProperty vcardproperty, XCardElement xcardelement)
    {
        _writeXml((TextListProperty)vcardproperty, xcardelement);
    }
}
