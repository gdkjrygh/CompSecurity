// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.PendingIntent;
import android.net.Uri;
import android.os.Bundle;
import android.os.IInterface;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.RatingCompat;
import android.support.v4.media.session.ParcelableVolumeInfo;
import android.support.v4.media.session.PlaybackStateCompat;
import android.view.KeyEvent;
import java.util.List;

public interface er
    extends IInterface
{

    public abstract void a(int i1, int j1, String s1);

    public abstract void a(long l1);

    public abstract void a(Uri uri, Bundle bundle);

    public abstract void a(RatingCompat ratingcompat);

    public abstract void a(eo eo);

    public abstract void a(String s1, Bundle bundle);

    public abstract void a(String s1, Bundle bundle, android.support.v4.media.session.MediaSessionCompat.ResultReceiverWrapper resultreceiverwrapper);

    public abstract boolean a();

    public abstract boolean a(KeyEvent keyevent);

    public abstract String b();

    public abstract void b(int i1, int j1, String s1);

    public abstract void b(long l1);

    public abstract void b(eo eo);

    public abstract void b(String s1, Bundle bundle);

    public abstract String c();

    public abstract void c(String s1, Bundle bundle);

    public abstract PendingIntent d();

    public abstract long e();

    public abstract ParcelableVolumeInfo f();

    public abstract void g();

    public abstract void h();

    public abstract void i();

    public abstract void j();

    public abstract void k();

    public abstract void l();

    public abstract void m();

    public abstract MediaMetadataCompat n();

    public abstract PlaybackStateCompat o();

    public abstract List p();

    public abstract CharSequence q();

    public abstract Bundle r();

    public abstract int s();
}
