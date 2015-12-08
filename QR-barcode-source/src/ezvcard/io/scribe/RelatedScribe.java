// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ezvcard.io.scribe;

import ezvcard.VCardDataType;
import ezvcard.VCardVersion;
import ezvcard.io.json.JCardValue;
import ezvcard.io.xml.XCardElement;
import ezvcard.parameter.VCardParameters;
import ezvcard.property.Related;
import ezvcard.property.VCardProperty;
import java.util.List;

// Referenced classes of package ezvcard.io.scribe:
//            VCardPropertyScribe

public class RelatedScribe extends VCardPropertyScribe
{

    public RelatedScribe()
    {
        super(ezvcard/property/Related, "RELATED");
    }

    protected VCardDataType _dataType(Related related, VCardVersion vcardversion)
    {
        if (related.getUri() != null)
        {
            return VCardDataType.URI;
        }
        if (related.getText() != null)
        {
            return VCardDataType.TEXT;
        } else
        {
            return VCardDataType.URI;
        }
    }

    protected volatile VCardDataType _dataType(VCardProperty vcardproperty, VCardVersion vcardversion)
    {
        return _dataType((Related)vcardproperty, vcardversion);
    }

    protected VCardDataType _defaultDataType(VCardVersion vcardversion)
    {
        return VCardDataType.URI;
    }

    protected Related _parseJson(JCardValue jcardvalue, VCardDataType vcarddatatype, VCardParameters vcardparameters, List list)
    {
        jcardvalue = jcardvalue.asSingle();
        vcardparameters = new Related();
        if (vcarddatatype == VCardDataType.TEXT)
        {
            vcardparameters.setText(jcardvalue);
            return vcardparameters;
        } else
        {
            vcardparameters.setUri(jcardvalue);
            return vcardparameters;
        }
    }

    protected volatile VCardProperty _parseJson(JCardValue jcardvalue, VCardDataType vcarddatatype, VCardParameters vcardparameters, List list)
    {
        return _parseJson(jcardvalue, vcarddatatype, vcardparameters, list);
    }

    protected Related _parseText(String s, VCardDataType vcarddatatype, VCardVersion vcardversion, VCardParameters vcardparameters, List list)
    {
        s = unescape(s);
        vcardversion = new Related();
        if (vcarddatatype == VCardDataType.TEXT)
        {
            vcardversion.setText(s);
            return vcardversion;
        } else
        {
            vcardversion.setUri(s);
            return vcardversion;
        }
    }

    protected volatile VCardProperty _parseText(String s, VCardDataType vcarddatatype, VCardVersion vcardversion, VCardParameters vcardparameters, List list)
    {
        return _parseText(s, vcarddatatype, vcardversion, vcardparameters, list);
    }

    protected Related _parseXml(XCardElement xcardelement, VCardParameters vcardparameters, List list)
    {
        vcardparameters = xcardelement.first(new VCardDataType[] {
            VCardDataType.URI
        });
        if (vcardparameters != null)
        {
            xcardelement = new Related();
            xcardelement.setUri(vcardparameters);
            return xcardelement;
        }
        xcardelement = xcardelement.first(new VCardDataType[] {
            VCardDataType.TEXT
        });
        if (xcardelement != null)
        {
            vcardparameters = new Related();
            vcardparameters.setText(xcardelement);
            return vcardparameters;
        } else
        {
            throw missingXmlElements(new VCardDataType[] {
                VCardDataType.URI, VCardDataType.TEXT
            });
        }
    }

    protected volatile VCardProperty _parseXml(XCardElement xcardelement, VCardParameters vcardparameters, List list)
    {
        return _parseXml(xcardelement, vcardparameters, list);
    }

    protected JCardValue _writeJson(Related related)
    {
        String s = related.getUri();
        if (s != null)
        {
            return JCardValue.single(s);
        }
        related = related.getText();
        if (related != null)
        {
            return JCardValue.single(related);
        } else
        {
            return JCardValue.single("");
        }
    }

    protected volatile JCardValue _writeJson(VCardProperty vcardproperty)
    {
        return _writeJson((Related)vcardproperty);
    }

    protected String _writeText(Related related, VCardVersion vcardversion)
    {
        vcardversion = related.getUri();
        if (vcardversion != null)
        {
            return vcardversion;
        }
        related = related.getText();
        if (related != null)
        {
            return escape(related);
        } else
        {
            return "";
        }
    }

    protected volatile String _writeText(VCardProperty vcardproperty, VCardVersion vcardversion)
    {
        return _writeText((Related)vcardproperty, vcardversion);
    }

    protected void _writeXml(Related related, XCardElement xcardelement)
    {
        String s = related.getUri();
        if (s != null)
        {
            xcardelement.append(VCardDataType.URI, s);
            return;
        }
        related = related.getText();
        if (related != null)
        {
            xcardelement.append(VCardDataType.TEXT, related);
            return;
        } else
        {
            xcardelement.append(VCardDataType.URI, "");
            return;
        }
    }

    protected volatile void _writeXml(VCardProperty vcardproperty, XCardElement xcardelement)
    {
        _writeXml((Related)vcardproperty, xcardelement);
    }
}
