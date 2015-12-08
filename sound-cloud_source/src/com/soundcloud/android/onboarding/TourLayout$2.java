// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.onboarding;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.util.Pair;
import com.soundcloud.android.SoundCloudApplication;
import com.soundcloud.android.tasks.ParallelAsyncTask;
import com.soundcloud.android.utils.ErrorUtils;
import com.soundcloud.android.utils.images.ImageUtils;

// Referenced classes of package com.soundcloud.android.onboarding:
//            TourLayout

final class <init> extends ParallelAsyncTask
{

    final Context val$context;

    protected final volatile Object doInBackground(Object aobj[])
    {
        return doInBackground((TourLayout[])aobj);
    }

    protected final transient Void doInBackground(TourLayout atourlayout[])
    {
        int i;
        int j;
        j = atourlayout.length;
        i = 0;
_L2:
        Object obj;
        TourLayout tourlayout;
        if (i >= j)
        {
            break; /* Loop/switch isn't completed */
        }
        tourlayout = atourlayout[i];
        obj = TourLayout.access$100(tourlayout);
        obj = ImageUtils.decodeSampledBitmapFromResource(val$context.getResources(), TourLayout.access$300(tourlayout), ((Point) (obj)).x, ((Point) (obj)).y);
_L3:
        publishProgress(new Pair[] {
            Pair.create(tourlayout, obj)
        });
        i++;
        if (true) goto _L2; else goto _L1
        obj;
_L4:
        Error error;
        String s = SoundCloudApplication.TAG;
        ErrorUtils.handleSilentException(error);
        error = null;
          goto _L3
_L1:
        return null;
        error;
          goto _L4
    }

    protected final transient void onProgressUpdate(Pair apair[])
    {
        TourLayout.access$400((TourLayout)apair[0].first, (Bitmap)apair[0].second);
    }

    protected final volatile void onProgressUpdate(Object aobj[])
    {
        onProgressUpdate((Pair[])aobj);
    }

    ()
    {
        val$context = context1;
        super();
    }
}
