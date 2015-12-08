// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.infrastructure.gallery;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import java.io.File;
import me.lyft.android.common.Unit;
import me.lyft.android.utils.Files;
import rx.Subscriber;

// Referenced classes of package me.lyft.android.infrastructure.gallery:
//            GalleryService

class val.file
    implements rx.cribe
{

    final GalleryService this$0;
    final Context val$context;
    final File val$file;
    final Uri val$galleryPictureUri;

    public volatile void call(Object obj)
    {
        call((Subscriber)obj);
    }

    public void call(Subscriber subscriber)
    {
        try
        {
            Files.copy(val$context.getContentResolver().openInputStream(val$galleryPictureUri), val$file);
            subscriber.onNext(Unit.create());
            subscriber.onCompleted();
            return;
        }
        catch (Throwable throwable)
        {
            subscriber.onError(throwable);
        }
    }

    ()
    {
        this$0 = final_galleryservice;
        val$context = context1;
        val$galleryPictureUri = uri;
        val$file = File.this;
        super();
    }
}
