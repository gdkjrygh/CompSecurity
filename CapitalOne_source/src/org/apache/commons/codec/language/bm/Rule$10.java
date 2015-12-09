// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.commons.codec.language.bm;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Referenced classes of package org.apache.commons.codec.language.bm:
//            Rule

static final class val.regex
    implements ttern
{

    Pattern pattern;
    final String val$regex;

    public boolean isMatch(CharSequence charsequence)
    {
        return pattern.matcher(charsequence).find();
    }

    ttern(String s)
    {
        val$regex = s;
        super();
        pattern = Pattern.compile(val$regex);
    }
}
