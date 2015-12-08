// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.drawable.Drawable;
import com.google.android.apps.photos.assistant.cardui.CardPhotoView;

public final class dvt extends azi
{

    private CardPhotoView b;

    public dvt(CardPhotoView cardphotoview, CardPhotoView cardphotoview1)
    {
        b = cardphotoview;
        super(cardphotoview1);
    }

    public final void a(Drawable drawable)
    {
        super.a(drawable);
        CardPhotoView.a(b, null);
        b.setImageDrawable(drawable);
    }

    public final void a(Object obj, azp azp)
    {
        obj = (Drawable)obj;
        b.setImageDrawable(((Drawable) (obj)));
        CardPhotoView.a(b, ((Drawable) (obj)));
        CardPhotoView.a(b);
        CardPhotoView.a(b, true);
    }

    public final void b(Drawable drawable)
    {
        super.b(drawable);
        b.setImageDrawable(drawable);
    }

    public final void c(Drawable drawable)
    {
        super.c(drawable);
        b.setImageDrawable(drawable);
    }
}
