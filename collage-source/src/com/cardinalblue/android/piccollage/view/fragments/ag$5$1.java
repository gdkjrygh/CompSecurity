// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.view.fragments;

import android.text.TextUtils;
import bolts.i;
import bolts.j;
import com.cardinalblue.android.piccollage.a.f;
import com.cardinalblue.android.piccollage.model.gson.CBCollagesResponse;
import com.malinskiy.superrecyclerview.SuperRecyclerView;
import com.malinskiy.superrecyclerview.a;
import java.util.concurrent.Callable;

// Referenced classes of package com.cardinalblue.android.piccollage.view.fragments:
//            ag, j

class a
    implements i
{

    final a a;

    public Void a(j j1)
        throws Exception
    {
        ag.c(a.a).a();
        if (j1.d() || j1.c())
        {
            f.a(j1.f());
            return null;
        } else
        {
            ag.b(a.a, (CBCollagesResponse)j1.e());
            return null;
        }
    }

    public Object then(j j1)
        throws Exception
    {
        return a(j1);
    }

    a(a a1)
    {
        a = a1;
        super();
    }

    // Unreferenced inner class com/cardinalblue/android/piccollage/view/fragments/ag$5

/* anonymous class */
    class ag._cls5
        implements a
    {

        final ag a;

        public void a(int k, int l, int i1)
        {
            if (!TextUtils.isEmpty(ag.d(a)))
            {
                j.a(new ag._cls5._cls2()).a(new ag._cls5._cls1(this), j.b);
            }
        }

            
            {
                a = ag1;
                super();
            }

        // Unreferenced inner class com/cardinalblue/android/piccollage/view/fragments/ag$5$2

/* anonymous class */
        class ag._cls5._cls2
            implements Callable
        {

            final ag._cls5 a;

            public CBCollagesResponse a()
                throws Exception
            {
                return com.cardinalblue.android.piccollage.controller.network.f.a(ag.d(a.a), ag.e(a.a).getItemCount());
            }

            public Object call()
                throws Exception
            {
                return a();
            }

                    
                    {
                        a = ag._cls5.this;
                        super();
                    }
        }

    }

}
