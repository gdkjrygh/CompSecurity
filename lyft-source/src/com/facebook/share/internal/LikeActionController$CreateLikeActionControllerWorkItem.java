// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.share.internal;


// Referenced classes of package com.facebook.share.internal:
//            LikeActionController

class callback
    implements Runnable
{

    private callback callback;
    private String objectId;
    private com.facebook.share.widget.m.callback objectType;

    public void run()
    {
        LikeActionController.access$2700(objectId, objectType, callback);
    }

    Y(String s, com.facebook.share.widget.m m, Y y)
    {
        objectId = s;
        objectType = m;
        callback = y;
    }
}
