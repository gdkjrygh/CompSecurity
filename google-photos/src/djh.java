// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import java.util.List;

public final class djh extends nzc
{

    public qhb a;
    private final List b;
    private final String c;
    private final String d;

    private djh(Context context, int i, List list, String s, String s1)
    {
        super(context, (new nyh()).a(context, i).a(), "readitemsbyid", new pcl(), new pcm());
        b = list;
        c = s;
        d = s1;
    }

    public static djh a(Context context, int i, List list)
    {
        return a(context, i, list, null);
    }

    public static djh a(Context context, int i, List list, String s)
    {
        return new djh(context, i, list, s, null);
    }

    public static djh b(Context context, int i, List list, String s)
    {
        return new djh(context, i, list, null, s);
    }

    protected final void a(qlw qlw)
    {
        qlw = (pcl)qlw;
        qlw.a = new qha();
        ((pcl) (qlw)).a.e = d;
        ((pcl) (qlw)).a.a = new qfd();
        ((pcl) (qlw)).a.a.a = new qeo[b.size()];
        for (int i = 0; i < b.size(); i++)
        {
            ((pcl) (qlw)).a.a.a[i] = ((djf)b.get(i)).a();
        }

        if (c != null)
        {
            ((pcl) (qlw)).a.a.b = c;
        }
        ((pcl) (qlw)).a.c = b.h();
        ((pcl) (qlw)).a.b = b.i();
        ((pcl) (qlw)).a.d = b.j();
    }

    protected final void b(qlw qlw)
    {
        qlw = (pcm)qlw;
        super.b(qlw);
        a = ((pcm) (qlw)).a;
    }
}
