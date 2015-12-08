// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.view.fragments;

import android.view.View;
import com.malinskiy.superrecyclerview.SuperRecyclerView;

// Referenced classes of package com.cardinalblue.android.piccollage.view.fragments:
//            i

class a
    implements com.malinskiy.superrecyclerview.rRecyclerView.b
{

    final i a;

    public void a()
    {
        View view = a.k.getEmptyView();
        View view1;
        if (view != null)
        {
            if ((view1 = view.findViewById(0x7f1001ae)) != null)
            {
                view1.setOnClickListener(new android.view.View.OnClickListener() {

                    final i._cls3 a;

                    public void onClick(View view2)
                    {
                        a.a.h();
                    }

            
            {
                a = i._cls3.this;
                super();
            }
                });
                a.a(view);
                return;
            }
        }
    }

    _cls1.a(i j)
    {
        a = j;
        super();
    }
}
