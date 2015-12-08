// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ezvcard.io.scribe;

import ezvcard.VCardDataType;
import ezvcard.VCardVersion;
import ezvcard.io.CannotParseException;
import ezvcard.io.html.HCardElement;
import ezvcard.io.json.JCardValue;
import ezvcard.io.xml.XCardElement;
import ezvcard.parameter.VCardParameters;
import ezvcard.property.Revision;
import ezvcard.property.VCardProperty;
import java.util.Date;
import java.util.List;

// Referenced classes of package ezvcard.io.scribe:
//            VCardPropertyScribe

public class RevisionScribe extends VCardPropertyScribe
{

    public RevisionScribe()
    {
        super(ezvcard/property/Revision, "REV");
    }

    private Revision parse(String s)
    {
        if (s == null || s.length() == 0)
        {
            return new Revision(null);
        }
        try
        {
            s = new Revision(date(s));
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new CannotParseException("Could not parse timestamp.");
        }
        return s;
    }

    private String write(Revision revision, boolean flag)
    {
        revision = (Date)revision.getValue();
        if (revision == null)
        {
            return "";
        } else
        {
            return date(revision).time(true).utc(true).extended(flag).write();
        }
    }

    protected VCardDataType _defaultDataType(VCardVersion vcardversion)
    {
        return VCardDataType.TIMESTAMP;
    }

    protected Revision _parseHtml(HCardElement hcardelement, List list)
    {
        Object obj = null;
        list = ((List) (obj));
        if ("time".equals(hcardelement.tagName()))
        {
            String s = hcardelement.attr("datetime");
            list = ((List) (obj));
            if (s.length() > 0)
            {
                list = s;
            }
        }
        obj = list;
        if (list == null)
        {
            obj = hcardelement.value();
        }
        return parse(((String) (obj)));
    }

    protected volatile VCardProperty _parseHtml(HCardElement hcardelement, List list)
    {
        return _parseHtml(hcardelement, list);
    }

    protected Revision _parseJson(JCardValue jcardvalue, VCardDataType vcarddatatype, VCardParameters vcardparameters, List list)
    {
        return parse(jcardvalue.asSingle());
    }

    protected volatile VCardProperty _parseJson(JCardValue jcardvalue, VCardDataType vcarddatatype, VCardParameters vcardparameters, List list)
    {
        return _parseJson(jcardvalue, vcarddatatype, vcardparameters, list);
    }

    protected Revision _parseText(String s, VCardDataType vcarddatatype, VCardVersion vcardversion, VCardParameters vcardparameters, List list)
    {
        return parse(s);
    }

    protected volatile VCardProperty _parseText(String s, VCardDataType vcarddatatype, VCardVersion vcardversion, VCardParameters vcardparameters, List list)
    {
        return _parseText(s, vcarddatatype, vcardversion, vcardparameters, list);
    }

    protected Revision _parseXml(XCardElement xcardelement, VCardParameters vcardparameters, List list)
    {
        xcardelement = xcardelement.first(new VCardDataType[] {
            VCardDataType.TIMESTAMP
        });
        if (xcardelement != null)
        {
            return parse(xcardelement);
        } else
        {
            throw missingXmlElements(new VCardDataType[] {
                VCardDataType.TIMESTAMP
            });
        }
    }

    protected volatile VCardProperty _parseXml(XCardElement xcardelement, VCardParameters vcardparameters, List list)
    {
        return _parseXml(xcardelement, vcardparameters, list);
    }

    protected JCardValue _writeJson(Revision revision)
    {
        return JCardValue.single(write(revision, true));
    }

    protected volatile JCardValue _writeJson(VCardProperty vcardproperty)
    {
        return _writeJson((Revision)vcardproperty);
    }

    protected String _writeText(Revision revision, VCardVersion vcardversion)
    {
        return write(revision, false);
    }

    protected volatile String _writeText(VCardProperty vcardproperty, VCardVersion vcardversion)
    {
        return _writeText((Revision)vcardproperty, vcardversion);
    }

    protected void _writeXml(Revision revision, XCardElement xcardelement)
    {
        xcardelement.append(VCardDataType.TIMESTAMP, write(revision, false));
    }

    protected volatile void _writeXml(VCardProperty vcardproperty, XCardElement xcardelement)
    {
        _writeXml((Revision)vcardproperty, xcardelement);
    }
}
