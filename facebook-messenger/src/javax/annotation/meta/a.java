// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package javax.annotation.meta;


public final class a extends Enum
{

    private static final a $VALUES[];
    public static final a ALWAYS;
    public static final a MAYBE;
    public static final a NEVER;
    public static final a UNKNOWN;

    private a(String s, int i)
    {
        super(s, i);
    }

    public static a valueOf(String s)
    {
        return (a)Enum.valueOf(javax/annotation/meta/a, s);
    }

    public static a[] values()
    {
        return (a[])$VALUES.clone();
    }

    static 
    {
        ALWAYS = new a("ALWAYS", 0);
        UNKNOWN = new a("UNKNOWN", 1);
        MAYBE = new a("MAYBE", 2);
        NEVER = new a("NEVER", 3);
        $VALUES = (new a[] {
            ALWAYS, UNKNOWN, MAYBE, NEVER
        });
    }
}
