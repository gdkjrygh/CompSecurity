// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.translate.pref;

import android.app.ListFragment;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.translate.o;
import com.google.android.libraries.translate.offline.PackageType;
import com.google.android.libraries.translate.offline.a.d;

// Referenced classes of package com.google.android.apps.translate.pref:
//            i

public class OfflineFragment extends ListFragment
{

    private i a;

    public OfflineFragment()
    {
    }

    protected i a(Context context, View view)
    {
        return new i(context, view, PackageType.TRANSLATE);
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        viewgroup = layoutinflater.inflate(o.pref_offline_langs, viewgroup, false);
        a = a(layoutinflater.getContext(), viewgroup);
        setListAdapter(a);
        return viewgroup;
    }

    public void onPause()
    {
        super.onPause();
        a.a.a();
    }

    public void onResume()
    {
        super.onResume();
        a.a();
    }
}
