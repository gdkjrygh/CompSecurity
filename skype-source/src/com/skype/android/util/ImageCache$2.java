// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.util;

import android.os.ConditionVariable;
import com.skype.android.concurrent.AsyncCallback;
import com.skype.android.concurrent.AsyncResult;

// Referenced classes of package com.skype.android.util:
//            ImageCache

final class a
    implements AsyncCallback
{

    final ImageCache a;

    public final void done(AsyncResult asyncresult)
    {
        ImageCache.c(a).open();
    }

    sult(ImageCache imagecache)
    {
        a = imagecache;
        super();
    }
}
