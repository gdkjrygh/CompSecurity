// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ezvcard.io.scribe;

import ezvcard.VCard;
import ezvcard.VCardDataType;
import ezvcard.VCardVersion;
import ezvcard.io.EmbeddedVCardException;
import ezvcard.io.SkipMeException;
import ezvcard.io.html.HCardElement;
import ezvcard.parameter.VCardParameters;
import ezvcard.property.Agent;
import ezvcard.property.VCardProperty;
import java.util.List;
import java.util.Set;

// Referenced classes of package ezvcard.io.scribe:
//            VCardPropertyScribe

public class AgentScribe extends VCardPropertyScribe
{
    private static class Injector
        implements ezvcard.io.EmbeddedVCardException.InjectionCallback
    {

        private final Agent property;

        public VCardProperty getProperty()
        {
            return property;
        }

        public void injectVCard(VCard vcard)
        {
            property.setVCard(vcard);
        }

        public Injector(Agent agent)
        {
            property = agent;
        }
    }


    public AgentScribe()
    {
        super(ezvcard/property/Agent, "AGENT");
    }

    protected VCardDataType _dataType(Agent agent, VCardVersion vcardversion)
    {
        if (agent.getUrl() != null)
        {
            if (vcardversion == VCardVersion.V2_1)
            {
                return VCardDataType.URL;
            } else
            {
                return VCardDataType.URI;
            }
        } else
        {
            return null;
        }
    }

    protected volatile VCardDataType _dataType(VCardProperty vcardproperty, VCardVersion vcardversion)
    {
        return _dataType((Agent)vcardproperty, vcardversion);
    }

    protected VCardDataType _defaultDataType(VCardVersion vcardversion)
    {
        return null;
    }

    protected Agent _parseHtml(HCardElement hcardelement, List list)
    {
        Agent agent = new Agent();
        if (hcardelement.classNames().contains("vcard"))
        {
            throw new EmbeddedVCardException(new Injector(agent));
        }
        String s = hcardelement.absUrl("href");
        list = s;
        if (s.length() == 0)
        {
            list = hcardelement.value();
        }
        agent.setUrl(list);
        return agent;
    }

    protected volatile VCardProperty _parseHtml(HCardElement hcardelement, List list)
    {
        return _parseHtml(hcardelement, list);
    }

    protected Agent _parseText(String s, VCardDataType vcarddatatype, VCardVersion vcardversion, VCardParameters vcardparameters, List list)
    {
        vcardversion = new Agent();
        if (vcarddatatype == null)
        {
            throw new EmbeddedVCardException(new Injector(vcardversion));
        } else
        {
            vcardversion.setUrl(unescape(s));
            return vcardversion;
        }
    }

    protected volatile VCardProperty _parseText(String s, VCardDataType vcarddatatype, VCardVersion vcardversion, VCardParameters vcardparameters, List list)
    {
        return _parseText(s, vcarddatatype, vcardversion, vcardparameters, list);
    }

    protected String _writeText(Agent agent, VCardVersion vcardversion)
    {
        vcardversion = agent.getUrl();
        if (vcardversion != null)
        {
            return vcardversion;
        }
        agent = agent.getVCard();
        if (agent != null)
        {
            throw new EmbeddedVCardException(agent);
        } else
        {
            throw new SkipMeException("Property has neither a URL nor an embedded vCard.");
        }
    }

    protected volatile String _writeText(VCardProperty vcardproperty, VCardVersion vcardversion)
    {
        return _writeText((Agent)vcardproperty, vcardversion);
    }
}
