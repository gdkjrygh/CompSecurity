// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.TextView;

public final class ezd extends afn
{

    public final TextView o;
    public final RadioButton p;

    public ezd(ViewGroup viewgroup)
    {
        super(LayoutInflater.from(viewgroup.getContext()).inflate(b.nx, viewgroup, false));
        o = (TextView)a.findViewById(u.i);
        p = (RadioButton)a.findViewById(u.g);
    }
}
