// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.ui;

import DA;
import android.media.MediaPlayer;
import com.snapchat.android.Timber;
import com.snapchat.android.model.Mediabryo;

// Referenced classes of package com.snapchat.android.ui:
//            SnapEditorView, SnapVideoView

final class a
    implements Runnable
{

    private a a;

    public final void run()
    {
        SnapEditorView.a(a.a, a.a, a.a - 1);
    }

    ( )
    {
        a = ;
        super();
    }

    // Unreferenced inner class com/snapchat/android/ui/SnapEditorView$5

/* anonymous class */
    final class SnapEditorView._cls5
        implements android.media.MediaPlayer.OnErrorListener
    {

        final int a;
        final Mediabryo b;
        final SnapEditorView c;

        public final boolean onError(MediaPlayer mediaplayer, int i, int j)
        {
            Timber.e("SnapEditorView", "Media player onError what=%s extra=%d retryCount=%d", new Object[] {
                DA.a(i), Integer.valueOf(j), Integer.valueOf(a)
            });
            if (a > 0)
            {
                Timber.c("SnapEditorView", "Retrying video playback following error", new Object[0]);
                SnapEditorView.c(c).a();
                SnapEditorView.c(c).postDelayed(new SnapEditorView._cls5._cls1(this), 500L);
                return true;
            } else
            {
                return false;
            }
        }

            
            {
                c = snapeditorview;
                a = i;
                b = mediabryo;
                super();
            }
    }

}
