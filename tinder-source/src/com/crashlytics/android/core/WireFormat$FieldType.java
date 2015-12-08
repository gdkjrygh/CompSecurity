// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android.core;


// Referenced classes of package com.crashlytics.android.core:
//            WireFormat

static class <init> extends Enum
{

    public static final r a;
    public static final r b;
    public static final r c;
    public static final r d;
    public static final r e;
    public static final r f;
    public static final r g;
    public static final r h;
    public static final r i;
    public static final r j;
    public static final r k;
    public static final r l;
    public static final r m;
    public static final r n;
    public static final r o;
    public static final r p;
    public static final r q;
    public static final r r;
    private static final r u[];
    private final r s;
    private final int t;

    public static <init> valueOf(String s1)
    {
        return (<init>)Enum.valueOf(com/crashlytics/android/core/WireFormat$FieldType, s1);
    }

    public static <init>[] values()
    {
        return (<init>[])u.clone();
    }

    static 
    {
        a = new <init>("DOUBLE", 0, , 1);
        b = new <init>("FLOAT", 1, , 5);
        c = new <init>("INT64", 2, , 0);
        d = new <init>("UINT64", 3, , 0);
        e = new <init>("INT32", 4, , 0);
        f = new <init>("FIXED64", 5, , 1);
        g = new <init>("FIXED32", 6, , 5);
        h = new <init>("BOOL", 7, , 0);
        i = new WireFormat.FieldType("STRING", ) {

        };
        j = new WireFormat.FieldType("GROUP", ) {

        };
        k = new WireFormat.FieldType("MESSAGE", ) {

        };
        l = new WireFormat.FieldType("BYTES", ) {

        };
        m = new <init>("UINT32", 12, , 0);
        n = new <init>("ENUM", 13, , 0);
        o = new <init>("SFIXED32", 14, , 5);
        p = new <init>("SFIXED64", 15, , 1);
        q = new <init>("SINT32", 16, , 0);
        r = new <init>("SINT64", 17, , 0);
        u = (new u[] {
            a, b, c, d, e, f, g, h, i, j, 
            k, l, m, n, o, p, q, r
        });
    }

    private _cls4(String s1, int i1, _cls4 _pcls4, int j1)
    {
        super(s1, i1);
        s = _pcls4;
        t = j1;
    }

    t(String s1, int i1, t t1, int j1, byte byte0)
    {
        this(s1, i1, t1, j1);
    }
}
