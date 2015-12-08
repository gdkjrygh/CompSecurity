// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.library.tve;

import android.content.DialogInterface;

// Referenced classes of package com.nbcsports.liveextra.library.tve:
//            PlaybackDelegate

class this._cls0
    implements android.content.ancelListener
{

    final PlaybackDelegate this$0;

    public void onCancel(DialogInterface dialoginterface)
    {
        PlaybackDelegate.access$100(PlaybackDelegate.this).onPlaybackDismiss();
    }

    llback()
    {
        this$0 = PlaybackDelegate.this;
        super();
    }
}
