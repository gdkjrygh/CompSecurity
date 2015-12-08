// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package javax.annotation.meta;


public final class When extends Enum
{

    private static final When $VALUES[];
    public static final When ALWAYS;
    public static final When MAYBE;
    public static final When NEVER;
    public static final When UNKNOWN;

    private When(String s, int i)
    {
        super(s, i);
    }

    public static When valueOf(String s)
    {
        return (When)Enum.valueOf(javax/annotation/meta/When, s);
    }

    public static final When[] values()
    {
        return (When[])$VALUES.clone();
    }

    static 
    {
        ALWAYS = new When("ALWAYS", 0);
        UNKNOWN = new When("UNKNOWN", 1);
        MAYBE = new When("MAYBE", 2);
        NEVER = new When("NEVER", 3);
        $VALUES = (new When[] {
            ALWAYS, UNKNOWN, MAYBE, NEVER
        });
    }
}
