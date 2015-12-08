// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.util.DisplayMetrics;
import android.util.Log;

public final class ing extends nzc
{

    private final iuj a;
    private final String b;
    private final String c;
    private final boolean d;
    private final boolean e;
    private final Point r[];
    private final boolean s;
    private final boolean t;

    public ing(Context context, int i, iuj iuj1, String s1, String s2, boolean flag, boolean flag1, 
            Point apoint[], boolean flag2, boolean flag3)
    {
        super(context, (new nyh()).a(context, i).a(), "getstory", new pbl(), new pbm());
        a = iuj1;
        b = s1;
        c = s2;
        d = flag;
        e = flag1;
        r = apoint;
        s = flag2;
        t = flag3;
    }

    protected final void a(qlw qlw)
    {
        qlw = (pbl)qlw;
        qlw.a = new pdy();
        qlw = ((pbl) (qlw)).a;
        qlw.a = new pec();
        ((pdy) (qlw)).a.b = b;
        ((pdy) (qlw)).a.c = c;
        ((pdy) (qlw)).a.a = new pdr();
        ((pdy) (qlw)).a.a.b = Boolean.valueOf(true);
        ((pdy) (qlw)).a.d = Boolean.valueOf(true);
        if (r != null)
        {
            ((pdy) (qlw)).a.a.a = new pds[r.length];
            Point apoint[] = r;
            int k = apoint.length;
            int j = 0;
            for (int i = 0; j < k; i++)
            {
                Point point = apoint[j];
                pds pds1 = new pds();
                pds1.a = Float.valueOf(point.x);
                pds1.b = Float.valueOf(point.y);
                pds1.c = Float.valueOf(g.getResources().getDisplayMetrics().density);
                ((pdy) (qlw)).a.a.a[i] = pds1;
                j++;
            }

        }
        qlw.b = new pgp();
        ((pdy) (qlw)).b.b = a.a;
        qlw.c = new ped();
        ((pdy) (qlw)).c.a = Boolean.valueOf(d);
        ((pdy) (qlw)).c.b = Boolean.valueOf(e);
        qlw.d = new plj();
        ((pdy) (qlw)).d.b = Boolean.valueOf(false);
        ((pdy) (qlw)).d.c = Boolean.valueOf(false);
        ((pdy) (qlw)).d.d = Boolean.valueOf(true);
        ((pdy) (qlw)).d.a = Boolean.valueOf(false);
        qlw.e = Boolean.valueOf(s);
        qlw.f = Boolean.valueOf(t);
    }

    protected final void an_()
    {
        super.an_();
        if (!Log.isLoggable("GetStoryOperation", 2))
        {
            return;
        } else
        {
            boolean flag = t;
            String s1 = String.valueOf(a.a);
            (new StringBuilder(String.valueOf(s1).length() + 39)).append("Request GetStory initialChunk=").append(flag).append(" id=").append(s1);
            return;
        }
    }

    protected final void b(qlw qlw)
    {
        qlw = (pbm)qlw;
        super.b(qlw);
        if (Log.isLoggable("GetStoryOperation", 2) && qlw != null && ((pbm) (qlw)).a != null && ((pbm) (qlw)).a.a != null && ((pbm) (qlw)).a.a.f != null && ((pbm) (qlw)).a.a.f.c != null)
        {
            qlw = String.valueOf(((pbm) (qlw)).a.a.f.c);
            (new StringBuilder(String.valueOf(qlw).length() + 35)).append("Response GetStory initialChunkOnly=").append(qlw);
        }
    }
}
