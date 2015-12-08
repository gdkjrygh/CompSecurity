// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.admarvel.android.ads;

import android.os.AsyncTask;
import android.widget.ImageView;
import java.lang.ref.WeakReference;

// Referenced classes of package com.admarvel.android.ads:
//            AdMarvelVideoActivity

private class imageViewreReference
    implements Runnable
{

    private final WeakReference imageViewreReference;
    private final WeakReference posterUrlReference;
    final AdMarvelVideoActivity this$0;

    public void run()
    {
        if (imageViewreReference.get() != null && posterUrlReference.get() != null)
        {
            (new posterUrlReference(AdMarvelVideoActivity.this, (ImageView)imageViewreReference.get())).Executor(AsyncTask.THREAD_POOL_EXECUTOR, new String[] {
                (String)posterUrlReference.get()
            });
        }
    }

    public (ImageView imageview, String s)
    {
        this$0 = AdMarvelVideoActivity.this;
        super();
        posterUrlReference = new WeakReference(s);
        imageViewreReference = new WeakReference(imageview);
    }
}
