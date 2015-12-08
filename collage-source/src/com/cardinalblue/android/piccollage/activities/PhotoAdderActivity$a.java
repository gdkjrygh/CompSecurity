// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.activities;

import android.os.Handler;
import android.os.Message;
import android.view.View;
import java.lang.ref.WeakReference;

// Referenced classes of package com.cardinalblue.android.piccollage.activities:
//            PhotoAdderActivity

private static class a extends Handler
{

    private final WeakReference a;

    public void handleMessage(Message message)
    {
        PhotoAdderActivity photoadderactivity = (PhotoAdderActivity)a.get();
        message.what;
        JVM INSTR tableswitch 0 0: default 32
    //                   0 38;
           goto _L1 _L2
_L1:
        super.handleMessage(message);
_L4:
        return;
_L2:
        if (photoadderactivity != null && PhotoAdderActivity.a(photoadderactivity) != null)
        {
            PhotoAdderActivity.a(photoadderactivity).setSystemUiVisibility(1);
            return;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public I(PhotoAdderActivity photoadderactivity)
    {
        a = new WeakReference(photoadderactivity);
    }
}
