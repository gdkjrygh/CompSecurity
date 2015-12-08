// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.ui.main.core;

import android.view.View;

// Referenced classes of package com.nbcsports.liveextra.ui.main.core:
//            AssetViewModel

public abstract class AssetViewHolder extends android.support.v7.widget.RecyclerView.ViewHolder
{

    AssetViewHolder(View view)
    {
        super(view);
    }

    public abstract void bind(AssetViewModel assetviewmodel);
}
