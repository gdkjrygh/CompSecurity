// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.fragments;

import android.view.View;
import android.widget.AdapterView;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.s;
import com.tinder.adapters.b;
import com.tinder.c.u;
import com.tinder.model.FacebookPhoto;
import java.util.List;

// Referenced classes of package com.tinder.fragments:
//            a

final class a
    implements android.widget.terView.OnItemClickListener
{

    final a a;

    public final void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        com.tinder.fragments.a.b(a).show();
        com.tinder.fragments.a.a(a, ((FacebookPhoto)com.tinder.fragments.a.c(a).a.get(i)).id);
        com.tinder.fragments.a.b(a, com.tinder.fragments.a.c(a).a(i));
        adapterview = a;
        view = com.tinder.fragments.a.c(a).a(i);
        Picasso.a(adapterview.getActivity()).a(view).a(adapterview);
    }

    w(a a1)
    {
        a = a1;
        super();
    }
}
