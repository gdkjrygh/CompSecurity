// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Bundle;
import java.util.List;

public final class igy
    implements mti, omb, opv
{

    public mtj a;
    public igx b;
    private final gfz c;
    private noz d;

    public igy(opd opd1, gfz gfz1)
    {
        c = gfz1;
        opd1.a(this);
    }

    public final void a()
    {
        if (b.d)
        {
            c.a();
        } else
        if (!a.a("LoadRecentAppsTask"))
        {
            a.a(new igw());
            return;
        }
    }

    public final void a(Context context, olm olm1, Bundle bundle)
    {
        a = ((mtj)olm1.a(mtj)).a(this);
        b = (igx)olm1.a(igx);
        d = noz.a(context, "RecentAppsMixin", new String[0]);
    }

    public final void a(String s, mue mue1, mua mua)
    {
        if ("LoadRecentAppsTask".equals(s))
        {
            if (mue1 != null && !mue1.c())
            {
                s = mue1.a().getStringArrayList("recent_list");
                mue1 = b;
                ((igx) (mue1)).c.clear();
                ((igx) (mue1)).c.addAll(s);
                mue1.d = true;
                mue1.a();
                c.a();
            } else
            if (d.a())
            {
                noy.a("result", mue1);
                return;
            }
        }
    }
}
