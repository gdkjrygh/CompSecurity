// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class gqz
    implements gqx, omb, oor, opp, opr, opv
{

    public final am a;
    public gqw b;
    public dfo c;
    private Animation d;
    private Animation e;
    private final Map f = new HashMap();

    public gqz(am am1, opd opd1)
    {
        a = am1;
        opd1.a(this);
    }

    static Map a(gqz gqz1)
    {
        return gqz1.f;
    }

    private void a(boolean flag, boolean flag1)
    {
        byte byte0;
        if (!flag)
        {
            byte0 = 1;
        } else
        {
            byte0 = 0;
        }
        if (a.R != null)
        {
            Object obj = a.O_().getWindow().getDecorView();
            Iterator iterator;
            Iterator iterator1;
            if (obj != null)
            {
                if (byte0 == 0)
                {
                    if (android.os.Build.VERSION.SDK_INT >= 19)
                    {
                        ((View) (obj)).setSystemUiVisibility(3846);
                    } else
                    {
                        ((View) (obj)).setSystemUiVisibility(1);
                    }
                } else
                if (android.os.Build.VERSION.SDK_INT >= 19)
                {
                    ((View) (obj)).setSystemUiVisibility(1792);
                } else
                {
                    ((View) (obj)).setSystemUiVisibility(0);
                }
            }
        }
        iterator = f.values().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            obj = (List)iterator.next();
            if (obj != null)
            {
                iterator1 = ((List) (obj)).iterator();
                while (iterator1.hasNext()) 
                {
                    View view = (View)iterator1.next();
                    if (flag1)
                    {
                        if (flag)
                        {
                            byte0 = 8;
                        } else
                        {
                            byte0 = 0;
                        }
                        view.setVisibility(byte0);
                    } else
                    {
                        view.requestLayout();
                        Animation animation;
                        if (flag)
                        {
                            animation = e;
                        } else
                        {
                            animation = d;
                        }
                        view.startAnimation(animation);
                    }
                }
            }
        } while (true);
    }

    public final void a(Activity activity)
    {
        if (d == null)
        {
            d = AnimationUtils.loadAnimation(activity, b.tL);
            e = AnimationUtils.loadAnimation(activity, b.tM);
            d.setAnimationListener(new gra(this));
            e.setAnimationListener(new grb(this));
        }
    }

    public final void a(Context context, olm olm1, Bundle bundle)
    {
        b = (gqw)olm1.b(gqw);
        c = (dfo)olm1.a(dfo);
    }

    public final void a(grc grc1)
    {
        f.put(grc1, grc1.t());
    }

    public final void a(boolean flag)
    {
        a(flag, false);
    }

    public final void al_()
    {
        for (Iterator iterator = f.keySet().iterator(); iterator.hasNext(); a((grc)iterator.next())) { }
        if (b != null)
        {
            b.a(this);
            a(b.a(), true);
        }
    }

    public final void am_()
    {
        if (b != null)
        {
            b.b(this);
        }
        grc grc1;
        for (Iterator iterator = f.keySet().iterator(); iterator.hasNext(); f.put(grc1, null))
        {
            grc1 = (grc)iterator.next();
        }

    }

    public final void b(grc grc1)
    {
        f.remove(grc1);
    }
}
