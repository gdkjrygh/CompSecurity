// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.kit.utils;

import com.pinterest.base.Device;
import com.pinterest.ui.text.PEditText;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.commons.lang3.StringUtils;

public class SignupFormUtils
{

    public static final int NO_ERROR = 0;
    private static final int USERNAME_MAX_LENGTH = 15;
    private static final int USERNAME_MIN_LENGTH = 3;

    public SignupFormUtils()
    {
    }

    public static String cleanUsername(String s)
    {
        String s1 = s.replaceAll("[^A-Za-z0-9]", "");
        s = s1;
        if (isUsernameLong(s1))
        {
            s = s1.substring(0, 15);
        }
        return s;
    }

    private static boolean containsNoSymbols(String s)
    {
        return Pattern.compile("^[A-Za-z0-9]+$").matcher(s).matches();
    }

    private static boolean containsOnlyDigits(String s)
    {
        return Pattern.compile("^[0-9]+$").matcher(s).matches();
    }

    public static boolean isBusinessNameValid(String s)
    {
        return !StringUtils.isEmpty(stripSpaces(s));
    }

    public static boolean isBusinessTypeValid(String s)
    {
        return !StringUtils.isEmpty(s);
    }

    public static boolean isEmailValid(String s)
    {
        return Pattern.compile(".+@.+\\.[a-z]+").matcher(s).matches();
    }

    public static boolean isFirstNameValid(String s)
    {
        return !StringUtils.isEmpty(stripSpaces(s));
    }

    public static boolean isFullNameValid(String s)
    {
        return !StringUtils.isEmpty(stripSpaces(s)) && s.length() < 100;
    }

    public static boolean isLastNameValid(String s)
    {
        return true;
    }

    public static boolean isPasswordValid(String s)
    {
        return s.length() >= 6;
    }

    private static boolean isUsernameLong(String s)
    {
        return s.length() > 15;
    }

    private static boolean isUsernameShort(String s)
    {
        return s.length() < 3;
    }

    public static int isUsernameValid(String s)
    {
        int i = 0;
        if (!containsNoSymbols(s))
        {
            i = 0x7f07054c;
        } else
        {
            if (containsOnlyDigits(s))
            {
                return 0x7f07054f;
            }
            if (isUsernameShort(s))
            {
                return 0x7f070553;
            }
            if (isUsernameLong(s))
            {
                return 0x7f070552;
            }
        }
        return i;
    }

    public static void setUpField(PEditText pedittext, final OnKeyboardEnter onKeyboardEnter)
    {
        String s = pedittext.getText().toString();
        pedittext.requestFocus();
        pedittext.setSelection(s.length());
        Device.showSoftKeyboard(pedittext);
        pedittext.setOnEditorActionListener(new _cls1());
    }

    private static String stripSpaces(String s)
    {
        return s.replaceAll("\\s", "");
    }

    private class _cls1
        implements android.widget.TextView.OnEditorActionListener
    {

        final OnKeyboardEnter val$onKeyboardEnter;

        public final boolean onEditorAction(TextView textview, int i, KeyEvent keyevent)
        {
            if (keyevent != null && keyevent.getKeyCode() == 66)
            {
                onKeyboardEnter.callback();
            }
            return false;
        }

        _cls1()
        {
            onKeyboardEnter = onkeyboardenter;
            super();
        }

        private class OnKeyboardEnter
        {

            public abstract void callback();
        }

    }

}
