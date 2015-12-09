// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.common.base.Optional;
import com.spotify.mobile.android.service.media.MediaService;
import com.spotify.music.spotlets.radio.model.ThumbState;

public final class ehb extends ehi
    implements eav
{

    private Optional b;

    public ehb(MediaService mediaservice, egu egu)
    {
        super(mediaservice, egu);
        b = Optional.c(null);
    }

    public static com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol.Rating a(Optional optional)
    {
        if (!optional.b()) goto _L2; else goto _L1
_L1:
        final class _cls1
        {

            static final int a[];

            static 
            {
                a = new int[ThumbState.values().length];
                try
                {
                    a[ThumbState.b.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[ThumbState.c.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        _cls1.a[((gpg)optional.c()).a().ordinal()];
        JVM INSTR tableswitch 1 2: default 48
    //                   1 59
    //                   2 64;
           goto _L3 _L4 _L5
_L3:
        int i = 0;
_L6:
        return new com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol.Rating(i);
_L4:
        i = 1;
        continue; /* Loop/switch isn't completed */
_L5:
        i = -1;
        if (true) goto _L6; else goto _L2
_L2:
        return com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol.Rating.DEFAULT;
    }

    protected final void a()
    {
        a.a(this);
    }

    public final volatile void a(int i)
    {
        super.a(i);
    }

    public final void a(gpg gpg1)
    {
        boolean flag = gpg1.a().equals(ThumbState.b);
        if (!b.b() || !((Boolean)b.c()).equals(Boolean.valueOf(flag)))
        {
            b = Optional.c(Boolean.valueOf(flag));
            a(a(Optional.b(gpg1)));
        }
    }

    public final void b()
    {
        a(a(a.c));
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
