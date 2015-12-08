// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype;

import java.lang.ref.ReferenceQueue;
import java.util.HashSet;
import java.util.Iterator;

// Referenced classes of package com.skype:
//            GIImpl, NativeListenable, SkyLib, ObjectInterfaceFactory, 
//            SkypeFactory, NativeStringConvert, Conversation, ContactSearch, 
//            MediaDocument, VideoMessage, PROPKEY, Contact, 
//            Account, Voicemail, PriceQuote, Sms, 
//            AccessSession, ContactGroup, NativeWeakRef, Alert, 
//            Message, Proptable, MessageAnnotation, ObjectInterface, 
//            Participant, Transfer, Translator, Video, 
//            Metatag, Search, a

public class SkyLibImpl extends GIImpl
    implements NativeListenable, SkyLib
{
    static final class a extends NativeWeakRef
    {

        private ObjectInterfaceFactory factory;

        public final void destroyNativeObject()
        {
            factory.destroySkyLib(nativeObject);
        }

        a(ObjectInterfaceFactory objectinterfacefactory, com.skype.a a1, ReferenceQueue referencequeue, int i)
        {
            super(a1, referencequeue, i);
            factory = objectinterfacefactory;
        }
    }


    private HashSet m_listeners;

    public SkyLibImpl(ObjectInterfaceFactory objectinterfacefactory, String s, String s1, boolean flag, boolean flag1)
    {
        super(objectinterfacefactory, objectinterfacefactory.createSkyLib(s, s1, flag, flag1));
        m_listeners = new HashSet();
        objectinterfacefactory.initializeListener(this);
    }

    public SkyLibImpl(ObjectInterfaceFactory objectinterfacefactory, String s, boolean flag, boolean flag1)
    {
        super(objectinterfacefactory, objectinterfacefactory.createSkyLib(s, flag, flag1));
        m_listeners = new HashSet();
        objectinterfacefactory.initializeListener(this);
    }

    public SkyLibImpl(String s)
    {
        this(s, false, false);
    }

    public SkyLibImpl(String s, String s1, boolean flag)
    {
        this(s, s1, flag, false);
    }

    public SkyLibImpl(String s, String s1, boolean flag, boolean flag1)
    {
        this(((ObjectInterfaceFactory) (SkypeFactory.getInstance())), s, s1, flag, flag1);
    }

    public SkyLibImpl(String s, boolean flag)
    {
        this(s, flag, false);
    }

    public SkyLibImpl(String s, boolean flag, boolean flag1)
    {
        this(((ObjectInterfaceFactory) (SkypeFactory.getInstance())), s, flag, flag1);
    }

    private native boolean accessPaymentSetString(SkyLib.SA_PAYMENT_SID sa_payment_sid, byte abyte0[]);

    private native boolean app2AppConnect(byte abyte0[], byte abyte1[]);

    private native boolean app2AppCreate(byte abyte0[]);

    private native boolean app2AppDatagram(byte abyte0[], byte abyte1[], byte abyte2[]);

    private native boolean app2AppDelete(byte abyte0[]);

    private native boolean app2AppDisconnect(byte abyte0[], byte abyte1[]);

    private native SkyLib.App2AppGetConnectableUsers_Result app2AppGetConnectableUsers(byte abyte0[]);

    private native SkyLib.App2AppGetStreamsList_Result app2AppGetStreamsList(byte abyte0[], SkyLib.APP2APP_STREAMS app2app_streams);

    private native SkyLib.App2AppRead_Result app2AppRead(byte abyte0[], byte abyte1[]);

    private native boolean app2AppSetDesiredMinimumBandwidth(byte abyte0[], byte abyte1[], int i);

    private native boolean app2AppWrite(byte abyte0[], byte abyte1[], byte abyte2[]);

    private native boolean callExistingConference(byte abyte0[][], byte abyte1[], Conversation conversation, byte abyte2[], byte abyte3[]);

    private native byte[] contactToVCardNativeString(int i);

    private native SkyLib.ContentEncode_Result contentEncode(byte abyte0[], boolean flag);

    private native SkyLib.ContentEncodeCloud_Result contentEncodeCloud(byte abyte0[], boolean flag, boolean flag1);

    private native SkyLib.ContentEncodeEx_Result contentEncodeEx(byte abyte0[], boolean flag, boolean flag1);

    private native SkyLib.ContentGetEditable_Result contentGetEditable(byte abyte0[]);

    private native SkyLib.ContentGetRichEditable_Result contentGetRichEditable(byte abyte0[], byte abyte1[][]);

    private native SkyLib.ContentItemGet_Result contentItemGet(byte abyte0[], boolean flag);

    private native int contentItemGetChildCount(int i, byte abyte0[], boolean flag);

    private native SkyLib.ContentItemGetChildItem_Result contentItemGetChildItem(int i, byte abyte0[]);

    private native byte[] contentItemGetMetaNativeString(int i);

    private native byte[] contentItemGetTypeNativeString(int i);

    private native byte[] contentItemGetUriNativeString(int i);

    private native SkyLib.ContentStripXML_Result contentStripXML(byte abyte0[]);

    private native boolean createBasicContactSearch(byte abyte0[], ContactSearch contactsearch);

    private native boolean createEmoticonMediaDocument(byte abyte0[], MediaDocument mediadocument);

    private native int createHttpStream(SkyLib.HTTPFE_METHOD httpfe_method, byte abyte0[], byte abyte1[], int i);

    private native boolean createIdentitySearch(byte abyte0[], ContactSearch contactsearch);

    private native int createLocalVideo(Video.MEDIATYPE mediatype, byte abyte0[], byte abyte1[]);

    private native boolean createMediaDocument(MediaDocument.DOCUMENT_TYPE document_type, MediaDocument mediadocument, byte abyte0[]);

    private native boolean createMediaDocumentWithWebUrl(byte abyte0[], MediaDocument mediadocument);

    private native int createPreviewVideo(Video.MEDIATYPE mediatype, byte abyte0[], byte abyte1[]);

    private native SkyLib.CreateSignedToken_Result createSignedToken(byte abyte0[]);

    private native boolean createVideoMessageWithFile(byte abyte0[], byte abyte1[], byte abyte2[], VideoMessage videomessage, byte abyte3[], byte abyte4[]);

    private native void declareExtendedProp(SkyLib.OBJECTTYPE objecttype, byte abyte0[], PROPKEY propkey, Metatag.TYPE type);

    private native void displayVideoDeviceTuningDialog(byte abyte0[], byte abyte1[]);

    private native void ecsAddQueryParameter(byte abyte0[], byte abyte1[], byte abyte2[]);

    private native byte[] ecsGetETagNativeString();

    private native boolean ecsGetSettingsAsBool(byte abyte0[], byte abyte1[], boolean flag);

    private native int ecsGetSettingsAsInt(byte abyte0[], byte abyte1[], int i);

    private native byte[] ecsGetSettingsAsStringNativeString(byte abyte0[], byte abyte1[], byte abyte2[]);

    private native void ecsRemoveQueryParameter(byte abyte0[], byte abyte1[]);

    private native void ecsRemoveQueryParameterByNamespace(byte abyte0[]);

    private native SkyLib.FetchLocal_Result fetchLocal(byte abyte0[]);

    private native SkyLib.FindContactByPstnNumber_Result findContactByPstnNumber(byte abyte0[], Contact contact);

    private native boolean findContactBySpeedDial(byte abyte0[], Contact contact);

    private native SkyLib.FindContactsByEmail_Result findContactsByEmail(byte abyte0[]);

    private native SkyLib.FindObjects_Result findObjects(SkyLib.OBJECTTYPE objecttype, byte abyte0[]);

    private native void fireIntent(SkyLib.INTENT intent, byte abyte0[]);

    private native boolean getAccount(byte abyte0[], Account account);

    private native boolean getAccountAvatar(long l, byte abyte0[], byte abyte1[], byte abyte2[], byte abyte3[]);

    private native SkyLib.GetAudioDeviceCapabilities_Result getAudioDeviceCapabilities(byte abyte0[]);

    private native boolean getContact(byte abyte0[], Contact contact);

    private native Contact.TYPE getContactType(byte abyte0[]);

    private native boolean getConversationByBlob(byte abyte0[], Conversation conversation, boolean flag);

    private native boolean getConversationByCallGUID(byte abyte0[], Conversation conversation);

    private native boolean getConversationByIdentity(byte abyte0[], Conversation conversation, boolean flag);

    private native boolean getConversationByParticipants(byte abyte0[][], Conversation conversation, boolean flag, boolean flag1);

    private native byte[] getDebugStringNativeString(SkyLib.DEBUG_STRING debug_string);

    private native byte[] getDefaultAccountNameNativeString();

    private native byte[] getDefaultDBPathNativeString(boolean flag);

    private native SkyLib.GetEmoticonList_Result getEmoticonList(byte abyte0[]);

    private native boolean getGreeting(byte abyte0[], Voicemail voicemail);

    private native byte[] getISOCountryCodebyPhoneNoNativeString(byte abyte0[]);

    private native byte[] getISOFormattedCurrencyNativeString(long l, int i, byte abyte0[]);

    private native SkyLib.IDENTITYTYPE getIdentityType(byte abyte0[]);

    private native SkyLib.GetPackList_Result getPackList(byte abyte0[]);

    private native boolean getPartnerLinkInfo(long l, byte abyte0[], byte abyte1[]);

    private native byte[] getRegistrationIdNativeString();

    private native void getSeamlessCapable(byte abyte0[]);

    private native boolean getSkypeLinkInfo(long l, byte abyte0[]);

    private native byte[] getStrLibPropInternalNativeString(int i, byte abyte0[]);

    private native byte[] getStrLibPropNativeString(SkyLib.LIBPROP libprop, byte abyte0[]);

    private native boolean getSuggestedAccounts(long l, byte abyte0[]);

    private native byte[] getSuggestedSkypenameNativeString(byte abyte0[]);

    private native byte[] getUIStrPropNativeString(SkyLib.UIPROP uiprop, byte abyte0[]);

    private native byte[] getVCardOwnerNativeString(byte abyte0[]);

    private native SkyLib.VIDEO_DEVICE_TYPE getVideoDeviceType(byte abyte0[], byte abyte1[]);

    private native int handlePushNotification(int i, byte abyte0[], byte abyte1[], byte abyte2[]);

    private native boolean hasCalled(byte abyte0[]);

    private native boolean hasVideoDeviceCapability(byte abyte0[], byte abyte1[], Video.VIDEO_DEVICE_CAPABILITY video_device_capability);

    private native boolean identitiesMatch(byte abyte0[], byte abyte1[]);

    private native SkyLib.IngestAddContactAndLookupExisting_Result ingestAddContactAndLookupExisting(byte abyte0[], byte abyte1[], byte abyte2[], byte abyte3[], byte abyte4[], byte abyte5[], byte abyte6[]);

    private native boolean ingestAddContactInfo(byte abyte0[], byte abyte1[], byte abyte2[], byte abyte3[], byte abyte4[], byte abyte5[], byte abyte6[]);

    private native void ingestDeleteContactInfo(byte abyte0[]);

    private native boolean issuePriceQuote(byte abyte0[], PriceQuote.TYPE type, byte abyte1[], int i, int j, byte abyte2[], int k, 
            PriceQuote pricequote);

    private native boolean joinExistingConferenceCall(byte abyte0[], byte abyte1[]);

    private native boolean linkAccountWithPartner(long l, byte abyte0[], byte abyte1[], byte abyte2[], byte abyte3[], boolean flag, 
            boolean flag1);

    private native SkyLib.NormalizeIdentity_Result normalizeIdentity(byte abyte0[], boolean flag);

    private native SkyLib.NormalizePSTNWithCountry_Result normalizePSTNWithCountry(byte abyte0[], int i);

    private native SkyLib.PREPARESOUNDRESULT playStartFromFile(int i, byte abyte0[], boolean flag, boolean flag1);

    private native SkyLib.PrepareSoundFromFile_Result prepareSoundFromFile(byte abyte0[]);

    private native SkyLib.PublicAPIRequest_Result publicAPIRequest(int i, byte abyte0[]);

    private native boolean putAuthTokens(long l, byte abyte0[][], byte abyte1[], int i, byte abyte2[]);

    private native SkyLib.QueryContentListing_Result queryContentListing(byte abyte0[], SkyLib.CONTENT_LIST_CONTEXT content_list_context);

    private native int registerContexts(SkyLib.SERVICE_TYPE service_type, byte abyte0[], byte abyte1[], byte abyte2[][], byte abyte3[][], int ai[]);

    private native int registerContextsEx(SkyLib.SERVICE_TYPE aservice_type[], byte abyte0[], byte abyte1[], byte abyte2[][], byte abyte3[][], int ai[], byte abyte4[], 
            byte abyte5[]);

    private native int registerContextsEx2(SkyLib.SERVICE_TYPE aservice_type[], byte abyte0[], byte abyte1[], byte abyte2[][], byte abyte3[][], int ai[], byte abyte4[], 
            byte abyte5[], byte abyte6[], byte abyte7[]);

    private native boolean reportStatsEvent(int i, byte abyte0[], byte abyte1[]);

    private native int requestAccessToken(long l, byte abyte0[], boolean flag);

    private native boolean requestConfirmationCode(Sms.CONFIRM_TYPE confirm_type, byte abyte0[], Sms sms);

    private native int requestWebSessionWithPassword(byte abyte0[], byte abyte1[]);

    private native int reregisterContextsEx2(byte abyte0[], byte abyte1[]);

    private native int searchMessages(byte abyte0[], int i);

    private native void selectSoundDevices(byte abyte0[], byte abyte1[], byte abyte2[]);

    private native int sendHttpRequest(SkyLib.HTTPFE_METHOD httpfe_method, byte abyte0[], byte abyte1[], byte abyte2[], int i);

    private native void setAndroidId(byte abyte0[]);

    private native void setIMEI(byte abyte0[]);

    private native boolean setInstallContentBundleName(byte abyte0[]);

    private native void setLocalizedString(SkyLib.LOCALIZED_STRING localized_string, byte abyte0[]);

    private native void setUIStrProp(SkyLib.UIPROP uiprop, byte abyte0[]);

    private native void startMonitoringQuality(byte abyte0[], boolean flag);

    private native SkyLib.QUALITYTESTRESULT stopMonitoringQuality(byte abyte0[], boolean flag);

    private native boolean storeLocal(byte abyte0[], byte abyte1[]);

    private native boolean submitConfirmationCode(byte abyte0[], byte abyte1[], Sms sms);

    private native boolean trouterCheckConnection(byte abyte0[]);

    private native boolean trouterReceiveData(byte abyte0[]);

    private native int unregisterAllContexts(byte abyte0[], byte abyte1[]);

    private native int unregisterContexts(byte abyte0[][]);

    private native int unregisterContextsEx2(byte abyte0[][], byte abyte1[], byte abyte2[]);

    private native int vCardToContact(byte abyte0[]);

    private native SkyLib.VALIDATERESULT validatePassword(byte abyte0[], byte abyte1[]);

    private native SkyLib.ValidateProfileString_Result validateProfileString(PROPKEY propkey, byte abyte0[], boolean flag);

    private native SkyLib.VerifyAndUnpack_Result verifyAndUnpack(byte abyte0[], byte abyte1[], SkyLib.UNPACK_TYPE unpack_type);

    private native SkyLib.VideoCommand_Result videoCommand(byte abyte0[]);

    private native byte[] voiceCommandNativeString(byte abyte0[]);

    public native SkyLib.AccessPaymentGetInt_Result accessPaymentGetInt(SkyLib.SA_PAYMENT_IID sa_payment_iid);

    public native SkyLib.AccessPaymentGetString_Result accessPaymentGetString(SkyLib.SA_PAYMENT_SID sa_payment_sid);

    public native int accessPaymentPoll();

    public native void accessPaymentReset();

    public native boolean accessPaymentSetInt(SkyLib.SA_PAYMENT_IID sa_payment_iid, int i);

    public boolean accessPaymentSetString(SkyLib.SA_PAYMENT_SID sa_payment_sid, String s)
    {
        return accessPaymentSetString(sa_payment_sid, NativeStringConvert.ConvertToNativeBytes(s));
    }

    public native boolean accessPaymentSubmit();

    public void addListener(SkyLib.SkyLibIListener skylibilistener)
    {
        synchronized (m_listeners)
        {
            m_listeners.add(skylibilistener);
        }
        return;
        skylibilistener;
        hashset;
        JVM INSTR monitorexit ;
        throw skylibilistener;
    }

    public native boolean addToObjectTrackingList(SkyLib.OBJECTTYPE objecttype, PROPKEY propkey);

    public boolean app2AppConnect(String s, String s1)
    {
        return app2AppConnect(NativeStringConvert.ConvertToNativeBytes(s), NativeStringConvert.ConvertToNativeBytes(s1));
    }

    public boolean app2AppCreate(String s)
    {
        return app2AppCreate(NativeStringConvert.ConvertToNativeBytes(s));
    }

    public boolean app2AppDatagram(String s, String s1, byte abyte0[])
    {
        return app2AppDatagram(NativeStringConvert.ConvertToNativeBytes(s), NativeStringConvert.ConvertToNativeBytes(s1), abyte0);
    }

    public boolean app2AppDelete(String s)
    {
        return app2AppDelete(NativeStringConvert.ConvertToNativeBytes(s));
    }

    public boolean app2AppDisconnect(String s, String s1)
    {
        return app2AppDisconnect(NativeStringConvert.ConvertToNativeBytes(s), NativeStringConvert.ConvertToNativeBytes(s1));
    }

    public SkyLib.App2AppGetConnectableUsers_Result app2AppGetConnectableUsers(String s)
    {
        return app2AppGetConnectableUsers(NativeStringConvert.ConvertToNativeBytes(s));
    }

    public SkyLib.App2AppGetStreamsList_Result app2AppGetStreamsList(String s, SkyLib.APP2APP_STREAMS app2app_streams)
    {
        return app2AppGetStreamsList(NativeStringConvert.ConvertToNativeBytes(s), app2app_streams);
    }

    public SkyLib.App2AppRead_Result app2AppRead(String s, String s1)
    {
        return app2AppRead(NativeStringConvert.ConvertToNativeBytes(s), NativeStringConvert.ConvertToNativeBytes(s1));
    }

    public boolean app2AppSetDesiredMinimumBandwidth(String s, String s1, int i)
    {
        return app2AppSetDesiredMinimumBandwidth(NativeStringConvert.ConvertToNativeBytes(s), NativeStringConvert.ConvertToNativeBytes(s1), i);
    }

    public boolean app2AppWrite(String s, String s1, byte abyte0[])
    {
        return app2AppWrite(NativeStringConvert.ConvertToNativeBytes(s), NativeStringConvert.ConvertToNativeBytes(s1), abyte0);
    }

    public int attachPublicAPIClient()
    {
        return attachPublicAPIClient(false);
    }

    public native int attachPublicAPIClient(boolean flag);

    public boolean callExistingConference(String as[], String s, Conversation conversation)
    {
        return callExistingConference(as, s, conversation, "", "");
    }

    public boolean callExistingConference(String as[], String s, Conversation conversation, String s1)
    {
        return callExistingConference(as, s, conversation, s1, "");
    }

    public boolean callExistingConference(String as[], String s, Conversation conversation, String s1, String s2)
    {
        return callExistingConference(NativeStringConvert.ConvertArrToNativeByteArr(as), NativeStringConvert.ConvertToNativeBytes(s), conversation, NativeStringConvert.ConvertToNativeBytes(s1), NativeStringConvert.ConvertToNativeBytes(s2));
    }

    public native SkyLib.CanUnifyContacts_Result canUnifyContacts(int ai[]);

    public native void changeBackgroundMode(boolean flag);

    public native void changeOperationMode(int i);

    public native boolean checkClientUpgrade();

    public native void clearHttpCookies();

    public native void clearInbox(int i);

    public native void consumeAllConversations();

    public String contactToVCard(int i)
    {
        return NativeStringConvert.ConvertFromNativeBytes(contactToVCardNativeString(i));
    }

    public SkyLib.ContentEncode_Result contentEncode(String s)
    {
        return contentEncode(s, false);
    }

    public SkyLib.ContentEncode_Result contentEncode(String s, boolean flag)
    {
        return contentEncode(NativeStringConvert.ConvertToNativeBytes(s), flag);
    }

    public SkyLib.ContentEncodeCloud_Result contentEncodeCloud(String s)
    {
        return contentEncodeCloud(s, false, false);
    }

    public SkyLib.ContentEncodeCloud_Result contentEncodeCloud(String s, boolean flag)
    {
        return contentEncodeCloud(s, flag, false);
    }

    public SkyLib.ContentEncodeCloud_Result contentEncodeCloud(String s, boolean flag, boolean flag1)
    {
        return contentEncodeCloud(NativeStringConvert.ConvertToNativeBytes(s), flag, flag1);
    }

    public SkyLib.ContentEncodeEx_Result contentEncodeEx(String s)
    {
        return contentEncodeEx(s, false, false);
    }

    public SkyLib.ContentEncodeEx_Result contentEncodeEx(String s, boolean flag)
    {
        return contentEncodeEx(s, flag, false);
    }

    public SkyLib.ContentEncodeEx_Result contentEncodeEx(String s, boolean flag, boolean flag1)
    {
        return contentEncodeEx(NativeStringConvert.ConvertToNativeBytes(s), flag, flag1);
    }

    public SkyLib.ContentGetEditable_Result contentGetEditable(String s)
    {
        return contentGetEditable(NativeStringConvert.ConvertToNativeBytes(s));
    }

    public SkyLib.ContentGetRichEditable_Result contentGetRichEditable(String s, String as[])
    {
        return contentGetRichEditable(NativeStringConvert.ConvertToNativeBytes(s), NativeStringConvert.ConvertArrToNativeByteArr(as));
    }

    public void contentItemClosed(int i)
    {
        contentItemClosed(i, true);
    }

    public native void contentItemClosed(int i, boolean flag);

    public native void contentItemDelete(int i);

    public native void contentItemExecuted(int i);

    public native void contentItemExposingNow(int i, boolean flag);

    public SkyLib.ContentItemGet_Result contentItemGet(String s, boolean flag)
    {
        return contentItemGet(NativeStringConvert.ConvertToNativeBytes(s), flag);
    }

    public native SkyLib.ContentItemGetBody_Result contentItemGetBody(int i);

    public int contentItemGetChildCount(int i, String s, boolean flag)
    {
        return contentItemGetChildCount(i, NativeStringConvert.ConvertToNativeBytes(s), flag);
    }

    public SkyLib.ContentItemGetChildItem_Result contentItemGetChildItem(int i, String s)
    {
        return contentItemGetChildItem(i, NativeStringConvert.ConvertToNativeBytes(s));
    }

    public native SkyLib.ContentItemGetChildNames_Result contentItemGetChildNames(int i);

    public String contentItemGetMeta(int i)
    {
        return NativeStringConvert.ConvertFromNativeBytes(contentItemGetMetaNativeString(i));
    }

    public String contentItemGetType(int i)
    {
        return NativeStringConvert.ConvertFromNativeBytes(contentItemGetTypeNativeString(i));
    }

    public String contentItemGetUri(int i)
    {
        return NativeStringConvert.ConvertFromNativeBytes(contentItemGetUriNativeString(i));
    }

    public native int contentItemRunBytecode(int i);

    public SkyLib.ContentStripXML_Result contentStripXML(String s)
    {
        return contentStripXML(NativeStringConvert.ConvertToNativeBytes(s));
    }

    public native boolean createAccessSession(AccessSession accesssession);

    public boolean createBasicContactSearch(String s, ContactSearch contactsearch)
    {
        return createBasicContactSearch(NativeStringConvert.ConvertToNativeBytes(s), contactsearch);
    }

    public native boolean createConference(Conversation conversation);

    public native void createContactSearch(ContactSearch contactsearch);

    public native boolean createCustomContactGroup(ContactGroup contactgroup);

    public boolean createEmoticonMediaDocument(String s, MediaDocument mediadocument)
    {
        return createEmoticonMediaDocument(NativeStringConvert.ConvertToNativeBytes(s), mediadocument);
    }

    public native long createHrtfAudioProcessor(int i);

    public int createHttpStream(SkyLib.HTTPFE_METHOD httpfe_method, String s, String s1)
    {
        return createHttpStream(httpfe_method, s, s1, 0);
    }

    public int createHttpStream(SkyLib.HTTPFE_METHOD httpfe_method, String s, String s1, int i)
    {
        return createHttpStream(httpfe_method, NativeStringConvert.ConvertToNativeBytes(s), NativeStringConvert.ConvertToNativeBytes(s1), i);
    }

    public boolean createIdentitySearch(String s, ContactSearch contactsearch)
    {
        return createIdentitySearch(NativeStringConvert.ConvertToNativeBytes(s), contactsearch);
    }

    public int createLocalVideo(Video.MEDIATYPE mediatype)
    {
        return createLocalVideo(mediatype, "", "");
    }

    public int createLocalVideo(Video.MEDIATYPE mediatype, String s)
    {
        return createLocalVideo(mediatype, s, "");
    }

    public int createLocalVideo(Video.MEDIATYPE mediatype, String s, String s1)
    {
        return createLocalVideo(mediatype, NativeStringConvert.ConvertToNativeBytes(s), NativeStringConvert.ConvertToNativeBytes(s1));
    }

    public boolean createMediaDocument(MediaDocument.DOCUMENT_TYPE document_type, MediaDocument mediadocument)
    {
        return createMediaDocument(document_type, mediadocument, "");
    }

    public boolean createMediaDocument(MediaDocument.DOCUMENT_TYPE document_type, MediaDocument mediadocument, String s)
    {
        return createMediaDocument(document_type, mediadocument, NativeStringConvert.ConvertToNativeBytes(s));
    }

    public boolean createMediaDocumentWithWebUrl(String s, MediaDocument mediadocument)
    {
        return createMediaDocumentWithWebUrl(NativeStringConvert.ConvertToNativeBytes(s), mediadocument);
    }

    public NativeWeakRef createNativeWeakRef(ObjectInterfaceFactory objectinterfacefactory, ReferenceQueue referencequeue)
    {
        return new a(objectinterfacefactory, this, referencequeue, m_nativeObject);
    }

    public native boolean createOutgoingSms(Sms sms);

    public int createPreviewVideo(Video.MEDIATYPE mediatype)
    {
        return createPreviewVideo(mediatype, "", "");
    }

    public int createPreviewVideo(Video.MEDIATYPE mediatype, String s)
    {
        return createPreviewVideo(mediatype, s, "");
    }

    public int createPreviewVideo(Video.MEDIATYPE mediatype, String s, String s1)
    {
        return createPreviewVideo(mediatype, NativeStringConvert.ConvertToNativeBytes(s), NativeStringConvert.ConvertToNativeBytes(s1));
    }

    public SkyLib.CreateSignedToken_Result createSignedToken(String s)
    {
        return createSignedToken(NativeStringConvert.ConvertToNativeBytes(s));
    }

    public boolean createVideoMessageWithFile(String s, String s1, String s2, VideoMessage videomessage)
    {
        return createVideoMessageWithFile(s, s1, s2, videomessage, "", "");
    }

    public boolean createVideoMessageWithFile(String s, String s1, String s2, VideoMessage videomessage, String s3)
    {
        return createVideoMessageWithFile(s, s1, s2, videomessage, s3, "");
    }

    public boolean createVideoMessageWithFile(String s, String s1, String s2, VideoMessage videomessage, String s3, String s4)
    {
        return createVideoMessageWithFile(NativeStringConvert.ConvertToNativeBytes(s), NativeStringConvert.ConvertToNativeBytes(s1), NativeStringConvert.ConvertToNativeBytes(s2), videomessage, NativeStringConvert.ConvertToNativeBytes(s3), NativeStringConvert.ConvertToNativeBytes(s4));
    }

    public native void customAPICall(int i);

    public void declareExtendedProp(SkyLib.OBJECTTYPE objecttype, String s, PROPKEY propkey, Metatag.TYPE type)
    {
        declareExtendedProp(objecttype, NativeStringConvert.ConvertToNativeBytes(s), propkey, type);
    }

    public native void deleteAllMessages();

    public native boolean deleteHrtfAudioProcessor(long l);

    public native void deleteUIProp(SkyLib.UIPROP uiprop);

    public native void detachPublicAPIClient(int i);

    public void displayVideoDeviceTuningDialog(String s, String s1)
    {
        displayVideoDeviceTuningDialog(NativeStringConvert.ConvertToNativeBytes(s), NativeStringConvert.ConvertToNativeBytes(s1));
    }

    public void ecsAddQueryParameter(String s, String s1, String s2)
    {
        ecsAddQueryParameter(NativeStringConvert.ConvertToNativeBytes(s), NativeStringConvert.ConvertToNativeBytes(s1), NativeStringConvert.ConvertToNativeBytes(s2));
    }

    public String ecsGetETag()
    {
        return NativeStringConvert.ConvertFromNativeBytes(ecsGetETagNativeString());
    }

    public boolean ecsGetSettingsAsBool(String s, String s1, boolean flag)
    {
        return ecsGetSettingsAsBool(NativeStringConvert.ConvertToNativeBytes(s), NativeStringConvert.ConvertToNativeBytes(s1), flag);
    }

    public int ecsGetSettingsAsInt(String s, String s1, int i)
    {
        return ecsGetSettingsAsInt(NativeStringConvert.ConvertToNativeBytes(s), NativeStringConvert.ConvertToNativeBytes(s1), i);
    }

    public String ecsGetSettingsAsString(String s, String s1, String s2)
    {
        return NativeStringConvert.ConvertFromNativeBytes(ecsGetSettingsAsStringNativeString(NativeStringConvert.ConvertToNativeBytes(s), NativeStringConvert.ConvertToNativeBytes(s1), NativeStringConvert.ConvertToNativeBytes(s2)));
    }

    public void ecsRemoveQueryParameter(String s, String s1)
    {
        ecsRemoveQueryParameter(NativeStringConvert.ConvertToNativeBytes(s), NativeStringConvert.ConvertToNativeBytes(s1));
    }

    public void ecsRemoveQueryParameterByNamespace(String s)
    {
        ecsRemoveQueryParameterByNamespace(NativeStringConvert.ConvertToNativeBytes(s));
    }

    public native boolean enableHrtfAudioProcessor(long l, boolean flag);

    public native void executeBackgroundTask();

    public SkyLib.FetchLocal_Result fetchLocal(String s)
    {
        return fetchLocal(NativeStringConvert.ConvertToNativeBytes(s));
    }

    public boolean fillInbox()
    {
        return fillInbox(0xed4e00, false);
    }

    public boolean fillInbox(int i)
    {
        return fillInbox(i, false);
    }

    public native boolean fillInbox(int i, boolean flag);

    public SkyLib.FindContactByPstnNumber_Result findContactByPstnNumber(String s, Contact contact)
    {
        return findContactByPstnNumber(NativeStringConvert.ConvertToNativeBytes(s), contact);
    }

    public boolean findContactBySpeedDial(String s, Contact contact)
    {
        return findContactBySpeedDial(NativeStringConvert.ConvertToNativeBytes(s), contact);
    }

    public SkyLib.FindContactsByEmail_Result findContactsByEmail(String s)
    {
        return findContactsByEmail(NativeStringConvert.ConvertToNativeBytes(s));
    }

    public native int findObjectByDbID(SkyLib.OBJECTTYPE objecttype, int i);

    public SkyLib.FindObjects_Result findObjects(SkyLib.OBJECTTYPE objecttype, String s)
    {
        return findObjects(objecttype, NativeStringConvert.ConvertToNativeBytes(s));
    }

    public int findPromotedSCDContacts()
    {
        return findPromotedSCDContacts(true);
    }

    public native int findPromotedSCDContacts(boolean flag);

    public void fireIntent(SkyLib.INTENT intent)
    {
        fireIntent(intent, "");
    }

    public void fireIntent(SkyLib.INTENT intent, String s)
    {
        fireIntent(intent, NativeStringConvert.ConvertToNativeBytes(s));
    }

    public native void forceEasContactsSync();

    public native boolean getAccessSession(int i, AccessSession accesssession);

    public native boolean getAccount(int i, Account account);

    public boolean getAccount(String s, Account account)
    {
        return getAccount(NativeStringConvert.ConvertToNativeBytes(s), account);
    }

    public boolean getAccountAvatar(long l, String s, String s1, String s2, String s3)
    {
        return getAccountAvatar(l, NativeStringConvert.ConvertToNativeBytes(s), NativeStringConvert.ConvertToNativeBytes(s1), NativeStringConvert.ConvertToNativeBytes(s2), NativeStringConvert.ConvertToNativeBytes(s3));
    }

    public native boolean getAlert(int i, Alert alert);

    public SkyLib.GetAudioDeviceCapabilities_Result getAudioDeviceCapabilities(String s)
    {
        return getAudioDeviceCapabilities(NativeStringConvert.ConvertToNativeBytes(s));
    }

    public native SkyLib.GetAvailableOutputDevices_Result getAvailableOutputDevices();

    public native SkyLib.GetAvailableRecordingDevices_Result getAvailableRecordingDevices();

    public native SkyLib.GetAvailableVideoDevices_Result getAvailableVideoDevices();

    public native SkyLib.GetCallerIDNumbers_Result getCallerIDNumbers();

    public native SkyLib.GetCallerIDOptions_Result getCallerIDOptions();

    public native int getChatMemberCountLimit();

    public native int getClientTelemetry();

    public native SkyLib.GetConnectivity_Result getConnectivity();

    public native boolean getContact(int i, Contact contact);

    public boolean getContact(String s, Contact contact)
    {
        return getContact(NativeStringConvert.ConvertToNativeBytes(s), contact);
    }

    public native boolean getContactGroup(int i, ContactGroup contactgroup);

    public native boolean getContactSearch(int i, ContactSearch contactsearch);

    public Contact.TYPE getContactType(String s)
    {
        return getContactType(NativeStringConvert.ConvertToNativeBytes(s));
    }

    public native boolean getConversation(int i, Conversation conversation);

    public boolean getConversationByBlob(String s, Conversation conversation)
    {
        return getConversationByBlob(s, conversation, true);
    }

    public boolean getConversationByBlob(String s, Conversation conversation, boolean flag)
    {
        return getConversationByBlob(NativeStringConvert.ConvertToNativeBytes(s), conversation, flag);
    }

    public boolean getConversationByCallGUID(String s, Conversation conversation)
    {
        return getConversationByCallGUID(NativeStringConvert.ConvertToNativeBytes(s), conversation);
    }

    public native boolean getConversationByConvoID(int i, Conversation conversation);

    public boolean getConversationByIdentity(String s, Conversation conversation)
    {
        return getConversationByIdentity(s, conversation, true);
    }

    public boolean getConversationByIdentity(String s, Conversation conversation, boolean flag)
    {
        return getConversationByIdentity(NativeStringConvert.ConvertToNativeBytes(s), conversation, flag);
    }

    public boolean getConversationByParticipants(String as[], Conversation conversation)
    {
        return getConversationByParticipants(as, conversation, false, false);
    }

    public boolean getConversationByParticipants(String as[], Conversation conversation, boolean flag)
    {
        return getConversationByParticipants(as, conversation, flag, false);
    }

    public boolean getConversationByParticipants(String as[], Conversation conversation, boolean flag, boolean flag1)
    {
        return getConversationByParticipants(NativeStringConvert.ConvertArrToNativeByteArr(as), conversation, flag, flag1);
    }

    public SkyLib.GetConversationList_Result getConversationList()
    {
        return getConversationList(Conversation.LIST_TYPE.ALL_CONVERSATIONS);
    }

    public native SkyLib.GetConversationList_Result getConversationList(Conversation.LIST_TYPE list_type);

    public native boolean getConversationMessage(int i, Message message);

    public native void getConversationTable(Conversation.LIST_TYPE list_type, PROPKEY apropkey[], Proptable proptable);

    public native SkyLib.GetCustomContactGroups_Result getCustomContactGroups();

    public String getDebugString(SkyLib.DEBUG_STRING debug_string)
    {
        return NativeStringConvert.ConvertFromNativeBytes(getDebugStringNativeString(debug_string));
    }

    public String getDefaultAccountName()
    {
        return NativeStringConvert.ConvertFromNativeBytes(getDefaultAccountNameNativeString());
    }

    public native SkyLib.GetDefaultContentId_Result getDefaultContentId(MediaDocument.DOCUMENT_TYPE document_type);

    public String getDefaultDBPath()
    {
        return getDefaultDBPath(true);
    }

    public String getDefaultDBPath(boolean flag)
    {
        return NativeStringConvert.ConvertFromNativeBytes(getDefaultDBPathNativeString(flag));
    }

    public SkyLib.GetEmoticonList_Result getEmoticonList(String s)
    {
        return getEmoticonList(NativeStringConvert.ConvertToNativeBytes(s));
    }

    public native SkyLib.GetEmoticonListFromPack_Result getEmoticonListFromPack(int i);

    public native SkyLib.GetExistingAccounts_Result getExistingAccounts();

    public boolean getGreeting(String s, Voicemail voicemail)
    {
        return getGreeting(NativeStringConvert.ConvertToNativeBytes(s), voicemail);
    }

    public native int getHardwiredContactGroup(ContactGroup.TYPE type);

    public String getISOCountryCodebyPhoneNo(String s)
    {
        return NativeStringConvert.ConvertFromNativeBytes(getISOCountryCodebyPhoneNoNativeString(NativeStringConvert.ConvertToNativeBytes(s)));
    }

    public native SkyLib.GetISOCountryInfo_Result getISOCountryInfo();

    public String getISOFormattedCurrency(long l, int i, String s)
    {
        return NativeStringConvert.ConvertFromNativeBytes(getISOFormattedCurrencyNativeString(l, i, NativeStringConvert.ConvertToNativeBytes(s)));
    }

    public native SkyLib.GetISOLanguageInfo_Result getISOLanguageInfo();

    public SkyLib.IDENTITYTYPE getIdentityType(String s)
    {
        return getIdentityType(NativeStringConvert.ConvertToNativeBytes(s));
    }

    public native int getIntLibProp(SkyLib.LIBPROP libprop);

    public native SkyLib.GetLastConfirmationNumber_Result getLastConfirmationNumber();

    public native boolean getMediaDocument(int i, MediaDocument mediadocument);

    public native boolean getMessageAnnotation(int i, MessageAnnotation messageannotation);

    public native boolean getMessageByGuid(byte abyte0[], Message message);

    public SkyLib.GetMessageList_Result getMessageList()
    {
        return getMessageList(0, -1);
    }

    public SkyLib.GetMessageList_Result getMessageList(int i)
    {
        return getMessageList(i, -1);
    }

    public native SkyLib.GetMessageList_Result getMessageList(int i, int j);

    public SkyLib.GetMessageListByType_Result getMessageListByType(Message.TYPE type, boolean flag)
    {
        return getMessageListByType(type, flag, 0, -1);
    }

    public SkyLib.GetMessageListByType_Result getMessageListByType(Message.TYPE type, boolean flag, int i)
    {
        return getMessageListByType(type, flag, i, -1);
    }

    public native SkyLib.GetMessageListByType_Result getMessageListByType(Message.TYPE type, boolean flag, int i, int j);

    public native int getMicVolume();

    public native SkyLib.GetNrgLevels_Result getNrgLevels();

    public native boolean getObjectInterface(int i, ObjectInterface objectinterface);

    public native SkyLib.OBJECTTYPE getObjectType(int i);

    public native SkyLib.GetOptimalAgeRanges_Result getOptimalAgeRanges();

    public SkyLib.GetPackList_Result getPackList(String s)
    {
        return getPackList(NativeStringConvert.ConvertToNativeBytes(s));
    }

    public native SkyLib.GetPackListFromTab_Result getPackListFromTab(int i);

    public native boolean getParticipant(int i, Participant participant);

    public boolean getPartnerLinkInfo(long l)
    {
        return getPartnerLinkInfo(l, "", "");
    }

    public boolean getPartnerLinkInfo(long l, String s)
    {
        return getPartnerLinkInfo(l, s, "");
    }

    public boolean getPartnerLinkInfo(long l, String s, String s1)
    {
        return getPartnerLinkInfo(l, NativeStringConvert.ConvertToNativeBytes(s), NativeStringConvert.ConvertToNativeBytes(s1));
    }

    public native SkyLib.GetPendingMediaDocumentsList_Result getPendingMediaDocumentsList();

    public native boolean getPriceQuote(int i, PriceQuote pricequote);

    public native int getPropertyTable(int ai[], PROPKEY apropkey[], Proptable proptable);

    public native SkyLib.GetRecentAlerts_Result getRecentAlerts(int i, int j);

    public native SkyLib.GetRecentAlertsOfType_Result getRecentAlertsOfType(int i, int j, int ai[]);

    public String getRegistrationId()
    {
        return NativeStringConvert.ConvertFromNativeBytes(getRegistrationIdNativeString());
    }

    public void getSeamlessCapable(String s)
    {
        getSeamlessCapable(NativeStringConvert.ConvertToNativeBytes(s));
    }

    public native int getServerTime();

    public boolean getSkypeLinkInfo(long l, String s)
    {
        return getSkypeLinkInfo(l, NativeStringConvert.ConvertToNativeBytes(s));
    }

    public native boolean getSms(int i, Sms sms);

    public native int getSpeakerVolume();

    public String getStrLibProp(SkyLib.LIBPROP libprop)
    {
        return getStrLibProp(libprop, "");
    }

    public String getStrLibProp(SkyLib.LIBPROP libprop, String s)
    {
        return NativeStringConvert.ConvertFromNativeBytes(getStrLibPropNativeString(libprop, NativeStringConvert.ConvertToNativeBytes(s)));
    }

    public String getStrLibPropInternal(int i)
    {
        return getStrLibPropInternal(i, "");
    }

    public String getStrLibPropInternal(int i, String s)
    {
        return NativeStringConvert.ConvertFromNativeBytes(getStrLibPropInternalNativeString(i, NativeStringConvert.ConvertToNativeBytes(s)));
    }

    public boolean getSuggestedAccounts(long l, String s)
    {
        return getSuggestedAccounts(l, NativeStringConvert.ConvertToNativeBytes(s));
    }

    public String getSuggestedSkypename(String s)
    {
        return NativeStringConvert.ConvertFromNativeBytes(getSuggestedSkypenameNativeString(NativeStringConvert.ConvertToNativeBytes(s)));
    }

    public native SkyLib.GetSupportedUILanguageList_Result getSupportedUILanguageList();

    public native SkyLib.GetSyncKeyofContactGroup_Result getSyncKeyofContactGroup(ContactGroup.TYPE type);

    public native SkyLib.GetTabList_Result getTabList();

    public native int getTotalOnlineUserCount();

    public native boolean getTransfer(int i, Transfer transfer);

    public native boolean getTranslator(int i, Translator translator);

    public native int getUIIntProp(SkyLib.UIPROP uiprop);

    public String getUIStrProp(SkyLib.UIPROP uiprop)
    {
        return getUIStrProp(uiprop, "");
    }

    public String getUIStrProp(SkyLib.UIPROP uiprop, String s)
    {
        return NativeStringConvert.ConvertFromNativeBytes(getUIStrPropNativeString(uiprop, NativeStringConvert.ConvertToNativeBytes(s)));
    }

    public int getUnconsumedConversationsCount()
    {
        return getUnconsumedConversationsCount(Conversation.LIST_TYPE.ALL_CONVERSATIONS);
    }

    public native int getUnconsumedConversationsCount(Conversation.LIST_TYPE list_type);

    public native SkyLib.GetVCard_Result getVCard();

    public String getVCardOwner(byte abyte0[])
    {
        return NativeStringConvert.ConvertFromNativeBytes(getVCardOwnerNativeString(abyte0));
    }

    public native SkyLib.GetValidatedSmsNumbers_Result getValidatedSmsNumbers();

    public native boolean getVideo(int i, Video video);

    public SkyLib.VIDEO_DEVICE_TYPE getVideoDeviceType(String s, String s1)
    {
        return getVideoDeviceType(NativeStringConvert.ConvertToNativeBytes(s), NativeStringConvert.ConvertToNativeBytes(s1));
    }

    public native boolean getVideoMessage(int i, VideoMessage videomessage);

    public native SkyLib.GetVideoMessagingEntitlement_Result getVideoMessagingEntitlement();

    public native boolean getVoicemail(int i, Voicemail voicemail);

    public int handlePushNotification(int i, byte abyte0[], byte abyte1[])
    {
        return handlePushNotification(i, abyte0, abyte1, "");
    }

    public int handlePushNotification(int i, byte abyte0[], byte abyte1[], String s)
    {
        return handlePushNotification(i, abyte0, abyte1, NativeStringConvert.ConvertToNativeBytes(s));
    }

    public boolean hasCalled(String s)
    {
        return hasCalled(NativeStringConvert.ConvertToNativeBytes(s));
    }

    public boolean hasVideoDeviceCapability(String s, String s1, Video.VIDEO_DEVICE_CAPABILITY video_device_capability)
    {
        return hasVideoDeviceCapability(NativeStringConvert.ConvertToNativeBytes(s), NativeStringConvert.ConvertToNativeBytes(s1), video_device_capability);
    }

    public boolean identitiesMatch(String s, String s1)
    {
        return identitiesMatch(NativeStringConvert.ConvertToNativeBytes(s), NativeStringConvert.ConvertToNativeBytes(s1));
    }

    public native boolean importBuddylist(byte abyte0[]);

    public native boolean importProfile(byte abyte0[]);

    public SkyLib.IngestAddContactAndLookupExisting_Result ingestAddContactAndLookupExisting(String s, String s1, String s2, String s3, String s4, String s5, String s6)
    {
        return ingestAddContactAndLookupExisting(NativeStringConvert.ConvertToNativeBytes(s), NativeStringConvert.ConvertToNativeBytes(s1), NativeStringConvert.ConvertToNativeBytes(s2), NativeStringConvert.ConvertToNativeBytes(s3), NativeStringConvert.ConvertToNativeBytes(s4), NativeStringConvert.ConvertToNativeBytes(s5), NativeStringConvert.ConvertToNativeBytes(s6));
    }

    public boolean ingestAddContactInfo(String s, String s1)
    {
        return ingestAddContactInfo(s, s1, "", "", "", "", "");
    }

    public boolean ingestAddContactInfo(String s, String s1, String s2)
    {
        return ingestAddContactInfo(s, s1, s2, "", "", "", "");
    }

    public boolean ingestAddContactInfo(String s, String s1, String s2, String s3)
    {
        return ingestAddContactInfo(s, s1, s2, s3, "", "", "");
    }

    public boolean ingestAddContactInfo(String s, String s1, String s2, String s3, String s4)
    {
        return ingestAddContactInfo(s, s1, s2, s3, s4, "", "");
    }

    public boolean ingestAddContactInfo(String s, String s1, String s2, String s3, String s4, String s5)
    {
        return ingestAddContactInfo(s, s1, s2, s3, s4, s5, "");
    }

    public boolean ingestAddContactInfo(String s, String s1, String s2, String s3, String s4, String s5, String s6)
    {
        return ingestAddContactInfo(NativeStringConvert.ConvertToNativeBytes(s), NativeStringConvert.ConvertToNativeBytes(s1), NativeStringConvert.ConvertToNativeBytes(s2), NativeStringConvert.ConvertToNativeBytes(s3), NativeStringConvert.ConvertToNativeBytes(s4), NativeStringConvert.ConvertToNativeBytes(s5), NativeStringConvert.ConvertToNativeBytes(s6));
    }

    public void ingestDeleteContactInfo(String s)
    {
        ingestDeleteContactInfo(NativeStringConvert.ConvertToNativeBytes(s));
    }

    public native SkyLib.IngestGetMatchingContactIds_Result ingestGetMatchingContactIds(int i);

    public native void ingestLookup();

    public native void initializeListener();

    public native boolean isContactListMasteredInABCH();

    public native SkyLib.IsMicrophoneMuted_Result isMicrophoneMuted();

    public native SkyLib.IsSpeakerMuted_Result isSpeakerMuted();

    public boolean issuePriceQuote(String s, PriceQuote.TYPE type, String s1, int i, int j, String s2, int k, 
            PriceQuote pricequote)
    {
        return issuePriceQuote(NativeStringConvert.ConvertToNativeBytes(s), type, NativeStringConvert.ConvertToNativeBytes(s1), i, j, NativeStringConvert.ConvertToNativeBytes(s2), k, pricequote);
    }

    public boolean joinExistingConferenceCall(String s, String s1)
    {
        return joinExistingConferenceCall(NativeStringConvert.ConvertToNativeBytes(s), NativeStringConvert.ConvertToNativeBytes(s1));
    }

    public boolean linkAccountWithPartner(long l, String s, String s1, String s2)
    {
        return linkAccountWithPartner(l, s, s1, s2, "", false, false);
    }

    public boolean linkAccountWithPartner(long l, String s, String s1, String s2, String s3)
    {
        return linkAccountWithPartner(l, s, s1, s2, s3, false, false);
    }

    public boolean linkAccountWithPartner(long l, String s, String s1, String s2, String s3, boolean flag)
    {
        return linkAccountWithPartner(l, s, s1, s2, s3, flag, false);
    }

    public boolean linkAccountWithPartner(long l, String s, String s1, String s2, String s3, boolean flag, 
            boolean flag1)
    {
        return linkAccountWithPartner(l, NativeStringConvert.ConvertToNativeBytes(s), NativeStringConvert.ConvertToNativeBytes(s1), NativeStringConvert.ConvertToNativeBytes(s2), NativeStringConvert.ConvertToNativeBytes(s3), flag, flag1);
    }

    public native void markObjectTrackerItemsAsConsumed(int i);

    public native boolean muteMicrophone(boolean flag);

    public native boolean muteSpeakers(boolean flag);

    public SkyLib.NormalizeIdentity_Result normalizeIdentity(String s)
    {
        return normalizeIdentity(s, false);
    }

    public SkyLib.NormalizeIdentity_Result normalizeIdentity(String s, boolean flag)
    {
        return normalizeIdentity(NativeStringConvert.ConvertToNativeBytes(s), flag);
    }

    public SkyLib.NormalizePSTNWithCountry_Result normalizePSTNWithCountry(String s)
    {
        return normalizePSTNWithCountry(s, 0);
    }

    public SkyLib.NormalizePSTNWithCountry_Result normalizePSTNWithCountry(String s, int i)
    {
        return normalizePSTNWithCountry(NativeStringConvert.ConvertToNativeBytes(s), i);
    }

    public void onAccessConnected()
    {
        HashSet hashset = m_listeners;
        hashset;
        JVM INSTR monitorenter ;
        for (Iterator iterator = m_listeners.iterator(); iterator.hasNext(); ((SkyLib.SkyLibIListener)iterator.next()).onAccessConnected(this)) { }
        break MISSING_BLOCK_LABEL_47;
        Exception exception;
        exception;
        hashset;
        JVM INSTR monitorexit ;
        throw exception;
        hashset;
        JVM INSTR monitorexit ;
    }

    public void onAccessConnectionFailure(AccessSession.FAILUREREASON failurereason)
    {
        HashSet hashset = m_listeners;
        hashset;
        JVM INSTR monitorenter ;
        for (Iterator iterator = m_listeners.iterator(); iterator.hasNext(); ((SkyLib.SkyLibIListener)iterator.next()).onAccessConnectionFailure(this, failurereason)) { }
        break MISSING_BLOCK_LABEL_48;
        failurereason;
        hashset;
        JVM INSTR monitorexit ;
        throw failurereason;
        hashset;
        JVM INSTR monitorexit ;
    }

    public void onAccessDetectFailure()
    {
        HashSet hashset = m_listeners;
        hashset;
        JVM INSTR monitorenter ;
        for (Iterator iterator = m_listeners.iterator(); iterator.hasNext(); ((SkyLib.SkyLibIListener)iterator.next()).onAccessDetectFailure(this)) { }
        break MISSING_BLOCK_LABEL_47;
        Exception exception;
        exception;
        hashset;
        JVM INSTR monitorexit ;
        throw exception;
        hashset;
        JVM INSTR monitorexit ;
    }

    public void onAccessDetecting(AccessSession.HOTSPOTTYPE hotspottype)
    {
        HashSet hashset = m_listeners;
        hashset;
        JVM INSTR monitorenter ;
        for (Iterator iterator = m_listeners.iterator(); iterator.hasNext(); ((SkyLib.SkyLibIListener)iterator.next()).onAccessDetecting(this, hotspottype)) { }
        break MISSING_BLOCK_LABEL_48;
        hotspottype;
        hashset;
        JVM INSTR monitorexit ;
        throw hotspottype;
        hashset;
        JVM INSTR monitorexit ;
    }

    public void onAccessDisconnected()
    {
        HashSet hashset = m_listeners;
        hashset;
        JVM INSTR monitorenter ;
        for (Iterator iterator = m_listeners.iterator(); iterator.hasNext(); ((SkyLib.SkyLibIListener)iterator.next()).onAccessDisconnected(this)) { }
        break MISSING_BLOCK_LABEL_47;
        Exception exception;
        exception;
        hashset;
        JVM INSTR monitorexit ;
        throw exception;
        hashset;
        JVM INSTR monitorexit ;
    }

    public void onAccessEvent(SkyLib.ACCESSEVENTTYPE accesseventtype, int i)
    {
        HashSet hashset = m_listeners;
        hashset;
        JVM INSTR monitorenter ;
        for (Iterator iterator = m_listeners.iterator(); iterator.hasNext(); ((SkyLib.SkyLibIListener)iterator.next()).onAccessEvent(this, accesseventtype, i)) { }
        break MISSING_BLOCK_LABEL_52;
        accesseventtype;
        hashset;
        JVM INSTR monitorexit ;
        throw accesseventtype;
        hashset;
        JVM INSTR monitorexit ;
    }

    public void onAccountAvatarResult(SkyLib.AUTH_RESULT auth_result, byte abyte0[], byte abyte1[])
    {
        HashSet hashset = m_listeners;
        hashset;
        JVM INSTR monitorenter ;
        for (Iterator iterator = m_listeners.iterator(); iterator.hasNext(); ((SkyLib.SkyLibIListener)iterator.next()).onAccountAvatarResult(this, auth_result, NativeStringConvert.ConvertFromNativeBytes(abyte0), abyte1)) { }
        break MISSING_BLOCK_LABEL_59;
        auth_result;
        hashset;
        JVM INSTR monitorexit ;
        throw auth_result;
        hashset;
        JVM INSTR monitorexit ;
    }

    public void onAccountPartnerLinkResult(SkyLib.AUTH_RESULT auth_result, byte abyte0[])
    {
        HashSet hashset = m_listeners;
        hashset;
        JVM INSTR monitorenter ;
        for (Iterator iterator = m_listeners.iterator(); iterator.hasNext(); ((SkyLib.SkyLibIListener)iterator.next()).onAccountPartnerLinkResult(this, auth_result, NativeStringConvert.ConvertFromNativeBytes(abyte0))) { }
        break MISSING_BLOCK_LABEL_55;
        auth_result;
        hashset;
        JVM INSTR monitorexit ;
        throw auth_result;
        hashset;
        JVM INSTR monitorexit ;
    }

    public void onApp2AppDatagram(byte abyte0[], byte abyte1[], byte abyte2[])
    {
        HashSet hashset = m_listeners;
        hashset;
        JVM INSTR monitorenter ;
        for (Iterator iterator = m_listeners.iterator(); iterator.hasNext(); ((SkyLib.SkyLibIListener)iterator.next()).onApp2AppDatagram(this, NativeStringConvert.ConvertFromNativeBytes(abyte0), NativeStringConvert.ConvertFromNativeBytes(abyte1), abyte2)) { }
        break MISSING_BLOCK_LABEL_62;
        abyte0;
        hashset;
        JVM INSTR monitorexit ;
        throw abyte0;
        hashset;
        JVM INSTR monitorexit ;
    }

    public void onApp2AppStreamListChange(byte abyte0[], SkyLib.APP2APP_STREAMS app2app_streams, byte abyte1[][], int ai[])
    {
        HashSet hashset = m_listeners;
        hashset;
        JVM INSTR monitorenter ;
        for (Iterator iterator = m_listeners.iterator(); iterator.hasNext(); ((SkyLib.SkyLibIListener)iterator.next()).onApp2AppStreamListChange(this, NativeStringConvert.ConvertFromNativeBytes(abyte0), app2app_streams, NativeStringConvert.ConvertFromNativeStringArray(abyte1), ai)) { }
        break MISSING_BLOCK_LABEL_64;
        abyte0;
        hashset;
        JVM INSTR monitorexit ;
        throw abyte0;
        hashset;
        JVM INSTR monitorexit ;
    }

    public void onAuthTokenRequest(long l, byte abyte0[][])
    {
        HashSet hashset = m_listeners;
        hashset;
        JVM INSTR monitorenter ;
        for (Iterator iterator = m_listeners.iterator(); iterator.hasNext(); ((SkyLib.SkyLibIListener)iterator.next()).onAuthTokenRequest(this, l, NativeStringConvert.ConvertFromNativeStringArray(abyte0))) { }
        break MISSING_BLOCK_LABEL_58;
        abyte0;
        hashset;
        JVM INSTR monitorexit ;
        throw abyte0;
        hashset;
        JVM INSTR monitorexit ;
    }

    public void onAuthTokenResult(boolean flag, int i, byte abyte0[])
    {
        HashSet hashset = m_listeners;
        hashset;
        JVM INSTR monitorenter ;
        for (Iterator iterator = m_listeners.iterator(); iterator.hasNext(); ((SkyLib.SkyLibIListener)iterator.next()).onAuthTokenResult(this, flag, i, NativeStringConvert.ConvertFromNativeBytes(abyte0))) { }
        break MISSING_BLOCK_LABEL_59;
        abyte0;
        hashset;
        JVM INSTR monitorexit ;
        throw abyte0;
        hashset;
        JVM INSTR monitorexit ;
    }

    public void onAuthTokenResultWithTimeout(boolean flag, int i, byte abyte0[], int j, int k)
    {
        HashSet hashset = m_listeners;
        hashset;
        JVM INSTR monitorenter ;
        for (Iterator iterator = m_listeners.iterator(); iterator.hasNext(); ((SkyLib.SkyLibIListener)iterator.next()).onAuthTokenResultWithTimeout(this, flag, i, NativeStringConvert.ConvertFromNativeBytes(abyte0), j, k)) { }
        break MISSING_BLOCK_LABEL_63;
        abyte0;
        hashset;
        JVM INSTR monitorexit ;
        throw abyte0;
        hashset;
        JVM INSTR monitorexit ;
    }

    public void onAvailableDeviceListChange()
    {
        HashSet hashset = m_listeners;
        hashset;
        JVM INSTR monitorenter ;
        for (Iterator iterator = m_listeners.iterator(); iterator.hasNext(); ((SkyLib.SkyLibIListener)iterator.next()).onAvailableDeviceListChange(this)) { }
        break MISSING_BLOCK_LABEL_47;
        Exception exception;
        exception;
        hashset;
        JVM INSTR monitorexit ;
        throw exception;
        hashset;
        JVM INSTR monitorexit ;
    }

    public void onAvailableVideoDeviceListChange()
    {
        HashSet hashset = m_listeners;
        hashset;
        JVM INSTR monitorenter ;
        for (Iterator iterator = m_listeners.iterator(); iterator.hasNext(); ((SkyLib.SkyLibIListener)iterator.next()).onAvailableVideoDeviceListChange(this)) { }
        break MISSING_BLOCK_LABEL_47;
        Exception exception;
        exception;
        hashset;
        JVM INSTR monitorexit ;
        throw exception;
        hashset;
        JVM INSTR monitorexit ;
    }

    public void onCallerIDOptionsChange(int i, SkyLib.CALLERID_OPTIONS_CHANGE callerid_options_change)
    {
        HashSet hashset = m_listeners;
        hashset;
        JVM INSTR monitorenter ;
        for (Iterator iterator = m_listeners.iterator(); iterator.hasNext(); ((SkyLib.SkyLibIListener)iterator.next()).onCallerIDOptionsChange(this, i, callerid_options_change)) { }
        break MISSING_BLOCK_LABEL_52;
        callerid_options_change;
        hashset;
        JVM INSTR monitorexit ;
        throw callerid_options_change;
        hashset;
        JVM INSTR monitorexit ;
    }

    public void onChatServiceConnectivity()
    {
        HashSet hashset = m_listeners;
        hashset;
        JVM INSTR monitorenter ;
        for (Iterator iterator = m_listeners.iterator(); iterator.hasNext(); ((SkyLib.SkyLibIListener)iterator.next()).onChatServiceConnectivity(this)) { }
        break MISSING_BLOCK_LABEL_47;
        Exception exception;
        exception;
        hashset;
        JVM INSTR monitorexit ;
        throw exception;
        hashset;
        JVM INSTR monitorexit ;
    }

    public void onCheckUpgradeResult(boolean flag, SkyLib.UPGRADERESULT upgraderesult)
    {
        HashSet hashset = m_listeners;
        hashset;
        JVM INSTR monitorenter ;
        for (Iterator iterator = m_listeners.iterator(); iterator.hasNext(); ((SkyLib.SkyLibIListener)iterator.next()).onCheckUpgradeResult(this, flag, upgraderesult)) { }
        break MISSING_BLOCK_LABEL_52;
        upgraderesult;
        hashset;
        JVM INSTR monitorexit ;
        throw upgraderesult;
        hashset;
        JVM INSTR monitorexit ;
    }

    public void onContactGoneOffline(int i)
    {
        HashSet hashset = m_listeners;
        hashset;
        JVM INSTR monitorenter ;
        for (Iterator iterator = m_listeners.iterator(); iterator.hasNext(); ((SkyLib.SkyLibIListener)iterator.next()).onContactGoneOffline(this, i)) { }
        break MISSING_BLOCK_LABEL_48;
        Exception exception;
        exception;
        hashset;
        JVM INSTR monitorexit ;
        throw exception;
        hashset;
        JVM INSTR monitorexit ;
    }

    public void onContactGroupMembershipChanged(int i, int j, boolean flag)
    {
        HashSet hashset = m_listeners;
        hashset;
        JVM INSTR monitorenter ;
        for (Iterator iterator = m_listeners.iterator(); iterator.hasNext(); ((SkyLib.SkyLibIListener)iterator.next()).onContactGroupMembershipChanged(this, i, j, flag)) { }
        break MISSING_BLOCK_LABEL_58;
        Exception exception;
        exception;
        hashset;
        JVM INSTR monitorexit ;
        throw exception;
        hashset;
        JVM INSTR monitorexit ;
    }

    public void onContactOnlineAppearance(int i)
    {
        HashSet hashset = m_listeners;
        hashset;
        JVM INSTR monitorenter ;
        for (Iterator iterator = m_listeners.iterator(); iterator.hasNext(); ((SkyLib.SkyLibIListener)iterator.next()).onContactOnlineAppearance(this, i)) { }
        break MISSING_BLOCK_LABEL_48;
        Exception exception;
        exception;
        hashset;
        JVM INSTR monitorexit ;
        throw exception;
        hashset;
        JVM INSTR monitorexit ;
    }

    public void onContentItemChange(int i)
    {
        HashSet hashset = m_listeners;
        hashset;
        JVM INSTR monitorenter ;
        for (Iterator iterator = m_listeners.iterator(); iterator.hasNext(); ((SkyLib.SkyLibIListener)iterator.next()).onContentItemChange(this, i)) { }
        break MISSING_BLOCK_LABEL_48;
        Exception exception;
        exception;
        hashset;
        JVM INSTR monitorexit ;
        throw exception;
        hashset;
        JVM INSTR monitorexit ;
    }

    public void onContentListingResult(int i, SkyLib.CONTENT_LIST_RESULT content_list_result, byte abyte0[], int j)
    {
        HashSet hashset = m_listeners;
        hashset;
        JVM INSTR monitorenter ;
        for (Iterator iterator = m_listeners.iterator(); iterator.hasNext(); ((SkyLib.SkyLibIListener)iterator.next()).onContentListingResult(this, i, content_list_result, abyte0, j)) { }
        break MISSING_BLOCK_LABEL_58;
        content_list_result;
        hashset;
        JVM INSTR monitorexit ;
        throw content_list_result;
        hashset;
        JVM INSTR monitorexit ;
    }

    public void onConversationListChange(int i, Conversation.LIST_TYPE list_type, boolean flag)
    {
        HashSet hashset = m_listeners;
        hashset;
        JVM INSTR monitorenter ;
        for (Iterator iterator = m_listeners.iterator(); iterator.hasNext(); ((SkyLib.SkyLibIListener)iterator.next()).onConversationListChange(this, i, list_type, flag)) { }
        break MISSING_BLOCK_LABEL_56;
        list_type;
        hashset;
        JVM INSTR monitorexit ;
        throw list_type;
        hashset;
        JVM INSTR monitorexit ;
    }

    public void onCustomAPINotification(int i)
    {
        HashSet hashset = m_listeners;
        hashset;
        JVM INSTR monitorenter ;
        for (Iterator iterator = m_listeners.iterator(); iterator.hasNext(); ((SkyLib.SkyLibIListener)iterator.next()).onCustomAPINotification(this, i)) { }
        break MISSING_BLOCK_LABEL_48;
        Exception exception;
        exception;
        hashset;
        JVM INSTR monitorexit ;
        throw exception;
        hashset;
        JVM INSTR monitorexit ;
    }

    public void onEcsEvent(SkyLib.ECS_CALLBACK_EVENT_TYPE ecs_callback_event_type)
    {
        HashSet hashset = m_listeners;
        hashset;
        JVM INSTR monitorenter ;
        for (Iterator iterator = m_listeners.iterator(); iterator.hasNext(); ((SkyLib.SkyLibIListener)iterator.next()).onEcsEvent(this, ecs_callback_event_type)) { }
        break MISSING_BLOCK_LABEL_48;
        ecs_callback_event_type;
        hashset;
        JVM INSTR monitorexit ;
        throw ecs_callback_event_type;
        hashset;
        JVM INSTR monitorexit ;
    }

    public void onEmoticonListUpdated()
    {
        HashSet hashset = m_listeners;
        hashset;
        JVM INSTR monitorenter ;
        for (Iterator iterator = m_listeners.iterator(); iterator.hasNext(); ((SkyLib.SkyLibIListener)iterator.next()).onEmoticonListUpdated(this)) { }
        break MISSING_BLOCK_LABEL_47;
        Exception exception;
        exception;
        hashset;
        JVM INSTR monitorexit ;
        throw exception;
        hashset;
        JVM INSTR monitorexit ;
    }

    public void onExternalLoginRequest(byte abyte0[])
    {
        HashSet hashset = m_listeners;
        hashset;
        JVM INSTR monitorenter ;
        for (Iterator iterator = m_listeners.iterator(); iterator.hasNext(); ((SkyLib.SkyLibIListener)iterator.next()).onExternalLoginRequest(this, abyte0)) { }
        break MISSING_BLOCK_LABEL_48;
        abyte0;
        hashset;
        JVM INSTR monitorexit ;
        throw abyte0;
        hashset;
        JVM INSTR monitorexit ;
    }

    public void onFileTransferInitiated(int i, int j, int k)
    {
        HashSet hashset = m_listeners;
        hashset;
        JVM INSTR monitorenter ;
        for (Iterator iterator = m_listeners.iterator(); iterator.hasNext(); ((SkyLib.SkyLibIListener)iterator.next()).onFileTransferInitiated(this, i, j, k)) { }
        break MISSING_BLOCK_LABEL_58;
        Exception exception;
        exception;
        hashset;
        JVM INSTR monitorexit ;
        throw exception;
        hashset;
        JVM INSTR monitorexit ;
    }

    public void onH264Activated()
    {
        HashSet hashset = m_listeners;
        hashset;
        JVM INSTR monitorenter ;
        for (Iterator iterator = m_listeners.iterator(); iterator.hasNext(); ((SkyLib.SkyLibIListener)iterator.next()).onH264Activated(this)) { }
        break MISSING_BLOCK_LABEL_47;
        Exception exception;
        exception;
        hashset;
        JVM INSTR monitorexit ;
        throw exception;
        hashset;
        JVM INSTR monitorexit ;
    }

    public void onHistorySyncFinished()
    {
        HashSet hashset = m_listeners;
        hashset;
        JVM INSTR monitorenter ;
        for (Iterator iterator = m_listeners.iterator(); iterator.hasNext(); ((SkyLib.SkyLibIListener)iterator.next()).onHistorySyncFinished(this)) { }
        break MISSING_BLOCK_LABEL_47;
        Exception exception;
        exception;
        hashset;
        JVM INSTR monitorexit ;
        throw exception;
        hashset;
        JVM INSTR monitorexit ;
    }

    public void onHttpResponse(int i, SkyLib.WEBGW_RESULT webgw_result, int j, byte abyte0[], int k)
    {
        HashSet hashset = m_listeners;
        hashset;
        JVM INSTR monitorenter ;
        for (Iterator iterator = m_listeners.iterator(); iterator.hasNext(); ((SkyLib.SkyLibIListener)iterator.next()).onHttpResponse(this, i, webgw_result, j, abyte0, k)) { }
        break MISSING_BLOCK_LABEL_60;
        webgw_result;
        hashset;
        JVM INSTR monitorexit ;
        throw webgw_result;
        hashset;
        JVM INSTR monitorexit ;
    }

    public void onHttpStreamResponse(int i, byte abyte0[], int j)
    {
        HashSet hashset = m_listeners;
        hashset;
        JVM INSTR monitorenter ;
        for (Iterator iterator = m_listeners.iterator(); iterator.hasNext(); ((SkyLib.SkyLibIListener)iterator.next()).onHttpStreamResponse(this, i, abyte0, j)) { }
        break MISSING_BLOCK_LABEL_56;
        abyte0;
        hashset;
        JVM INSTR monitorexit ;
        throw abyte0;
        hashset;
        JVM INSTR monitorexit ;
    }

    public void onIncomingAlert(int i)
    {
        HashSet hashset = m_listeners;
        hashset;
        JVM INSTR monitorenter ;
        for (Iterator iterator = m_listeners.iterator(); iterator.hasNext(); ((SkyLib.SkyLibIListener)iterator.next()).onIncomingAlert(this, i)) { }
        break MISSING_BLOCK_LABEL_48;
        Exception exception;
        exception;
        hashset;
        JVM INSTR monitorexit ;
        throw exception;
        hashset;
        JVM INSTR monitorexit ;
    }

    public void onIncomingPriceQuote(int i)
    {
        HashSet hashset = m_listeners;
        hashset;
        JVM INSTR monitorenter ;
        for (Iterator iterator = m_listeners.iterator(); iterator.hasNext(); ((SkyLib.SkyLibIListener)iterator.next()).onIncomingPriceQuote(this, i)) { }
        break MISSING_BLOCK_LABEL_48;
        Exception exception;
        exception;
        hashset;
        JVM INSTR monitorexit ;
        throw exception;
        hashset;
        JVM INSTR monitorexit ;
    }

    public void onInitialEasSyncDone(SkyLib.CONTACT_SYNC_TYPE contact_sync_type)
    {
        HashSet hashset = m_listeners;
        hashset;
        JVM INSTR monitorenter ;
        for (Iterator iterator = m_listeners.iterator(); iterator.hasNext(); ((SkyLib.SkyLibIListener)iterator.next()).onInitialEasSyncDone(this, contact_sync_type)) { }
        break MISSING_BLOCK_LABEL_48;
        contact_sync_type;
        hashset;
        JVM INSTR monitorexit ;
        throw contact_sync_type;
        hashset;
        JVM INSTR monitorexit ;
    }

    public void onMessage(int i, boolean flag, int j, int k, boolean flag1)
    {
        HashSet hashset = m_listeners;
        hashset;
        JVM INSTR monitorenter ;
        for (Iterator iterator = m_listeners.iterator(); iterator.hasNext(); ((SkyLib.SkyLibIListener)iterator.next()).onMessage(this, i, flag, j, k, flag1)) { }
        break MISSING_BLOCK_LABEL_62;
        Exception exception;
        exception;
        hashset;
        JVM INSTR monitorexit ;
        throw exception;
        hashset;
        JVM INSTR monitorexit ;
    }

    public void onMessageAnnotation(int i)
    {
        HashSet hashset = m_listeners;
        hashset;
        JVM INSTR monitorenter ;
        for (Iterator iterator = m_listeners.iterator(); iterator.hasNext(); ((SkyLib.SkyLibIListener)iterator.next()).onMessageAnnotation(this, i)) { }
        break MISSING_BLOCK_LABEL_48;
        Exception exception;
        exception;
        hashset;
        JVM INSTR monitorexit ;
        throw exception;
        hashset;
        JVM INSTR monitorexit ;
    }

    public void onNewCustomContactGroup(int i)
    {
        HashSet hashset = m_listeners;
        hashset;
        JVM INSTR monitorenter ;
        for (Iterator iterator = m_listeners.iterator(); iterator.hasNext(); ((SkyLib.SkyLibIListener)iterator.next()).onNewCustomContactGroup(this, i)) { }
        break MISSING_BLOCK_LABEL_48;
        Exception exception;
        exception;
        hashset;
        JVM INSTR monitorexit ;
        throw exception;
        hashset;
        JVM INSTR monitorexit ;
    }

    public void onNrgLevelsChange()
    {
        HashSet hashset = m_listeners;
        hashset;
        JVM INSTR monitorenter ;
        for (Iterator iterator = m_listeners.iterator(); iterator.hasNext(); ((SkyLib.SkyLibIListener)iterator.next()).onNrgLevelsChange(this)) { }
        break MISSING_BLOCK_LABEL_47;
        Exception exception;
        exception;
        hashset;
        JVM INSTR monitorexit ;
        throw exception;
        hashset;
        JVM INSTR monitorexit ;
    }

    public void onObjectDelete(SkyLib.OBJECTTYPE objecttype, int i)
    {
        HashSet hashset = m_listeners;
        hashset;
        JVM INSTR monitorenter ;
        for (Iterator iterator = m_listeners.iterator(); iterator.hasNext(); ((SkyLib.SkyLibIListener)iterator.next()).onObjectDelete(this, objecttype, i)) { }
        break MISSING_BLOCK_LABEL_52;
        objecttype;
        hashset;
        JVM INSTR monitorexit ;
        throw objecttype;
        hashset;
        JVM INSTR monitorexit ;
    }

    public void onObjectPropertyChangeWithValue(int i, PROPKEY propkey, Metatag metatag)
    {
        HashSet hashset = m_listeners;
        hashset;
        JVM INSTR monitorenter ;
        for (Iterator iterator = m_listeners.iterator(); iterator.hasNext(); ((SkyLib.SkyLibIListener)iterator.next()).onObjectPropertyChangeWithValue(this, i, propkey, metatag)) { }
        break MISSING_BLOCK_LABEL_56;
        propkey;
        hashset;
        JVM INSTR monitorexit ;
        throw propkey;
        hashset;
        JVM INSTR monitorexit ;
    }

    public void onOperationModeChanged(int i)
    {
        HashSet hashset = m_listeners;
        hashset;
        JVM INSTR monitorenter ;
        for (Iterator iterator = m_listeners.iterator(); iterator.hasNext(); ((SkyLib.SkyLibIListener)iterator.next()).onOperationModeChanged(this, i)) { }
        break MISSING_BLOCK_LABEL_48;
        Exception exception;
        exception;
        hashset;
        JVM INSTR monitorexit ;
        throw exception;
        hashset;
        JVM INSTR monitorexit ;
    }

    public void onParticipantListChange(int i)
    {
        HashSet hashset = m_listeners;
        hashset;
        JVM INSTR monitorenter ;
        for (Iterator iterator = m_listeners.iterator(); iterator.hasNext(); ((SkyLib.SkyLibIListener)iterator.next()).onParticipantListChange(this, i)) { }
        break MISSING_BLOCK_LABEL_48;
        Exception exception;
        exception;
        hashset;
        JVM INSTR monitorexit ;
        throw exception;
        hashset;
        JVM INSTR monitorexit ;
    }

    public void onPartnerLinkInfoResult(SkyLib.AUTH_RESULT auth_result, byte abyte0[], byte abyte1[], byte abyte2[], byte abyte3[])
    {
        HashSet hashset = m_listeners;
        hashset;
        JVM INSTR monitorenter ;
        for (Iterator iterator = m_listeners.iterator(); iterator.hasNext(); ((SkyLib.SkyLibIListener)iterator.next()).onPartnerLinkInfoResult(this, auth_result, NativeStringConvert.ConvertFromNativeBytes(abyte0), NativeStringConvert.ConvertFromNativeBytes(abyte1), NativeStringConvert.ConvertFromNativeBytes(abyte2), NativeStringConvert.ConvertFromNativeBytes(abyte3))) { }
        break MISSING_BLOCK_LABEL_72;
        auth_result;
        hashset;
        JVM INSTR monitorexit ;
        throw auth_result;
        hashset;
        JVM INSTR monitorexit ;
    }

    public void onPartnerQueryResult(int i, SkyLib.PARTNER_QUERY_ERROR partner_query_error, byte abyte0[])
    {
        HashSet hashset = m_listeners;
        hashset;
        JVM INSTR monitorenter ;
        for (Iterator iterator = m_listeners.iterator(); iterator.hasNext(); ((SkyLib.SkyLibIListener)iterator.next()).onPartnerQueryResult(this, i, partner_query_error, NativeStringConvert.ConvertFromNativeBytes(abyte0))) { }
        break MISSING_BLOCK_LABEL_59;
        partner_query_error;
        hashset;
        JVM INSTR monitorexit ;
        throw partner_query_error;
        hashset;
        JVM INSTR monitorexit ;
    }

    public void onPendingMediaDocumentsListChanged()
    {
        HashSet hashset = m_listeners;
        hashset;
        JVM INSTR monitorenter ;
        for (Iterator iterator = m_listeners.iterator(); iterator.hasNext(); ((SkyLib.SkyLibIListener)iterator.next()).onPendingMediaDocumentsListChanged(this)) { }
        break MISSING_BLOCK_LABEL_47;
        Exception exception;
        exception;
        hashset;
        JVM INSTR monitorexit ;
        throw exception;
        hashset;
        JVM INSTR monitorexit ;
    }

    public void onPromotedSCDContactsFound(int i, int ai[])
    {
        HashSet hashset = m_listeners;
        hashset;
        JVM INSTR monitorenter ;
        for (Iterator iterator = m_listeners.iterator(); iterator.hasNext(); ((SkyLib.SkyLibIListener)iterator.next()).onPromotedSCDContactsFound(this, i, ai)) { }
        break MISSING_BLOCK_LABEL_52;
        ai;
        hashset;
        JVM INSTR monitorexit ;
        throw ai;
        hashset;
        JVM INSTR monitorexit ;
    }

    public void onPublicAPINotification(int i, byte abyte0[])
    {
        HashSet hashset = m_listeners;
        hashset;
        JVM INSTR monitorenter ;
        for (Iterator iterator = m_listeners.iterator(); iterator.hasNext(); ((SkyLib.SkyLibIListener)iterator.next()).onPublicAPINotification(this, i, NativeStringConvert.ConvertFromNativeBytes(abyte0))) { }
        break MISSING_BLOCK_LABEL_55;
        abyte0;
        hashset;
        JVM INSTR monitorexit ;
        throw abyte0;
        hashset;
        JVM INSTR monitorexit ;
    }

    public void onPushHandlingComplete(int i, SkyLib.PUSHHANDLINGRESULT pushhandlingresult)
    {
        HashSet hashset = m_listeners;
        hashset;
        JVM INSTR monitorenter ;
        for (Iterator iterator = m_listeners.iterator(); iterator.hasNext(); ((SkyLib.SkyLibIListener)iterator.next()).onPushHandlingComplete(this, i, pushhandlingresult)) { }
        break MISSING_BLOCK_LABEL_52;
        pushhandlingresult;
        hashset;
        JVM INSTR monitorexit ;
        throw pushhandlingresult;
        hashset;
        JVM INSTR monitorexit ;
    }

    public void onQualityTestResult(SkyLib.QUALITYTESTTYPE qualitytesttype, SkyLib.QUALITYTESTRESULT qualitytestresult, byte abyte0[], byte abyte1[], byte abyte2[])
    {
        HashSet hashset = m_listeners;
        hashset;
        JVM INSTR monitorenter ;
        for (Iterator iterator = m_listeners.iterator(); iterator.hasNext(); ((SkyLib.SkyLibIListener)iterator.next()).onQualityTestResult(this, qualitytesttype, qualitytestresult, NativeStringConvert.ConvertFromNativeBytes(abyte0), NativeStringConvert.ConvertFromNativeBytes(abyte1), NativeStringConvert.ConvertFromNativeBytes(abyte2))) { }
        break MISSING_BLOCK_LABEL_69;
        qualitytesttype;
        hashset;
        JVM INSTR monitorexit ;
        throw qualitytesttype;
        hashset;
        JVM INSTR monitorexit ;
    }

    public void onRegisterContextsComplete(SkyLib.PNM_REGISTER_CONTEXTS_RESULT pnm_register_contexts_result, int i)
    {
        HashSet hashset = m_listeners;
        hashset;
        JVM INSTR monitorenter ;
        for (Iterator iterator = m_listeners.iterator(); iterator.hasNext(); ((SkyLib.SkyLibIListener)iterator.next()).onRegisterContextsComplete(this, pnm_register_contexts_result, i)) { }
        break MISSING_BLOCK_LABEL_52;
        pnm_register_contexts_result;
        hashset;
        JVM INSTR monitorexit ;
        throw pnm_register_contexts_result;
        hashset;
        JVM INSTR monitorexit ;
    }

    public void onSeamlessCapableResult(byte abyte0[], boolean flag)
    {
        HashSet hashset = m_listeners;
        hashset;
        JVM INSTR monitorenter ;
        for (Iterator iterator = m_listeners.iterator(); iterator.hasNext(); ((SkyLib.SkyLibIListener)iterator.next()).onSeamlessCapableResult(this, NativeStringConvert.ConvertFromNativeBytes(abyte0), flag)) { }
        break MISSING_BLOCK_LABEL_55;
        abyte0;
        hashset;
        JVM INSTR monitorexit ;
        throw abyte0;
        hashset;
        JVM INSTR monitorexit ;
    }

    public void onSearchMessagesResult(int i, int ai[], byte abyte0[][])
    {
        HashSet hashset = m_listeners;
        hashset;
        JVM INSTR monitorenter ;
        for (Iterator iterator = m_listeners.iterator(); iterator.hasNext(); ((SkyLib.SkyLibIListener)iterator.next()).onSearchMessagesResult(this, i, ai, NativeStringConvert.ConvertFromNativeStringArray(abyte0))) { }
        break MISSING_BLOCK_LABEL_59;
        ai;
        hashset;
        JVM INSTR monitorexit ;
        throw ai;
        hashset;
        JVM INSTR monitorexit ;
    }

    public void onServerTimeAvailable()
    {
        HashSet hashset = m_listeners;
        hashset;
        JVM INSTR monitorenter ;
        for (Iterator iterator = m_listeners.iterator(); iterator.hasNext(); ((SkyLib.SkyLibIListener)iterator.next()).onServerTimeAvailable(this)) { }
        break MISSING_BLOCK_LABEL_47;
        Exception exception;
        exception;
        hashset;
        JVM INSTR monitorexit ;
        throw exception;
        hashset;
        JVM INSTR monitorexit ;
    }

    public void onStatsReported(int i, byte abyte0[])
    {
        HashSet hashset = m_listeners;
        hashset;
        JVM INSTR monitorenter ;
        for (Iterator iterator = m_listeners.iterator(); iterator.hasNext(); ((SkyLib.SkyLibIListener)iterator.next()).onStatsReported(this, i, abyte0)) { }
        break MISSING_BLOCK_LABEL_52;
        abyte0;
        hashset;
        JVM INSTR monitorexit ;
        throw abyte0;
        hashset;
        JVM INSTR monitorexit ;
    }

    public void onSuggestedAccountsResult(SkyLib.AUTH_RESULT auth_result, byte abyte0[][], byte abyte1[][], byte abyte2[][])
    {
        HashSet hashset = m_listeners;
        hashset;
        JVM INSTR monitorenter ;
        for (Iterator iterator = m_listeners.iterator(); iterator.hasNext(); ((SkyLib.SkyLibIListener)iterator.next()).onSuggestedAccountsResult(this, auth_result, NativeStringConvert.ConvertFromNativeStringArray(abyte0), NativeStringConvert.ConvertFromNativeStringArray(abyte1), NativeStringConvert.ConvertFromNativeStringArray(abyte2))) { }
        break MISSING_BLOCK_LABEL_67;
        auth_result;
        hashset;
        JVM INSTR monitorexit ;
        throw auth_result;
        hashset;
        JVM INSTR monitorexit ;
    }

    public void onTrackedObjectChanged(int i, SkyLib.OBJECTTYPE objecttype, SkyLib.OBJECT_TRACKER_CHANGE_TYPE object_tracker_change_type, int j, int k)
    {
        HashSet hashset = m_listeners;
        hashset;
        JVM INSTR monitorenter ;
        for (Iterator iterator = m_listeners.iterator(); iterator.hasNext(); ((SkyLib.SkyLibIListener)iterator.next()).onTrackedObjectChanged(this, i, objecttype, object_tracker_change_type, j, k)) { }
        break MISSING_BLOCK_LABEL_60;
        objecttype;
        hashset;
        JVM INSTR monitorexit ;
        throw objecttype;
        hashset;
        JVM INSTR monitorexit ;
    }

    public void onTrouterCheckConnectionComplete(boolean flag)
    {
        HashSet hashset = m_listeners;
        hashset;
        JVM INSTR monitorenter ;
        for (Iterator iterator = m_listeners.iterator(); iterator.hasNext(); ((SkyLib.SkyLibIListener)iterator.next()).onTrouterCheckConnectionComplete(this, flag)) { }
        break MISSING_BLOCK_LABEL_48;
        Exception exception;
        exception;
        hashset;
        JVM INSTR monitorexit ;
        throw exception;
        hashset;
        JVM INSTR monitorexit ;
    }

    public void onTrouterConnectionStateChanged(SkyLib.TROUTER_CONNECTION_STATE_CALLBACK_EVENT_TYPE trouter_connection_state_callback_event_type)
    {
        HashSet hashset = m_listeners;
        hashset;
        JVM INSTR monitorenter ;
        for (Iterator iterator = m_listeners.iterator(); iterator.hasNext(); ((SkyLib.SkyLibIListener)iterator.next()).onTrouterConnectionStateChanged(this, trouter_connection_state_callback_event_type)) { }
        break MISSING_BLOCK_LABEL_48;
        trouter_connection_state_callback_event_type;
        hashset;
        JVM INSTR monitorexit ;
        throw trouter_connection_state_callback_event_type;
        hashset;
        JVM INSTR monitorexit ;
    }

    public void onTrouterSuspendComplete()
    {
        HashSet hashset = m_listeners;
        hashset;
        JVM INSTR monitorenter ;
        for (Iterator iterator = m_listeners.iterator(); iterator.hasNext(); ((SkyLib.SkyLibIListener)iterator.next()).onTrouterSuspendComplete(this)) { }
        break MISSING_BLOCK_LABEL_47;
        Exception exception;
        exception;
        hashset;
        JVM INSTR monitorexit ;
        throw exception;
        hashset;
        JVM INSTR monitorexit ;
    }

    public void onTrouterSuspendReady()
    {
        HashSet hashset = m_listeners;
        hashset;
        JVM INSTR monitorenter ;
        for (Iterator iterator = m_listeners.iterator(); iterator.hasNext(); ((SkyLib.SkyLibIListener)iterator.next()).onTrouterSuspendReady(this)) { }
        break MISSING_BLOCK_LABEL_47;
        Exception exception;
        exception;
        hashset;
        JVM INSTR monitorexit ;
        throw exception;
        hashset;
        JVM INSTR monitorexit ;
    }

    public void onUnifiedMastersChanged(int i)
    {
        HashSet hashset = m_listeners;
        hashset;
        JVM INSTR monitorenter ;
        for (Iterator iterator = m_listeners.iterator(); iterator.hasNext(); ((SkyLib.SkyLibIListener)iterator.next()).onUnifiedMastersChanged(this, i)) { }
        break MISSING_BLOCK_LABEL_48;
        Exception exception;
        exception;
        hashset;
        JVM INSTR monitorexit ;
        throw exception;
        hashset;
        JVM INSTR monitorexit ;
    }

    public void onUnifiedServantsChanged(int i)
    {
        HashSet hashset = m_listeners;
        hashset;
        JVM INSTR monitorenter ;
        for (Iterator iterator = m_listeners.iterator(); iterator.hasNext(); ((SkyLib.SkyLibIListener)iterator.next()).onUnifiedServantsChanged(this, i)) { }
        break MISSING_BLOCK_LABEL_48;
        Exception exception;
        exception;
        hashset;
        JVM INSTR monitorexit ;
        throw exception;
        hashset;
        JVM INSTR monitorexit ;
    }

    public void onVideoMessagingEntitlementChanged(boolean flag, byte abyte0[], byte abyte1[][], int ai[])
    {
        HashSet hashset = m_listeners;
        hashset;
        JVM INSTR monitorenter ;
        for (Iterator iterator = m_listeners.iterator(); iterator.hasNext(); ((SkyLib.SkyLibIListener)iterator.next()).onVideoMessagingEntitlementChanged(this, flag, NativeStringConvert.ConvertFromNativeBytes(abyte0), NativeStringConvert.ConvertFromNativeStringArray(abyte1), ai)) { }
        break MISSING_BLOCK_LABEL_64;
        abyte0;
        hashset;
        JVM INSTR monitorexit ;
        throw abyte0;
        hashset;
        JVM INSTR monitorexit ;
    }

    public native int partnerQueryData(SkyLib.PARTNER_QUERY_TYPE partner_query_type, SkyLib.PARTNER_QUERY_ID partner_query_id, byte abyte0[]);

    public void playStart(int i, byte abyte0[], boolean flag)
    {
        playStart(i, abyte0, flag, false);
    }

    public native void playStart(int i, byte abyte0[], boolean flag, boolean flag1);

    public SkyLib.PREPARESOUNDRESULT playStartFromFile(int i, String s, boolean flag)
    {
        return playStartFromFile(i, s, flag, false);
    }

    public SkyLib.PREPARESOUNDRESULT playStartFromFile(int i, String s, boolean flag, boolean flag1)
    {
        return playStartFromFile(i, NativeStringConvert.ConvertToNativeBytes(s), flag, flag1);
    }

    public native void playStop(int i);

    public native SkyLib.PrepareSound_Result prepareSound(byte abyte0[]);

    public SkyLib.PrepareSoundFromFile_Result prepareSoundFromFile(String s)
    {
        return prepareSoundFromFile(NativeStringConvert.ConvertToNativeBytes(s));
    }

    public SkyLib.PublicAPIRequest_Result publicAPIRequest(int i, String s)
    {
        return publicAPIRequest(i, NativeStringConvert.ConvertToNativeBytes(s));
    }

    public boolean putAuthTokens(long l, String as[], String s)
    {
        return putAuthTokens(l, as, s, 0, "");
    }

    public boolean putAuthTokens(long l, String as[], String s, int i)
    {
        return putAuthTokens(l, as, s, i, "");
    }

    public boolean putAuthTokens(long l, String as[], String s, int i, String s1)
    {
        return putAuthTokens(l, NativeStringConvert.ConvertArrToNativeByteArr(as), NativeStringConvert.ConvertToNativeBytes(s), i, NativeStringConvert.ConvertToNativeBytes(s1));
    }

    public SkyLib.QueryContentListing_Result queryContentListing(String s, SkyLib.CONTENT_LIST_CONTEXT content_list_context)
    {
        return queryContentListing(NativeStringConvert.ConvertToNativeBytes(s), content_list_context);
    }

    public int registerContexts(SkyLib.SERVICE_TYPE service_type, String s, String s1, String as[], String as1[], int ai[])
    {
        return registerContexts(service_type, NativeStringConvert.ConvertToNativeBytes(s), NativeStringConvert.ConvertToNativeBytes(s1), NativeStringConvert.ConvertArrToNativeByteArr(as), NativeStringConvert.ConvertArrToNativeByteArr(as1), ai);
    }

    public int registerContextsEx(SkyLib.SERVICE_TYPE aservice_type[], String s, String s1, String as[], String as1[], int ai[])
    {
        return registerContextsEx(aservice_type, s, s1, as, as1, ai, "", "");
    }

    public int registerContextsEx(SkyLib.SERVICE_TYPE aservice_type[], String s, String s1, String as[], String as1[], int ai[], String s2)
    {
        return registerContextsEx(aservice_type, s, s1, as, as1, ai, s2, "");
    }

    public int registerContextsEx(SkyLib.SERVICE_TYPE aservice_type[], String s, String s1, String as[], String as1[], int ai[], String s2, 
            String s3)
    {
        return registerContextsEx(aservice_type, NativeStringConvert.ConvertToNativeBytes(s), NativeStringConvert.ConvertToNativeBytes(s1), NativeStringConvert.ConvertArrToNativeByteArr(as), NativeStringConvert.ConvertArrToNativeByteArr(as1), ai, NativeStringConvert.ConvertToNativeBytes(s2), NativeStringConvert.ConvertToNativeBytes(s3));
    }

    public int registerContextsEx2(SkyLib.SERVICE_TYPE aservice_type[], String s, String s1, String as[], String as1[], int ai[], String s2, 
            String s3, String s4)
    {
        return registerContextsEx2(aservice_type, s, s1, as, as1, ai, s2, s3, s4, "");
    }

    public int registerContextsEx2(SkyLib.SERVICE_TYPE aservice_type[], String s, String s1, String as[], String as1[], int ai[], String s2, 
            String s3, String s4, String s5)
    {
        return registerContextsEx2(aservice_type, NativeStringConvert.ConvertToNativeBytes(s), NativeStringConvert.ConvertToNativeBytes(s1), NativeStringConvert.ConvertArrToNativeByteArr(as), NativeStringConvert.ConvertArrToNativeByteArr(as1), ai, NativeStringConvert.ConvertToNativeBytes(s2), NativeStringConvert.ConvertToNativeBytes(s3), NativeStringConvert.ConvertToNativeBytes(s4), NativeStringConvert.ConvertToNativeBytes(s5));
    }

    public void removeListener(SkyLib.SkyLibIListener skylibilistener)
    {
        synchronized (m_listeners)
        {
            m_listeners.remove(skylibilistener);
        }
        return;
        skylibilistener;
        hashset;
        JVM INSTR monitorexit ;
        throw skylibilistener;
    }

    public boolean reportStatsEvent(int i, byte abyte0[])
    {
        return reportStatsEvent(i, abyte0, "");
    }

    public boolean reportStatsEvent(int i, byte abyte0[], String s)
    {
        return reportStatsEvent(i, abyte0, NativeStringConvert.ConvertToNativeBytes(s));
    }

    public int requestAccessToken(long l, String s, boolean flag)
    {
        return requestAccessToken(l, NativeStringConvert.ConvertToNativeBytes(s), flag);
    }

    public boolean requestConfirmationCode(Sms.CONFIRM_TYPE confirm_type, String s, Sms sms)
    {
        return requestConfirmationCode(confirm_type, NativeStringConvert.ConvertToNativeBytes(s), sms);
    }

    public native int requestSSOToken();

    public int requestSkypeToken()
    {
        return requestSkypeToken(false);
    }

    public native int requestSkypeToken(boolean flag);

    public native int requestWebSession();

    public int requestWebSessionWithPassword(String s, String s1)
    {
        return requestWebSessionWithPassword(NativeStringConvert.ConvertToNativeBytes(s), NativeStringConvert.ConvertToNativeBytes(s1));
    }

    public native int reregisterContexts();

    public int reregisterContextsEx2(String s, String s1)
    {
        return reregisterContextsEx2(NativeStringConvert.ConvertToNativeBytes(s), NativeStringConvert.ConvertToNativeBytes(s1));
    }

    public int searchMessages(String s)
    {
        return searchMessages(s, 25);
    }

    public int searchMessages(String s, int i)
    {
        return searchMessages(NativeStringConvert.ConvertToNativeBytes(s), i);
    }

    public void selectSoundDevices(String s, String s1, String s2)
    {
        selectSoundDevices(NativeStringConvert.ConvertToNativeBytes(s), NativeStringConvert.ConvertToNativeBytes(s1), NativeStringConvert.ConvertToNativeBytes(s2));
    }

    public int sendHttpRequest(SkyLib.HTTPFE_METHOD httpfe_method, String s, String s1, String s2)
    {
        return sendHttpRequest(httpfe_method, s, s1, s2, 0);
    }

    public int sendHttpRequest(SkyLib.HTTPFE_METHOD httpfe_method, String s, String s1, String s2, int i)
    {
        return sendHttpRequest(httpfe_method, NativeStringConvert.ConvertToNativeBytes(s), NativeStringConvert.ConvertToNativeBytes(s1), NativeStringConvert.ConvertToNativeBytes(s2), i);
    }

    public native boolean sendHttpStream(int i, byte abyte0[]);

    public void setAndroidId(String s)
    {
        setAndroidId(NativeStringConvert.ConvertToNativeBytes(s));
    }

    public native int setCallerIDOptions(long l, long l1, int i);

    public void setIMEI(String s)
    {
        setIMEI(NativeStringConvert.ConvertToNativeBytes(s));
    }

    public boolean setInstallContentBundleName(String s)
    {
        return setInstallContentBundleName(NativeStringConvert.ConvertToNativeBytes(s));
    }

    public void setLocalizedString(SkyLib.LOCALIZED_STRING localized_string, String s)
    {
        setLocalizedString(localized_string, NativeStringConvert.ConvertToNativeBytes(s));
    }

    public native void setMaxNrOfVideosVisibleInUI(int i);

    public native void setMicVolume(int i);

    public native void setMobileDataUsageLevel(SkyLib.MOBILE_DATA_USAGE_LEVEL mobile_data_usage_level);

    public native boolean setNetworkActivityLevel(int i);

    public native void setOperatingMedia(SkyLib.OPERATING_MEDIA operating_media, int i, int j);

    public native void setSeamlessCapable(boolean flag);

    public native void setSpeakerVolume(int i);

    public native void setUIIntProp(SkyLib.UIPROP uiprop, int i);

    public void setUIStrProp(SkyLib.UIPROP uiprop, String s)
    {
        setUIStrProp(uiprop, NativeStringConvert.ConvertToNativeBytes(s));
    }

    public native void setUserActive(boolean flag);

    public boolean start()
    {
        return start(true);
    }

    public native boolean start(boolean flag);

    public void startMonitoringQuality(String s, boolean flag)
    {
        startMonitoringQuality(NativeStringConvert.ConvertToNativeBytes(s), flag);
    }

    public void startRecordingTest()
    {
        startRecordingTest(false);
    }

    public native void startRecordingTest(boolean flag);

    public void stop()
    {
        stop(true);
    }

    public native void stop(boolean flag);

    public native void stopEasContactsSync();

    public native void stopHistorySync();

    public SkyLib.QUALITYTESTRESULT stopMonitoringQuality(String s)
    {
        return stopMonitoringQuality(s, false);
    }

    public SkyLib.QUALITYTESTRESULT stopMonitoringQuality(String s, boolean flag)
    {
        return stopMonitoringQuality(NativeStringConvert.ConvertToNativeBytes(s), flag);
    }

    public native void stopPlayDTMF();

    public native void stopRecordingTest();

    public boolean storeLocal(String s, byte abyte0[])
    {
        return storeLocal(NativeStringConvert.ConvertToNativeBytes(s), abyte0);
    }

    public boolean submitConfirmationCode(String s, String s1, Sms sms)
    {
        return submitConfirmationCode(NativeStringConvert.ConvertToNativeBytes(s), NativeStringConvert.ConvertToNativeBytes(s1), sms);
    }

    public native boolean submitSearch(Search search);

    public native void syncHistory();

    public native void triggerObjectTrackerConsumption();

    public boolean trouterCheckConnection()
    {
        return trouterCheckConnection("");
    }

    public boolean trouterCheckConnection(String s)
    {
        return trouterCheckConnection(NativeStringConvert.ConvertToNativeBytes(s));
    }

    public native boolean trouterConnect();

    public boolean trouterReceiveData()
    {
        return trouterReceiveData("");
    }

    public boolean trouterReceiveData(String s)
    {
        return trouterReceiveData(NativeStringConvert.ConvertToNativeBytes(s));
    }

    public native boolean trouterSuspend();

    public native boolean unUnifyContact(int i, int j);

    public native SkyLib.UnifyContacts_Result unifyContacts(int ai[]);

    public int unregisterAllContexts(String s, String s1)
    {
        return unregisterAllContexts(NativeStringConvert.ConvertToNativeBytes(s), NativeStringConvert.ConvertToNativeBytes(s1));
    }

    public int unregisterContexts(String as[])
    {
        return unregisterContexts(NativeStringConvert.ConvertArrToNativeByteArr(as));
    }

    public int unregisterContextsEx2(String as[], String s, String s1)
    {
        return unregisterContextsEx2(NativeStringConvert.ConvertArrToNativeByteArr(as), NativeStringConvert.ConvertToNativeBytes(s), NativeStringConvert.ConvertToNativeBytes(s1));
    }

    public native boolean updateHrtf3DSourcePosition(long l, int i, int j, int k, int i1);

    public int vCardToContact(String s)
    {
        return vCardToContact(NativeStringConvert.ConvertToNativeBytes(s));
    }

    public native SkyLib.ValidateAvatar_Result validateAvatar(byte abyte0[]);

    public SkyLib.VALIDATERESULT validatePassword(String s, String s1)
    {
        return validatePassword(NativeStringConvert.ConvertToNativeBytes(s), NativeStringConvert.ConvertToNativeBytes(s1));
    }

    public SkyLib.ValidateProfileString_Result validateProfileString(PROPKEY propkey, String s)
    {
        return validateProfileString(propkey, s, false);
    }

    public SkyLib.ValidateProfileString_Result validateProfileString(PROPKEY propkey, String s, boolean flag)
    {
        return validateProfileString(propkey, NativeStringConvert.ConvertToNativeBytes(s), flag);
    }

    public SkyLib.VerifyAndUnpack_Result verifyAndUnpack(String s, String s1, SkyLib.UNPACK_TYPE unpack_type)
    {
        return verifyAndUnpack(NativeStringConvert.ConvertToNativeBytes(s), NativeStringConvert.ConvertToNativeBytes(s1), unpack_type);
    }

    public SkyLib.VideoCommand_Result videoCommand(String s)
    {
        return videoCommand(NativeStringConvert.ConvertToNativeBytes(s));
    }

    public String voiceCommand(String s)
    {
        return NativeStringConvert.ConvertFromNativeBytes(voiceCommandNativeString(NativeStringConvert.ConvertToNativeBytes(s)));
    }
}
