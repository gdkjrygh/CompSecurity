// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.media.MediaPlayer;

final class ehh
    implements android.media.MediaPlayer.OnPreparedListener
{

    private boolean a;
    private ehb b;

    ehh(ehb ehb1, boolean flag)
    {
        b = ehb1;
        a = flag;
        super();
    }

    public final void onPrepared(MediaPlayer mediaplayer)
    {
        b.i.seekTo(0);
        b.d();
        b.a(b.g.f, false);
        mediaplayer = b;
        if (((ehb) (mediaplayer)).i.getDuration() > 0 && ((ehb) (mediaplayer)).n != null)
        {
            float f = (float)((ehb) (mediaplayer)).n.a / (float)((ehb) (mediaplayer)).i.getDuration();
            float f1 = (float)((ehb) (mediaplayer)).n.b / (float)((ehb) (mediaplayer)).i.getDuration();
            ((ehb) (mediaplayer)).c.a(f, f1, false);
            ((ehb) (mediaplayer)).d.a(new jge(f, f1));
        }
        b.b.a(true);
        if (a)
        {
            ehb.a(b);
            b.f.a(jek.b);
            b.g.a();
        }
    }
}
