// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.fragments.settings.password;


// Referenced classes of package com.snapchat.android.fragments.settings.password:
//            ChangePasswordFragment, PasswordStrength

static final class 
{

    static final int a[];

    static 
    {
        a = new int[PasswordStrength.values().length];
        try
        {
            a[PasswordStrength.MEDIUM.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            a[PasswordStrength.STRONG.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            a[PasswordStrength.VERYSTRONG.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
