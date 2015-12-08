// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.util.config.impl;

import com.skype.android.util.Log;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Referenced classes of package com.skype.android.util.config.impl:
//            ConfigParseException, NameResolver

public final class ExpressionEvaluationUtils
{

    private static final Pattern PATTERN = Pattern.compile("([a-zA-Z0-9\\._\\/]+)\\s*([\\=\\!\\~\\<\\>\\@\\#\\$\\%\\^\\&\\*\\+\\-\\:\\?]+)\\s*(.+)");

    public ExpressionEvaluationUtils()
    {
    }

    private static int compare(String s, String s1)
    {
        long l;
        long l1;
        try
        {
            l = Long.decode(s).longValue();
            l1 = Long.decode(s1).longValue();
        }
        catch (NumberFormatException numberformatexception)
        {
            return Double.compare(Double.valueOf(s).doubleValue(), Double.valueOf(s1).doubleValue());
        }
        l -= l1;
        if (l > 0L)
        {
            return 1;
        }
        return l >= 0L ? 0 : -1;
    }

    public static boolean match(String s, NameResolver nameresolver)
        throws ConfigParseException
    {
        String s1;
        String s2;
        Object obj;
        String s3;
        obj = PATTERN.matcher(s);
        if (!((Matcher) (obj)).matches())
        {
            throw new ConfigParseException((new StringBuilder("Malformed expression: ")).append(s).toString());
        }
        s2 = ((Matcher) (obj)).group(1);
        s1 = ((Matcher) (obj)).group(2);
        obj = ((Matcher) (obj)).group(3);
        s3 = nameresolver.getValue(s2);
        if (s3 != null) goto _L2; else goto _L1
_L1:
        if (Log.isLoggable("Utils", 4))
        {
            Log.i("Utils", (new StringBuilder("No value for ")).append(nameresolver.getPrefix()).append(s2).toString());
        }
_L4:
        return false;
_L2:
        if (Log.isLoggable("Utils", 3))
        {
            Log.d("Utils", (new StringBuilder("Value resolved: ")).append(nameresolver.getPrefix()).append(s2).append(" = \"").append(s3).append("\"").toString());
        }
        if ("=".equals(s1))
        {
            return s3.equals(obj);
        }
        if (!"!=".equals(s1))
        {
            break; /* Loop/switch isn't completed */
        }
        if (!s3.equals(obj))
        {
            return true;
        }
        if (true) goto _L4; else goto _L3
_L3:
        if ("~".equals(s1))
        {
            return s3.matches(((String) (obj)));
        }
        if (">".equals(s1))
        {
            if (compare(s3, ((String) (obj))) > 0)
            {
                return true;
            }
            continue; /* Loop/switch isn't completed */
        }
        if (">=".equals(s1))
        {
            if (compare(s3, ((String) (obj))) >= 0)
            {
                return true;
            }
            continue; /* Loop/switch isn't completed */
        }
        if ("<".equals(s1))
        {
            if (compare(s3, ((String) (obj))) < 0)
            {
                return true;
            }
        } else
        {
label0:
            {
                int i;
                try
                {
                    if (!"<=".equals(s1))
                    {
                        break label0;
                    }
                    i = compare(s3, ((String) (obj)));
                }
                // Misplaced declaration of an exception variable
                catch (NameResolver nameresolver)
                {
                    throw new ConfigParseException((new StringBuilder("Illegal comparison '")).append(s3).append(" ").append(s1).append(" ").append(((String) (obj))).append("' in expression: ").append(s).toString());
                }
                if (i <= 0)
                {
                    return true;
                }
            }
        }
        if (true) goto _L4; else goto _L5
_L5:
        throw new ConfigParseException((new StringBuilder("Unknown operation '")).append(s1).append("'  in expression: ").append(s).toString());
    }

}
