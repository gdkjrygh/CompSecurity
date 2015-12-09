// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.activities;

import android.os.Handler;
import android.os.Message;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

// Referenced classes of package com.cardinalblue.android.piccollage.activities:
//            PhotoProtoActivity

private static class a extends Handler
{

    private final WeakReference a;

    public void handleMessage(Message message)
    {
        PhotoProtoActivity photoprotoactivity = (PhotoProtoActivity)a.get();
        message.what;
        JVM INSTR tableswitch 0 1: default 36
    //                   0 42
    //                   1 62;
           goto _L1 _L2 _L3
_L1:
        super.handleMessage(message);
_L5:
        return;
_L2:
        if (photoprotoactivity != null && PhotoProtoActivity.a(photoprotoactivity) != null)
        {
            PhotoProtoActivity.a(photoprotoactivity).setSystemUiVisibility(1);
            return;
        }
        continue; /* Loop/switch isn't completed */
_L3:
        if (photoprotoactivity != null)
        {
            PhotoProtoActivity.a(photoprotoactivity, (ArrayList)message.obj);
            return;
        }
        if (true) goto _L5; else goto _L4
_L4:
    }

    public I(PhotoProtoActivity photoprotoactivity)
    {
        a = new WeakReference(photoprotoactivity);
    }
}
