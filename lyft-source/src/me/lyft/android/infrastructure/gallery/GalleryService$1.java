// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.infrastructure.gallery;

import com.lyft.scoop.Screen;
import java.io.File;
import me.lyft.android.common.Unit;
import me.lyft.android.infrastructure.camera.ICaptureImageSession;
import me.lyft.android.logging.L;
import me.lyft.android.rx.SimpleSubscriber;

// Referenced classes of package me.lyft.android.infrastructure.gallery:
//            GalleryService

class val.previewScreen extends SimpleSubscriber
{

    final GalleryService this$0;
    final File val$outFile;
    final Screen val$previewScreen;
    final Screen val$returnScreen;
    final File val$tmpFile;

    public void onError(Throwable throwable)
    {
        L.e(throwable.getMessage(), new Object[] {
            throwable
        });
    }

    public volatile void onNext(Object obj)
    {
        onNext((Unit)obj);
    }

    public void onNext(Unit unit)
    {
        GalleryService.access$000(GalleryService.this).onGalleryResult(val$returnScreen, val$outFile, val$tmpFile, val$previewScreen);
    }

    on()
    {
        this$0 = final_galleryservice;
        val$returnScreen = screen;
        val$outFile = file;
        val$tmpFile = file1;
        val$previewScreen = Screen.this;
        super();
    }
}
