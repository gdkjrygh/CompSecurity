// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package crittercism.android;


public final class ea extends Enum
{

    public static final ea a;
    public static final ea b;
    public static final ea c;
    public static final ea d;
    public static final ea e;
    public static final ea f;
    public static final ea g;
    public static final ea h;
    public static final ea i;
    public static final ea j;
    public static final ea k;
    private static final ea l[];

    private ea(String s, int i1)
    {
        super(s, i1);
    }

    public static ea valueOf(String s)
    {
        return (ea)Enum.valueOf(crittercism/android/ea, s);
    }

    public static ea[] values()
    {
        return (ea[])l.clone();
    }

    static 
    {
        a = new ea("DISKSPACEFREE_EXTERNAL_STORAGE_DIRECTORY_FAULT", 0);
        b = new ea("DISKSPACETOTAL_EXTERNAL_STORAGE_DIRECTORY_FAULT", 1);
        c = new ea("SDSPACEFREE_EXTERNAL_STORAGE_DIRECTORY_FAULT", 2);
        d = new ea("SDSPACETOTAL_EXTERNAL_STORAGE_DIRECTORY_FAULT", 3);
        e = new ea("GENERIC_HANDLER_DO_OPEN_CONNECTION_FAULT", 4);
        f = new ea("STREAM_HANDLER_FACTORY_ANNUL_REFLECTION_FAULT", 5);
        g = new ea("STREAM_HANDLER_FACTORY_CLEAR_STREAM_HANDLERS_FAULT", 6);
        h = new ea("HASHED_DEVICE_ID_GENERATE_FROM_DROID_ID_FAULT", 7);
        i = new ea("HASHED_DEVICE_ID_GENERATE_FROM_TELCO_ID_FAULT", 8);
        j = new ea("HASHED_DEVICE_ID_GENERATE_RANDOM_ID_FAULT", 9);
        k = new ea("TXN_CRASH_ALL_FAULT", 10);
        l = (new ea[] {
            a, b, c, d, e, f, g, h, i, j, 
            k
        });
    }
}
