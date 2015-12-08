// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.apps.photos.remotemedia.enrichment.ui.MapImageView;

public final class hjg extends afn
{

    final MapImageView o;
    final TextView p;

    public hjg(ViewGroup viewgroup)
    {
        super(LayoutInflater.from(viewgroup.getContext()).inflate(b.wr, viewgroup, false));
        o = (MapImageView)a.findViewById(b.wj);
        p = (TextView)a.findViewById(b.wi);
    }
}
