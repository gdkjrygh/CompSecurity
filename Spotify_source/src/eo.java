// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;
import android.os.IInterface;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.ParcelableVolumeInfo;
import android.support.v4.media.session.PlaybackStateCompat;
import java.util.List;

public interface eo
    extends IInterface
{

    public abstract void a();

    public abstract void a(Bundle bundle);

    public abstract void a(MediaMetadataCompat mediametadatacompat);

    public abstract void a(ParcelableVolumeInfo parcelablevolumeinfo);

    public abstract void a(PlaybackStateCompat playbackstatecompat);

    public abstract void a(CharSequence charsequence);

    public abstract void a(String s, Bundle bundle);

    public abstract void a(List list);
}
