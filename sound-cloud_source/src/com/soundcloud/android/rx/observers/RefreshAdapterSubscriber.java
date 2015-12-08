// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.rx.observers;

import android.widget.BaseAdapter;

// Referenced classes of package com.soundcloud.android.rx.observers:
//            DefaultSubscriber

public class RefreshAdapterSubscriber extends DefaultSubscriber
{

    private final BaseAdapter adapter;

    public RefreshAdapterSubscriber(BaseAdapter baseadapter)
    {
        adapter = baseadapter;
    }

    public void onNext(Object obj)
    {
        adapter.notifyDataSetChanged();
    }
}
