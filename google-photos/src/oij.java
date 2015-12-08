// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.libraries.social.tiledimage.views.TiledImageView;

public final class oij
    implements android.view.Choreographer.FrameCallback
{

    private TiledImageView a;

    public oij(TiledImageView tiledimageview)
    {
        a = tiledimageview;
        super();
    }

    public final void doFrame(long l)
    {
        TiledImageView.b(a, false);
        TiledImageView.a(a).a();
    }
}
