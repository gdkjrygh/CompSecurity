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
import ezvcard.property.Impp;
import ezvcard.property.VCardProperty;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Referenced classes of package ezvcard.io.scribe:
//            VCardPropertyScribe

public class ImppScribe extends VCardPropertyScribe
{
    private static class HtmlLinkFormat
    {

        private final int handleGroup;
        private final String linkFormat;
        private final Pattern parseRegex;
        private final String protocol;

        public String buildLink(String s)
        {
            return String.format(linkFormat, new Object[] {
                s
            });
        }

        public String getProtocol()
        {
            return protocol;
        }

        public String parseHandle(String s)
        {
            s = parseRegex.matcher(s);
            if (s.find())
            {
                return s.group(handleGroup);
            } else
            {
                return null;
            }
        }

        public HtmlLinkFormat(String s)
        {
            this(s, "(.*)", 1, "%s");
        }

        public HtmlLinkFormat(String s, String s1, int i, String s2)
        {
            parseRegex = Pattern.compile((new StringBuilder()).append('^').append(s).append(':').append(s1).toString(), 2);
            protocol = s;
            handleGroup = i;
            linkFormat = (new StringBuilder()).append(s).append(':').append(s2).toString();
        }
    }


    public static final String AIM = "aim";
    public static final String ICQ = "icq";
    public static final String IRC = "irc";
    public static final String MSN = "msnim";
    public static final String SIP = "sip";
    public static final String SKYPE = "skype";
    public static final String XMPP = "xmpp";
    public static final String YAHOO = "ymsgr";
    private static final List htmlLinkFormats;

    public ImppScribe()
    {
        super(ezvcard/property/Impp, "IMPP");
    }

    private Impp parse(String s)
    {
        if (s == null || s.length() == 0)
        {
            return new Impp((URI)null);
        }
        Impp impp;
        try
        {
            impp = new Impp(s);
        }
        catch (IllegalArgumentException illegalargumentexception)
        {
            throw new CannotParseException((new StringBuilder()).append("Cannot parse URI \"").append(s).append("\": ").append(illegalargumentexception.getMessage()).toString());
        }
        return impp;
    }

    private String write(Impp impp)
    {
        impp = impp.getUri();
        if (impp == null)
        {
            return "";
        } else
        {
            return impp.toString();
        }
    }

    protected VCardDataType _defaultDataType(VCardVersion vcardversion)
    {
        return VCardDataType.URI;
    }

    protected Impp _parseHtml(HCardElement hcardelement, List list)
    {
        String s = hcardelement.attr("href");
        list = s;
        if (s.length() == 0)
        {
            list = hcardelement.value();
        }
        try
        {
            hcardelement = parseHtmlLink(list);
        }
        // Misplaced declaration of an exception variable
        catch (HCardElement hcardelement)
        {
            throw new CannotParseException((new StringBuilder()).append("Could not parse instant messenger information from link: ").append(list).toString());
        }
        if (hcardelement != null)
        {
            break MISSING_BLOCK_LABEL_67;
        }
        throw new IllegalArgumentException();
        hcardelement = new Impp(hcardelement);
        return hcardelement;
    }

    protected volatile VCardProperty _parseHtml(HCardElement hcardelement, List list)
    {
        return _parseHtml(hcardelement, list);
    }

    protected Impp _parseJson(JCardValue jcardvalue, VCardDataType vcarddatatype, VCardParameters vcardparameters, List list)
    {
        return parse(jcardvalue.asSingle());
    }

    protected volatile VCardProperty _parseJson(JCardValue jcardvalue, VCardDataType vcarddatatype, VCardParameters vcardparameters, List list)
    {
        return _parseJson(jcardvalue, vcarddatatype, vcardparameters, list);
    }

    protected Impp _parseText(String s, VCardDataType vcarddatatype, VCardVersion vcardversion, VCardParameters vcardparameters, List list)
    {
        return parse(unescape(s));
    }

    protected volatile VCardProperty _parseText(String s, VCardDataType vcarddatatype, VCardVersion vcardversion, VCardParameters vcardparameters, List list)
    {
        return _parseText(s, vcarddatatype, vcardversion, vcardparameters, list);
    }

    protected Impp _parseXml(XCardElement xcardelement, VCardParameters vcardparameters, List list)
    {
        xcardelement = xcardelement.first(new VCardDataType[] {
            VCardDataType.URI
        });
        if (xcardelement != null)
        {
            return parse(xcardelement);
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

    protected JCardValue _writeJson(Impp impp)
    {
        return JCardValue.single(write(impp));
    }

    protected volatile JCardValue _writeJson(VCardProperty vcardproperty)
    {
        return _writeJson((Impp)vcardproperty);
    }

    protected String _writeText(Impp impp, VCardVersion vcardversion)
    {
        return write(impp);
    }

    protected volatile String _writeText(VCardProperty vcardproperty, VCardVersion vcardversion)
    {
        return _writeText((Impp)vcardproperty, vcardversion);
    }

    protected void _writeXml(Impp impp, XCardElement xcardelement)
    {
        xcardelement.append(VCardDataType.URI, write(impp));
    }

    protected volatile void _writeXml(VCardProperty vcardproperty, XCardElement xcardelement)
    {
        _writeXml((Impp)vcardproperty, xcardelement);
    }

    public URI parseHtmlLink(String s)
    {
        Object obj1 = null;
        Iterator iterator = htmlLinkFormats.iterator();
        do
        {
            Object obj = obj1;
            if (!iterator.hasNext())
            {
                break;
            }
            obj = (HtmlLinkFormat)iterator.next();
            String s1 = ((HtmlLinkFormat) (obj)).parseHandle(s);
            if (s1 == null)
            {
                continue;
            }
            try
            {
                obj = new URI(((HtmlLinkFormat) (obj)).getProtocol(), s1, null);
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                throw new IllegalArgumentException(s);
            }
            break;
        } while (true);
        return ((URI) (obj));
    }

    public String writeHtmlLink(Impp impp)
    {
        impp = impp.getUri();
        if (impp == null)
        {
            return null;
        }
        String s = impp.getScheme();
        String s1 = impp.getSchemeSpecificPart();
        for (Iterator iterator = htmlLinkFormats.iterator(); iterator.hasNext();)
        {
            HtmlLinkFormat htmllinkformat = (HtmlLinkFormat)iterator.next();
            if (s.equals(htmllinkformat.getProtocol()))
            {
                return htmllinkformat.buildLink(s1);
            }
        }

        return impp.toString();
    }

    static 
    {
        ArrayList arraylist = new ArrayList();
        arraylist.add(new HtmlLinkFormat("aim", "(goim|addbuddy)\\?.*?\\bscreenname=(.*?)(&|$)", 2, "goim?screenname=%s"));
        arraylist.add(new HtmlLinkFormat("ymsgr", "(sendim|addfriend|sendfile|call)\\?(.*)", 2, "sendim?%s"));
        arraylist.add(new HtmlLinkFormat("skype", "(.*?)(\\?|$)", 1, "%s"));
        arraylist.add(new HtmlLinkFormat("msnim", "(chat|add|voice|video)\\?contact=(.*?)(&|$)", 2, "chat?contact=%s"));
        arraylist.add(new HtmlLinkFormat("xmpp", "(.*?)(\\?|$)", 1, "%s?message"));
        arraylist.add(new HtmlLinkFormat("icq", "message\\?uin=(\\d+)", 1, "message?uin=%s"));
        arraylist.add(new HtmlLinkFormat("sip"));
        arraylist.add(new HtmlLinkFormat("irc"));
        htmlLinkFormats = Collections.unmodifiableList(arraylist);
    }
}
