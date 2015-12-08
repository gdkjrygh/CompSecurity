// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.SurfaceTexture;
import androidx.media.filterpacks.video.MediaPlayerSource;

public final class alk
    implements android.graphics.SurfaceTexture.OnFrameAvailableListener
{

    private MediaPlayerSource a;

    public alk(MediaPlayerSource mediaplayersource)
    {
        a = mediaplayersource;
        super();
    }

    public final void onFrameAvailable(SurfaceTexture surfacetexture)
    {
        MediaPlayerSource.d(a);
        synchronized (MediaPlayerSource.b(a))
        {
            MediaPlayerSource.b(a, true);
        }
        MediaPlayerSource.a(a, "New frame: wakeUp");
        MediaPlayerSource.e(a);
        return;
        exception;
        surfacetexture;
        JVM INSTR monitorexit ;
        throw exception;
    }
}
