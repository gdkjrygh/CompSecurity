// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public final class ezj extends afn
{

    public final TextView o;

    public ezj(ViewGroup viewgroup)
    {
        super(LayoutInflater.from(viewgroup.getContext()).inflate(b.nA, viewgroup, false));
        o = (TextView)a.findViewById(u.i);
    }
}
