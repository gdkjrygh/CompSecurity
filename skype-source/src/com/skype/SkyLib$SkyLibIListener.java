// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype;


// Referenced classes of package com.skype:
//            SkyLib, PROPKEY, Metatag

public static interface ON_STATE_CALLBACK_EVENT_TYPE
{

    public abstract void onAccessConnected(SkyLib skylib);

    public abstract void onAccessConnectionFailure(SkyLib skylib, ASON ason);

    public abstract void onAccessDetectFailure(SkyLib skylib);

    public abstract void onAccessDetecting(SkyLib skylib, PE pe);

    public abstract void onAccessDisconnected(SkyLib skylib);

    public abstract void onAccessEvent(SkyLib skylib, PE pe, int i);

    public abstract void onAccountAvatarResult(SkyLib skylib, PE pe, String s, byte abyte0[]);

    public abstract void onAccountPartnerLinkResult(SkyLib skylib, PE pe, String s);

    public abstract void onApp2AppDatagram(SkyLib skylib, String s, String s1, byte abyte0[]);

    public abstract void onApp2AppStreamListChange(SkyLib skylib, String s, PE pe, String as[], int ai[]);

    public abstract void onAuthTokenRequest(SkyLib skylib, long l, String as[]);

    public abstract void onAuthTokenResult(SkyLib skylib, boolean flag, int i, String s);

    public abstract void onAuthTokenResultWithTimeout(SkyLib skylib, boolean flag, int i, String s, int j, int k);

    public abstract void onAvailableDeviceListChange(SkyLib skylib);

    public abstract void onAvailableVideoDeviceListChange(SkyLib skylib);

    public abstract void onCallerIDOptionsChange(SkyLib skylib, int i, _CHANGE _pchange);

    public abstract void onChatServiceConnectivity(SkyLib skylib);

    public abstract void onCheckUpgradeResult(SkyLib skylib, boolean flag, _CHANGE _pchange);

    public abstract void onContactGoneOffline(SkyLib skylib, int i);

    public abstract void onContactGroupMembershipChanged(SkyLib skylib, int i, int j, boolean flag);

    public abstract void onContactOnlineAppearance(SkyLib skylib, int i);

    public abstract void onContentItemChange(SkyLib skylib, int i);

    public abstract void onContentListingResult(SkyLib skylib, int i, ULT ult, byte abyte0[], int j);

    public abstract void onConversationListChange(SkyLib skylib, int i, ULT ult, boolean flag);

    public abstract void onCustomAPINotification(SkyLib skylib, int i);

    public abstract void onEcsEvent(SkyLib skylib, NT_TYPE nt_type);

    public abstract void onEmoticonListUpdated(SkyLib skylib);

    public abstract void onExternalLoginRequest(SkyLib skylib, byte abyte0[]);

    public abstract void onFileTransferInitiated(SkyLib skylib, int i, int j, int k);

    public abstract void onH264Activated(SkyLib skylib);

    public abstract void onHistorySyncFinished(SkyLib skylib);

    public abstract void onHttpResponse(SkyLib skylib, int i, NT_TYPE nt_type, int j, byte abyte0[], int k);

    public abstract void onHttpStreamResponse(SkyLib skylib, int i, byte abyte0[], int j);

    public abstract void onIncomingAlert(SkyLib skylib, int i);

    public abstract void onIncomingPriceQuote(SkyLib skylib, int i);

    public abstract void onInitialEasSyncDone(SkyLib skylib, E e);

    public abstract void onMessage(SkyLib skylib, int i, boolean flag, int j, int k, boolean flag1);

    public abstract void onMessageAnnotation(SkyLib skylib, int i);

    public abstract void onNewCustomContactGroup(SkyLib skylib, int i);

    public abstract void onNrgLevelsChange(SkyLib skylib);

    public abstract void onObjectDelete(SkyLib skylib, E e, int i);

    public abstract void onObjectPropertyChangeWithValue(SkyLib skylib, int i, PROPKEY propkey, Metatag metatag);

    public abstract void onOperationModeChanged(SkyLib skylib, int i);

    public abstract void onParticipantListChange(SkyLib skylib, int i);

    public abstract void onPartnerLinkInfoResult(SkyLib skylib, E e, String s, String s1, String s2, String s3);

    public abstract void onPartnerQueryResult(SkyLib skylib, int i, ROR ror, String s);

    public abstract void onPendingMediaDocumentsListChanged(SkyLib skylib);

    public abstract void onPromotedSCDContactsFound(SkyLib skylib, int i, int ai[]);

    public abstract void onPublicAPINotification(SkyLib skylib, int i, String s);

    public abstract void onPushHandlingComplete(SkyLib skylib, int i, LT lt);

    public abstract void onQualityTestResult(SkyLib skylib, T t, T t1, String s, String s1, String s2);

    public abstract void onRegisterContextsComplete(SkyLib skylib, TEXTS_RESULT texts_result, int i);

    public abstract void onSeamlessCapableResult(SkyLib skylib, String s, boolean flag);

    public abstract void onSearchMessagesResult(SkyLib skylib, int i, int ai[], String as[]);

    public abstract void onServerTimeAvailable(SkyLib skylib);

    public abstract void onStatsReported(SkyLib skylib, int i, byte abyte0[]);

    public abstract void onSuggestedAccountsResult(SkyLib skylib, TEXTS_RESULT texts_result, String as[], String as1[], String as2[]);

    public abstract void onTrackedObjectChanged(SkyLib skylib, int i, HANGE_TYPE hange_type, HANGE_TYPE hange_type1, int j, int k);

    public abstract void onTrouterCheckConnectionComplete(SkyLib skylib, boolean flag);

    public abstract void onTrouterConnectionStateChanged(SkyLib skylib, ON_STATE_CALLBACK_EVENT_TYPE on_state_callback_event_type);

    public abstract void onTrouterSuspendComplete(SkyLib skylib);

    public abstract void onTrouterSuspendReady(SkyLib skylib);

    public abstract void onUnifiedMastersChanged(SkyLib skylib, int i);

    public abstract void onUnifiedServantsChanged(SkyLib skylib, int i);

    public abstract void onVideoMessagingEntitlementChanged(SkyLib skylib, boolean flag, String s, String as[], int ai[]);
}
