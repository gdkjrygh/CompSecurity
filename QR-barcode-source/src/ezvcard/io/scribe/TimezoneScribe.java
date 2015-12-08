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
import ezvcard.property.Timezone;
import ezvcard.property.VCardProperty;
import ezvcard.util.UtcOffset;
import java.util.List;
import java.util.TimeZone;

// Referenced classes of package ezvcard.io.scribe:
//            VCardPropertyScribe

public class TimezoneScribe extends VCardPropertyScribe
{

    public TimezoneScribe()
    {
        super(ezvcard/property/Timezone, "TZ");
    }

    private UtcOffset offsetFromTimezone(TimeZone timezone)
    {
        long l = timezone.getOffset(System.currentTimeMillis());
        int k = (int)(l / 1000L / 60L / 60L);
        int j = (int)((l / 1000L / 60L) % 60L);
        int i = j;
        if (j < 0)
        {
            i = j * -1;
        }
        return new UtcOffset(k, i);
    }

    private Timezone parse(String s, VCardDataType vcarddatatype, VCardVersion vcardversion, List list)
    {
        if (s == null || s.length() == 0)
        {
            return new Timezone((String)null);
        }
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
        default:
            return new Timezone((String)null);

        case 1: // '\001'
            try
            {
                s = new Timezone(UtcOffset.parse(s));
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                throw new CannotParseException("Unable to parse UTC offset.");
            }
            return s;

        case 2: // '\002'
        case 3: // '\003'
            break;
        }
        try
        {
            vcardversion = new Timezone(UtcOffset.parse(s));
        }
        // Misplaced declaration of an exception variable
        catch (VCardVersion vcardversion)
        {
            if (vcarddatatype == VCardDataType.UTC_OFFSET)
            {
                list.add((new StringBuilder()).append("Unable to parse UTC offset.  Treating as text: ").append(s).toString());
            }
            return new Timezone(s);
        }
        return vcardversion;
    }

    private TimeZone timezoneFromId(String s)
    {
        TimeZone timezone = TimeZone.getTimeZone(s);
        s = timezone;
        if ("GMT".equals(timezone.getID()))
        {
            s = null;
        }
        return s;
    }

    protected VCardDataType _dataType(Timezone timezone, VCardVersion vcardversion)
    {
        String s;
        s = timezone.getText();
        timezone = timezone.getOffset();
        _cls1..SwitchMap.ezvcard.VCardVersion[vcardversion.ordinal()];
        JVM INSTR tableswitch 1 3: default 44
    //                   1 50
    //                   2 54
    //                   3 70;
           goto _L1 _L2 _L3 _L4
_L1:
        return _defaultDataType(vcardversion);
_L2:
        return VCardDataType.UTC_OFFSET;
_L3:
        if (timezone != null)
        {
            return VCardDataType.UTC_OFFSET;
        }
        if (s != null)
        {
            return VCardDataType.TEXT;
        }
        continue; /* Loop/switch isn't completed */
_L4:
        if (s != null)
        {
            return VCardDataType.TEXT;
        }
        if (timezone != null)
        {
            return VCardDataType.UTC_OFFSET;
        }
        if (true) goto _L1; else goto _L5
_L5:
    }

    protected volatile VCardDataType _dataType(VCardProperty vcardproperty, VCardVersion vcardversion)
    {
        return _dataType((Timezone)vcardproperty, vcardversion);
    }

    protected VCardDataType _defaultDataType(VCardVersion vcardversion)
    {
        switch (_cls1..SwitchMap.ezvcard.VCardVersion[vcardversion.ordinal()])
        {
        default:
            return null;

        case 1: // '\001'
        case 2: // '\002'
            return VCardDataType.UTC_OFFSET;

        case 3: // '\003'
            return VCardDataType.TEXT;
        }
    }

    protected Timezone _parseHtml(HCardElement hcardelement, List list)
    {
        return parse(hcardelement.value(), null, VCardVersion.V3_0, list);
    }

    protected volatile VCardProperty _parseHtml(HCardElement hcardelement, List list)
    {
        return _parseHtml(hcardelement, list);
    }

    protected Timezone _parseJson(JCardValue jcardvalue, VCardDataType vcarddatatype, VCardParameters vcardparameters, List list)
    {
        return parse(jcardvalue.asSingle(), vcarddatatype, VCardVersion.V4_0, list);
    }

    protected volatile VCardProperty _parseJson(JCardValue jcardvalue, VCardDataType vcarddatatype, VCardParameters vcardparameters, List list)
    {
        return _parseJson(jcardvalue, vcarddatatype, vcardparameters, list);
    }

    protected Timezone _parseText(String s, VCardDataType vcarddatatype, VCardVersion vcardversion, VCardParameters vcardparameters, List list)
    {
        return parse(unescape(s), vcarddatatype, vcardversion, list);
    }

    protected volatile VCardProperty _parseText(String s, VCardDataType vcarddatatype, VCardVersion vcardversion, VCardParameters vcardparameters, List list)
    {
        return _parseText(s, vcarddatatype, vcardversion, vcardparameters, list);
    }

    protected Timezone _parseXml(XCardElement xcardelement, VCardParameters vcardparameters, List list)
    {
        vcardparameters = xcardelement.first(new VCardDataType[] {
            VCardDataType.TEXT
        });
        if (vcardparameters != null)
        {
            return new Timezone(vcardparameters);
        }
        xcardelement = xcardelement.first(new VCardDataType[] {
            VCardDataType.UTC_OFFSET
        });
        if (xcardelement != null)
        {
            try
            {
                xcardelement = new Timezone(UtcOffset.parse(xcardelement));
            }
            // Misplaced declaration of an exception variable
            catch (XCardElement xcardelement)
            {
                throw new CannotParseException("Unable to parse UTC offset.");
            }
            return xcardelement;
        } else
        {
            throw missingXmlElements(new VCardDataType[] {
                VCardDataType.TEXT, VCardDataType.UTC_OFFSET
            });
        }
    }

    protected volatile VCardProperty _parseXml(XCardElement xcardelement, VCardParameters vcardparameters, List list)
    {
        return _parseXml(xcardelement, vcardparameters, list);
    }

    protected JCardValue _writeJson(Timezone timezone)
    {
        String s = timezone.getText();
        if (s != null)
        {
            return JCardValue.single(s);
        }
        timezone = timezone.getOffset();
        if (timezone != null)
        {
            return JCardValue.single(timezone.toString(true));
        } else
        {
            return JCardValue.single("");
        }
    }

    protected volatile JCardValue _writeJson(VCardProperty vcardproperty)
    {
        return _writeJson((Timezone)vcardproperty);
    }

    protected String _writeText(Timezone timezone, VCardVersion vcardversion)
    {
        String s;
        s = timezone.getText();
        timezone = timezone.getOffset();
        _cls1..SwitchMap.ezvcard.VCardVersion[vcardversion.ordinal()];
        JVM INSTR tableswitch 1 3: default 44
    //                   1 47
    //                   2 81
    //                   3 100;
           goto _L1 _L2 _L3 _L4
_L1:
        return "";
_L2:
        if (timezone != null)
        {
            return timezone.toString(false);
        }
        if (s != null)
        {
            timezone = timezoneFromId(s);
            if (timezone != null)
            {
                return offsetFromTimezone(timezone).toString(false);
            }
        }
        continue; /* Loop/switch isn't completed */
_L3:
        if (timezone != null)
        {
            return timezone.toString(true);
        }
        if (s != null)
        {
            return escape(s);
        }
        if (true) goto _L1; else goto _L4
_L4:
        if (s != null)
        {
            return escape(s);
        }
        if (timezone != null)
        {
            return timezone.toString(false);
        }
        if (true) goto _L1; else goto _L5
_L5:
    }

    protected volatile String _writeText(VCardProperty vcardproperty, VCardVersion vcardversion)
    {
        return _writeText((Timezone)vcardproperty, vcardversion);
    }

    protected void _writeXml(Timezone timezone, XCardElement xcardelement)
    {
        String s = timezone.getText();
        if (s != null)
        {
            xcardelement.append(VCardDataType.TEXT, s);
            return;
        }
        timezone = timezone.getOffset();
        if (timezone != null)
        {
            xcardelement.append(VCardDataType.UTC_OFFSET, timezone.toString(false));
            return;
        } else
        {
            xcardelement.append(VCardDataType.TEXT, "");
            return;
        }
    }

    protected volatile void _writeXml(VCardProperty vcardproperty, XCardElement xcardelement)
    {
        _writeXml((Timezone)vcardproperty, xcardelement);
    }
}
