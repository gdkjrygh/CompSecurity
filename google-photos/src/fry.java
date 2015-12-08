// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.apps.photos.list.PhotoTileView;

public final class fry
    implements nug
{

    private PhotoTileView a;

    public fry(PhotoTileView phototileview)
    {
        a = phototileview;
        super();
    }

    public final void b_(Object obj)
    {
        obj = ((hrd)obj).b;
        PhotoTileView.a(a, ((hrc) (obj)));
        if ((obj == hrc.b || obj == hrc.c) && !PhotoTileView.i(a) && PhotoTileView.c(a) != null)
        {
            PhotoTileView.a(a, PhotoTileView.c(a));
        }
    }
}
