// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype;

import java.lang.ref.ReferenceQueue;
import java.util.HashSet;
import java.util.Iterator;

// Referenced classes of package com.skype:
//            ObjectInterfaceImpl, NativeListenable, ObjectInterface, Translator, 
//            SkypeFactory, ObjectInterfaceFactory, NativeStringConvert, NativeWeakRef, 
//            a

public class TranslatorImpl extends ObjectInterfaceImpl
    implements NativeListenable, ObjectInterface, Translator
{
    static final class a extends NativeWeakRef
    {

        private ObjectInterfaceFactory factory;

        public final void destroyNativeObject()
        {
            factory.destroyTranslator(nativeObject);
        }

        a(ObjectInterfaceFactory objectinterfacefactory, com.skype.a a1, ReferenceQueue referencequeue, int i)
        {
            super(a1, referencequeue, i);
            factory = objectinterfacefactory;
        }
    }


    private HashSet m_listeners;

    public TranslatorImpl()
    {
        this(((ObjectInterfaceFactory) (SkypeFactory.getInstance())));
    }

    public TranslatorImpl(ObjectInterfaceFactory objectinterfacefactory)
    {
        super(objectinterfacefactory, objectinterfacefactory.createTranslator());
        m_listeners = new HashSet();
        objectinterfacefactory.initializeListener(this);
    }

    private native Translator.DetectTextLanguage_Result detectTextLanguage(byte abyte0[]);

    private native Translator.LookupTranslatorSpeakerVoice_Result lookupTranslatorSpeakerVoice(byte abyte0[], boolean flag);

    private native boolean postTranscribedMessageToCallee(int i, byte abyte0[], byte abyte1[], Translator.TRANSLATOR_RECO_TYPE translator_reco_type);

    private native boolean prepareToTranslate(byte abyte0[], byte abyte1[], byte abyte2[][], byte abyte3[][], byte abyte4[]);

    private native boolean registerTranslatorAppId(byte abyte0[]);

    private native boolean ringTranslated(int i, boolean flag, byte abyte0[], byte abyte1[], boolean flag1, boolean flag2);

    private native boolean setDisclosureTexts(byte abyte0[][], byte abyte1[][]);

    private native Translator.StartTranslatedSession_Result startTranslatedSession(byte abyte0[], byte abyte1[], boolean flag, boolean flag1, Translator.AUDIO_SAMPLING_RATE audio_sampling_rate);

    private native boolean translateText(int i, int j, byte abyte0[], byte abyte1[], byte abyte2[]);

    private native boolean updateLanguage(byte abyte0[]);

    public void addListener(Translator.TranslatorIListener translatorilistener)
    {
        synchronized (m_listeners)
        {
            m_listeners.add(translatorilistener);
        }
        return;
        translatorilistener;
        hashset;
        JVM INSTR monitorexit ;
        throw translatorilistener;
    }

    public NativeWeakRef createNativeWeakRef(ObjectInterfaceFactory objectinterfacefactory, ReferenceQueue referencequeue)
    {
        return new a(objectinterfacefactory, this, referencequeue, m_nativeObject);
    }

    public Translator.DetectTextLanguage_Result detectTextLanguage(String s)
    {
        return detectTextLanguage(NativeStringConvert.ConvertToNativeBytes(s));
    }

    public native boolean endTranslatedSession(int i);

    public native Translator.GetSpeechTranslatorSupportedLanguages_Result getSpeechTranslatorSupportedLanguages();

    public native Translator.GetTextTranslatorSupportedLanguages_Result getTextTranslatorSupportedLanguages();

    public native void initializeListener();

    public Translator.LookupTranslatorSpeakerVoice_Result lookupTranslatorSpeakerVoice()
    {
        return lookupTranslatorSpeakerVoice("", false);
    }

    public Translator.LookupTranslatorSpeakerVoice_Result lookupTranslatorSpeakerVoice(String s)
    {
        return lookupTranslatorSpeakerVoice(s, false);
    }

    public Translator.LookupTranslatorSpeakerVoice_Result lookupTranslatorSpeakerVoice(String s, boolean flag)
    {
        return lookupTranslatorSpeakerVoice(NativeStringConvert.ConvertToNativeBytes(s), flag);
    }

    public boolean muteIncomingTranslatedAudio(int i)
    {
        return muteIncomingTranslatedAudio(i, true);
    }

    public native boolean muteIncomingTranslatedAudio(int i, boolean flag);

    public boolean muteOutgoingTranslatedAudio(int i)
    {
        return muteOutgoingTranslatedAudio(i, true);
    }

    public native boolean muteOutgoingTranslatedAudio(int i, boolean flag);

    public void onTranscribedMessage(int i, int j, byte abyte0[], Translator.TRANSLATOR_RECO_TYPE translator_reco_type, Translator.TRANSLATOR_STATUS translator_status)
    {
        HashSet hashset = m_listeners;
        hashset;
        JVM INSTR monitorenter ;
        for (Iterator iterator = m_listeners.iterator(); iterator.hasNext(); ((Translator.TranslatorIListener)iterator.next()).onTranscribedMessage(this, i, j, NativeStringConvert.ConvertFromNativeBytes(abyte0), translator_reco_type, translator_status)) { }
        break MISSING_BLOCK_LABEL_63;
        abyte0;
        hashset;
        JVM INSTR monitorexit ;
        throw abyte0;
        hashset;
        JVM INSTR monitorexit ;
    }

    public void onTranslatedMessage(int i, int j, byte abyte0[], byte abyte1[], byte abyte2[], byte abyte3[], Translator.TRANSLATOR_STATUS translator_status)
    {
        HashSet hashset = m_listeners;
        hashset;
        JVM INSTR monitorenter ;
        for (Iterator iterator = m_listeners.iterator(); iterator.hasNext(); ((Translator.TranslatorIListener)iterator.next()).onTranslatedMessage(this, i, j, NativeStringConvert.ConvertFromNativeBytes(abyte0), NativeStringConvert.ConvertFromNativeBytes(abyte1), NativeStringConvert.ConvertFromNativeBytes(abyte2), NativeStringConvert.ConvertFromNativeBytes(abyte3), translator_status)) { }
        break MISSING_BLOCK_LABEL_76;
        abyte0;
        hashset;
        JVM INSTR monitorexit ;
        throw abyte0;
        hashset;
        JVM INSTR monitorexit ;
    }

    public void onTranslatedSessionAudio(int i, byte abyte0[], Translator.TRANSLATOR_STATUS translator_status)
    {
        HashSet hashset = m_listeners;
        hashset;
        JVM INSTR monitorenter ;
        for (Iterator iterator = m_listeners.iterator(); iterator.hasNext(); ((Translator.TranslatorIListener)iterator.next()).onTranslatedSessionAudio(this, i, abyte0, translator_status)) { }
        break MISSING_BLOCK_LABEL_56;
        abyte0;
        hashset;
        JVM INSTR monitorexit ;
        throw abyte0;
        hashset;
        JVM INSTR monitorexit ;
    }

    public void onTranslatedSessionText(int i, int j, byte abyte0[], byte abyte1[], Translator.TRANSLATOR_RECO_TYPE translator_reco_type, int k, int l, 
            Translator.TRANSLATOR_STATUS translator_status)
    {
        HashSet hashset = m_listeners;
        hashset;
        JVM INSTR monitorenter ;
        for (Iterator iterator = m_listeners.iterator(); iterator.hasNext(); ((Translator.TranslatorIListener)iterator.next()).onTranslatedSessionText(this, i, j, NativeStringConvert.ConvertFromNativeBytes(abyte0), NativeStringConvert.ConvertFromNativeBytes(abyte1), translator_reco_type, k, l, translator_status)) { }
        break MISSING_BLOCK_LABEL_72;
        abyte0;
        hashset;
        JVM INSTR monitorexit ;
        throw abyte0;
        hashset;
        JVM INSTR monitorexit ;
    }

    public void onTranslatorGlobalStatusChanged(Translator.TRANSLATOR_GLOBAL_STATUS translator_global_status)
    {
        HashSet hashset = m_listeners;
        hashset;
        JVM INSTR monitorenter ;
        for (Iterator iterator = m_listeners.iterator(); iterator.hasNext(); ((Translator.TranslatorIListener)iterator.next()).onTranslatorGlobalStatusChanged(this, translator_global_status)) { }
        break MISSING_BLOCK_LABEL_48;
        translator_global_status;
        hashset;
        JVM INSTR monitorexit ;
        throw translator_global_status;
        hashset;
        JVM INSTR monitorexit ;
    }

    public void onTranslatorStatusChanged(int i, Translator.TRANSLATOR_STATUS translator_status)
    {
        HashSet hashset = m_listeners;
        hashset;
        JVM INSTR monitorenter ;
        for (Iterator iterator = m_listeners.iterator(); iterator.hasNext(); ((Translator.TranslatorIListener)iterator.next()).onTranslatorStatusChanged(this, i, translator_status)) { }
        break MISSING_BLOCK_LABEL_52;
        translator_status;
        hashset;
        JVM INSTR monitorexit ;
        throw translator_status;
        hashset;
        JVM INSTR monitorexit ;
    }

    public boolean postTranscribedMessageToCallee(int i, String s, String s1, Translator.TRANSLATOR_RECO_TYPE translator_reco_type)
    {
        return postTranscribedMessageToCallee(i, NativeStringConvert.ConvertToNativeBytes(s), NativeStringConvert.ConvertToNativeBytes(s1), translator_reco_type);
    }

    public boolean prepareToTranslate(String s, String s1, String as[], String as1[], String s2)
    {
        return prepareToTranslate(NativeStringConvert.ConvertToNativeBytes(s), NativeStringConvert.ConvertToNativeBytes(s1), NativeStringConvert.ConvertArrToNativeByteArr(as), NativeStringConvert.ConvertArrToNativeByteArr(as1), NativeStringConvert.ConvertToNativeBytes(s2));
    }

    public boolean registerTranslatorAppId()
    {
        return registerTranslatorAppId("");
    }

    public boolean registerTranslatorAppId(String s)
    {
        return registerTranslatorAppId(NativeStringConvert.ConvertToNativeBytes(s));
    }

    public void removeListener(Translator.TranslatorIListener translatorilistener)
    {
        synchronized (m_listeners)
        {
            m_listeners.remove(translatorilistener);
        }
        return;
        translatorilistener;
        hashset;
        JVM INSTR monitorexit ;
        throw translatorilistener;
    }

    public boolean ringTranslated(int i)
    {
        return ringTranslated(i, false, "", "", false, false);
    }

    public boolean ringTranslated(int i, boolean flag)
    {
        return ringTranslated(i, flag, "", "", false, false);
    }

    public boolean ringTranslated(int i, boolean flag, String s)
    {
        return ringTranslated(i, flag, s, "", false, false);
    }

    public boolean ringTranslated(int i, boolean flag, String s, String s1)
    {
        return ringTranslated(i, flag, s, s1, false, false);
    }

    public boolean ringTranslated(int i, boolean flag, String s, String s1, boolean flag1)
    {
        return ringTranslated(i, flag, s, s1, flag1, false);
    }

    public boolean ringTranslated(int i, boolean flag, String s, String s1, boolean flag1, boolean flag2)
    {
        return ringTranslated(i, flag, NativeStringConvert.ConvertToNativeBytes(s), NativeStringConvert.ConvertToNativeBytes(s1), flag1, flag2);
    }

    public boolean setDisclosureTexts(String as[], String as1[])
    {
        return setDisclosureTexts(NativeStringConvert.ConvertArrToNativeByteArr(as), NativeStringConvert.ConvertArrToNativeByteArr(as1));
    }

    public native boolean startAudioStream(int i, Translator.AUDIO_SAMPLING_RATE audio_sampling_rate);

    public Translator.StartTranslatedSession_Result startTranslatedSession()
    {
        return startTranslatedSession("", "", true, false, Translator.AUDIO_SAMPLING_RATE.SAMPLING_RATE_16K);
    }

    public Translator.StartTranslatedSession_Result startTranslatedSession(String s)
    {
        return startTranslatedSession(s, "", true, false, Translator.AUDIO_SAMPLING_RATE.SAMPLING_RATE_16K);
    }

    public Translator.StartTranslatedSession_Result startTranslatedSession(String s, String s1)
    {
        return startTranslatedSession(s, s1, true, false, Translator.AUDIO_SAMPLING_RATE.SAMPLING_RATE_16K);
    }

    public Translator.StartTranslatedSession_Result startTranslatedSession(String s, String s1, boolean flag)
    {
        return startTranslatedSession(s, s1, flag, false, Translator.AUDIO_SAMPLING_RATE.SAMPLING_RATE_16K);
    }

    public Translator.StartTranslatedSession_Result startTranslatedSession(String s, String s1, boolean flag, boolean flag1)
    {
        return startTranslatedSession(s, s1, flag, flag1, Translator.AUDIO_SAMPLING_RATE.SAMPLING_RATE_16K);
    }

    public Translator.StartTranslatedSession_Result startTranslatedSession(String s, String s1, boolean flag, boolean flag1, Translator.AUDIO_SAMPLING_RATE audio_sampling_rate)
    {
        return startTranslatedSession(NativeStringConvert.ConvertToNativeBytes(s), NativeStringConvert.ConvertToNativeBytes(s1), flag, flag1, audio_sampling_rate);
    }

    public native boolean submitAudioChunk(int i, Translator.AUDIO_SAMPLING_RATE audio_sampling_rate, byte abyte0[]);

    public boolean translateText(int i, int j, String s, String s1)
    {
        return translateText(i, j, s, s1, "");
    }

    public boolean translateText(int i, int j, String s, String s1, String s2)
    {
        return translateText(i, j, NativeStringConvert.ConvertToNativeBytes(s), NativeStringConvert.ConvertToNativeBytes(s1), NativeStringConvert.ConvertToNativeBytes(s2));
    }

    public boolean updateLanguage(String s)
    {
        return updateLanguage(NativeStringConvert.ConvertToNativeBytes(s));
    }
}
