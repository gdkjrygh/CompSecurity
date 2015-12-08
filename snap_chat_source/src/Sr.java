// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Locale;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

public final class Sr
{
    public static final class a extends Enum
    {

        private static final a $VALUES[];
        public static final a DELTA;
        public static final a EQUAL;
        public static final a NOT_EQUAL;
        public static final a NOT_SUPPORT;
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
            return (a)Enum.valueOf(Sr$a, s);
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
            EQUAL = new a("EQUAL", 0, "EQUAL");
            DELTA = new a("DELTA", 1, "DELTA");
            NOT_EQUAL = new a("NOT_EQUAL", 2, "NOT_EQUAL");
            NOT_SUPPORT = new a("NOT_SUPPORT", 3, "NOT_SUPPORT");
            UNRECOGNIZED_VALUE = new a("UNRECOGNIZED_VALUE", 4, "UNRECOGNIZED_VALUE");
            $VALUES = (new a[] {
                EQUAL, DELTA, NOT_EQUAL, NOT_SUPPORT, UNRECOGNIZED_VALUE
            });
        }

        private a(String s, int i, String s1)
        {
            super(s, i);
            value = s1;
        }
    }


    protected String responseChecksum;
    protected String responseCompareResult;
    protected String responseCompareResultsDict;
    protected String serverLatency;

    public Sr()
    {
    }

    public final String a()
    {
        return serverLatency;
    }

    public final String b()
    {
        return responseChecksum;
    }

    public final boolean c()
    {
        return responseChecksum != null;
    }

    public final String d()
    {
        return responseCompareResult;
    }

    public final a e()
    {
        return a.a(responseCompareResult);
    }

    public final boolean equals(Object obj)
    {
        if (obj == this)
        {
            return true;
        }
        if (!(obj instanceof Sr))
        {
            return false;
        } else
        {
            obj = (Sr)obj;
            return (new EqualsBuilder()).append(serverLatency, ((Sr) (obj)).serverLatency).append(responseChecksum, ((Sr) (obj)).responseChecksum).append(responseCompareResult, ((Sr) (obj)).responseCompareResult).append(responseCompareResultsDict, ((Sr) (obj)).responseCompareResultsDict).isEquals();
        }
    }

    public final String f()
    {
        return responseCompareResultsDict;
    }

    public final int hashCode()
    {
        return (new HashCodeBuilder()).append(serverLatency).append(responseChecksum).append(responseCompareResult).append(responseCompareResultsDict).toHashCode();
    }

    public final String toString()
    {
        return ToStringBuilder.reflectionToString(this);
    }
}
