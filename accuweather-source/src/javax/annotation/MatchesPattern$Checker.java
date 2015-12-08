// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package javax.annotation;

import java.lang.annotation.Annotation;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.annotation.meta.TypeQualifierValidator;
import javax.annotation.meta.When;

// Referenced classes of package javax.annotation:
//            MatchesPattern

public static class ator
    implements TypeQualifierValidator
{

    public volatile When forConstantValue(Annotation annotation, Object obj)
    {
        return forConstantValue((MatchesPattern)annotation, obj);
    }

    public When forConstantValue(MatchesPattern matchespattern, Object obj)
    {
        if (Pattern.compile(matchespattern.value(), matchespattern.flags()).matcher((String)obj).matches())
        {
            return When.ALWAYS;
        } else
        {
            return When.NEVER;
        }
    }

    public ator()
    {
    }
}
