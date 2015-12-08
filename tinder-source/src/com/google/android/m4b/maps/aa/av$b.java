// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.aa;


// Referenced classes of package com.google.android.m4b.maps.aa:
//            av

static class <init> extends Enum
{

    public static final e a;
    public static final e b;
    public static final e c;
    public static final e d;
    public static final e e;
    private static final e f[];

    public static <init> valueOf(String s)
    {
        return (<init>)Enum.valueOf(com/google/android/m4b/maps/aa/av$b, s);
    }

    public static <init>[] values()
    {
        return (<init>[])f.clone();
    }

    static 
    {
        a = new av.b("EXPLICIT") {

        };
        b = new av.b("REPLACED") {

        };
        c = new av.b("COLLECTED") {

        };
        d = new av.b("EXPIRED") {

        };
        e = new av.b("SIZE") {

        };
        f = (new f[] {
            a, b, c, d, e
        });
    }

    private _cls5(String s, int i)
    {
        super(s, i);
    }

    _cls5(String s, int i, byte byte0)
    {
        this(s, i);
    }
}
