// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import android.widget.AdapterView;

final class ang.Object
    implements android.widget.rView.OnItemClickListener
{

    private fzu a;

    public final void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        a.a(view, i, l);
    }

    (fzu fzu1)
    {
        a = fzu1;
        super();
    }
}
