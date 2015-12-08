// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype;

import android.support.v4.util.j;

// Referenced classes of package com.skype:
//            ObjectInterface, NativeStringConvert

public interface Translator
    extends ObjectInterface
{
    public static final class AUDIO_SAMPLING_RATE extends Enum
    {

        private static final AUDIO_SAMPLING_RATE $VALUES[];
        public static final AUDIO_SAMPLING_RATE SAMPLING_RATE_16K;
        public static final AUDIO_SAMPLING_RATE SAMPLING_RATE_24K;
        public static final AUDIO_SAMPLING_RATE SAMPLING_RATE_8K;
        public static final AUDIO_SAMPLING_RATE WRAPPER_UNKNOWN_VALUE;
        private static final j intToTypeMap;
        private final int value;

        public static AUDIO_SAMPLING_RATE fromInt(int i)
        {
            AUDIO_SAMPLING_RATE audio_sampling_rate = (AUDIO_SAMPLING_RATE)intToTypeMap.a(i);
            if (audio_sampling_rate != null)
            {
                return audio_sampling_rate;
            } else
            {
                return WRAPPER_UNKNOWN_VALUE;
            }
        }

        public static AUDIO_SAMPLING_RATE valueOf(String s)
        {
            return (AUDIO_SAMPLING_RATE)Enum.valueOf(com/skype/Translator$AUDIO_SAMPLING_RATE, s);
        }

        public static AUDIO_SAMPLING_RATE[] values()
        {
            return (AUDIO_SAMPLING_RATE[])$VALUES.clone();
        }

        public final int toInt()
        {
            return value;
        }

        static 
        {
            SAMPLING_RATE_8K = new AUDIO_SAMPLING_RATE("SAMPLING_RATE_8K", 0, 0);
            SAMPLING_RATE_16K = new AUDIO_SAMPLING_RATE("SAMPLING_RATE_16K", 1, 1);
            SAMPLING_RATE_24K = new AUDIO_SAMPLING_RATE("SAMPLING_RATE_24K", 2, 2);
            WRAPPER_UNKNOWN_VALUE = new AUDIO_SAMPLING_RATE("WRAPPER_UNKNOWN_VALUE", 3, 0x7fffffff);
            $VALUES = (new AUDIO_SAMPLING_RATE[] {
                SAMPLING_RATE_8K, SAMPLING_RATE_16K, SAMPLING_RATE_24K, WRAPPER_UNKNOWN_VALUE
            });
            intToTypeMap = new j();
            AUDIO_SAMPLING_RATE aaudio_sampling_rate[] = values();
            int k = aaudio_sampling_rate.length;
            for (int i = 0; i < k; i++)
            {
                AUDIO_SAMPLING_RATE audio_sampling_rate = aaudio_sampling_rate[i];
                intToTypeMap.a(audio_sampling_rate.value, audio_sampling_rate);
            }

        }

        private AUDIO_SAMPLING_RATE(String s, int i, int k)
        {
            super(s, i);
            value = k;
        }
    }

    public static class DetectTextLanguage_Result
    {

        public String m_detectedLanguage;
        public boolean m_return;

        public void init(byte abyte0[], boolean flag)
        {
            m_detectedLanguage = NativeStringConvert.ConvertFromNativeBytes(abyte0);
            m_return = flag;
        }

        public DetectTextLanguage_Result()
        {
        }
    }

    public static class GetSpeechTranslatorSupportedLanguages_Result
    {

        public String m_codeList[];
        public String m_nameList[];
        public boolean m_return;

        public void init(byte abyte0[][], byte abyte1[][], boolean flag)
        {
            m_codeList = NativeStringConvert.ConvertFromNativeStringArray(abyte0);
            m_nameList = NativeStringConvert.ConvertFromNativeStringArray(abyte1);
            m_return = flag;
        }

        public GetSpeechTranslatorSupportedLanguages_Result()
        {
        }
    }

    public static class GetTextTranslatorSupportedLanguages_Result
    {

        public String m_codeList[];
        public String m_namesList[];
        public boolean m_return;

        public void init(byte abyte0[][], byte abyte1[][], boolean flag)
        {
            m_codeList = NativeStringConvert.ConvertFromNativeStringArray(abyte0);
            m_namesList = NativeStringConvert.ConvertFromNativeStringArray(abyte1);
            m_return = flag;
        }

        public GetTextTranslatorSupportedLanguages_Result()
        {
        }
    }

    public static class LookupTranslatorSpeakerVoice_Result
    {

        public boolean m_return;
        public String m_speakerVoice;

        public void init(byte abyte0[], boolean flag)
        {
            m_speakerVoice = NativeStringConvert.ConvertFromNativeBytes(abyte0);
            m_return = flag;
        }

        public LookupTranslatorSpeakerVoice_Result()
        {
        }
    }

    public static class StartTranslatedSession_Result
    {

        public boolean m_return;
        public int m_transSessionId;

        public void init(int i, boolean flag)
        {
            m_transSessionId = i;
            m_return = flag;
        }

        public StartTranslatedSession_Result()
        {
        }
    }

    public static final class TRANSLATOR_GLOBAL_STATUS extends Enum
    {

        private static final TRANSLATOR_GLOBAL_STATUS $VALUES[];
        public static final TRANSLATOR_GLOBAL_STATUS TRANSLATOR_GLOBALSTATUS_INITFAILED;
        public static final TRANSLATOR_GLOBAL_STATUS TRANSLATOR_GLOBALSTATUS_INITIALIZING;
        public static final TRANSLATOR_GLOBAL_STATUS TRANSLATOR_GLOBALSTATUS_NOTREADY;
        public static final TRANSLATOR_GLOBAL_STATUS TRANSLATOR_GLOBALSTATUS_READY;
        public static final TRANSLATOR_GLOBAL_STATUS WRAPPER_UNKNOWN_VALUE;
        private static final j intToTypeMap;
        private final int value;

        public static TRANSLATOR_GLOBAL_STATUS fromInt(int i)
        {
            TRANSLATOR_GLOBAL_STATUS translator_global_status = (TRANSLATOR_GLOBAL_STATUS)intToTypeMap.a(i);
            if (translator_global_status != null)
            {
                return translator_global_status;
            } else
            {
                return WRAPPER_UNKNOWN_VALUE;
            }
        }

        public static TRANSLATOR_GLOBAL_STATUS valueOf(String s)
        {
            return (TRANSLATOR_GLOBAL_STATUS)Enum.valueOf(com/skype/Translator$TRANSLATOR_GLOBAL_STATUS, s);
        }

        public static TRANSLATOR_GLOBAL_STATUS[] values()
        {
            return (TRANSLATOR_GLOBAL_STATUS[])$VALUES.clone();
        }

        public final int toInt()
        {
            return value;
        }

        static 
        {
            TRANSLATOR_GLOBALSTATUS_NOTREADY = new TRANSLATOR_GLOBAL_STATUS("TRANSLATOR_GLOBALSTATUS_NOTREADY", 0, 0);
            TRANSLATOR_GLOBALSTATUS_INITIALIZING = new TRANSLATOR_GLOBAL_STATUS("TRANSLATOR_GLOBALSTATUS_INITIALIZING", 1, 1);
            TRANSLATOR_GLOBALSTATUS_READY = new TRANSLATOR_GLOBAL_STATUS("TRANSLATOR_GLOBALSTATUS_READY", 2, 2);
            TRANSLATOR_GLOBALSTATUS_INITFAILED = new TRANSLATOR_GLOBAL_STATUS("TRANSLATOR_GLOBALSTATUS_INITFAILED", 3, 3);
            WRAPPER_UNKNOWN_VALUE = new TRANSLATOR_GLOBAL_STATUS("WRAPPER_UNKNOWN_VALUE", 4, 0x7fffffff);
            $VALUES = (new TRANSLATOR_GLOBAL_STATUS[] {
                TRANSLATOR_GLOBALSTATUS_NOTREADY, TRANSLATOR_GLOBALSTATUS_INITIALIZING, TRANSLATOR_GLOBALSTATUS_READY, TRANSLATOR_GLOBALSTATUS_INITFAILED, WRAPPER_UNKNOWN_VALUE
            });
            intToTypeMap = new j();
            TRANSLATOR_GLOBAL_STATUS atranslator_global_status[] = values();
            int k = atranslator_global_status.length;
            for (int i = 0; i < k; i++)
            {
                TRANSLATOR_GLOBAL_STATUS translator_global_status = atranslator_global_status[i];
                intToTypeMap.a(translator_global_status.value, translator_global_status);
            }

        }

        private TRANSLATOR_GLOBAL_STATUS(String s, int i, int k)
        {
            super(s, i);
            value = k;
        }
    }

    public static final class TRANSLATOR_RECO_TYPE extends Enum
    {

        private static final TRANSLATOR_RECO_TYPE $VALUES[];
        public static final TRANSLATOR_RECO_TYPE RECO_FULL;
        public static final TRANSLATOR_RECO_TYPE RECO_PARTIAL;
        public static final TRANSLATOR_RECO_TYPE RECO_UNKNOWN;
        public static final TRANSLATOR_RECO_TYPE WRAPPER_UNKNOWN_VALUE;
        private static final j intToTypeMap;
        private final int value;

        public static TRANSLATOR_RECO_TYPE fromInt(int i)
        {
            TRANSLATOR_RECO_TYPE translator_reco_type = (TRANSLATOR_RECO_TYPE)intToTypeMap.a(i);
            if (translator_reco_type != null)
            {
                return translator_reco_type;
            } else
            {
                return WRAPPER_UNKNOWN_VALUE;
            }
        }

        public static TRANSLATOR_RECO_TYPE valueOf(String s)
        {
            return (TRANSLATOR_RECO_TYPE)Enum.valueOf(com/skype/Translator$TRANSLATOR_RECO_TYPE, s);
        }

        public static TRANSLATOR_RECO_TYPE[] values()
        {
            return (TRANSLATOR_RECO_TYPE[])$VALUES.clone();
        }

        public final int toInt()
        {
            return value;
        }

        static 
        {
            RECO_UNKNOWN = new TRANSLATOR_RECO_TYPE("RECO_UNKNOWN", 0, 0);
            RECO_PARTIAL = new TRANSLATOR_RECO_TYPE("RECO_PARTIAL", 1, 1);
            RECO_FULL = new TRANSLATOR_RECO_TYPE("RECO_FULL", 2, 2);
            WRAPPER_UNKNOWN_VALUE = new TRANSLATOR_RECO_TYPE("WRAPPER_UNKNOWN_VALUE", 3, 0x7fffffff);
            $VALUES = (new TRANSLATOR_RECO_TYPE[] {
                RECO_UNKNOWN, RECO_PARTIAL, RECO_FULL, WRAPPER_UNKNOWN_VALUE
            });
            intToTypeMap = new j();
            TRANSLATOR_RECO_TYPE atranslator_reco_type[] = values();
            int k = atranslator_reco_type.length;
            for (int i = 0; i < k; i++)
            {
                TRANSLATOR_RECO_TYPE translator_reco_type = atranslator_reco_type[i];
                intToTypeMap.a(translator_reco_type.value, translator_reco_type);
            }

        }

        private TRANSLATOR_RECO_TYPE(String s, int i, int k)
        {
            super(s, i);
            value = k;
        }
    }

    public static final class TRANSLATOR_RESERVED_MSGID extends Enum
    {

        private static final TRANSLATOR_RESERVED_MSGID $VALUES[];
        public static final TRANSLATOR_RESERVED_MSGID MSGID_FORCALLEE_ORIG;
        public static final TRANSLATOR_RESERVED_MSGID MSGID_FORCALLEE_TRANSLATED;
        public static final TRANSLATOR_RESERVED_MSGID MSGID_FORCALLER_ORIG;
        public static final TRANSLATOR_RESERVED_MSGID MSGID_FORCALLER_TRANSLATED;
        public static final TRANSLATOR_RESERVED_MSGID WRAPPER_UNKNOWN_VALUE;
        private static final j intToTypeMap;
        private final int value;

        public static TRANSLATOR_RESERVED_MSGID fromInt(int i)
        {
            TRANSLATOR_RESERVED_MSGID translator_reserved_msgid = (TRANSLATOR_RESERVED_MSGID)intToTypeMap.a(i);
            if (translator_reserved_msgid != null)
            {
                return translator_reserved_msgid;
            } else
            {
                return WRAPPER_UNKNOWN_VALUE;
            }
        }

        public static TRANSLATOR_RESERVED_MSGID valueOf(String s)
        {
            return (TRANSLATOR_RESERVED_MSGID)Enum.valueOf(com/skype/Translator$TRANSLATOR_RESERVED_MSGID, s);
        }

        public static TRANSLATOR_RESERVED_MSGID[] values()
        {
            return (TRANSLATOR_RESERVED_MSGID[])$VALUES.clone();
        }

        public final int toInt()
        {
            return value;
        }

        static 
        {
            MSGID_FORCALLER_ORIG = new TRANSLATOR_RESERVED_MSGID("MSGID_FORCALLER_ORIG", 0, -1);
            MSGID_FORCALLEE_ORIG = new TRANSLATOR_RESERVED_MSGID("MSGID_FORCALLEE_ORIG", 1, -2);
            MSGID_FORCALLER_TRANSLATED = new TRANSLATOR_RESERVED_MSGID("MSGID_FORCALLER_TRANSLATED", 2, -3);
            MSGID_FORCALLEE_TRANSLATED = new TRANSLATOR_RESERVED_MSGID("MSGID_FORCALLEE_TRANSLATED", 3, -4);
            WRAPPER_UNKNOWN_VALUE = new TRANSLATOR_RESERVED_MSGID("WRAPPER_UNKNOWN_VALUE", 4, 0x7fffffff);
            $VALUES = (new TRANSLATOR_RESERVED_MSGID[] {
                MSGID_FORCALLER_ORIG, MSGID_FORCALLEE_ORIG, MSGID_FORCALLER_TRANSLATED, MSGID_FORCALLEE_TRANSLATED, WRAPPER_UNKNOWN_VALUE
            });
            intToTypeMap = new j();
            TRANSLATOR_RESERVED_MSGID atranslator_reserved_msgid[] = values();
            int k = atranslator_reserved_msgid.length;
            for (int i = 0; i < k; i++)
            {
                TRANSLATOR_RESERVED_MSGID translator_reserved_msgid = atranslator_reserved_msgid[i];
                intToTypeMap.a(translator_reserved_msgid.value, translator_reserved_msgid);
            }

        }

        private TRANSLATOR_RESERVED_MSGID(String s, int i, int k)
        {
            super(s, i);
            value = k;
        }
    }

    public static final class TRANSLATOR_STATUS extends Enum
    {

        private static final TRANSLATOR_STATUS $VALUES[];
        public static final TRANSLATOR_STATUS TRANSLATOR_CONNECTED;
        public static final TRANSLATOR_STATUS TRANSLATOR_CONNECTING;
        public static final TRANSLATOR_STATUS TRANSLATOR_CONNECT_FAILED_AUTH;
        public static final TRANSLATOR_STATUS TRANSLATOR_CONNECT_FAILED_SESSION;
        public static final TRANSLATOR_STATUS TRANSLATOR_CONNECT_FAILED_SVC;
        public static final TRANSLATOR_STATUS TRANSLATOR_CONNECT_TIMEOUT;
        public static final TRANSLATOR_STATUS TRANSLATOR_DISCONNECTED;
        public static final TRANSLATOR_STATUS TRANSLATOR_NOTUSED;
        public static final TRANSLATOR_STATUS TRANSLATOR_RECONNECTING;
        public static final TRANSLATOR_STATUS TRANSLATOR_RECONNECT_FAILED;
        public static final TRANSLATOR_STATUS WRAPPER_UNKNOWN_VALUE;
        private static final j intToTypeMap;
        private final int value;

        public static TRANSLATOR_STATUS fromInt(int i)
        {
            TRANSLATOR_STATUS translator_status = (TRANSLATOR_STATUS)intToTypeMap.a(i);
            if (translator_status != null)
            {
                return translator_status;
            } else
            {
                return WRAPPER_UNKNOWN_VALUE;
            }
        }

        public static TRANSLATOR_STATUS valueOf(String s)
        {
            return (TRANSLATOR_STATUS)Enum.valueOf(com/skype/Translator$TRANSLATOR_STATUS, s);
        }

        public static TRANSLATOR_STATUS[] values()
        {
            return (TRANSLATOR_STATUS[])$VALUES.clone();
        }

        public final int toInt()
        {
            return value;
        }

        static 
        {
            TRANSLATOR_NOTUSED = new TRANSLATOR_STATUS("TRANSLATOR_NOTUSED", 0, 0);
            TRANSLATOR_CONNECTING = new TRANSLATOR_STATUS("TRANSLATOR_CONNECTING", 1, 1);
            TRANSLATOR_CONNECTED = new TRANSLATOR_STATUS("TRANSLATOR_CONNECTED", 2, 2);
            TRANSLATOR_RECONNECTING = new TRANSLATOR_STATUS("TRANSLATOR_RECONNECTING", 3, 3);
            TRANSLATOR_CONNECT_FAILED_AUTH = new TRANSLATOR_STATUS("TRANSLATOR_CONNECT_FAILED_AUTH", 4, 4);
            TRANSLATOR_CONNECT_FAILED_SVC = new TRANSLATOR_STATUS("TRANSLATOR_CONNECT_FAILED_SVC", 5, 5);
            TRANSLATOR_CONNECT_TIMEOUT = new TRANSLATOR_STATUS("TRANSLATOR_CONNECT_TIMEOUT", 6, 6);
            TRANSLATOR_CONNECT_FAILED_SESSION = new TRANSLATOR_STATUS("TRANSLATOR_CONNECT_FAILED_SESSION", 7, 7);
            TRANSLATOR_RECONNECT_FAILED = new TRANSLATOR_STATUS("TRANSLATOR_RECONNECT_FAILED", 8, 8);
            TRANSLATOR_DISCONNECTED = new TRANSLATOR_STATUS("TRANSLATOR_DISCONNECTED", 9, 9);
            WRAPPER_UNKNOWN_VALUE = new TRANSLATOR_STATUS("WRAPPER_UNKNOWN_VALUE", 10, 0x7fffffff);
            $VALUES = (new TRANSLATOR_STATUS[] {
                TRANSLATOR_NOTUSED, TRANSLATOR_CONNECTING, TRANSLATOR_CONNECTED, TRANSLATOR_RECONNECTING, TRANSLATOR_CONNECT_FAILED_AUTH, TRANSLATOR_CONNECT_FAILED_SVC, TRANSLATOR_CONNECT_TIMEOUT, TRANSLATOR_CONNECT_FAILED_SESSION, TRANSLATOR_RECONNECT_FAILED, TRANSLATOR_DISCONNECTED, 
                WRAPPER_UNKNOWN_VALUE
            });
            intToTypeMap = new j();
            TRANSLATOR_STATUS atranslator_status[] = values();
            int k = atranslator_status.length;
            for (int i = 0; i < k; i++)
            {
                TRANSLATOR_STATUS translator_status = atranslator_status[i];
                intToTypeMap.a(translator_status.value, translator_status);
            }

        }

        private TRANSLATOR_STATUS(String s, int i, int k)
        {
            super(s, i);
            value = k;
        }
    }

    public static interface TranslatorIListener
    {

        public abstract void onTranscribedMessage(Translator translator, int i, int j, String s, TRANSLATOR_RECO_TYPE translator_reco_type, TRANSLATOR_STATUS translator_status);

        public abstract void onTranslatedMessage(Translator translator, int i, int j, String s, String s1, String s2, String s3, 
                TRANSLATOR_STATUS translator_status);

        public abstract void onTranslatedSessionAudio(Translator translator, int i, byte abyte0[], TRANSLATOR_STATUS translator_status);

        public abstract void onTranslatedSessionText(Translator translator, int i, int j, String s, String s1, TRANSLATOR_RECO_TYPE translator_reco_type, int k, 
                int l, TRANSLATOR_STATUS translator_status);

        public abstract void onTranslatorGlobalStatusChanged(Translator translator, TRANSLATOR_GLOBAL_STATUS translator_global_status);

        public abstract void onTranslatorStatusChanged(Translator translator, int i, TRANSLATOR_STATUS translator_status);
    }


    public abstract void addListener(TranslatorIListener translatorilistener);

    public abstract DetectTextLanguage_Result detectTextLanguage(String s);

    public abstract boolean endTranslatedSession(int i);

    public abstract GetSpeechTranslatorSupportedLanguages_Result getSpeechTranslatorSupportedLanguages();

    public abstract GetTextTranslatorSupportedLanguages_Result getTextTranslatorSupportedLanguages();

    public abstract LookupTranslatorSpeakerVoice_Result lookupTranslatorSpeakerVoice();

    public abstract LookupTranslatorSpeakerVoice_Result lookupTranslatorSpeakerVoice(String s);

    public abstract LookupTranslatorSpeakerVoice_Result lookupTranslatorSpeakerVoice(String s, boolean flag);

    public abstract boolean muteIncomingTranslatedAudio(int i);

    public abstract boolean muteIncomingTranslatedAudio(int i, boolean flag);

    public abstract boolean muteOutgoingTranslatedAudio(int i);

    public abstract boolean muteOutgoingTranslatedAudio(int i, boolean flag);

    public abstract boolean postTranscribedMessageToCallee(int i, String s, String s1, TRANSLATOR_RECO_TYPE translator_reco_type);

    public abstract boolean prepareToTranslate(String s, String s1, String as[], String as1[], String s2);

    public abstract boolean registerTranslatorAppId();

    public abstract boolean registerTranslatorAppId(String s);

    public abstract void removeListener(TranslatorIListener translatorilistener);

    public abstract boolean ringTranslated(int i);

    public abstract boolean ringTranslated(int i, boolean flag);

    public abstract boolean ringTranslated(int i, boolean flag, String s);

    public abstract boolean ringTranslated(int i, boolean flag, String s, String s1);

    public abstract boolean ringTranslated(int i, boolean flag, String s, String s1, boolean flag1);

    public abstract boolean ringTranslated(int i, boolean flag, String s, String s1, boolean flag1, boolean flag2);

    public abstract boolean setDisclosureTexts(String as[], String as1[]);

    public abstract boolean startAudioStream(int i, AUDIO_SAMPLING_RATE audio_sampling_rate);

    public abstract StartTranslatedSession_Result startTranslatedSession();

    public abstract StartTranslatedSession_Result startTranslatedSession(String s);

    public abstract StartTranslatedSession_Result startTranslatedSession(String s, String s1);

    public abstract StartTranslatedSession_Result startTranslatedSession(String s, String s1, boolean flag);

    public abstract StartTranslatedSession_Result startTranslatedSession(String s, String s1, boolean flag, boolean flag1);

    public abstract StartTranslatedSession_Result startTranslatedSession(String s, String s1, boolean flag, boolean flag1, AUDIO_SAMPLING_RATE audio_sampling_rate);

    public abstract boolean submitAudioChunk(int i, AUDIO_SAMPLING_RATE audio_sampling_rate, byte abyte0[]);

    public abstract boolean translateText(int i, int j, String s, String s1);

    public abstract boolean translateText(int i, int j, String s, String s1, String s2);

    public abstract boolean updateLanguage(String s);
}
