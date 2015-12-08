// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.drawable.Drawable;
import android.widget.ImageView;

public class azb extends azc
{

    public azb(ImageView imageview)
    {
        super(imageview);
    }

    protected final void a(Object obj)
    {
        obj = (Drawable)obj;
        ((ImageView)a).setImageDrawable(((Drawable) (obj)));
    }
}
