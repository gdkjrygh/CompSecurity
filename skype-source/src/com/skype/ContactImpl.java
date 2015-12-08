// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype;

import java.lang.ref.ReferenceQueue;
import java.util.HashSet;

// Referenced classes of package com.skype:
//            ObjectInterfaceImpl, Contact, NativeListenable, ObjectInterface, 
//            SkypeFactory, ObjectInterfaceFactory, NativeStringConvert, PROPKEY, 
//            NativeWeakRef, Conversation, a

public class ContactImpl extends ObjectInterfaceImpl
    implements Contact, NativeListenable, ObjectInterface
{
    static final class a extends NativeWeakRef
    {

        private ObjectInterfaceFactory factory;

        public final void destroyNativeObject()
        {
            factory.destroyContact(nativeObject);
        }

        a(ObjectInterfaceFactory objectinterfacefactory, com.skype.a a1, ReferenceQueue referencequeue, int i)
        {
            super(a1, referencequeue, i);
            factory = objectinterfacefactory;
        }
    }


    private HashSet m_listeners;

    public ContactImpl()
    {
        this(((ObjectInterfaceFactory) (SkypeFactory.getInstance())));
    }

    public ContactImpl(ObjectInterfaceFactory objectinterfacefactory)
    {
        super(objectinterfacefactory, objectinterfacefactory.createContact());
        m_listeners = new HashSet();
        objectinterfacefactory.initializeListener(this);
    }

    private native boolean assignSpeedDial(byte abyte0[]);

    private native byte[] getIdentityNativeString();

    private native Contact.GetProfileAttachment_Result getProfileAttachment(byte abyte0[]);

    private native byte[] getVerifiedCompanyNativeString();

    private native byte[] getVerifiedEmailNativeString();

    private native boolean giveDisplayName(byte abyte0[]);

    private native boolean sendAuthRequest(byte abyte0[], int i);

    private native boolean setPhoneNumber(int i, byte abyte0[], byte abyte1[]);

    public void addListener(Contact.ContactIListener contactilistener)
    {
        synchronized (m_listeners)
        {
            m_listeners.add(contactilistener);
        }
        return;
        contactilistener;
        hashset;
        JVM INSTR monitorexit ;
        throw contactilistener;
    }

    public boolean assignSpeedDial(String s)
    {
        return assignSpeedDial(NativeStringConvert.ConvertToNativeBytes(s));
    }

    public native boolean copyLocalDataFrom(int i);

    public NativeWeakRef createNativeWeakRef(ObjectInterfaceFactory objectinterfacefactory, ReferenceQueue referencequeue)
    {
        return new a(objectinterfacefactory, this, referencequeue, m_nativeObject);
    }

    public String getAboutProp()
    {
        return getStrProperty(PROPKEY.CONTACT_ABOUT);
    }

    public String getAlertstringProp()
    {
        return getStrProperty(PROPKEY.CONTACT_ALERTSTRING);
    }

    public String getAssignedCommentProp()
    {
        return getStrProperty(PROPKEY.CONTACT_ASSIGNED_COMMENT);
    }

    public String getAssignedPhone1LabelProp()
    {
        return getStrProperty(PROPKEY.CONTACT_ASSIGNED_PHONE1_LABEL);
    }

    public String getAssignedPhone1Prop()
    {
        return getStrProperty(PROPKEY.CONTACT_ASSIGNED_PHONE1);
    }

    public String getAssignedPhone2LabelProp()
    {
        return getStrProperty(PROPKEY.CONTACT_ASSIGNED_PHONE2_LABEL);
    }

    public String getAssignedPhone2Prop()
    {
        return getStrProperty(PROPKEY.CONTACT_ASSIGNED_PHONE2);
    }

    public String getAssignedPhone3LabelProp()
    {
        return getStrProperty(PROPKEY.CONTACT_ASSIGNED_PHONE3_LABEL);
    }

    public String getAssignedPhone3Prop()
    {
        return getStrProperty(PROPKEY.CONTACT_ASSIGNED_PHONE3);
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

    public Contact.AVAILABILITY getAvailabilityProp()
    {
        return Contact.AVAILABILITY.fromInt(getIntProperty(PROPKEY.CONTACT_AVAILABILITY));
    }

    public native Contact.GetAvatar_Result getAvatar();

    public byte[] getAvatarImageProp()
    {
        return getBinProperty(PROPKEY.CONTACT_AVATAR_IMAGE);
    }

    public int getAvatarTimestampProp()
    {
        return getIntProperty(PROPKEY.CONTACT_AVATAR_TIMESTAMP);
    }

    public int getBirthdayProp()
    {
        return getIntProperty(PROPKEY.CONTACT_BIRTHDAY);
    }

    public byte[] getCapabilitiesProp()
    {
        return getBinProperty(PROPKEY.CONTACT_CAPABILITIES);
    }

    public Contact.CAPABILITYSTATUS getCapabilityStatus(Contact.CAPABILITY capability)
    {
        return getCapabilityStatus(capability, false);
    }

    public native Contact.CAPABILITYSTATUS getCapabilityStatus(Contact.CAPABILITY capability, boolean flag);

    public String getCityProp()
    {
        return getStrProperty(PROPKEY.CONTACT_CITY);
    }

    public String getCountryProp()
    {
        return getStrProperty(PROPKEY.CONTACT_COUNTRY);
    }

    public String getDisplaynameProp()
    {
        return getStrProperty(PROPKEY.CONTACT_DISPLAYNAME);
    }

    public String getEmailsProp()
    {
        return getStrProperty(PROPKEY.CONTACT_EMAILS);
    }

    public String getExternalIdProp()
    {
        return getStrProperty(PROPKEY.CONTACT_EXTERNAL_ID);
    }

    public String getExternalSystemIdProp()
    {
        return getStrProperty(PROPKEY.CONTACT_EXTERNAL_SYSTEM_ID);
    }

    public String getFirstnameProp()
    {
        return getStrProperty(PROPKEY.CONTACT_FIRSTNAME);
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

    public String getHashedEmailsProp()
    {
        return getStrProperty(PROPKEY.CONTACT_HASHED_EMAILS);
    }

    public String getHomepageProp()
    {
        return getStrProperty(PROPKEY.CONTACT_HOMEPAGE);
    }

    public String getIdentity()
    {
        return NativeStringConvert.ConvertFromNativeBytes(getIdentityNativeString());
    }

    public String getIpcountryProp()
    {
        return getStrProperty(PROPKEY.CONTACT_IPCOUNTRY);
    }

    public int getIsMobileProp()
    {
        return getIntProperty(PROPKEY.CONTACT_IS_MOBILE);
    }

    public int getIsTrustedProp()
    {
        return getIntProperty(PROPKEY.CONTACT_IS_TRUSTED);
    }

    public Contact.GetKnownRemoteVersions_Result getKnownRemoteVersions()
    {
        return getKnownRemoteVersions(false);
    }

    public native Contact.GetKnownRemoteVersions_Result getKnownRemoteVersions(boolean flag);

    public String getLanguagesProp()
    {
        return getStrProperty(PROPKEY.CONTACT_LANGUAGES);
    }

    public String getLastnameProp()
    {
        return getStrProperty(PROPKEY.CONTACT_LASTNAME);
    }

    public int getLastonlineTimestampProp()
    {
        return getIntProperty(PROPKEY.CONTACT_LASTONLINE_TIMESTAMP);
    }

    public int getLastusedTimestampProp()
    {
        return getIntProperty(PROPKEY.CONTACT_LASTUSED_TIMESTAMP);
    }

    public String getMoodTextProp()
    {
        return getStrProperty(PROPKEY.CONTACT_MOOD_TEXT);
    }

    public int getMoodTimestampProp()
    {
        return getIntProperty(PROPKEY.CONTACT_MOOD_TIMESTAMP);
    }

    public int getNrofAuthedBuddiesProp()
    {
        return getIntProperty(PROPKEY.CONTACT_NROF_AUTHED_BUDDIES);
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

    public int getPopularityOrdProp()
    {
        return getIntProperty(PROPKEY.CONTACT_POPULARITY_ORD);
    }

    public Contact.GetProfileAttachment_Result getProfileAttachment(String s)
    {
        return getProfileAttachment(NativeStringConvert.ConvertToNativeBytes(s));
    }

    public int getProfileTimestampProp()
    {
        return getIntProperty(PROPKEY.CONTACT_PROFILE_TIMESTAMP);
    }

    public String getProvinceProp()
    {
        return getStrProperty(PROPKEY.CONTACT_PROVINCE);
    }

    public String getPstnnumberProp()
    {
        return getStrProperty(PROPKEY.CONTACT_PSTNNUMBER);
    }

    public String getReceivedAuthrequestProp()
    {
        return getStrProperty(PROPKEY.CONTACT_RECEIVED_AUTHREQUEST);
    }

    public boolean getRefreshingProp()
    {
        return getIntProperty(PROPKEY.CONTACT_REFRESHING) != 0;
    }

    public String getRichMoodTextProp()
    {
        return getStrProperty(PROPKEY.CONTACT_RICH_MOOD_TEXT);
    }

    public String getSkypenameProp()
    {
        return getStrProperty(PROPKEY.CONTACT_SKYPENAME);
    }

    public int getTimezoneProp()
    {
        return getIntProperty(PROPKEY.CONTACT_TIMEZONE);
    }

    public native Contact.TYPE getType();

    public Contact.TYPE getTypeProp()
    {
        return Contact.TYPE.fromInt(getIntProperty(PROPKEY.CONTACT_TYPE));
    }

    public native Contact.GetUnifiedMasters_Result getUnifiedMasters();

    public native Contact.GetUnifiedServants_Result getUnifiedServants();

    public String getVerifiedCompany()
    {
        return NativeStringConvert.ConvertFromNativeBytes(getVerifiedCompanyNativeString());
    }

    public String getVerifiedEmail()
    {
        return NativeStringConvert.ConvertFromNativeBytes(getVerifiedEmailNativeString());
    }

    public boolean giveDisplayName(String s)
    {
        return giveDisplayName(NativeStringConvert.ConvertToNativeBytes(s));
    }

    public native boolean hasAuthorizedMe();

    public boolean hasCapability(Contact.CAPABILITY capability)
    {
        return hasCapability(capability, false);
    }

    public native boolean hasCapability(Contact.CAPABILITY capability, boolean flag);

    public native boolean ignoreAuthRequest();

    public native void initializeListener();

    public native boolean isMemberOf(int i);

    public native boolean isMemberOfHardwiredGroup(ContactGroup.TYPE type);

    public native boolean openConversation(Conversation conversation);

    public native void refreshProfile();

    public void removeListener(Contact.ContactIListener contactilistener)
    {
        synchronized (m_listeners)
        {
            m_listeners.remove(contactilistener);
        }
        return;
        contactilistener;
        hashset;
        JVM INSTR monitorexit ;
        throw contactilistener;
    }

    public boolean sendAuthRequest(String s)
    {
        return sendAuthRequest(s, 0);
    }

    public boolean sendAuthRequest(String s, int i)
    {
        return sendAuthRequest(NativeStringConvert.ConvertToNativeBytes(s), i);
    }

    public boolean setBlocked(boolean flag)
    {
        return setBlocked(flag, false);
    }

    public native boolean setBlocked(boolean flag, boolean flag1);

    public boolean setBuddyStatus(boolean flag)
    {
        return setBuddyStatus(flag, true);
    }

    public native boolean setBuddyStatus(boolean flag, boolean flag1);

    public boolean setPhoneNumber(int i, String s, String s1)
    {
        return setPhoneNumber(i, NativeStringConvert.ConvertToNativeBytes(s), NativeStringConvert.ConvertToNativeBytes(s1));
    }
}
