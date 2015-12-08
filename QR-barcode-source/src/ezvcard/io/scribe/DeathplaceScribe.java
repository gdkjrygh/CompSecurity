// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ezvcard.io.scribe;

import ezvcard.VCardDataType;
import ezvcard.VCardVersion;
import ezvcard.io.json.JCardValue;
import ezvcard.io.xml.XCardElement;
import ezvcard.parameter.VCardParameters;
import ezvcard.property.Deathplace;
import ezvcard.property.VCardProperty;
import java.util.List;

// Referenced classes of package ezvcard.io.scribe:
//            VCardPropertyScribe

public class DeathplaceScribe extends VCardPropertyScribe
{

    public DeathplaceScribe()
    {
        super(ezvcard/property/Deathplace, "DEATHPLACE");
    }

    protected VCardDataType _dataType(Deathplace deathplace, VCardVersion vcardversion)
    {
        if (deathplace.getText() != null)
        {
            return VCardDataType.TEXT;
        }
        if (deathplace.getUri() != null)
        {
            return VCardDataType.URI;
        } else
        {
            return _defaultDataType(vcardversion);
        }
    }

    protected volatile VCardDataType _dataType(VCardProperty vcardproperty, VCardVersion vcardversion)
    {
        return _dataType((Deathplace)vcardproperty, vcardversion);
    }

    protected VCardDataType _defaultDataType(VCardVersion vcardversion)
    {
        return VCardDataType.TEXT;
    }

    protected Deathplace _parseJson(JCardValue jcardvalue, VCardDataType vcarddatatype, VCardParameters vcardparameters, List list)
    {
        vcardparameters = new Deathplace();
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

    protected Deathplace _parseText(String s, VCardDataType vcarddatatype, VCardVersion vcardversion, VCardParameters vcardparameters, List list)
    {
        vcardversion = new Deathplace();
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

    protected Deathplace _parseXml(XCardElement xcardelement, VCardParameters vcardparameters, List list)
    {
        vcardparameters = new Deathplace();
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

    protected JCardValue _writeJson(Deathplace deathplace)
    {
        String s = deathplace.getText();
        if (s != null)
        {
            return JCardValue.single(s);
        }
        deathplace = deathplace.getUri();
        if (deathplace != null)
        {
            return JCardValue.single(deathplace);
        } else
        {
            return JCardValue.single("");
        }
    }

    protected volatile JCardValue _writeJson(VCardProperty vcardproperty)
    {
        return _writeJson((Deathplace)vcardproperty);
    }

    protected String _writeText(Deathplace deathplace, VCardVersion vcardversion)
    {
        vcardversion = deathplace.getText();
        if (vcardversion != null)
        {
            deathplace = escape(vcardversion);
        } else
        {
            vcardversion = deathplace.getUri();
            deathplace = vcardversion;
            if (vcardversion == null)
            {
                return "";
            }
        }
        return deathplace;
    }

    protected volatile String _writeText(VCardProperty vcardproperty, VCardVersion vcardversion)
    {
        return _writeText((Deathplace)vcardproperty, vcardversion);
    }

    protected void _writeXml(Deathplace deathplace, XCardElement xcardelement)
    {
        String s = deathplace.getText();
        if (s != null)
        {
            xcardelement.append(VCardDataType.TEXT, s);
            return;
        }
        deathplace = deathplace.getUri();
        if (deathplace != null)
        {
            xcardelement.append(VCardDataType.URI, deathplace);
            return;
        } else
        {
            xcardelement.append(VCardDataType.TEXT, "");
            return;
        }
    }

    protected volatile void _writeXml(VCardProperty vcardproperty, XCardElement xcardelement)
    {
        _writeXml((Deathplace)vcardproperty, xcardelement);
    }
}
