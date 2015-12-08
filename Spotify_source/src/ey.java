// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.ParcelableVolumeInfo;
import android.support.v4.media.session.PlaybackStateCompat;
import java.util.List;

final class ey extends ep
{

    private ev a;

    private ey(ev ev1)
    {
        a = ev1;
        super();
    }

    ey(ev ev1, byte byte0)
    {
        this(ev1);
    }

    public final void a()
    {
        ev.a(a).a(8, null);
    }

    public final void a(Bundle bundle)
    {
        ev.a(a).a(7, bundle);
    }

    public final void a(MediaMetadataCompat mediametadatacompat)
    {
        ev.a(a).a(3, mediametadatacompat);
    }

    public final void a(ParcelableVolumeInfo parcelablevolumeinfo)
    {
        fd fd1 = null;
        if (parcelablevolumeinfo != null)
        {
            int i = parcelablevolumeinfo.a;
            i = parcelablevolumeinfo.b;
            i = parcelablevolumeinfo.c;
            i = parcelablevolumeinfo.d;
            i = parcelablevolumeinfo.e;
            fd1 = new fd();
        }
        ev.a(a).a(4, fd1);
    }

    public final void a(PlaybackStateCompat playbackstatecompat)
    {
        ev.a(a).a(2, playbackstatecompat);
    }

    public final void a(CharSequence charsequence)
    {
        ev.a(a).a(6, charsequence);
    }

    public final void a(String s, Bundle bundle)
    {
        ev.a(a).a(1, s);
    }

    public final void a(List list)
    {
        ev.a(a).a(5, list);
    }
}
