// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package fs.org.simpleframework.xml;


public final class DefaultType extends Enum
{

    private static final DefaultType $VALUES[];
    public static final DefaultType FIELD;
    public static final DefaultType PROPERTY;

    private DefaultType(String s, int i)
    {
        super(s, i);
    }

    public static DefaultType valueOf(String s)
    {
        return (DefaultType)Enum.valueOf(fs/org/simpleframework/xml/DefaultType, s);
    }

    public static final DefaultType[] values()
    {
        return (DefaultType[])$VALUES.clone();
    }

    static 
    {
        FIELD = new DefaultType("FIELD", 0);
        PROPERTY = new DefaultType("PROPERTY", 1);
        $VALUES = (new DefaultType[] {
            FIELD, PROPERTY
        });
    }
}
