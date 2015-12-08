// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.views;

import android.graphics.Bitmap;
import android.os.AsyncTask;
import com.tinder.utils.v;

// Referenced classes of package com.tinder.views:
//            BlurredDrawable

class mManipulatedBitmap extends AsyncTask
{

    private final Bitmap mManipulatedBitmap;
    final BlurredDrawable this$0;

    protected transient Bitmap doInBackground(Void avoid[])
    {
        if (mManipulatedBitmap.isRecycled())
        {
            v.b("Bitmap was recycled before blurring");
            return null;
        } else
        {
            BlurredDrawable.applyBlur(mManipulatedBitmap, BlurredDrawable.access$000(BlurredDrawable.this));
            return mManipulatedBitmap;
        }
    }

    protected volatile Object doInBackground(Object aobj[])
    {
        return doInBackground((Void[])aobj);
    }

    protected void onPostExecute(Bitmap bitmap)
    {
        if (bitmap == null)
        {
            v.b("Final bitmap was null after processing..must have been recycled.");
            return;
        } else
        {
            BlurredDrawable.access$102(BlurredDrawable.this, bitmap);
            invalidateSelf();
            return;
        }
    }

    protected volatile void onPostExecute(Object obj)
    {
        onPostExecute((Bitmap)obj);
    }

    protected (Bitmap bitmap)
    {
        this$0 = BlurredDrawable.this;
        super();
        mManipulatedBitmap = bitmap;
    }
}
