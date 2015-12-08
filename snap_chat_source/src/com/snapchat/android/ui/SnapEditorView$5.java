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

final class b
    implements android.media.orListener
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
            SnapEditorView.c(c).postDelayed(new Runnable() {

                private SnapEditorView._cls5 a;

                public final void run()
                {
                    SnapEditorView.a(a.c, a.b, a.a - 1);
                }

            
            {
                a = SnapEditorView._cls5.this;
                super();
            }
            }, 500L);
            return true;
        } else
        {
            return false;
        }
    }

    _cls1.a(SnapEditorView snapeditorview, int i, Mediabryo mediabryo)
    {
        c = snapeditorview;
        a = i;
        b = mediabryo;
        super();
    }
}
