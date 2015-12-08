// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.ui;

import android.media.MediaPlayer;
import lv;

// Referenced classes of package com.snapchat.android.ui:
//            SnapEditorView

final class a
    implements android.media.oListener
{

    private SnapEditorView a;

    public final boolean onInfo(MediaPlayer mediaplayer, int i, int j)
    {
        if (i == 3)
        {
            SnapEditorView.a(a).b();
        }
        return false;
    }

    (SnapEditorView snapeditorview)
    {
        a = snapeditorview;
        super();
    }
}
