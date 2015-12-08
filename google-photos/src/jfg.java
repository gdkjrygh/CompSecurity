// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.Bitmap;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.google.android.apps.photos.videoplayer.view.VideoViewHolder;

final class jfg
    implements gxs
{

    private jev a;

    jfg(jev jev1)
    {
        a = jev1;
        super();
    }

    public final void a()
    {
        jev.a(a, true);
        jev.a(a, "onFragmentActivated()");
        jev.k(a);
        jev.l(a);
    }

    public final void b()
    {
        jev.a(a, false);
        if (jev.m(a) != null)
        {
            jhb jhb1 = jev.o(a);
            Object obj = jev.n(a);
            if (obj != null)
            {
                obj = ((VideoViewHolder) (obj)).g();
                if (obj != null)
                {
                    if (jhb1.b != null)
                    {
                        jhb1.b.eraseColor(0);
                    }
                    jhb1.b = ((Bitmap) (obj));
                    jhb1.a.setImageBitmap(((Bitmap) (obj)));
                }
            }
        }
        if (jev.o(a).a())
        {
            jev.o(a).a(0);
        }
        jev.j(a).setVisibility(8);
        jev.n(a).c();
        jev.b(a, "onFragmentDeactivated");
    }

    public final void c()
    {
        jev.b(a, true);
        jev.b(a);
    }

    public final void d()
    {
        jev.b(a, false);
        jev.k(a);
        jev.l(a);
    }
}
