// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.volley.toolbox;

import android.graphics.Bitmap;
import com.android.volley.Request;
import com.android.volley.VolleyError;
import java.util.LinkedList;

// Referenced classes of package com.android.volley.toolbox:
//            ImageLoader

private class mContainers
{

    private final LinkedList mContainers = new LinkedList();
    private VolleyError mError;
    private final Request mRequest;
    private Bitmap mResponseBitmap;
    final ImageLoader this$0;

    public void addContainer(mContainers mcontainers)
    {
        mContainers.add(mcontainers);
    }

    public VolleyError getError()
    {
        return mError;
    }

    public boolean removeContainerAndCancelIfNecessary(mError merror)
    {
        mContainers.remove(merror);
        if (mContainers.size() == 0)
        {
            mRequest.cancel();
            return true;
        } else
        {
            return false;
        }
    }

    public void setError(VolleyError volleyerror)
    {
        mError = volleyerror;
    }



/*
    static Bitmap access$002( , Bitmap bitmap)
    {
        .mResponseBitmap = bitmap;
        return bitmap;
    }

*/


    public mResponseBitmap(Request request, mResponseBitmap mresponsebitmap)
    {
        this$0 = ImageLoader.this;
        super();
        mRequest = request;
        mContainers.add(mresponsebitmap);
    }
}
