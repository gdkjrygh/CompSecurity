// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.skippy;

import android.content.Context;
import java.util.concurrent.CountDownLatch;
import org.freedesktop.gstreamer.GStreamer;

// Referenced classes of package com.soundcloud.android.skippy:
//            LibraryLoader, SkippyLibrary, LibraryLoaderHelper, SkippyVersionValidator

class val.context
    implements Runnable
{

    final LibraryLoader this$0;
    final Context val$context;

    public void run()
    {
        LibraryLoader.access$002(null);
        LibraryLoader.access$100(LibraryLoader.this);
        LibraryLoader.access$200(LibraryLoader.this).load(val$context, SkippyLibrary.GSTREAMER);
        LibraryLoader.access$100(LibraryLoader.this);
        LibraryLoader.access$200(LibraryLoader.this).load(val$context, SkippyLibrary.SKIPPY);
        if (!LibraryLoader.access$300(LibraryLoader.this).isValidLibraryVersionLoaded(SkippyLibrary.SKIPPY))
        {
            LibraryLoader.access$200(LibraryLoader.this).extractAndLoadLibFromApk(val$context, SkippyLibrary.SKIPPY.getLibraryName());
            if (!LibraryLoader.access$300(LibraryLoader.this).isValidLibraryVersionLoaded(SkippyLibrary.SKIPPY))
            {
                throw new IllegalStateException("Native library version does not match Java wrapper version.");
            }
        }
        break MISSING_BLOCK_LABEL_149;
        Object obj;
        obj;
        (new StringBuilder("Caught exception: ")).append(obj);
        LibraryLoader.access$400(LibraryLoader.this, ((Throwable) (obj)));
        LibraryLoader.access$500().countDown();
        return;
        LibraryLoader.access$100(LibraryLoader.this);
        GStreamer.a(val$context);
        LibraryLoader.access$100(LibraryLoader.this);
        LibraryLoader.access$500().countDown();
        return;
        obj;
        LibraryLoader.access$500().countDown();
        throw obj;
    }

    idator()
    {
        this$0 = final_libraryloader;
        val$context = Context.this;
        super();
    }
}
