// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.facebook.internal.LikeActionController;
import com.facebook.widget.LikeView;

public final class asa
    implements aqo
{

    public boolean a;
    private LikeView b;

    private asa(LikeView likeview)
    {
        b = likeview;
        super();
    }

    public asa(LikeView likeview, byte byte0)
    {
        this(likeview);
    }

    public final void a(LikeActionController likeactioncontroller)
    {
        if (a)
        {
            return;
        } else
        {
            LikeView.a(b, likeactioncontroller);
            LikeView.c(b);
            LikeView.d(b);
            return;
        }
    }
}
