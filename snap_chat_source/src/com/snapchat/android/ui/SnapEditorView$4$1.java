// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.ui;

import android.media.MediaPlayer;

// Referenced classes of package com.snapchat.android.ui:
//            SnapEditorView, SnapVideoView

final class r
    implements android.media.ompleteListener
{

    public final void onSeekComplete(MediaPlayer mediaplayer)
    {
    }

    r()
    {
    }

    // Unreferenced inner class com/snapchat/android/ui/SnapEditorView$4

/* anonymous class */
    final class SnapEditorView._cls4
        implements android.media.MediaPlayer.OnPreparedListener
    {

        private SnapEditorView a;

        public final void onPrepared(MediaPlayer mediaplayer)
        {
            SnapEditorView.a(a, mediaplayer);
            mediaplayer.setLooping(true);
            mediaplayer.setOnSeekCompleteListener(new SnapEditorView._cls4._cls1());
            SnapEditorView.b(a, mediaplayer);
            SnapEditorView.c(a).requestLayout();
            a.setAudible(SnapEditorView.d(a));
        }

            
            {
                a = snapeditorview;
                super();
            }
    }

}
