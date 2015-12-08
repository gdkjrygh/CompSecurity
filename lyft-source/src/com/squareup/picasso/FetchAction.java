// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.picasso;

import android.graphics.Bitmap;

// Referenced classes of package com.squareup.picasso:
//            Action, Callback, Picasso, Request

class FetchAction extends Action
{

    private Callback callback;
    private final Object target = new Object();

    FetchAction(Picasso picasso, Request request, int i, int j, Object obj, String s, Callback callback1)
    {
        super(picasso, null, request, i, j, 0, null, s, obj, false);
        callback = callback1;
    }

    void cancel()
    {
        super.cancel();
        callback = null;
    }

    void complete(Bitmap bitmap, Picasso.LoadedFrom loadedfrom)
    {
        if (callback != null)
        {
            callback.onSuccess();
        }
    }

    void error()
    {
        if (callback != null)
        {
            callback.onError();
        }
    }

    Object getTarget()
    {
        return target;
    }
}
