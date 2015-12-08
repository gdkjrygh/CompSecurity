// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.gen;

import com.skype.ObjectInterface;
import com.skype.PROPKEY;
import com.skype.Translator;
import com.skype.android.event.EventBus;
import com.skype.android.event.EventBusInstance;

public class TranslatorListener
    implements com.skype.ObjectInterface.ObjectInterfaceIListener, com.skype.Translator.TranslatorIListener
{
    public static class OnPropertyChange
    {

        private PROPKEY _propKey;
        private ObjectInterface _sender;

        public PROPKEY getPropKey()
        {
            return _propKey;
        }

        public ObjectInterface getSender()
        {
            return _sender;
        }

        public OnPropertyChange(ObjectInterface objectinterface, PROPKEY propkey)
        {
            _sender = objectinterface;
            _propKey = propkey;
        }
    }

    public static class OnTranscribedMessage
    {

        private int _convId;
        private int _msgId;
        private com.skype.Translator.TRANSLATOR_RECO_TYPE _recotype;
        private Translator _sender;
        private com.skype.Translator.TRANSLATOR_STATUS _status;
        private String _text;

        public int getConvId()
        {
            return _convId;
        }

        public int getMsgId()
        {
            return _msgId;
        }

        public com.skype.Translator.TRANSLATOR_RECO_TYPE getRecotype()
        {
            return _recotype;
        }

        public Translator getSender()
        {
            return _sender;
        }

        public com.skype.Translator.TRANSLATOR_STATUS getStatus()
        {
            return _status;
        }

        public String getText()
        {
            return _text;
        }

        public OnTranscribedMessage(Translator translator, int i, int j, String s, com.skype.Translator.TRANSLATOR_RECO_TYPE translator_reco_type, com.skype.Translator.TRANSLATOR_STATUS translator_status)
        {
            _sender = translator;
            _msgId = i;
            _convId = j;
            _text = s;
            _recotype = translator_reco_type;
            _status = translator_status;
        }
    }

    public static class OnTranslatedMessage
    {

        private int _convId;
        private int _msgId;
        private String _origLang;
        private String _origText;
        private Translator _sender;
        private com.skype.Translator.TRANSLATOR_STATUS _status;
        private String _transLang;
        private String _transText;

        public int getConvId()
        {
            return _convId;
        }

        public int getMsgId()
        {
            return _msgId;
        }

        public String getOrigLang()
        {
            return _origLang;
        }

        public String getOrigText()
        {
            return _origText;
        }

        public Translator getSender()
        {
            return _sender;
        }

        public com.skype.Translator.TRANSLATOR_STATUS getStatus()
        {
            return _status;
        }

        public String getTransLang()
        {
            return _transLang;
        }

        public String getTransText()
        {
            return _transText;
        }

        public OnTranslatedMessage(Translator translator, int i, int j, String s, String s1, String s2, String s3, 
                com.skype.Translator.TRANSLATOR_STATUS translator_status)
        {
            _sender = translator;
            _msgId = i;
            _convId = j;
            _origText = s;
            _origLang = s1;
            _transText = s2;
            _transLang = s3;
            _status = translator_status;
        }
    }

    public static class OnTranslatedSessionAudio
    {

        private byte _audioChunk[];
        private Translator _sender;
        private com.skype.Translator.TRANSLATOR_STATUS _status;
        private int _transSessionId;

        public byte[] getAudioChunk()
        {
            return _audioChunk;
        }

        public Translator getSender()
        {
            return _sender;
        }

        public com.skype.Translator.TRANSLATOR_STATUS getStatus()
        {
            return _status;
        }

        public int getTransSessionId()
        {
            return _transSessionId;
        }

        public OnTranslatedSessionAudio(Translator translator, int i, byte abyte0[], com.skype.Translator.TRANSLATOR_STATUS translator_status)
        {
            _sender = translator;
            _transSessionId = i;
            _audioChunk = abyte0;
            _status = translator_status;
        }
    }

    public static class OnTranslatedSessionText
    {

        private int _durationInMilliSec;
        private int _offsetInMilliSec;
        private String _origText;
        private int _recoId;
        private com.skype.Translator.TRANSLATOR_RECO_TYPE _recotype;
        private Translator _sender;
        private com.skype.Translator.TRANSLATOR_STATUS _status;
        private int _transSessionId;
        private String _transText;

        public int getDurationInMilliSec()
        {
            return _durationInMilliSec;
        }

        public int getOffsetInMilliSec()
        {
            return _offsetInMilliSec;
        }

        public String getOrigText()
        {
            return _origText;
        }

        public int getRecoId()
        {
            return _recoId;
        }

        public com.skype.Translator.TRANSLATOR_RECO_TYPE getRecotype()
        {
            return _recotype;
        }

        public Translator getSender()
        {
            return _sender;
        }

        public com.skype.Translator.TRANSLATOR_STATUS getStatus()
        {
            return _status;
        }

        public int getTransSessionId()
        {
            return _transSessionId;
        }

        public String getTransText()
        {
            return _transText;
        }

        public OnTranslatedSessionText(Translator translator, int i, int j, String s, String s1, com.skype.Translator.TRANSLATOR_RECO_TYPE translator_reco_type, int k, 
                int l, com.skype.Translator.TRANSLATOR_STATUS translator_status)
        {
            _sender = translator;
            _transSessionId = i;
            _recoId = j;
            _origText = s;
            _transText = s1;
            _recotype = translator_reco_type;
            _offsetInMilliSec = k;
            _durationInMilliSec = l;
            _status = translator_status;
        }
    }

    public static class OnTranslatorGlobalStatusChanged
    {

        private Translator _sender;
        private com.skype.Translator.TRANSLATOR_GLOBAL_STATUS _status;

        public Translator getSender()
        {
            return _sender;
        }

        public com.skype.Translator.TRANSLATOR_GLOBAL_STATUS getStatus()
        {
            return _status;
        }

        public OnTranslatorGlobalStatusChanged(Translator translator, com.skype.Translator.TRANSLATOR_GLOBAL_STATUS translator_global_status)
        {
            _sender = translator;
            _status = translator_global_status;
        }
    }

    public static class OnTranslatorStatusChanged
    {

        private int _convId;
        private Translator _sender;
        private com.skype.Translator.TRANSLATOR_STATUS _status;

        public int getConvId()
        {
            return _convId;
        }

        public Translator getSender()
        {
            return _sender;
        }

        public com.skype.Translator.TRANSLATOR_STATUS getStatus()
        {
            return _status;
        }

        public OnTranslatorStatusChanged(Translator translator, int i, com.skype.Translator.TRANSLATOR_STATUS translator_status)
        {
            _sender = translator;
            _convId = i;
            _status = translator_status;
        }
    }


    EventBus eventBus;

    public TranslatorListener()
    {
        eventBus = EventBusInstance.a();
    }

    public void onPropertyChange(ObjectInterface objectinterface, PROPKEY propkey)
    {
        objectinterface = new OnPropertyChange(objectinterface, propkey);
        eventBus.a(objectinterface);
    }

    public void onTranscribedMessage(Translator translator, int i, int j, String s, com.skype.Translator.TRANSLATOR_RECO_TYPE translator_reco_type, com.skype.Translator.TRANSLATOR_STATUS translator_status)
    {
        translator = new OnTranscribedMessage(translator, i, j, s, translator_reco_type, translator_status);
        eventBus.a(translator);
    }

    public void onTranslatedMessage(Translator translator, int i, int j, String s, String s1, String s2, String s3, 
            com.skype.Translator.TRANSLATOR_STATUS translator_status)
    {
        translator = new OnTranslatedMessage(translator, i, j, s, s1, s2, s3, translator_status);
        eventBus.a(translator);
    }

    public void onTranslatedSessionAudio(Translator translator, int i, byte abyte0[], com.skype.Translator.TRANSLATOR_STATUS translator_status)
    {
        translator = new OnTranslatedSessionAudio(translator, i, abyte0, translator_status);
        eventBus.a(translator);
    }

    public void onTranslatedSessionText(Translator translator, int i, int j, String s, String s1, com.skype.Translator.TRANSLATOR_RECO_TYPE translator_reco_type, int k, 
            int l, com.skype.Translator.TRANSLATOR_STATUS translator_status)
    {
        translator = new OnTranslatedSessionText(translator, i, j, s, s1, translator_reco_type, k, l, translator_status);
        eventBus.a(translator);
    }

    public void onTranslatorGlobalStatusChanged(Translator translator, com.skype.Translator.TRANSLATOR_GLOBAL_STATUS translator_global_status)
    {
        translator = new OnTranslatorGlobalStatusChanged(translator, translator_global_status);
        eventBus.a(translator);
    }

    public void onTranslatorStatusChanged(Translator translator, int i, com.skype.Translator.TRANSLATOR_STATUS translator_status)
    {
        translator = new OnTranslatorStatusChanged(translator, i, translator_status);
        eventBus.a(translator);
    }
}
