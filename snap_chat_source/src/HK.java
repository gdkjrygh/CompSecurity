// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.squareup.otto.Bus;

public final class HK extends HG
{

    private final GO b;

    public HK(GO go)
    {
        b = go;
    }

    public final String a()
    {
        return "Weather";
    }

    public final boolean a(MotionEvent motionevent)
    {
        ViewGroup viewgroup = (ViewGroup)b.d.findViewById(0x7f0d055e);
        Rect rect = new Rect();
        viewgroup.getHitRect(rect);
        return rect.contains((int)motionevent.getX(), (int)motionevent.getY());
    }

    public final View d()
    {
        return b.d;
    }

    public final void e()
    {
        GO go = b;
        go.c.b(go);
        go.b.a(0x7f040111, go.d);
        go.d = null;
    }
}
