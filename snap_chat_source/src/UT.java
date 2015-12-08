// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Locale;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

public final class UT
{
    public static final class a extends Enum
    {

        private static final a $VALUES[];
        public static final a NEEDS_CAPTCHA;
        public static final a NEEDS_PHONE_VERIFIED;
        public static final a UNRECOGNIZED_VALUE;
        private final String value;

        public static a a(String s)
        {
            try
            {
                s = valueOf(s.toUpperCase(Locale.US));
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                return UNRECOGNIZED_VALUE;
            }
            return s;
        }

        public static a valueOf(String s)
        {
            return (a)Enum.valueOf(UT$a, s);
        }

        public static a[] values()
        {
            return (a[])$VALUES.clone();
        }

        public final String toString()
        {
            return value;
        }

        static 
        {
            NEEDS_PHONE_VERIFIED = new a("NEEDS_PHONE_VERIFIED", 0, "needs_phone_verified");
            NEEDS_CAPTCHA = new a("NEEDS_CAPTCHA", 1, "needs_captcha");
            UNRECOGNIZED_VALUE = new a("UNRECOGNIZED_VALUE", 2, "UNRECOGNIZED_VALUE");
            $VALUES = (new a[] {
                NEEDS_PHONE_VERIFIED, NEEDS_CAPTCHA, UNRECOGNIZED_VALUE
            });
        }

        private a(String s, int i, String s1)
        {
            super(s, i);
            value = s1;
        }
    }


    protected String prompt;
    protected String type;

    public UT()
    {
    }

    public final a a()
    {
        return a.a(type);
    }

    public final boolean equals(Object obj)
    {
        if (obj == this)
        {
            return true;
        }
        if (!(obj instanceof UT))
        {
            return false;
        } else
        {
            obj = (UT)obj;
            return (new EqualsBuilder()).append(type, ((UT) (obj)).type).append(prompt, ((UT) (obj)).prompt).isEquals();
        }
    }

    public final int hashCode()
    {
        return (new HashCodeBuilder()).append(type).append(prompt).toHashCode();
    }

    public final String toString()
    {
        return ToStringBuilder.reflectionToString(this);
    }
}
