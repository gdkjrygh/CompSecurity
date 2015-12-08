// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.picasso;

import java.io.IOException;

// Referenced classes of package com.squareup.picasso:
//            RequestHandler, BitmapHunter, Request

static final class Result extends RequestHandler
{

    public boolean canHandleRequest(Request request)
    {
        return true;
    }

    public Result load(Request request, int i)
        throws IOException
    {
        throw new IllegalStateException((new StringBuilder()).append("Unrecognized type of request: ").append(request).toString());
    }

    Result()
    {
    }
}
