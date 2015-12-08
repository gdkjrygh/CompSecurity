// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.content;

import com.nbcsports.liveextra.content.models.FavoriteItem;
import com.nbcsports.liveextra.library.api.models.Asset;
import org.apache.commons.collections4.Transformer;

// Referenced classes of package com.nbcsports.liveextra.content:
//            FavoriteService

class this._cls0
    implements Transformer
{

    final FavoriteService this$0;

    public Asset transform(FavoriteItem favoriteitem)
    {
        return favoriteitem.getAsset();
    }

    public volatile Object transform(Object obj)
    {
        return transform((FavoriteItem)obj);
    }

    m()
    {
        this$0 = FavoriteService.this;
        super();
    }
}
