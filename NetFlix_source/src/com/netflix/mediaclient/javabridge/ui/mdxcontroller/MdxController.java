// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.javabridge.ui.mdxcontroller;

import com.netflix.mediaclient.javabridge.ui.Mdx;
import java.util.ArrayList;

// Referenced classes of package com.netflix.mediaclient.javabridge.ui.mdxcontroller:
//            DiscoveryController, PairingController, SessionController

public interface MdxController
    extends Mdx
{
    public static interface PropertyUpdateListener
    {

        public abstract void onIsReady(boolean flag);

        public abstract void onRemoteDeviceMap(ArrayList arraylist);
    }


    public abstract DiscoveryController getDiscovery();

    public abstract PairingController getPairing();

    public abstract SessionController getSession();

    public abstract void pingNccp();

    public abstract void removePropertyUpdateListener();

    public abstract void setPropertyUpdateListener(PropertyUpdateListener propertyupdatelistener);
}
