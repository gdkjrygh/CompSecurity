// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.ui;

import android.media.MediaPlayer;

// Referenced classes of package com.snapchat.android.ui:
//            SnapEditorView, SnapVideoView

final class a
    implements android.media.paredListener
{

    private SnapEditorView a;

    public final void onPrepared(MediaPlayer mediaplayer)
    {
        SnapEditorView.a(a, mediaplayer);
        mediaplayer.setLooping(true);
        mediaplayer.setOnSeekCompleteListener(new android.media.MediaPlayer.OnSeekCompleteListener() {

            public final void onSeekComplete(MediaPlayer mediaplayer1)
            {
            }

        });
        SnapEditorView.b(a, mediaplayer);
        SnapEditorView.c(a).requestLayout();
        a.setAudible(SnapEditorView.d(a));
    }

    _cls1(SnapEditorView snapeditorview)
    {
        a = snapeditorview;
        super();
    }
}
