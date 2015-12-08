// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.widget.TextView;
import com.google.android.apps.photos.localmedia.ui.LocalFoldersHeaderView;
import java.util.List;

public final class fwx
    implements hgo
{

    private final fux a;

    public fwx(fux fux1)
    {
        a = fux1;
    }

    public final int a()
    {
        return aa.y;
    }

    public final int a(int i)
    {
        return i;
    }

    public final void a(afn afn1)
    {
        afn1 = (LocalFoldersHeaderView)afn1.a;
        fwy fwy1 = (fwy)olm.a(afn1.getContext(), fwy);
        fux fux1 = a;
        afn1.b = fux1;
        afn1.a = fwy1;
        ((TextView)afn1.findViewById(aa.p)).setText(((elj)fux1.a(elj)).a);
        afn1.a();
        b.a(afn1, new msm(pwt.A));
        afn1.setOnClickListener(new msj(new fxc(afn1, fwy1, fux1)));
    }

    public final int b(int i)
    {
        return 0;
    }

    public final long b()
    {
        return (long)((Integer)a.b.get(0)).intValue() + 0x3fffffffffffffffL;
    }
}
