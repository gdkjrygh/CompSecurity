// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.common.base.Optional;
import com.spotify.mobile.android.service.media.MediaService;

public final class ehd extends ehi
    implements eaw
{

    private Optional b;

    public ehd(MediaService mediaservice, egu egu)
    {
        super(mediaservice, egu);
        b = Optional.c(null);
    }

    public static com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol.Saved a(Optional optional)
    {
        if (optional.b())
        {
            return new com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol.Saved(((eaz)optional.c()).a);
        } else
        {
            return com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol.Saved.DEFAULT;
        }
    }

    protected final void a()
    {
        a.a(this);
    }

    public final volatile void a(int i)
    {
        super.a(i);
    }

    public final void a(eaz eaz1)
    {
        eaz1 = a(Optional.b(eaz1));
        Boolean boolean1 = Boolean.valueOf(((com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol.Saved) (eaz1)).saved);
        if (!boolean1.equals(b.d()))
        {
            a(eaz1);
            b = Optional.b(boolean1);
        }
    }

    public final void b()
    {
        a(a(a.d));
    }

    public final volatile void c()
    {
        super.c();
    }

    public final volatile void d()
    {
        super.d();
    }

    public final volatile void e()
    {
        super.e();
    }
}
