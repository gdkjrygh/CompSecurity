// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

public final class ewt extends eql
{

    public ewt(ViewGroup viewgroup)
    {
        super(new LinearLayout(viewgroup.getContext()));
        viewgroup = new android.widget.LinearLayout.LayoutParams(-1, dft.a(40F, viewgroup.getResources()));
        a.setLayoutParams(viewgroup);
    }

    public final volatile void a(Object obj, int i)
    {
    }
}
