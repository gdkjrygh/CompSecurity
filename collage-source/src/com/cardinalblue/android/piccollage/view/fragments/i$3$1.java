// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.view.fragments;

import android.view.View;
import com.malinskiy.superrecyclerview.SuperRecyclerView;

// Referenced classes of package com.cardinalblue.android.piccollage.view.fragments:
//            i

class a
    implements android.view.nClickListener
{

    final a a;

    public void onClick(View view)
    {
        a.a.h();
    }

    ( )
    {
        a = ;
        super();
    }

    // Unreferenced inner class com/cardinalblue/android/piccollage/view/fragments/i$3

/* anonymous class */
    class i._cls3
        implements com.malinskiy.superrecyclerview.SuperRecyclerView.b
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
                    view1.setOnClickListener(new i._cls3._cls1(this));
                    a.a(view);
                    return;
                }
            }
        }

            
            {
                a = j;
                super();
            }
    }

}
