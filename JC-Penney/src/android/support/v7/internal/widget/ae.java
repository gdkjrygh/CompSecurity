// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.widget;

import android.support.v7.a.c;
import android.support.v7.widget.aa;
import android.view.View;

// Referenced classes of package android.support.v7.internal.widget:
//            af, ab, ac

class ae
    implements android.view.View.OnClickListener
{

    final ab a;

    private ae(ab ab1)
    {
        a = ab1;
        super();
    }

    ae(ab ab1, ac ac)
    {
        this(ab1);
    }

    public void onClick(View view)
    {
        ((af)view).b().d();
        int j = ab.a(a).getChildCount();
        int i = 0;
        while (i < j) 
        {
            View view1 = ab.a(a).getChildAt(i);
            boolean flag;
            if (view1 == view)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            view1.setSelected(flag);
            i++;
        }
    }
}
