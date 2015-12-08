// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.graphics.Bitmap;
import com.snapchat.android.Timber;
import com.snapchat.android.util.save.SaveImageToGalleryTask;
import java.io.File;

final class ng.Object
    implements Runnable
{

    final ePath this$1;
    final String val$filePath;

    public final void run()
    {
        a(true, val$filePath);
    }

    ng.String()
    {
        this$1 = final_ng;
        val$filePath = String.this;
        super();
    }

    // Unreferenced inner class Px$2

/* anonymous class */
    final class Px._cls2 extends SaveImageToGalleryTask
    {

        final Px this$0;
        final String val$nextFileName;

        protected final void a()
        {
            Timber.c("SaveWebViewToGalleryTask", (new StringBuilder("Fail to save ")).append(nextFileName).toString(), new Object[0]);
            PG.a(new Px._cls2._cls2());
        }

        protected final void a(String s)
        {
            Timber.c("SaveWebViewToGalleryTask", (new StringBuilder("Succeed to save ")).append(s).toString(), new Object[0]);
            Px px = Px.this;
            px.mTotalSizeInByte = (int)((long)px.mTotalSizeInByte + (new File(s)).length());
            PG.a(s. new Px._cls2._cls1());
        }

            
            {
                this$0 = final_px;
                nextFileName = s1;
                super(Context.this, bitmap, s, savelocation);
            }

        // Unreferenced inner class Px$2$2

/* anonymous class */
        final class Px._cls2._cls2
            implements Runnable
        {

            final Px._cls2 this$1;

            public final void run()
            {
                a(false, null);
            }

                    
                    {
                        this$1 = Px._cls2.this;
                        super();
                    }
        }

    }

}
