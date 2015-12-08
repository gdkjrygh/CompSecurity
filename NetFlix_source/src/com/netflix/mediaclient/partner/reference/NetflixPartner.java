// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.partner.reference;

import android.content.ComponentName;
import com.netflix.mediaclient.partner.Partner;
import com.netflix.mediaclient.partner.PartnerCommunicationHandler;

// Referenced classes of package com.netflix.mediaclient.partner.reference:
//            NetflixSSO, NetflixSignup

public class NetflixPartner
    implements Partner
{

    private PartnerCommunicationHandler comHandler;
    private ComponentName componentName;
    private com.netflix.mediaclient.partner.Partner.Signup signup;
    private com.netflix.mediaclient.partner.Partner.SSO sso;

    public NetflixPartner(String s, PartnerCommunicationHandler partnercommunicationhandler)
    {
        sso = new NetflixSSO(this, s);
        signup = new NetflixSignup(this, s);
        comHandler = partnercommunicationhandler;
    }

    public ComponentName getComponentName()
    {
        return componentName;
    }

    public PartnerCommunicationHandler getPartnerCommunicationHandler()
    {
        return comHandler;
    }

    public com.netflix.mediaclient.partner.Partner.SSO getSSO()
    {
        return sso;
    }

    public com.netflix.mediaclient.partner.Partner.Signup getSignup()
    {
        return signup;
    }

    public void release()
    {
        sso = null;
        signup = null;
        comHandler = null;
    }

    public void setComponentName(ComponentName componentname)
    {
        componentName = componentname;
    }
}
