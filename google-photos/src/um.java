// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import android.widget.AdapterView;

final class um
    implements android.widget.AdapterView.OnItemSelectedListener
{

    private final rx a;

    public um(rx rx1)
    {
        a = rx1;
    }

    public final void onItemSelected(AdapterView adapterview, View view, int i, long l)
    {
        if (a != null)
        {
            a.a(i);
        }
    }

    public final void onNothingSelected(AdapterView adapterview)
    {
    }
}
