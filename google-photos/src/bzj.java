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

public final class bzj
    implements android.view.View.OnClickListener, jih, orv
{

    private final Set a = EnumSet.noneOf(oru);
    private final rv b = null;
    private final VideoTrimView c = null;
    private final List d;
    private final Animation e;
    private final Animation f;
    private boolean g;

    public transient bzj(Context context, rv rv, VideoTrimView videotrimview, View aview[])
    {
        g = false;
        d = Arrays.asList(aview);
        e = AnimationUtils.loadAnimation(context, 0x10a0001);
        f = AnimationUtils.loadAnimation(context, 0x10a0000);
    }

    static void a(bzj bzj1)
    {
        bzj1.b();
    }

    private void a(boolean flag)
    {
        (new Handler(Looper.getMainLooper())).post(new bzl(this, flag));
    }

    static boolean a(bzj bzj1, boolean flag)
    {
        bzj1.g = flag;
        return flag;
    }

    static rv b(bzj bzj1)
    {
        return bzj1.b;
    }

    private void b()
    {
        (new Handler(Looper.getMainLooper())).post(new bzm(this));
    }

    static List c(bzj bzj1)
    {
        return bzj1.d;
    }

    static VideoTrimView d(bzj bzj1)
    {
        return bzj1.c;
    }

    public final void a(View view)
    {
        if (view != null && view.getVisibility() != 0)
        {
            view.clearAnimation();
            view.startAnimation(f);
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
            (new Handler(Looper.getMainLooper())).post(new bzk(this));
            return;
        }
    }

    public final void b(View view)
    {
        if (view != null && view.getVisibility() != 4)
        {
            view.clearAnimation();
            view.startAnimation(e);
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
        if (g)
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
