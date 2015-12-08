// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;

public final class gmi extends afn
{

    public gmi(ViewGroup viewgroup)
    {
        super(new gmj(viewgroup.getContext()));
        a.setBackgroundColor(viewgroup.getContext().getResources().getColor(b.sL));
    }
}
