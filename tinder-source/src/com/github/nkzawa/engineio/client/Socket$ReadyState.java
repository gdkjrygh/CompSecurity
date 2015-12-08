// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.github.nkzawa.engineio.client;


// Referenced classes of package com.github.nkzawa.engineio.client:
//            Socket

private static final class _cls9 extends Enum
{

    public static final d a;
    public static final d b;
    public static final d c;
    public static final d d;
    private static final d e[];

    public static _cls9 valueOf(String s)
    {
        return (_cls9)Enum.valueOf(com/github/nkzawa/engineio/client/Socket$ReadyState, s);
    }

    public static _cls9[] values()
    {
        return (_cls9[])e.clone();
    }

    public final String toString()
    {
        return super.toString().toLowerCase();
    }

    static 
    {
        a = new <init>("OPENING", 0);
        b = new <init>("OPEN", 1);
        c = new <init>("CLOSING", 2);
        d = new <init>("CLOSED", 3);
        e = (new e[] {
            a, b, c, d
        });
    }

    private _cls9(String s, int i)
    {
        super(s, i);
    }
}
