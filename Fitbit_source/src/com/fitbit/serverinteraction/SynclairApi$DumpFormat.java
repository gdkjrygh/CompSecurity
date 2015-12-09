// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.serverinteraction;


// Referenced classes of package com.fitbit.serverinteraction:
//            SynclairApi

static abstract class <init> extends Enum
{

    public static final b a;
    public static final b b;
    private static final b c[];
    final String name;

    public static <init> valueOf(String s)
    {
        return (<init>)Enum.valueOf(com/fitbit/serverinteraction/SynclairApi$DumpFormat, s);
    }

    public static <init>[] values()
    {
        return (<init>[])c.clone();
    }

    abstract byte[] a(byte abyte0[]);

    abstract byte[] b(byte abyte0[]);

    static 
    {
    /* block-local class not found */
    class _cls1 {}

        a = new _cls1("BASE_64", 0, "base64");
    /* block-local class not found */
    class _cls2 {}

        b = new _cls2("HEX", 1, "hex");
        c = (new c[] {
            a, b
        });
    }

    private _cls2(String s, int i, String s1)
    {
        super(s, i);
        name = s1;
    }

    name(String s, int i, String s1, name name1)
    {
        this(s, i, s1);
    }
}
