// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.widget.ListAdapter;
import com.devsmart.android.ui.HorizontalListView;

public final class fta extends ftm
{

    public fta(HorizontalListView horizontallistview)
    {
        super(horizontallistview);
    }

    public final int getCount()
    {
        return ((HorizontalListView)a).a().getCount() <= 0 ? 0 : 1;
    }

    public final boolean isEmpty()
    {
        return getCount() > 0;
    }
}
