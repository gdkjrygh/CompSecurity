// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.video.view;

import android.media.MediaPlayer;

// Referenced classes of package com.facebook.video.view:
//            TextureViewImplementation

class a
    implements android.media.ntation._cls2
{

    final TextureViewImplementation a;

    public boolean onInfo(MediaPlayer mediaplayer, int i, int j)
    {
        if (TextureViewImplementation.c(a) == null)
        {
            return false;
        }
        switch (i)
        {
        default:
            return false;

        case 701: 
            TextureViewImplementation.a(a, true);
            return false;

        case 702: 
            TextureViewImplementation.a(a, -1);
            break;
        }
        TextureViewImplementation.a(a, false);
        return false;
    }

    _cls9(TextureViewImplementation textureviewimplementation)
    {
        a = textureviewimplementation;
        super();
    }
}
