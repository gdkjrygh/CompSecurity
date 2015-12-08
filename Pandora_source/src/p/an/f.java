// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.an;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import p.ad.b;

// Referenced classes of package p.an:
//            d, b, c, k

public class f
{

    public f()
    {
    }

    public k a(ImageView imageview, Class class1)
    {
        if (p/ad/b.isAssignableFrom(class1))
        {
            return new d(imageview);
        }
        if (android/graphics/Bitmap.equals(class1))
        {
            return new p.an.b(imageview);
        }
        if (android/graphics/drawable/Drawable.isAssignableFrom(class1))
        {
            return new c(imageview);
        } else
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Unhandled class: ").append(class1).append(", try .as*(Class).transcode(ResourceTranscoder)").toString());
        }
    }
}
