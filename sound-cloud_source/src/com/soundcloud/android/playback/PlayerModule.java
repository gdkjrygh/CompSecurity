// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playback;

import android.content.res.Resources;
import com.soundcloud.android.image.ImageOperations;
import com.soundcloud.android.playback.ui.BlurringPlayerArtworkLoader;
import com.soundcloud.android.playback.ui.PlayerArtworkLoader;
import rx.R;

public class PlayerModule
{

    public PlayerModule()
    {
    }

    public PlayerArtworkLoader providePlayerArtworkLoader(ImageOperations imageoperations, Resources resources, R r)
    {
        if (17 < android.os.Build.VERSION.SDK_INT)
        {
            return new BlurringPlayerArtworkLoader(imageoperations, resources, r);
        } else
        {
            return new PlayerArtworkLoader(imageoperations, resources);
        }
    }
}
