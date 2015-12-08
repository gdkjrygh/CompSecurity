// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public final class fin extends afn
{

    public final Button o;
    public final TextView p;
    public final Context q;

    public fin(ViewGroup viewgroup)
    {
        super(LayoutInflater.from(viewgroup.getContext()).inflate(b.pr, viewgroup, false));
        q = viewgroup.getContext();
        o = (Button)a.findViewById(p.N);
        p = (TextView)a.findViewById(p.P);
    }
}
