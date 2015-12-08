// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public abstract class icv extends Enum
{

    public static final icv a;
    public static final icv b;
    public static final icv c;
    public static final icv d;
    public static final icv e;
    public static final icv f;
    private static icv h;
    private static icv i;
    private static final Map j;
    private static final icv k[];
    final String g;

    private icv(String s, int l, String s1)
    {
        super(s, l);
        g = s1;
    }

    icv(String s, int l, String s1, byte byte0)
    {
        this(s, l, s1);
    }

    static icv a(String s)
    {
        icv icv1 = (icv)j.get(s);
        if (icv1 == null)
        {
            s = String.valueOf(s);
            if (s.length() != 0)
            {
                s = "Unrecognized name: ".concat(s);
            } else
            {
                s = new String("Unrecognized name: ");
            }
            throw new IllegalArgumentException(s);
        } else
        {
            return icv1;
        }
    }

    public static icv valueOf(String s)
    {
        return (icv)Enum.valueOf(icv, s);
    }

    public static icv[] values()
    {
        return (icv[])k.clone();
    }

    abstract void a(nwe nwe, boolean flag);

    abstract boolean a(nwc nwc);

    static 
    {
        int l = 0;
        a = new icw("AUTO_CREATE", 0, "auto_create");
        h = new icx("DRIVE_PHOTOS_ALLOWED", 1, "drive_photos_allowed");
        b = new icy("DRIVE_PHOTOS_ENABLED", 2, "drive_photos_enabled");
        c = new icz("SHARE_LOCATION", 3, "share_location");
        i = new ida("FACE_CLUSTERING_ALLOWED", 4, "face_clustering_allowed");
        d = new idb("FACE_CLUSTERING_ENABLED", 5, "face_clustering_enabled");
        e = new idc("TIME_MACHINE_ALLOWED", 6, "time_machine_allowed");
        f = new idd("TIME_MACHINE_ENABLED", 7, "time_machine_enabled");
        k = (new icv[] {
            a, h, b, c, i, d, e, f
        });
        HashMap hashmap = new HashMap();
        icv aicv[] = values();
        for (int i1 = aicv.length; l < i1; l++)
        {
            icv icv1 = aicv[l];
            hashmap.put(icv1.g, icv1);
        }

        j = Collections.unmodifiableMap(hashmap);
    }
}
