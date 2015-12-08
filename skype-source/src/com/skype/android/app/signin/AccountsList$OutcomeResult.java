// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.signin;


// Referenced classes of package com.skype.android.app.signin:
//            AccountsList

public static final class  extends Enum
{

    private static final CANCELED $VALUES[];
    public static final CANCELED CANCELED;
    public static final CANCELED MSA_EXISTS;
    public static final CANCELED NO_ACCOUNT;
    public static final CANCELED NO_RESPONSE;
    public static final CANCELED SKYPE_EXISTS;
    public static final CANCELED SUGGESTIONS_FOUND;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/skype/android/app/signin/AccountsList$OutcomeResult, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        MSA_EXISTS = new <init>("MSA_EXISTS", 0);
        SKYPE_EXISTS = new <init>("SKYPE_EXISTS", 1);
        SUGGESTIONS_FOUND = new <init>("SUGGESTIONS_FOUND", 2);
        NO_ACCOUNT = new <init>("NO_ACCOUNT", 3);
        NO_RESPONSE = new <init>("NO_RESPONSE", 4);
        CANCELED = new <init>("CANCELED", 5);
        $VALUES = (new .VALUES[] {
            MSA_EXISTS, SKYPE_EXISTS, SUGGESTIONS_FOUND, NO_ACCOUNT, NO_RESPONSE, CANCELED
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
