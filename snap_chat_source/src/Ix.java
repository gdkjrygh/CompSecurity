// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.TextUtils;

public final class Ix
{

    public static final String CHANGE_EMAIL_KEY = "change_email_key";
    public static final String CHANGE_EMAIL_MESSAGE_KEY = "change_email_message_key";
    public static final boolean ENABLE_RED_GEAR_PHONE_FEATURE = false;
    public static final String RECOVERY_CODE_MESSAGE_KEY = "recovery_code_message_key";
    public static final String RECOVERY_CODE_SUCCEED_KEY = "recovery_code_succeed_key";
    private Bt mUserPrefs;

    public Ix()
    {
        this(Bt.a());
    }

    public Ix(Bt bt)
    {
        mUserPrefs = bt;
    }

    public static boolean a()
    {
        return TextUtils.isEmpty(Bt.J()) || TextUtils.getTrimmedLength(Bt.J()) == 0;
    }

    public static boolean b()
    {
        return TextUtils.isEmpty(Bt.S()) || !Bt.bv() || !TextUtils.isEmpty(Bt.bw());
    }
}
