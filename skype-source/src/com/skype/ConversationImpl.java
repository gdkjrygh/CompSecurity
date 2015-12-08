// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype;

import java.lang.ref.ReferenceQueue;
import java.util.HashSet;
import java.util.Iterator;

// Referenced classes of package com.skype:
//            ObjectInterfaceImpl, Conversation, NativeListenable, ObjectInterface, 
//            SkypeFactory, ObjectInterfaceFactory, NativeStringConvert, PROPKEY, 
//            NativeWeakRef, MediaDocument, a

public class ConversationImpl extends ObjectInterfaceImpl
    implements Conversation, NativeListenable, ObjectInterface
{
    static final class a extends NativeWeakRef
    {

        private ObjectInterfaceFactory factory;

        public final void destroyNativeObject()
        {
            factory.destroyConversation(nativeObject);
        }

        a(ObjectInterfaceFactory objectinterfacefactory, com.skype.a a1, ReferenceQueue referencequeue, int i)
        {
            super(a1, referencequeue, i);
            factory = objectinterfacefactory;
        }
    }


    private HashSet m_listeners;

    public ConversationImpl()
    {
        this(((ObjectInterfaceFactory) (SkypeFactory.getInstance())));
    }

    public ConversationImpl(ObjectInterfaceFactory objectinterfacefactory)
    {
        super(objectinterfacefactory, objectinterfacefactory.createConversation());
        m_listeners = new HashSet();
        objectinterfacefactory.initializeListener(this);
    }

    private native boolean addConsumers(byte abyte0[][], boolean flag);

    private native boolean canAddConsumersOrSpawn(byte abyte0[][]);

    private native boolean canTransferLiveSession(byte abyte0[]);

    private native boolean enterPassword(byte abyte0[]);

    private native int findMessage(byte abyte0[], int i);

    private native String[] getAddCandidates(byte abyte0[][]);

    private native byte[] getCallGUIDNativeString();

    private native byte[] getChatNameFromThreadIdNativeString();

    private native byte[] getChatnameNativeString();

    private native byte[] getJoinBlobNativeString();

    private native byte[] getNonseWordNativeString();

    private native byte[] getThreadIdFromChatNameNativeString();

    private native boolean joinLiveSession(byte abyte0[], boolean flag);

    private native boolean postContacts(int ai[], byte abyte0[]);

    private native boolean postEventMessage(Conversation.EVENT_MESSAGE_TYPE event_message_type, byte abyte0[]);

    private native int postExternalMessage(int i, byte abyte0[]);

    private native Conversation.PostFiles_Result postFiles(byte abyte0[][], byte abyte1[]);

    private native int postLocationMessage(int i, int j, int k, int l, int i1, int j1, int k1, 
            int l1, byte abyte0[], byte abyte1[], byte abyte2[]);

    private native boolean postMediaDocument(int i, byte abyte0[]);

    private native boolean postSMS(int i, byte abyte0[]);

    private native int postSystemMessage(byte abyte0[], boolean flag);

    private native int postText(byte abyte0[], boolean flag);

    private native Conversation.PostTextWithAnnotation_Result postTextWithAnnotation(byte abyte0[], MessageAnnotation.TYPE type, byte abyte1[], byte abyte2[], boolean flag);

    private native int postVideoMessage(int i, byte abyte0[]);

    private native boolean postVoiceMessage(int i, byte abyte0[]);

    private native boolean provideLiveSessionQualityFeedback(byte abyte0[], byte abyte1[], SkyLib.LIVESESSION_QUALITYRATING livesession_qualityrating, byte abyte2[], byte abyte3[]);

    private native boolean renameTo(byte abyte0[]);

    private native boolean ringOthers(byte abyte0[][], boolean flag, byte abyte1[]);

    private native boolean setAlertString(byte abyte0[]);

    private native boolean setPassword(byte abyte0[], byte abyte1[]);

    private native boolean setTopic(byte abyte0[], boolean flag);

    private native int spawnConference(byte abyte0[][], boolean flag);

    private native boolean transferLiveSession(byte abyte0[][], byte abyte1[], byte abyte2[]);

    public boolean addConsumers(String as[])
    {
        return addConsumers(as, false);
    }

    public boolean addConsumers(String as[], boolean flag)
    {
        return addConsumers(NativeStringConvert.ConvertArrToNativeByteArr(as), flag);
    }

    public void addListener(Conversation.ConversationIListener conversationilistener)
    {
        synchronized (m_listeners)
        {
            m_listeners.add(conversationilistener);
        }
        return;
        conversationilistener;
        hashset;
        JVM INSTR monitorexit ;
        throw conversationilistener;
    }

    public boolean addToInbox()
    {
        return addToInbox(0);
    }

    public native boolean addToInbox(int i);

    public native int assimilate(int i);

    public native boolean attachVideoToLiveSession(int i);

    public boolean canAddConsumersOrSpawn(String as[])
    {
        return canAddConsumersOrSpawn(NativeStringConvert.ConvertArrToNativeByteArr(as));
    }

    public boolean canTransferLiveSession(String s)
    {
        return canTransferLiveSession(NativeStringConvert.ConvertToNativeBytes(s));
    }

    public int checkPremiumVideoSubscription()
    {
        return checkPremiumVideoSubscription(Conversation.SUBSCRIPTION_CHECK_CONTEXT.USER_IS_ABOUT_TO_START_SCREENSHARE);
    }

    public native int checkPremiumVideoSubscription(Conversation.SUBSCRIPTION_CHECK_CONTEXT subscription_check_context);

    public NativeWeakRef createNativeWeakRef(ObjectInterfaceFactory objectinterfacefactory, ReferenceQueue referencequeue)
    {
        return new a(objectinterfacefactory, this, referencequeue, m_nativeObject);
    }

    public native boolean delete();

    public boolean enterPassword(String s)
    {
        return enterPassword(NativeStringConvert.ConvertToNativeBytes(s));
    }

    public int findMessage(String s)
    {
        return findMessage(s, -1);
    }

    public int findMessage(String s, int i)
    {
        return findMessage(NativeStringConvert.ConvertToNativeBytes(s), i);
    }

    public int getActiveInvoiceMessageProp()
    {
        return getIntProperty(PROPKEY.CONVERSATION_ACTIVE_INVOICE_MESSAGE);
    }

    public int getActiveVmIdProp()
    {
        return getIntProperty(PROPKEY.CONVERSATION_ACTIVE_VM_ID);
    }

    public String[] getAddCandidates(String as[])
    {
        return getAddCandidates(NativeStringConvert.ConvertArrToNativeByteArr(as));
    }

    public String getAlertStringProp()
    {
        return getStrProperty(PROPKEY.CONVERSATION_ALERT_STRING);
    }

    public String getAltIdentityProp()
    {
        return getStrProperty(PROPKEY.CONVERSATION_ALT_IDENTITY);
    }

    public String getCallGUID()
    {
        return NativeStringConvert.ConvertFromNativeBytes(getCallGUIDNativeString());
    }

    public native boolean[] getCapabilities();

    public String getChatNameFromThreadId()
    {
        return NativeStringConvert.ConvertFromNativeBytes(getChatNameFromThreadIdNativeString());
    }

    public String getChatname()
    {
        return NativeStringConvert.ConvertFromNativeBytes(getChatnameNativeString());
    }

    public int getConsumptionHorizonProp()
    {
        return getIntProperty(PROPKEY.CONVERSATION_CONSUMPTION_HORIZON);
    }

    public int getCreationTimestampProp()
    {
        return getIntProperty(PROPKEY.CONVERSATION_CREATION_TIMESTAMP);
    }

    public String getCreatorProp()
    {
        return getStrProperty(PROPKEY.CONVERSATION_CREATOR);
    }

    public String getDisplaynameProp()
    {
        return getStrProperty(PROPKEY.CONVERSATION_DISPLAYNAME);
    }

    public String getGivenDisplaynameProp()
    {
        return getStrProperty(PROPKEY.CONVERSATION_GIVEN_DISPLAYNAME);
    }

    public String getIdentityProp()
    {
        return getStrProperty(PROPKEY.CONVERSATION_IDENTITY);
    }

    public int getInboxMessageIdProp()
    {
        return getIntProperty(PROPKEY.CONVERSATION_INBOX_MESSAGE_ID);
    }

    public int getInboxTimestampProp()
    {
        return getIntProperty(PROPKEY.CONVERSATION_INBOX_TIMESTAMP);
    }

    public boolean getIsBlockedProp()
    {
        return getIntProperty(PROPKEY.CONVERSATION_IS_BLOCKED) != 0;
    }

    public boolean getIsBookmarkedProp()
    {
        return getIntProperty(PROPKEY.CONVERSATION_IS_BOOKMARKED) != 0;
    }

    public boolean getIsP2pMigratedProp()
    {
        return getIntProperty(PROPKEY.CONVERSATION_IS_P2P_MIGRATED) != 0;
    }

    public String getJoinBlob()
    {
        return NativeStringConvert.ConvertFromNativeBytes(getJoinBlobNativeString());
    }

    public String getJoinUrlProp()
    {
        return getStrProperty(PROPKEY.CONVERSATION_JOIN_URL);
    }

    public int getLastActivityTimestampProp()
    {
        return getIntProperty(PROPKEY.CONVERSATION_LAST_ACTIVITY_TIMESTAMP);
    }

    public int getLastMessageIdProp()
    {
        return getIntProperty(PROPKEY.CONVERSATION_LAST_MESSAGE_ID);
    }

    public Conversation.GetLastMessages_Result getLastMessages()
    {
        return getLastMessages(0);
    }

    public native Conversation.GetLastMessages_Result getLastMessages(int i);

    public Conversation.CALL_TECHNOLOGY getLiveCallTechnologyProp()
    {
        return Conversation.CALL_TECHNOLOGY.fromInt(getIntProperty(PROPKEY.CONVERSATION_LIVE_CALL_TECHNOLOGY));
    }

    public String getLiveHostProp()
    {
        return getStrProperty(PROPKEY.CONVERSATION_LIVE_HOST);
    }

    public boolean getLiveIsMutedProp()
    {
        return getIntProperty(PROPKEY.CONVERSATION_LIVE_IS_MUTED) != 0;
    }

    public int getLiveStartTimestampProp()
    {
        return getIntProperty(PROPKEY.CONVERSATION_LIVE_START_TIMESTAMP);
    }

    public Conversation.LOCAL_LIVESTATUS getLocalLiveStatusProp()
    {
        return Conversation.LOCAL_LIVESTATUS.fromInt(getIntProperty(PROPKEY.CONVERSATION_LOCAL_LIVESTATUS));
    }

    public int getMaxVideoconfcallParticipantsProp()
    {
        return getIntProperty(PROPKEY.CONVERSATION_MAX_VIDEOCONFCALL_PARTICIPANTS);
    }

    public String getMcrCallerProp()
    {
        return getStrProperty(PROPKEY.CONVERSATION_MCR_CALLER);
    }

    public String getMetaGuidelinesProp()
    {
        return getStrProperty(PROPKEY.CONVERSATION_META_GUIDELINES);
    }

    public String getMetaNameProp()
    {
        return getStrProperty(PROPKEY.CONVERSATION_META_NAME);
    }

    public byte[] getMetaPictureProp()
    {
        return getBinProperty(PROPKEY.CONVERSATION_META_PICTURE);
    }

    public String getMetaTopicProp()
    {
        return getStrProperty(PROPKEY.CONVERSATION_META_TOPIC);
    }

    public Conversation.MY_STATUS getMyStatusProp()
    {
        return Conversation.MY_STATUS.fromInt(getIntProperty(PROPKEY.CONVERSATION_MY_STATUS));
    }

    public String getNonseWord()
    {
        return NativeStringConvert.ConvertFromNativeBytes(getNonseWordNativeString());
    }

    public int getOptAdminOnlyActivitiesProp()
    {
        return getIntProperty(PROPKEY.CONVERSATION_OPT_ADMIN_ONLY_ACTIVITIES);
    }

    public boolean getOptDiscloseHistoryProp()
    {
        return getIntProperty(PROPKEY.CONVERSATION_OPT_DISCLOSE_HISTORY) != 0;
    }

    public Participant.RANK getOptEntryLevelRankProp()
    {
        return Participant.RANK.fromInt(getIntProperty(PROPKEY.CONVERSATION_OPT_ENTRY_LEVEL_RANK));
    }

    public boolean getOptJoiningEnabledProp()
    {
        return getIntProperty(PROPKEY.CONVERSATION_OPT_JOINING_ENABLED) != 0;
    }

    public int getOptimalRemoteVideosInConferenceProp()
    {
        return getIntProperty(PROPKEY.CONVERSATION_OPTIMAL_REMOTE_VIDEOS_IN_CONFERENCE);
    }

    public Conversation.GetParticipants_Result getParticipants()
    {
        return getParticipants(Conversation.PARTICIPANTFILTER.ALL);
    }

    public native Conversation.GetParticipants_Result getParticipants(Conversation.PARTICIPANTFILTER participantfilter);

    public String getPasswordhintProp()
    {
        return getStrProperty(PROPKEY.CONVERSATION_PASSWORDHINT);
    }

    public native Conversation.GetPendingMediaDocumentsList_Result getPendingMediaDocumentsList();

    public native boolean getPictureMediaDocument(MediaDocument mediadocument);

    public String getPictureProp()
    {
        return getStrProperty(PROPKEY.CONVERSATION_PICTURE);
    }

    public int getPinnedOrderProp()
    {
        return getIntProperty(PROPKEY.CONVERSATION_PINNED_ORDER);
    }

    public boolean getPremiumVideoIsGracePeriodProp()
    {
        return getIntProperty(PROPKEY.CONVERSATION_PREMIUM_VIDEO_IS_GRACE_PERIOD) != 0;
    }

    public String getPremiumVideoSponsorListProp()
    {
        return getStrProperty(PROPKEY.CONVERSATION_PREMIUM_VIDEO_SPONSOR_LIST);
    }

    public Conversation.PREMIUM_VIDEO_STATUS getPremiumVideoStatusProp()
    {
        return Conversation.PREMIUM_VIDEO_STATUS.fromInt(getIntProperty(PROPKEY.CONVERSATION_PREMIUM_VIDEO_STATUS));
    }

    public int getSpawnedFromConvoIdProp()
    {
        return getIntProperty(PROPKEY.CONVERSATION_SPAWNED_FROM_CONVO_ID);
    }

    public String getThreadIdFromChatName()
    {
        return NativeStringConvert.ConvertFromNativeBytes(getThreadIdFromChatNameNativeString());
    }

    public Conversation.TYPE getTypeProp()
    {
        return Conversation.TYPE.fromInt(getIntProperty(PROPKEY.CONVERSATION_TYPE));
    }

    public int getUnconsumedElevatedMessagesProp()
    {
        return getIntProperty(PROPKEY.CONVERSATION_UNCONSUMED_ELEVATED_MESSAGES);
    }

    public boolean getUnconsumedMessagesVoiceProp()
    {
        return getIntProperty(PROPKEY.CONVERSATION_UNCONSUMED_MESSAGES_VOICE) != 0;
    }

    public int getUnconsumedNormalMessagesProp()
    {
        return getIntProperty(PROPKEY.CONVERSATION_UNCONSUMED_NORMAL_MESSAGES);
    }

    public int getUnconsumedSuppressedMessagesProp()
    {
        return getIntProperty(PROPKEY.CONVERSATION_UNCONSUMED_SUPPRESSED_MESSAGES);
    }

    public native boolean holdMyLiveSession();

    public native void initializeListener();

    public native boolean isMemberOf(int i);

    public native boolean join();

    public boolean joinLiveSession()
    {
        return joinLiveSession("", false);
    }

    public boolean joinLiveSession(String s)
    {
        return joinLiveSession(s, false);
    }

    public boolean joinLiveSession(String s, boolean flag)
    {
        return joinLiveSession(NativeStringConvert.ConvertToNativeBytes(s), flag);
    }

    public boolean leaveLiveSession()
    {
        return leaveLiveSession(false);
    }

    public native boolean leaveLiveSession(boolean flag);

    public native boolean leaveLiveSessionEx(Conversation.CALL_END_ACTION call_end_action);

    public native Conversation.LoadMessages_Result loadMessages(int i, int j, boolean flag);

    public native boolean markRead();

    public native boolean markUnread();

    public boolean moveConsumedHorizon(int i)
    {
        return moveConsumedHorizon(i, false);
    }

    public native boolean moveConsumedHorizon(int i, boolean flag);

    public native boolean muteMyMicrophone();

    public void onCallQualityFeedbackRequested(byte abyte0[], byte abyte1[], byte abyte2[])
    {
        HashSet hashset = m_listeners;
        hashset;
        JVM INSTR monitorenter ;
        for (Iterator iterator = m_listeners.iterator(); iterator.hasNext(); ((Conversation.ConversationIListener)iterator.next()).onCallQualityFeedbackRequested(this, NativeStringConvert.ConvertFromNativeBytes(abyte0), NativeStringConvert.ConvertFromNativeBytes(abyte1), NativeStringConvert.ConvertFromNativeBytes(abyte2))) { }
        break MISSING_BLOCK_LABEL_65;
        abyte0;
        hashset;
        JVM INSTR monitorexit ;
        throw abyte0;
        hashset;
        JVM INSTR monitorexit ;
    }

    public void onCapabilitiesChanged(boolean aflag[])
    {
        HashSet hashset = m_listeners;
        hashset;
        JVM INSTR monitorenter ;
        for (Iterator iterator = m_listeners.iterator(); iterator.hasNext(); ((Conversation.ConversationIListener)iterator.next()).onCapabilitiesChanged(this, aflag)) { }
        break MISSING_BLOCK_LABEL_48;
        aflag;
        hashset;
        JVM INSTR monitorexit ;
        throw aflag;
        hashset;
        JVM INSTR monitorexit ;
    }

    public void onEventMessage(Conversation.EVENT_MESSAGE_TYPE event_message_type, byte abyte0[])
    {
        HashSet hashset = m_listeners;
        hashset;
        JVM INSTR monitorenter ;
        for (Iterator iterator = m_listeners.iterator(); iterator.hasNext(); ((Conversation.ConversationIListener)iterator.next()).onEventMessage(this, event_message_type, NativeStringConvert.ConvertFromNativeBytes(abyte0))) { }
        break MISSING_BLOCK_LABEL_55;
        event_message_type;
        hashset;
        JVM INSTR monitorexit ;
        throw event_message_type;
        hashset;
        JVM INSTR monitorexit ;
    }

    public void onLiveSessionEvent(Conversation.LIVE_SESSION_EVENT live_session_event)
    {
        HashSet hashset = m_listeners;
        hashset;
        JVM INSTR monitorenter ;
        for (Iterator iterator = m_listeners.iterator(); iterator.hasNext(); ((Conversation.ConversationIListener)iterator.next()).onLiveSessionEvent(this, live_session_event)) { }
        break MISSING_BLOCK_LABEL_48;
        live_session_event;
        hashset;
        JVM INSTR monitorexit ;
        throw live_session_event;
        hashset;
        JVM INSTR monitorexit ;
    }

    public void onLiveSessionMoved(int i)
    {
        HashSet hashset = m_listeners;
        hashset;
        JVM INSTR monitorenter ;
        for (Iterator iterator = m_listeners.iterator(); iterator.hasNext(); ((Conversation.ConversationIListener)iterator.next()).onLiveSessionMoved(this, i)) { }
        break MISSING_BLOCK_LABEL_48;
        Exception exception;
        exception;
        hashset;
        JVM INSTR monitorexit ;
        throw exception;
        hashset;
        JVM INSTR monitorexit ;
    }

    public void onMessage(int i)
    {
        HashSet hashset = m_listeners;
        hashset;
        JVM INSTR monitorenter ;
        for (Iterator iterator = m_listeners.iterator(); iterator.hasNext(); ((Conversation.ConversationIListener)iterator.next()).onMessage(this, i)) { }
        break MISSING_BLOCK_LABEL_48;
        Exception exception;
        exception;
        hashset;
        JVM INSTR monitorexit ;
        throw exception;
        hashset;
        JVM INSTR monitorexit ;
    }

    public void onParticipantListChange()
    {
        HashSet hashset = m_listeners;
        hashset;
        JVM INSTR monitorenter ;
        for (Iterator iterator = m_listeners.iterator(); iterator.hasNext(); ((Conversation.ConversationIListener)iterator.next()).onParticipantListChange(this)) { }
        break MISSING_BLOCK_LABEL_47;
        Exception exception;
        exception;
        hashset;
        JVM INSTR monitorexit ;
        throw exception;
        hashset;
        JVM INSTR monitorexit ;
    }

    public void onPendingMediaDocumentsListChanged()
    {
        HashSet hashset = m_listeners;
        hashset;
        JVM INSTR monitorenter ;
        for (Iterator iterator = m_listeners.iterator(); iterator.hasNext(); ((Conversation.ConversationIListener)iterator.next()).onPendingMediaDocumentsListChanged(this)) { }
        break MISSING_BLOCK_LABEL_47;
        Exception exception;
        exception;
        hashset;
        JVM INSTR monitorexit ;
        throw exception;
        hashset;
        JVM INSTR monitorexit ;
    }

    public void onPremiumVideoSubscriptionCheckResult(int i, Conversation.PREMIUM_VIDEO_STATUS premium_video_status)
    {
        HashSet hashset = m_listeners;
        hashset;
        JVM INSTR monitorenter ;
        for (Iterator iterator = m_listeners.iterator(); iterator.hasNext(); ((Conversation.ConversationIListener)iterator.next()).onPremiumVideoSubscriptionCheckResult(this, i, premium_video_status)) { }
        break MISSING_BLOCK_LABEL_52;
        premium_video_status;
        hashset;
        JVM INSTR monitorexit ;
        throw premium_video_status;
        hashset;
        JVM INSTR monitorexit ;
    }

    public void onSpawnConference(int i)
    {
        HashSet hashset = m_listeners;
        hashset;
        JVM INSTR monitorenter ;
        for (Iterator iterator = m_listeners.iterator(); iterator.hasNext(); ((Conversation.ConversationIListener)iterator.next()).onSpawnConference(this, i)) { }
        break MISSING_BLOCK_LABEL_48;
        Exception exception;
        exception;
        hashset;
        JVM INSTR monitorexit ;
        throw exception;
        hashset;
        JVM INSTR monitorexit ;
    }

    public native boolean pinAfter(int i);

    public native boolean pinFirst();

    public boolean postContacts(int ai[])
    {
        return postContacts(ai, "");
    }

    public boolean postContacts(int ai[], String s)
    {
        return postContacts(ai, NativeStringConvert.ConvertToNativeBytes(s));
    }

    public boolean postEventMessage(Conversation.EVENT_MESSAGE_TYPE event_message_type, String s)
    {
        return postEventMessage(event_message_type, NativeStringConvert.ConvertToNativeBytes(s));
    }

    public int postExternalMessage(int i, String s)
    {
        return postExternalMessage(i, NativeStringConvert.ConvertToNativeBytes(s));
    }

    public Conversation.PostFiles_Result postFiles(String as[], String s)
    {
        return postFiles(NativeStringConvert.ConvertArrToNativeByteArr(as), NativeStringConvert.ConvertToNativeBytes(s));
    }

    public int postLocationMessage(int i, int j, int k, int l, int i1, int j1, int k1, 
            int l1)
    {
        return postLocationMessage(i, j, k, l, i1, j1, k1, l1, "", "", "");
    }

    public int postLocationMessage(int i, int j, int k, int l, int i1, int j1, int k1, 
            int l1, String s)
    {
        return postLocationMessage(i, j, k, l, i1, j1, k1, l1, s, "", "");
    }

    public int postLocationMessage(int i, int j, int k, int l, int i1, int j1, int k1, 
            int l1, String s, String s1)
    {
        return postLocationMessage(i, j, k, l, i1, j1, k1, l1, s, s1, "");
    }

    public int postLocationMessage(int i, int j, int k, int l, int i1, int j1, int k1, 
            int l1, String s, String s1, String s2)
    {
        return postLocationMessage(i, j, k, l, i1, j1, k1, l1, NativeStringConvert.ConvertToNativeBytes(s), NativeStringConvert.ConvertToNativeBytes(s1), NativeStringConvert.ConvertToNativeBytes(s2));
    }

    public boolean postMediaDocument(int i)
    {
        return postMediaDocument(i, "");
    }

    public boolean postMediaDocument(int i, String s)
    {
        return postMediaDocument(i, NativeStringConvert.ConvertToNativeBytes(s));
    }

    public boolean postSMS(int i)
    {
        return postSMS(i, "");
    }

    public boolean postSMS(int i, String s)
    {
        return postSMS(i, NativeStringConvert.ConvertToNativeBytes(s));
    }

    public int postSystemMessage(String s)
    {
        return postSystemMessage(s, false);
    }

    public int postSystemMessage(String s, boolean flag)
    {
        return postSystemMessage(NativeStringConvert.ConvertToNativeBytes(s), flag);
    }

    public int postText(String s)
    {
        return postText(s, false);
    }

    public int postText(String s, boolean flag)
    {
        return postText(NativeStringConvert.ConvertToNativeBytes(s), flag);
    }

    public Conversation.PostTextWithAnnotation_Result postTextWithAnnotation(String s, MessageAnnotation.TYPE type, String s1, String s2)
    {
        return postTextWithAnnotation(s, type, s1, s2, false);
    }

    public Conversation.PostTextWithAnnotation_Result postTextWithAnnotation(String s, MessageAnnotation.TYPE type, String s1, String s2, boolean flag)
    {
        return postTextWithAnnotation(NativeStringConvert.ConvertToNativeBytes(s), type, NativeStringConvert.ConvertToNativeBytes(s1), NativeStringConvert.ConvertToNativeBytes(s2), flag);
    }

    public int postVideoMessage(int i)
    {
        return postVideoMessage(i, "");
    }

    public int postVideoMessage(int i, String s)
    {
        return postVideoMessage(i, NativeStringConvert.ConvertToNativeBytes(s));
    }

    public boolean postVoiceMessage(int i, String s)
    {
        return postVoiceMessage(i, NativeStringConvert.ConvertToNativeBytes(s));
    }

    public boolean provideLiveSessionQualityFeedback(String s, String s1, SkyLib.LIVESESSION_QUALITYRATING livesession_qualityrating, String s2, String s3)
    {
        return provideLiveSessionQualityFeedback(NativeStringConvert.ConvertToNativeBytes(s), NativeStringConvert.ConvertToNativeBytes(s1), livesession_qualityrating, NativeStringConvert.ConvertToNativeBytes(s2), NativeStringConvert.ConvertToNativeBytes(s3));
    }

    public native boolean removeFromInbox();

    public void removeListener(Conversation.ConversationIListener conversationilistener)
    {
        synchronized (m_listeners)
        {
            m_listeners.remove(conversationilistener);
        }
        return;
        conversationilistener;
        hashset;
        JVM INSTR monitorexit ;
        throw conversationilistener;
    }

    public boolean renameTo(String s)
    {
        return renameTo(NativeStringConvert.ConvertToNativeBytes(s));
    }

    public native boolean resumeMyLiveSession();

    public native boolean retireFrom();

    public boolean ringOthers()
    {
        return ringOthers(((String []) (null)), false, "");
    }

    public boolean ringOthers(String as[])
    {
        return ringOthers(as, false, "");
    }

    public boolean ringOthers(String as[], boolean flag)
    {
        return ringOthers(as, flag, "");
    }

    public boolean ringOthers(String as[], boolean flag, String s)
    {
        return ringOthers(NativeStringConvert.ConvertArrToNativeByteArr(as), flag, NativeStringConvert.ConvertToNativeBytes(s));
    }

    public boolean ringSeamless()
    {
        return ringSeamless(false);
    }

    public native boolean ringSeamless(boolean flag);

    public boolean sendDTMF(Participant.DTMF dtmf)
    {
        return sendDTMF(dtmf, 260);
    }

    public native boolean sendDTMF(Participant.DTMF dtmf, int i);

    public boolean setAlertString(String s)
    {
        return setAlertString(NativeStringConvert.ConvertToNativeBytes(s));
    }

    public native boolean setBookmark(boolean flag);

    public boolean setConsumedHorizon(int i)
    {
        return setConsumedHorizon(i, false);
    }

    public native boolean setConsumedHorizon(int i, boolean flag);

    public native boolean setDeferredSetup(boolean flag);

    public native boolean setMyTextStatusTo(Participant.TEXT_STATUS text_status);

    public native boolean setOption(PROPKEY propkey, int i);

    public boolean setPassword(String s, String s1)
    {
        return setPassword(NativeStringConvert.ConvertToNativeBytes(s), NativeStringConvert.ConvertToNativeBytes(s1));
    }

    public native boolean setPicture(byte abyte0[]);

    public boolean setTopic(String s)
    {
        return setTopic(s, false);
    }

    public boolean setTopic(String s, boolean flag)
    {
        return setTopic(NativeStringConvert.ConvertToNativeBytes(s), flag);
    }

    public native boolean setTranslatedCall(boolean flag);

    public int spawnConference(String as[])
    {
        return spawnConference(as, false);
    }

    public int spawnConference(String as[], boolean flag)
    {
        return spawnConference(NativeStringConvert.ConvertArrToNativeByteArr(as), flag);
    }

    public native boolean startVoiceMessage();

    public native boolean stopSendDTMF();

    public boolean transferLiveSession(String as[])
    {
        return transferLiveSession(as, "", null);
    }

    public boolean transferLiveSession(String as[], String s)
    {
        return transferLiveSession(as, s, null);
    }

    public boolean transferLiveSession(String as[], String s, byte abyte0[])
    {
        return transferLiveSession(NativeStringConvert.ConvertArrToNativeByteArr(as), NativeStringConvert.ConvertToNativeBytes(s), abyte0);
    }

    public native boolean unPin();

    public native boolean unmuteMyMicrophone();
}
