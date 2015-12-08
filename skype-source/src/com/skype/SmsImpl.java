// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype;

import java.lang.ref.ReferenceQueue;
import java.util.HashSet;

// Referenced classes of package com.skype:
//            ObjectInterfaceImpl, NativeListenable, ObjectInterface, Sms, 
//            SkypeFactory, ObjectInterfaceFactory, NativeStringConvert, PROPKEY, 
//            NativeWeakRef, a

public class SmsImpl extends ObjectInterfaceImpl
    implements NativeListenable, ObjectInterface, Sms
{
    static final class a extends NativeWeakRef
    {

        private ObjectInterfaceFactory factory;

        public final void destroyNativeObject()
        {
            factory.destroySms(nativeObject);
        }

        a(ObjectInterfaceFactory objectinterfacefactory, com.skype.a a1, ReferenceQueue referencequeue, int i)
        {
            super(a1, referencequeue, i);
            factory = objectinterfacefactory;
        }
    }


    private HashSet m_listeners;

    public SmsImpl()
    {
        this(((ObjectInterfaceFactory) (SkypeFactory.getInstance())));
    }

    public SmsImpl(ObjectInterfaceFactory objectinterfacefactory)
    {
        super(objectinterfacefactory, objectinterfacefactory.createSms());
        m_listeners = new HashSet();
        objectinterfacefactory.initializeListener(this);
    }

    private native Sms.REPLY_CAPABILITY canTargetReply(byte abyte0[]);

    private native Sms.CLI_USED getTargetCLIUsed(byte abyte0[]);

    private native Sms.ERROR_CATEGORY getTargetErrorCategory(byte abyte0[]);

    private native Sms.HANDSET_DELIVERY_REPORT getTargetHandsetDeliveryReport(byte abyte0[]);

    private native int getTargetPrice(byte abyte0[]);

    private native byte[] getTargetReplyNumberNativeString(byte abyte0[]);

    private native Sms.OUTGOING_REPLY_TYPE getTargetReplyType(byte abyte0[]);

    private native Sms.TARGETSTATUS getTargetStatus(byte abyte0[]);

    private native Sms.SetBody_Result setBody(byte abyte0[]);

    private native boolean setOrigin(byte abyte0[]);

    private native boolean setReplyTo(byte abyte0[]);

    private native boolean setTargets(byte abyte0[][]);

    public void addListener(Sms.SmsIListener smsilistener)
    {
        synchronized (m_listeners)
        {
            m_listeners.add(smsilistener);
        }
        return;
        smsilistener;
        hashset;
        JVM INSTR monitorexit ;
        throw smsilistener;
    }

    public Sms.REPLY_CAPABILITY canTargetReply(String s)
    {
        return canTargetReply(NativeStringConvert.ConvertToNativeBytes(s));
    }

    public NativeWeakRef createNativeWeakRef(ObjectInterfaceFactory objectinterfacefactory, ReferenceQueue referencequeue)
    {
        return new a(objectinterfacefactory, this, referencequeue, m_nativeObject);
    }

    public native Sms.GetBodyChunks_Result getBodyChunks();

    public String getBodyProp()
    {
        return getStrProperty(PROPKEY.SMS_BODY);
    }

    public int getChatmsgIdProp()
    {
        return getIntProperty(PROPKEY.SMS_CHATMSG_ID);
    }

    public String getConvoNameProp()
    {
        return getStrProperty(PROPKEY.SMS_CONVO_NAME);
    }

    public Sms.ERROR_CATEGORY getErrorCategoryProp()
    {
        return Sms.ERROR_CATEGORY.fromInt(getIntProperty(PROPKEY.SMS_ERROR_CATEGORY));
    }

    public Sms.FAILUREREASON getFailureReasonProp()
    {
        return Sms.FAILUREREASON.fromInt(getIntProperty(PROPKEY.SMS_FAILUREREASON));
    }

    public String getIdentityProp()
    {
        return getStrProperty(PROPKEY.SMS_IDENTITY);
    }

    public boolean getIsFailedUnseenProp()
    {
        return getIntProperty(PROPKEY.SMS_IS_FAILED_UNSEEN) != 0;
    }

    public Sms.OUTGOING_REPLY_TYPE getOutgoingReplyTypeProp()
    {
        return Sms.OUTGOING_REPLY_TYPE.fromInt(getIntProperty(PROPKEY.SMS_OUTGOING_REPLY_TYPE));
    }

    public String getPriceCurrencyProp()
    {
        return getStrProperty(PROPKEY.SMS_PRICE_CURRENCY);
    }

    public int getPricePrecisionProp()
    {
        return getIntProperty(PROPKEY.SMS_PRICE_PRECISION);
    }

    public int getPriceProp()
    {
        return getIntProperty(PROPKEY.SMS_PRICE);
    }

    public String getReplyIdNumberProp()
    {
        return getStrProperty(PROPKEY.SMS_REPLY_ID_NUMBER);
    }

    public String getReplyToNumberProp()
    {
        return getStrProperty(PROPKEY.SMS_REPLY_TO_NUMBER);
    }

    public Sms.STATUS getStatusProp()
    {
        return Sms.STATUS.fromInt(getIntProperty(PROPKEY.SMS_STATUS));
    }

    public Sms.CLI_USED getTargetCLIUsed(String s)
    {
        return getTargetCLIUsed(NativeStringConvert.ConvertToNativeBytes(s));
    }

    public Sms.ERROR_CATEGORY getTargetErrorCategory(String s)
    {
        return getTargetErrorCategory(NativeStringConvert.ConvertToNativeBytes(s));
    }

    public Sms.HANDSET_DELIVERY_REPORT getTargetHandsetDeliveryReport(String s)
    {
        return getTargetHandsetDeliveryReport(NativeStringConvert.ConvertToNativeBytes(s));
    }

    public String getTargetNumbersProp()
    {
        return getStrProperty(PROPKEY.SMS_TARGET_NUMBERS);
    }

    public int getTargetPrice(String s)
    {
        return getTargetPrice(NativeStringConvert.ConvertToNativeBytes(s));
    }

    public String getTargetReplyNumber(String s)
    {
        return NativeStringConvert.ConvertFromNativeBytes(getTargetReplyNumberNativeString(NativeStringConvert.ConvertToNativeBytes(s)));
    }

    public Sms.OUTGOING_REPLY_TYPE getTargetReplyType(String s)
    {
        return getTargetReplyType(NativeStringConvert.ConvertToNativeBytes(s));
    }

    public Sms.TARGETSTATUS getTargetStatus(String s)
    {
        return getTargetStatus(NativeStringConvert.ConvertToNativeBytes(s));
    }

    public byte[] getTargetStatusesProp()
    {
        return getBinProperty(PROPKEY.SMS_TARGET_STATUSES);
    }

    public int getTimestampProp()
    {
        return getIntProperty(PROPKEY.SMS_TIMESTAMP);
    }

    public Sms.TYPE getTypeProp()
    {
        return Sms.TYPE.fromInt(getIntProperty(PROPKEY.SMS_TYPE));
    }

    public native void initializeListener();

    public void removeListener(Sms.SmsIListener smsilistener)
    {
        synchronized (m_listeners)
        {
            m_listeners.remove(smsilistener);
        }
        return;
        smsilistener;
        hashset;
        JVM INSTR monitorexit ;
        throw smsilistener;
    }

    public native boolean send();

    public Sms.SetBody_Result setBody(String s)
    {
        return setBody(NativeStringConvert.ConvertToNativeBytes(s));
    }

    public native void setConfirmationType(Sms.CONFIRM_TYPE confirm_type);

    public boolean setOrigin(String s)
    {
        return setOrigin(NativeStringConvert.ConvertToNativeBytes(s));
    }

    public native boolean setReplyId(long l);

    public boolean setReplyTo(String s)
    {
        return setReplyTo(NativeStringConvert.ConvertToNativeBytes(s));
    }

    public boolean setTargets(String as[])
    {
        return setTargets(NativeStringConvert.ConvertArrToNativeByteArr(as));
    }
}
