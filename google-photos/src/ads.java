// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import android.widget.AdapterView;

final class ads
    implements android.widget.AdapterView.OnItemSelectedListener
{

    private adq a;

    ads(adq adq1)
    {
        a = adq1;
        super();
    }

    public final void onItemSelected(AdapterView adapterview, View view, int i, long l)
    {
        if (i != -1)
        {
            adapterview = adq.a(a);
            if (adapterview != null)
            {
                adt.a(adapterview, false);
            }
        }
    }

    public final void onNothingSelected(AdapterView adapterview)
    {
    }
}
