// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.view.fragments;

import android.view.View;
import com.malinskiy.superrecyclerview.SuperRecyclerView;

// Referenced classes of package com.cardinalblue.android.piccollage.view.fragments:
//            af

class a
    implements android.view.ClickListener
{

    final a a;

    public void onClick(View view)
    {
        af.e(a.a);
    }

    ( )
    {
        a = ;
        super();
    }

    // Unreferenced inner class com/cardinalblue/android/piccollage/view/fragments/af$5

/* anonymous class */
    class af._cls5
        implements com.malinskiy.superrecyclerview.SuperRecyclerView.b
    {

        final af a;

        public void a()
        {
            View view = a.h.getEmptyView();
            if (view != null)
            {
                if ((view = view.findViewById(0x7f1001ae)) != null)
                {
                    view.setOnClickListener(new af._cls5._cls1(this));
                    return;
                }
            }
        }

            
            {
                a = af1;
                super();
            }
    }

}
