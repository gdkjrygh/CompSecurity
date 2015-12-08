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
import ezvcard.property.StructuredName;
import ezvcard.property.VCardProperty;
import java.util.List;

// Referenced classes of package ezvcard.io.scribe:
//            VCardPropertyScribe

public class StructuredNameScribe extends VCardPropertyScribe
{

    public StructuredNameScribe()
    {
        super(ezvcard/property/StructuredName, "N");
    }

    private String s(String s1)
    {
        String s2;
label0:
        {
            if (s1 != null)
            {
                s2 = s1;
                if (s1.length() != 0)
                {
                    break label0;
                }
            }
            s2 = null;
        }
        return s2;
    }

    protected VCardDataType _defaultDataType(VCardVersion vcardversion)
    {
        return VCardDataType.TEXT;
    }

    protected StructuredName _parseHtml(HCardElement hcardelement, List list)
    {
        list = new StructuredName();
        list.setFamily(s(hcardelement.firstValue("family-name")));
        list.setGiven(s(hcardelement.firstValue("given-name")));
        list.getAdditional().addAll(hcardelement.allValues("additional-name"));
        list.getPrefixes().addAll(hcardelement.allValues("honorific-prefix"));
        list.getSuffixes().addAll(hcardelement.allValues("honorific-suffix"));
        return list;
    }

    protected volatile VCardProperty _parseHtml(HCardElement hcardelement, List list)
    {
        return _parseHtml(hcardelement, list);
    }

    protected StructuredName _parseJson(JCardValue jcardvalue, VCardDataType vcarddatatype, VCardParameters vcardparameters, List list)
    {
        vcarddatatype = new StructuredName();
        jcardvalue = structured(jcardvalue);
        vcarddatatype.setFamily(jcardvalue.nextString());
        vcarddatatype.setGiven(jcardvalue.nextString());
        vcarddatatype.getAdditional().addAll(jcardvalue.nextComponent());
        vcarddatatype.getPrefixes().addAll(jcardvalue.nextComponent());
        vcarddatatype.getSuffixes().addAll(jcardvalue.nextComponent());
        return vcarddatatype;
    }

    protected volatile VCardProperty _parseJson(JCardValue jcardvalue, VCardDataType vcarddatatype, VCardParameters vcardparameters, List list)
    {
        return _parseJson(jcardvalue, vcarddatatype, vcardparameters, list);
    }

    protected StructuredName _parseText(String s1, VCardDataType vcarddatatype, VCardVersion vcardversion, VCardParameters vcardparameters, List list)
    {
        vcarddatatype = new StructuredName();
        s1 = structured(s1);
        vcarddatatype.setFamily(s1.nextString());
        vcarddatatype.setGiven(s1.nextString());
        vcarddatatype.getAdditional().addAll(s1.nextComponent());
        vcarddatatype.getPrefixes().addAll(s1.nextComponent());
        vcarddatatype.getSuffixes().addAll(s1.nextComponent());
        return vcarddatatype;
    }

    protected volatile VCardProperty _parseText(String s1, VCardDataType vcarddatatype, VCardVersion vcardversion, VCardParameters vcardparameters, List list)
    {
        return _parseText(s1, vcarddatatype, vcardversion, vcardparameters, list);
    }

    protected StructuredName _parseXml(XCardElement xcardelement, VCardParameters vcardparameters, List list)
    {
        vcardparameters = new StructuredName();
        vcardparameters.setFamily(s(xcardelement.first(new String[] {
            "surname"
        })));
        vcardparameters.setGiven(s(xcardelement.first(new String[] {
            "given"
        })));
        vcardparameters.getAdditional().addAll(xcardelement.all("additional"));
        vcardparameters.getPrefixes().addAll(xcardelement.all("prefix"));
        vcardparameters.getSuffixes().addAll(xcardelement.all("suffix"));
        return vcardparameters;
    }

    protected volatile VCardProperty _parseXml(XCardElement xcardelement, VCardParameters vcardparameters, List list)
    {
        return _parseXml(xcardelement, vcardparameters, list);
    }

    protected JCardValue _writeJson(StructuredName structuredname)
    {
        return JCardValue.structured(new Object[] {
            structuredname.getFamily(), structuredname.getGiven(), structuredname.getAdditional(), structuredname.getPrefixes(), structuredname.getSuffixes()
        });
    }

    protected volatile JCardValue _writeJson(VCardProperty vcardproperty)
    {
        return _writeJson((StructuredName)vcardproperty);
    }

    protected String _writeText(StructuredName structuredname, VCardVersion vcardversion)
    {
        return structured(new Object[] {
            structuredname.getFamily(), structuredname.getGiven(), structuredname.getAdditional(), structuredname.getPrefixes(), structuredname.getSuffixes()
        });
    }

    protected volatile String _writeText(VCardProperty vcardproperty, VCardVersion vcardversion)
    {
        return _writeText((StructuredName)vcardproperty, vcardversion);
    }

    protected void _writeXml(StructuredName structuredname, XCardElement xcardelement)
    {
        xcardelement.append("surname", structuredname.getFamily());
        xcardelement.append("given", structuredname.getGiven());
        xcardelement.append("additional", structuredname.getAdditional());
        xcardelement.append("prefix", structuredname.getPrefixes());
        xcardelement.append("suffix", structuredname.getSuffixes());
    }

    protected volatile void _writeXml(VCardProperty vcardproperty, XCardElement xcardelement)
    {
        _writeXml((StructuredName)vcardproperty, xcardelement);
    }
}
