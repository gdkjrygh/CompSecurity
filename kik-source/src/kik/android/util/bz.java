// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.util;

import android.media.MediaMetadataRetriever;
import com.kik.sdkutils.y;

// Referenced classes of package kik.android.util:
//            ct

final class bz
    implements Runnable
{

    final String a;
    final com.kik.android.a.f b;

    bz(String s, com.kik.android.a.f f)
    {
        a = s;
        b = f;
        super();
    }

    public final void run()
    {
        if (y.a(16))
        {
            MediaMetadataRetriever mediametadataretriever = new MediaMetadataRetriever();
            try
            {
                mediametadataretriever.setDataSource(a);
                b.a("Width", ct.b(mediametadataretriever, 18)).a("Height", ct.b(mediametadataretriever, 19)).a("Bitrate", ct.b(mediametadataretriever, 20));
            }
            catch (RuntimeException runtimeexception) { }
            mediametadataretriever.release();
        }
        b.b();
    }
}
