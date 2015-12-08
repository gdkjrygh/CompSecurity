// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype;


// Referenced classes of package com.skype:
//            Translator

public static interface ATUS
{

    public abstract void onTranscribedMessage(Translator translator, int i, int j, String s,  ,  1);

    public abstract void onTranslatedMessage(Translator translator, int i, int j, String s, String s1, String s2, String s3, 
             );

    public abstract void onTranslatedSessionAudio(Translator translator, int i, byte abyte0[],  );

    public abstract void onTranslatedSessionText(Translator translator, int i, int j, String s, String s1,  , int k, 
            int l,  1);

    public abstract void onTranslatorGlobalStatusChanged(Translator translator, ATUS atus);

    public abstract void onTranslatorStatusChanged(Translator translator, int i, ATUS atus);
}
