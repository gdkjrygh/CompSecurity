// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.play.image;

import android.graphics.Bitmap;
import com.android.volley.Request;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.google.android.play.image:
//            BitmapLoader

private final class handlers
{

    List handlers;
    Request request;
    Bitmap responseBitmap;
    final BitmapLoader this$0;

    public final boolean removeHandlerAndCancelIfNecessary(handlers handlers1)
    {
        handlers.remove(handlers1);
        if (handlers.size() == 0)
        {
            request.cancel();
            return true;
        } else
        {
            return false;
        }
    }

    public (Request request1,  )
    {
        this$0 = BitmapLoader.this;
        super();
        handlers = new ArrayList();
        request = request1;
        handlers.add();
    }
}
