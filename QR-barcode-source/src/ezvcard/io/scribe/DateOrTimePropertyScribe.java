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
import ezvcard.property.DateOrTimeProperty;
import ezvcard.property.VCardProperty;
import ezvcard.util.PartialDate;
import java.util.Date;
import java.util.List;

// Referenced classes of package ezvcard.io.scribe:
//            VCardPropertyScribe

public abstract class DateOrTimePropertyScribe extends VCardPropertyScribe
{

    public DateOrTimePropertyScribe(Class class1, String s)
    {
        super(class1, s);
    }

    private DateOrTimeProperty parse(String s, VCardVersion vcardversion, List list)
    {
        DateOrTimeProperty dateortimeproperty;
        try
        {
            boolean flag = s.contains("T");
            dateortimeproperty = newInstance(date(s), flag);
        }
        catch (IllegalArgumentException illegalargumentexception)
        {
            if (vcardversion == VCardVersion.V2_1 || vcardversion == VCardVersion.V3_0)
            {
                throw new CannotParseException("Date string could not be parsed.");
            }
            try
            {
                vcardversion = newInstance(new PartialDate(s));
            }
            // Misplaced declaration of an exception variable
            catch (VCardVersion vcardversion)
            {
                list.add("Date string could not be parsed.  Treating it as a text value.");
                return newInstance(s);
            }
            return vcardversion;
        }
        return dateortimeproperty;
    }

    protected VCardDataType _dataType(DateOrTimeProperty dateortimeproperty, VCardVersion vcardversion)
    {
        static class _cls1
        {

            static final int $SwitchMap$ezvcard$VCardVersion[];

            static 
            {
                $SwitchMap$ezvcard$VCardVersion = new int[VCardVersion.values().length];
                try
                {
                    $SwitchMap$ezvcard$VCardVersion[VCardVersion.V2_1.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    $SwitchMap$ezvcard$VCardVersion[VCardVersion.V3_0.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$ezvcard$VCardVersion[VCardVersion.V4_0.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (_cls1..SwitchMap.ezvcard.VCardVersion[vcardversion.ordinal()])
        {
        case 1: // '\001'
        case 2: // '\002'
        default:
            return null;

        case 3: // '\003'
            break;
        }
        if (dateortimeproperty.getText() != null)
        {
            return VCardDataType.TEXT;
        }
        if (dateortimeproperty.getDate() != null || dateortimeproperty.getPartialDate() != null)
        {
            if (dateortimeproperty.hasTime())
            {
                return VCardDataType.DATE_TIME;
            } else
            {
                return VCardDataType.DATE;
            }
        } else
        {
            return VCardDataType.DATE_AND_OR_TIME;
        }
    }

    protected volatile VCardDataType _dataType(VCardProperty vcardproperty, VCardVersion vcardversion)
    {
        return _dataType((DateOrTimeProperty)vcardproperty, vcardversion);
    }

    protected VCardDataType _defaultDataType(VCardVersion vcardversion)
    {
        switch (_cls1..SwitchMap.ezvcard.VCardVersion[vcardversion.ordinal()])
        {
        case 1: // '\001'
        case 2: // '\002'
        default:
            return null;

        case 3: // '\003'
            return VCardDataType.DATE_AND_OR_TIME;
        }
    }

    protected DateOrTimeProperty _parseHtml(HCardElement hcardelement, List list)
    {
        String s1 = null;
        String s = s1;
        if ("time".equals(hcardelement.tagName()))
        {
            String s2 = hcardelement.attr("datetime");
            s = s1;
            if (s2.length() > 0)
            {
                s = s2;
            }
        }
        s1 = s;
        if (s == null)
        {
            s1 = hcardelement.value();
        }
        return parse(s1, VCardVersion.V3_0, list);
    }

    protected volatile VCardProperty _parseHtml(HCardElement hcardelement, List list)
    {
        return _parseHtml(hcardelement, list);
    }

    protected DateOrTimeProperty _parseJson(JCardValue jcardvalue, VCardDataType vcarddatatype, VCardParameters vcardparameters, List list)
    {
        jcardvalue = jcardvalue.asSingle();
        if (vcarddatatype == VCardDataType.TEXT)
        {
            return newInstance(jcardvalue);
        } else
        {
            return parse(jcardvalue, VCardVersion.V4_0, list);
        }
    }

    protected volatile VCardProperty _parseJson(JCardValue jcardvalue, VCardDataType vcarddatatype, VCardParameters vcardparameters, List list)
    {
        return _parseJson(jcardvalue, vcarddatatype, vcardparameters, list);
    }

    protected DateOrTimeProperty _parseText(String s, VCardDataType vcarddatatype, VCardVersion vcardversion, VCardParameters vcardparameters, List list)
    {
        s = unescape(s);
        if (vcardversion == VCardVersion.V4_0 && vcarddatatype == VCardDataType.TEXT)
        {
            return newInstance(s);
        } else
        {
            return parse(s, vcardversion, list);
        }
    }

    protected volatile VCardProperty _parseText(String s, VCardDataType vcarddatatype, VCardVersion vcardversion, VCardParameters vcardparameters, List list)
    {
        return _parseText(s, vcarddatatype, vcardversion, vcardparameters, list);
    }

    protected DateOrTimeProperty _parseXml(XCardElement xcardelement, VCardParameters vcardparameters, List list)
    {
        vcardparameters = xcardelement.first(new VCardDataType[] {
            VCardDataType.DATE, VCardDataType.DATE_TIME, VCardDataType.DATE_AND_OR_TIME
        });
        if (vcardparameters != null)
        {
            return parse(vcardparameters, xcardelement.version(), list);
        }
        xcardelement = xcardelement.first(new VCardDataType[] {
            VCardDataType.TEXT
        });
        if (xcardelement != null)
        {
            return newInstance(xcardelement);
        } else
        {
            throw missingXmlElements(new VCardDataType[] {
                VCardDataType.DATE, VCardDataType.DATE_TIME, VCardDataType.DATE_AND_OR_TIME, VCardDataType.TEXT
            });
        }
    }

    protected volatile VCardProperty _parseXml(XCardElement xcardelement, VCardParameters vcardparameters, List list)
    {
        return _parseXml(xcardelement, vcardparameters, list);
    }

    protected JCardValue _writeJson(DateOrTimeProperty dateortimeproperty)
    {
        Object obj = dateortimeproperty.getDate();
        if (obj != null)
        {
            boolean flag = dateortimeproperty.hasTime();
            return JCardValue.single(date(((Date) (obj))).time(flag).extended(true).utc(false).write());
        }
        obj = dateortimeproperty.getPartialDate();
        if (obj != null)
        {
            return JCardValue.single(((PartialDate) (obj)).toDateAndOrTime(true));
        }
        dateortimeproperty = dateortimeproperty.getText();
        if (dateortimeproperty != null)
        {
            return JCardValue.single(dateortimeproperty);
        } else
        {
            return JCardValue.single("");
        }
    }

    protected volatile JCardValue _writeJson(VCardProperty vcardproperty)
    {
        return _writeJson((DateOrTimeProperty)vcardproperty);
    }

    protected String _writeText(DateOrTimeProperty dateortimeproperty, VCardVersion vcardversion)
    {
        Date date = dateortimeproperty.getDate();
        if (date != null)
        {
            return date(date).time(dateortimeproperty.hasTime()).extended(false).utc(false).write();
        }
        if (vcardversion == VCardVersion.V4_0)
        {
            vcardversion = dateortimeproperty.getText();
            if (vcardversion != null)
            {
                return escape(vcardversion);
            }
            dateortimeproperty = dateortimeproperty.getPartialDate();
            if (dateortimeproperty != null)
            {
                return dateortimeproperty.toDateAndOrTime(false);
            }
        }
        return "";
    }

    protected volatile String _writeText(VCardProperty vcardproperty, VCardVersion vcardversion)
    {
        return _writeText((DateOrTimeProperty)vcardproperty, vcardversion);
    }

    protected void _writeXml(DateOrTimeProperty dateortimeproperty, XCardElement xcardelement)
    {
        Object obj = dateortimeproperty.getDate();
        if (obj != null)
        {
            boolean flag = dateortimeproperty.hasTime();
            obj = date(((Date) (obj))).time(flag).extended(false).utc(false).write();
            if (flag)
            {
                dateortimeproperty = VCardDataType.DATE_TIME;
            } else
            {
                dateortimeproperty = VCardDataType.DATE;
            }
            xcardelement.append(dateortimeproperty, ((String) (obj)));
            return;
        }
        obj = dateortimeproperty.getPartialDate();
        if (obj != null)
        {
            if (((PartialDate) (obj)).hasTimeComponent() && ((PartialDate) (obj)).hasDateComponent())
            {
                dateortimeproperty = VCardDataType.DATE_TIME;
            } else
            if (((PartialDate) (obj)).hasTimeComponent())
            {
                dateortimeproperty = VCardDataType.TIME;
            } else
            if (((PartialDate) (obj)).hasDateComponent())
            {
                dateortimeproperty = VCardDataType.DATE;
            } else
            {
                dateortimeproperty = VCardDataType.DATE_AND_OR_TIME;
            }
            xcardelement.append(dateortimeproperty, ((PartialDate) (obj)).toDateAndOrTime(false));
            return;
        }
        dateortimeproperty = dateortimeproperty.getText();
        if (dateortimeproperty != null)
        {
            xcardelement.append(VCardDataType.TEXT, dateortimeproperty);
            return;
        } else
        {
            xcardelement.append(VCardDataType.DATE_AND_OR_TIME, "");
            return;
        }
    }

    protected volatile void _writeXml(VCardProperty vcardproperty, XCardElement xcardelement)
    {
        _writeXml((DateOrTimeProperty)vcardproperty, xcardelement);
    }

    protected abstract DateOrTimeProperty newInstance(PartialDate partialdate);

    protected abstract DateOrTimeProperty newInstance(String s);

    protected abstract DateOrTimeProperty newInstance(Date date, boolean flag);
}
