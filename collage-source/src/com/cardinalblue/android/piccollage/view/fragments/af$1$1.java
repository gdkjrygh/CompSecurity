// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.view.fragments;

import android.text.TextUtils;
import com.cardinalblue.android.b.k;
import com.cardinalblue.android.piccollage.model.gson.CBCollagesResponse;
import com.cardinalblue.android.piccollage.view.a.y;
import com.malinskiy.superrecyclerview.SuperRecyclerView;
import com.malinskiy.superrecyclerview.a;

// Referenced classes of package com.cardinalblue.android.piccollage.view.fragments:
//            af

class a
    implements a
{

    final a a;

    public void a(CBCollagesResponse cbcollagesresponse, Exception exception)
    {
        boolean flag1 = true;
        a.a.h.a();
        if (exception != null)
        {
            if (!com.cardinalblue.android.piccollage.view.fragments.af.a(a.a, exception))
            {
                com.cardinalblue.android.piccollage.view.fragments.af.a(a.a);
                k.a(a.a.getActivity(), 0x7f0700f8, 1);
            }
        } else
        if (cbcollagesresponse != null)
        {
            boolean flag2 = cbcollagesresponse.getListRevision().equals(af.b(a.a));
            boolean flag;
            if (a.a.a.getItemCount() == 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            com.cardinalblue.android.piccollage.view.fragments.af.a(a.a, cbcollagesresponse.getListRevision());
            if (flag2 && !flag)
            {
                a.a.a.a(cbcollagesresponse);
                cbcollagesresponse = a.a.h;
                if (TextUtils.isEmpty(a.a.a.a()))
                {
                    flag1 = false;
                }
                cbcollagesresponse.setCanLoadMore(flag1);
                af.c(a.a);
                return;
            }
        }
    }

    esponse(esponse esponse)
    {
        a = esponse;
        super();
    }

    // Unreferenced inner class com/cardinalblue/android/piccollage/view/fragments/af$1

/* anonymous class */
    class af._cls1
        implements a
    {

        final af a;

        public void a(int i, int j, int l)
        {
            com.cardinalblue.android.piccollage.view.fragments.af.a(a, a.a.a(), new af._cls1._cls1(this));
        }

            
            {
                a = af1;
                super();
            }
    }

}
