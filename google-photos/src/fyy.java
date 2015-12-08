// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public final class fyy extends afn
{

    public final ImageView o;
    public final TextView p;
    public final TextView q;

    public fyy(ViewGroup viewgroup)
    {
        super(LayoutInflater.from(viewgroup.getContext()).inflate(b.rf, viewgroup, false));
        o = (ImageView)a.findViewById(q.ak);
        p = (TextView)a.findViewById(q.al);
        q = (TextView)a.findViewById(q.as);
    }
}
