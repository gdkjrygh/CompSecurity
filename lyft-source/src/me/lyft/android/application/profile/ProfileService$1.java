// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.application.profile;

import java.io.File;
import me.lyft.android.analytics.AsyncActionAnalytics;
import me.lyft.android.infrastructure.lyft.AppStateDTO;
import rx.functions.Action1;

// Referenced classes of package me.lyft.android.application.profile:
//            ProfileService, IProfilePhotoFileRecipient

class val.savePhoto
    implements Action1
{

    final ProfileService this$0;
    final File val$file;
    final AsyncActionAnalytics val$savePhoto;

    public volatile void call(Object obj)
    {
        call((AppStateDTO)obj);
    }

    public void call(AppStateDTO appstatedto)
    {
        profilePhotoFileRecipient.usePhotoFile(val$file);
        val$savePhoto.trackResponseSuccess();
    }

    Recipient()
    {
        this$0 = final_profileservice;
        val$file = file1;
        val$savePhoto = AsyncActionAnalytics.this;
        super();
    }
}
