// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package lombok;


public final class AccessLevel extends Enum
{

    private static final AccessLevel $VALUES[];
    public static final AccessLevel MODULE;
    public static final AccessLevel NONE;
    public static final AccessLevel PACKAGE;
    public static final AccessLevel PRIVATE;
    public static final AccessLevel PROTECTED;
    public static final AccessLevel PUBLIC;

    private AccessLevel(String s, int i)
    {
        super(s, i);
    }

    public static AccessLevel valueOf(String s)
    {
        return (AccessLevel)Enum.valueOf(lombok/AccessLevel, s);
    }

    public static AccessLevel[] values()
    {
        return (AccessLevel[])$VALUES.clone();
    }

    static 
    {
        PUBLIC = new AccessLevel("PUBLIC", 0);
        MODULE = new AccessLevel("MODULE", 1);
        PROTECTED = new AccessLevel("PROTECTED", 2);
        PACKAGE = new AccessLevel("PACKAGE", 3);
        PRIVATE = new AccessLevel("PRIVATE", 4);
        NONE = new AccessLevel("NONE", 5);
        $VALUES = (new AccessLevel[] {
            PUBLIC, MODULE, PROTECTED, PACKAGE, PRIVATE, NONE
        });
    }
}
