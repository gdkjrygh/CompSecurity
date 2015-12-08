// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public final class dif extends dic
    implements die
{

    private final dhr a;
    private final View b;

    public dif(Context context, View view)
    {
        super(context, view);
        a = new dhr((ViewGroup)view.findViewById(0x7f1102f7));
        b = view.findViewById(0x7f110256);
    }

    public final volatile TextView a()
    {
        return super.a();
    }

    public final void a(View view)
    {
        a.a(view);
        a.a();
    }

    public final volatile void a(CharSequence charsequence)
    {
        super.a(charsequence);
    }

    public final volatile TextView b()
    {
        return super.b();
    }

    public final volatile void b(CharSequence charsequence)
    {
        super.b(charsequence);
    }

    public final View c()
    {
        return a.a;
    }

    public final volatile void c(CharSequence charsequence)
    {
        super.c(charsequence);
    }

    public final volatile ImageView d()
    {
        return super.d();
    }

    public final void e()
    {
        b.setVisibility(0);
    }
}
