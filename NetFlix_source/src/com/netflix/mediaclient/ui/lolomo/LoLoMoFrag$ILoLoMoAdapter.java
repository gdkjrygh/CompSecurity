// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.lolomo;

import android.widget.ListAdapter;
import com.netflix.mediaclient.android.app.LoadingStatus;
import com.netflix.mediaclient.servicemgr.ManagerStatusListener;
import se.emilsjolander.stickylistheaders.StickyListHeadersAdapter;

// Referenced classes of package com.netflix.mediaclient.ui.lolomo:
//            LoLoMoFrag

public static interface A
    extends ManagerStatusListener, LoadingStatus, ListAdapter, StickyListHeadersAdapter
{

    public abstract void onDestroyView();

    public abstract void onPause();

    public abstract void onResume();

    public abstract void refreshData();
}
