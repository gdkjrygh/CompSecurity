// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.apps.photos.list.PhotoTileView;

public final class fru
    implements nug
{

    private PhotoTileView a;

    public fru(PhotoTileView phototileview)
    {
        a = phototileview;
        super();
    }

    public final void b_(Object obj)
    {
        obj = (hzh)obj;
        boolean flag1 = PhotoTileView.b(a);
        PhotoTileView phototileview = a;
        boolean flag;
        if (PhotoTileView.c(a) != null && ((hzh) (obj)).a(PhotoTileView.c(a)))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        PhotoTileView.b(phototileview, flag);
        if (PhotoTileView.b(a) != flag1)
        {
            if (PhotoTileView.b(a))
            {
                PhotoTileView.d(a).a();
                PhotoTileView.e(a).a(a, PhotoTileView.c(a), true);
            } else
            {
                PhotoTileView.d(a).b();
                PhotoTileView.e(a).a(a, PhotoTileView.c(a), false);
            }
            a.invalidate();
        }
    }
}
