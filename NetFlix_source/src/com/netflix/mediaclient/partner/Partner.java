// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.partner;

import android.content.ComponentName;

// Referenced classes of package com.netflix.mediaclient.partner:
//            PartnerCommunicationHandler, ResponseListener

public interface Partner
{
    public static interface SSO
    {

        public abstract void getExternalUserToken(String s, int i, ResponseListener responselistener);

        public abstract String getService();

        public abstract void requestExternalUserAuth(String s, int i, ResponseListener responselistener);
    }

    public static interface Signup
    {

        public abstract void getExternalUserData(String s, String s1, int i, ResponseListener responselistener);

        public abstract String getService();

        public abstract void requestExternalUserConfirmation(String s, String s1, int i, ResponseListener responselistener);
    }


    public abstract ComponentName getComponentName();

    public abstract PartnerCommunicationHandler getPartnerCommunicationHandler();

    public abstract SSO getSSO();

    public abstract Signup getSignup();

    public abstract void release();

    public abstract void setComponentName(ComponentName componentname);
}
