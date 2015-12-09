// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.player;

import android.view.MotionEvent;
import android.view.View;
import com.netflix.mediaclient.Log;

// Referenced classes of package com.netflix.mediaclient.ui.player:
//            PostPlay

class this._cls0
    implements android.view.hListener
{

    final PostPlay this$0;

    public boolean onTouch(View view, MotionEvent motionevent)
    {
        Log.d("nf_postplay", "Hijacking tap, do nothing");
        return true;
    }

    ()
    {
        this$0 = PostPlay.this;
        super();
    }
}
