// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.squareup.otto.Bus;

public final class HH extends HG
{

    private GN b;

    public HH(GN gn)
    {
        b = gn;
    }

    public final String a()
    {
        return "Speed";
    }

    public final boolean a(MotionEvent motionevent)
    {
        ViewGroup viewgroup = (ViewGroup)b.c.findViewById(0x7f0d04ae);
        Rect rect = new Rect();
        viewgroup.getHitRect(rect);
        return rect.contains((int)motionevent.getX(), (int)motionevent.getY());
    }

    public final View d()
    {
        return b.c;
    }

    public final void e()
    {
        GN gn = b;
        gn.b.b(gn);
        gn.a.a(0x7f0400e2, gn.c);
        gn.c = null;
    }
}
