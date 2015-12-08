// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.recents;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.skype.android.util.TimeSeparator;

// Referenced classes of package com.skype.android.app.recents:
//            RecentAdapter

public static class  extends com.skype.android.app.data.er
{

    protected int getItemId(Object obj)
    {
        return (int)((TimeSeparator)obj).b();
    }

    protected View onCreateView(ViewGroup viewgroup)
    {
        return LayoutInflater.from(viewgroup.getContext()).inflate(0x7f03011a, viewgroup, false);
    }

    protected volatile com.skype.android.app.data.er onCreateViewHolder(View view)
    {
        return onCreateViewHolder(view);
    }

    protected onCreateViewHolder onCreateViewHolder(View view)
    {
        return new init>(view);
    }

    public ()
    {
    }
}
