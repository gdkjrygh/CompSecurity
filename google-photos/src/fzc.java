// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

public final class fzc extends afn
{

    public final Context o;
    public final ImageView p;

    public fzc(ViewGroup viewgroup)
    {
        super(LayoutInflater.from(viewgroup.getContext()).inflate(b.rg, viewgroup, false));
        o = viewgroup.getContext();
        p = (ImageView)a.findViewById(q.ai);
    }
}
