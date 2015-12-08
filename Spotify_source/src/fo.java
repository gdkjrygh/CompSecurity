// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.PlaybackStateCompat;

public interface fo
{

    public abstract void a();

    public abstract void a(int i);

    public abstract void a(PendingIntent pendingintent);

    public abstract void a(Bundle bundle);

    public abstract void a(MediaMetadataCompat mediametadatacompat);

    public abstract void a(PlaybackStateCompat playbackstatecompat);

    public abstract void a(ek ek);

    public abstract void a(fl fl, Handler handler);

    public abstract void a(boolean flag);

    public abstract boolean b();

    public abstract void c();

    public abstract android.support.v4.media.session.MediaSessionCompat.Token d();

    public abstract Object e();

    public abstract Object f();
}
