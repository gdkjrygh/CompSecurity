// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.util.Log;
import android.view.View;
import com.google.android.apps.photos.list.PhotoTileView;

public final class fsc
    implements android.view.View.OnClickListener
{

    private PhotoTileView a;

    public fsc(PhotoTileView phototileview)
    {
        a = phototileview;
        super();
    }

    public final void onClick(View view)
    {
        if (PhotoTileView.c(a) == null) goto _L2; else goto _L1
_L1:
        if (!PhotoTileView.k(a).d || !a.k) goto _L4; else goto _L3
_L3:
        if (!PhotoTileView.l(a).a(PhotoTileView.c(a))) goto _L6; else goto _L5
_L5:
        PhotoTileView.m(a).a(PhotoTileView.c(a));
_L2:
        return;
_L6:
        PhotoTileView.m(a).b(PhotoTileView.c(a));
        return;
_L4:
        if (Log.isLoggable("PhotoTileView", 3))
        {
            view = String.valueOf(view);
            (new StringBuilder(String.valueOf(view).length() + 29)).append("Media missing on click, this=").append(view);
            return;
        }
        if (true) goto _L2; else goto _L7
_L7:
    }
}
