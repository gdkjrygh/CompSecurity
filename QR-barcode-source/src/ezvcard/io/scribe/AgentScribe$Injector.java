// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ezvcard.io.scribe;

import ezvcard.VCard;
import ezvcard.property.Agent;
import ezvcard.property.VCardProperty;

// Referenced classes of package ezvcard.io.scribe:
//            AgentScribe

private static class property
    implements ezvcard.io.n.InjectionCallback
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

    public tionCallback(Agent agent)
    {
        property = agent;
    }
}
