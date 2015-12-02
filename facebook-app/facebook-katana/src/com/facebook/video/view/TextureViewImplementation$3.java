// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.video.view;

import android.media.MediaPlayer;

// Referenced classes of package com.facebook.video.view:
//            TextureViewImplementation

class a
    implements android.media.ener
{

    final TextureViewImplementation a;

    public void onCompletion(MediaPlayer mediaplayer)
    {
        if (TextureViewImplementation.d(a) <= 0 && mediaplayer != null && mediaplayer.getDuration() > 0)
        {
            TextureViewImplementation.b(a, mediaplayer.getDuration());
        }
        TextureViewImplementation.e(a);
    }

    _cls9(TextureViewImplementation textureviewimplementation)
    {
        a = textureviewimplementation;
        super();
    }
}
