// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.cast.companionlibrary.cast.player;

import com.google.android.gms.cast.m;
import org.json.JSONObject;

// Referenced classes of package com.google.android.libraries.cast.companionlibrary.cast.player:
//            VideoCastControllerFragment

class val.customData
    implements Runnable
{

    final VideoCastControllerFragment this$0;
    final JSONObject val$customData;
    final m val$info;
    final int val$startPoint;

    public void run()
    {
        VideoCastControllerFragment.access$2102(VideoCastControllerFragment.this, erallState.PLAYBACK);
        VideoCastControllerFragment.access$2200(VideoCastControllerFragment.this, val$info, true, val$startPoint, val$customData);
    }

    erallState()
    {
        this$0 = final_videocastcontrollerfragment;
        val$info = m;
        val$startPoint = i;
        val$customData = JSONObject.this;
        super();
    }
}
