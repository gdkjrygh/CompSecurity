// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import com.google.android.libraries.video.trim.VideoTrimView;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;

final class bgs
    implements android.view.View.OnClickListener, jih, orv
{

    private final Set a = EnumSet.noneOf(oru);
    private final bec b;
    private final rv c;
    private final VideoTrimView d;
    private final List e;
    private final Animation f;
    private final Animation g;
    private boolean h;

    public transient bgs(Context context, bec bec, rv rv, VideoTrimView videotrimview, View aview[])
    {
        h = false;
        b = bec;
        c = rv;
        d = videotrimview;
        e = Arrays.asList(aview);
        f = AnimationUtils.loadAnimation(context, 0x10a0001);
        g = AnimationUtils.loadAnimation(context, 0x10a0000);
    }

    static bec a(bgs bgs1)
    {
        return bgs1.b;
    }

    private void a(boolean flag)
    {
        (new Handler(Looper.getMainLooper())).post(new bgt(this, flag));
    }

    static boolean a(bgs bgs1, boolean flag)
    {
        bgs1.h = flag;
        return flag;
    }

    static rv b(bgs bgs1)
    {
        return bgs1.c;
    }

    private void b()
    {
        (new Handler(Looper.getMainLooper())).post(new bgu(this));
    }

    static List c(bgs bgs1)
    {
        return bgs1.e;
    }

    static VideoTrimView d(bgs bgs1)
    {
        return bgs1.d;
    }

    public final void a(View view)
    {
        if (view != null && view.getVisibility() != 0)
        {
            view.clearAnimation();
            view.startAnimation(g);
            view.setVisibility(0);
        }
    }

    public final void a(jie jie)
    {
    }

    public final void a(orr orr, Set set)
    {
        a.addAll(set);
        a(true);
    }

    public final void a(orr orr, oru oru1)
    {
    }

    public final void a(boolean flag, int i)
    {
        if (flag)
        {
            a(false);
        } else
        if (a.isEmpty())
        {
            b();
            return;
        }
    }

    public final void b(View view)
    {
        if (view != null && view.getVisibility() != 4)
        {
            view.clearAnimation();
            view.startAnimation(f);
            view.setVisibility(4);
        }
    }

    public final void b(orr orr, Set set)
    {
        a.removeAll(set);
        b();
    }

    public final void onClick(View view)
    {
        if (!a.isEmpty())
        {
            return;
        }
        if (h)
        {
            b();
            return;
        } else
        {
            a(false);
            return;
        }
    }

    public final void z_()
    {
    }
}
