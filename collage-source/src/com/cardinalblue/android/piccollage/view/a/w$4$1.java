// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.view.a;

import android.view.View;
import com.bumptech.glide.load.resource.a.b;
import com.bumptech.glide.request.b.j;
import com.bumptech.glide.request.e;

// Referenced classes of package com.cardinalblue.android.piccollage.view.a:
//            w

class a
    implements android.view.nClickListener
{

    final a a;

    public void onClick(View view)
    {
        if (w.c(a.a) != null)
        {
            w.c(a.a).a();
        }
    }

    ( )
    {
        a = ;
        super();
    }

    // Unreferenced inner class com/cardinalblue/android/piccollage/view/a/w$4

/* anonymous class */
    class w._cls4
        implements e
    {

        final android.support.v7.widget.RecyclerView.ViewHolder a;
        final w b;

        public boolean a(b b1, String s, j j, boolean flag, boolean flag1)
        {
            a.itemView.setOnClickListener(new w._cls4._cls1(this));
            return false;
        }

        public volatile boolean a(Exception exception, Object obj, j j, boolean flag)
        {
            return a(exception, (String)obj, j, flag);
        }

        public boolean a(Exception exception, String s, j j, boolean flag)
        {
            return false;
        }

        public volatile boolean a(Object obj, Object obj1, j j, boolean flag, boolean flag1)
        {
            return a((b)obj, (String)obj1, j, flag, flag1);
        }

            
            {
                b = w1;
                a = viewholder;
                super();
            }
    }

}
