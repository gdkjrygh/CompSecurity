// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playback.ui;

import android.content.res.Resources;
import android.widget.ImageView;
import com.soundcloud.android.image.ApiImageSize;
import com.soundcloud.android.image.ImageOperations;
import com.soundcloud.android.model.Urn;

// Referenced classes of package com.soundcloud.android.playback.ui:
//            ViewVisibilityProvider

public class PlayerArtworkLoader
{

    protected final ImageOperations imageOperations;
    protected final Resources resources;

    public PlayerArtworkLoader(ImageOperations imageoperations, Resources resources1)
    {
        imageOperations = imageoperations;
        resources = resources1;
    }

    public void loadArtwork(Urn urn, ImageView imageview, ImageView imageview1, boolean flag, ViewVisibilityProvider viewvisibilityprovider)
    {
        imageview1 = ApiImageSize.getFullImageSize(resources);
        viewvisibilityprovider = imageOperations.getCachedListItemBitmap(resources, urn);
        imageOperations.displayInPlayer(urn, imageview1, imageview, viewvisibilityprovider, flag);
    }
}
