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
import ezvcard.property.Organization;
import ezvcard.property.VCardProperty;
import java.util.List;

// Referenced classes of package ezvcard.io.scribe:
//            VCardPropertyScribe

public class OrganizationScribe extends VCardPropertyScribe
{

    public OrganizationScribe()
    {
        super(ezvcard/property/Organization, "ORG");
    }

    protected VCardDataType _defaultDataType(VCardVersion vcardversion)
    {
        return VCardDataType.TEXT;
    }

    protected Organization _parseHtml(HCardElement hcardelement, List list)
    {
        list = new Organization();
        String s = hcardelement.firstValue("organization-name");
        if (s != null)
        {
            list.addValue(s);
        }
        s = hcardelement.firstValue("organization-unit");
        if (s != null)
        {
            list.addValue(s);
        }
        if (list.getValues().isEmpty())
        {
            list.addValue(hcardelement.value());
        }
        return list;
    }

    protected volatile VCardProperty _parseHtml(HCardElement hcardelement, List list)
    {
        return _parseHtml(hcardelement, list);
    }

    protected Organization _parseJson(JCardValue jcardvalue, VCardDataType vcarddatatype, VCardParameters vcardparameters, List list)
    {
        vcarddatatype = new Organization();
        for (jcardvalue = structured(jcardvalue); jcardvalue.hasNext(); vcarddatatype.addValue(jcardvalue.nextString())) { }
        return vcarddatatype;
    }

    protected volatile VCardProperty _parseJson(JCardValue jcardvalue, VCardDataType vcarddatatype, VCardParameters vcardparameters, List list)
    {
        return _parseJson(jcardvalue, vcarddatatype, vcardparameters, list);
    }

    protected Organization _parseText(String s, VCardDataType vcarddatatype, VCardVersion vcardversion, VCardParameters vcardparameters, List list)
    {
        vcarddatatype = new Organization();
        for (s = semistructured(s); s.hasNext(); vcarddatatype.addValue(s.next())) { }
        return vcarddatatype;
    }

    protected volatile VCardProperty _parseText(String s, VCardDataType vcarddatatype, VCardVersion vcardversion, VCardParameters vcardparameters, List list)
    {
        return _parseText(s, vcarddatatype, vcardversion, vcardparameters, list);
    }

    protected Organization _parseXml(XCardElement xcardelement, VCardParameters vcardparameters, List list)
    {
        xcardelement = xcardelement.all(VCardDataType.TEXT);
        if (!xcardelement.isEmpty())
        {
            vcardparameters = new Organization();
            vcardparameters.getValues().addAll(xcardelement);
            return vcardparameters;
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

    protected JCardValue _writeJson(Organization organization)
    {
        organization = organization.getValues();
        if (organization.isEmpty())
        {
            return JCardValue.single("");
        }
        if (organization.size() == 1)
        {
            return JCardValue.single(organization.get(0));
        } else
        {
            return JCardValue.structured(new Object[] {
                organization
            });
        }
    }

    protected volatile JCardValue _writeJson(VCardProperty vcardproperty)
    {
        return _writeJson((Organization)vcardproperty);
    }

    protected String _writeText(Organization organization, VCardVersion vcardversion)
    {
        return structured(new Object[] {
            organization.getValues()
        });
    }

    protected volatile String _writeText(VCardProperty vcardproperty, VCardVersion vcardversion)
    {
        return _writeText((Organization)vcardproperty, vcardversion);
    }

    protected void _writeXml(Organization organization, XCardElement xcardelement)
    {
        xcardelement.append(VCardDataType.TEXT.getName().toLowerCase(), organization.getValues());
    }

    protected volatile void _writeXml(VCardProperty vcardproperty, XCardElement xcardelement)
    {
        _writeXml((Organization)vcardproperty, xcardelement);
    }
}
