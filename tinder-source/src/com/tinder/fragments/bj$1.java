// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.fragments;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import com.tinder.activities.ActivityVerification;
import com.tinder.adapters.e;

// Referenced classes of package com.tinder.fragments:
//            bj, bk

final class a
    implements android.widget.erView.OnItemClickListener
{

    final bj a;

    public final void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        adapterview = bj.a(a).a[i];
        view = bj.a(a).b[i];
        (new StringBuilder("countryName=")).append(adapterview).append(", countryCode=").append(view);
        ActivityVerification activityverification = (ActivityVerification)a.getActivity();
        (new StringBuilder("countryName=")).append(adapterview).append(", countryCode=").append(view);
        activityverification.e = new bk();
        Bundle bundle = new Bundle();
        bundle.putString("country_name", adapterview);
        bundle.putString("country_code", view);
        activityverification.e.setArguments(bundle);
        activityverification.c(activityverification.e);
    }

    (bj bj1)
    {
        a = bj1;
        super();
    }
}
