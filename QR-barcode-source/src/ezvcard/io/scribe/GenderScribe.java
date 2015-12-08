// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ezvcard.io.scribe;

import ezvcard.VCardDataType;
import ezvcard.VCardVersion;
import ezvcard.io.json.JCardValue;
import ezvcard.io.xml.XCardElement;
import ezvcard.parameter.VCardParameters;
import ezvcard.property.Gender;
import ezvcard.property.VCardProperty;
import java.util.List;

// Referenced classes of package ezvcard.io.scribe:
//            VCardPropertyScribe

public class GenderScribe extends VCardPropertyScribe
{

    public GenderScribe()
    {
        super(ezvcard/property/Gender, "GENDER");
    }

    protected VCardDataType _defaultDataType(VCardVersion vcardversion)
    {
        return VCardDataType.TEXT;
    }

    protected Gender _parseJson(JCardValue jcardvalue, VCardDataType vcarddatatype, VCardParameters vcardparameters, List list)
    {
        vcardparameters = structured(jcardvalue);
        vcarddatatype = vcardparameters.nextString();
        jcardvalue = vcarddatatype;
        if (vcarddatatype != null)
        {
            jcardvalue = vcarddatatype.toUpperCase();
        }
        vcarddatatype = vcardparameters.nextString();
        jcardvalue = new Gender(jcardvalue);
        jcardvalue.setText(vcarddatatype);
        return jcardvalue;
    }

    protected volatile VCardProperty _parseJson(JCardValue jcardvalue, VCardDataType vcarddatatype, VCardParameters vcardparameters, List list)
    {
        return _parseJson(jcardvalue, vcarddatatype, vcardparameters, list);
    }

    protected Gender _parseText(String s, VCardDataType vcarddatatype, VCardVersion vcardversion, VCardParameters vcardparameters, List list)
    {
        vcardversion = semistructured(s, 2);
        vcarddatatype = vcardversion.next();
        s = vcarddatatype;
        if (vcarddatatype != null)
        {
            s = vcarddatatype.toUpperCase();
        }
        vcarddatatype = vcardversion.next();
        s = new Gender(s);
        s.setText(vcarddatatype);
        return s;
    }

    protected volatile VCardProperty _parseText(String s, VCardDataType vcarddatatype, VCardVersion vcardversion, VCardParameters vcardparameters, List list)
    {
        return _parseText(s, vcarddatatype, vcardversion, vcardparameters, list);
    }

    protected Gender _parseXml(XCardElement xcardelement, VCardParameters vcardparameters, List list)
    {
        vcardparameters = xcardelement.first(new String[] {
            "sex"
        });
        if (vcardparameters != null)
        {
            vcardparameters = new Gender(vcardparameters);
            vcardparameters.setText(xcardelement.first(new String[] {
                "identity"
            }));
            return vcardparameters;
        } else
        {
            throw missingXmlElements(new String[] {
                "sex"
            });
        }
    }

    protected volatile VCardProperty _parseXml(XCardElement xcardelement, VCardParameters vcardparameters, List list)
    {
        return _parseXml(xcardelement, vcardparameters, list);
    }

    protected JCardValue _writeJson(Gender gender)
    {
        String s = gender.getGender();
        gender = gender.getText();
        if (gender == null)
        {
            return JCardValue.single(s);
        } else
        {
            return JCardValue.structured(new Object[] {
                s, gender
            });
        }
    }

    protected volatile JCardValue _writeJson(VCardProperty vcardproperty)
    {
        return _writeJson((Gender)vcardproperty);
    }

    protected String _writeText(Gender gender, VCardVersion vcardversion)
    {
        vcardversion = gender.getGender();
        gender = gender.getText();
        if (gender != null)
        {
            return structured(new Object[] {
                vcardversion, gender
            });
        }
        if (vcardversion != null)
        {
            return structured(new Object[] {
                vcardversion
            });
        } else
        {
            return "";
        }
    }

    protected volatile String _writeText(VCardProperty vcardproperty, VCardVersion vcardversion)
    {
        return _writeText((Gender)vcardproperty, vcardversion);
    }

    protected void _writeXml(Gender gender, XCardElement xcardelement)
    {
        xcardelement.append("sex", gender.getGender());
        gender = gender.getText();
        if (gender != null)
        {
            xcardelement.append("identity", gender);
        }
    }

    protected volatile void _writeXml(VCardProperty vcardproperty, XCardElement xcardelement)
    {
        _writeXml((Gender)vcardproperty, xcardelement);
    }
}
