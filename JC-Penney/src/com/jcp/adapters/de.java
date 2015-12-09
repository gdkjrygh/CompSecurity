// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.adapters;

import android.util.SparseBooleanArray;
import android.view.View;

// Referenced classes of package com.jcp.adapters:
//            UPSTrackAdapter

class de
    implements android.view.View.OnClickListener
{

    final int a;
    final UPSTrackAdapter b;

    de(UPSTrackAdapter upstrackadapter, int i)
    {
        b = upstrackadapter;
        a = i;
        super();
    }

    public void onClick(View view)
    {
        if (!UPSTrackAdapter.a(b).get(a))
        {
            UPSTrackAdapter.a(b).put(a, true);
        } else
        {
            UPSTrackAdapter.a(b).put(a, false);
        }
        b.notifyDataSetInvalidated();
    }
}
