// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.collections;


// Referenced classes of package com.soundcloud.android.collections:
//            CollectionsPresenter, CollectionsAdapter, CollectionsItem

class  extends android.support.v7.widget.izeLookup
{

    final CollectionsPresenter this$0;
    final int val$spanCount;

    public int getSpanSize(int i)
    {
        if (((CollectionsItem)CollectionsPresenter.access$300(CollectionsPresenter.this).getItem(i)).isPlaylistItem())
        {
            return 1;
        } else
        {
            return val$spanCount;
        }
    }

    ()
    {
        this$0 = final_collectionspresenter;
        val$spanCount = I.this;
        super();
    }
}
