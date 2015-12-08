// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype;

import java.lang.ref.ReferenceQueue;
import java.util.HashSet;
import java.util.Iterator;

// Referenced classes of package com.skype:
//            ObjectInterfaceImpl, Account, NativeListenable, ObjectInterface, 
//            SkypeFactory, ObjectInterfaceFactory, NativeStringConvert, PROPKEY, 
//            NativeWeakRef, a

public class AccountImpl extends ObjectInterfaceImpl
    implements Account, NativeListenable, ObjectInterface
{
    static final class a extends NativeWeakRef
    {

        private ObjectInterfaceFactory factory;

        public final void destroyNativeObject()
        {
            factory.destroyAccount(nativeObject);
        }

        a(ObjectInterfaceFactory objectinterfacefactory, com.skype.a a1, ReferenceQueue referencequeue, int i)
        {
            super(a1, referencequeue, i);
            factory = objectinterfacefactory;
        }
    }


    private HashSet m_listeners;

    public AccountImpl()
    {
        this(((ObjectInterfaceFactory) (SkypeFactory.getInstance())));
    }

    public AccountImpl(ObjectInterfaceFactory objectinterfacefactory)
    {
        super(objectinterfacefactory, objectinterfacefactory.createAccount());
        m_listeners = new HashSet();
        objectinterfacefactory.initializeListener(this);
    }

    private native void changePassword(byte abyte0[], byte abyte1[], boolean flag);

    private native byte[] getDBPathNativeString();

    private native byte[] getPartnerChannelStatusNativeString();

    private native byte[] getPartnerUIDNativeString(SkyLib.PARTNER_ID partner_id);

    private native byte[] getSkypenameHashNativeString();

    private native String[] getSubscriptionsByType(byte abyte0[]);

    private native byte[] getVerifiedCompanyNativeString();

    private native byte[] getVerifiedEmailNativeString();

    private native void loginWithOAuth(long l, byte abyte0[], byte abyte1[], boolean flag, boolean flag1);

    private native void loginWithPassword(byte abyte0[], boolean flag, boolean flag1);

    private native void logoutOtherEndpoint(byte abyte0[]);

    private native void register(byte abyte0[], boolean flag, boolean flag1, byte abyte1[], boolean flag2);

    private native boolean setProfileAttachment(byte abyte0[], byte abyte1[]);

    private native boolean setServersideStrProperty(PROPKEY propkey, byte abyte0[]);

    private native boolean setStrProperty(PROPKEY propkey, byte abyte0[]);

    private native void setUIVersion(byte abyte0[]);

    public void addListener(Account.AccountIListener accountilistener)
    {
        synchronized (m_listeners)
        {
            m_listeners.add(accountilistener);
        }
        return;
        accountilistener;
        hashset;
        JVM INSTR monitorexit ;
        throw accountilistener;
    }

    public void beginLogin()
    {
        beginLogin(Contact.AVAILABILITY.UNKNOWN);
    }

    public native void beginLogin(Contact.AVAILABILITY availability);

    public native void cancelServerCommit();

    public void changePassword(String s, String s1)
    {
        changePassword(s, s1, false);
    }

    public void changePassword(String s, String s1, boolean flag)
    {
        changePassword(NativeStringConvert.ConvertToNativeBytes(s), NativeStringConvert.ConvertToNativeBytes(s1), flag);
    }

    public NativeWeakRef createNativeWeakRef(ObjectInterfaceFactory objectinterfacefactory, ReferenceQueue referencequeue)
    {
        return new a(objectinterfacefactory, this, referencequeue, m_nativeObject);
    }

    public native void delete();

    public native void externalLoginResponse(byte abyte0[]);

    public native void finishLogin();

    public String getAboutProp()
    {
        return getStrProperty(PROPKEY.CONTACT_ABOUT);
    }

    public Account.ADPOLICY getAdPolicyProp()
    {
        return Account.ADPOLICY.fromInt(getIntProperty(PROPKEY.ACCOUNT_AD_POLICY));
    }

    public String getAlertstringProp()
    {
        return getStrProperty(PROPKEY.CONTACT_ALERTSTRING);
    }

    public native String[] getAllSubscriptionTypes();

    public String getAssignedCommentProp()
    {
        return getStrProperty(PROPKEY.CONTACT_ASSIGNED_COMMENT);
    }

    public String getAssignedSpeeddialProp()
    {
        return getStrProperty(PROPKEY.CONTACT_ASSIGNED_SPEEDDIAL);
    }

    public int getAuthreqTimestampProp()
    {
        return getIntProperty(PROPKEY.CONTACT_AUTHREQ_TIMESTAMP);
    }

    public int getAuthrequestCountProp()
    {
        return getIntProperty(PROPKEY.CONTACT_AUTHREQUEST_COUNT);
    }

    public Account.AUTHREQUESTPOLICY getAuthrequestPolicyProp()
    {
        return Account.AUTHREQUESTPOLICY.fromInt(getIntProperty(PROPKEY.ACCOUNT_AUTHREQUEST_POLICY));
    }

    public Contact.AVAILABILITY getAvailabilityProp()
    {
        return Contact.AVAILABILITY.fromInt(getIntProperty(PROPKEY.CONTACT_AVAILABILITY));
    }

    public byte[] getAvatarImageProp()
    {
        return getBinProperty(PROPKEY.CONTACT_AVATAR_IMAGE);
    }

    public Account.AVATARPOLICY getAvatarPolicyProp()
    {
        return Account.AVATARPOLICY.fromInt(getIntProperty(PROPKEY.ACCOUNT_AVATAR_POLICY));
    }

    public int getAvatarTimestampProp()
    {
        return getIntProperty(PROPKEY.CONTACT_AVATAR_TIMESTAMP);
    }

    public int getBirthdayProp()
    {
        return getIntProperty(PROPKEY.CONTACT_BIRTHDAY);
    }

    public Account.BUDDYCOUNTPOLICY getBuddycountPolicyProp()
    {
        return Account.BUDDYCOUNTPOLICY.fromInt(getIntProperty(PROPKEY.ACCOUNT_BUDDYCOUNT_POLICY));
    }

    public byte[] getCapabilitiesProp()
    {
        return getBinProperty(PROPKEY.CONTACT_CAPABILITIES);
    }

    public native Account.GetCapabilityStatus_Result getCapabilityStatus(Contact.CAPABILITY capability);

    public Account.CBLSYNCSTATUS getCblSyncStatusProp()
    {
        return Account.CBLSYNCSTATUS.fromInt(getIntProperty(PROPKEY.ACCOUNT_CBLSYNCSTATUS));
    }

    public Account.CHATPOLICY getChatPolicyProp()
    {
        return Account.CHATPOLICY.fromInt(getIntProperty(PROPKEY.ACCOUNT_CHAT_POLICY));
    }

    public String getCityProp()
    {
        return getStrProperty(PROPKEY.CONTACT_CITY);
    }

    public int getCobrandIdProp()
    {
        return getIntProperty(PROPKEY.ACCOUNT_COBRAND_ID);
    }

    public Account.COMMITSTATUS getCommitStatusProp()
    {
        return Account.COMMITSTATUS.fromInt(getIntProperty(PROPKEY.ACCOUNT_COMMITSTATUS));
    }

    public native int getContactObjectID();

    public String getCountryProp()
    {
        return getStrProperty(PROPKEY.CONTACT_COUNTRY);
    }

    public String getDBPath()
    {
        return NativeStringConvert.ConvertFromNativeBytes(getDBPathNativeString());
    }

    public String getDisplaynameProp()
    {
        return getStrProperty(PROPKEY.CONTACT_DISPLAYNAME);
    }

    public String getEmailsProp()
    {
        return getStrProperty(PROPKEY.CONTACT_EMAILS);
    }

    public int getFederatedPresencePolicyProp()
    {
        return getIntProperty(PROPKEY.ACCOUNT_FEDERATED_PRESENCE_POLICY);
    }

    public int getFlamingoXmppStatusProp()
    {
        return getIntProperty(PROPKEY.ACCOUNT_FLAMINGO_XMPP_STATUS);
    }

    public String getFullnameProp()
    {
        return getStrProperty(PROPKEY.CONTACT_FULLNAME);
    }

    public int getGenderProp()
    {
        return getIntProperty(PROPKEY.CONTACT_GENDER);
    }

    public Contact.AUTHLEVEL getGivenAuthlevelProp()
    {
        return Contact.AUTHLEVEL.fromInt(getIntProperty(PROPKEY.CONTACT_GIVEN_AUTHLEVEL));
    }

    public String getGivenDisplaynameProp()
    {
        return getStrProperty(PROPKEY.CONTACT_GIVEN_DISPLAYNAME);
    }

    public String getHomepageProp()
    {
        return getStrProperty(PROPKEY.CONTACT_HOMEPAGE);
    }

    public String getIpcountryProp()
    {
        return getStrProperty(PROPKEY.CONTACT_IPCOUNTRY);
    }

    public String getLanguagesProp()
    {
        return getStrProperty(PROPKEY.CONTACT_LANGUAGES);
    }

    public native SkyLib.PARTNER_ID getLastPartnerId();

    public int getLastonlineTimestampProp()
    {
        return getIntProperty(PROPKEY.CONTACT_LASTONLINE_TIMESTAMP);
    }

    public int getLastusedTimestampProp()
    {
        return getIntProperty(PROPKEY.CONTACT_LASTUSED_TIMESTAMP);
    }

    public String getLiveidMembernameProp()
    {
        return getStrProperty(PROPKEY.ACCOUNT_LIVEID_MEMBERNAME);
    }

    public Account.LOGOUTREASON getLogoutReasonProp()
    {
        return Account.LOGOUTREASON.fromInt(getIntProperty(PROPKEY.ACCOUNT_LOGOUTREASON));
    }

    public String getMoodTextProp()
    {
        return getStrProperty(PROPKEY.CONTACT_MOOD_TEXT);
    }

    public int getMoodTimestampProp()
    {
        return getIntProperty(PROPKEY.CONTACT_MOOD_TIMESTAMP);
    }

    public int getNrOfOtherInstancesProp()
    {
        return getIntProperty(PROPKEY.ACCOUNT_NR_OF_OTHER_INSTANCES);
    }

    public int getNrofAuthedBuddiesProp()
    {
        return getIntProperty(PROPKEY.CONTACT_NROF_AUTHED_BUDDIES);
    }

    public String getOfflineCallforwardProp()
    {
        return getStrProperty(PROPKEY.ACCOUNT_OFFLINE_CALLFORWARD);
    }

    public native Account.GetOwnEndpointsInfo_Result getOwnEndpointsInfo();

    public String getPartnerChannelStatus()
    {
        return NativeStringConvert.ConvertFromNativeBytes(getPartnerChannelStatusNativeString());
    }

    public String getPartnerChannelStatusProp()
    {
        return getStrProperty(PROPKEY.ACCOUNT_PARTNER_CHANNEL_STATUS);
    }

    public String getPartnerOptedoutProp()
    {
        return getStrProperty(PROPKEY.ACCOUNT_PARTNER_OPTEDOUT);
    }

    public String getPartnerUID(SkyLib.PARTNER_ID partner_id)
    {
        return NativeStringConvert.ConvertFromNativeBytes(getPartnerUIDNativeString(partner_id));
    }

    public String getPhoneHomeProp()
    {
        return getStrProperty(PROPKEY.CONTACT_PHONE_HOME);
    }

    public String getPhoneMobileProp()
    {
        return getStrProperty(PROPKEY.CONTACT_PHONE_MOBILE);
    }

    public String getPhoneOfficeProp()
    {
        return getStrProperty(PROPKEY.CONTACT_PHONE_OFFICE);
    }

    public Account.PHONENUMBERSPOLICY getPhonenumbersPolicyProp()
    {
        return Account.PHONENUMBERSPOLICY.fromInt(getIntProperty(PROPKEY.ACCOUNT_PHONENUMBERS_POLICY));
    }

    public int getProfileTimestampProp()
    {
        return getIntProperty(PROPKEY.CONTACT_PROFILE_TIMESTAMP);
    }

    public String getProvinceProp()
    {
        return getStrProperty(PROPKEY.CONTACT_PROVINCE);
    }

    public Account.PSTNCALLPOLICY getPstnCallPolicyProp()
    {
        return Account.PSTNCALLPOLICY.fromInt(getIntProperty(PROPKEY.ACCOUNT_PSTN_CALL_POLICY));
    }

    public String getPstnnumberProp()
    {
        return getStrProperty(PROPKEY.CONTACT_PSTNNUMBER);
    }

    public Account.PWDCHANGESTATUS getPwdChangeStatusProp()
    {
        return Account.PWDCHANGESTATUS.fromInt(getIntProperty(PROPKEY.ACCOUNT_PWDCHANGESTATUS));
    }

    public String getReceivedAuthrequestProp()
    {
        return getStrProperty(PROPKEY.CONTACT_RECEIVED_AUTHREQUEST);
    }

    public boolean getRefreshingProp()
    {
        return getIntProperty(PROPKEY.CONTACT_REFRESHING) != 0;
    }

    public int getRegistrationTimestampProp()
    {
        return getIntProperty(PROPKEY.ACCOUNT_REGISTRATION_TIMESTAMP);
    }

    public String getRichMoodTextProp()
    {
        return getStrProperty(PROPKEY.CONTACT_RICH_MOOD_TEXT);
    }

    public boolean getRoamingHistoryEnabledProp()
    {
        return getIntProperty(PROPKEY.ACCOUNT_ROAMING_HISTORY_ENABLED) != 0;
    }

    public String getServiceProviderInfoProp()
    {
        return getStrProperty(PROPKEY.ACCOUNT_SERVICE_PROVIDER_INFO);
    }

    public Account.SHORTCIRCUITSYNC getShortcircuitSyncProp()
    {
        return Account.SHORTCIRCUITSYNC.fromInt(getIntProperty(PROPKEY.ACCOUNT_SHORTCIRCUIT_SYNC));
    }

    public String getSigninNameProp()
    {
        return getStrProperty(PROPKEY.ACCOUNT_SIGNIN_NAME);
    }

    public Account.SKYPECALLPOLICY getSkypeCallPolicyProp()
    {
        return Account.SKYPECALLPOLICY.fromInt(getIntProperty(PROPKEY.ACCOUNT_SKYPE_CALL_POLICY));
    }

    public String getSkypeinNumbersProp()
    {
        return getStrProperty(PROPKEY.ACCOUNT_SKYPEIN_NUMBERS);
    }

    public String getSkypenameHash()
    {
        return NativeStringConvert.ConvertFromNativeBytes(getSkypenameHashNativeString());
    }

    public String getSkypenameProp()
    {
        return getStrProperty(PROPKEY.CONTACT_SKYPENAME);
    }

    public String getSkypeoutBalanceCurrencyProp()
    {
        return getStrProperty(PROPKEY.ACCOUNT_SKYPEOUT_BALANCE_CURRENCY);
    }

    public int getSkypeoutBalanceProp()
    {
        return getIntProperty(PROPKEY.ACCOUNT_SKYPEOUT_BALANCE);
    }

    public int getSkypeoutPrecisionProp()
    {
        return getIntProperty(PROPKEY.ACCOUNT_SKYPEOUT_PRECISION);
    }

    public Account.STATUS getStatusProp()
    {
        return Account.STATUS.fromInt(getIntProperty(PROPKEY.ACCOUNT_STATUS));
    }

    public native Account.GetStatusWithProgress_Result getStatusWithProgress();

    public native Account.GetSubscriptionInfo_Result getSubscriptionInfo();

    public String[] getSubscriptionsByType(String s)
    {
        return getSubscriptionsByType(NativeStringConvert.ConvertToNativeBytes(s));
    }

    public String getSubscriptionsProp()
    {
        return getStrProperty(PROPKEY.ACCOUNT_SUBSCRIPTIONS);
    }

    public String getSuggestedSkypenameProp()
    {
        return getStrProperty(PROPKEY.ACCOUNT_SUGGESTED_SKYPENAME);
    }

    public Account.TIMEZONEPOLICY getTimezonePolicyProp()
    {
        return Account.TIMEZONEPOLICY.fromInt(getIntProperty(PROPKEY.ACCOUNT_TIMEZONE_POLICY));
    }

    public int getTimezoneProp()
    {
        return getIntProperty(PROPKEY.CONTACT_TIMEZONE);
    }

    public Contact.TYPE getTypeProp()
    {
        return Contact.TYPE.fromInt(getIntProperty(PROPKEY.CONTACT_TYPE));
    }

    public String getVerifiedCompany()
    {
        return NativeStringConvert.ConvertFromNativeBytes(getVerifiedCompanyNativeString());
    }

    public String getVerifiedEmail()
    {
        return NativeStringConvert.ConvertFromNativeBytes(getVerifiedEmailNativeString());
    }

    public Account.VOICEMAILPOLICY getVoicemailPolicyProp()
    {
        return Account.VOICEMAILPOLICY.fromInt(getIntProperty(PROPKEY.ACCOUNT_VOICEMAIL_POLICY));
    }

    public Account.WEBPRESENCEPOLICY_DEPRECATED getWebpresencePolicyProp()
    {
        return Account.WEBPRESENCEPOLICY_DEPRECATED.fromInt(getIntProperty(PROPKEY.ACCOUNT_WEBPRESENCE_POLICY));
    }

    public native void initializeListener();

    public void login()
    {
        login(Contact.AVAILABILITY.UNKNOWN);
    }

    public native void login(Contact.AVAILABILITY availability);

    public void loginWithOAuth(long l, String s)
    {
        loginWithOAuth(l, s, "", false, true);
    }

    public void loginWithOAuth(long l, String s, String s1)
    {
        loginWithOAuth(l, s, s1, false, true);
    }

    public void loginWithOAuth(long l, String s, String s1, boolean flag)
    {
        loginWithOAuth(l, s, s1, flag, true);
    }

    public void loginWithOAuth(long l, String s, String s1, boolean flag, boolean flag1)
    {
        loginWithOAuth(l, NativeStringConvert.ConvertToNativeBytes(s), NativeStringConvert.ConvertToNativeBytes(s1), flag, flag1);
    }

    public void loginWithPassword(String s)
    {
        loginWithPassword(s, false, true);
    }

    public void loginWithPassword(String s, boolean flag)
    {
        loginWithPassword(s, flag, true);
    }

    public void loginWithPassword(String s, boolean flag, boolean flag1)
    {
        loginWithPassword(NativeStringConvert.ConvertToNativeBytes(s), flag, flag1);
    }

    public void logout()
    {
        logout(false);
    }

    public native void logout(boolean flag);

    public void logoutEx()
    {
        logoutEx(false, false);
    }

    public void logoutEx(boolean flag)
    {
        logoutEx(flag, false);
    }

    public native void logoutEx(boolean flag, boolean flag1);

    public void logoutOtherEndpoint(String s)
    {
        logoutOtherEndpoint(NativeStringConvert.ConvertToNativeBytes(s));
    }

    public native void logoutOtherEndpoints();

    public void onEndpointsChanged()
    {
        HashSet hashset = m_listeners;
        hashset;
        JVM INSTR monitorenter ;
        for (Iterator iterator = m_listeners.iterator(); iterator.hasNext(); ((Account.AccountIListener)iterator.next()).onEndpointsChanged(this)) { }
        break MISSING_BLOCK_LABEL_47;
        Exception exception;
        exception;
        hashset;
        JVM INSTR monitorexit ;
        throw exception;
        hashset;
        JVM INSTR monitorexit ;
    }

    public native void reconnectXMPP();

    public void register(String s)
    {
        register(s, false, true, "", false);
    }

    public void register(String s, boolean flag)
    {
        register(s, flag, true, "", false);
    }

    public void register(String s, boolean flag, boolean flag1)
    {
        register(s, flag, flag1, "", false);
    }

    public void register(String s, boolean flag, boolean flag1, String s1)
    {
        register(s, flag, flag1, s1, false);
    }

    public void register(String s, boolean flag, boolean flag1, String s1, boolean flag2)
    {
        register(NativeStringConvert.ConvertToNativeBytes(s), flag, flag1, NativeStringConvert.ConvertToNativeBytes(s1), flag2);
    }

    public void removeListener(Account.AccountIListener accountilistener)
    {
        synchronized (m_listeners)
        {
            m_listeners.remove(accountilistener);
        }
        return;
        accountilistener;
        hashset;
        JVM INSTR monitorexit ;
        throw accountilistener;
    }

    public native void setAvailability(Contact.AVAILABILITY availability);

    public native boolean setBinProperty(PROPKEY propkey, byte abyte0[]);

    public native boolean setIntProperty(PROPKEY propkey, int i);

    public native void setPasswordSaved(boolean flag);

    public boolean setProfileAttachment(String s, byte abyte0[])
    {
        return setProfileAttachment(NativeStringConvert.ConvertToNativeBytes(s), abyte0);
    }

    public native boolean setServersideIntProperty(PROPKEY propkey, int i);

    public boolean setServersideStrProperty(PROPKEY propkey, String s)
    {
        return setServersideStrProperty(propkey, NativeStringConvert.ConvertToNativeBytes(s));
    }

    public native void setStandby(boolean flag);

    public boolean setStrProperty(PROPKEY propkey, String s)
    {
        return setStrProperty(propkey, NativeStringConvert.ConvertToNativeBytes(s));
    }

    public void setUIVersion(String s)
    {
        setUIVersion(NativeStringConvert.ConvertToNativeBytes(s));
    }

    public native void updateSubscriptions();
}
