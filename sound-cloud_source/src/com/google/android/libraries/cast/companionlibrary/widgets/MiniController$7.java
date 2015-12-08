// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.cast.companionlibrary.widgets;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.google.android.libraries.cast.companionlibrary.utils.FetchBitmapTask;

// Referenced classes of package com.google.android.libraries.cast.companionlibrary.widgets:
//            MiniController

class it> extends FetchBitmapTask
{

    final MiniController this$0;

    protected void onPostExecute(Bitmap bitmap)
    {
        Bitmap bitmap1 = bitmap;
        if (bitmap == null)
        {
            bitmap1 = BitmapFactory.decodeResource(getResources(), com.google.android.libraries.cast.companionlibrary.art_placeholder);
        }
        MiniController.access$500(MiniController.this, bitmap1);
        if (this == MiniController.access$600(MiniController.this))
        {
            MiniController.access$602(MiniController.this, null);
        }
    }

    protected volatile void onPostExecute(Object obj)
    {
        onPostExecute((Bitmap)obj);
    }

    Q()
    {
        this$0 = MiniController.this;
        super();
    }
}
