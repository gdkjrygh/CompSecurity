// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.apps.photos.list.PhotoTileView;

public final class frv
    implements nug
{

    private boolean a;
    private PhotoTileView b;

    public frv(PhotoTileView phototileview)
    {
        b = phototileview;
        super();
    }

    public final void b_(Object obj)
    {
        obj = (hyy)obj;
        boolean flag = a;
        a = ((hyy) (obj)).d();
        if (a != flag)
        {
            b.invalidate();
        }
    }
}
