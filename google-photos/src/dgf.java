// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import android.widget.Button;
import java.util.Iterator;
import java.util.List;

final class dgf
    implements android.view.View.OnClickListener
{

    private dgj a;
    private dge b;

    dgf(dge dge1, dgj dgj1)
    {
        b = dge1;
        a = dgj1;
        super();
    }

    public final void onClick(View view)
    {
        a.c.onClick(view);
        dge dge1 = b;
        view = (Button)view;
        for (view = dge1.f.iterator(); view.hasNext(); ((dgi)view.next()).a()) { }
    }
}
