// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.lolomo;

import com.netflix.mediaclient.servicemgr.LoggingManagerCallback;

// Referenced classes of package com.netflix.mediaclient.ui.lolomo:
//            GenreLoLoMoAdapter

class ck extends LoggingManagerCallback
{

    final GenreLoLoMoAdapter this$0;

    public void onGenreLoLoMoPrefetched(int i)
    {
        super.onGenreLoLoMoPrefetched(i);
        GenreLoLoMoAdapter.access$000(GenreLoLoMoAdapter.this);
    }

    ck(String s)
    {
        this$0 = GenreLoLoMoAdapter.this;
        super(s);
    }
}
