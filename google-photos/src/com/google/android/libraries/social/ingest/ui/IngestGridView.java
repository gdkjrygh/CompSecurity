// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.social.ingest.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.GridView;
import ndt;

public final class IngestGridView extends GridView
{

    public ndt a;

    public IngestGridView(Context context)
    {
        super(context);
        a = null;
    }

    public IngestGridView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        a = null;
    }

    public IngestGridView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        a = null;
    }

    public final void clearChoices()
    {
        super.clearChoices();
        if (a != null)
        {
            a.a();
        }
    }
}
