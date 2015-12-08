// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.overlay;

import android.content.Context;
import android.view.TextureView;

// Referenced classes of package com.google.android.gms.ads.internal.overlay:
//            zzh

public abstract class zzi extends TextureView
{

    public zzi(Context context)
    {
        super(context);
    }

    public abstract int getCurrentPosition();

    public abstract int getDuration();

    public abstract int getVideoHeight();

    public abstract int getVideoWidth();

    public abstract void pause();

    public abstract void play();

    public abstract void seekTo(int i);

    public abstract void setMimeType(String s);

    public abstract void setVideoPath(String s);

    public abstract void stop();

    public abstract void zza(float f);

    public abstract void zza(zzh zzh);

    public abstract String zzer();

    public abstract void zzex();

    public abstract void zzey();
}
