// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package fs.org.simpleframework.xml.core;


final class MethodType extends Enum
{

    private static final MethodType $VALUES[];
    public static final MethodType GET;
    public static final MethodType IS;
    public static final MethodType NONE;
    public static final MethodType SET;
    private int prefix;

    private MethodType(String s, int i, int j)
    {
        super(s, i);
        prefix = j;
    }

    public static MethodType valueOf(String s)
    {
        return (MethodType)Enum.valueOf(fs/org/simpleframework/xml/core/MethodType, s);
    }

    public static final MethodType[] values()
    {
        return (MethodType[])$VALUES.clone();
    }

    public int getPrefix()
    {
        return prefix;
    }

    static 
    {
        GET = new MethodType("GET", 0, 3);
        IS = new MethodType("IS", 1, 2);
        SET = new MethodType("SET", 2, 3);
        NONE = new MethodType("NONE", 3, 0);
        $VALUES = (new MethodType[] {
            GET, IS, SET, NONE
        });
    }
}
