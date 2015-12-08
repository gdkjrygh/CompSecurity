// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.millennialmedia.android;

import android.content.Context;
import java.lang.ref.WeakReference;

// Referenced classes of package com.millennialmedia.android:
//            HandShake

class this._cls0
    implements Runnable
{

    final HandShake this$0;

    public void run()
    {
        Context context1 = (Context)HandShake.access$000(HandShake.this).get();
        Context context = context1;
        if (context1 == null)
        {
            context = (Context)HandShake.access$100(HandShake.this).get();
        }
        if (context != null)
        {
            HandShake.sharedHandShake(context);
        }
    }

    ()
    {
        this$0 = HandShake.this;
        super();
    }
}
