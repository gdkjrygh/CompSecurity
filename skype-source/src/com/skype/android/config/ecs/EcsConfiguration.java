// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.config.ecs;

import android.content.ContentValues;
import android.os.Bundle;
import android.text.TextUtils;
import com.skype.android.analytics.ExperimentTag;
import com.skype.android.analytics.KpiEvent;
import com.skype.android.analytics.LogEvent;
import com.skype.android.event.EventBus;
import com.skype.android.event.EventBusInstance;
import com.skype.android.inject.EventSubscriberBinder;
import java.util.Iterator;
import java.util.Set;
import java.util.logging.Logger;

// Referenced classes of package com.skype.android.config.ecs:
//            EcsClient, EcsKeyLocation, EcsKeys, EcsKey, 
//            OnEcsDone, EcsKeyPolicy

public class EcsConfiguration
{

    public static final int EXP_MOJI_TITLE_CONTROL_GROUP = 1;
    public static final int EXP_MOJI_TITLE_DEFAULT_GROUP = 0;
    public static final int EXP_MOJI_TITLE_TEST_GROUP = 2;
    private static final Logger log = Logger.getLogger("EcsConfiguration");
    private volatile ContentValues contentValues;
    private final EcsClient ecsClient;
    private final EventBus eventBus = EventBusInstance.a();
    private Bundle overrides;

    public EcsConfiguration(EcsClient ecsclient)
    {
        contentValues = new ContentValues();
        overrides = new Bundle();
        (new EventSubscriberBinder(EventBusInstance.a(), this)).bind();
        ecsClient = ecsclient;
        updateEcs();
    }

    private void applyOverrides(Bundle bundle, ContentValues contentvalues)
    {
        if (bundle != null)
        {
            Iterator iterator = bundle.keySet().iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                String s = (String)iterator.next();
                Object obj = bundle.get(s);
                if (obj instanceof String)
                {
                    contentvalues.put(s, (String)obj);
                } else
                if (obj instanceof Integer)
                {
                    contentvalues.put(s, (Integer)obj);
                } else
                if (obj instanceof Byte)
                {
                    contentvalues.put(s, Byte.valueOf(((Byte)obj).byteValue()));
                } else
                if (obj instanceof Short)
                {
                    contentvalues.put(s, Short.valueOf(((Short)obj).shortValue()));
                } else
                if (obj instanceof Long)
                {
                    contentvalues.put(s, Long.valueOf(((Long)obj).longValue()));
                } else
                if (obj instanceof Float)
                {
                    contentvalues.put(s, Float.valueOf(((Float)obj).floatValue()));
                } else
                if (obj instanceof Double)
                {
                    contentvalues.put(s, Double.valueOf(((Double)obj).doubleValue()));
                } else
                if (obj instanceof Boolean)
                {
                    contentvalues.put(s, Boolean.valueOf(((Boolean)obj).booleanValue()));
                }
            } while (true);
        }
    }

    private void updateEcs()
    {
        log.info((new StringBuilder("ECSConfig: \n")).append(ecsClient.getSettingAsString("", "", "")).toString());
        log.info((new StringBuilder("FeaturePolicy: \n")).append(ecsClient.getSettingAsString("", (new StringBuilder()).append(EcsKeyLocation.SKYPE_ANDROID.getPathRoot()).append(EcsKeyLocation.SKYPE_ANDROID.getKeyPrefix()).toString(), "")).toString());
        ContentValues contentvalues = new ContentValues();
        Object aobj[] = EcsKeys.values();
        int l = aobj.length;
        for (int i = 0; i < l; i++)
        {
            aobj[i].getEcsKey().parse(contentvalues, ecsClient);
        }

        aobj = LogEvent.values();
        l = aobj.length;
        for (int j = 0; j < l; j++)
        {
            aobj[j].getEcsKey().parse(contentvalues, ecsClient);
        }

        aobj = KpiEvent.values();
        l = aobj.length;
        for (int k = 0; k < l; k++)
        {
            aobj[k].getEcsKey().parse(contentvalues, ecsClient);
        }

        applyOverrides(overrides, contentvalues);
        contentValues = contentvalues;
        eventBus.a(new OnEcsDone(this));
    }

    public boolean areNotificationActionsEnabled()
    {
        return getBoolean(EcsKeys.NOTIFICATION_ACTIONS);
    }

    public boolean areVariableDefaultAvatarBackgroundColorsSupported()
    {
        return getBoolean(EcsKeys.SUPPORT_VARIABLE_DEFAULT_AVATAR_BACKGROUND_COLORS);
    }

    public boolean equals(Object obj)
    {
        return (obj instanceof EcsConfiguration) && contentValues.equals(((EcsConfiguration)obj).contentValues);
    }

    public String getAPSServiceUrl()
    {
        return getString(EcsKeys.APS_SERVICE_URL);
    }

    public int getAsyncFileAutoDownloadSizeLimit()
    {
        return getInt(EcsKeys.ASYNC_FILE_SHARING_AUTO_DOWNLOAD_SIZE_LIMIT).intValue();
    }

    public int getAsyncFileExpirationPeriod()
    {
        return getInt(EcsKeys.ASYNC_MEDIA_FILE_EXPIRATION_PERIOD).intValue();
    }

    public int getAsyncFileSizeStorageLimit()
    {
        return getInt(EcsKeys.ASYNC_MEDIA_FILE_ORIGINAL_SIZE_LIMIT).intValue();
    }

    public int getAsyncVideoExpirationPeriod()
    {
        return getInt(EcsKeys.ASYNC_MEDIA_VIDEO_EXPIRATION_PERIOD).intValue();
    }

    public String getAutoBuddyServerUrl()
    {
        return getString(EcsKeys.AUTO_BUDDY_SERVER_URL);
    }

    public boolean getBadgeNotificationsEnabled()
    {
        return getBoolean(EcsKeys.BADGE_NOTIFICATIONS_ENABLED);
    }

    public boolean getBoolean(EcsKeyPolicy ecskeypolicy)
    {
        ecskeypolicy = contentValues.getAsBoolean(ecskeypolicy.getEcsKey().getKey());
        return ecskeypolicy != null && ecskeypolicy.booleanValue();
    }

    public String getCallFilters()
    {
        return getString(EcsKeys.CALL_EFFECTS);
    }

    public boolean getCloudEmoticonsEnabled()
    {
        return getBoolean(EcsKeys.CLOUD_EMOTICONS);
    }

    public String getETag()
    {
        return getEcsClient().getETag();
    }

    public int getEasSyncTypeValue()
    {
        return getInt(EcsKeys.EAS_SYNC_TYPE).intValue();
    }

    public EcsClient getEcsClient()
    {
        return ecsClient;
    }

    public ExperimentTag getExpAddFriendsFromContactList()
    {
        return getExperimentUserTag(EcsKeys.EXP_ADD_FRIENDS_FROM_CONTACT_LIST);
    }

    public ExperimentTag getExpMojiForwardExpUserGroup()
    {
        return getExperimentUserTag(EcsKeys.EXP_SPEX_MOJI_FORWARD_USER_GROUP);
    }

    public ExperimentTag getExperimentCalendarIntegrationGroupTag()
    {
        return getExperimentUserTag(EcsKeys.EXPERIMENT_CALENDAR_INTEGRATION_GROUP);
    }

    public String getExperimentCalendarIntegrationOption()
    {
        return getString(EcsKeys.EXPERIMENT_CALENDAR_INTEGRATION_APP_CLIENT_OPTION);
    }

    public ExperimentTag getExperimentHideSignoutGroupTag()
    {
        return getExperimentUserTag(EcsKeys.EXPERIMENT_SIGNOUT_HIDDEN);
    }

    public String getExperimentName()
    {
        return getString(EcsKeys.ECS_EXPERIMENT_NAME);
    }

    public ExperimentTag getExperimentUserTag(EcsKeyPolicy ecskeypolicy)
    {
        ecskeypolicy = getString(ecskeypolicy);
        if (TextUtils.isEmpty(ecskeypolicy))
        {
            break MISSING_BLOCK_LABEL_25;
        }
        ecskeypolicy = ExperimentTag.valueOf(ecskeypolicy);
        return ecskeypolicy;
        ecskeypolicy;
        ecskeypolicy.printStackTrace();
        return ExperimentTag.a;
    }

    public String getInstallOutlookUri()
    {
        return getString(EcsKeys.INSTALL_OUTLOOK_URI);
    }

    public Integer getInt(EcsKey ecskey)
    {
        if (contentValues.containsKey(ecskey.getKey()))
        {
            return contentValues.getAsInteger(ecskey.getKey());
        } else
        {
            return Integer.valueOf(((Integer)ecskey.getDefaultValue()).intValue());
        }
    }

    public Integer getInt(EcsKeyPolicy ecskeypolicy)
    {
        return contentValues.getAsInteger(ecskeypolicy.getEcsKey().getKey());
    }

    public int getLightweightMSASupportState()
    {
        return getInt(EcsKeys.SUPPORT_LIGHTWEIGHT_MSA).intValue();
    }

    public int getLocalNodeReconnectBeforeTimeout()
    {
        return getInt(EcsKeys.LOCAL_NODE_RECONNECT_BEFORE_TIMEOUT).intValue();
    }

    public int getLocalNodeReconnectTimeSlice()
    {
        return getInt(EcsKeys.LOCAL_NODE_RECONNECT_TIME_SLICE).intValue();
    }

    public int getLocalNodeTempDisconnectTimeout()
    {
        return getInt(EcsKeys.LOCAL_NODE_TEMP_DISCONNECT_TIMEOUT).intValue();
    }

    public String getMSALoginScope()
    {
        return getString(EcsKeys.MSA_LOGIN_SCOPE);
    }

    public String getMnvHttpConnectionTimeout()
    {
        return getString(EcsKeys.PHONE_VERIFICATION_CONNECTION_TIMEOUT);
    }

    public String getMnvHttpMaxTimeoutCount()
    {
        return getString(EcsKeys.PHONE_VERIFICATION_MAX_TIMEOUT_COUNT);
    }

    public int getMojiTitleExperimentUserGroupInteger()
    {
        return getInt(EcsKeys.MOJI_TITLE_TEXT_EXPERIMENT_GROUPING_INT).intValue();
    }

    public String getMsaCobrandId()
    {
        return getString(EcsKeys.MSA_COBRAND_ID);
    }

    public boolean getMsnpConnectionIndicatorEnabled()
    {
        return getBoolean(EcsKeys.MSNP_CONNECTION_INDICATOR_EN);
    }

    public String getNativeSpinnerTimeout()
    {
        return getString(EcsKeys.PHONE_VERIFICATION_NATIVE_TIMEOUT);
    }

    public String getOpenWithOfficeExtensionsExcel()
    {
        return getString(EcsKeys.OPEN_W_OFFICE_EXTENSIONS_EXCEL);
    }

    public String getOpenWithOfficeExtensionsPowerPoint()
    {
        return getString(EcsKeys.OPEN_W_OFFICE_EXTENSIONS_POWER_POINT);
    }

    public String getOpenWithOfficeExtensionsWord()
    {
        return getString(EcsKeys.OPEN_W_OFFICE_EXTENSIONS_WORD);
    }

    public String getPhoneVerificationNextButton()
    {
        return getString(EcsKeys.PHONE_VERIFICATION_NEXT_BUTTON);
    }

    public String getPhoneVerificationSkipButton()
    {
        return getString(EcsKeys.PHONE_VERIFICATION_SKIP_BUTTON);
    }

    public String getProfileServiceUrl()
    {
        return getString(EcsKeys.PROFILE_SERVICE_URL);
    }

    public String getRequiredProcessorsCount()
    {
        return getString(EcsKeys.PHONE_VERIFICATION_REQUIRED_PROCESSORS_COUNT);
    }

    public int getSearchAccountsTimeout()
    {
        return getInt(EcsKeys.SEARCH_ACCOUNTS_TIMEOUT).intValue();
    }

    public String getSkypeAuthorizeUrl()
    {
        return getString(EcsKeys.SKYPE_LOGIN_URL);
    }

    public String getSmsSpinnerTimeout()
    {
        return getString(EcsKeys.PHONE_VERIFICATION_SMS_TIMEOUT);
    }

    public String getString(EcsKeyPolicy ecskeypolicy)
    {
        return contentValues.getAsString(ecskeypolicy.getEcsKey().getKey());
    }

    public boolean getTelemetryProviderAriaEnabled()
    {
        return getBoolean(EcsKeys.TELEMETRY_PROVIDER_ARIA);
    }

    public boolean getTelemetryProviderFlurryEnabled()
    {
        return getBoolean(EcsKeys.TELEMETRY_PROVIDER_FLURRY);
    }

    public String getVideoMessageFilters()
    {
        return getString(EcsKeys.VIDEO_MESSAGE_FILTERS);
    }

    public String getVimButtonIcon()
    {
        return getString(EcsKeys.VimButtonIcon);
    }

    public int hashCode()
    {
        return contentValues.hashCode();
    }

    public boolean isAccountDisambiguationSupported()
    {
        return getBoolean(EcsKeys.SUPPORT_ACCOUNT_DISAMBIGUATION);
    }

    public boolean isAdEnabled()
    {
        return getBoolean(EcsKeys.AD_ENABLED);
    }

    public boolean isAgentSuggestionsEnabled()
    {
        return getBoolean(EcsKeys.ENABLE_AGENT_SUGGESTIONS);
    }

    public boolean isAsyncFileSharingEnabled()
    {
        return getBoolean(EcsKeys.IS_ASYNC_FILE_SHARING_ENABLED);
    }

    public boolean isAsyncVideoMessageEnabled()
    {
        return getBoolean(EcsKeys.IS_ASYNC_VIDEO_MESSAGE_ENABLED);
    }

    public boolean isCallEffectsEnabled()
    {
        return getBoolean(EcsKeys.IS_CALL_EFFECTS_ENABLED);
    }

    public boolean isEASIngestEnabled()
    {
        return getBoolean(EcsKeys.EAS_INGEST_ENABLED);
    }

    public boolean isExpMojiForwardButtonEnabled()
    {
        return getBoolean(EcsKeys.EXP_SPEX_MOJI_FORWARD_BUTTON);
    }

    public boolean isExpMojiForwardContextMenuEnabled()
    {
        return getBoolean(EcsKeys.EXP_SPEX_MOJI_FORWARD_CONTEXT_MENU);
    }

    public boolean isFeedbackUiEnabled()
    {
        return getBoolean(EcsKeys.IS_FEEDBACK_UI_ENABLED);
    }

    public boolean isHeartMarkedEnabled()
    {
        return getBoolean(EcsKeys.ENABLE_HEARTMARKING);
    }

    public boolean isInviteFriendsEnabled()
    {
        return getBoolean(EcsKeys.IS_INVITE_FRIENDS_ENABLED);
    }

    public boolean isLocalNodeOfflineEnabled()
    {
        return getBoolean(EcsKeys.IS_LOCAL_NODE_OFFLINE_ENABLED);
    }

    public boolean isLocationSendingEnabled()
    {
        return getBoolean(EcsKeys.IS_LOCATION_SENDING_ENABLED);
    }

    public boolean isLocationSharingEnabled()
    {
        return getBoolean(EcsKeys.IS_LOCATION_SHARING_ENABLED);
    }

    public boolean isMediaPhotoSharingEnabled()
    {
        return getBoolean(EcsKeys.MEDIA_PHOTO_SHARING);
    }

    public boolean isMediaPickerSearchSupported()
    {
        return getBoolean(EcsKeys.EXP_SPEX_MEDIA_PICKER_SEARCH_BUTTON_ENABLED);
    }

    public boolean isMessageAreaDisabledBeforeSendingAddRequest()
    {
        return getBoolean(EcsKeys.DISABLE_MESSAGE_AREA_BEFORE_SENDING_ADD_REQUEST);
    }

    public boolean isMessageStatusIndicatorEnabled()
    {
        return getBoolean(EcsKeys.ENABLE_MESSAGE_INDICATOR);
    }

    public boolean isMojiSectionEnabled()
    {
        return getBoolean(EcsKeys.IS_MOJI_SECTION_ENABLED);
    }

    public boolean isMojiSendOnLongPressEnabled()
    {
        return getBoolean(EcsKeys.IS_MOJI_LONG_PRESS_TO_SEND_ENABLED);
    }

    public boolean isMojiSupported()
    {
        return getBoolean(EcsKeys.SUPPORT_MOJI);
    }

    public boolean isMsaSdkUsedForLogin()
    {
        return getBoolean(EcsKeys.USE_MSA_SDK_FOR_LOGIN);
    }

    public boolean isMsaUsedForNewAccount()
    {
        return isMsaSdkUsedForLogin() && getBoolean(EcsKeys.USE_MSA_FOR_NEW_ACCOUNT);
    }

    public boolean isPickerContentUpdateEnabled()
    {
        return getBoolean(EcsKeys.PICKER_CONTENT_UPDATE);
    }

    public boolean isRecentsUnreadMessageColorChangeEnabled()
    {
        return getBoolean(EcsKeys.CHANGE_UNREAD_MESSAGE_COLOR_RECENTS);
    }

    public boolean isShortCircuitEnabled()
    {
        return getBoolean(EcsKeys.SHORT_CIRCUIT);
    }

    public boolean isSmartHistorySyncEnabled()
    {
        return getBoolean(EcsKeys.SMART_HISTORY_SYNC);
    }

    public boolean isTranslatorEnabled()
    {
        return getBoolean(EcsKeys.TRANSLATOR_ENABLED);
    }

    public boolean isUnifiedPresenceEnabled()
    {
        return getBoolean(EcsKeys.ENABLE_UNIFIED_PRESENCE);
    }

    public boolean isUnreadMessageCountOrangePillEnabled()
    {
        return getBoolean(EcsKeys.SHOW_UNREAD_MESSAGE_COUNT_ORANGE_PILL);
    }

    public boolean isUrlPreviewEnabled()
    {
        return getBoolean(EcsKeys.IS_URL_PREVIEW_ENABLED);
    }

    public boolean isViMFABButtonEnabled()
    {
        return getBoolean(EcsKeys.IS_VIM_FAB_BUTTON_ENABLED);
    }

    public boolean isViMIconVisibleInChatPage()
    {
        return getBoolean(EcsKeys.IS_VIM_ICON_VISIBLE);
    }

    public boolean isViMPromoEnabled()
    {
        return getBoolean(EcsKeys.IS_VIM_PROMO_ENABLED);
    }

    public boolean isViMReplyWithVideoEnabled()
    {
        return getBoolean(EcsKeys.IS_VIM_REPLY_WITH_VIDEO_ENABLED);
    }

    public boolean isViMSaveToGalleryEnabled()
    {
        return getBoolean(EcsKeys.IS_VIM_SAVE_TO_GALLERY_ENABLED);
    }

    public boolean isVimFiltersBadgeEnabled()
    {
        return getBoolean(EcsKeys.IS_VIM_FILTERS_BADGE_ENABLED);
    }

    public boolean isWearRemoteControlEnabled()
    {
        return getBoolean(EcsKeys.IS_WEAR_REMOTE_CONTROL_ENABLED);
    }

    public void onEvent(com.skype.android.gen.SkyLibListener.OnEcsEvent onecsevent)
    {
        if (onecsevent.getEventType() == com.skype.SkyLib.ECS_CALLBACK_EVENT_TYPE.CONFIG_UPDATED)
        {
            log.info("OnEcsUpdated");
            updateEcs();
        }
    }

    public void setBoolean(EcsKeyPolicy ecskeypolicy, boolean flag)
    {
        contentValues.put(ecskeypolicy.getEcsKey().getKey(), Boolean.valueOf(flag));
    }

    public void setOverrides(Bundle bundle)
    {
        overrides = bundle;
        updateEcs();
    }

    void setString(EcsKeyPolicy ecskeypolicy, String s)
    {
        contentValues.put(ecskeypolicy.getEcsKey().getKey(), s);
    }

    public boolean showExternalContacts()
    {
        return getBoolean(EcsKeys.SHOW_EXTERNAL_CONTACTS);
    }

    public String toString()
    {
        return (new StringBuilder("ECSConfiguration: ")).append(contentValues.toString()).toString();
    }

}
