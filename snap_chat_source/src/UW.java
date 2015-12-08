// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

public final class UW extends Qd
{
    public static final class a extends Enum
    {

        private static final a $VALUES[];
        public static final a ADD;
        public static final a REMOVE;
        public static final a UNRECOGNIZED_VALUE;
        public final String value;

        public static a valueOf(String s)
        {
            return (a)Enum.valueOf(UW$a, s);
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
            ADD = new a("ADD", 0, "add");
            REMOVE = new a("REMOVE", 1, "remove");
            UNRECOGNIZED_VALUE = new a("UNRECOGNIZED_VALUE", 2, "UNRECOGNIZED_VALUE");
            $VALUES = (new a[] {
                ADD, REMOVE, UNRECOGNIZED_VALUE
            });
        }

        private a(String s, int i, String s1)
        {
            super(s, i);
            value = s1;
        }
    }


    protected String collabOperation;
    protected String collabUsername;
    protected String verifiedUserId;

    public UW()
    {
    }

    public final UW a(String s)
    {
        collabUsername = s;
        return this;
    }

    public final UW b(String s)
    {
        verifiedUserId = s;
        return this;
    }

    public final UW c(String s)
    {
        collabOperation = s;
        return this;
    }

    public final boolean equals(Object obj)
    {
        if (obj == this)
        {
            return true;
        }
        if (!(obj instanceof UW))
        {
            return false;
        } else
        {
            obj = (UW)obj;
            return (new EqualsBuilder()).append(timestamp, ((UW) (obj)).timestamp).append(reqToken, ((UW) (obj)).reqToken).append(username, ((UW) (obj)).username).append(collabUsername, ((UW) (obj)).collabUsername).append(verifiedUserId, ((UW) (obj)).verifiedUserId).append(collabOperation, ((UW) (obj)).collabOperation).isEquals();
        }
    }

    public final int hashCode()
    {
        return (new HashCodeBuilder()).append(timestamp).append(reqToken).append(username).append(collabUsername).append(verifiedUserId).append(collabOperation).toHashCode();
    }

    public final String toString()
    {
        return ToStringBuilder.reflectionToString(this);
    }
}
