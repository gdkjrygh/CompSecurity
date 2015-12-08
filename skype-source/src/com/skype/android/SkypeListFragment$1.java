// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android;

import android.support.v4.app.FragmentActivity;
import android.support.v7.widget.RecyclerView;
import android.view.View;

// Referenced classes of package com.skype.android:
//            SkypeListFragment

final class b
    implements android.view.stener
{

    final FragmentActivity a;
    final RecyclerView b;
    final SkypeListFragment c;

    public final void onFocusChange(View view, boolean flag)
    {
    }

    (SkypeListFragment skypelistfragment, FragmentActivity fragmentactivity, RecyclerView recyclerview)
    {
        c = skypelistfragment;
        a = fragmentactivity;
        b = recyclerview;
        super();
    }
}
