// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.translate.pref;

import android.app.ListActivity;
import android.os.Bundle;
import com.google.android.apps.translate.m;
import com.google.android.apps.translate.o;
import com.google.android.libraries.translate.offline.PackageType;
import com.google.android.libraries.translate.offline.a.d;

// Referenced classes of package com.google.android.apps.translate.pref:
//            i

public class OfflineActivity extends ListActivity
{

    private i a;

    public OfflineActivity()
    {
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(o.pref_offline_langs);
        a = new i(this, findViewById(m.root_view), PackageType.TRANSLATE);
        setListAdapter(a);
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
