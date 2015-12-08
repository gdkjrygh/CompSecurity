// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.infrastructure.gallery;

import android.content.Intent;
import java.io.File;
import me.lyft.android.infrastructure.activity.ActivityResult;
import rx.Observable;
import rx.functions.Func1;

// Referenced classes of package me.lyft.android.infrastructure.gallery:
//            GalleryService

class val.tmpFile
    implements Func1
{

    final GalleryService this$0;
    final File val$tmpFile;

    public volatile Object call(Object obj)
    {
        return call((ActivityResult)obj);
    }

    public Observable call(ActivityResult activityresult)
    {
        if (activityresult.getResultCode() == -1)
        {
            activityresult = activityresult.getIntent().getData();
            return GalleryService.access$200(GalleryService.this, GalleryService.access$100(GalleryService.this), activityresult, val$tmpFile);
        } else
        {
            return Observable.empty();
        }
    }

    ()
    {
        this$0 = final_galleryservice;
        val$tmpFile = File.this;
        super();
    }
}
