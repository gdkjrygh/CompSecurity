// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.apps.photos.photofragment.components.photoview.PhotoView;

final class gxk
    implements ds
{

    private gxi a;

    gxk(gxi gxi1)
    {
        a = gxi1;
        super();
    }

    public final void b_(Object obj)
    {
        if (((grl)obj).a)
        {
            gxi.b(a).setVisibility(4);
            return;
        } else
        {
            gxi.b(a).setVisibility(0);
            return;
        }
    }
}
