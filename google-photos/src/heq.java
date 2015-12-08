// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.List;

public final class heq
    implements hgo
{

    final ekq a;
    String b;
    ekp c;
    private final long d;
    private final String e;
    private final msp f;

    public heq(long l, String s, ekq ekq, msp msp)
    {
        d = l;
        e = s;
        a = ekq;
        f = msp;
    }

    public heq(List list, String s, ekq ekq, msp msp)
    {
        this(((Integer)list.get(0)).intValue(), s, ekq, msp);
    }

    public final int a()
    {
        return aw.h;
    }

    public final int a(int i)
    {
        return i;
    }

    public final void a(afn afn1)
    {
        afn1 = afn1.a;
        b.a(afn1, new msm(f));
        ((TextView)afn1.findViewById(aw.k)).setText(e);
        ((TextView)afn1.findViewById(aw.j)).setText(b);
        android.content.Context context = afn1.getContext();
        amh amh1 = (amh)olm.a(context, amh);
        fli fli1 = (fli)olm.a(context, fli);
        ImageView imageview = (ImageView)afn1.findViewById(aw.c);
        if (c != null)
        {
            amh1.a(((elt)c.a(elt)).e()).a(fli1.b().a(context)).a(imageview);
        } else
        {
            amh1.a(imageview);
        }
        afn1.setOnClickListener(new msj(new her(this)));
    }

    public final int b(int i)
    {
        return 0;
    }

    public final long b()
    {
        return d;
    }
}
