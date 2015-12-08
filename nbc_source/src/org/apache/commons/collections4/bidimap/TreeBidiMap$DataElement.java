// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.commons.collections4.bidimap;


// Referenced classes of package org.apache.commons.collections4.bidimap:
//            TreeBidiMap

static final class description extends Enum
{

    private static final VALUE $VALUES[];
    public static final VALUE KEY;
    public static final VALUE VALUE;
    private final String description;

    public static description valueOf(String s)
    {
        return (description)Enum.valueOf(org/apache/commons/collections4/bidimap/TreeBidiMap$DataElement, s);
    }

    public static description[] values()
    {
        return (description[])$VALUES.clone();
    }

    public String toString()
    {
        return description;
    }

    static 
    {
        KEY = new <init>("KEY", 0, "key");
        VALUE = new <init>("VALUE", 1, "value");
        $VALUES = (new .VALUES[] {
            KEY, VALUE
        });
    }

    private (String s, int i, String s1)
    {
        super(s, i);
        description = s1;
    }
}
