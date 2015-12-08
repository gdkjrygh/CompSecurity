// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.sunset;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.i;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import com.tinder.base.f;
import com.tinder.managers.a;

// Referenced classes of package com.tinder.sunset:
//            ActivityMomentViewer, a, d, SunsetMoment

public final class b extends f
{

    private com.tinder.sunset.a c;
    private GridView d;

    public b()
    {
    }

    static void a(b b1, SunsetMoment sunsetmoment)
    {
        Intent intent = new Intent(b1.getActivity(), com/tinder/sunset/ActivityMomentViewer);
        intent.putExtra("moment", sunsetmoment);
        b1.startActivity(intent);
    }

    public final View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        return layoutinflater.inflate(0x7f03006b, viewgroup, false);
    }

    public final void onResume()
    {
        super.onResume();
        com.tinder.managers.a.a("Moments.List");
    }

    public final void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        d = (GridView)view.findViewById(0x7f0e01ac);
        c = new com.tinder.sunset.a(new android.view.View.OnClickListener() {

            final b a;

            public final void onClick(View view1)
            {
                com.tinder.sunset.b.a(a, (SunsetMoment)view1.getTag());
            }

            
            {
                a = b.this;
                super();
            }
        });
        bundle = c;
        bundle.a = com.tinder.sunset.d.a().b;
        bundle.notifyDataSetChanged();
        d.setAdapter(c);
        bundle = view.findViewById(0x7f0e008a);
        view = view.findViewById(0x7f0e01ab);
        view.setClickable(true);
        bundle.setClickable(true);
        android.view.View.OnClickListener onclicklistener = new android.view.View.OnClickListener() {

            final b a;

            public final void onClick(View view1)
            {
                a.getActivity().onBackPressed();
            }

            
            {
                a = b.this;
                super();
            }
        };
        bundle.setOnClickListener(onclicklistener);
        view.setOnClickListener(onclicklistener);
    }
}
