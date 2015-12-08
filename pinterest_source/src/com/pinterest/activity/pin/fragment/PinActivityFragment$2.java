// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.pin.fragment;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import com.pinterest.api.remote.PinApi;
import org.apache.commons.lang3.StringUtils;

// Referenced classes of package com.pinterest.activity.pin.fragment:
//            PinActivityFragment

class nit> extends android.support.v7.widget.istener
{

    final PinActivityFragment this$0;

    public void onScrolled(RecyclerView recyclerview, int i, int j)
    {
        i = PinActivityFragment.access$100(PinActivityFragment.this).findFirstVisibleItemPosition();
        j = PinActivityFragment.access$100(PinActivityFragment.this).getItemCount();
        int k = PinActivityFragment.access$100(PinActivityFragment.this).getChildCount();
        PinActivityFragment.access$202(PinActivityFragment.this, i + k);
        if (PinActivityFragment.access$200(PinActivityFragment.this) >= j && !PinActivityFragment.access$300(PinActivityFragment.this))
        {
            PinActivityFragment.access$302(PinActivityFragment.this, true);
            class _cls1 extends BaseApiResponseHandler
            {

                final PinActivityFragment._cls2 this$1;

                public void onSuccess(PinterestJsonObject pinterestjsonobject)
                {
                    super.onSuccess(pinterestjsonobject);
                    PinActivityFragment.access$000(this$0, pinterestjsonobject);
                    PinActivityFragment.access$302(this$0, false);
                }

            _cls1()
            {
                this$1 = PinActivityFragment._cls2.this;
                super();
            }
            }

            if (StringUtils.isNotBlank(PinActivityFragment.access$400(PinActivityFragment.this)))
            {
                PinApi.a(PinActivityFragment.access$500(PinActivityFragment.this), new _cls1(), PinActivityFragment.access$400(PinActivityFragment.this), getApiTag());
            }
        }
    }

    _cls1()
    {
        this$0 = PinActivityFragment.this;
        super();
    }
}
