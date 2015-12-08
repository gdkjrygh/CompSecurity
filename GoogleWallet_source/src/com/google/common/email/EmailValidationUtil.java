// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.email;

import com.google.common.base.CharMatcher;
import java.util.regex.Pattern;

public final class EmailValidationUtil
{

    private static final Pattern ADDR_DOMAIN_SPEC_PATTERN;
    private static final Pattern ADDR_OPTIONAL_DOMAIN_SPEC_PATTERN;
    private static final Pattern ADDR_SPEC_PATTERN;
    private static final Pattern COMMENT_PART_PATTERN = Pattern.compile("^(?:[^\\(\\)\\\\]|\\\\.)+");
    private static final Pattern EMAIL_SPLITTER_PATTERN;
    private static final Pattern FIX1_RE = Pattern.compile("^<([^<>]+)>$");
    private static final Pattern FIX2_RE = Pattern.compile("^\\s*([^<]+)<([^<>]+)@([^<>@]+)>\\s*$");
    private static final Pattern FIX3_RE = Pattern.compile("^\\s*([^<>]+)@([^<>@]+)\\s*$");
    private static final CharMatcher IS_ATOM;
    private static final CharMatcher IS_CTL;
    private static final CharMatcher IS_SPECIAL;
    private static final Pattern MAILBOX_PATTERN;
    private static final Pattern NON_COMMENT_TOKEN_PATTERN;
    private static final CharMatcher RFC_2234_WHITESPACE = CharMatcher.anyOf(" \t");
    private static final Pattern SEPARATOR_CHARS = Pattern.compile("^[,\\s]+");
    private static final Pattern SPECIAL_CHAR_PATTERN = Pattern.compile((new StringBuilder(String.valueOf("\\(\\)<>@,;:\\\\\"\\.\\[\\]").length() + 2)).append("[").append("\\(\\)<>@,;:\\\\\"\\.\\[\\]").append("]").toString());
    public static final String VALID_EMAIL_REGEX;
    private static final Pattern WORD_CANDIDATE_PATTERN;

    private static boolean isAddrSpec(String s)
    {
        boolean flag = false;
        if (s.length() == matchAddrSpec(s, 0))
        {
            flag = true;
        }
        return flag;
    }

    public static boolean isValidShortEmail(String s)
    {
        return s.length() < 256 && isAddrSpec(s);
    }

    private static int matchAddrSpec(String s, int i)
    {
        byte byte0 = -1;
        int j = matchLocalPart(s, i);
        i = byte0;
        if (j != -1)
        {
            i = byte0;
            if (j < s.length())
            {
                i = byte0;
                if (s.charAt(j) == '@')
                {
                    i = matchDomain(s, j + 1);
                }
            }
        }
        return i;
    }

    private static int matchAtom(String s, int i)
    {
        int j = i;
        for (int k = s.length(); j < k && IS_ATOM.matches(s.charAt(j)); j++) { }
        if (j != i)
        {
            return j;
        } else
        {
            return -1;
        }
    }

    private static int matchDomain(String s, int i)
    {
        int j;
label0:
        {
            i = matchSubDomain(s, i);
            j = i;
            if (i == -1)
            {
                break label0;
            }
            int k = s.length();
            do
            {
                j = i;
                if (i >= k)
                {
                    break label0;
                }
                j = i;
                if (s.charAt(i) != '.')
                {
                    break label0;
                }
                j = matchSubDomain(s, i + 1);
                i = j;
            } while (j != -1);
            return -1;
        }
        return j;
    }

    private static int matchLocalPart(String s, int i)
    {
        int j;
label0:
        {
            i = matchWord(s, i);
            j = i;
            if (i == -1)
            {
                break label0;
            }
            int k = s.length();
            do
            {
                j = i;
                if (i >= k)
                {
                    break label0;
                }
                j = i;
                if (s.charAt(i) != '.')
                {
                    break label0;
                }
                j = matchWord(s, i + 1);
                i = j;
            } while (j != -1);
            return -1;
        }
        return j;
    }

    private static int matchQuotedString(String s, int i)
    {
        int k = s.length();
        if (i >= k || '"' != s.charAt(i))
        {
            return -1;
        }
        for (i++; i < k;)
        {
            char c = s.charAt(i);
            int j = i + 1;
            if (c == '\\')
            {
                i = j + 1;
            } else
            {
                i = j;
                if (c == '"')
                {
                    return j;
                }
            }
        }

        return -1;
    }

    private static int matchSubDomain(String s, int i)
    {
        return matchAtom(s, i);
    }

    private static int matchWord(String s, int i)
    {
        int k = matchAtom(s, i);
        int j = k;
        if (k == -1)
        {
            j = matchQuotedString(s, i);
        }
        return j;
    }

    static 
    {
        String s2 = (new StringBuilder(String.valueOf("\\x20").length() + 6)).append("(?:").append("\\x20").append("*+)").toString();
        String s1 = (new StringBuilder(String.valueOf("\\x20").length() + 6)).append("(?:").append("\\x20").append("++)").toString();
        String s = String.valueOf("\"(?:[^\\\\\"]++|(?:\\\\");
        s = (new StringBuilder(String.valueOf(s).length() + 11 + String.valueOf("(?s:.)").length())).append("(?:").append(s).append("(?s:.)").append(")++)*+\"").append(")").toString();
        String s3 = (new StringBuilder(String.valueOf("\\(\\)<>@,;:\\\\\"\\.\\[\\]").length() + 9 + String.valueOf("\\x00-\\x1f\\x7f").length() + String.valueOf("\\x20").length())).append("(?:[^").append("\\(\\)<>@,;:\\\\\"\\.\\[\\]").append("\\x00-\\x1f\\x7f").append("\\x20").append("]++)").toString();
        String s6 = (new StringBuilder(String.valueOf(s3).length() + 5 + String.valueOf(s).length())).append("(?:").append(s3).append("|").append(s).append(")").toString();
        String s4 = (new StringBuilder(String.valueOf(s6).length() + 10 + String.valueOf(s2).length() + String.valueOf(s6).length())).append("(?:").append(s6).append("(?:").append(s2).append(s6).append(")*+)").toString();
        String s5 = (new StringBuilder(String.valueOf("\\x0f").length() + 9)).append("[^\\[\\]\\\\").append("\\x0f").append("]").toString();
        s5 = (new StringBuilder(String.valueOf(s5).length() + 16 + String.valueOf("(?s:.)").length())).append("(?:\\[").append("(?:").append(s5).append("|\\\\").append("(?s:.)").append(")*").append("\\])").toString();
        String s8 = (new StringBuilder(String.valueOf(s6).length() + 9 + String.valueOf(s6).length())).append("(").append(s6).append("(?:\\.").append(s6).append(")*)").toString();
        String s9 = (new StringBuilder(String.valueOf(s3).length() + 11 + String.valueOf(s3).length())).append("(?:").append(s3).append("(?:\\.").append(s3).append(")*)").toString();
        s6 = (new StringBuilder(String.valueOf(s8).length() + 3 + String.valueOf(s9).length())).append("(").append(s8).append("@").append(s9).append(")").toString();
        VALID_EMAIL_REGEX = s6;
        String s7 = (new StringBuilder(String.valueOf(s8).length() + 5 + String.valueOf(s9).length())).append("(").append(s8).append("@(").append(s9).append("))").toString();
        s8 = (new StringBuilder(String.valueOf(s8).length() + 11 + String.valueOf(s9).length())).append("(").append(s8).append("(?:@(").append(s9).append(")?)?)").toString();
        String s10 = String.valueOf(",+@");
        s9 = (new StringBuilder(String.valueOf(s9).length() + 11 + String.valueOf(s10).length() + String.valueOf(s9).length())).append("(?:@").append(s9).append("(?:").append(s10).append(s9).append(")*:").append(")").toString();
        s9 = (new StringBuilder(String.valueOf(s9).length() + 7 + String.valueOf(s6).length())).append("(?:<").append(s9).append("?").append(s6).append(">)").toString();
        s2 = (new StringBuilder(String.valueOf(s6).length() + 11 + String.valueOf(s4).length() + String.valueOf(s2).length() + String.valueOf(s9).length())).append("(?:").append(s6).append("|(?:(").append(s4).append(")").append(s2).append(s9).append("))").toString();
        s1 = (new StringBuilder(String.valueOf(s).length() + 8 + String.valueOf(s5).length() + String.valueOf(s3).length() + String.valueOf(s1).length())).append("^(?:").append(s).append("|").append(s5).append("|").append(s3).append("|").append(s1).append(")").toString();
        ADDR_SPEC_PATTERN = Pattern.compile(s6);
        ADDR_DOMAIN_SPEC_PATTERN = Pattern.compile(s7);
        ADDR_OPTIONAL_DOMAIN_SPEC_PATTERN = Pattern.compile(s8);
        MAILBOX_PATTERN = Pattern.compile(s2);
        EMAIL_SPLITTER_PATTERN = Pattern.compile((new StringBuilder(String.valueOf(s).length() + 26)).append("^(?:[^@\"]++|").append(s).append("++)*+@[^\\s,]*+").toString());
        s2 = String.valueOf("^(?:\\.+|\\s+|");
        WORD_CANDIDATE_PATTERN = Pattern.compile((new StringBuilder(String.valueOf(s2).length() + 2 + String.valueOf(s).length() + String.valueOf("[^\"<>@.\\s]+").length())).append(s2).append(s).append("|").append("[^\"<>@.\\s]+").append(")").toString());
        NON_COMMENT_TOKEN_PATTERN = Pattern.compile(s1);
        IS_SPECIAL = CharMatcher.anyOf("()<>@,;:\\\".[]");
        IS_CTL = CharMatcher.inRange('\0', '\037').or(CharMatcher.is('\177'));
        IS_ATOM = IS_SPECIAL.or(CharMatcher.is(' ')).or(IS_CTL).negate();
    }
}
