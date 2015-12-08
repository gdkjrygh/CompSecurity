// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.internal;


// Referenced classes of package com.facebook.internal:
//            LikeActionController

private static class callback
    implements Runnable
{

    private callback callback;
    private String objectId;

    public void run()
    {
        LikeActionController.access$3000(objectId, callback);
    }

    (String s,  )
    {
        objectId = s;
        callback = ;
    }
}
