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
import ezvcard.property.Geo;
import ezvcard.property.VCardProperty;
import ezvcard.util.GeoUri;
import ezvcard.util.VCardFloatFormatter;
import java.util.List;

// Referenced classes of package ezvcard.io.scribe:
//            VCardPropertyScribe

public class GeoScribe extends VCardPropertyScribe
{

    public GeoScribe()
    {
        super(ezvcard/property/Geo, "GEO");
    }

    private Geo parse(String s, VCardVersion vcardversion, List list)
    {
        if (s == null || s.length() == 0)
        {
            return new Geo(null);
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
            return null;

        case 1: // '\001'
        case 2: // '\002'
            vcardversion = semistructured(s);
            s = vcardversion.next();
            vcardversion = vcardversion.next();
            if (s == null || vcardversion == null)
            {
                throw new CannotParseException("Incorrect data format.  Value must contain a latitude and longitude, separated by a semi-colon.");
            }
            try
            {
                list = Double.valueOf(s);
            }
            // Misplaced declaration of an exception variable
            catch (VCardVersion vcardversion)
            {
                throw new CannotParseException((new StringBuilder()).append("Could not parse latitude: ").append(s).toString());
            }
            try
            {
                s = Double.valueOf(vcardversion);
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                throw new CannotParseException((new StringBuilder()).append("Could not parse longtude: ").append(vcardversion).toString());
            }
            return new Geo(list, s);

        case 3: // '\003'
            break;
        }
        try
        {
            s = new Geo(GeoUri.parse(s));
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new CannotParseException("Invalid geo URI.");
        }
        return s;
    }

    private String write(Geo geo, VCardVersion vcardversion)
    {
        if (geo.getGeoUri() == null)
        {
            return "";
        }
        switch (_cls1..SwitchMap.ezvcard.VCardVersion[vcardversion.ordinal()])
        {
        default:
            return null;

        case 1: // '\001'
        case 2: // '\002'
            vcardversion = new VCardFloatFormatter(6);
            return structured(new Object[] {
                vcardversion.format(geo.getLatitude()), vcardversion.format(geo.getLongitude())
            });

        case 3: // '\003'
            return geo.getGeoUri().toString(6);
        }
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
            return VCardDataType.URI;
        }
    }

    protected Geo _parseHtml(HCardElement hcardelement, List list)
    {
        list = hcardelement.firstValue("latitude");
        if (list == null)
        {
            throw new CannotParseException("Latitude missing.");
        }
        double d;
        try
        {
            d = Double.parseDouble(list);
        }
        // Misplaced declaration of an exception variable
        catch (HCardElement hcardelement)
        {
            throw new CannotParseException((new StringBuilder()).append("Could not parse latitude: ").append(list).toString());
        }
        hcardelement = hcardelement.firstValue("longitude");
        if (hcardelement == null)
        {
            throw new CannotParseException("Longitude missing.");
        }
        double d1;
        try
        {
            d1 = Double.parseDouble(hcardelement);
        }
        // Misplaced declaration of an exception variable
        catch (List list)
        {
            throw new CannotParseException((new StringBuilder()).append("Could not parse longitude: ").append(hcardelement).toString());
        }
        return new Geo(Double.valueOf(d), Double.valueOf(d1));
    }

    protected volatile VCardProperty _parseHtml(HCardElement hcardelement, List list)
    {
        return _parseHtml(hcardelement, list);
    }

    protected Geo _parseJson(JCardValue jcardvalue, VCardDataType vcarddatatype, VCardParameters vcardparameters, List list)
    {
        return parse(jcardvalue.asSingle(), VCardVersion.V4_0, list);
    }

    protected volatile VCardProperty _parseJson(JCardValue jcardvalue, VCardDataType vcarddatatype, VCardParameters vcardparameters, List list)
    {
        return _parseJson(jcardvalue, vcarddatatype, vcardparameters, list);
    }

    protected Geo _parseText(String s, VCardDataType vcarddatatype, VCardVersion vcardversion, VCardParameters vcardparameters, List list)
    {
        return parse(unescape(s), vcardversion, list);
    }

    protected volatile VCardProperty _parseText(String s, VCardDataType vcarddatatype, VCardVersion vcardversion, VCardParameters vcardparameters, List list)
    {
        return _parseText(s, vcarddatatype, vcardversion, vcardparameters, list);
    }

    protected Geo _parseXml(XCardElement xcardelement, VCardParameters vcardparameters, List list)
    {
        vcardparameters = xcardelement.first(new VCardDataType[] {
            VCardDataType.URI
        });
        if (vcardparameters != null)
        {
            return parse(vcardparameters, xcardelement.version(), list);
        } else
        {
            throw missingXmlElements(new VCardDataType[] {
                VCardDataType.URI
            });
        }
    }

    protected volatile VCardProperty _parseXml(XCardElement xcardelement, VCardParameters vcardparameters, List list)
    {
        return _parseXml(xcardelement, vcardparameters, list);
    }

    protected JCardValue _writeJson(Geo geo)
    {
        return JCardValue.single(write(geo, VCardVersion.V4_0));
    }

    protected volatile JCardValue _writeJson(VCardProperty vcardproperty)
    {
        return _writeJson((Geo)vcardproperty);
    }

    protected String _writeText(Geo geo, VCardVersion vcardversion)
    {
        return write(geo, vcardversion);
    }

    protected volatile String _writeText(VCardProperty vcardproperty, VCardVersion vcardversion)
    {
        return _writeText((Geo)vcardproperty, vcardversion);
    }

    protected void _writeXml(Geo geo, XCardElement xcardelement)
    {
        xcardelement.append(VCardDataType.URI, write(geo, xcardelement.version()));
    }

    protected volatile void _writeXml(VCardProperty vcardproperty, XCardElement xcardelement)
    {
        _writeXml((Geo)vcardproperty, xcardelement);
    }
}
