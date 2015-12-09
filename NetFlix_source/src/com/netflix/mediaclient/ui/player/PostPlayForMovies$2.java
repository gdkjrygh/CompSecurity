// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.player;

import android.graphics.Bitmap;
import com.netflix.mediaclient.Log;

// Referenced classes of package com.netflix.mediaclient.ui.player:
//            PostPlayForMovies

class this._cls0
    implements com.netflix.mediaclient.util.gfx.derListener
{

    final PostPlayForMovies this$0;

    public void onErrorResponse(String s)
    {
        if (Log.isLoggable("nf_postplay", 5))
        {
            Log.w("nf_postplay", (new StringBuilder()).append("Image failed to be retrieved ").append(s).toString());
        }
    }

    public void onResponse(Bitmap bitmap, String s)
    {
        if (Log.isLoggable("nf_postplay", 3))
        {
            Log.d("nf_postplay", (new StringBuilder()).append("Image retrieved ").append(s).toString());
        }
    }

    erListener()
    {
        this$0 = PostPlayForMovies.this;
        super();
    }
}
