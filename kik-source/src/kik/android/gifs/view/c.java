// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.gifs.view;

import com.kik.g.p;
import com.kik.g.r;

// Referenced classes of package kik.android.gifs.view:
//            a, GifView

final class c extends r
{

    final p a;
    final GifView b;

    c(GifView gifview, p p1)
    {
        b = gifview;
        a = p1;
        super();
    }

    public final volatile void a(Object obj)
    {
        obj = (a)obj;
        GifView.a(b, ((a) (obj)));
        a.a(obj);
    }

    public final void a(Throwable throwable)
    {
        a.a(throwable);
    }
}
