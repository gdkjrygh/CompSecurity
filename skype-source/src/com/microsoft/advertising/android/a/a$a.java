// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.advertising.android.a;


// Referenced classes of package com.microsoft.advertising.android.a:
//            a

public static final class l extends Enum
{

    public static final k a;
    public static final k b;
    public static final k c;
    public static final k d;
    public static final k e;
    public static final k f;
    public static final k g;
    public static final k h;
    public static final k i;
    public static final k j;
    public static final k k;
    private static final k m[];
    private final boolean l;

    public static l valueOf(String s)
    {
        return (l)Enum.valueOf(com/microsoft/advertising/android/a/a$a, s);
    }

    public static l[] values()
    {
        l al[] = m;
        int i1 = al.length;
        l al1[] = new m[i1];
        System.arraycopy(al, 0, al1, 0, i1);
        return al1;
    }

    static 
    {
        a = new <init>("AD_FETCH_STARTED", 0, false);
        b = new <init>("AD_FETCH_COMPLETED", 1, false);
        c = new <init>("AD_REFRESH_COMPLETE", 2, true);
        d = new <init>("AD_FETCHED", 3, true);
        e = new <init>("ERROR", 4, false);
        f = new <init>("AD_OBJECT_CREATED", 5, false);
        g = new <init>("PRE_RENDER_STARTED", 6, false);
        h = new <init>("PRE_RENDER_FINISHED", 7, false);
        i = new <init>("PUBLISHER_MESSAGE", 8, false);
        j = new <init>("DEBUG_EVENT", 9, false);
        k = new <init>("OTHER", 10, true);
        m = (new m[] {
            a, b, c, d, e, f, g, h, i, j, 
            k
        });
    }

    private (String s, int i1, boolean flag)
    {
        super(s, i1);
        l = flag;
    }
}
