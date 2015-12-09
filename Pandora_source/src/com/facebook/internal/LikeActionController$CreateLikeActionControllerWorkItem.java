// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.internal;

import android.content.Context;

// Referenced classes of package com.facebook.internal:
//            LikeActionController

private static class callback
    implements Runnable
{

    private callback callback;
    private Context context;
    private String objectId;

    public void run()
    {
        LikeActionController.access$2900(context, objectId, callback);
    }

    (Context context1, String s,  )
    {
        context = context1;
        objectId = s;
        callback = ;
    }
}
