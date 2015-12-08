// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playback;

import com.soundcloud.android.rx.observers.DefaultSubscriber;
import java.lang.ref.WeakReference;
import rx.f.k;

// Referenced classes of package com.soundcloud.android.playback:
//            ProgressReporter

private class <init> extends DefaultSubscriber
{

    final ProgressReporter this$0;

    public volatile void onNext(Object obj)
    {
        onNext((k)obj);
    }

    public void onNext(k k1)
    {
        if (ProgressReporter.access$100(ProgressReporter.this) != null)
        {
            k1 = (this._cls0)ProgressReporter.access$100(ProgressReporter.this).get();
            if (k1 != null)
            {
                k1.ress();
            }
        }
    }

    private ()
    {
        this$0 = ProgressReporter.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
