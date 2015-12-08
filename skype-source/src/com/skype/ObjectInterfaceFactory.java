// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype;


// Referenced classes of package com.skype:
//            NativeListenable

public interface ObjectInterfaceFactory
{

    public abstract int createAccessSession();

    public abstract int createAccount();

    public abstract int createAlert();

    public abstract int createContact();

    public abstract int createContactGroup();

    public abstract int createContactSearch();

    public abstract int createContentItem();

    public abstract int createConversation();

    public abstract int createMediaDocument();

    public abstract int createMessage();

    public abstract int createMessageAnnotation();

    public abstract int createMetatag();

    public abstract int createMetatag(int i, long l);

    public abstract int createMetatag(int i, String s);

    public abstract int createMetatag(int i, byte abyte0[]);

    public abstract int createObjectInterface();

    public abstract int createParticipant();

    public abstract int createPriceQuote();

    public abstract int createProptable();

    public abstract int createSearch(Search.TARGET target, int i);

    public abstract int createSkyLib(String s, String s1, boolean flag, boolean flag1);

    public abstract int createSkyLib(String s, boolean flag, boolean flag1);

    public abstract int createSms();

    public abstract int createTerm();

    public abstract int createTerm(int i, Term.CONDITION condition, long l);

    public abstract int createTerm(int i, Term.CONDITION condition, String s);

    public abstract int createTerm(int i, Term.CONDITION condition, byte abyte0[]);

    public abstract int createTransfer();

    public abstract int createTranslator();

    public abstract int createVideo();

    public abstract int createVideoMessage();

    public abstract int createVoicemail();

    public abstract void destroyAccessSession(int i);

    public abstract void destroyAccount(int i);

    public abstract void destroyAlert(int i);

    public abstract void destroyContact(int i);

    public abstract void destroyContactGroup(int i);

    public abstract void destroyContactSearch(int i);

    public abstract void destroyContentItem(int i);

    public abstract void destroyConversation(int i);

    public abstract void destroyGI(int i);

    public abstract void destroyListener(int i);

    public abstract void destroyMediaDocument(int i);

    public abstract void destroyMessage(int i);

    public abstract void destroyMessageAnnotation(int i);

    public abstract void destroyMetatag(int i);

    public abstract void destroyObjectInterface(int i);

    public abstract void destroyParticipant(int i);

    public abstract void destroyPriceQuote(int i);

    public abstract void destroyProptable(int i);

    public abstract void destroySearch(int i);

    public abstract void destroySetup(int i);

    public abstract void destroySkyLib(int i);

    public abstract void destroySms(int i);

    public abstract void destroyTerm(int i);

    public abstract void destroyTransfer(int i);

    public abstract void destroyTranslator(int i);

    public abstract void destroyVideo(int i);

    public abstract void destroyVideoMessage(int i);

    public abstract void destroyVoicemail(int i);

    public abstract void initializeListener(NativeListenable nativelistenable);
}
