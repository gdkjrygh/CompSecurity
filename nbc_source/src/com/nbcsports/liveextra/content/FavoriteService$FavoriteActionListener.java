// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.content;

import com.nbcsports.liveextra.library.api.models.Asset;

// Referenced classes of package com.nbcsports.liveextra.content:
//            FavoriteService

public static interface 
{

    public abstract void onAdded(Asset asset);

    public abstract void onRemove(Asset asset);
}
