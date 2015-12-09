// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.spotify.android.paste.widget.carousel.CarouselLayoutManager;
import com.spotify.mobile.android.spotlets.momentsstart.view.MomentView;

public final class evg extends CarouselLayoutManager
{

    public final MomentView b;
    private evh c;

    public evg(MomentView momentview, com.spotify.android.paste.widget.carousel.CarouselLayoutManager.MeasureMode measuremode)
    {
        b = momentview;
        super(measuremode);
        c = new evh(b.getContext());
    }

    static evh a(evg evg1)
    {
        return evg1.c;
    }

    static int b(evg evg1)
    {
        evg1.a = 0;
        return 0;
    }

    // Unreferenced inner class evg$1

/* anonymous class */
    public final class _cls1
        implements Runnable
    {

        private evg a;

        public final void run()
        {
            evg.a(a).b(0);
            a.a(evg.a(a));
            evg.b(a);
        }

            public 
            {
                a = evg.this;
                super();
            }
    }

}
