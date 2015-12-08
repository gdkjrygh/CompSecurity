// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.drawable.Drawable;
import android.widget.ImageView;

final class hzq
    implements Runnable
{

    private final ImageView a;
    private final Drawable b;

    public hzq(ImageView imageview, Drawable drawable)
    {
        a = imageview;
        b = drawable;
    }

    public final void run()
    {
        a.setImageDrawable(b);
    }
}
