// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.view.fragments;

import android.view.View;
import com.malinskiy.superrecyclerview.SuperRecyclerView;

// Referenced classes of package com.cardinalblue.android.piccollage.view.fragments:
//            af

class a
    implements com.malinskiy.superrecyclerview.RecyclerView.b
{

    final af a;

    public void a()
    {
        View view = a.h.getEmptyView();
        if (view != null)
        {
            if ((view = view.findViewById(0x7f1001ae)) != null)
            {
                view.setOnClickListener(new android.view.View.OnClickListener() {

                    final af._cls5 a;

                    public void onClick(View view1)
                    {
                        af.e(a.a);
                    }

            
            {
                a = af._cls5.this;
                super();
            }
                });
                return;
            }
        }
    }

    _cls1.a(af af1)
    {
        a = af1;
        super();
    }
}
