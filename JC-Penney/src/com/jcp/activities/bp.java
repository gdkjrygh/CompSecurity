// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.activities;

import android.text.TextUtils;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.Toast;
import com.jcp.adapters.PickUpFromStoreAdapter;
import com.jcp.helper.aa;
import com.jcp.util.bg;
import com.jcp.util.bs;
import java.util.List;

// Referenced classes of package com.jcp.activities:
//            SelectPickUpStoreActivity

class bp
    implements aa
{

    final SelectPickUpStoreActivity a;

    bp(SelectPickUpStoreActivity selectpickupstoreactivity)
    {
        a = selectpickupstoreactivity;
        super();
    }

    public void a(String s)
    {
        a.mProgressBar.setVisibility(4);
        a.mLocationView.setVisibility(0);
        Toast.makeText(a, s, 0).show();
    }

    public void b(String s)
    {
label0:
        {
            a.mProgressBar.setVisibility(4);
            a.mLocationView.setVisibility(0);
            if (!TextUtils.isEmpty(s))
            {
                SelectPickUpStoreActivity.a(a, s);
                a.mSearchView.setText(SelectPickUpStoreActivity.d(a));
                if (!TextUtils.isEmpty(SelectPickUpStoreActivity.d(a)) && (!bg.a(SelectPickUpStoreActivity.d(a)) || bs.a(a, SelectPickUpStoreActivity.d(a))))
                {
                    break label0;
                }
            }
            return;
        }
        a.emptyview.setVisibility(0);
        a.lvnearbystores.setVisibility(8);
        if (SelectPickUpStoreActivity.b(a) != null)
        {
            SelectPickUpStoreActivity.b(a).b();
            SelectPickUpStoreActivity.a(a, null);
        }
        SelectPickUpStoreActivity.a(a).clear();
        SelectPickUpStoreActivity.a(a).add("Distance");
    }
}
