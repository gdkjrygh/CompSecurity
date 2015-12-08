// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.view.fragments;

import android.os.Bundle;
import android.support.v4.app.LoaderManager;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import com.cardinalblue.android.piccollage.model.a;

// Referenced classes of package com.cardinalblue.android.piccollage.view.fragments:
//            r

class a
    implements android.widget.terView.OnItemSelectedListener
{

    final r a;

    public void onItemSelected(AdapterView adapterview, View view, int i, long l)
    {
        adapterview = (a)a.b.getAdapter().getItem(i);
        view = new Bundle();
        view.putString("extra_album_id", adapterview.a());
        a.getLoaderManager().restartLoader(2, view, a.d);
    }

    public void onNothingSelected(AdapterView adapterview)
    {
    }

    (r r1)
    {
        a = r1;
        super();
    }
}
