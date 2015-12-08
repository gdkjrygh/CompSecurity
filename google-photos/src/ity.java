// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.PointF;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import com.google.android.apps.photos.stories.StoryEditText;

final class ity
    implements Runnable
{

    final itf a;
    private boolean b;
    private float c;

    ity(itf itf1, boolean flag, float f)
    {
        a = itf1;
        b = flag;
        c = f;
        super();
    }

    public final void run()
    {
        if (a.O_() != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        Object obj;
        View view;
        View view1;
        obj = ((am) (a)).R.findViewById(s.cb);
        view = ((am) (a)).R.findViewById(s.cm);
        view1 = ((am) (a)).R.findViewById(s.cc);
        if (!b)
        {
            break; /* Loop/switch isn't completed */
        }
        itf.a(a, iua.b);
        itf.a(a, itf.t(a).setListener(new itz(this)));
        if (android.os.Build.VERSION.SDK_INT >= 21)
        {
            itf.u(a).z(c);
        }
        itf.u(a).start();
        ((View) (obj)).setVisibility(0);
        ((View) (obj)).setAlpha(0.0F);
        ((View) (obj)).animate().alpha(0.87F).setDuration(250L).start();
        if (itf.v(a))
        {
            itf.w(a);
        }
        if (itf.s(a).getVisibility() == 0)
        {
            obj = AnimationUtils.loadAnimation(a.O_(), s.aK);
            ((Animation) (obj)).setInterpolator(a.O_(), s.aE);
            ((Animation) (obj)).setDuration(250L);
            itf.s(a).setAlpha(1.0F);
            itf.s(a).startAnimation(((Animation) (obj)));
            return;
        }
        if (true) goto _L1; else goto _L3
_L3:
        PointF pointf = itf.x(a);
        itf.a(a).setX(pointf.x);
        itf.a(a).setY(pointf.y);
        if (android.os.Build.VERSION.SDK_INT >= 21)
        {
            itf.a(a).setZ(c);
        }
        itf.a(a).setScaleX(itf.y(a));
        itf.a(a).setScaleY(itf.y(a));
        itf.a(a).setVisibility(0);
        view.setVisibility(0);
        ((View) (obj)).setAlpha(0.87F);
        view1.setAlpha(0.87F);
        if (itf.s(a).getVisibility() == 0)
        {
            itf.s(a).setAlpha(1.0F);
        }
        if (!itf.j(a))
        {
            itf.q(a);
            return;
        }
        if (true) goto _L1; else goto _L4
_L4:
    }
}
