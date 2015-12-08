// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ezvcard.io.scribe;

import ezvcard.VCard;
import ezvcard.VCardDataType;
import ezvcard.VCardVersion;
import ezvcard.io.html.HCardElement;
import ezvcard.io.json.JCardValue;
import ezvcard.io.xml.XCardElement;
import ezvcard.parameter.VCardParameters;
import ezvcard.property.Telephone;
import ezvcard.property.VCardProperty;
import ezvcard.util.TelUri;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package ezvcard.io.scribe:
//            VCardPropertyScribe

public class TelephoneScribe extends VCardPropertyScribe
{

    public TelephoneScribe()
    {
        super(ezvcard/property/Telephone, "TEL");
    }

    private Telephone parse(String s, VCardDataType vcarddatatype, List list)
    {
        Telephone telephone;
        try
        {
            telephone = new Telephone(TelUri.parse(s));
        }
        catch (IllegalArgumentException illegalargumentexception)
        {
            if (vcarddatatype == VCardDataType.URI)
            {
                list.add("Could not parse property value as a URI.  Assuming it's text.");
            }
            return new Telephone(s);
        }
        return telephone;
    }

    protected VCardDataType _dataType(Telephone telephone, VCardVersion vcardversion)
    {
        if (vcardversion == VCardVersion.V4_0)
        {
            if (telephone.getText() != null)
            {
                return VCardDataType.TEXT;
            }
            if (telephone.getUri() != null)
            {
                return VCardDataType.URI;
            }
        }
        return VCardDataType.TEXT;
    }

    protected volatile VCardDataType _dataType(VCardProperty vcardproperty, VCardVersion vcardversion)
    {
        return _dataType((Telephone)vcardproperty, vcardversion);
    }

    protected VCardDataType _defaultDataType(VCardVersion vcardversion)
    {
        return VCardDataType.TEXT;
    }

    protected Telephone _parseHtml(HCardElement hcardelement, List list)
    {
        list = hcardelement.attr("href");
        String s;
        try
        {
            list = new Telephone(TelUri.parse(list));
        }
        // Misplaced declaration of an exception variable
        catch (List list)
        {
            list = new Telephone(hcardelement.value());
        }
        for (hcardelement = hcardelement.types().iterator(); hcardelement.hasNext(); list.getParameters().addType(s))
        {
            s = (String)hcardelement.next();
        }

        return list;
    }

    protected volatile VCardProperty _parseHtml(HCardElement hcardelement, List list)
    {
        return _parseHtml(hcardelement, list);
    }

    protected Telephone _parseJson(JCardValue jcardvalue, VCardDataType vcarddatatype, VCardParameters vcardparameters, List list)
    {
        return parse(jcardvalue.asSingle(), vcarddatatype, list);
    }

    protected volatile VCardProperty _parseJson(JCardValue jcardvalue, VCardDataType vcarddatatype, VCardParameters vcardparameters, List list)
    {
        return _parseJson(jcardvalue, vcarddatatype, vcardparameters, list);
    }

    protected Telephone _parseText(String s, VCardDataType vcarddatatype, VCardVersion vcardversion, VCardParameters vcardparameters, List list)
    {
        return parse(unescape(s), vcarddatatype, list);
    }

    protected volatile VCardProperty _parseText(String s, VCardDataType vcarddatatype, VCardVersion vcardversion, VCardParameters vcardparameters, List list)
    {
        return _parseText(s, vcarddatatype, vcardversion, vcardparameters, list);
    }

    protected Telephone _parseXml(XCardElement xcardelement, VCardParameters vcardparameters, List list)
    {
        vcardparameters = xcardelement.first(new VCardDataType[] {
            VCardDataType.TEXT
        });
        if (vcardparameters != null)
        {
            return new Telephone(vcardparameters);
        }
        xcardelement = xcardelement.first(new VCardDataType[] {
            VCardDataType.URI
        });
        if (xcardelement != null)
        {
            try
            {
                vcardparameters = new Telephone(TelUri.parse(xcardelement));
            }
            // Misplaced declaration of an exception variable
            catch (VCardParameters vcardparameters)
            {
                list.add("Could not parse property value as a URI.  Assuming it's text.");
                return new Telephone(xcardelement);
            }
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

    protected void _prepareParameters(Telephone telephone, VCardParameters vcardparameters, VCardVersion vcardversion, VCard vcard)
    {
        handlePrefParam(telephone, vcardparameters, vcardversion, vcard);
    }

    protected volatile void _prepareParameters(VCardProperty vcardproperty, VCardParameters vcardparameters, VCardVersion vcardversion, VCard vcard)
    {
        _prepareParameters((Telephone)vcardproperty, vcardparameters, vcardversion, vcard);
    }

    protected JCardValue _writeJson(Telephone telephone)
    {
        String s = telephone.getText();
        if (s != null)
        {
            return JCardValue.single(s);
        }
        telephone = telephone.getUri();
        if (telephone != null)
        {
            return JCardValue.single(telephone.toString());
        } else
        {
            return JCardValue.single("");
        }
    }

    protected volatile JCardValue _writeJson(VCardProperty vcardproperty)
    {
        return _writeJson((Telephone)vcardproperty);
    }

    protected String _writeText(Telephone telephone, VCardVersion vcardversion)
    {
        String s = telephone.getText();
        if (s != null)
        {
            return escape(s);
        }
        telephone = telephone.getUri();
        if (telephone != null)
        {
            if (vcardversion == VCardVersion.V4_0)
            {
                return telephone.toString();
            }
            vcardversion = telephone.getExtension();
            if (vcardversion == null)
            {
                return escape(telephone.getNumber());
            } else
            {
                return escape((new StringBuilder()).append(telephone.getNumber()).append(" x").append(vcardversion).toString());
            }
        } else
        {
            return "";
        }
    }

    protected volatile String _writeText(VCardProperty vcardproperty, VCardVersion vcardversion)
    {
        return _writeText((Telephone)vcardproperty, vcardversion);
    }

    protected void _writeXml(Telephone telephone, XCardElement xcardelement)
    {
        String s = telephone.getText();
        if (s != null)
        {
            xcardelement.append(VCardDataType.TEXT, s);
            return;
        }
        telephone = telephone.getUri();
        if (telephone != null)
        {
            xcardelement.append(VCardDataType.URI, telephone.toString());
            return;
        } else
        {
            xcardelement.append(VCardDataType.TEXT, "");
            return;
        }
    }

    protected volatile void _writeXml(VCardProperty vcardproperty, XCardElement xcardelement)
    {
        _writeXml((Telephone)vcardproperty, xcardelement);
    }
}
