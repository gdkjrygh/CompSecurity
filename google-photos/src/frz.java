// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.Point;
import com.google.android.apps.photos.list.PhotoTileView;

public final class frz extends AnimatorListenerAdapter
{

    private Point a;
    private PhotoTileView b;

    public frz(PhotoTileView phototileview, Point point)
    {
        b = phototileview;
        a = point;
        super();
    }

    public final void onAnimationStart(Animator animator)
    {
        PhotoTileView.j(b);
        int i = a.x;
        i = a.y;
    }
}
