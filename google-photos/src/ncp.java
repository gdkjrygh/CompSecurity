// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.util.SparseBooleanArray;
import android.view.View;
import android.widget.AdapterView;
import com.google.android.libraries.social.ingest.IngestActivity;
import com.google.android.libraries.social.ingest.ui.IngestGridView;

public final class ncp
    implements android.widget.AdapterView.OnItemClickListener
{

    private IngestActivity a;

    public ncp(IngestActivity ingestactivity)
    {
        a = ingestactivity;
        super();
    }

    public final void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        IngestActivity.a(a, i);
        adapterview = IngestActivity.a(a);
        boolean flag;
        if (!IngestActivity.a(a).getCheckedItemPositions().get(i))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        adapterview.setItemChecked(i, flag);
    }
}
