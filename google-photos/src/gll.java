// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import java.util.List;

public class gll extends gkt
{

    private static final oqe b;
    private static final int c;
    private static final int d;

    gll(Context context, List list)
    {
        gle gle1 = new gle();
        gle1.a = c;
        gle1.b = d;
        gle1.c = 2;
        super(context, gle1.a(), new gmb(context, ekp), new glf(new glm()), (new glk(context)).a, list);
    }

    static 
    {
        oqe oqe1 = new oqe("debug.photos.metadata_per_page", "75");
        b = oqe1;
        c = Integer.parseInt(oqe1.a);
        d = 6250 / c;
    }
}
