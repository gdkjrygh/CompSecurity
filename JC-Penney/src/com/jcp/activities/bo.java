// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.activities;

import android.text.TextUtils;
import android.view.KeyEvent;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.jcp.adapters.PickUpFromStoreAdapter;
import com.jcp.b.b;
import com.jcp.util.au;
import com.jcp.util.bg;
import com.jcp.util.bs;
import java.util.List;

// Referenced classes of package com.jcp.activities:
//            SelectPickUpStoreActivity

class bo
    implements android.widget.TextView.OnEditorActionListener
{

    final SelectPickUpStoreActivity a;

    bo(SelectPickUpStoreActivity selectpickupstoreactivity)
    {
        a = selectpickupstoreactivity;
        super();
    }

    public boolean onEditorAction(TextView textview, int i, KeyEvent keyevent)
    {
label0:
        {
label1:
            {
                boolean flag1 = false;
                boolean flag = flag1;
                if (i == 3)
                {
                    SelectPickUpStoreActivity.c(a);
                    if (!b.a(a))
                    {
                        break label0;
                    }
                    SelectPickUpStoreActivity.a(a, textview.getText().toString().trim());
                    flag = flag1;
                    if (!TextUtils.isEmpty(SelectPickUpStoreActivity.d(a)))
                    {
                        if (!bg.a(SelectPickUpStoreActivity.d(a)) || bs.a(a, SelectPickUpStoreActivity.d(a)))
                        {
                            break label1;
                        }
                        flag = true;
                    }
                }
                return flag;
            }
            a.emptyview.setVisibility(0);
            a.lvnearbystores.setVisibility(8);
            if (com.jcp.activities.SelectPickUpStoreActivity.b(a) != null)
            {
                com.jcp.activities.SelectPickUpStoreActivity.b(a).b();
                SelectPickUpStoreActivity.a(a, null);
            }
            SelectPickUpStoreActivity.a(a).clear();
            SelectPickUpStoreActivity.a(a).add("Distance");
            SelectPickUpStoreActivity.a(a, SelectPickUpStoreActivity.d(a), SelectPickUpStoreActivity.e(a), 5);
            return false;
        }
        au.a(a);
        return false;
    }
}
