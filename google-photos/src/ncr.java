// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.database.DataSetObserver;
import com.google.android.libraries.social.ingest.IngestActivity;

public final class ncr extends DataSetObserver
{

    private IngestActivity a;

    public ncr(IngestActivity ingestactivity)
    {
        a = ingestactivity;
        super();
    }

    public final void onChanged()
    {
        if (IngestActivity.g(a) != null)
        {
            IngestActivity.g(a).c();
        }
    }

    public final void onInvalidated()
    {
        if (IngestActivity.g(a) != null)
        {
            IngestActivity.g(a).c();
        }
    }
}
