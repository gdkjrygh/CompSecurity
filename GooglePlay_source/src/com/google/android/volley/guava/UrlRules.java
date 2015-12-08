// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.volley.guava;

import android.content.ContentResolver;
import android.util.Log;
import com.google.android.gsf.Gservices;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class UrlRules
{
    public static final class Rule
        implements Comparable
    {

        public static final Rule DEFAULT = new Rule();
        public final boolean mBlock;
        public final String mName;
        public final String mPrefix;
        public final String mRewrite;

        public final int compareTo(Object obj)
        {
            return ((Rule)obj).mPrefix.compareTo(mPrefix);
        }


        private Rule()
        {
            mName = "DEFAULT";
            mPrefix = "";
            mRewrite = null;
            mBlock = false;
        }

        public Rule(String s, String s1)
            throws RuleFormatException
        {
            mName = s;
            String as[] = UrlRules.PATTERN_SPACE_PLUS.split(s1);
            if (as.length == 0)
            {
                throw new RuleFormatException("Empty rule");
            }
            mPrefix = as[0];
            s = null;
            boolean flag = false;
            for (int i = 1; i < as.length;)
            {
                String s2 = as[i].toLowerCase();
                if (s2.equals("rewrite") && i + 1 < as.length)
                {
                    s = as[i + 1];
                    i += 2;
                } else
                if (s2.equals("block"))
                {
                    flag = true;
                    i++;
                } else
                {
                    throw new RuleFormatException((new StringBuilder("Illegal rule: ")).append(s1).toString());
                }
            }

            mRewrite = s;
            mBlock = flag;
        }
    }

    public static final class RuleFormatException extends Exception
    {

        public RuleFormatException(String s)
        {
            super(s);
        }
    }


    private static final Pattern PATTERN_SPACE_PLUS = Pattern.compile(" +");
    private static final Pattern RULE_PATTERN = Pattern.compile("\\W");
    private static UrlRules sCachedRules = new UrlRules(new Rule[0]);
    private static Object sCachedVersionToken;
    public final Pattern mPattern;
    public final Rule mRules[];

    private UrlRules(Rule arule[])
    {
        Arrays.sort(arule);
        StringBuilder stringbuilder = new StringBuilder("(");
        for (int i = 0; i < arule.length; i++)
        {
            if (i > 0)
            {
                stringbuilder.append(")|(");
            }
            stringbuilder.append(RULE_PATTERN.matcher(arule[i].mPrefix).replaceAll("\\\\$0"));
        }

        mPattern = Pattern.compile(stringbuilder.append(")").toString());
        mRules = arule;
    }

    public static UrlRules getRules(ContentResolver contentresolver)
    {
        com/google/android/volley/guava/UrlRules;
        JVM INSTR monitorenter ;
        Object obj = Gservices.getVersionToken(contentresolver);
        if (obj != sCachedVersionToken) goto _L2; else goto _L1
_L1:
        if (Log.isLoggable("UrlRules", 2))
        {
            Log.v("UrlRules", (new StringBuilder("Using cached rules, versionToken: ")).append(obj).toString());
        }
        contentresolver = sCachedRules;
_L6:
        com/google/android/volley/guava/UrlRules;
        JVM INSTR monitorexit ;
        return contentresolver;
_L2:
        Object obj1;
        if (Log.isLoggable("UrlRules", 2))
        {
            Log.v("UrlRules", "Scanning for Gservices \"url:*\" rules");
        }
        obj1 = Gservices.getStringsByPrefix(contentresolver, new String[] {
            "url:"
        });
        contentresolver = new ArrayList();
        obj1 = ((Map) (obj1)).entrySet().iterator();
_L4:
        Object obj2;
        if (!((Iterator) (obj1)).hasNext())
        {
            break MISSING_BLOCK_LABEL_244;
        }
        obj2 = (java.util.Map.Entry)((Iterator) (obj1)).next();
        String s;
        s = ((String)((java.util.Map.Entry) (obj2)).getKey()).substring(4);
        obj2 = (String)((java.util.Map.Entry) (obj2)).getValue();
        if (obj2 == null) goto _L4; else goto _L3
_L3:
        if (((String) (obj2)).length() == 0) goto _L4; else goto _L5
_L5:
        if (Log.isLoggable("UrlRules", 2))
        {
            Log.v("UrlRules", (new StringBuilder("  Rule ")).append(s).append(": ").append(((String) (obj2))).toString());
        }
        contentresolver.add(new Rule(s, ((String) (obj2))));
          goto _L4
        RuleFormatException ruleformatexception;
        ruleformatexception;
        Log.e("UrlRules", "Invalid rule from Gservices", ruleformatexception);
          goto _L4
        contentresolver;
        throw contentresolver;
        sCachedRules = new UrlRules((Rule[])contentresolver.toArray(new Rule[contentresolver.size()]));
        sCachedVersionToken = obj;
        if (Log.isLoggable("UrlRules", 2))
        {
            Log.v("UrlRules", (new StringBuilder("New rules stored, versionToken: ")).append(obj).toString());
        }
        contentresolver = sCachedRules;
          goto _L6
    }


}
