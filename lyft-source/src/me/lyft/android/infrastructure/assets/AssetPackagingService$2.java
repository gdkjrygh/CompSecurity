// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.infrastructure.assets;

import java.io.File;
import me.lyft.android.common.Unit;
import rx.functions.Action1;

// Referenced classes of package me.lyft.android.infrastructure.assets:
//            AssetPackagingService

class val.packageFile
    implements Action1
{

    final AssetPackagingService this$0;
    final File val$packageFile;

    public volatile void call(Object obj)
    {
        call((Unit)obj);
    }

    public void call(Unit unit)
    {
        val$packageFile.delete();
    }

    ()
    {
        this$0 = final_assetpackagingservice;
        val$packageFile = File.this;
        super();
    }
}
