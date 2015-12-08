// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.graphics.drawable;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.support.v4.view.e;
import android.util.Log;
import java.io.InputStream;

// Referenced classes of package android.support.v4.graphics.drawable:
//            j, i

public class RoundedBitmapDrawableFactory
{
    private static final class a extends i
    {

        final void a(int k, int l, int i1, Rect rect, Rect rect1)
        {
            e.a(k, l, i1, rect, rect1, 0);
        }

        a(Resources resources, Bitmap bitmap)
        {
            super(resources, bitmap);
        }
    }


    private static final String TAG = "RoundedBitmapDrawableFactory";

    public RoundedBitmapDrawableFactory()
    {
    }

    public static i create(Resources resources, Bitmap bitmap)
    {
        if (android.os.Build.VERSION.SDK_INT >= 21)
        {
            return new j(resources, bitmap);
        } else
        {
            return new a(resources, bitmap);
        }
    }

    public static i create(Resources resources, InputStream inputstream)
    {
        resources = create(resources, BitmapFactory.decodeStream(inputstream));
        if (((i) (resources)).a == null)
        {
            Log.w("RoundedBitmapDrawableFactory", (new StringBuilder("RoundedBitmapDrawable cannot decode ")).append(inputstream).toString());
        }
        return resources;
    }

    public static i create(Resources resources, String s)
    {
        resources = create(resources, BitmapFactory.decodeFile(s));
        if (((i) (resources)).a == null)
        {
            Log.w("RoundedBitmapDrawableFactory", (new StringBuilder("RoundedBitmapDrawable cannot decode ")).append(s).toString());
        }
        return resources;
    }
}
