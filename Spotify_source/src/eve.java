// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public final class eve extends abo
{

    public final TextView j;

    private eve(View view)
    {
        super(view);
        j = (TextView)view;
    }

    public static eve a(ViewGroup viewgroup)
    {
        return new eve(LayoutInflater.from(viewgroup.getContext()).inflate(0x7f0300df, viewgroup, false));
    }
}
