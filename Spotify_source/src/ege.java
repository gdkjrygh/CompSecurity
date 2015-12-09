// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.spotify.mobile.android.service.media.MediaAction;
import com.spotify.mobile.android.service.media.MediaService;
import java.util.List;

final class ege
    implements ega
{

    private egd a;

    private ege(egd egd1)
    {
        a = egd1;
        super();
    }

    ege(egd egd1, byte byte0)
    {
        this(egd1);
    }

    public final void a()
    {
        egd.a(a);
    }

    public final void b()
    {
        egd.a(a);
    }

    public final void c()
    {
        a.b.i();
    }

    public final void d()
    {
        a.b.h();
    }

    public final void e()
    {
        egd egd1 = a;
        if (egd1.i.e.contains(MediaAction.l))
        {
            egd1.b.a(MediaAction.l.name());
        } else
        if (egd1.i.e.contains(MediaAction.m))
        {
            egd1.b.a(MediaAction.m.name());
            return;
        }
    }

    public final void f()
    {
        a.d();
    }
}
