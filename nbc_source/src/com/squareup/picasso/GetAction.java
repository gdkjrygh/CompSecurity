// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.picasso;

import android.graphics.Bitmap;

// Referenced classes of package com.squareup.picasso:
//            Action, Picasso, Request

class GetAction extends Action
{

    GetAction(Picasso picasso, Request request, int i, int j, Object obj, String s)
    {
        super(picasso, null, request, i, j, 0, null, s, obj, false);
    }

    void complete(Bitmap bitmap, Picasso.LoadedFrom loadedfrom)
    {
    }

    public void error()
    {
    }
}
