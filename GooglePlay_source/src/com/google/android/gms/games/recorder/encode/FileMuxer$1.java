// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.recorder.encode;

import android.net.Uri;

// Referenced classes of package com.google.android.gms.games.recorder.encode:
//            FileMuxer

final class ultCallback
    implements android.media.Connection.OnScanCompletedListener
{

    final FileMuxer this$0;
    final ultCallback val$resultCallback;

    public final void onScanCompleted(String s, Uri uri)
    {
        val$resultCallback.onResultAvailable(uri);
    }

    ultCallback()
    {
        this$0 = final_filemuxer;
        val$resultCallback = ultCallback.this;
        super();
    }
}
