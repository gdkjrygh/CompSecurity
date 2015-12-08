// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ezvcard.property;

import ezvcard.VCard;
import ezvcard.VCardVersion;
import ezvcard.parameter.ImppType;
import ezvcard.parameter.VCardParameters;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

// Referenced classes of package ezvcard.property:
//            VCardProperty, HasAltId

public class Impp extends VCardProperty
    implements HasAltId
{

    private static final String AIM = "aim";
    private static final String ICQ = "icq";
    private static final String IRC = "irc";
    private static final String MSN = "msnim";
    private static final String SIP = "sip";
    private static final String SKYPE = "skype";
    private static final String XMPP = "xmpp";
    private static final String YAHOO = "ymsgr";
    private URI uri;

    public Impp(String s)
    {
        setUri(s);
    }

    public Impp(String s, String s1)
    {
        setUri(s, s1);
    }

    public Impp(URI uri1)
    {
        setUri(uri1);
    }

    public static Impp aim(String s)
    {
        return new Impp("aim", s);
    }

    public static Impp icq(String s)
    {
        return new Impp("icq", s);
    }

    public static Impp irc(String s)
    {
        return new Impp("irc", s);
    }

    private boolean isProtocol(String s)
    {
        return uri != null && s.equals(uri.getScheme());
    }

    public static Impp msn(String s)
    {
        return new Impp("msnim", s);
    }

    public static Impp sip(String s)
    {
        return new Impp("sip", s);
    }

    public static Impp skype(String s)
    {
        return new Impp("skype", s);
    }

    public static Impp xmpp(String s)
    {
        return new Impp("xmpp", s);
    }

    public static Impp yahoo(String s)
    {
        return new Impp("ymsgr", s);
    }

    public Set _supportedVersions()
    {
        return EnumSet.of(VCardVersion.V3_0, VCardVersion.V4_0);
    }

    protected void _validate(List list, VCardVersion vcardversion, VCard vcard)
    {
        if (uri == null)
        {
            list.add("Property value is null.");
        }
    }

    public void addPid(int i, int j)
    {
        super.addPid(i, j);
    }

    public void addType(ImppType impptype)
    {
        parameters.addType(impptype.getValue());
    }

    public String getAltId()
    {
        return parameters.getAltId();
    }

    public String getHandle()
    {
        if (uri == null)
        {
            return null;
        } else
        {
            return uri.getSchemeSpecificPart();
        }
    }

    public String getMediaType()
    {
        return parameters.getMediaType();
    }

    public List getPids()
    {
        return super.getPids();
    }

    public Integer getPref()
    {
        return super.getPref();
    }

    public String getProtocol()
    {
        if (uri == null)
        {
            return null;
        } else
        {
            return uri.getScheme();
        }
    }

    public Set getTypes()
    {
        Object obj = parameters.getTypes();
        HashSet hashset = new HashSet(((Set) (obj)).size());
        for (obj = ((Set) (obj)).iterator(); ((Iterator) (obj)).hasNext(); hashset.add(ImppType.get((String)((Iterator) (obj)).next()))) { }
        return hashset;
    }

    public URI getUri()
    {
        return uri;
    }

    public boolean isAim()
    {
        return isProtocol("aim");
    }

    public boolean isIcq()
    {
        return isProtocol("icq");
    }

    public boolean isIrc()
    {
        return isProtocol("irc");
    }

    public boolean isMsn()
    {
        return isProtocol("msnim");
    }

    public boolean isSip()
    {
        return isProtocol("sip");
    }

    public boolean isSkype()
    {
        return isProtocol("skype");
    }

    public boolean isXmpp()
    {
        return isProtocol("xmpp");
    }

    public boolean isYahoo()
    {
        return isProtocol("ymsgr");
    }

    public void removePids()
    {
        super.removePids();
    }

    public void removeType(ImppType impptype)
    {
        parameters.removeType(impptype.getValue());
    }

    public void setAltId(String s)
    {
        parameters.setAltId(s);
    }

    public void setMediaType(String s)
    {
        parameters.setMediaType(s);
    }

    public void setPref(Integer integer)
    {
        super.setPref(integer);
    }

    public void setUri(String s)
    {
        if (s == null)
        {
            s = null;
        } else
        {
            s = URI.create(s);
        }
        setUri(((URI) (s)));
    }

    public void setUri(String s, String s1)
    {
        try
        {
            uri = new URI(s, s1, null);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new IllegalArgumentException(s);
        }
    }

    public void setUri(URI uri1)
    {
        uri = uri1;
    }
}
