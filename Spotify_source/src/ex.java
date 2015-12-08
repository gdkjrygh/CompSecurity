// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.PlaybackStateCompat;

final class ex
    implements fj
{

    private ev a;

    private ex(ev ev1)
    {
        a = ev1;
        super();
    }

    ex(ev ev1, byte byte0)
    {
        this(ev1);
    }

    public final void a()
    {
        a.a();
    }

    public final void a(Object obj)
    {
        a.a(PlaybackStateCompat.a(obj));
    }

    public final void b(Object obj)
    {
        a.a(MediaMetadataCompat.a(obj));
    }
}
