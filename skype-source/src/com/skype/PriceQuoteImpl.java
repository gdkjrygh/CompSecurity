// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype;

import java.lang.ref.ReferenceQueue;
import java.util.HashSet;

// Referenced classes of package com.skype:
//            ObjectInterfaceImpl, NativeListenable, ObjectInterface, PriceQuote, 
//            SkypeFactory, ObjectInterfaceFactory, PROPKEY, NativeWeakRef, 
//            a

public class PriceQuoteImpl extends ObjectInterfaceImpl
    implements NativeListenable, ObjectInterface, PriceQuote
{
    static final class a extends NativeWeakRef
    {

        private ObjectInterfaceFactory factory;

        public final void destroyNativeObject()
        {
            factory.destroyPriceQuote(nativeObject);
        }

        a(ObjectInterfaceFactory objectinterfacefactory, com.skype.a a1, ReferenceQueue referencequeue, int i)
        {
            super(a1, referencequeue, i);
            factory = objectinterfacefactory;
        }
    }


    private HashSet m_listeners;

    public PriceQuoteImpl()
    {
        this(((ObjectInterfaceFactory) (SkypeFactory.getInstance())));
    }

    public PriceQuoteImpl(ObjectInterfaceFactory objectinterfacefactory)
    {
        super(objectinterfacefactory, objectinterfacefactory.createPriceQuote());
        m_listeners = new HashSet();
        objectinterfacefactory.initializeListener(this);
    }

    public native boolean accept();

    public void addListener(PriceQuote.PriceQuoteIListener pricequoteilistener)
    {
        synchronized (m_listeners)
        {
            m_listeners.add(pricequoteilistener);
        }
        return;
        pricequoteilistener;
        hashset;
        JVM INSTR monitorexit ;
        throw pricequoteilistener;
    }

    public NativeWeakRef createNativeWeakRef(ObjectInterfaceFactory objectinterfacefactory, ReferenceQueue referencequeue)
    {
        return new a(objectinterfacefactory, this, referencequeue, m_nativeObject);
    }

    public int getAmountPaidProp()
    {
        return getIntProperty(PROPKEY.PRICEQUOTE_AMOUNT_PAID);
    }

    public String getBuyerProp()
    {
        return getStrProperty(PROPKEY.PRICEQUOTE_BUYER);
    }

    public int getConvoIdProp()
    {
        return getIntProperty(PROPKEY.PRICEQUOTE_CONVO_ID);
    }

    public String getDescriptionProp()
    {
        return getStrProperty(PROPKEY.PRICEQUOTE_DESCRIPTION);
    }

    public PriceQuote.FAILUREREASON getFailureReasonProp()
    {
        return PriceQuote.FAILUREREASON.fromInt(getIntProperty(PROPKEY.PRICEQUOTE_FAILUREREASON));
    }

    public int getMessageIdProp()
    {
        return getIntProperty(PROPKEY.PRICEQUOTE_MESSAGE_ID);
    }

    public String getPriceCurrencyProp()
    {
        return getStrProperty(PROPKEY.PRICEQUOTE_PRICE_CURRENCY);
    }

    public int getPricePrecisionProp()
    {
        return getIntProperty(PROPKEY.PRICEQUOTE_PRICE_PRECISION);
    }

    public int getPriceProp()
    {
        return getIntProperty(PROPKEY.PRICEQUOTE_PRICE);
    }

    public String getProviderProp()
    {
        return getStrProperty(PROPKEY.PRICEQUOTE_PROVIDER);
    }

    public native int getReferredObjectID();

    public PriceQuote.STATUS getStatusProp()
    {
        return PriceQuote.STATUS.fromInt(getIntProperty(PROPKEY.PRICEQUOTE_STATUS));
    }

    public PriceQuote.TYPE getTypeProp()
    {
        return PriceQuote.TYPE.fromInt(getIntProperty(PROPKEY.PRICEQUOTE_TYPE));
    }

    public int getUsertouchedTimestampProp()
    {
        return getIntProperty(PROPKEY.PRICEQUOTE_USERTOUCHED_TIMESTAMP);
    }

    public native void initializeListener();

    public native boolean reject();

    public void removeListener(PriceQuote.PriceQuoteIListener pricequoteilistener)
    {
        synchronized (m_listeners)
        {
            m_listeners.remove(pricequoteilistener);
        }
        return;
        pricequoteilistener;
        hashset;
        JVM INSTR monitorexit ;
        throw pricequoteilistener;
    }
}
