// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.apps.photos.list.PhotoTileView;

public final class frx
    implements nug
{

    private PhotoTileView a;

    public frx(PhotoTileView phototileview)
    {
        a = phototileview;
        super();
    }

    public final void b_(Object obj)
    {
        obj = (enu)obj;
        PhotoTileView.e(a).a(a, PhotoTileView.c(a), ((enu) (obj)).c);
        a.invalidate();
    }
}
