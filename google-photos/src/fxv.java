// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import android.widget.TextView;
import com.google.android.apps.photos.list.PhotoTileView;
import java.text.NumberFormat;

public final class fxv
    implements hgo
{

    final fux a;
    private final ekp b;
    private final int c;
    private final long d;

    public fxv(fux fux, ekp ekp1, int i, long l)
    {
        a = fux;
        b = ekp1;
        c = i;
        d = l;
    }

    public final int a()
    {
        return aa.A;
    }

    public final int a(int i)
    {
        return 1;
    }

    public final void a(afn afn1)
    {
        android.content.Context context = afn1.a.getContext();
        afn1 = (fxy)afn1;
        PhotoTileView phototileview = ((fxy) (afn1)).o;
        ((fxy) (afn1)).o.a(b);
        ((fxy) (afn1)).a.setOnClickListener(new fxw(this, context));
        ((fxy) (afn1)).p.setText(NumberFormat.getInstance().format(d));
        afn1 = ((fxy) (afn1)).p;
        int i;
        if (d > 0L)
        {
            i = 0;
        } else
        {
            i = 8;
        }
        afn1.setVisibility(i);
    }

    public final int b(int i)
    {
        return c % i;
    }

    public final long b()
    {
        return b.b();
    }
}
