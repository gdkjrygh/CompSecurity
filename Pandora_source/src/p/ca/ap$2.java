// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.ca;

import android.view.View;
import android.widget.ListAdapter;

// Referenced classes of package p.ca:
//            ap

class Object
    implements android.view.OnClickListener
{

    final ap a;

    public void onClick(View view)
    {
        boolean flag;
        flag = false;
        break MISSING_BLOCK_LABEL_2;
        if (a.b() != null && a.b().getCount() == 0)
        {
            flag = true;
        }
        if (flag)
        {
            ap.p(a);
            return;
        } else
        {
            ap.n(a);
            return;
        }
    }

    ew.View(ap ap1)
    {
        a = ap1;
        super();
    }
}
