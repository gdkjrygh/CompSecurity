// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

final class dyk extends afn
{

    public final ImageView o;

    dyk(ViewGroup viewgroup)
    {
        super(LayoutInflater.from(viewgroup.getContext()).inflate(b.kD, viewgroup, false));
        o = (ImageView)a.findViewById(b.kB);
    }
}
