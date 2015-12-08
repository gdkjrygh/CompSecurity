// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import android.widget.AdapterView;

final class ctj
    implements android.widget.AdapterView.OnItemClickListener
{

    private cti a;

    ctj(cti cti1)
    {
        a = cti1;
        super();
    }

    public final void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        cti.a(a);
    }
}
