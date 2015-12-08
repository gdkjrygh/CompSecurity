// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.apps.photos.list.PhotoTileView;

public final class fxy extends afn
{

    public final PhotoTileView o;
    public final TextView p;

    public fxy(ViewGroup viewgroup)
    {
        super(LayoutInflater.from(viewgroup.getContext()).inflate(b.qx, viewgroup, false));
        o = (PhotoTileView)a.findViewById(aa.u);
        o.f = true;
        a.findViewById(aa.B);
        p = (TextView)a.findViewById(aa.v);
    }
}
