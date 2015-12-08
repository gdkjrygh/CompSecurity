// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import com.snapchat.android.discover.ui.ChannelView;

public final class vT extends android.support.v7.widget.RecyclerView.v
{

    public final ChannelView l;

    public vT(View view)
    {
        super(view);
        l = (ChannelView)view.findViewById(0x7f0d012d);
    }

    public vT(View view, int i)
    {
        this(view);
        view.getLayoutParams().height = i;
    }
}
