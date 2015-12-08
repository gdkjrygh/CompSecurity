// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vungle.publisher.image;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import java.io.IOException;

// Referenced classes of package com.vungle.publisher.image:
//            BaseBitmapFactory

public class AssetBitmapFactory extends BaseBitmapFactory
{

    Context a;

    public AssetBitmapFactory()
    {
    }

    public Bitmap getBitmap(String s)
        throws IOException
    {
        return BitmapFactory.decodeStream(a.getAssets().open(s), null, a(a));
    }
}
