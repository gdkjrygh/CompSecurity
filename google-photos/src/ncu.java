// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.util.SparseBooleanArray;
import com.google.android.libraries.social.ingest.IngestActivity;
import com.google.android.libraries.social.ingest.ui.IngestGridView;

public final class ncu extends ncy
    implements ndt
{

    private int b;
    private int c;
    private IngestActivity d;

    public ncu(IngestActivity ingestactivity)
    {
        d = ingestactivity;
        super();
        b = -1;
        c = -1;
    }

    private int b(int i)
    {
        if (i != b)
        {
            b = i;
            c = IngestActivity.b(d).a(i);
        }
        return c;
    }

    public final void a()
    {
        b();
    }

    public final void a(int i, boolean flag)
    {
        IngestActivity.a(d).setItemChecked(b(i), flag);
    }

    public final boolean a(int i)
    {
        return IngestActivity.a(d).getCheckedItemPositions().get(b(i));
    }

    public final void b(int i, boolean flag)
    {
        if (IngestActivity.g(d) != null)
        {
            if (i != c)
            {
                c = i;
                b = IngestActivity.g(d).a(i);
            }
            super.b(b, flag);
        }
    }
}
