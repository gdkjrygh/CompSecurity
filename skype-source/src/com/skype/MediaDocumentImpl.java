// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype;

import java.lang.ref.ReferenceQueue;
import java.util.HashSet;
import java.util.Iterator;

// Referenced classes of package com.skype:
//            ObjectInterfaceImpl, MediaDocument, NativeListenable, ObjectInterface, 
//            SkypeFactory, ObjectInterfaceFactory, NativeStringConvert, PROPKEY, 
//            NativeWeakRef, a

public class MediaDocumentImpl extends ObjectInterfaceImpl
    implements MediaDocument, NativeListenable, ObjectInterface
{
    static final class a extends NativeWeakRef
    {

        private ObjectInterfaceFactory factory;

        public final void destroyNativeObject()
        {
            factory.destroyMediaDocument(nativeObject);
        }

        a(ObjectInterfaceFactory objectinterfacefactory, com.skype.a a1, ReferenceQueue referencequeue, int i)
        {
            super(a1, referencequeue, i);
            factory = objectinterfacefactory;
        }
    }


    private HashSet m_listeners;

    public MediaDocumentImpl()
    {
        this(((ObjectInterfaceFactory) (SkypeFactory.getInstance())));
    }

    public MediaDocumentImpl(ObjectInterfaceFactory objectinterfacefactory)
    {
        super(objectinterfacefactory, objectinterfacefactory.createMediaDocument());
        m_listeners = new HashSet();
        objectinterfacefactory.initializeListener(this);
    }

    private native MediaDocument.MEDIA_STATUS downloadToFile(byte abyte0[], byte abyte1[]);

    private native MediaDocument.GetMediaLink_Result getMediaLink(byte abyte0[], MediaDocument.MEDIA_GET_POLICY media_get_policy);

    private native MediaDocument.GetMetadataIntValue_Result getMetadataIntValue(byte abyte0[]);

    private native MediaDocument.GetMetadataStringValue_Result getMetadataStringValue(byte abyte0[]);

    private native MediaDocument.UPLOAD_STATUS getUploadStatus(byte abyte0[]);

    private native boolean linkProfileToContentId(byte abyte0[], byte abyte1[]);

    private native boolean linkProfiles(byte abyte0[], byte abyte1[]);

    private native boolean setMediaByContentId(byte abyte0[], byte abyte1[], MediaDocument.STORAGE_POLICY storage_policy);

    private native boolean setMediaByProfileId(byte abyte0[], byte abyte1[], MediaDocument.STORAGE_POLICY storage_policy);

    private native boolean upload(byte abyte0[]);

    public void addListener(MediaDocument.MediaDocumentIListener mediadocumentilistener)
    {
        synchronized (m_listeners)
        {
            m_listeners.add(mediadocumentilistener);
        }
        return;
        mediadocumentilistener;
        hashset;
        JVM INSTR monitorexit ;
        throw mediadocumentilistener;
    }

    public native boolean consume();

    public NativeWeakRef createNativeWeakRef(ObjectInterfaceFactory objectinterfacefactory, ReferenceQueue referencequeue)
    {
        return new a(objectinterfacefactory, this, referencequeue, m_nativeObject);
    }

    public native boolean delete();

    public MediaDocument.MEDIA_STATUS downloadToFile(String s, String s1)
    {
        return downloadToFile(NativeStringConvert.ConvertToNativeBytes(s), NativeStringConvert.ConvertToNativeBytes(s1));
    }

    public int getConsumptionStatusProp()
    {
        return getIntProperty(PROPKEY.MEDIADOCUMENT_CONSUMPTION_STATUS);
    }

    public int getConvoIdProp()
    {
        return getIntProperty(PROPKEY.MEDIADOCUMENT_CONVO_ID);
    }

    public String getDescriptionProp()
    {
        return getStrProperty(PROPKEY.MEDIADOCUMENT_DESCRIPTION);
    }

    public MediaDocument.DOCUMENT_TYPE getDocTypeProp()
    {
        return MediaDocument.DOCUMENT_TYPE.fromInt(getIntProperty(PROPKEY.MEDIADOCUMENT_DOC_TYPE));
    }

    public MediaDocument.GetMediaLink_Result getMediaLink(String s)
    {
        return getMediaLink(s, MediaDocument.MEDIA_GET_POLICY.CACHE_THEN_DOWNLOAD);
    }

    public MediaDocument.GetMediaLink_Result getMediaLink(String s, MediaDocument.MEDIA_GET_POLICY media_get_policy)
    {
        return getMediaLink(NativeStringConvert.ConvertToNativeBytes(s), media_get_policy);
    }

    public int getMessageIdProp()
    {
        return getIntProperty(PROPKEY.MEDIADOCUMENT_MESSAGE_ID);
    }

    public MediaDocument.GetMetadataIntValue_Result getMetadataIntValue(String s)
    {
        return getMetadataIntValue(NativeStringConvert.ConvertToNativeBytes(s));
    }

    public MediaDocument.GetMetadataStringValue_Result getMetadataStringValue(String s)
    {
        return getMetadataStringValue(NativeStringConvert.ConvertToNativeBytes(s));
    }

    public String getMimeTypeProp()
    {
        return getStrProperty(PROPKEY.MEDIADOCUMENT_MIME_TYPE);
    }

    public String getOriginalNameProp()
    {
        return getStrProperty(PROPKEY.MEDIADOCUMENT_ORIGINAL_NAME);
    }

    public String getServiceProp()
    {
        return getStrProperty(PROPKEY.MEDIADOCUMENT_SERVICE);
    }

    public MediaDocument.STATUS getStatusProp()
    {
        return MediaDocument.STATUS.fromInt(getIntProperty(PROPKEY.MEDIADOCUMENT_STATUS));
    }

    public String getThumbnailUrlProp()
    {
        return getStrProperty(PROPKEY.MEDIADOCUMENT_THUMBNAIL_URL);
    }

    public String getTitleProp()
    {
        return getStrProperty(PROPKEY.MEDIADOCUMENT_TITLE);
    }

    public native MediaDocument.SERVICE_TRUST_TYPE getTrust();

    public String getTypeProp()
    {
        return getStrProperty(PROPKEY.MEDIADOCUMENT_TYPE);
    }

    public MediaDocument.UPLOAD_STATUS getUploadStatus(String s)
    {
        return getUploadStatus(NativeStringConvert.ConvertToNativeBytes(s));
    }

    public String getUriProp()
    {
        return getStrProperty(PROPKEY.MEDIADOCUMENT_URI);
    }

    public String getWebUrlProp()
    {
        return getStrProperty(PROPKEY.MEDIADOCUMENT_WEB_URL);
    }

    public native void initializeListener();

    public boolean linkProfileToContentId(String s, String s1)
    {
        return linkProfileToContentId(NativeStringConvert.ConvertToNativeBytes(s), NativeStringConvert.ConvertToNativeBytes(s1));
    }

    public boolean linkProfiles(String s, String s1)
    {
        return linkProfiles(NativeStringConvert.ConvertToNativeBytes(s), NativeStringConvert.ConvertToNativeBytes(s1));
    }

    public void onDownloadError(byte abyte0[], MediaDocument.NETWORK_ERROR network_error, boolean flag)
    {
        HashSet hashset = m_listeners;
        hashset;
        JVM INSTR monitorenter ;
        for (Iterator iterator = m_listeners.iterator(); iterator.hasNext(); ((MediaDocument.MediaDocumentIListener)iterator.next()).onDownloadError(this, NativeStringConvert.ConvertFromNativeBytes(abyte0), network_error, flag)) { }
        break MISSING_BLOCK_LABEL_59;
        abyte0;
        hashset;
        JVM INSTR monitorexit ;
        throw abyte0;
        hashset;
        JVM INSTR monitorexit ;
    }

    public void onMediaLinkProgress(byte abyte0[], int i, int j, int k)
    {
        HashSet hashset = m_listeners;
        hashset;
        JVM INSTR monitorenter ;
        for (Iterator iterator = m_listeners.iterator(); iterator.hasNext(); ((MediaDocument.MediaDocumentIListener)iterator.next()).onMediaLinkProgress(this, NativeStringConvert.ConvertFromNativeBytes(abyte0), i, j, k)) { }
        break MISSING_BLOCK_LABEL_61;
        abyte0;
        hashset;
        JVM INSTR monitorexit ;
        throw abyte0;
        hashset;
        JVM INSTR monitorexit ;
    }

    public void onMediaLinkStatusChange(MediaDocument.MEDIA_STATUS media_status, byte abyte0[], byte abyte1[])
    {
        HashSet hashset = m_listeners;
        hashset;
        JVM INSTR monitorenter ;
        for (Iterator iterator = m_listeners.iterator(); iterator.hasNext(); ((MediaDocument.MediaDocumentIListener)iterator.next()).onMediaLinkStatusChange(this, media_status, NativeStringConvert.ConvertFromNativeBytes(abyte0), NativeStringConvert.ConvertFromNativeBytes(abyte1))) { }
        break MISSING_BLOCK_LABEL_62;
        media_status;
        hashset;
        JVM INSTR monitorexit ;
        throw media_status;
        hashset;
        JVM INSTR monitorexit ;
    }

    public void onMetadataUpdated()
    {
        HashSet hashset = m_listeners;
        hashset;
        JVM INSTR monitorenter ;
        for (Iterator iterator = m_listeners.iterator(); iterator.hasNext(); ((MediaDocument.MediaDocumentIListener)iterator.next()).onMetadataUpdated(this)) { }
        break MISSING_BLOCK_LABEL_47;
        Exception exception;
        exception;
        hashset;
        JVM INSTR monitorexit ;
        throw exception;
        hashset;
        JVM INSTR monitorexit ;
    }

    public void onUploadError(byte abyte0[], MediaDocument.NETWORK_ERROR network_error, boolean flag)
    {
        HashSet hashset = m_listeners;
        hashset;
        JVM INSTR monitorenter ;
        for (Iterator iterator = m_listeners.iterator(); iterator.hasNext(); ((MediaDocument.MediaDocumentIListener)iterator.next()).onUploadError(this, NativeStringConvert.ConvertFromNativeBytes(abyte0), network_error, flag)) { }
        break MISSING_BLOCK_LABEL_59;
        abyte0;
        hashset;
        JVM INSTR monitorexit ;
        throw abyte0;
        hashset;
        JVM INSTR monitorexit ;
    }

    public void onUploadProgress(byte abyte0[], int i, int j)
    {
        HashSet hashset = m_listeners;
        hashset;
        JVM INSTR monitorenter ;
        for (Iterator iterator = m_listeners.iterator(); iterator.hasNext(); ((MediaDocument.MediaDocumentIListener)iterator.next()).onUploadProgress(this, NativeStringConvert.ConvertFromNativeBytes(abyte0), i, j)) { }
        break MISSING_BLOCK_LABEL_59;
        abyte0;
        hashset;
        JVM INSTR monitorexit ;
        throw abyte0;
        hashset;
        JVM INSTR monitorexit ;
    }

    public void onUploadStatusChanged(byte abyte0[], MediaDocument.UPLOAD_STATUS upload_status)
    {
        HashSet hashset = m_listeners;
        hashset;
        JVM INSTR monitorenter ;
        for (Iterator iterator = m_listeners.iterator(); iterator.hasNext(); ((MediaDocument.MediaDocumentIListener)iterator.next()).onUploadStatusChanged(this, NativeStringConvert.ConvertFromNativeBytes(abyte0), upload_status)) { }
        break MISSING_BLOCK_LABEL_55;
        abyte0;
        hashset;
        JVM INSTR monitorexit ;
        throw abyte0;
        hashset;
        JVM INSTR monitorexit ;
    }

    public void removeListener(MediaDocument.MediaDocumentIListener mediadocumentilistener)
    {
        synchronized (m_listeners)
        {
            m_listeners.remove(mediadocumentilistener);
        }
        return;
        mediadocumentilistener;
        hashset;
        JVM INSTR monitorexit ;
        throw mediadocumentilistener;
    }

    public boolean setMediaByContentId(String s, String s1)
    {
        return setMediaByContentId(s, s1, MediaDocument.STORAGE_POLICY.STORAGE_POLICY_MOVE_TO_CACHE);
    }

    public boolean setMediaByContentId(String s, String s1, MediaDocument.STORAGE_POLICY storage_policy)
    {
        return setMediaByContentId(NativeStringConvert.ConvertToNativeBytes(s), NativeStringConvert.ConvertToNativeBytes(s1), storage_policy);
    }

    public boolean setMediaByProfileId(String s, String s1)
    {
        return setMediaByProfileId(s, s1, MediaDocument.STORAGE_POLICY.STORAGE_POLICY_MOVE_TO_CACHE);
    }

    public boolean setMediaByProfileId(String s, String s1, MediaDocument.STORAGE_POLICY storage_policy)
    {
        return setMediaByProfileId(NativeStringConvert.ConvertToNativeBytes(s), NativeStringConvert.ConvertToNativeBytes(s1), storage_policy);
    }

    public native boolean sync();

    public boolean upload(String s)
    {
        return upload(NativeStringConvert.ConvertToNativeBytes(s));
    }
}
