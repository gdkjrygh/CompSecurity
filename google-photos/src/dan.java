// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import android.widget.AdapterView;

final class dan
    implements android.widget.AdapterView.OnItemSelectedListener
{

    private dam a;

    dan(dam dam1)
    {
        a = dam1;
        super();
    }

    public final void onItemSelected(AdapterView adapterview, View view, int i, long l)
    {
        if (i != dam.a(a))
        {
            adapterview = dam.c()[i].a;
            dam.b(a).a(adapterview);
            dam.a(a, i);
        }
    }

    public final void onNothingSelected(AdapterView adapterview)
    {
    }
}
