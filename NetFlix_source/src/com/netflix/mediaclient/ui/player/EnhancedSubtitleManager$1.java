// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.player;

import com.netflix.mediaclient.Log;

// Referenced classes of package com.netflix.mediaclient.ui.player:
//            EnhancedSubtitleManager

class this._cls0
    implements android.view.Listener
{

    final EnhancedSubtitleManager this$0;

    public boolean onPreDraw()
    {
        Log.d("nf_subtitles_render", "onPreDraw on display area");
        return false;
    }

    A()
    {
        this$0 = EnhancedSubtitleManager.this;
        super();
    }
}
