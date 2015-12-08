// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class bhv
    implements ckz
{

    private bnl a;

    bhv(bhu bhu, bnl bnl1)
    {
        a = bnl1;
        super();
    }

    public final int a()
    {
        int i = lvd.a(a.a, "moviemaker:video_decoder_count", 2);
        boolean flag;
        if (a.j() || i >= 2)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        c.a(flag, "playback requires two decoders or one adaptive decoder");
        return i;
    }

    public final boolean b()
    {
        return lvd.a(a.a, "moviemaker:reuse_video_decoders_enabled", true);
    }
}
