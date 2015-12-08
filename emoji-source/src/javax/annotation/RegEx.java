// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package javax.annotation;

import java.lang.annotation.Annotation;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
import javax.annotation.meta.TypeQualifierValidator;
import javax.annotation.meta.When;

public interface RegEx
    extends Annotation
{
    public static class Checker
        implements TypeQualifierValidator
    {

        public volatile When forConstantValue(Annotation annotation, Object obj)
        {
            return forConstantValue((RegEx)annotation, obj);
        }

        public When forConstantValue(RegEx regex, Object obj)
        {
            if (!(obj instanceof String))
            {
                return When.NEVER;
            }
            try
            {
                Pattern.compile((String)obj);
            }
            // Misplaced declaration of an exception variable
            catch (RegEx regex)
            {
                return When.NEVER;
            }
            return When.ALWAYS;
        }

        public Checker()
        {
        }
    }


    public abstract When when();
}
