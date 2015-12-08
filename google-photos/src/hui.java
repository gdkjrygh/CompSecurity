// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public final class hui extends afn
{

    public final TextView o;
    public final ImageView p;

    public hui(ViewGroup viewgroup)
    {
        super(LayoutInflater.from(viewgroup.getContext()).inflate(b.xN, viewgroup, false));
        o = (TextView)a.findViewById(au.r);
        p = (ImageView)a.findViewById(au.q);
    }
}
