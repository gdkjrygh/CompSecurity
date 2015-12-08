// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.databinding.adapters;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.widget.ImageView;

public class ImageViewBindingAdapter
{

    public ImageViewBindingAdapter()
    {
    }

    public static void setImageUri(ImageView imageview, Drawable drawable)
    {
        imageview.setImageDrawable(drawable);
    }

    public static void setImageUri(ImageView imageview, Uri uri)
    {
        imageview.setImageURI(uri);
    }

    public static void setImageUri(ImageView imageview, String s)
    {
        if (s == null)
        {
            imageview.setImageURI(null);
            return;
        } else
        {
            imageview.setImageURI(Uri.parse(s));
            return;
        }
    }
}
