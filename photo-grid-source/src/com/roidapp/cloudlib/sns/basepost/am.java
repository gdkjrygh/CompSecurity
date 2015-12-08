// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.sns.basepost;

import android.view.View;
import android.widget.AdapterView;
import com.roidapp.cloudlib.sns.b.a;

// Referenced classes of package com.roidapp.cloudlib.sns.basepost:
//            ad, w

final class am
    implements android.widget.AdapterView.OnItemClickListener
{

    final ad a;

    am(ad ad1)
    {
        a = ad1;
        super();
    }

    public final void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        adapterview = (a)ad.l(a).getItem(i - 1);
        if (adapterview == null)
        {
            return;
        } else
        {
            com.roidapp.cloudlib.sns.basepost.ad.a(a, view, adapterview);
            return;
        }
    }
}
