// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.fragments.settings.password;

import com.snapchat.android.Timber;

public final class PasswordStrength extends Enum
{

    private static final PasswordStrength $VALUES[];
    public static final PasswordStrength MEDIUM;
    public static final PasswordStrength STRONG;
    public static final PasswordStrength TOO_WEAK;
    public static final PasswordStrength UNKNOWN;
    public static final PasswordStrength VERYSTRONG;

    private PasswordStrength(String s, int i)
    {
        super(s, i);
    }

    public static PasswordStrength fromValue(String s)
    {
        try
        {
            s = valueOf(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            Timber.e("PasswordStrength", (new StringBuilder("Invalid enum for the PasswordStrength ")).append(s).toString(), new Object[0]);
            return UNKNOWN;
        }
        return s;
    }

    public static PasswordStrength valueOf(String s)
    {
        return (PasswordStrength)Enum.valueOf(com/snapchat/android/fragments/settings/password/PasswordStrength, s);
    }

    public static PasswordStrength[] values()
    {
        return (PasswordStrength[])$VALUES.clone();
    }

    static 
    {
        TOO_WEAK = new PasswordStrength("TOO_WEAK", 0);
        MEDIUM = new PasswordStrength("MEDIUM", 1);
        STRONG = new PasswordStrength("STRONG", 2);
        VERYSTRONG = new PasswordStrength("VERYSTRONG", 3);
        UNKNOWN = new PasswordStrength("UNKNOWN", 4);
        $VALUES = (new PasswordStrength[] {
            TOO_WEAK, MEDIUM, STRONG, VERYSTRONG, UNKNOWN
        });
    }
}
