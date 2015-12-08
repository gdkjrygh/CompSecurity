// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;

public final class ges
    implements gwi
{

    private final View a;

    public ges(View view)
    {
        a = (View)ctz.a(view);
    }

    public final void a(Bitmap bitmap, com.squareup.picasso.Picasso.LoadedFrom loadedfrom)
    {
        dgo.a(a, new BitmapDrawable(a.getResources(), bitmap));
    }

    public final void a(Drawable drawable)
    {
        dgo.a(a, null);
    }

    public final void b(Drawable drawable)
    {
    }
}
