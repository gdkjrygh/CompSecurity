// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype;

import java.lang.ref.ReferenceQueue;
import java.util.HashSet;

// Referenced classes of package com.skype:
//            ObjectInterfaceImpl, NativeListenable, ObjectInterface, Transfer, 
//            SkypeFactory, ObjectInterfaceFactory, NativeStringConvert, PROPKEY, 
//            NativeWeakRef, a

public class TransferImpl extends ObjectInterfaceImpl
    implements NativeListenable, ObjectInterface, Transfer
{
    static final class a extends NativeWeakRef
    {

        private ObjectInterfaceFactory factory;

        public final void destroyNativeObject()
        {
            factory.destroyTransfer(nativeObject);
        }

        a(ObjectInterfaceFactory objectinterfacefactory, com.skype.a a1, ReferenceQueue referencequeue, int i)
        {
            super(a1, referencequeue, i);
            factory = objectinterfacefactory;
        }
    }


    private HashSet m_listeners;

    public TransferImpl()
    {
        this(((ObjectInterfaceFactory) (SkypeFactory.getInstance())));
    }

    public TransferImpl(ObjectInterfaceFactory objectinterfacefactory)
    {
        super(objectinterfacefactory, objectinterfacefactory.createTransfer());
        m_listeners = new HashSet();
        objectinterfacefactory.initializeListener(this);
    }

    private native boolean accept(byte abyte0[]);

    public boolean accept(String s)
    {
        return accept(NativeStringConvert.ConvertToNativeBytes(s));
    }

    public void addListener(Transfer.TransferIListener transferilistener)
    {
        synchronized (m_listeners)
        {
            m_listeners.add(transferilistener);
        }
        return;
        transferilistener;
        hashset;
        JVM INSTR monitorexit ;
        throw transferilistener;
    }

    public native boolean cancel();

    public NativeWeakRef createNativeWeakRef(ObjectInterfaceFactory objectinterfacefactory, ReferenceQueue referencequeue)
    {
        return new a(objectinterfacefactory, this, referencequeue, m_nativeObject);
    }

    public int getBytespersecondProp()
    {
        return getIntProperty(PROPKEY.TRANSFER_BYTESPERSECOND);
    }

    public String getBytestransferredProp()
    {
        return getStrProperty(PROPKEY.TRANSFER_BYTESTRANSFERRED);
    }

    public byte[] getChatmsgGuidProp()
    {
        return getBinProperty(PROPKEY.TRANSFER_CHATMSG_GUID);
    }

    public int getChatmsgIndexProp()
    {
        return getIntProperty(PROPKEY.TRANSFER_CHATMSG_INDEX);
    }

    public int getConvoIdProp()
    {
        return getIntProperty(PROPKEY.TRANSFER_CONVO_ID);
    }

    public Transfer.FAILUREREASON getFailureReasonProp()
    {
        return Transfer.FAILUREREASON.fromInt(getIntProperty(PROPKEY.TRANSFER_FAILUREREASON));
    }

    public String getFilenameProp()
    {
        return getStrProperty(PROPKEY.TRANSFER_FILENAME);
    }

    public String getFilepathProp()
    {
        return getStrProperty(PROPKEY.TRANSFER_FILEPATH);
    }

    public String getFilesizeProp()
    {
        return getStrProperty(PROPKEY.TRANSFER_FILESIZE);
    }

    public int getFinishtimeProp()
    {
        return getIntProperty(PROPKEY.TRANSFER_FINISHTIME);
    }

    public String getPartnerDispnameProp()
    {
        return getStrProperty(PROPKEY.TRANSFER_PARTNER_DISPNAME);
    }

    public String getPartnerHandleProp()
    {
        return getStrProperty(PROPKEY.TRANSFER_PARTNER_HANDLE);
    }

    public int getStarttimeProp()
    {
        return getIntProperty(PROPKEY.TRANSFER_STARTTIME);
    }

    public Transfer.STATUS getStatusProp()
    {
        return Transfer.STATUS.fromInt(getIntProperty(PROPKEY.TRANSFER_STATUS));
    }

    public Transfer.TYPE getTypeProp()
    {
        return Transfer.TYPE.fromInt(getIntProperty(PROPKEY.TRANSFER_TYPE));
    }

    public native void initializeListener();

    public native boolean isController();

    public native boolean pause();

    public void removeListener(Transfer.TransferIListener transferilistener)
    {
        synchronized (m_listeners)
        {
            m_listeners.remove(transferilistener);
        }
        return;
        transferilistener;
        hashset;
        JVM INSTR monitorexit ;
        throw transferilistener;
    }

    public native boolean resume();
}
