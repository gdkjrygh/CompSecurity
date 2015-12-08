// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.a.a.b.b.a;


// Referenced classes of package org.a.a.b.b.a:
//            f

public static final class it> extends Enum
{

    public static final c a;
    public static final c b;
    public static final c c;
    private static final c d[];

    public static it> valueOf(String s)
    {
        return (it>)Enum.valueOf(org/a/a/b/b/a/f$a, s);
    }

    public static final ueOf[] values()
    {
        return (ueOf[])d.clone();
    }

    static 
    {
        a = new <init>("semiColonRequired", 0);
        b = new <init>("semiColonOptional", 1);
        c = new <init>("errorIfNoSemiColon", 2);
        d = (new d[] {
            a, b, c
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
