// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import java.util.List;

final class hxe
    implements android.view.View.OnClickListener
{

    private List a;
    private hxc b;

    hxe(hxc hxc1, List list)
    {
        b = hxc1;
        a = list;
        super();
    }

    public final void onClick(View view)
    {
        hxc.c(b).a(new diu(hxc.a(b), "com.google.android.apps.photos.search.suggestions.people-hiding-task_tag", hxc.b(b), a));
        hxc.d(b).b();
    }
}
