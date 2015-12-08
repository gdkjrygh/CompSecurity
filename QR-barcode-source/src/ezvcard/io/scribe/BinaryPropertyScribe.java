// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ezvcard.io.scribe;

import ezvcard.VCard;
import ezvcard.VCardDataType;
import ezvcard.VCardVersion;
import ezvcard.io.CannotParseException;
import ezvcard.io.html.HCardElement;
import ezvcard.io.json.JCardValue;
import ezvcard.io.xml.XCardElement;
import ezvcard.parameter.Encoding;
import ezvcard.parameter.MediaTypeParameter;
import ezvcard.parameter.VCardParameters;
import ezvcard.property.BinaryProperty;
import ezvcard.property.VCardProperty;
import ezvcard.util.DataUri;
import ezvcard.util.org.apache.commons.codec.binary.Base64;
import java.util.List;

// Referenced classes of package ezvcard.io.scribe:
//            VCardPropertyScribe

public abstract class BinaryPropertyScribe extends VCardPropertyScribe
{

    public BinaryPropertyScribe(Class class1, String s)
    {
        super(class1, s);
    }

    private BinaryProperty parse(String s, VCardDataType vcarddatatype, VCardParameters vcardparameters, VCardVersion vcardversion, List list)
    {
        MediaTypeParameter mediatypeparameter = parseContentType(vcardparameters, vcardversion);
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

        _cls1..SwitchMap.ezvcard.VCardVersion[vcardversion.ordinal()];
        JVM INSTR tableswitch 1 3: default 44
    //                   1 58
    //                   2 58
    //                   3 113;
           goto _L1 _L2 _L2 _L3
_L1:
        vcarddatatype = mediatypeparameter;
_L5:
        return cannotUnmarshalValue(s, vcardversion, list, vcarddatatype);
_L2:
        if (vcarddatatype == VCardDataType.URL || vcarddatatype == VCardDataType.URI)
        {
            return _newInstance(s, mediatypeparameter);
        }
        vcardparameters = vcardparameters.getEncoding();
        if (vcardparameters != Encoding.BASE64)
        {
            vcarddatatype = mediatypeparameter;
            if (vcardparameters != Encoding.B)
            {
                continue; /* Loop/switch isn't completed */
            }
        }
        return _newInstance(Base64.decodeBase64(s), mediatypeparameter);
_L3:
        vcarddatatype = mediatypeparameter;
        DataUri datauri = new DataUri(s);
        vcarddatatype = mediatypeparameter;
        vcardparameters = _buildMediaTypeObj(datauri.getContentType());
        vcarddatatype = vcardparameters;
        vcardparameters = _newInstance(datauri.getData(), vcardparameters);
        return vcardparameters;
        vcardparameters;
        if (true) goto _L5; else goto _L4
_L4:
    }

    private String write(BinaryProperty binaryproperty, VCardVersion vcardversion)
    {
        byte abyte0[];
        String s = binaryproperty.getUrl();
        if (s != null)
        {
            return s;
        }
        abyte0 = binaryproperty.getData();
        if (abyte0 == null) goto _L2; else goto _L1
_L1:
        _cls1..SwitchMap.ezvcard.VCardVersion[vcardversion.ordinal()];
        JVM INSTR tableswitch 1 3: default 56
    //                   1 59
    //                   2 59
    //                   3 71;
           goto _L2 _L3 _L3 _L4
_L2:
        return "";
_L3:
        return new String(Base64.encodeBase64(abyte0));
_L4:
        binaryproperty = binaryproperty.getContentType();
        if (binaryproperty == null || binaryproperty.getMediaType() == null)
        {
            binaryproperty = "application/octet-stream";
        } else
        {
            binaryproperty = binaryproperty.getMediaType();
        }
        return (new DataUri(binaryproperty, abyte0)).toString();
    }

    protected abstract MediaTypeParameter _buildMediaTypeObj(String s);

    protected abstract MediaTypeParameter _buildTypeObj(String s);

    protected VCardDataType _dataType(BinaryProperty binaryproperty, VCardVersion vcardversion)
    {
        if (binaryproperty.getUrl() == null) goto _L2; else goto _L1
_L1:
        _cls1..SwitchMap.ezvcard.VCardVersion[vcardversion.ordinal()];
        JVM INSTR tableswitch 1 3: default 40
    //                   1 86
    //                   2 90
    //                   3 90;
           goto _L2 _L3 _L4 _L4
_L2:
        if (binaryproperty.getData() == null) goto _L6; else goto _L5
_L5:
        _cls1..SwitchMap.ezvcard.VCardVersion[vcardversion.ordinal()];
        JVM INSTR tableswitch 1 3: default 80
    //                   1 94
    //                   2 94
    //                   3 96;
           goto _L6 _L7 _L7 _L8
_L6:
        return _defaultDataType(vcardversion);
_L3:
        return VCardDataType.URL;
_L4:
        return VCardDataType.URI;
_L7:
        return null;
_L8:
        return VCardDataType.URI;
    }

    protected volatile VCardDataType _dataType(VCardProperty vcardproperty, VCardVersion vcardversion)
    {
        return _dataType((BinaryProperty)vcardproperty, vcardversion);
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

    protected abstract BinaryProperty _newInstance(String s, MediaTypeParameter mediatypeparameter);

    protected abstract BinaryProperty _newInstance(byte abyte0[], MediaTypeParameter mediatypeparameter);

    protected BinaryProperty _parseHtml(HCardElement hcardelement, List list)
    {
        list = hcardelement.tagName();
        if (!"object".equals(list))
        {
            throw new CannotParseException((new StringBuilder()).append("Cannot parse <").append(list).append("> tag (<object> tag expected).").toString());
        }
        String s = hcardelement.absUrl("data");
        if (s.length() == 0)
        {
            throw new CannotParseException("<object> tag does not have a \"data\" attribute.");
        }
        try
        {
            list = new DataUri(s);
            MediaTypeParameter mediatypeparameter = _buildMediaTypeObj(list.getContentType());
            list = _newInstance(list.getData(), mediatypeparameter);
        }
        // Misplaced declaration of an exception variable
        catch (List list)
        {
            list = null;
            String s1 = hcardelement.attr("type");
            hcardelement = list;
            if (s1.length() > 0)
            {
                hcardelement = _buildMediaTypeObj(s1);
            }
            return _newInstance(s, hcardelement);
        }
        return list;
    }

    protected volatile VCardProperty _parseHtml(HCardElement hcardelement, List list)
    {
        return _parseHtml(hcardelement, list);
    }

    protected BinaryProperty _parseJson(JCardValue jcardvalue, VCardDataType vcarddatatype, VCardParameters vcardparameters, List list)
    {
        return parse(jcardvalue.asSingle(), vcarddatatype, vcardparameters, VCardVersion.V4_0, list);
    }

    protected volatile VCardProperty _parseJson(JCardValue jcardvalue, VCardDataType vcarddatatype, VCardParameters vcardparameters, List list)
    {
        return _parseJson(jcardvalue, vcarddatatype, vcardparameters, list);
    }

    protected BinaryProperty _parseText(String s, VCardDataType vcarddatatype, VCardVersion vcardversion, VCardParameters vcardparameters, List list)
    {
        return parse(unescape(s), vcarddatatype, vcardparameters, vcardversion, list);
    }

    protected volatile VCardProperty _parseText(String s, VCardDataType vcarddatatype, VCardVersion vcardversion, VCardParameters vcardparameters, List list)
    {
        return _parseText(s, vcarddatatype, vcardversion, vcardparameters, list);
    }

    protected BinaryProperty _parseXml(XCardElement xcardelement, VCardParameters vcardparameters, List list)
    {
        String s = xcardelement.first(new VCardDataType[] {
            VCardDataType.URI
        });
        if (s != null)
        {
            return parse(s, VCardDataType.URI, vcardparameters, xcardelement.version(), list);
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

    protected void _prepareParameters(BinaryProperty binaryproperty, VCardParameters vcardparameters, VCardVersion vcardversion, VCard vcard)
    {
        MediaTypeParameter mediatypeparameter = binaryproperty.getContentType();
        vcard = mediatypeparameter;
        if (mediatypeparameter == null)
        {
            vcard = new MediaTypeParameter(null, null, null);
        }
        if (binaryproperty.getUrl() == null) goto _L2; else goto _L1
_L1:
        vcardparameters.setEncoding(null);
        _cls1..SwitchMap.ezvcard.VCardVersion[vcardversion.ordinal()];
        JVM INSTR tableswitch 1 3: default 72
    //                   1 121
    //                   2 136
    //                   3 151;
           goto _L2 _L3 _L4 _L5
_L2:
        if (binaryproperty.getData() == null) goto _L7; else goto _L6
_L6:
        vcardparameters.setMediaType(null);
        _cls1..SwitchMap.ezvcard.VCardVersion[vcardversion.ordinal()];
        JVM INSTR tableswitch 1 3: default 120
    //                   1 161
    //                   2 178
    //                   3 195;
           goto _L7 _L8 _L9 _L10
_L7:
        return;
_L3:
        vcardparameters.setType(vcard.getValue());
        vcardparameters.setMediaType(null);
        return;
_L4:
        vcardparameters.setType(vcard.getValue());
        vcardparameters.setMediaType(null);
        return;
_L5:
        vcardparameters.setMediaType(vcard.getMediaType());
        return;
_L8:
        vcardparameters.setEncoding(Encoding.BASE64);
        vcardparameters.setType(vcard.getValue());
        return;
_L9:
        vcardparameters.setEncoding(Encoding.B);
        vcardparameters.setType(vcard.getValue());
        return;
_L10:
        vcardparameters.setEncoding(null);
        return;
    }

    protected volatile void _prepareParameters(VCardProperty vcardproperty, VCardParameters vcardparameters, VCardVersion vcardversion, VCard vcard)
    {
        _prepareParameters((BinaryProperty)vcardproperty, vcardparameters, vcardversion, vcard);
    }

    protected JCardValue _writeJson(BinaryProperty binaryproperty)
    {
        return JCardValue.single(write(binaryproperty, VCardVersion.V4_0));
    }

    protected volatile JCardValue _writeJson(VCardProperty vcardproperty)
    {
        return _writeJson((BinaryProperty)vcardproperty);
    }

    protected String _writeText(BinaryProperty binaryproperty, VCardVersion vcardversion)
    {
        return write(binaryproperty, vcardversion);
    }

    protected volatile String _writeText(VCardProperty vcardproperty, VCardVersion vcardversion)
    {
        return _writeText((BinaryProperty)vcardproperty, vcardversion);
    }

    protected void _writeXml(BinaryProperty binaryproperty, XCardElement xcardelement)
    {
        xcardelement.append(VCardDataType.URI, write(binaryproperty, xcardelement.version()));
    }

    protected volatile void _writeXml(VCardProperty vcardproperty, XCardElement xcardelement)
    {
        _writeXml((BinaryProperty)vcardproperty, xcardelement);
    }

    protected BinaryProperty cannotUnmarshalValue(String s, VCardVersion vcardversion, List list, MediaTypeParameter mediatypeparameter)
    {
        switch (_cls1..SwitchMap.ezvcard.VCardVersion[vcardversion.ordinal()])
        {
        default:
            return null;

        case 1: // '\001'
        case 2: // '\002'
            if (s.startsWith("http"))
            {
                return _newInstance(s, mediatypeparameter);
            } else
            {
                return _newInstance(Base64.decodeBase64(s), mediatypeparameter);
            }

        case 3: // '\003'
            return _newInstance(s, mediatypeparameter);
        }
    }

    protected MediaTypeParameter parseContentType(VCardParameters vcardparameters, VCardVersion vcardversion)
    {
        _cls1..SwitchMap.ezvcard.VCardVersion[vcardversion.ordinal()];
        JVM INSTR tableswitch 1 3: default 36
    //                   1 38
    //                   2 38
    //                   3 53;
           goto _L1 _L2 _L2 _L3
_L1:
        return null;
_L2:
        if ((vcardparameters = vcardparameters.getType()) != null)
        {
            return _buildTypeObj(vcardparameters);
        }
        continue; /* Loop/switch isn't completed */
_L3:
        vcardparameters = vcardparameters.getMediaType();
        if (vcardparameters != null)
        {
            return _buildMediaTypeObj(vcardparameters);
        }
        if (true) goto _L1; else goto _L4
_L4:
    }
}
