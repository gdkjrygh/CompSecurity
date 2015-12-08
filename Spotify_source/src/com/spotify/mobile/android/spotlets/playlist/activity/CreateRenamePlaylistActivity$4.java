// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.playlist.activity;

import am;
import android.widget.EditText;
import fda;

// Referenced classes of package com.spotify.mobile.android.spotlets.playlist.activity:
//            CreateRenamePlaylistActivity

final class a
    implements fda
{

    private CreateRenamePlaylistActivity a;

    public final void a(String s)
    {
        CreateRenamePlaylistActivity.b(a).setText(s);
        CreateRenamePlaylistActivity.b(a).setSelection(s.length());
        a.S_().a(0x7f110079);
    }

    (CreateRenamePlaylistActivity createrenameplaylistactivity)
    {
        a = createrenameplaylistactivity;
        super();
    }
}
