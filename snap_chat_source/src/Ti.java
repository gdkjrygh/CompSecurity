// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.List;
import java.util.Map;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class Ti extends Ra
{

    protected Long addedFriendsTimestamp;
    protected String allowedToUseCash;
    protected String authToken;
    protected String birthday;
    protected String cashCustomerId;
    protected String cashProvider;
    protected Sg clientPrompt;
    protected Map clientProperties;
    protected Integer credits;
    protected Long currentTimestamp;
    protected String deviceToken;
    protected String email;
    protected Boolean enableImageTranscoding;
    protected Boolean enableLensesAndroid;
    protected Boolean enableSaveStoryToGallery;
    protected Boolean enableVideoTranscodingAndroid;
    protected List enabledIapCurrencies;
    protected List enabledLensStoreCurrencies;
    protected QP featureSettings;
    protected Map friendmojiMutableDict;
    protected Map friendmojiReadOnlyDict;
    protected Integer gaussianBlurLevelAndroid;
    protected List industries;
    protected Boolean isCashActive;
    protected Boolean isGalleryEnabled;
    protected Boolean isGalleryInvited;
    protected Boolean isTwoFaEnabled;
    protected Boolean isVerifiedUser;
    protected Long lastAddressBookUpdatedDate;
    protected Long lastReplayedSnapTimestamp;
    protected Long lastUpdated;
    protected Boolean logged;
    protected String mobile;
    protected String mobileVerificationKey;
    protected Integer numberOfBestFriends;
    protected List ourStoryAuths;
    protected String qrPath;
    protected Boolean rawThumbnailUploadEnabled;
    protected Integer received;
    protected List recents;
    protected Boolean requireRefreshingProfileMedia;
    protected Sl resetDisabledTranscodingState;
    protected Integer score;
    protected Boolean searchableByPhoneNumber;
    protected List seenTooltips;
    protected Integer sent;
    protected Boolean shouldCallToVerifyNumber;
    protected Boolean shouldShowSuggestionPrompt;
    protected Boolean shouldTextToVerifyNumber;
    protected Integer snapP;
    protected String snapchatPhoneNumber;
    protected List snaps;
    protected Boolean speedFiltersEnabledAndroid;
    protected String storyPrivacy;
    protected Map studySettings;
    protected String suggestionPromptButtonText;
    protected Long suggestionPromptDurationInMillis;
    protected String suggestionPromptLink;
    protected String suggestionPromptText;
    protected Map targeting;
    protected String thirdPartyTrackingAppId;
    protected String thirdPartyTrackingBaseUrl;
    protected Boolean transcodingProfileLevelConfigurationAndroid;
    protected Integer twoFaVerifiedDeviceNum;
    protected List twoFaVerifiedDevices;
    protected String userId;
    protected String username;
    protected List verifiedSharedPublications;
    protected Boolean videoFiltersEnabled;

    public Ti()
    {
        lastAddressBookUpdatedDate = Long.valueOf(0L);
        requireRefreshingProfileMedia = Boolean.valueOf(false);
        speedFiltersEnabledAndroid = Boolean.valueOf(true);
    }

    public final Boolean A()
    {
        return enableLensesAndroid;
    }

    public final Integer B()
    {
        return gaussianBlurLevelAndroid;
    }

    public final Boolean C()
    {
        return enableSaveStoryToGallery;
    }

    public final String D()
    {
        return birthday;
    }

    public final Integer E()
    {
        return snapP;
    }

    public final String F()
    {
        return storyPrivacy;
    }

    public final Integer G()
    {
        return sent;
    }

    public final Integer H()
    {
        return received;
    }

    public final Integer I()
    {
        return score;
    }

    public final Integer J()
    {
        return credits;
    }

    public final List K()
    {
        return recents;
    }

    public final Long L()
    {
        return addedFriendsTimestamp;
    }

    public final Long M()
    {
        return currentTimestamp;
    }

    public final Long N()
    {
        return lastReplayedSnapTimestamp;
    }

    public final String O()
    {
        return snapchatPhoneNumber;
    }

    public final Boolean P()
    {
        return searchableByPhoneNumber;
    }

    public final List Q()
    {
        return seenTooltips;
    }

    public final Map R()
    {
        return clientProperties;
    }

    public final QP S()
    {
        return featureSettings;
    }

    public final Map T()
    {
        return studySettings;
    }

    public final Boolean U()
    {
        return isCashActive;
    }

    public final String V()
    {
        return cashProvider;
    }

    public final String W()
    {
        return cashCustomerId;
    }

    public final String X()
    {
        return allowedToUseCash;
    }

    public final String Y()
    {
        return thirdPartyTrackingBaseUrl;
    }

    public final String Z()
    {
        return thirdPartyTrackingAppId;
    }

    public final Long aa()
    {
        return lastAddressBookUpdatedDate;
    }

    public final String ab()
    {
        return qrPath;
    }

    public final Boolean ac()
    {
        return requireRefreshingProfileMedia;
    }

    public final Boolean ad()
    {
        return shouldShowSuggestionPrompt;
    }

    public final String ae()
    {
        return suggestionPromptLink;
    }

    public final String af()
    {
        return suggestionPromptText;
    }

    public final String ag()
    {
        return suggestionPromptButtonText;
    }

    public final Long ah()
    {
        return suggestionPromptDurationInMillis;
    }

    public final Boolean ai()
    {
        return videoFiltersEnabled;
    }

    public final List aj()
    {
        return ourStoryAuths;
    }

    public final Map ak()
    {
        return targeting;
    }

    public final List al()
    {
        return industries;
    }

    public final Boolean am()
    {
        return rawThumbnailUploadEnabled;
    }

    public final Boolean an()
    {
        return isTwoFaEnabled;
    }

    public final List ao()
    {
        return twoFaVerifiedDevices;
    }

    public final Map ap()
    {
        return friendmojiMutableDict;
    }

    public final Map aq()
    {
        return friendmojiReadOnlyDict;
    }

    public final List ar()
    {
        return verifiedSharedPublications;
    }

    public final List as()
    {
        return enabledIapCurrencies;
    }

    public final boolean at()
    {
        return enabledIapCurrencies != null;
    }

    public final List au()
    {
        return enabledLensStoreCurrencies;
    }

    public final boolean av()
    {
        return enabledLensStoreCurrencies != null;
    }

    public final Sg aw()
    {
        return clientPrompt;
    }

    public final boolean ax()
    {
        return clientPrompt != null;
    }

    public boolean equals(Object obj)
    {
        if (obj == this)
        {
            return true;
        }
        if (!(obj instanceof Ti))
        {
            return false;
        } else
        {
            obj = (Ti)obj;
            return (new EqualsBuilder()).append(friends, ((Ti) (obj)).friends).append(friendsSyncToken, ((Ti) (obj)).friendsSyncToken).append(friendsSyncType, ((Ti) (obj)).friendsSyncType).append(addedFriends, ((Ti) (obj)).addedFriends).append(bests, ((Ti) (obj)).bests).append(logged, ((Ti) (obj)).logged).append(username, ((Ti) (obj)).username).append(userId, ((Ti) (obj)).userId).append(isVerifiedUser, ((Ti) (obj)).isVerifiedUser).append(authToken, ((Ti) (obj)).authToken).append(deviceToken, ((Ti) (obj)).deviceToken).append(email, ((Ti) (obj)).email).append(mobile, ((Ti) (obj)).mobile).append(mobileVerificationKey, ((Ti) (obj)).mobileVerificationKey).append(enableVideoTranscodingAndroid, ((Ti) (obj)).enableVideoTranscodingAndroid).append(resetDisabledTranscodingState, ((Ti) (obj)).resetDisabledTranscodingState).append(enableImageTranscoding, ((Ti) (obj)).enableImageTranscoding).append(transcodingProfileLevelConfigurationAndroid, ((Ti) (obj)).transcodingProfileLevelConfigurationAndroid).append(enableLensesAndroid, ((Ti) (obj)).enableLensesAndroid).append(gaussianBlurLevelAndroid, ((Ti) (obj)).gaussianBlurLevelAndroid).append(enableSaveStoryToGallery, ((Ti) (obj)).enableSaveStoryToGallery).append(birthday, ((Ti) (obj)).birthday).append(snapP, ((Ti) (obj)).snapP).append(storyPrivacy, ((Ti) (obj)).storyPrivacy).append(sent, ((Ti) (obj)).sent).append(received, ((Ti) (obj)).received).append(score, ((Ti) (obj)).score).append(credits, ((Ti) (obj)).credits).append(snaps, ((Ti) (obj)).snaps).append(recents, ((Ti) (obj)).recents).append(lastUpdated, ((Ti) (obj)).lastUpdated).append(addedFriendsTimestamp, ((Ti) (obj)).addedFriendsTimestamp).append(currentTimestamp, ((Ti) (obj)).currentTimestamp).append(lastReplayedSnapTimestamp, ((Ti) (obj)).lastReplayedSnapTimestamp).append(snapchatPhoneNumber, ((Ti) (obj)).snapchatPhoneNumber).append(searchableByPhoneNumber, ((Ti) (obj)).searchableByPhoneNumber).append(shouldCallToVerifyNumber, ((Ti) (obj)).shouldCallToVerifyNumber).append(shouldTextToVerifyNumber, ((Ti) (obj)).shouldTextToVerifyNumber).append(seenTooltips, ((Ti) (obj)).seenTooltips).append(clientProperties, ((Ti) (obj)).clientProperties).append(featureSettings, ((Ti) (obj)).featureSettings).append(numberOfBestFriends, ((Ti) (obj)).numberOfBestFriends).append(studySettings, ((Ti) (obj)).studySettings).append(isCashActive, ((Ti) (obj)).isCashActive).append(cashProvider, ((Ti) (obj)).cashProvider).append(cashCustomerId, ((Ti) (obj)).cashCustomerId).append(allowedToUseCash, ((Ti) (obj)).allowedToUseCash).append(thirdPartyTrackingBaseUrl, ((Ti) (obj)).thirdPartyTrackingBaseUrl).append(thirdPartyTrackingAppId, ((Ti) (obj)).thirdPartyTrackingAppId).append(lastAddressBookUpdatedDate, ((Ti) (obj)).lastAddressBookUpdatedDate).append(qrPath, ((Ti) (obj)).qrPath).append(requireRefreshingProfileMedia, ((Ti) (obj)).requireRefreshingProfileMedia).append(shouldShowSuggestionPrompt, ((Ti) (obj)).shouldShowSuggestionPrompt).append(suggestionPromptLink, ((Ti) (obj)).suggestionPromptLink).append(suggestionPromptText, ((Ti) (obj)).suggestionPromptText).append(suggestionPromptButtonText, ((Ti) (obj)).suggestionPromptButtonText).append(suggestionPromptDurationInMillis, ((Ti) (obj)).suggestionPromptDurationInMillis).append(videoFiltersEnabled, ((Ti) (obj)).videoFiltersEnabled).append(speedFiltersEnabledAndroid, ((Ti) (obj)).speedFiltersEnabledAndroid).append(ourStoryAuths, ((Ti) (obj)).ourStoryAuths).append(targeting, ((Ti) (obj)).targeting).append(industries, ((Ti) (obj)).industries).append(rawThumbnailUploadEnabled, ((Ti) (obj)).rawThumbnailUploadEnabled).append(isTwoFaEnabled, ((Ti) (obj)).isTwoFaEnabled).append(twoFaVerifiedDeviceNum, ((Ti) (obj)).twoFaVerifiedDeviceNum).append(twoFaVerifiedDevices, ((Ti) (obj)).twoFaVerifiedDevices).append(friendmojiMutableDict, ((Ti) (obj)).friendmojiMutableDict).append(friendmojiReadOnlyDict, ((Ti) (obj)).friendmojiReadOnlyDict).append(verifiedSharedPublications, ((Ti) (obj)).verifiedSharedPublications).append(enabledIapCurrencies, ((Ti) (obj)).enabledIapCurrencies).append(enabledLensStoreCurrencies, ((Ti) (obj)).enabledLensStoreCurrencies).append(isGalleryInvited, ((Ti) (obj)).isGalleryInvited).append(isGalleryEnabled, ((Ti) (obj)).isGalleryEnabled).append(clientPrompt, ((Ti) (obj)).clientPrompt).isEquals();
        }
    }

    public int hashCode()
    {
        return (new HashCodeBuilder()).append(friends).append(friendsSyncToken).append(friendsSyncType).append(addedFriends).append(bests).append(logged).append(username).append(userId).append(isVerifiedUser).append(authToken).append(deviceToken).append(email).append(mobile).append(mobileVerificationKey).append(enableVideoTranscodingAndroid).append(resetDisabledTranscodingState).append(enableImageTranscoding).append(transcodingProfileLevelConfigurationAndroid).append(enableLensesAndroid).append(gaussianBlurLevelAndroid).append(enableSaveStoryToGallery).append(birthday).append(snapP).append(storyPrivacy).append(sent).append(received).append(score).append(credits).append(snaps).append(recents).append(lastUpdated).append(addedFriendsTimestamp).append(currentTimestamp).append(lastReplayedSnapTimestamp).append(snapchatPhoneNumber).append(searchableByPhoneNumber).append(shouldCallToVerifyNumber).append(shouldTextToVerifyNumber).append(seenTooltips).append(clientProperties).append(featureSettings).append(numberOfBestFriends).append(studySettings).append(isCashActive).append(cashProvider).append(cashCustomerId).append(allowedToUseCash).append(thirdPartyTrackingBaseUrl).append(thirdPartyTrackingAppId).append(lastAddressBookUpdatedDate).append(qrPath).append(requireRefreshingProfileMedia).append(shouldShowSuggestionPrompt).append(suggestionPromptLink).append(suggestionPromptText).append(suggestionPromptButtonText).append(suggestionPromptDurationInMillis).append(videoFiltersEnabled).append(speedFiltersEnabledAndroid).append(ourStoryAuths).append(targeting).append(industries).append(rawThumbnailUploadEnabled).append(isTwoFaEnabled).append(twoFaVerifiedDeviceNum).append(twoFaVerifiedDevices).append(friendmojiMutableDict).append(friendmojiReadOnlyDict).append(verifiedSharedPublications).append(enabledIapCurrencies).append(enabledLensStoreCurrencies).append(isGalleryInvited).append(isGalleryEnabled).append(clientPrompt).toHashCode();
    }

    public final Boolean o()
    {
        return logged;
    }

    public final String p()
    {
        return username;
    }

    public final String q()
    {
        return userId;
    }

    public final Boolean r()
    {
        return isVerifiedUser;
    }

    public final String s()
    {
        return authToken;
    }

    public final String t()
    {
        return deviceToken;
    }

    public String toString()
    {
        return ToStringBuilder.reflectionToString(this);
    }

    public final String u()
    {
        return email;
    }

    public final String v()
    {
        return mobile;
    }

    public final String w()
    {
        return mobileVerificationKey;
    }

    public final Boolean x()
    {
        return enableVideoTranscodingAndroid;
    }

    public final Boolean y()
    {
        return enableImageTranscoding;
    }

    public final Boolean z()
    {
        return transcodingProfileLevelConfigurationAndroid;
    }
}
