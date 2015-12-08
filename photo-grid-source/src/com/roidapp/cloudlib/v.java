// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib;

import android.view.View;
import android.widget.AdapterView;
import android.widget.Toast;
import com.roidapp.cloudlib.common.c;

// Referenced classes of package com.roidapp.cloudlib:
//            t, at, af, ad

final class v
    implements android.widget.AdapterView.OnItemClickListener
{

    final t a;

    v(t t1)
    {
        a = t1;
        super();
    }

    public final void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        if (a.d != null)
        {
            a.getActivity();
            if (!c.a())
            {
                Toast.makeText(a.getActivity(), a.getString(at.ag), 0).show();
            } else
            if (a.l != null && a.l.a())
            {
                a.e = i;
                a.a(a.d.b(i));
                return;
            }
        }
    }
}
