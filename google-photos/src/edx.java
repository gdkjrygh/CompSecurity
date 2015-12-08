// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.support.v7.widget.RecyclerView;
import com.google.android.apps.photos.touchcapture.TouchCaptureView;
import java.util.List;

final class edx
    implements ds
{

    final edp a;
    private iwe b;
    private aff c;
    private afc d;

    edx(edp edp1)
    {
        a = edp1;
        super();
        b = new edy(this);
    }

    public final void b_(Object obj)
    {
        obj = (nwm)obj;
        if (((am) (a)).R != null)
        {
            if (((nwm) (obj)).b() == a)
            {
                if (c == null)
                {
                    c = new owj(edp.i(a));
                    d = new owi(edp.i(a));
                }
                edp.j(a).a().a(b);
                edp.h(a).f = c;
                edp.k(a).a(d);
            } else
            if (c != null)
            {
                edp.j(a).a().b(b);
                edp.h(a).f = null;
                obj = edp.k(a);
                afc afc = d;
                ((ftz) (obj)).a.remove(afc);
                return;
            }
        }
    }
}
