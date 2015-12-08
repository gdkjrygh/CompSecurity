// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.apps.photos.list.PhotoTileView;

public final class frw
    implements nug
{

    private PhotoTileView a;

    public frw(PhotoTileView phototileview)
    {
        a = phototileview;
        super();
    }

    public final void b_(Object obj)
    {
        PhotoTileView.c(a, PhotoTileView.f(a));
        if (PhotoTileView.f(a))
        {
            PhotoTileView.g(a);
        } else
        {
            PhotoTileView.h(a);
        }
        a.invalidate();
    }
}
