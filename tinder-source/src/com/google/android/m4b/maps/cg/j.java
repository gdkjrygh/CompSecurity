// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.cg;

import android.view.View;
import android.widget.AdapterView;

// Referenced classes of package com.google.android.m4b.maps.cg:
//            k, d

public final class j
{

    final k a;
    final View b;

    j(k k1, View view)
    {
        a = k1;
        b = view;
    }

    public final void a(int i)
    {
        b.setVisibility(i);
    }

    public final void a(d d1)
    {
        k k1 = a;
        if (k1.a != null)
        {
            k1.a.b(k1);
        }
        if (d1 != null)
        {
            k1.a();
            d1.a(k1);
        }
        k1.a = d1;
    }

    // Unreferenced inner class com/google/android/m4b/maps/cg/j$1

/* anonymous class */
    final class _cls1
        implements android.widget.AdapterView.OnItemClickListener
    {

        private j a;

        public final void onItemClick(AdapterView adapterview, View view, int i, long l)
        {
            a.a.a(i);
        }

            
            {
                a = j.this;
                super();
            }
    }

}
