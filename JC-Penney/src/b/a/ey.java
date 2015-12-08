// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a;


public final class ey extends Enum
{

    public static final ey a;
    public static final ey b;
    public static final ey c;
    public static final ey d;
    public static final ey e;
    public static final ey f;
    public static final ey g;
    public static final ey h;
    public static final ey i;
    public static final ey j;
    private static final ey k[];

    private ey(String s, int l)
    {
        super(s, l);
    }

    public static ey valueOf(String s)
    {
        return (ey)Enum.valueOf(b/a/ey, s);
    }

    public static ey[] values()
    {
        return (ey[])k.clone();
    }

    static 
    {
        a = new ey("DISKSPACEFREE_EXTERNAL_STORAGE_DIRECTORY_FAULT", 0);
        b = new ey("DISKSPACETOTAL_EXTERNAL_STORAGE_DIRECTORY_FAULT", 1);
        c = new ey("SDSPACEFREE_EXTERNAL_STORAGE_DIRECTORY_FAULT", 2);
        d = new ey("SDSPACETOTAL_EXTERNAL_STORAGE_DIRECTORY_FAULT", 3);
        e = new ey("GENERIC_HANDLER_DO_OPEN_CONNECTION_FAULT", 4);
        f = new ey("STREAM_HANDLER_FACTORY_ANNUL_REFLECTION_FAULT", 5);
        g = new ey("STREAM_HANDLER_FACTORY_CLEAR_STREAM_HANDLERS_FAULT", 6);
        h = new ey("HASHED_DEVICE_ID_GENERATE_RANDOM_ID_FAULT", 7);
        i = new ey("TXN_CRASH_ALL_FAULT", 8);
        j = new ey("CACHED_PROXY_BUILDER_FAULT", 9);
        k = (new ey[] {
            a, b, c, d, e, f, g, h, i, j
        });
    }
}
