// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package javax.validation.executable;


public final class ExecutableType extends Enum
{

    private static final ExecutableType $VALUES[];
    private static ExecutableType ALL;
    private static ExecutableType CONSTRUCTORS;
    private static ExecutableType GETTER_METHODS;
    private static ExecutableType IMPLICIT;
    private static ExecutableType NONE;
    private static ExecutableType NON_GETTER_METHODS;

    private ExecutableType(String s, int i)
    {
        super(s, i);
    }

    public static ExecutableType valueOf(String s)
    {
        return (ExecutableType)Enum.valueOf(javax/validation/executable/ExecutableType, s);
    }

    public static ExecutableType[] values()
    {
        return (ExecutableType[])$VALUES.clone();
    }

    static 
    {
        IMPLICIT = new ExecutableType("IMPLICIT", 0);
        NONE = new ExecutableType("NONE", 1);
        CONSTRUCTORS = new ExecutableType("CONSTRUCTORS", 2);
        NON_GETTER_METHODS = new ExecutableType("NON_GETTER_METHODS", 3);
        GETTER_METHODS = new ExecutableType("GETTER_METHODS", 4);
        ALL = new ExecutableType("ALL", 5);
        $VALUES = (new ExecutableType[] {
            IMPLICIT, NONE, CONSTRUCTORS, NON_GETTER_METHODS, GETTER_METHODS, ALL
        });
    }
}
