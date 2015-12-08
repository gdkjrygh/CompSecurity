// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.media.MediaPlayer;
import com.snapchat.android.Timber;
import com.snapchat.android.ui.TextureVideoView;

final class ng.Object
    implements Runnable
{

    private a a;

    public final void run()
    {
        a.a.b();
        a.a.a();
    }

    ct(ct ct)
    {
        a = ct;
        super();
    }

    // Unreferenced inner class wD$4

/* anonymous class */
    final class wD._cls4
        implements android.media.MediaPlayer.OnErrorListener
    {

        final wD a;

        public final boolean onError(MediaPlayer mediaplayer, int i, int j)
        {
            mediaplayer = String.format("Error=%s extra=%d", new Object[] {
                DA.a(i), Integer.valueOf(j)
            });
            Timber.e("VideoViewController", mediaplayer, new Object[0]);
            if (a.f > 0)
            {
                mediaplayer = a;
                mediaplayer.f = ((wD) (mediaplayer)).f - 1;
                Timber.c("VideoViewController", "Retrying the media player following an error, %d retries remain", new Object[] {
                    Integer.valueOf(a.f)
                });
                a.b.post(new wD._cls4._cls1(this));
            } else
            {
                Timber.c("VideoViewController", "Aborting retry following an error, %d retries were attempted", new Object[] {
                    Integer.valueOf(2)
                });
                wy wy1 = a.e;
                if (wy1 != null)
                {
                    wy1.a(mediaplayer);
                    return true;
                }
            }
            return true;
        }

            
            {
                a = wd;
                super();
            }
    }

}
