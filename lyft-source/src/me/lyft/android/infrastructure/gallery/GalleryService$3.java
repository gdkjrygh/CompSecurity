// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.infrastructure.gallery;

import me.lyft.android.infrastructure.activity.ActivityResult;
import rx.functions.Func1;

// Referenced classes of package me.lyft.android.infrastructure.gallery:
//            GalleryService

class this._cls0
    implements Func1
{

    final GalleryService this$0;

    public Boolean call(ActivityResult activityresult)
    {
        boolean flag;
        if (activityresult.getRequestCode() == 10)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        return Boolean.valueOf(flag);
    }

    public volatile Object call(Object obj)
    {
        return call((ActivityResult)obj);
    }

    ()
    {
        this$0 = GalleryService.this;
        super();
    }
}
