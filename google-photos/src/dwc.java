// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import android.view.ViewGroup;
import java.util.List;

final class dwc
    implements android.view.View.OnClickListener
{

    private dwk a;
    private dwa b;

    dwc(dwa dwa1, dwk dwk1)
    {
        b = dwa1;
        a = dwk1;
        super();
    }

    public final void onClick(View view)
    {
        b.b.a(a.o.getContext(), a.z.d[4], b.d, (ekp)b.a.get(4));
    }
}
