// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.infrastructure.camera;

import java.io.File;
import me.lyft.android.logging.L;
import me.lyft.android.utils.Files;
import rx.Subscriber;

// Referenced classes of package me.lyft.android.infrastructure.camera:
//            CaptureImageSession

final class val.to
    implements rx.
{

    final File val$from;
    final File val$to;

    public volatile void call(Object obj)
    {
        call((Subscriber)obj);
    }

    public void call(Subscriber subscriber)
    {
        try
        {
            long l = System.currentTimeMillis();
            Files.copy(val$from, val$to);
            subscriber.onNext(val$to);
            subscriber.onCompleted();
            L.i("time to copy: %dms", new Object[] {
                Long.valueOf(System.currentTimeMillis() - l)
            });
            return;
        }
        catch (Throwable throwable)
        {
            subscriber.onError(throwable);
        }
    }

    A()
    {
        val$from = file;
        val$to = file1;
        super();
    }
}
