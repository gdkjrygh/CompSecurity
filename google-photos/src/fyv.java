// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public final class fyv extends afn
{

    public final View o;
    public final TextView p;

    public fyv(ViewGroup viewgroup)
    {
        super(LayoutInflater.from(viewgroup.getContext()).inflate(b.rh, viewgroup, false));
        o = a.findViewById(q.aj);
        p = (TextView)a.findViewById(q.al);
    }
}
