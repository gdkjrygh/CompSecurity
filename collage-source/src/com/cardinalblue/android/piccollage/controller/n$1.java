// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.controller;

import android.text.TextUtils;
import com.cardinalblue.android.piccollage.controller.a.m;
import com.cardinalblue.android.piccollage.model.gson.CBYoutubeSearchResponse;
import com.cardinalblue.android.piccollage.view.SearchWebViewSwitcher;
import com.cardinalblue.android.piccollage.view.a.t;
import com.malinskiy.superrecyclerview.SuperRecyclerView;
import com.malinskiy.superrecyclerview.a;

// Referenced classes of package com.cardinalblue.android.piccollage.controller:
//            n

class a
    implements a
{

    final n a;

    public void a(int i, int j, int k)
    {
        a.d = new m(true, new com.cardinalblue.android.piccollage.controller.a.m.a() {

            final n._cls1 a;

            public void a(CBYoutubeSearchResponse cbyoutubesearchresponse)
            {
                com.cardinalblue.android.piccollage.controller.n.a(a.a).a(a.a.h);
                n.b(a.a).a();
                a.a.a.a(cbyoutubesearchresponse.getVideos());
                SuperRecyclerView superrecyclerview = n.b(a.a);
                boolean flag;
                if (!TextUtils.isEmpty(cbyoutubesearchresponse.getNextPageUrl()))
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                superrecyclerview.setCanLoadMore(flag);
                a.a.a.notifyDataSetChanged();
            }

            public void a(Throwable throwable)
            {
            }

            
            {
                a = n._cls1.this;
                super();
            }
        });
        a.d.a(new String[] {
            a.e
        });
    }

    _cls1.a(n n1)
    {
        a = n1;
        super();
    }
}
