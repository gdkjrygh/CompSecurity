// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package fs.org.simpleframework.xml.stream;


public final class Mode extends Enum
{

    private static final Mode $VALUES[];
    public static final Mode DATA;
    public static final Mode ESCAPE;
    public static final Mode INHERIT;

    private Mode(String s, int i)
    {
        super(s, i);
    }

    public static Mode valueOf(String s)
    {
        return (Mode)Enum.valueOf(fs/org/simpleframework/xml/stream/Mode, s);
    }

    public static final Mode[] values()
    {
        return (Mode[])$VALUES.clone();
    }

    static 
    {
        DATA = new Mode("DATA", 0);
        ESCAPE = new Mode("ESCAPE", 1);
        INHERIT = new Mode("INHERIT", 2);
        $VALUES = (new Mode[] {
            DATA, ESCAPE, INHERIT
        });
    }
}
