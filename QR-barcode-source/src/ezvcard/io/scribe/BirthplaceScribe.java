// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ezvcard.io.scribe;

import ezvcard.VCardDataType;
import ezvcard.VCardVersion;
import ezvcard.io.json.JCardValue;
import ezvcard.io.xml.XCardElement;
import ezvcard.parameter.VCardParameters;
import ezvcard.property.Birthplace;
import ezvcard.property.VCardProperty;
import java.util.List;

// Referenced classes of package ezvcard.io.scribe:
//            VCardPropertyScribe

public class BirthplaceScribe extends VCardPropertyScribe
{

    public BirthplaceScribe()
    {
        super(ezvcard/property/Birthplace, "BIRTHPLACE");
    }

    protected VCardDataType _dataType(Birthplace birthplace, VCardVersion vcardversion)
    {
        if (birthplace.getText() != null)
        {
            return VCardDataType.TEXT;
        }
        if (birthplace.getUri() != null)
        {
            return VCardDataType.URI;
        } else
        {
            return _defaultDataType(vcardversion);
        }
    }

    protected volatile VCardDataType _dataType(VCardProperty vcardproperty, VCardVersion vcardversion)
    {
        return _dataType((Birthplace)vcardproperty, vcardversion);
    }

    protected VCardDataType _defaultDataType(VCardVersion vcardversion)
    {
        return VCardDataType.TEXT;
    }

    protected Birthplace _parseJson(JCardValue jcardvalue, VCardDataType vcarddatatype, VCardParameters vcardparameters, List list)
    {
        vcardparameters = new Birthplace();
        jcardvalue = jcardvalue.asSingle();
        if (vcarddatatype == VCardDataType.TEXT)
        {
            vcardparameters.setText(jcardvalue);
            return vcardparameters;
        }
        if (vcarddatatype == VCardDataType.URI)
        {
            vcardparameters.setUri(jcardvalue);
            return vcardparameters;
        } else
        {
            vcardparameters.setText(jcardvalue);
            return vcardparameters;
        }
    }

    protected volatile VCardProperty _parseJson(JCardValue jcardvalue, VCardDataType vcarddatatype, VCardParameters vcardparameters, List list)
    {
        return _parseJson(jcardvalue, vcarddatatype, vcardparameters, list);
    }

    protected Birthplace _parseText(String s, VCardDataType vcarddatatype, VCardVersion vcardversion, VCardParameters vcardparameters, List list)
    {
        vcardversion = new Birthplace();
        s = unescape(s);
        if (vcarddatatype == VCardDataType.TEXT)
        {
            vcardversion.setText(s);
            return vcardversion;
        }
        if (vcarddatatype == VCardDataType.URI)
        {
            vcardversion.setUri(s);
            return vcardversion;
        } else
        {
            vcardversion.setText(s);
            return vcardversion;
        }
    }

    protected volatile VCardProperty _parseText(String s, VCardDataType vcarddatatype, VCardVersion vcardversion, VCardParameters vcardparameters, List list)
    {
        return _parseText(s, vcarddatatype, vcardversion, vcardparameters, list);
    }

    protected Birthplace _parseXml(XCardElement xcardelement, VCardParameters vcardparameters, List list)
    {
        vcardparameters = new Birthplace();
        list = xcardelement.first(new VCardDataType[] {
            VCardDataType.TEXT
        });
        if (list != null)
        {
            vcardparameters.setText(list);
            return vcardparameters;
        }
        xcardelement = xcardelement.first(new VCardDataType[] {
            VCardDataType.URI
        });
        if (xcardelement != null)
        {
            vcardparameters.setUri(xcardelement);
            return vcardparameters;
        } else
        {
            throw missingXmlElements(new VCardDataType[] {
                VCardDataType.TEXT, VCardDataType.URI
            });
        }
    }

    protected volatile VCardProperty _parseXml(XCardElement xcardelement, VCardParameters vcardparameters, List list)
    {
        return _parseXml(xcardelement, vcardparameters, list);
    }

    protected JCardValue _writeJson(Birthplace birthplace)
    {
        String s = birthplace.getText();
        if (s != null)
        {
            return JCardValue.single(s);
        }
        birthplace = birthplace.getUri();
        if (birthplace != null)
        {
            return JCardValue.single(birthplace);
        } else
        {
            return JCardValue.single("");
        }
    }

    protected volatile JCardValue _writeJson(VCardProperty vcardproperty)
    {
        return _writeJson((Birthplace)vcardproperty);
    }

    protected String _writeText(Birthplace birthplace, VCardVersion vcardversion)
    {
        vcardversion = birthplace.getText();
        if (vcardversion != null)
        {
            return escape(vcardversion);
        }
        birthplace = birthplace.getUri();
        if (birthplace != null)
        {
            return birthplace;
        } else
        {
            return "";
        }
    }

    protected volatile String _writeText(VCardProperty vcardproperty, VCardVersion vcardversion)
    {
        return _writeText((Birthplace)vcardproperty, vcardversion);
    }

    protected void _writeXml(Birthplace birthplace, XCardElement xcardelement)
    {
        String s = birthplace.getText();
        if (s != null)
        {
            xcardelement.append(VCardDataType.TEXT, s);
            return;
        }
        birthplace = birthplace.getUri();
        if (birthplace != null)
        {
            xcardelement.append(VCardDataType.URI, birthplace);
            return;
        } else
        {
            xcardelement.append(VCardDataType.TEXT, "");
            return;
        }
    }

    protected volatile void _writeXml(VCardProperty vcardproperty, XCardElement xcardelement)
    {
        _writeXml((Birthplace)vcardproperty, xcardelement);
    }
}
