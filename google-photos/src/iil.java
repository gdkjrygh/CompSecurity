// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public final class iil extends afn
{

    public ImageView o;
    public TextView p;
    public TextView q;
    public ImageView r;

    public iil(ViewGroup viewgroup)
    {
        super(LayoutInflater.from(viewgroup.getContext()).inflate(b.zw, viewgroup, false));
        o = (ImageView)a.findViewById(ce.C);
        p = (TextView)a.findViewById(ce.D);
        q = (TextView)a.findViewById(ce.B);
        r = (ImageView)a.findViewById(ce.r);
    }
}
