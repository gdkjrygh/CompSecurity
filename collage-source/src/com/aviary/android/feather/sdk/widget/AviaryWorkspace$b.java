// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aviary.android.feather.sdk.widget;

import android.database.DataSetObserver;
import android.util.Log;

// Referenced classes of package com.aviary.android.feather.sdk.widget:
//            AviaryWorkspace

class a extends DataSetObserver
{

    final AviaryWorkspace a;

    public void onChanged()
    {
        Log.i("Workspace", "onChanged");
        super.onChanged();
        a.b();
        AviaryWorkspace.d(a);
    }

    public void onInvalidated()
    {
        Log.i("Workspace", "onInvalidated");
        super.onInvalidated();
        a.b();
        AviaryWorkspace.d(a);
    }

    (AviaryWorkspace aviaryworkspace)
    {
        a = aviaryworkspace;
        super();
    }
}
