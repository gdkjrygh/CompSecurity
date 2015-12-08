// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.fragments;

import android.view.View;
import android.widget.AdapterView;

// Referenced classes of package com.jcp.fragments:
//            MultipleVideosGridFragment

class bv
    implements android.widget.AdapterView.OnItemClickListener
{

    final MultipleVideosGridFragment a;
    final MultipleVideosGridFragment..ViewInjector b;

    bv(MultipleVideosGridFragment..ViewInjector viewinjector, MultipleVideosGridFragment multiplevideosgridfragment)
    {
        b = viewinjector;
        a = multiplevideosgridfragment;
        super();
    }

    public void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        a.onItemClick(adapterview, view, i, l);
    }
}
