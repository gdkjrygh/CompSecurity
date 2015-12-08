// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.graphics.Point;
import android.os.Bundle;
import android.view.ScaleGestureDetector;
import android.view.View;
import com.google.android.apps.photos.touchcapture.TouchCaptureView;
import java.util.Arrays;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.List;

public class jhm
    implements android.view.ScaleGestureDetector.OnScaleGestureListener, nwn, omb, oov, opl, opp, opr, ops, opv
{

    public List a;
    public final EnumMap b;
    public Enum c;
    public boolean d;
    private final am e;
    private final jhu f;
    private final int g;
    private final jhn h;
    private final Point i = new Point();
    private nwm j;
    private iwc k;
    private jhs l;
    private fpn m;
    private float n;
    private jhv o;

    public jhm(am am1, opd opd1, Class class1, jhu jhu1, int i1, jhn jhn1)
    {
        d = true;
        e = am1;
        f = jhu1;
        g = i1;
        h = jhn1;
        b = new EnumMap(class1);
        opd1.a(this);
    }

    static EnumMap a(jhm jhm1)
    {
        return jhm1.b;
    }

    private void a(Enum enum)
    {
        e.h().a().b((am)b.get(enum)).b();
        ((am)b.get(enum)).g_(false);
    }

    static void a(jhm jhm1, Enum enum)
    {
        jhm1.e.h().a().c((am)jhm1.b.get(enum)).b();
        ((am)jhm1.b.get(enum)).g_(true);
    }

    static jhu b(jhm jhm1)
    {
        return jhm1.f;
    }

    private jhw b(Enum enum, Point point)
    {
        if (!h.a(c, enum, point))
        {
            return null;
        } else
        {
            enum = new jhw(this, c, enum);
            m.b();
            return enum;
        }
    }

    static void b(jhm jhm1, Enum enum)
    {
        jhm1.a(enum);
    }

    static Enum c(jhm jhm1, Enum enum)
    {
        jhm1.c = enum;
        return enum;
    }

    static jhs c(jhm jhm1)
    {
        return jhm1.l;
    }

    static ay d(jhm jhm1)
    {
        return jhm1.e.h();
    }

    static am e(jhm jhm1)
    {
        return jhm1.e;
    }

    static nwm f(jhm jhm1)
    {
        return jhm1.j;
    }

    static jhn g(jhm jhm1)
    {
        return jhm1.h;
    }

    static void h(jhm jhm1)
    {
        jhm1.o = null;
    }

    public final void a(Context context, olm olm1, Bundle bundle)
    {
        j = (nwm)olm1.a(nwm);
        k = (iwc)olm1.a(iwc);
        m = (fpn)olm1.a(fpn);
        l = new jhs(new ScaleGestureDetector(context, this));
        a = Arrays.asList(f.z());
    }

    public final void a(Bundle bundle)
    {
        if (bundle != null)
        {
            c = (Enum)bundle.getSerializable("com.google.android.apps.photos.zoom.ZoomLevelManager.current_level");
        } else
        {
            c = f.y();
            bundle = a.iterator();
            while (bundle.hasNext()) 
            {
                Enum enum = (Enum)bundle.next();
                am am1;
                bp bp1;
                String s;
                String s1;
                boolean flag;
                int i1;
                boolean flag1;
                if (enum != c)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                am1 = f.b(enum);
                if (!flag)
                {
                    flag1 = true;
                } else
                {
                    flag1 = false;
                }
                am1.g_(flag1);
                bp1 = e.h().a();
                i1 = g;
                s = String.valueOf("com.google.android.apps.photos.zoom.ZoomLevelManager.fragment_");
                s1 = String.valueOf(enum);
                bp1 = bp1.a(i1, am1, (new StringBuilder(String.valueOf(s).length() + 0 + String.valueOf(s1).length())).append(s).append(s1).toString());
                if (flag)
                {
                    bp1.b(am1);
                }
                bp1.b();
                b.put(enum, am1);
            }
        }
    }

    public final void a(View view, Bundle bundle)
    {
        if (bundle != null)
        {
            view = a.iterator();
            do
            {
                if (!view.hasNext())
                {
                    break;
                }
                bundle = (Enum)view.next();
                EnumMap enummap = b;
                ay ay1 = e.h();
                String s = String.valueOf("com.google.android.apps.photos.zoom.ZoomLevelManager.fragment_");
                String s1 = String.valueOf(bundle);
                enummap.put(bundle, ay1.a((new StringBuilder(String.valueOf(s).length() + 0 + String.valueOf(s1).length())).append(s).append(s1).toString()));
                if (bundle != c)
                {
                    a(((Enum) (bundle)));
                }
            } while (true);
        }
    }

    public final void a(Enum enum, Point point)
    {
        if (a.contains(enum) && enum != c)
        {
            if ((enum = b(enum, point)) != null)
            {
                enum.d = jht.e;
                enum.b(1.0F);
                enum.a(point);
                return;
            }
        }
    }

    public final void al_()
    {
        k.a().a(l);
    }

    public final void am_()
    {
        k.a().b(l);
    }

    public final void e(Bundle bundle)
    {
        bundle.putSerializable("com.google.android.apps.photos.zoom.ZoomLevelManager.current_level", c);
    }

    public boolean onScale(ScaleGestureDetector scalegesturedetector)
    {
        n = n * scalegesturedetector.getScaleFactor();
        if (o == null) goto _L2; else goto _L1
_L1:
        o.a(n);
_L4:
        return true;
_L2:
        int i1;
        i1 = a.indexOf(c);
        i.set((int)scalegesturedetector.getFocusX(), (int)scalegesturedetector.getFocusY());
        if (n <= 1.0F || i1 >= a.size() - 1)
        {
            break; /* Loop/switch isn't completed */
        }
        o = b((Enum)a.get(i1 + 1), i);
_L5:
        if (o != null)
        {
            o.a(n, i);
        }
        if (true) goto _L4; else goto _L3
_L3:
        if (n < 1.0F && i1 > 0)
        {
            o = b((Enum)a.get(i1 - 1), i);
        } else
        if (n < 1.0F && i1 == 0)
        {
            scalegesturedetector = new jhp(this, ((am)b.get(a.get(0))).R);
            m.b();
            o = scalegesturedetector;
        }
          goto _L5
        if (true) goto _L4; else goto _L6
_L6:
    }

    public boolean onScaleBegin(ScaleGestureDetector scalegesturedetector)
    {
        if (!d || o != null)
        {
            return false;
        } else
        {
            n = 1.0F;
            return true;
        }
    }

    public void onScaleEnd(ScaleGestureDetector scalegesturedetector)
    {
        if (o != null)
        {
            o.a();
        }
    }

    public final am u()
    {
        return (am)b.get(c);
    }
}
