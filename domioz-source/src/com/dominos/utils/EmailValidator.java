// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidator
{

    private static final String ADDRESS_SPEC = "^[a-zA-Z0-9\\!\\#\\$\\%\\&\\'\\*\\+\\-\\/\\=\\?\\^\\_\\`\\{\\|\\}\\~]+(?:\\.[a-zA-Z0-9\\!\\#\\$\\%\\&\\'\\*\\+\\-\\/\\=\\?\\^\\_\\`\\{\\|\\}\\~]+)*@(?:[a-zA-Z0-9][a-zA-Z0-9-]{0,61}[a-zA-Z0-9]?\\.)*[a-zA-Z0-9][a-zA-Z0-9-]{0,61}[a-zA-Z0-9]*\\.[a-zA-Z]{2,6}$";
    private static final String ATEXT = "[a-zA-Z0-9\\!\\#\\$\\%\\&\\'\\*\\+\\-\\/\\=\\?\\^\\_\\`\\{\\|\\}\\~]";
    private static final String ATOM = "[a-zA-Z0-9\\!\\#\\$\\%\\&\\'\\*\\+\\-\\/\\=\\?\\^\\_\\`\\{\\|\\}\\~]+";
    private static final String DOMAIN = "(?:[a-zA-Z0-9][a-zA-Z0-9-]{0,61}[a-zA-Z0-9]?\\.)*[a-zA-Z0-9][a-zA-Z0-9-]{0,61}[a-zA-Z0-9]*\\.[a-zA-Z]{2,6}";
    private static final String DOT_ATOM = "\\.[a-zA-Z0-9\\!\\#\\$\\%\\&\\'\\*\\+\\-\\/\\=\\?\\^\\_\\`\\{\\|\\}\\~]+";
    private static final Pattern EMAIL_PATTERN = Pattern.compile("^[a-zA-Z0-9\\!\\#\\$\\%\\&\\'\\*\\+\\-\\/\\=\\?\\^\\_\\`\\{\\|\\}\\~]+(?:\\.[a-zA-Z0-9\\!\\#\\$\\%\\&\\'\\*\\+\\-\\/\\=\\?\\^\\_\\`\\{\\|\\}\\~]+)*@(?:[a-zA-Z0-9][a-zA-Z0-9-]{0,61}[a-zA-Z0-9]?\\.)*[a-zA-Z0-9][a-zA-Z0-9-]{0,61}[a-zA-Z0-9]*\\.[a-zA-Z]{2,6}$");
    private static final String LETTER = "[a-zA-Z]";
    private static final String LET_DIG = "[a-zA-Z0-9]";
    private static final String LET_DIG_HYP = "[a-zA-Z0-9-]";
    private static final String LOCAL_PART = "[a-zA-Z0-9\\!\\#\\$\\%\\&\\'\\*\\+\\-\\/\\=\\?\\^\\_\\`\\{\\|\\}\\~]+(?:\\.[a-zA-Z0-9\\!\\#\\$\\%\\&\\'\\*\\+\\-\\/\\=\\?\\^\\_\\`\\{\\|\\}\\~]+)*";
    private static final String RFC_LABEL = "[a-zA-Z0-9][a-zA-Z0-9-]{0,61}[a-zA-Z0-9]";
    private static final String SP = "\\!\\#\\$\\%\\&\\'\\*\\+\\-\\/\\=\\?\\^\\_\\`\\{\\|\\}\\~";

    public EmailValidator()
    {
    }

    public static boolean isValidEmail(String s)
    {
        return s != null && EMAIL_PATTERN.matcher(s).matches();
    }

}
