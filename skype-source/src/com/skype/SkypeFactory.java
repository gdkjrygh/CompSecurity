// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype;


// Referenced classes of package com.skype:
//            ObjectInterfaceFactory, NativeStringConvert, NativeListenable

public class SkypeFactory
    implements ObjectInterfaceFactory
{

    private static volatile SkypeFactory instance;

    public SkypeFactory()
    {
    }

    private native int createMetatagString(int i, byte abyte0[]);

    private native int createSkyLibString(byte abyte0[], boolean flag, boolean flag1);

    private native int createSkyLibString(byte abyte0[], byte abyte1[], boolean flag, boolean flag1);

    private native int createTermString(int i, Term.CONDITION condition, byte abyte0[]);

    public static SkypeFactory getInstance()
    {
        if (instance != null) goto _L2; else goto _L1
_L1:
        com/skype/SkypeFactory;
        JVM INSTR monitorenter ;
        instance = new SkypeFactory();
        com/skype/SkypeFactory;
        JVM INSTR monitorexit ;
_L2:
        return instance;
        Exception exception;
        exception;
        com/skype/SkypeFactory;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public native int createAccessSession();

    public native int createAccount();

    public native int createAlert();

    public native int createContact();

    public native int createContactGroup();

    public native int createContactSearch();

    public native int createContentItem();

    public native int createConversation();

    public native int createMediaDocument();

    public native int createMessage();

    public native int createMessageAnnotation();

    public native int createMetatag();

    public native int createMetatag(int i, long l);

    public int createMetatag(int i, String s)
    {
        return createMetatagString(i, NativeStringConvert.ConvertToNativeBytes(s));
    }

    public native int createMetatag(int i, byte abyte0[]);

    public native int createObjectInterface();

    public native int createParticipant();

    public native int createPriceQuote();

    public native int createProptable();

    public native int createSearch(Search.TARGET target, int i);

    public int createSkyLib(String s, String s1, boolean flag, boolean flag1)
    {
        return createSkyLibString(NativeStringConvert.ConvertToNativeBytes(s), NativeStringConvert.ConvertToNativeBytes(s1), flag, flag1);
    }

    public int createSkyLib(String s, boolean flag, boolean flag1)
    {
        return createSkyLibString(NativeStringConvert.ConvertToNativeBytes(s), flag, flag1);
    }

    public native int createSms();

    public native int createTerm();

    public native int createTerm(int i, Term.CONDITION condition, long l);

    public int createTerm(int i, Term.CONDITION condition, String s)
    {
        return createTermString(i, condition, NativeStringConvert.ConvertToNativeBytes(s));
    }

    public native int createTerm(int i, Term.CONDITION condition, byte abyte0[]);

    public native int createTransfer();

    public native int createTranslator();

    public native int createVideo();

    public native int createVideoMessage();

    public native int createVoicemail();

    public native void destroyAccessSession(int i);

    public native void destroyAccount(int i);

    public native void destroyAlert(int i);

    public native void destroyContact(int i);

    public native void destroyContactGroup(int i);

    public native void destroyContactSearch(int i);

    public native void destroyContentItem(int i);

    public native void destroyConversation(int i);

    public native void destroyGI(int i);

    public native void destroyListener(int i);

    public native void destroyMediaDocument(int i);

    public native void destroyMessage(int i);

    public native void destroyMessageAnnotation(int i);

    public native void destroyMetatag(int i);

    public native void destroyObjectInterface(int i);

    public native void destroyParticipant(int i);

    public native void destroyPriceQuote(int i);

    public native void destroyProptable(int i);

    public native void destroySearch(int i);

    public native void destroySetup(int i);

    public native void destroySkyLib(int i);

    public native void destroySms(int i);

    public native void destroyTerm(int i);

    public native void destroyTransfer(int i);

    public native void destroyTranslator(int i);

    public native void destroyVideo(int i);

    public native void destroyVideoMessage(int i);

    public native void destroyVoicemail(int i);

    public void initializeListener(NativeListenable nativelistenable)
    {
        nativelistenable.initializeListener();
    }
}
