// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype;

import java.lang.ref.ReferenceQueue;
import java.util.HashSet;
import java.util.Iterator;

// Referenced classes of package com.skype:
//            ObjectInterfaceImpl, NativeListenable, ObjectInterface, Participant, 
//            SkypeFactory, ObjectInterfaceFactory, PROPKEY, NativeStringConvert, 
//            NativeWeakRef, a

public class ParticipantImpl extends ObjectInterfaceImpl
    implements NativeListenable, ObjectInterface, Participant
{
    static final class a extends NativeWeakRef
    {

        private ObjectInterfaceFactory factory;

        public final void destroyNativeObject()
        {
            factory.destroyParticipant(nativeObject);
        }

        a(ObjectInterfaceFactory objectinterfacefactory, com.skype.a a1, ReferenceQueue referencequeue, int i)
        {
            super(a1, referencequeue, i);
            factory = objectinterfacefactory;
        }
    }


    private HashSet m_listeners;

    public ParticipantImpl()
    {
        this(((ObjectInterfaceFactory) (SkypeFactory.getInstance())));
    }

    public ParticipantImpl(ObjectInterfaceFactory objectinterfacefactory)
    {
        super(objectinterfacefactory, objectinterfacefactory.createParticipant());
        m_listeners = new HashSet();
        objectinterfacefactory.initializeListener(this);
    }

    private native byte[] getRemoteVersionNativeString();

    private native boolean ring(byte abyte0[], boolean flag, int i, int j, boolean flag1, byte abyte1[], byte abyte2[], 
            byte abyte3[]);

    private native boolean ringNodeInfo(byte abyte0[], boolean flag, byte abyte1[], byte abyte2[]);

    private native boolean setLiveIdentityToUse(byte abyte0[]);

    public void addListener(Participant.ParticipantIListener participantilistener)
    {
        synchronized (m_listeners)
        {
            m_listeners.add(participantilistener);
        }
        return;
        participantilistener;
        hashset;
        JVM INSTR monitorexit ;
        throw participantilistener;
    }

    public native boolean canSetRankTo(Participant.RANK rank);

    public NativeWeakRef createNativeWeakRef(ObjectInterfaceFactory objectinterfacefactory, ReferenceQueue referencequeue)
    {
        return new a(objectinterfacefactory, this, referencequeue, m_nativeObject);
    }

    public String getAdderProp()
    {
        return getStrProperty(PROPKEY.PARTICIPANT_ADDER);
    }

    public int getConvoIdProp()
    {
        return getIntProperty(PROPKEY.PARTICIPANT_CONVO_ID);
    }

    public String getDebuginfoProp()
    {
        return getStrProperty(PROPKEY.PARTICIPANT_DEBUGINFO);
    }

    public Participant.PARTICIPANT_CAPABILITIES getGroupCallingCapabilitiesProp()
    {
        return Participant.PARTICIPANT_CAPABILITIES.fromInt(getIntProperty(PROPKEY.PARTICIPANT_GROUP_CALLING_CAPABILITIES));
    }

    public String getIdentityProp()
    {
        return getStrProperty(PROPKEY.PARTICIPANT_IDENTITY);
    }

    public boolean getIsMultipartyVideoCapableProp()
    {
        return getIntProperty(PROPKEY.PARTICIPANT_IS_MULTIPARTY_VIDEO_CAPABLE) != 0;
    }

    public boolean getIsMultipartyVideoUpdatableProp()
    {
        return getIntProperty(PROPKEY.PARTICIPANT_IS_MULTIPARTY_VIDEO_UPDATABLE) != 0;
    }

    public boolean getIsPremiumVideoSponsorProp()
    {
        return getIntProperty(PROPKEY.PARTICIPANT_IS_PREMIUM_VIDEO_SPONSOR) != 0;
    }

    public boolean getIsSeamlesslyUpgradedCallProp()
    {
        return getIntProperty(PROPKEY.PARTICIPANT_IS_SEAMLESSLY_UPGRADED_CALL) != 0;
    }

    public SkyLib.CODEC_COMPATIBILITY getIsVideoCodecCompatibleProp()
    {
        return SkyLib.CODEC_COMPATIBILITY.fromInt(getIntProperty(PROPKEY.PARTICIPANT_IS_VIDEO_CODEC_COMPATIBLE));
    }

    public SkyLib.LEAVE_REASON getLastLeavereasonProp()
    {
        return SkyLib.LEAVE_REASON.fromInt(getIntProperty(PROPKEY.PARTICIPANT_LAST_LEAVEREASON));
    }

    public String getLastVoiceErrorProp()
    {
        return getStrProperty(PROPKEY.PARTICIPANT_LAST_VOICE_ERROR);
    }

    public String getLiveCountryProp()
    {
        return getStrProperty(PROPKEY.PARTICIPANT_LIVE_COUNTRY);
    }

    public String getLiveFwdIdentitiesProp()
    {
        return getStrProperty(PROPKEY.PARTICIPANT_LIVE_FWD_IDENTITIES);
    }

    public String getLiveIdentityProp()
    {
        return getStrProperty(PROPKEY.PARTICIPANT_LIVE_IDENTITY);
    }

    public String getLiveIdentityToUseProp()
    {
        return getStrProperty(PROPKEY.PARTICIPANT_LIVE_IDENTITY_TO_USE);
    }

    public String getLiveIpAddressProp()
    {
        return getStrProperty(PROPKEY.PARTICIPANT_LIVE_IP_ADDRESS);
    }

    public String getLivePriceForMeProp()
    {
        return getStrProperty(PROPKEY.PARTICIPANT_LIVE_PRICE_FOR_ME);
    }

    public native Participant.GetLiveSessionVideos_Result getLiveSessionVideos();

    public int getLiveStartTimestampProp()
    {
        return getIntProperty(PROPKEY.PARTICIPANT_LIVE_START_TIMESTAMP);
    }

    public SkyLib.IDENTITYTYPE getLiveTypeProp()
    {
        return SkyLib.IDENTITYTYPE.fromInt(getIntProperty(PROPKEY.PARTICIPANT_LIVE_TYPE));
    }

    public int getLiveVoicechannelProp()
    {
        return getIntProperty(PROPKEY.PARTICIPANT_LIVE_VOICECHANNEL);
    }

    public boolean getLivesessionFallbackInProgressProp()
    {
        return getIntProperty(PROPKEY.PARTICIPANT_LIVESESSION_FALLBACK_IN_PROGRESS) != 0;
    }

    public boolean getLivesessionRecoveryInProgressProp()
    {
        return getIntProperty(PROPKEY.PARTICIPANT_LIVESESSION_RECOVERY_IN_PROGRESS) != 0;
    }

    public String getQualityProblemsProp()
    {
        return getStrProperty(PROPKEY.PARTICIPANT_QUALITY_PROBLEMS);
    }

    public Participant.RANK getRankProp()
    {
        return Participant.RANK.fromInt(getIntProperty(PROPKEY.PARTICIPANT_RANK));
    }

    public int getReadHorizonProp()
    {
        return getIntProperty(PROPKEY.PARTICIPANT_READ_HORIZON);
    }

    public String getRemoteVersion()
    {
        return NativeStringConvert.ConvertFromNativeBytes(getRemoteVersionNativeString());
    }

    public Participant.RANK getRequestedRankProp()
    {
        return Participant.RANK.fromInt(getIntProperty(PROPKEY.PARTICIPANT_REQUESTED_RANK));
    }

    public int getSoundLevelProp()
    {
        return getIntProperty(PROPKEY.PARTICIPANT_SOUND_LEVEL);
    }

    public Participant.TEXT_STATUS getTextStatusProp()
    {
        return Participant.TEXT_STATUS.fromInt(getIntProperty(PROPKEY.PARTICIPANT_TEXT_STATUS));
    }

    public String getTransferredByProp()
    {
        return getStrProperty(PROPKEY.PARTICIPANT_TRANSFERRED_BY);
    }

    public String getTransferredToProp()
    {
        return getStrProperty(PROPKEY.PARTICIPANT_TRANSFERRED_TO);
    }

    public Participant.VOICE_STATUS getVoiceStatusProp()
    {
        return Participant.VOICE_STATUS.fromInt(getIntProperty(PROPKEY.PARTICIPANT_VOICE_STATUS));
    }

    public native boolean hangup();

    public native void initializeListener();

    public void onIncomingDTMF(Participant.DTMF dtmf)
    {
        HashSet hashset = m_listeners;
        hashset;
        JVM INSTR monitorenter ;
        for (Iterator iterator = m_listeners.iterator(); iterator.hasNext(); ((Participant.ParticipantIListener)iterator.next()).onIncomingDTMF(this, dtmf)) { }
        break MISSING_BLOCK_LABEL_48;
        dtmf;
        hashset;
        JVM INSTR monitorexit ;
        throw dtmf;
        hashset;
        JVM INSTR monitorexit ;
    }

    public void onLiveSessionVideosChanged()
    {
        HashSet hashset = m_listeners;
        hashset;
        JVM INSTR monitorenter ;
        for (Iterator iterator = m_listeners.iterator(); iterator.hasNext(); ((Participant.ParticipantIListener)iterator.next()).onLiveSessionVideosChanged(this)) { }
        break MISSING_BLOCK_LABEL_47;
        Exception exception;
        exception;
        hashset;
        JVM INSTR monitorexit ;
        throw exception;
        hashset;
        JVM INSTR monitorexit ;
    }

    public void removeListener(Participant.ParticipantIListener participantilistener)
    {
        synchronized (m_listeners)
        {
            m_listeners.remove(participantilistener);
        }
        return;
        participantilistener;
        hashset;
        JVM INSTR monitorexit ;
        throw participantilistener;
    }

    public native boolean retire();

    public boolean ring()
    {
        return ring("", false, 0, 0, false, "", "", "");
    }

    public boolean ring(String s)
    {
        return ring(s, false, 0, 0, false, "", "", "");
    }

    public boolean ring(String s, boolean flag)
    {
        return ring(s, flag, 0, 0, false, "", "", "");
    }

    public boolean ring(String s, boolean flag, int i)
    {
        return ring(s, flag, i, 0, false, "", "", "");
    }

    public boolean ring(String s, boolean flag, int i, int j)
    {
        return ring(s, flag, i, j, false, "", "", "");
    }

    public boolean ring(String s, boolean flag, int i, int j, boolean flag1)
    {
        return ring(s, flag, i, j, flag1, "", "", "");
    }

    public boolean ring(String s, boolean flag, int i, int j, boolean flag1, String s1)
    {
        return ring(s, flag, i, j, flag1, s1, "", "");
    }

    public boolean ring(String s, boolean flag, int i, int j, boolean flag1, String s1, String s2)
    {
        return ring(s, flag, i, j, flag1, s1, s2, "");
    }

    public boolean ring(String s, boolean flag, int i, int j, boolean flag1, String s1, String s2, 
            String s3)
    {
        return ring(NativeStringConvert.ConvertToNativeBytes(s), flag, i, j, flag1, NativeStringConvert.ConvertToNativeBytes(s1), NativeStringConvert.ConvertToNativeBytes(s2), NativeStringConvert.ConvertToNativeBytes(s3));
    }

    public boolean ringIt()
    {
        return ringIt(false);
    }

    public native boolean ringIt(boolean flag);

    public boolean ringNodeInfo()
    {
        return ringNodeInfo("", false, null, "");
    }

    public boolean ringNodeInfo(String s)
    {
        return ringNodeInfo(s, false, null, "");
    }

    public boolean ringNodeInfo(String s, boolean flag)
    {
        return ringNodeInfo(s, flag, null, "");
    }

    public boolean ringNodeInfo(String s, boolean flag, byte abyte0[])
    {
        return ringNodeInfo(s, flag, abyte0, "");
    }

    public boolean ringNodeInfo(String s, boolean flag, byte abyte0[], String s1)
    {
        return ringNodeInfo(NativeStringConvert.ConvertToNativeBytes(s), flag, abyte0, NativeStringConvert.ConvertToNativeBytes(s1));
    }

    public boolean setLiveIdentityToUse()
    {
        return setLiveIdentityToUse("");
    }

    public boolean setLiveIdentityToUse(String s)
    {
        return setLiveIdentityToUse(NativeStringConvert.ConvertToNativeBytes(s));
    }

    public native boolean setPosition(int i);

    public native boolean setRankTo(Participant.RANK rank);
}
