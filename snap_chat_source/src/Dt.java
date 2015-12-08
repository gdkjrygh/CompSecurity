// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.ViewGroup;
import com.snapchat.android.rendering.SnapMediaRenderer;

public final class Dt
    implements Dv
{

    private final SnapMediaRenderer a[];
    private int b;

    public Dt(SnapMediaRenderer snapmediarenderer, SnapMediaRenderer snapmediarenderer1)
    {
        this(new SnapMediaRenderer[] {
            snapmediarenderer, snapmediarenderer1
        });
    }

    private Dt(SnapMediaRenderer asnapmediarenderer[])
    {
        b = 0;
        a = asnapmediarenderer;
    }

    public final void a()
    {
        SnapMediaRenderer asnapmediarenderer[] = a;
        int j = asnapmediarenderer.length;
        for (int i = 0; i < j; i++)
        {
            asnapmediarenderer[i].d();
        }

    }

    public final void a(ViewGroup viewgroup)
    {
        SnapMediaRenderer asnapmediarenderer[] = a;
        int j = asnapmediarenderer.length;
        for (int i = 0; i < j; i++)
        {
            asnapmediarenderer[i].a(viewgroup);
        }

    }

    public final void a(SnapMediaRenderer snapmediarenderer)
    {
        SnapMediaRenderer asnapmediarenderer[] = a;
        int j = asnapmediarenderer.length;
        for (int i = 0; i < j; i++)
        {
            SnapMediaRenderer snapmediarenderer1 = asnapmediarenderer[i];
            if (snapmediarenderer1 != snapmediarenderer)
            {
                snapmediarenderer1.d();
            }
        }

    }

    public final SnapMediaRenderer b()
    {
        SnapMediaRenderer asnapmediarenderer[] = a;
        int i = b;
        b = i + 1;
        return asnapmediarenderer[i % 2];
    }
}
