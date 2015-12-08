// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.Bitmap;
import android.widget.ImageView;

public class aza extends azc
{

    public aza(ImageView imageview)
    {
        super(imageview);
    }

    protected final void a(Object obj)
    {
        obj = (Bitmap)obj;
        ((ImageView)a).setImageBitmap(((Bitmap) (obj)));
    }
}
