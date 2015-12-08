// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.List;
import java.util.Locale;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class Ra
{
    public static final class a extends Enum
    {

        private static final a $VALUES[];
        public static final a FULL;
        public static final a PARTIAL;
        public static final a UNRECOGNIZED_VALUE;
        public final String value;

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
            return (a)Enum.valueOf(Ra$a, s);
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
            FULL = new a("FULL", 0, "full");
            PARTIAL = new a("PARTIAL", 1, "partial");
            UNRECOGNIZED_VALUE = new a("UNRECOGNIZED_VALUE", 2, "UNRECOGNIZED_VALUE");
            $VALUES = (new a[] {
                FULL, PARTIAL, UNRECOGNIZED_VALUE
            });
        }

        private a(String s, int i, String s1)
        {
            super(s, i);
            value = s1;
        }
    }


    protected List addedFriends;
    protected List bests;
    protected List friends;
    protected String friendsSyncToken;
    protected String friendsSyncType;

    public Ra()
    {
    }

    public final List a()
    {
        return friends;
    }

    public final String b()
    {
        return friendsSyncToken;
    }

    public final a c()
    {
        return a.a(friendsSyncType);
    }

    public final List d()
    {
        return addedFriends;
    }

    public final List e()
    {
        return bests;
    }

    public boolean equals(Object obj)
    {
        if (obj == this)
        {
            return true;
        }
        if (!(obj instanceof Ra))
        {
            return false;
        } else
        {
            obj = (Ra)obj;
            return (new EqualsBuilder()).append(friends, ((Ra) (obj)).friends).append(friendsSyncToken, ((Ra) (obj)).friendsSyncToken).append(friendsSyncType, ((Ra) (obj)).friendsSyncType).append(addedFriends, ((Ra) (obj)).addedFriends).append(bests, ((Ra) (obj)).bests).isEquals();
        }
    }

    public int hashCode()
    {
        return (new HashCodeBuilder()).append(friends).append(friendsSyncToken).append(friendsSyncType).append(addedFriends).append(bests).toHashCode();
    }

    public String toString()
    {
        return ToStringBuilder.reflectionToString(this);
    }
}
