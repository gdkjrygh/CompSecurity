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
import ezvcard.property.Address;
import ezvcard.property.VCardProperty;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package ezvcard.io.scribe:
//            VCardPropertyScribe

public class AddressScribe extends VCardPropertyScribe
{

    public AddressScribe()
    {
        super(ezvcard/property/Address, "ADR");
    }

    private String sanitizeXml(XCardElement xcardelement, String s)
    {
label0:
        {
            s = xcardelement.first(new String[] {
                s
            });
            if (s != null)
            {
                xcardelement = s;
                if (s.length() != 0)
                {
                    break label0;
                }
            }
            xcardelement = null;
        }
        return xcardelement;
    }

    protected VCardDataType _defaultDataType(VCardVersion vcardversion)
    {
        return VCardDataType.TEXT;
    }

    protected Address _parseHtml(HCardElement hcardelement, List list)
    {
        list = new Address();
        list.setPoBox(hcardelement.firstValue("post-office-box"));
        list.setExtendedAddress(hcardelement.firstValue("extended-address"));
        list.setStreetAddress(hcardelement.firstValue("street-address"));
        list.setLocality(hcardelement.firstValue("locality"));
        list.setRegion(hcardelement.firstValue("region"));
        list.setPostalCode(hcardelement.firstValue("postal-code"));
        list.setCountry(hcardelement.firstValue("country-name"));
        String s;
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

    protected Address _parseJson(JCardValue jcardvalue, VCardDataType vcarddatatype, VCardParameters vcardparameters, List list)
    {
        vcarddatatype = new Address();
        jcardvalue = structured(jcardvalue);
        vcarddatatype.setPoBox(jcardvalue.nextString());
        vcarddatatype.setExtendedAddress(jcardvalue.nextString());
        vcarddatatype.setStreetAddress(jcardvalue.nextString());
        vcarddatatype.setLocality(jcardvalue.nextString());
        vcarddatatype.setRegion(jcardvalue.nextString());
        vcarddatatype.setPostalCode(jcardvalue.nextString());
        vcarddatatype.setCountry(jcardvalue.nextString());
        return vcarddatatype;
    }

    protected volatile VCardProperty _parseJson(JCardValue jcardvalue, VCardDataType vcarddatatype, VCardParameters vcardparameters, List list)
    {
        return _parseJson(jcardvalue, vcarddatatype, vcardparameters, list);
    }

    protected Address _parseText(String s, VCardDataType vcarddatatype, VCardVersion vcardversion, VCardParameters vcardparameters, List list)
    {
        vcarddatatype = new Address();
        s = structured(s);
        vcarddatatype.setPoBox(s.nextString());
        vcarddatatype.setExtendedAddress(s.nextString());
        vcarddatatype.setStreetAddress(s.nextString());
        vcarddatatype.setLocality(s.nextString());
        vcarddatatype.setRegion(s.nextString());
        vcarddatatype.setPostalCode(s.nextString());
        vcarddatatype.setCountry(s.nextString());
        return vcarddatatype;
    }

    protected volatile VCardProperty _parseText(String s, VCardDataType vcarddatatype, VCardVersion vcardversion, VCardParameters vcardparameters, List list)
    {
        return _parseText(s, vcarddatatype, vcardversion, vcardparameters, list);
    }

    protected Address _parseXml(XCardElement xcardelement, VCardParameters vcardparameters, List list)
    {
        vcardparameters = new Address();
        vcardparameters.setPoBox(sanitizeXml(xcardelement, "pobox"));
        vcardparameters.setExtendedAddress(sanitizeXml(xcardelement, "ext"));
        vcardparameters.setStreetAddress(sanitizeXml(xcardelement, "street"));
        vcardparameters.setLocality(sanitizeXml(xcardelement, "locality"));
        vcardparameters.setRegion(sanitizeXml(xcardelement, "region"));
        vcardparameters.setPostalCode(sanitizeXml(xcardelement, "code"));
        vcardparameters.setCountry(sanitizeXml(xcardelement, "country"));
        return vcardparameters;
    }

    protected volatile VCardProperty _parseXml(XCardElement xcardelement, VCardParameters vcardparameters, List list)
    {
        return _parseXml(xcardelement, vcardparameters, list);
    }

    protected void _prepareParameters(Address address, VCardParameters vcardparameters, VCardVersion vcardversion, VCard vcard)
    {
        handlePrefParam(address, vcardparameters, vcardversion, vcard);
        if (vcardversion == VCardVersion.V2_1 || vcardversion == VCardVersion.V3_0)
        {
            vcardparameters.removeAll("LABEL");
        }
    }

    protected volatile void _prepareParameters(VCardProperty vcardproperty, VCardParameters vcardparameters, VCardVersion vcardversion, VCard vcard)
    {
        _prepareParameters((Address)vcardproperty, vcardparameters, vcardversion, vcard);
    }

    protected JCardValue _writeJson(Address address)
    {
        return JCardValue.structured(new Object[] {
            address.getPoBox(), address.getExtendedAddress(), address.getStreetAddress(), address.getLocality(), address.getRegion(), address.getPostalCode(), address.getCountry()
        });
    }

    protected volatile JCardValue _writeJson(VCardProperty vcardproperty)
    {
        return _writeJson((Address)vcardproperty);
    }

    protected String _writeText(Address address, VCardVersion vcardversion)
    {
        return structured(new Object[] {
            address.getPoBox(), address.getExtendedAddress(), address.getStreetAddress(), address.getLocality(), address.getRegion(), address.getPostalCode(), address.getCountry()
        });
    }

    protected volatile String _writeText(VCardProperty vcardproperty, VCardVersion vcardversion)
    {
        return _writeText((Address)vcardproperty, vcardversion);
    }

    protected void _writeXml(Address address, XCardElement xcardelement)
    {
        xcardelement.append("pobox", address.getPoBox());
        xcardelement.append("ext", address.getExtendedAddress());
        xcardelement.append("street", address.getStreetAddress());
        xcardelement.append("locality", address.getLocality());
        xcardelement.append("region", address.getRegion());
        xcardelement.append("code", address.getPostalCode());
        xcardelement.append("country", address.getCountry());
    }

    protected volatile void _writeXml(VCardProperty vcardproperty, XCardElement xcardelement)
    {
        _writeXml((Address)vcardproperty, xcardelement);
    }
}
