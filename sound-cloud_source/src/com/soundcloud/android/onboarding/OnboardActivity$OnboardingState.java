// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.onboarding;


// Referenced classes of package com.soundcloud.android.onboarding:
//            OnboardActivity

protected static final class  extends Enum
{

    private static final ACCEPT_TERMS $VALUES[];
    public static final ACCEPT_TERMS ACCEPT_TERMS;
    public static final ACCEPT_TERMS LOGIN;
    public static final ACCEPT_TERMS PHOTOS;
    public static final ACCEPT_TERMS SIGN_UP_BASICS;
    public static final ACCEPT_TERMS SIGN_UP_DETAILS;
    public static final ACCEPT_TERMS SIGN_UP_METHOD;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/soundcloud/android/onboarding/OnboardActivity$OnboardingState, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        PHOTOS = new <init>("PHOTOS", 0);
        LOGIN = new <init>("LOGIN", 1);
        SIGN_UP_METHOD = new <init>("SIGN_UP_METHOD", 2);
        SIGN_UP_BASICS = new <init>("SIGN_UP_BASICS", 3);
        SIGN_UP_DETAILS = new <init>("SIGN_UP_DETAILS", 4);
        ACCEPT_TERMS = new <init>("ACCEPT_TERMS", 5);
        $VALUES = (new .VALUES[] {
            PHOTOS, LOGIN, SIGN_UP_METHOD, SIGN_UP_BASICS, SIGN_UP_DETAILS, ACCEPT_TERMS
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
