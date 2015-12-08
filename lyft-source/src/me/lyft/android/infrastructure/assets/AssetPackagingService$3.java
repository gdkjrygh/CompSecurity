// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.infrastructure.assets;

import java.io.File;
import java.io.FileInputStream;
import rx.Observable;
import rx.functions.Func1;

// Referenced classes of package me.lyft.android.infrastructure.assets:
//            AssetPackagingService

class val.fileName
    implements Func1
{

    final AssetPackagingService this$0;
    final String val$fileName;

    public volatile Object call(Object obj)
    {
        return call((File)obj);
    }

    public Observable call(File file)
    {
        try
        {
            file = new FileInputStream(file);
            file = AssetPackagingService.access$000(AssetPackagingService.this, val$fileName, file);
        }
        // Misplaced declaration of an exception variable
        catch (File file)
        {
            return Observable.error(file);
        }
        return file;
    }

    ()
    {
        this$0 = final_assetpackagingservice;
        val$fileName = String.this;
        super();
    }
}
