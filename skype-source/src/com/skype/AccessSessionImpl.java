// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype;

import java.lang.ref.ReferenceQueue;
import java.util.HashSet;

// Referenced classes of package com.skype:
//            ObjectInterfaceImpl, AccessSession, NativeListenable, ObjectInterface, 
//            SkypeFactory, ObjectInterfaceFactory, PROPKEY, NativeStringConvert, 
//            NativeWeakRef, a

public class AccessSessionImpl extends ObjectInterfaceImpl
    implements AccessSession, NativeListenable, ObjectInterface
{
    static final class a extends NativeWeakRef
    {

        private ObjectInterfaceFactory factory;

        public final void destroyNativeObject()
        {
            factory.destroyAccessSession(nativeObject);
        }

        a(ObjectInterfaceFactory objectinterfacefactory, com.skype.a a1, ReferenceQueue referencequeue, int i)
        {
            super(a1, referencequeue, i);
            factory = objectinterfacefactory;
        }
    }


    private HashSet m_listeners;

    public AccessSessionImpl()
    {
        this(((ObjectInterfaceFactory) (SkypeFactory.getInstance())));
    }

    public AccessSessionImpl(ObjectInterfaceFactory objectinterfacefactory)
    {
        super(objectinterfacefactory, objectinterfacefactory.createAccessSession());
        m_listeners = new HashSet();
        objectinterfacefactory.initializeListener(this);
    }

    private native void loginWispr(byte abyte0[], byte abyte1[]);

    private native void notifyWifiChanged(byte abyte0[], byte abyte1[], byte abyte2[], byte abyte3[]);

    public void addListener(AccessSession.AccessSessionIListener accesssessionilistener)
    {
        synchronized (m_listeners)
        {
            m_listeners.add(accesssessionilistener);
        }
        return;
        accesssessionilistener;
        hashset;
        JVM INSTR monitorexit ;
        throw accesssessionilistener;
    }

    public NativeWeakRef createNativeWeakRef(ObjectInterfaceFactory objectinterfacefactory, ReferenceQueue referencequeue)
    {
        return new a(objectinterfacefactory, this, referencequeue, m_nativeObject);
    }

    public native void detectHotspot();

    public native void detectHotspotOffline();

    public byte[] getAccountIdProp()
    {
        return getBinProperty(PROPKEY.ACCESS_ACCOUNT_ID);
    }

    public byte[] getApMacProp()
    {
        return getBinProperty(PROPKEY.ACCESS_AP_MAC);
    }

    public String getApSsidProp()
    {
        return getStrProperty(PROPKEY.ACCESS_AP_SSID);
    }

    public int getConnectionProgressProp()
    {
        return getIntProperty(PROPKEY.ACCESS_CONNECTION_PROGRESS);
    }

    public String getDnsServerProp()
    {
        return getStrProperty(PROPKEY.ACCESS_DNS_SERVER);
    }

    public AccessSession.FAILUREREASON getFailureReasonProp()
    {
        return AccessSession.FAILUREREASON.fromInt(getIntProperty(PROPKEY.ACCESS_FAILUREREASON));
    }

    public int getHotspotRatingProp()
    {
        return getIntProperty(PROPKEY.ACCESS_HOTSPOT_RATING);
    }

    public int getHotspotTypeProp()
    {
        return getIntProperty(PROPKEY.ACCESS_HOTSPOT_TYPE);
    }

    public int getMinutesRemainingProp()
    {
        return getIntProperty(PROPKEY.ACCESS_MINUTES_REMAINING);
    }

    public int getPartnerIdProp()
    {
        return getIntProperty(PROPKEY.ACCESS_PARTNER_ID);
    }

    public String getPriceCurrencyProp()
    {
        return getStrProperty(PROPKEY.ACCESS_PRICE_CURRENCY);
    }

    public int getPricePerMinuteProp()
    {
        return getIntProperty(PROPKEY.ACCESS_PRICE_PER_MINUTE);
    }

    public int getPricePrecisionProp()
    {
        return getIntProperty(PROPKEY.ACCESS_PRICE_PRECISION);
    }

    public int getPromoIdProp()
    {
        return getIntProperty(PROPKEY.ACCESS_PROMO_ID);
    }

    public int getSessionDurationProp()
    {
        return getIntProperty(PROPKEY.ACCESS_SESSION_DURATION);
    }

    public int getSessionFlagsProp()
    {
        return getIntProperty(PROPKEY.ACCESS_SESSION_FLAGS);
    }

    public int getSessionTimestampProp()
    {
        return getIntProperty(PROPKEY.ACCESS_SESSION_TIMESTAMP);
    }

    public AccessSession.STATUS getStatusProp()
    {
        return AccessSession.STATUS.fromInt(getIntProperty(PROPKEY.ACCESS_STATUS));
    }

    public native void initializeListener();

    public native boolean login();

    public void loginWispr(String s, String s1)
    {
        loginWispr(NativeStringConvert.ConvertToNativeBytes(s), NativeStringConvert.ConvertToNativeBytes(s1));
    }

    public native void logout();

    public void notifyWifiChanged(byte abyte0[], String s, byte abyte1[])
    {
        notifyWifiChanged(abyte0, s, abyte1, "");
    }

    public void notifyWifiChanged(byte abyte0[], String s, byte abyte1[], String s1)
    {
        notifyWifiChanged(abyte0, NativeStringConvert.ConvertToNativeBytes(s), abyte1, NativeStringConvert.ConvertToNativeBytes(s1));
    }

    public void removeListener(AccessSession.AccessSessionIListener accesssessionilistener)
    {
        synchronized (m_listeners)
        {
            m_listeners.remove(accesssessionilistener);
        }
        return;
        accesssessionilistener;
        hashset;
        JVM INSTR monitorexit ;
        throw accesssessionilistener;
    }

    public native void sendLocation(int i, int j, int k);

    public native void sendRating(int i);
}
