// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ezvcard.io.scribe;

import ezvcard.VCardDataType;
import ezvcard.VCardVersion;
import ezvcard.io.CannotParseException;
import ezvcard.io.json.JCardValue;
import ezvcard.io.xml.XCardElement;
import ezvcard.parameter.VCardParameters;
import ezvcard.property.ClientPidMap;
import ezvcard.property.VCardProperty;
import java.util.List;

// Referenced classes of package ezvcard.io.scribe:
//            VCardPropertyScribe

public class ClientPidMapScribe extends VCardPropertyScribe
{

    public ClientPidMapScribe()
    {
        super(ezvcard/property/ClientPidMap, "CLIENTPIDMAP");
    }

    private ClientPidMap parse(String s, String s1)
    {
        try
        {
            s = new ClientPidMap(Integer.valueOf(Integer.parseInt(s)), s1);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new CannotParseException("Unable to parse PID component.");
        }
        return s;
    }

    protected VCardDataType _defaultDataType(VCardVersion vcardversion)
    {
        return VCardDataType.TEXT;
    }

    protected ClientPidMap _parseJson(JCardValue jcardvalue, VCardDataType vcarddatatype, VCardParameters vcardparameters, List list)
    {
        jcardvalue = structured(jcardvalue);
        return parse(jcardvalue.nextString(), jcardvalue.nextString());
    }

    protected volatile VCardProperty _parseJson(JCardValue jcardvalue, VCardDataType vcarddatatype, VCardParameters vcardparameters, List list)
    {
        return _parseJson(jcardvalue, vcarddatatype, vcardparameters, list);
    }

    protected ClientPidMap _parseText(String s, VCardDataType vcarddatatype, VCardVersion vcardversion, VCardParameters vcardparameters, List list)
    {
        vcarddatatype = semistructured(s, 2);
        s = vcarddatatype.next();
        vcarddatatype = vcarddatatype.next();
        if (s == null || vcarddatatype == null)
        {
            throw new CannotParseException("Incorrect data format.  Value must contain a PID and a URI, separated by a semi-colon.");
        } else
        {
            return parse(s, vcarddatatype);
        }
    }

    protected volatile VCardProperty _parseText(String s, VCardDataType vcarddatatype, VCardVersion vcardversion, VCardParameters vcardparameters, List list)
    {
        return _parseText(s, vcarddatatype, vcardversion, vcardparameters, list);
    }

    protected ClientPidMap _parseXml(XCardElement xcardelement, VCardParameters vcardparameters, List list)
    {
        vcardparameters = xcardelement.first(new String[] {
            "sourceid"
        });
        xcardelement = xcardelement.first(new VCardDataType[] {
            VCardDataType.URI
        });
        if (xcardelement == null && vcardparameters == null)
        {
            throw missingXmlElements(new String[] {
                VCardDataType.URI.getName().toLowerCase(), "sourceid"
            });
        }
        if (xcardelement == null)
        {
            throw missingXmlElements(new VCardDataType[] {
                VCardDataType.URI
            });
        }
        if (vcardparameters == null)
        {
            throw missingXmlElements(new String[] {
                "sourceid"
            });
        } else
        {
            return parse(vcardparameters, xcardelement);
        }
    }

    protected volatile VCardProperty _parseXml(XCardElement xcardelement, VCardParameters vcardparameters, List list)
    {
        return _parseXml(xcardelement, vcardparameters, list);
    }

    protected JCardValue _writeJson(ClientPidMap clientpidmap)
    {
        return JCardValue.structured(new Object[] {
            clientpidmap.getPid(), clientpidmap.getUri()
        });
    }

    protected volatile JCardValue _writeJson(VCardProperty vcardproperty)
    {
        return _writeJson((ClientPidMap)vcardproperty);
    }

    protected String _writeText(ClientPidMap clientpidmap, VCardVersion vcardversion)
    {
        return structured(new Object[] {
            clientpidmap.getPid(), clientpidmap.getUri()
        });
    }

    protected volatile String _writeText(VCardProperty vcardproperty, VCardVersion vcardversion)
    {
        return _writeText((ClientPidMap)vcardproperty, vcardversion);
    }

    protected void _writeXml(ClientPidMap clientpidmap, XCardElement xcardelement)
    {
        Object obj = clientpidmap.getPid();
        if (obj == null)
        {
            obj = "";
        } else
        {
            obj = ((Integer) (obj)).toString();
        }
        xcardelement.append("sourceid", ((String) (obj)));
        xcardelement.append(VCardDataType.URI, clientpidmap.getUri());
    }

    protected volatile void _writeXml(VCardProperty vcardproperty, XCardElement xcardelement)
    {
        _writeXml((ClientPidMap)vcardproperty, xcardelement);
    }
}
