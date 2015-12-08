// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package retrofit.client;


public final class Header
{

    private final String name;
    private final String value;

    public Header(String s, String s1)
    {
        name = s;
        value = s1;
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            }
            obj = (Header)obj;
            if (name == null ? ((Header) (obj)).name != null : !name.equals(((Header) (obj)).name))
            {
                return false;
            }
            if (value == null ? ((Header) (obj)).value != null : !value.equals(((Header) (obj)).value))
            {
                return false;
            }
        }
        return true;
    }

    public String getName()
    {
        return name;
    }

    public String getValue()
    {
        return value;
    }

    public int hashCode()
    {
        int j = 0;
        int i;
        if (name != null)
        {
            i = name.hashCode();
        } else
        {
            i = 0;
        }
        if (value != null)
        {
            j = value.hashCode();
        }
        return i * 31 + j;
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        String s;
        if (name != null)
        {
            s = name;
        } else
        {
            s = "";
        }
        stringbuilder = stringbuilder.append(s).append(": ");
        if (value != null)
        {
            s = value;
        } else
        {
            s = "";
        }
        return stringbuilder.append(s).toString();
    }
}
