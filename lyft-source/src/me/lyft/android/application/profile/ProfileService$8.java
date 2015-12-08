// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.application.profile;

import java.io.File;
import java.util.concurrent.atomic.AtomicReference;
import me.lyft.android.infrastructure.lyft.profile.ImageUploadDTO;
import me.lyft.android.infrastructure.s3.IS3Api;
import rx.Observable;
import rx.functions.Func1;

// Referenced classes of package me.lyft.android.application.profile:
//            ProfileService

class val.file
    implements Func1
{

    final ProfileService this$0;
    final File val$file;
    final AtomicReference val$image;

    public volatile Object call(Object obj)
    {
        return call((ImageUploadDTO)obj);
    }

    public Observable call(ImageUploadDTO imageuploaddto)
    {
        val$image.set(imageuploaddto);
        return ProfileService.this.IS3Api.uploadFile(imageuploaddto.getUploadUrl(), val$file);
    }

    adDTO()
    {
        this$0 = final_profileservice;
        val$image = atomicreference;
        val$file = File.this;
        super();
    }
}
