// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import com.spotify.mobile.android.spotlets.playlist.activity.CreateRenamePlaylistActivity;

final class ang.Object
    implements android.view.nClickListener
{

    private fdf a;

    public final void onClick(View view)
    {
        view = CreateRenamePlaylistActivity.b(a.k(), fdf.b(a), fdf.a(a));
        a.k().startActivity(view);
    }

    (fdf fdf1)
    {
        a = fdf1;
        super();
    }
}
