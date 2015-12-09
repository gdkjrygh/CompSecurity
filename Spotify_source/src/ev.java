// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Handler;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.PlaybackStateCompat;

public abstract class ev
    implements android.os.IBinder.DeathRecipient
{

    private final Object a;
    private ew b;
    private boolean c;

    public ev()
    {
        c = false;
        if (android.os.Build.VERSION.SDK_INT >= 21)
        {
            a = new fk(new ex(this, (byte)0));
            return;
        } else
        {
            a = new ey(this, (byte)0);
            return;
        }
    }

    static ew a(ev ev1)
    {
        return ev1.b;
    }

    static void a(ev ev1, Handler handler)
    {
        ev1.b = new ew(ev1, handler.getLooper());
    }

    static boolean a(ev ev1, boolean flag)
    {
        ev1.c = flag;
        return flag;
    }

    static boolean b(ev ev1)
    {
        return ev1.c;
    }

    static Object c(ev ev1)
    {
        return ev1.a;
    }

    public void a()
    {
    }

    public void a(MediaMetadataCompat mediametadatacompat)
    {
    }

    public void a(PlaybackStateCompat playbackstatecompat)
    {
    }

    public void binderDied()
    {
        a();
    }
}
