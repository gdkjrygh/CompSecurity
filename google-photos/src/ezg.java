// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.TextView;

public final class ezg extends afn
{

    public final TextView o;
    public final CheckBox p;

    public ezg(ViewGroup viewgroup)
    {
        super(LayoutInflater.from(viewgroup.getContext()).inflate(b.nz, viewgroup, false));
        o = (TextView)a.findViewById(u.i);
        p = (CheckBox)a.findViewById(u.c);
    }
}
