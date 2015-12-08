// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.util;

import Bm;
import Bt;
import android.text.TextUtils;
import android.widget.TextView;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public final class RegistrationStringKey extends Enum
{

    private static final RegistrationStringKey $VALUES[];
    public static final String REGISTRATION_COPY_TEST_PREFIX = "REGISTER_COPY";
    public static final RegistrationStringKey REG_ACCESS_CONTACTS_PROMPT;
    public static final RegistrationStringKey REG_ADD_FRIENDS_INFO;
    public static final RegistrationStringKey REG_BIRTHDAY_HINT;
    public static final RegistrationStringKey REG_CAPTCHA_DESC;
    public static final RegistrationStringKey REG_CAPTCHA_TITLE;
    public static final RegistrationStringKey REG_EMAIL_HINT;
    public static final RegistrationStringKey REG_ENTER_MOBILE_DESC;
    public static final RegistrationStringKey REG_FIND_FRIENDS_DESC;
    public static final RegistrationStringKey REG_FIND_FRIENDS_DESC_BELOW;
    public static final RegistrationStringKey REG_FIND_FRIENDS_TITLE;
    public static final RegistrationStringKey REG_NEW_PASSWORD_HINT;
    public static final RegistrationStringKey REG_PICK_USERNAME_DESC;
    public static final RegistrationStringKey REG_PICK_USERNAME_HINT;
    public static final RegistrationStringKey REG_PICK_USERNAME_TITLE;
    public static final RegistrationStringKey REG_SIGN_UP_TITLE;
    public static final RegistrationStringKey REG_SKIP_FIND_FRIEND_CONFIRM;
    public static final RegistrationStringKey REG_WONT_DISPLAY_MOBILE;
    private final Bm mStudySettings = Bm.a();

    private RegistrationStringKey(String s, int i)
    {
        super(s, i);
    }

    public static RegistrationStringKey valueOf(String s)
    {
        return (RegistrationStringKey)Enum.valueOf(com/snapchat/android/util/RegistrationStringKey, s);
    }

    public static RegistrationStringKey[] values()
    {
        return (RegistrationStringKey[])$VALUES.clone();
    }

    public final String getString()
    {
        Bm bm;
        String s1;
        bm = mStudySettings;
        s1 = name();
        if (bm.mStudySettingsString == null) goto _L2; else goto _L1
_L1:
        Iterator iterator = bm.mStudySettingsString.keySet().iterator();
_L6:
        if (!iterator.hasNext()) goto _L4; else goto _L3
_L3:
        String s = (String)iterator.next();
        if (!s.startsWith("REGISTER_COPY")) goto _L6; else goto _L5
_L5:
        if (s != null)
        {
            s1 = bm.a(s, s1, null, Bt.aR());
            if (s1 != null)
            {
                String s2 = bm.a(s, "experimentId", null);
                if (!TextUtils.isEmpty(s2))
                {
                    bm.b(s, s2);
                }
            }
            return s1;
        }
_L2:
        return null;
_L4:
        s = null;
        if (true) goto _L5; else goto _L7
_L7:
    }

    public final void setTextViewHintIfNeeded(TextView textview)
    {
        String s = getString();
        if (!TextUtils.isEmpty(s))
        {
            textview.setHint(s);
        }
    }

    public final void setTextViewIfNeeded(TextView textview)
    {
        String s = getString();
        if (!TextUtils.isEmpty(s))
        {
            textview.setText(s);
        }
    }

    static 
    {
        REG_SIGN_UP_TITLE = new RegistrationStringKey("REG_SIGN_UP_TITLE", 0);
        REG_EMAIL_HINT = new RegistrationStringKey("REG_EMAIL_HINT", 1);
        REG_NEW_PASSWORD_HINT = new RegistrationStringKey("REG_NEW_PASSWORD_HINT", 2);
        REG_BIRTHDAY_HINT = new RegistrationStringKey("REG_BIRTHDAY_HINT", 3);
        REG_PICK_USERNAME_DESC = new RegistrationStringKey("REG_PICK_USERNAME_DESC", 4);
        REG_PICK_USERNAME_HINT = new RegistrationStringKey("REG_PICK_USERNAME_HINT", 5);
        REG_PICK_USERNAME_TITLE = new RegistrationStringKey("REG_PICK_USERNAME_TITLE", 6);
        REG_ENTER_MOBILE_DESC = new RegistrationStringKey("REG_ENTER_MOBILE_DESC", 7);
        REG_WONT_DISPLAY_MOBILE = new RegistrationStringKey("REG_WONT_DISPLAY_MOBILE", 8);
        REG_ACCESS_CONTACTS_PROMPT = new RegistrationStringKey("REG_ACCESS_CONTACTS_PROMPT", 9);
        REG_FIND_FRIENDS_TITLE = new RegistrationStringKey("REG_FIND_FRIENDS_TITLE", 10);
        REG_FIND_FRIENDS_DESC = new RegistrationStringKey("REG_FIND_FRIENDS_DESC", 11);
        REG_FIND_FRIENDS_DESC_BELOW = new RegistrationStringKey("REG_FIND_FRIENDS_DESC_BELOW", 12);
        REG_SKIP_FIND_FRIEND_CONFIRM = new RegistrationStringKey("REG_SKIP_FIND_FRIEND_CONFIRM", 13);
        REG_ADD_FRIENDS_INFO = new RegistrationStringKey("REG_ADD_FRIENDS_INFO", 14);
        REG_CAPTCHA_TITLE = new RegistrationStringKey("REG_CAPTCHA_TITLE", 15);
        REG_CAPTCHA_DESC = new RegistrationStringKey("REG_CAPTCHA_DESC", 16);
        $VALUES = (new RegistrationStringKey[] {
            REG_SIGN_UP_TITLE, REG_EMAIL_HINT, REG_NEW_PASSWORD_HINT, REG_BIRTHDAY_HINT, REG_PICK_USERNAME_DESC, REG_PICK_USERNAME_HINT, REG_PICK_USERNAME_TITLE, REG_ENTER_MOBILE_DESC, REG_WONT_DISPLAY_MOBILE, REG_ACCESS_CONTACTS_PROMPT, 
            REG_FIND_FRIENDS_TITLE, REG_FIND_FRIENDS_DESC, REG_FIND_FRIENDS_DESC_BELOW, REG_SKIP_FIND_FRIEND_CONFIRM, REG_ADD_FRIENDS_INFO, REG_CAPTCHA_TITLE, REG_CAPTCHA_DESC
        });
    }
}
